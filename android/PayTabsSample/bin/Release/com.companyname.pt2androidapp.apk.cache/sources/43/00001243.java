package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    private static int eq(int a2, int b2) {
        int i2 = (~(a2 ^ b2)) & 255;
        int i3 = i2 & (i2 << 4);
        int i4 = i3 & (i3 << 2);
        return ((i4 & (i4 << 1)) >> 7) & 1;
    }

    Ed25519() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class XYZ {

        /* renamed from: x  reason: collision with root package name */
        final long[] f66x;

        /* renamed from: y  reason: collision with root package name */
        final long[] f67y;

        /* renamed from: z  reason: collision with root package name */
        final long[] f68z;

        XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        XYZ(long[] x2, long[] y2, long[] z2) {
            this.f66x = x2;
            this.f67y = y2;
            this.f68z = z2;
        }

        XYZ(XYZ xyz) {
            this.f66x = Arrays.copyOf(xyz.f66x, 10);
            this.f67y = Arrays.copyOf(xyz.f67y, 10);
            this.f68z = Arrays.copyOf(xyz.f68z, 10);
        }

        XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        static XYZ fromPartialXYZT(XYZ out, PartialXYZT in) {
            Field25519.mult(out.f66x, in.xyz.f66x, in.f65t);
            Field25519.mult(out.f67y, in.xyz.f67y, in.xyz.f68z);
            Field25519.mult(out.f68z, in.xyz.f68z, in.f65t);
            return out;
        }

        byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.f68z);
            Field25519.mult(jArr2, this.f66x, jArr);
            Field25519.mult(jArr3, this.f67y, jArr);
            byte[] contract = Field25519.contract(jArr3);
            contract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ contract[31]);
            return contract;
        }

        boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.f66x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.f67y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.f68z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class XYZT {

        /* renamed from: t  reason: collision with root package name */
        final long[] f69t;
        final XYZ xyz;

        XYZT() {
            this(new XYZ(), new long[10]);
        }

        XYZT(XYZ xyz, long[] t2) {
            this.xyz = xyz;
            this.f69t = t2;
        }

        XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT out, PartialXYZT in) {
            Field25519.mult(out.xyz.f66x, in.xyz.f66x, in.f65t);
            Field25519.mult(out.xyz.f67y, in.xyz.f67y, in.xyz.f68z);
            Field25519.mult(out.xyz.f68z, in.xyz.f68z, in.f65t);
            Field25519.mult(out.f69t, in.xyz.f66x, in.xyz.f67y);
            return out;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] s2) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] expand = Field25519.expand(s2);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, expand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (Ed25519.isNonZeroVarTime(jArr) || ((s2[31] & UByte.MAX_VALUE) >> 7) == 0) {
                if (Ed25519.getLsb(jArr) == ((s2[31] & UByte.MAX_VALUE) >> 7)) {
                    Ed25519.neg(jArr, jArr);
                }
                Field25519.mult(jArr3, jArr, expand);
                return new XYZT(new XYZ(jArr, expand, jArr2), jArr3);
            }
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class PartialXYZT {

        /* renamed from: t  reason: collision with root package name */
        final long[] f65t;
        final XYZ xyz;

        PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        PartialXYZT(XYZ xyz, long[] t2) {
            this.xyz = xyz;
            this.f65t = t2;
        }

        PartialXYZT(PartialXYZT other) {
            this.xyz = new XYZ(other.xyz);
            this.f65t = Arrays.copyOf(other.f65t, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CachedXYT(long[] yPlusX, long[] yMinusX, long[] t2d) {
            this.yPlusX = yPlusX;
            this.yMinusX = yMinusX;
            this.t2d = t2d;
        }

        CachedXYT(CachedXYT other) {
            this.yPlusX = Arrays.copyOf(other.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(other.yMinusX, 10);
            this.t2d = Arrays.copyOf(other.t2d, 10);
        }

        void multByZ(long[] output, long[] in) {
            System.arraycopy(in, 0, output, 0, 10);
        }

        void copyConditional(CachedXYT other, int icopy) {
            Curve25519.copyConditional(this.yPlusX, other.yPlusX, icopy);
            Curve25519.copyConditional(this.yMinusX, other.yMinusX, icopy);
            Curve25519.copyConditional(this.t2d, other.t2d, icopy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CachedXYZT extends CachedXYT {

        /* renamed from: z  reason: collision with root package name */
        private final long[] f64z;

        CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        CachedXYZT(XYZT xyzt) {
            this();
            Field25519.sum(this.yPlusX, xyzt.xyz.f67y, xyzt.xyz.f66x);
            Field25519.sub(this.yMinusX, xyzt.xyz.f67y, xyzt.xyz.f66x);
            System.arraycopy(xyzt.xyz.f68z, 0, this.f64z, 0, 10);
            Field25519.mult(this.t2d, xyzt.f69t, Ed25519Constants.D2);
        }

        CachedXYZT(long[] yPlusX, long[] yMinusX, long[] z2, long[] t2d) {
            super(yPlusX, yMinusX, t2d);
            this.f64z = z2;
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] output, long[] in) {
            Field25519.mult(output, in, this.f64z);
        }
    }

    private static void add(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.f66x, extended.xyz.f67y, extended.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f67y, extended.xyz.f67y, extended.xyz.f66x);
        Field25519.mult(partialXYZT.xyz.f67y, partialXYZT.xyz.f67y, cached.yMinusX);
        Field25519.mult(partialXYZT.xyz.f68z, partialXYZT.xyz.f66x, cached.yPlusX);
        Field25519.mult(partialXYZT.f65t, extended.f69t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f66x, extended.xyz.f68z);
        Field25519.sum(jArr, partialXYZT.xyz.f66x, partialXYZT.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f66x, partialXYZT.xyz.f68z, partialXYZT.xyz.f67y);
        Field25519.sum(partialXYZT.xyz.f67y, partialXYZT.xyz.f68z, partialXYZT.xyz.f67y);
        Field25519.sum(partialXYZT.xyz.f68z, jArr, partialXYZT.f65t);
        Field25519.sub(partialXYZT.f65t, jArr, partialXYZT.f65t);
    }

    private static void sub(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.f66x, extended.xyz.f67y, extended.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f67y, extended.xyz.f67y, extended.xyz.f66x);
        Field25519.mult(partialXYZT.xyz.f67y, partialXYZT.xyz.f67y, cached.yPlusX);
        Field25519.mult(partialXYZT.xyz.f68z, partialXYZT.xyz.f66x, cached.yMinusX);
        Field25519.mult(partialXYZT.f65t, extended.f69t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f66x, extended.xyz.f68z);
        Field25519.sum(jArr, partialXYZT.xyz.f66x, partialXYZT.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f66x, partialXYZT.xyz.f68z, partialXYZT.xyz.f67y);
        Field25519.sum(partialXYZT.xyz.f67y, partialXYZT.xyz.f68z, partialXYZT.xyz.f67y);
        Field25519.sub(partialXYZT.xyz.f68z, jArr, partialXYZT.f65t);
        Field25519.sum(partialXYZT.f65t, jArr, partialXYZT.f65t);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ p2) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.f66x, p2.f66x);
        Field25519.square(partialXYZT.xyz.f68z, p2.f67y);
        Field25519.square(partialXYZT.f65t, p2.f68z);
        Field25519.sum(partialXYZT.f65t, partialXYZT.f65t, partialXYZT.f65t);
        Field25519.sum(partialXYZT.xyz.f67y, p2.f66x, p2.f67y);
        Field25519.square(jArr, partialXYZT.xyz.f67y);
        Field25519.sum(partialXYZT.xyz.f67y, partialXYZT.xyz.f68z, partialXYZT.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f68z, partialXYZT.xyz.f68z, partialXYZT.xyz.f66x);
        Field25519.sub(partialXYZT.xyz.f66x, jArr, partialXYZT.xyz.f67y);
        Field25519.sub(partialXYZT.f65t, partialXYZT.f65t, partialXYZT.xyz.f68z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT p2) {
        doubleXYZ(partialXYZT, p2.xyz);
    }

    private static void select(CachedXYT t2, int pos, byte b2) {
        int i2 = (b2 & UByte.MAX_VALUE) >> 7;
        int i3 = b2 - (((-i2) & b2) << 1);
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][0], eq(i3, 1));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][1], eq(i3, 2));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][2], eq(i3, 3));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][3], eq(i3, 4));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][4], eq(i3, 5));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][5], eq(i3, 6));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][6], eq(i3, 7));
        t2.copyConditional(Ed25519Constants.B_TABLE[pos][7], eq(i3, 8));
        long[] copyOf = Arrays.copyOf(t2.yMinusX, 10);
        long[] copyOf2 = Arrays.copyOf(t2.yPlusX, 10);
        long[] copyOf3 = Arrays.copyOf(t2.t2d, 10);
        neg(copyOf3, copyOf3);
        t2.copyConditional(new CachedXYT(copyOf, copyOf2, copyOf3), i2);
    }

    private static XYZ scalarMultWithBase(byte[] a2) {
        int i2;
        byte[] bArr = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 * 2;
            bArr[i4 + 0] = (byte) (((a2[i3] & UByte.MAX_VALUE) >> 0) & 15);
            bArr[i4 + 1] = (byte) (((a2[i3] & UByte.MAX_VALUE) >> 4) & 15);
            i3++;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 63; i6++) {
            bArr[i6] = (byte) (bArr[i6] + i5);
            i5 = (bArr[i6] + 8) >> 4;
            bArr[i6] = (byte) (bArr[i6] - (i5 << 4));
        }
        bArr[63] = (byte) (bArr[63] + i5);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i2 = 1; i2 < 64; i2 += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i2 / 2, bArr[i2]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i7 = 0; i7 < 64; i7 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i7 / 2, bArr[i7]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] scalarMultWithBaseToBytes(byte[] a2) {
        return scalarMultWithBase(a2).toBytes();
    }

    private static byte[] slide(byte[] a2) {
        int i2;
        byte[] bArr = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr[i3] = (byte) (1 & ((a2[i3 >> 3] & UByte.MAX_VALUE) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    if (bArr[i2] != 0) {
                        if (bArr[i4] + (bArr[i2] << i5) <= 15) {
                            bArr[i4] = (byte) (bArr[i4] + (bArr[i2] << i5));
                            bArr[i2] = 0;
                        } else if (bArr[i4] - (bArr[i2] << i5) >= -15) {
                            bArr[i4] = (byte) (bArr[i4] - (bArr[i2] << i5));
                            while (true) {
                                if (i2 >= 256) {
                                    break;
                                } else if (bArr[i2] == 0) {
                                    bArr[i2] = 1;
                                    break;
                                } else {
                                    bArr[i2] = 0;
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr;
    }

    private static XYZ doubleScalarMultVarTime(byte[] a2, XYZT pointA, byte[] b2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(pointA);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, pointA);
        XYZT xyzt = new XYZT(partialXYZT);
        for (int i2 = 1; i2 < 8; i2++) {
            add(partialXYZT, xyzt, cachedXYZTArr[i2 - 1]);
            cachedXYZTArr[i2] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] slide = slide(a2);
        byte[] slide2 = slide(b2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt2 = new XYZT();
        int i3 = 255;
        while (i3 >= 0 && slide[i3] == 0 && slide2[i3] == 0) {
            i3--;
        }
        while (i3 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            if (slide[i3] > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[slide[i3] / 2]);
            } else if (slide[i3] < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[(-slide[i3]) / 2]);
            }
            if (slide2[i3] > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[slide2[i3] / 2]);
            } else if (slide2[i3] < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[(-slide2[i3]) / 2]);
            }
            i3--;
        }
        return new XYZ(partialXYZT2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] in) {
        long[] jArr = new long[in.length + 1];
        System.arraycopy(in, 0, jArr, 0, in.length);
        Field25519.reduceCoefficients(jArr);
        for (byte b2 : Field25519.contract(jArr)) {
            if (b2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] in) {
        return Field25519.contract(in)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] out, long[] in) {
        for (int i2 = 0; i2 < in.length; i2++) {
            out[i2] = -in[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] out, long[] in) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        Field25519.square(jArr, in);
        Field25519.square(jArr2, jArr);
        for (int i2 = 1; i2 < 2; i2++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, in, jArr2);
        Field25519.mult(jArr, jArr, jArr2);
        Field25519.square(jArr, jArr);
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i3 = 1; i3 < 5; i3++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i4 = 1; i4 < 10; i4++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i5 = 1; i5 < 20; i5++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i6 = 1; i6 < 10; i6++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i7 = 1; i7 < 50; i7++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i8 = 1; i8 < 100; i8++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i9 = 1; i9 < 50; i9++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr, jArr);
        for (int i10 = 1; i10 < 2; i10++) {
            Field25519.square(jArr, jArr);
        }
        Field25519.mult(out, jArr, in);
    }

    private static long load3(byte[] in, int idx) {
        return ((in[idx + 2] & UByte.MAX_VALUE) << 16) | (in[idx] & 255) | ((in[idx + 1] & UByte.MAX_VALUE) << 8);
    }

    private static long load4(byte[] in, int idx) {
        return ((in[idx + 3] & UByte.MAX_VALUE) << 24) | load3(in, idx);
    }

    private static void reduce(byte[] s2) {
        long load3 = (load3(s2, 47) >> 2) & 2097151;
        long load4 = (load4(s2, 49) >> 7) & 2097151;
        long load42 = (load4(s2, 52) >> 4) & 2097151;
        long load32 = (load3(s2, 55) >> 1) & 2097151;
        long load43 = (load4(s2, 57) >> 6) & 2097151;
        long load44 = load4(s2, 60) >> 3;
        long load33 = (load3(s2, 42) & 2097151) - (load44 * 683901);
        long load34 = ((load3(s2, 26) >> 2) & 2097151) + (load43 * 666643);
        long load45 = ((load4(s2, 28) >> 7) & 2097151) + (load44 * 666643) + (load43 * 470296);
        long load46 = ((load4(s2, 31) >> 4) & 2097151) + (load44 * 470296) + (load43 * 654183);
        long load35 = (((load3(s2, 34) >> 1) & 2097151) + (load44 * 654183)) - (load43 * 997805);
        long load36 = (((load3(s2, 39) >> 3) & 2097151) + (load44 * 136657)) - (load43 * 683901);
        long load47 = ((load4(s2, 23) >> 5) & 2097151) + (load32 * 666643);
        long load48 = ((((load4(s2, 36) >> 6) & 2097151) - (load44 * 997805)) + (load43 * 136657)) - (load32 * 683901);
        long load37 = (load3(s2, 21) & 2097151) + (load42 * 666643);
        long load38 = ((load3(s2, 18) >> 3) & 2097151) + (load4 * 666643);
        long j2 = ((load46 - (load32 * 997805)) + (load42 * 136657)) - (load4 * 683901);
        long load49 = ((load4(s2, 15) >> 6) & 2097151) + (load3 * 666643);
        long j3 = load38 + (load3 * 470296);
        long j4 = load37 + (load4 * 470296) + (load3 * 654183);
        long j5 = ((load47 + (load42 * 470296)) + (load4 * 654183)) - (load3 * 997805);
        long j6 = (((load34 + (load32 * 470296)) + (load42 * 654183)) - (load4 * 997805)) + (load3 * 136657);
        long j7 = (((load45 + (load32 * 654183)) - (load42 * 997805)) + (load4 * 136657)) - (load3 * 683901);
        long j8 = (load49 + 1048576) >> 21;
        long j9 = j3 + j8;
        long j10 = load49 - (j8 << 21);
        long j11 = (j4 + 1048576) >> 21;
        long j12 = j5 + j11;
        long j13 = j4 - (j11 << 21);
        long j14 = (j6 + 1048576) >> 21;
        long j15 = j7 + j14;
        long j16 = j6 - (j14 << 21);
        long j17 = (j2 + 1048576) >> 21;
        long j18 = ((load35 + (load32 * 136657)) - (load42 * 683901)) + j17;
        long j19 = j2 - (j17 << 21);
        long j20 = (load48 + 1048576) >> 21;
        long j21 = load36 + j20;
        long j22 = load48 - (j20 << 21);
        long j23 = (load33 + 1048576) >> 21;
        long load410 = ((load4(s2, 44) >> 5) & 2097151) + j23;
        long j24 = load33 - (j23 << 21);
        long j25 = (j9 + 1048576) >> 21;
        long j26 = j13 + j25;
        long j27 = j9 - (j25 << 21);
        long j28 = (j12 + 1048576) >> 21;
        long j29 = j16 + j28;
        long j30 = j12 - (j28 << 21);
        long j31 = (j15 + 1048576) >> 21;
        long j32 = j19 + j31;
        long j33 = j15 - (j31 << 21);
        long j34 = (j18 + 1048576) >> 21;
        long j35 = j22 + j34;
        long j36 = j18 - (j34 << 21);
        long j37 = (j21 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j21 - (j37 << 21);
        long load39 = ((load3(s2, 13) >> 1) & 2097151) + (load410 * 666643);
        long j40 = j29 - (load410 * 683901);
        long load411 = ((load4(s2, 10) >> 4) & 2097151) + (j38 * 666643);
        long load412 = ((load4(s2, 7) >> 7) & 2097151) + (j39 * 666643);
        long j41 = ((j26 - (load410 * 997805)) + (j38 * 136657)) - (j39 * 683901);
        long load310 = ((load3(s2, 5) >> 2) & 2097151) + (j35 * 666643);
        long load413 = ((load4(s2, 2) >> 5) & 2097151) + (j36 * 666643);
        long j42 = ((((j10 + (load410 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j35 * 136657)) - (j36 * 683901);
        long load311 = (load3(s2, 0) & 2097151) + (j32 * 666643);
        long j43 = load413 + (j32 * 470296);
        long j44 = load310 + (j36 * 470296) + (j32 * 654183);
        long j45 = ((load412 + (j35 * 470296)) + (j36 * 654183)) - (j32 * 997805);
        long j46 = (((load411 + (j39 * 470296)) + (j35 * 654183)) - (j36 * 997805)) + (j32 * 136657);
        long j47 = ((((load39 + (j38 * 470296)) + (j39 * 654183)) - (j35 * 997805)) + (j36 * 136657)) - (j32 * 683901);
        long j48 = (load311 + 1048576) >> 21;
        long j49 = j43 + j48;
        long j50 = load311 - (j48 << 21);
        long j51 = (j44 + 1048576) >> 21;
        long j52 = j45 + j51;
        long j53 = j44 - (j51 << 21);
        long j54 = (j46 + 1048576) >> 21;
        long j55 = j47 + j54;
        long j56 = j46 - (j54 << 21);
        long j57 = (j42 + 1048576) >> 21;
        long j58 = ((((j27 + (load410 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j35 * 683901)) + j57;
        long j59 = j42 - (j57 << 21);
        long j60 = (j41 + 1048576) >> 21;
        long j61 = ((j30 + (load410 * 136657)) - (j38 * 683901)) + j60;
        long j62 = j41 - (j60 << 21);
        long j63 = (j40 + 1048576) >> 21;
        long j64 = j33 + j63;
        long j65 = j40 - (j63 << 21);
        long j66 = (j49 + 1048576) >> 21;
        long j67 = j53 + j66;
        long j68 = j49 - (j66 << 21);
        long j69 = (j52 + 1048576) >> 21;
        long j70 = j56 + j69;
        long j71 = j52 - (j69 << 21);
        long j72 = (j55 + 1048576) >> 21;
        long j73 = j59 + j72;
        long j74 = j55 - (j72 << 21);
        long j75 = (j58 + 1048576) >> 21;
        long j76 = j62 + j75;
        long j77 = j58 - (j75 << 21);
        long j78 = (j61 + 1048576) >> 21;
        long j79 = j65 + j78;
        long j80 = j61 - (j78 << 21);
        long j81 = (j64 + 1048576) >> 21;
        long j82 = j81 + 0;
        long j83 = j50 + (j82 * 666643);
        long j84 = j68 + (j82 * 470296);
        long j85 = j67 + (j82 * 654183);
        long j86 = j71 - (j82 * 997805);
        long j87 = j74 - (j82 * 683901);
        long j88 = j83 >> 21;
        long j89 = j84 + j88;
        long j90 = j83 - (j88 << 21);
        long j91 = j89 >> 21;
        long j92 = j85 + j91;
        long j93 = j89 - (j91 << 21);
        long j94 = j92 >> 21;
        long j95 = j86 + j94;
        long j96 = j92 - (j94 << 21);
        long j97 = j95 >> 21;
        long j98 = j70 + (j82 * 136657) + j97;
        long j99 = j95 - (j97 << 21);
        long j100 = j98 >> 21;
        long j101 = j87 + j100;
        long j102 = j98 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j73 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j77 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j76 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j80 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = j79 + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = (j64 - (j81 << 21)) + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j121 + 0;
        long j123 = j119 - (j121 << 21);
        long j124 = j90 + (666643 * j122);
        long j125 = j124 >> 21;
        long j126 = j93 + (470296 * j122) + j125;
        long j127 = j124 - (j125 << 21);
        long j128 = j126 >> 21;
        long j129 = j96 + (654183 * j122) + j128;
        long j130 = j126 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = (j99 - (997805 * j122)) + j131;
        long j133 = j129 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = j102 + (136657 * j122) + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = (j105 - (j122 * 683901)) + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j108 + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = j111 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j114 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j117 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j120 + j152;
        long j154 = j150 - (j152 << 21);
        long j155 = j153 >> 21;
        long j156 = j123 + j155;
        long j157 = j153 - (j155 << 21);
        s2[0] = (byte) j127;
        s2[1] = (byte) (j127 >> 8);
        s2[2] = (byte) ((j127 >> 16) | (j130 << 5));
        s2[3] = (byte) (j130 >> 3);
        s2[4] = (byte) (j130 >> 11);
        s2[5] = (byte) ((j130 >> 19) | (j133 << 2));
        s2[6] = (byte) (j133 >> 6);
        s2[7] = (byte) ((j133 >> 14) | (j136 << 7));
        s2[8] = (byte) (j136 >> 1);
        s2[9] = (byte) (j136 >> 9);
        s2[10] = (byte) ((j136 >> 17) | (j139 << 4));
        s2[11] = (byte) (j139 >> 4);
        s2[12] = (byte) (j139 >> 12);
        s2[13] = (byte) ((j139 >> 20) | (j142 << 1));
        s2[14] = (byte) (j142 >> 7);
        s2[15] = (byte) ((j142 >> 15) | (j145 << 6));
        s2[16] = (byte) (j145 >> 2);
        s2[17] = (byte) (j145 >> 10);
        s2[18] = (byte) ((j145 >> 18) | (j148 << 3));
        s2[19] = (byte) (j148 >> 5);
        s2[20] = (byte) (j148 >> 13);
        s2[21] = (byte) j151;
        s2[22] = (byte) (j151 >> 8);
        s2[23] = (byte) ((j151 >> 16) | (j154 << 5));
        s2[24] = (byte) (j154 >> 3);
        s2[25] = (byte) (j154 >> 11);
        s2[26] = (byte) ((j154 >> 19) | (j157 << 2));
        s2[27] = (byte) (j157 >> 6);
        s2[28] = (byte) ((j157 >> 14) | (j156 << 7));
        s2[29] = (byte) (j156 >> 1);
        s2[30] = (byte) (j156 >> 9);
        s2[31] = (byte) (j156 >> 17);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r6v12 ?? I:long)
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    private static void mulAdd(byte[] r82, byte[] r83, byte[] r84, byte[] r85) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Ed25519.mulAdd(byte[], byte[], byte[], byte[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] getHashedScalar(final byte[] privateKey) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(privateKey, 0, 32);
        byte[] digest = engineFactory.digest();
        digest[0] = (byte) (digest[0] & 248);
        digest[31] = (byte) (digest[31] & ByteCompanionObject.MAX_VALUE);
        digest[31] = (byte) (digest[31] | 64);
        return digest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] sign(final byte[] message, final byte[] publicKey, final byte[] hashedPrivateKey) throws GeneralSecurityException {
        byte[] copyOfRange = Arrays.copyOfRange(message, 0, message.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(hashedPrivateKey, 32, 32);
        engineFactory.update(copyOfRange);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(digest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(copyOfRange2);
        engineFactory.update(publicKey);
        engineFactory.update(copyOfRange);
        byte[] digest2 = engineFactory.digest();
        reduce(digest2);
        byte[] bArr = new byte[32];
        mulAdd(bArr, digest2, hashedPrivateKey, digest);
        return Bytes.concat(copyOfRange2, bArr);
    }

    private static boolean isSmallerThanGroupOrder(byte[] s2) {
        for (int i2 = 31; i2 >= 0; i2--) {
            int i3 = s2[i2] & UByte.MAX_VALUE;
            int i4 = GROUP_ORDER[i2] & UByte.MAX_VALUE;
            if (i3 != i4) {
                return i3 < i4;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean verify(final byte[] message, final byte[] signature, final byte[] publicKey) throws GeneralSecurityException {
        if (signature.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(signature, 32, 64);
        if (isSmallerThanGroupOrder(copyOfRange)) {
            MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
            engineFactory.update(signature, 0, 32);
            engineFactory.update(publicKey);
            engineFactory.update(message);
            byte[] digest = engineFactory.digest();
            reduce(digest);
            byte[] bytes = doubleScalarMultVarTime(digest, XYZT.fromBytesNegateVarTime(publicKey), copyOfRange).toBytes();
            for (int i2 = 0; i2 < 32; i2++) {
                if (bytes[i2] != signature[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}