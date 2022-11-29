package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.config.TinkFips;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
abstract class ChaCha20Poly1305Base implements Aead {
    public static final TinkFips.AlgorithmFipsCompatibility FIPS = TinkFips.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private final ChaCha20Base chacha20;
    private final ChaCha20Base macKeyChaCha20;

    abstract ChaCha20Base newChaCha20Instance(final byte[] key, int initialCounter) throws InvalidKeyException;

    public ChaCha20Poly1305Base(final byte[] key) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.chacha20 = newChaCha20Instance(key, 1);
        this.macKeyChaCha20 = newChaCha20Instance(key, 0);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext.length > (Integer.MAX_VALUE - this.chacha20.nonceSizeInBytes()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(plaintext.length + this.chacha20.nonceSizeInBytes() + 16);
        encrypt(allocate, plaintext, associatedData);
        return allocate.array();
    }

    private void encrypt(ByteBuffer output, final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (output.remaining() < plaintext.length + this.chacha20.nonceSizeInBytes() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = output.position();
        this.chacha20.encrypt(output, plaintext);
        output.position(position);
        byte[] bArr = new byte[this.chacha20.nonceSizeInBytes()];
        output.get(bArr);
        output.limit(output.limit() - 16);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        byte[] computeMac = Poly1305.computeMac(getMacKey(bArr), macDataRfc8439(associatedData, output));
        output.limit(output.limit() + 16);
        output.put(computeMac);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(ciphertext), associatedData);
    }

    private byte[] decrypt(ByteBuffer ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext.remaining() < this.chacha20.nonceSizeInBytes() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = ciphertext.position();
        byte[] bArr = new byte[16];
        ciphertext.position(ciphertext.limit() - 16);
        ciphertext.get(bArr);
        ciphertext.position(position);
        ciphertext.limit(ciphertext.limit() - 16);
        byte[] bArr2 = new byte[this.chacha20.nonceSizeInBytes()];
        ciphertext.get(bArr2);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        try {
            Poly1305.verifyMac(getMacKey(bArr2), macDataRfc8439(associatedData, ciphertext), bArr);
            ciphertext.position(position);
            return this.chacha20.decrypt(ciphertext);
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }

    private byte[] getMacKey(final byte[] nonce) throws GeneralSecurityException {
        byte[] bArr = new byte[32];
        this.macKeyChaCha20.chacha20Block(nonce, 0).get(bArr);
        return bArr;
    }

    private static byte[] macDataRfc8439(final byte[] aad, ByteBuffer ciphertext) {
        int length = aad.length % 16 == 0 ? aad.length : (aad.length + 16) - (aad.length % 16);
        int remaining = ciphertext.remaining();
        int i2 = remaining % 16;
        int i3 = (i2 == 0 ? remaining : (remaining + 16) - i2) + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(aad);
        order.position(length);
        order.put(ciphertext);
        order.position(i3);
        order.putLong(aad.length);
        order.putLong(remaining);
        return order.array();
    }
}