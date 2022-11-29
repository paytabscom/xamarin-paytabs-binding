package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes.dex */
final class Ed25519Constants {
    static final Ed25519.CachedXYT[] B2;
    static final Ed25519.CachedXYT[][] B_TABLE;
    static final long[] D;
    static final long[] D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    Ed25519Constants() {
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        D_BI = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        D2_BI = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        SQRTM1_BI = modPow;
        Point point = new Point();
        point.f71y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        point.f70x = recoverX(point.f71y);
        D = Field25519.expand(toLittleEndian(mod));
        D2 = Field25519.expand(toLittleEndian(mod2));
        SQRTM1 = Field25519.expand(toLittleEndian(modPow));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, 32, 8);
        Point point2 = point;
        for (int i2 = 0; i2 < 32; i2++) {
            Point point3 = point2;
            for (int i3 = 0; i3 < 8; i3++) {
                B_TABLE[i2][i3] = getCachedXYT(point3);
                point3 = edwards(point3, point2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                point2 = edwards(point2, point2);
            }
        }
        Point edwards = edwards(point, point);
        B2 = new Ed25519.CachedXYT[8];
        for (int i5 = 0; i5 < 8; i5++) {
            B2[i5] = getCachedXYT(point);
            point = edwards(point, edwards);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Point {

        /* renamed from: x  reason: collision with root package name */
        private BigInteger f70x;

        /* renamed from: y  reason: collision with root package name */
        private BigInteger f71y;

        private Point() {
        }
    }

    private static BigInteger recoverX(BigInteger y2) {
        BigInteger subtract = y2.pow(2).subtract(BigInteger.ONE);
        BigInteger add = D_BI.multiply(y2.pow(2)).add(BigInteger.ONE);
        BigInteger bigInteger = P_BI;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger));
        BigInteger modPow = multiply.modPow(bigInteger.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(SQRTM1_BI).mod(bigInteger);
        }
        return modPow.testBit(0) ? bigInteger.subtract(modPow) : modPow;
    }

    private static Point edwards(Point a2, Point b2) {
        Point point = new Point();
        BigInteger multiply = D_BI.multiply(a2.f70x.multiply(b2.f70x).multiply(a2.f71y).multiply(b2.f71y));
        BigInteger bigInteger = P_BI;
        BigInteger mod = multiply.mod(bigInteger);
        point.f70x = a2.f70x.multiply(b2.f71y).add(b2.f70x.multiply(a2.f71y)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        point.f71y = a2.f71y.multiply(b2.f71y).add(a2.f70x.multiply(b2.f70x)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return point;
    }

    private static byte[] toLittleEndian(BigInteger n2) {
        byte[] bArr = new byte[32];
        byte[] byteArray = n2.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = (32 - i2) - 1;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point p2) {
        BigInteger add = p2.f71y.add(p2.f70x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(add.mod(bigInteger))), Field25519.expand(toLittleEndian(p2.f71y.subtract(p2.f70x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(p2.f70x).multiply(p2.f71y).mod(bigInteger))));
    }
}