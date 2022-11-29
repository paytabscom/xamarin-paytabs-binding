package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.config.TinkFips;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f62b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f63p;
    public static final TinkFips.AlgorithmFipsCompatibility FIPS = TinkFips.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    };

    public AesEaxJce(final byte[] key, int ivSizeInBytes) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (ivSizeInBytes != 12 && ivSizeInBytes != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.ivSizeInBytes = ivSizeInBytes;
        Validators.validateAesKeySize(key.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        this.keySpec = secretKeySpec;
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, secretKeySpec);
        byte[] multiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
        this.f62b = multiplyByX;
        this.f63p = multiplyByX(multiplyByX);
    }

    private static byte[] xor(final byte[] x2, final byte[] y2) {
        int length = x2.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (x2[i2] ^ y2[i2]);
        }
        return bArr;
    }

    private static byte[] multiplyByX(final byte[] block) {
        byte[] bArr = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((block[i2] << 1) ^ ((block[i3] & UByte.MAX_VALUE) >>> 7)) & 255);
            i2 = i3;
        }
        bArr[15] = (byte) (((block[0] >> 7) & 135) ^ (block[15] << 1));
        return bArr;
    }

    private byte[] pad(final byte[] data) {
        if (data.length == 16) {
            return xor(data, this.f62b);
        }
        byte[] copyOf = Arrays.copyOf(this.f63p, 16);
        for (int i2 = 0; i2 < data.length; i2++) {
            copyOf[i2] = (byte) (copyOf[i2] ^ data[i2]);
        }
        copyOf[data.length] = (byte) (copyOf[data.length] ^ ByteCompanionObject.MIN_VALUE);
        return copyOf;
    }

    private byte[] omac(Cipher ecb, int tag, final byte[] data, int offset, int length) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr = new byte[16];
        bArr[15] = (byte) tag;
        if (length == 0) {
            return ecb.doFinal(xor(bArr, this.f62b));
        }
        byte[] doFinal = ecb.doFinal(bArr);
        int i2 = 0;
        while (length - i2 > 16) {
            for (int i3 = 0; i3 < 16; i3++) {
                doFinal[i3] = (byte) (doFinal[i3] ^ data[(offset + i2) + i3]);
            }
            doFinal = ecb.doFinal(doFinal);
            i2 += 16;
        }
        return ecb.doFinal(xor(doFinal, pad(Arrays.copyOfRange(data, i2 + offset, offset + length))));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        int length = plaintext.length;
        int i2 = this.ivSizeInBytes;
        if (length > (Integer.MAX_VALUE - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr = new byte[plaintext.length + i2 + 16];
        byte[] randBytes = Random.randBytes(i2);
        System.arraycopy(randBytes, 0, bArr, 0, this.ivSizeInBytes);
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] omac = omac(cipher, 0, randBytes, 0, randBytes.length);
        byte[] bArr2 = associatedData == null ? new byte[0] : associatedData;
        byte[] omac2 = omac(cipher, 1, bArr2, 0, bArr2.length);
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
        cipher2.doFinal(plaintext, 0, plaintext.length, bArr, this.ivSizeInBytes);
        byte[] omac3 = omac(cipher, 2, bArr, this.ivSizeInBytes, plaintext.length);
        int length2 = plaintext.length + this.ivSizeInBytes;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr[length2 + i3] = (byte) ((omac2[i3] ^ omac[i3]) ^ omac3[i3]);
        }
        return bArr;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = (ciphertext.length - this.ivSizeInBytes) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] omac = omac(cipher, 0, ciphertext, 0, this.ivSizeInBytes);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        byte[] bArr = associatedData;
        byte[] omac2 = omac(cipher, 1, bArr, 0, bArr.length);
        byte[] omac3 = omac(cipher, 2, ciphertext, this.ivSizeInBytes, length);
        int length2 = ciphertext.length - 16;
        byte b2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            b2 = (byte) (b2 | (((ciphertext[length2 + i2] ^ omac2[i2]) ^ omac[i2]) ^ omac3[i2]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = localCtrCipher.get();
        cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
        return cipher2.doFinal(ciphertext, this.ivSizeInBytes, length);
    }
}