package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.TinkFips;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

@Immutable
/* loaded from: classes.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    public static final TinkFips.AlgorithmFipsCompatibility FIPS = TinkFips.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(final RSAPublicKey pubKey, Enums.HashType sigHash, Enums.HashType mgf1Hash, int saltLength) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(sigHash);
        Validators.validateRsaModulusSize(pubKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(pubKey.getPublicExponent());
        this.publicKey = pubKey;
        this.sigHash = sigHash;
        this.mgf1Hash = mgf1Hash;
        this.saltLength = saltLength;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = ((modulus.bitLength() - 1) + 7) / 8;
        if (bitLength != signature.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bytes2Integer = SubtleUtil.bytes2Integer(signature);
        if (bytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        emsaPssVerify(data, SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
    }

    private void emsaPssVerify(byte[] m2, byte[] em, int emBits) throws GeneralSecurityException {
        int i2;
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] digest = engineFactory.digest(m2);
        int digestLength = engineFactory.getDigestLength();
        int length = em.length;
        if (length < this.saltLength + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (em[em.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i3 = (length - digestLength) - 1;
        byte[] copyOf = Arrays.copyOf(em, i3);
        byte[] copyOfRange = Arrays.copyOfRange(em, copyOf.length, copyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = i3;
            MessageDigest messageDigest = engineFactory;
            byte[] bArr = digest;
            long j2 = (length * 8) - emBits;
            if (i4 < j2) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
                i3 = i5;
                engineFactory = messageDigest;
                digest = bArr;
            } else {
                byte[] mgf1 = SubtleUtil.mgf1(copyOfRange, i5, this.mgf1Hash);
                int length2 = mgf1.length;
                byte[] bArr2 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr2[i6] = (byte) (mgf1[i6] ^ copyOf[i6]);
                }
                for (int i7 = 0; i7 <= j2; i7++) {
                    int i8 = i7 / 8;
                    bArr2[i8] = (byte) ((~(1 << (7 - (i7 % 8)))) & bArr2[i8]);
                }
                int i9 = 0;
                while (true) {
                    int i10 = this.saltLength;
                    if (i9 < (i2 - i10) - 2) {
                        if (bArr2[i9] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i9++;
                    } else if (bArr2[(i2 - i10) - 2] != 1) {
                        throw new GeneralSecurityException("inconsistent");
                    } else {
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, length2 - i10, length2);
                        int i11 = digestLength + 8;
                        byte[] bArr3 = new byte[this.saltLength + i11];
                        System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
                        System.arraycopy(copyOfRange2, 0, bArr3, i11, copyOfRange2.length);
                        if (!Bytes.equal(messageDigest.digest(bArr3), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                }
            }
        }
    }
}