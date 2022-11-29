package com.google.crypto.tink.subtle;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
class AesUtil {
    public static final int BLOCK_SIZE = 16;

    AesUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] dbl(final byte[] value) {
        if (value.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) ((value[i2] << 1) & 254);
            if (i2 < 15) {
                bArr[i2] = (byte) (bArr[i2] | ((byte) ((value[i2 + 1] >> 7) & 1)));
            }
        }
        bArr[15] = (byte) (((byte) ((value[0] >> 7) & 135)) ^ bArr[15]);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] cmacPad(final byte[] x2) {
        if (x2.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(x2, 16);
        copyOf[x2.length] = ByteCompanionObject.MIN_VALUE;
        return copyOf;
    }
}