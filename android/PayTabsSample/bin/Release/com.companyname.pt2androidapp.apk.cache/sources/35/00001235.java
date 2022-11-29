package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Bytes {
    public static final boolean equal(final byte[] x2, final byte[] y2) {
        if (x2 == null || y2 == null || x2.length != y2.length) {
            return false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < x2.length; i3++) {
            i2 |= x2[i3] ^ y2[i3];
        }
        return i2 == 0;
    }

    public static byte[] concat(byte[]... chunks) throws GeneralSecurityException {
        int i2 = 0;
        for (byte[] bArr : chunks) {
            if (i2 > Integer.MAX_VALUE - bArr.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i2 += bArr.length;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : chunks) {
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }

    public static final byte[] xor(final byte[] x2, int offsetX, final byte[] y2, int offsetY, int len) {
        if (len < 0 || x2.length - len < offsetX || y2.length - len < offsetY) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr = new byte[len];
        for (int i2 = 0; i2 < len; i2++) {
            bArr[i2] = (byte) (x2[i2 + offsetX] ^ y2[i2 + offsetY]);
        }
        return bArr;
    }

    public static final void xor(ByteBuffer output, ByteBuffer x2, ByteBuffer y2, int len) {
        if (len < 0 || x2.remaining() < len || y2.remaining() < len || output.remaining() < len) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < len; i2++) {
            output.put((byte) (x2.get() ^ y2.get()));
        }
    }

    public static final byte[] xor(final byte[] x2, final byte[] y2) {
        if (x2.length != y2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return xor(x2, 0, y2, 0, x2.length);
    }

    public static final byte[] xorEnd(final byte[] a2, final byte[] b2) {
        if (a2.length < b2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = a2.length - b2.length;
        byte[] copyOf = Arrays.copyOf(a2, a2.length);
        for (int i2 = 0; i2 < b2.length; i2++) {
            int i3 = length + i2;
            copyOf[i3] = (byte) (copyOf[i3] ^ b2[i2]);
        }
        return copyOf;
    }

    public static byte[] intToByteArray(int capacity, int value) {
        byte[] bArr = new byte[capacity];
        for (int i2 = 0; i2 < capacity; i2++) {
            bArr[i2] = (byte) ((value >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static int byteArrayToInt(byte[] bytes) {
        return byteArrayToInt(bytes, bytes.length);
    }

    public static int byteArrayToInt(byte[] bytes, int length) {
        return byteArrayToInt(bytes, 0, length);
    }

    public static int byteArrayToInt(byte[] bytes, int offset, int length) {
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += (bytes[i3 + offset] & 255) << (i3 * 8);
        }
        return i2;
    }
}