package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}};

    Curve25519() {
    }

    private static void monty(long[] x2, long[] z2, long[] x3, long[] z3, long[] x4, long[] z4, long[] xprime, long[] zprime, long[] qmqp) {
        long[] copyOf = Arrays.copyOf(x4, 10);
        long[] jArr = new long[19];
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        Field25519.sum(x4, z4);
        Field25519.sub(z4, copyOf);
        long[] copyOf2 = Arrays.copyOf(xprime, 10);
        Field25519.sum(xprime, zprime);
        Field25519.sub(zprime, copyOf2);
        Field25519.product(jArr4, xprime, z4);
        Field25519.product(jArr5, x4, zprime);
        Field25519.reduceSizeByModularReduction(jArr4);
        Field25519.reduceCoefficients(jArr4);
        Field25519.reduceSizeByModularReduction(jArr5);
        Field25519.reduceCoefficients(jArr5);
        System.arraycopy(jArr4, 0, copyOf2, 0, 10);
        Field25519.sum(jArr4, jArr5);
        Field25519.sub(jArr5, copyOf2);
        Field25519.square(jArr7, jArr4);
        Field25519.square(jArr6, jArr5);
        Field25519.product(jArr5, jArr6, qmqp);
        Field25519.reduceSizeByModularReduction(jArr5);
        Field25519.reduceCoefficients(jArr5);
        System.arraycopy(jArr7, 0, x3, 0, 10);
        System.arraycopy(jArr5, 0, z3, 0, 10);
        Field25519.square(jArr2, x4);
        Field25519.square(jArr3, z4);
        Field25519.product(x2, jArr2, jArr3);
        Field25519.reduceSizeByModularReduction(x2);
        Field25519.reduceCoefficients(x2);
        Field25519.sub(jArr3, jArr2);
        Arrays.fill(jArr, 10, 18, 0L);
        Field25519.scalarProduct(jArr, jArr3, 121665L);
        Field25519.reduceCoefficients(jArr);
        Field25519.sum(jArr, jArr2);
        Field25519.product(z2, jArr3, jArr);
        Field25519.reduceSizeByModularReduction(z2);
        Field25519.reduceCoefficients(z2);
    }

    static void swapConditional(long[] a2, long[] b2, int iswap) {
        int i2 = -iswap;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (((int) a2[i3]) ^ ((int) b2[i3])) & i2;
            a2[i3] = ((int) a2[i3]) ^ i4;
            b2[i3] = i4 ^ ((int) b2[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyConditional(long[] a2, long[] b2, int icopy) {
        int i2 = -icopy;
        for (int i3 = 0; i3 < 10; i3++) {
            a2[i3] = ((((int) a2[i3]) ^ ((int) b2[i3])) & i2) ^ ((int) a2[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void curveMult(long[] resultx, byte[] n2, byte[] qBytes) throws InvalidKeyException {
        validatePubKeyAndClearMsb(qBytes);
        long[] expand = Field25519.expand(qBytes);
        long[] jArr = new long[19];
        long[] jArr2 = new long[19];
        int i2 = 0;
        jArr2[0] = 1;
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        jArr6[0] = 1;
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        int i3 = 10;
        System.arraycopy(expand, 0, jArr, 0, 10);
        int i4 = 0;
        while (i4 < 32) {
            int i5 = n2[(32 - i4) - 1] & UByte.MAX_VALUE;
            long[] jArr9 = jArr5;
            long[] jArr10 = jArr6;
            long[] jArr11 = jArr;
            long[] jArr12 = jArr2;
            int i6 = i2;
            long[] jArr13 = jArr7;
            long[] jArr14 = jArr8;
            long[] jArr15 = jArr4;
            long[] jArr16 = jArr3;
            long[] jArr17 = jArr15;
            while (i6 < 8) {
                int i7 = (i5 >> (7 - i6)) & 1;
                swapConditional(jArr16, jArr11, i7);
                swapConditional(jArr17, jArr12, i7);
                long[] jArr18 = jArr13;
                long[] jArr19 = jArr10;
                int i8 = i5;
                long[] jArr20 = jArr9;
                long[] jArr21 = jArr17;
                long[] jArr22 = jArr16;
                long[] jArr23 = jArr12;
                long[] jArr24 = jArr11;
                monty(jArr13, jArr14, jArr9, jArr10, jArr16, jArr17, jArr11, jArr12, expand);
                swapConditional(jArr18, jArr20, i7);
                swapConditional(jArr14, jArr19, i7);
                i6++;
                jArr12 = jArr19;
                jArr17 = jArr14;
                jArr16 = jArr18;
                jArr11 = jArr20;
                i5 = i8;
                jArr14 = jArr21;
                jArr13 = jArr22;
                jArr10 = jArr23;
                jArr9 = jArr24;
            }
            long[] jArr25 = jArr16;
            long[] jArr26 = jArr12;
            long[] jArr27 = jArr11;
            jArr6 = jArr10;
            i4++;
            jArr8 = jArr14;
            jArr7 = jArr13;
            jArr5 = jArr9;
            jArr4 = jArr17;
            jArr3 = jArr25;
            jArr2 = jArr26;
            jArr = jArr27;
            i2 = 0;
            i3 = 10;
        }
        long[] jArr28 = new long[i3];
        Field25519.inverse(jArr28, jArr4);
        Field25519.mult(resultx, jArr3, jArr28);
        if (isCollinear(expand, resultx, jArr, jArr2)) {
            return;
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + Hex.encode(qBytes));
    }

    private static void validatePubKeyAndClearMsb(byte[] pubKey) throws InvalidKeyException {
        if (pubKey.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        pubKey[31] = (byte) (pubKey[31] & ByteCompanionObject.MAX_VALUE);
        int i2 = 0;
        while (true) {
            byte[][] bArr = BANNED_PUBLIC_KEYS;
            if (i2 >= bArr.length) {
                return;
            }
            if (Bytes.equal(bArr[i2], pubKey)) {
                throw new InvalidKeyException("Banned public key: " + Hex.encode(bArr[i2]));
            }
            i2++;
        }
    }

    private static boolean isCollinear(long[] x1, long[] x2, long[] x3, long[] z3) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[11];
        long[] jArr4 = new long[11];
        long[] jArr5 = new long[11];
        Field25519.mult(jArr, x1, x2);
        Field25519.sum(jArr2, x1, x2);
        long[] jArr6 = new long[10];
        jArr6[0] = 486662;
        Field25519.sum(jArr4, jArr2, jArr6);
        Field25519.mult(jArr4, jArr4, z3);
        Field25519.sum(jArr4, x3);
        Field25519.mult(jArr4, jArr4, jArr);
        Field25519.mult(jArr4, jArr4, x3);
        Field25519.scalarProduct(jArr3, jArr4, 4L);
        Field25519.reduceCoefficients(jArr3);
        Field25519.mult(jArr4, jArr, z3);
        Field25519.sub(jArr4, jArr4, z3);
        Field25519.mult(jArr5, jArr2, x3);
        Field25519.sum(jArr4, jArr4, jArr5);
        Field25519.square(jArr4, jArr4);
        return Bytes.equal(Field25519.contract(jArr3), Field25519.contract(jArr4));
    }
}