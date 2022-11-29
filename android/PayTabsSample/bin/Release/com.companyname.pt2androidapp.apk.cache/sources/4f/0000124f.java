package com.google.crypto.tink.subtle;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class EllipticCurves {

    /* loaded from: classes.dex */
    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    /* loaded from: classes.dex */
    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    /* loaded from: classes.dex */
    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    public static ECParameterSpec getNistP256Params() {
        return getNistCurveSpec("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static ECParameterSpec getNistP384Params() {
        return getNistCurveSpec("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    public static ECParameterSpec getNistP521Params() {
        return getNistCurveSpec("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    static void checkPointOnCurve(ECPoint point, EllipticCurve ec) throws GeneralSecurityException {
        BigInteger modulus = getModulus(ec);
        BigInteger affineX = point.getAffineX();
        BigInteger affineY = point.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(modulus).equals(affineX.multiply(affineX).add(ec.getA()).multiply(affineX).add(ec.getB()).mod(modulus))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkPublicKey(ECPublicKey key) throws GeneralSecurityException {
        checkPointOnCurve(key.getW(), key.getParams().getCurve());
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec spec) {
        return isSameEcParameterSpec(spec, getNistP256Params()) || isSameEcParameterSpec(spec, getNistP384Params()) || isSameEcParameterSpec(spec, getNistP521Params());
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec one, ECParameterSpec two) {
        return one.getCurve().equals(two.getCurve()) && one.getGenerator().equals(two.getGenerator()) && one.getOrder().equals(two.getOrder()) && one.getCofactor() == two.getCofactor();
    }

    public static void validatePublicKey(ECPublicKey publicKey, ECPrivateKey privateKey) throws GeneralSecurityException {
        validatePublicKeySpec(publicKey, privateKey);
        checkPointOnCurve(publicKey.getW(), privateKey.getParams().getCurve());
    }

    static void validatePublicKeySpec(ECPublicKey publicKey, ECPrivateKey privateKey) throws GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(publicKey.getParams(), privateKey.getParams())) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }

    public static BigInteger getModulus(EllipticCurve curve) throws GeneralSecurityException {
        ECField field = curve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static int fieldSizeInBits(EllipticCurve curve) throws GeneralSecurityException {
        return getModulus(curve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve curve) throws GeneralSecurityException {
        return (fieldSizeInBits(curve) + 7) / 8;
    }

    private static ECParameterSpec getNistCurveSpec(String decimalP, String decimalN, String hexB, String hexGX, String hexGY) {
        BigInteger bigInteger = new BigInteger(decimalP);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(hexB, 16)), new ECPoint(new BigInteger(hexGX, 16), new BigInteger(hexGY, 16)), new BigInteger(decimalN), 1);
    }

    protected static BigInteger modSqrt(BigInteger x2, BigInteger p2) throws GeneralSecurityException {
        if (p2.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod = x2.mod(p2);
        BigInteger bigInteger = null;
        if (mod.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        int i2 = 0;
        if (p2.testBit(0) && p2.testBit(1)) {
            bigInteger = mod.modPow(p2.add(BigInteger.ONE).shiftRight(2), p2);
        } else if (p2.testBit(0) && !p2.testBit(1)) {
            BigInteger bigInteger2 = BigInteger.ONE;
            BigInteger shiftRight = p2.subtract(BigInteger.ONE).shiftRight(1);
            while (true) {
                BigInteger mod2 = bigInteger2.multiply(bigInteger2).subtract(mod).mod(p2);
                if (mod2.equals(BigInteger.ZERO)) {
                    return bigInteger2;
                }
                BigInteger modPow = mod2.modPow(shiftRight, p2);
                if (!modPow.add(BigInteger.ONE).equals(p2)) {
                    if (!modPow.equals(BigInteger.ONE)) {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    }
                    bigInteger2 = bigInteger2.add(BigInteger.ONE);
                    i2++;
                    if (i2 == 128 && !p2.isProbablePrime(80)) {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    }
                } else {
                    BigInteger shiftRight2 = p2.add(BigInteger.ONE).shiftRight(1);
                    BigInteger bigInteger3 = BigInteger.ONE;
                    BigInteger bigInteger4 = bigInteger3;
                    BigInteger bigInteger5 = bigInteger2;
                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                        BigInteger multiply = bigInteger5.multiply(bigInteger4);
                        bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(p2).multiply(mod2)).mod(p2);
                        bigInteger4 = multiply.add(multiply).mod(p2);
                        if (shiftRight2.testBit(bitLength)) {
                            BigInteger mod3 = bigInteger5.multiply(bigInteger2).add(bigInteger4.multiply(mod2)).mod(p2);
                            bigInteger4 = bigInteger2.multiply(bigInteger4).add(bigInteger5).mod(p2);
                            bigInteger5 = mod3;
                        }
                    }
                    bigInteger = bigInteger5;
                }
            }
        }
        if (bigInteger == null || bigInteger.multiply(bigInteger).mod(p2).compareTo(mod) == 0) {
            return bigInteger;
        }
        throw new GeneralSecurityException("Could not find a modular square root");
    }

    public static BigInteger getY(BigInteger x2, boolean lsb, EllipticCurve curve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(curve);
        BigInteger modSqrt = modSqrt(x2.multiply(x2).add(curve.getA()).multiply(x2).add(curve.getB()).mod(modulus), modulus);
        return lsb != modSqrt.testBit(0) ? modulus.subtract(modSqrt).mod(modulus) : modSqrt;
    }

    private static byte[] toMinimalSignedNumber(byte[] bs) {
        int i2 = 0;
        while (i2 < bs.length && bs[i2] == 0) {
            i2++;
        }
        if (i2 == bs.length) {
            i2 = bs.length - 1;
        }
        int i3 = (bs[i2] & ByteCompanionObject.MIN_VALUE) == 128 ? 1 : 0;
        byte[] bArr = new byte[(bs.length - i2) + i3];
        System.arraycopy(bs, i2, bArr, i3, bs.length - i2);
        return bArr;
    }

    public static byte[] ecdsaIeee2Der(byte[] ieee) throws GeneralSecurityException {
        byte[] bArr;
        int i2;
        if (ieee.length % 2 != 0 || ieee.length == 0 || ieee.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] minimalSignedNumber = toMinimalSignedNumber(Arrays.copyOf(ieee, ieee.length / 2));
        byte[] minimalSignedNumber2 = toMinimalSignedNumber(Arrays.copyOfRange(ieee, ieee.length / 2, ieee.length));
        int length = minimalSignedNumber.length + 2 + 1 + 1 + minimalSignedNumber2.length;
        if (length >= 128) {
            bArr = new byte[length + 3];
            bArr[0] = 48;
            bArr[1] = -127;
            bArr[2] = (byte) length;
            i2 = 3;
        } else {
            bArr = new byte[length + 2];
            bArr[0] = 48;
            bArr[1] = (byte) length;
            i2 = 2;
        }
        int i3 = i2 + 1;
        bArr[i2] = 2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) minimalSignedNumber.length;
        System.arraycopy(minimalSignedNumber, 0, bArr, i4, minimalSignedNumber.length);
        int length2 = i4 + minimalSignedNumber.length;
        int i5 = length2 + 1;
        bArr[length2] = 2;
        bArr[i5] = (byte) minimalSignedNumber2.length;
        System.arraycopy(minimalSignedNumber2, 0, bArr, i5 + 1, minimalSignedNumber2.length);
        return bArr;
    }

    public static byte[] ecdsaDer2Ieee(byte[] der, int ieeeLength) throws GeneralSecurityException {
        if (!isValidDerEncoding(der)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr = new byte[ieeeLength];
        int i2 = ((der[1] & UByte.MAX_VALUE) >= 128 ? 3 : 2) + 1;
        int i3 = i2 + 1;
        int i4 = der[i2];
        int i5 = der[i3] == 0 ? 1 : 0;
        System.arraycopy(der, i3 + i5, bArr, ((ieeeLength / 2) - i4) + i5, i4 - i5);
        int i6 = i3 + i4 + 1;
        int i7 = i6 + 1;
        int i8 = der[i6];
        int i9 = der[i7] != 0 ? 0 : 1;
        System.arraycopy(der, i7 + i9, bArr, (ieeeLength - i8) + i9, i8 - i9);
        return bArr;
    }

    public static boolean isValidDerEncoding(final byte[] sig) {
        int i2;
        if (sig.length >= 8 && sig[0] == 48) {
            int i3 = sig[1] & UByte.MAX_VALUE;
            if (i3 == 129) {
                i3 = sig[2] & UByte.MAX_VALUE;
                if (i3 < 128) {
                    return false;
                }
                i2 = 2;
            } else if (i3 == 128 || i3 > 129) {
                return false;
            } else {
                i2 = 1;
            }
            if (i3 != (sig.length - 1) - i2) {
                return false;
            }
            int i4 = i2 + 1;
            if (sig[i4] != 2) {
                return false;
            }
            int i5 = i4 + 1;
            int i6 = sig[i5] & UByte.MAX_VALUE;
            int i7 = i5 + 1 + i6 + 1;
            if (i7 < sig.length && i6 != 0) {
                int i8 = i2 + 3;
                if ((sig[i8] & UByte.MAX_VALUE) >= 128) {
                    return false;
                }
                if ((i6 <= 1 || sig[i8] != 0 || (sig[i2 + 4] & UByte.MAX_VALUE) >= 128) && sig[i8 + i6] == 2) {
                    int i9 = sig[i7] & UByte.MAX_VALUE;
                    if (i7 + 1 + i9 == sig.length && i9 != 0) {
                        int i10 = i2 + 5 + i6;
                        if ((sig[i10] & UByte.MAX_VALUE) >= 128) {
                            return false;
                        }
                        return i9 <= 1 || sig[i10] != 0 || (sig[(i2 + 6) + i6] & UByte.MAX_VALUE) >= 128;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static int encodingSizeInBytes(EllipticCurve curve, PointFormatType format) throws GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return fieldSizeInBytes + 1;
                }
                throw new GeneralSecurityException("unknown EC point format");
            }
            return fieldSizeInBytes * 2;
        }
        return (fieldSizeInBytes * 2) + 1;
    }

    @Deprecated
    public static ECPoint ecPointDecode(EllipticCurve curve, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        return pointDecode(curve, format, encoded);
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        return pointDecode(getCurveSpec(curveType).getCurve(), format, encoded);
    }

    public static ECPoint pointDecode(EllipticCurve curve, PointFormatType format, byte[] encoded) throws GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        boolean z2 = false;
        if (i2 == 1) {
            if (encoded.length != (fieldSizeInBytes * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (encoded[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i3 = fieldSizeInBytes + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(encoded, 1, i3)), new BigInteger(1, Arrays.copyOfRange(encoded, i3, encoded.length)));
            checkPointOnCurve(eCPoint, curve);
            return eCPoint;
        } else if (i2 == 2) {
            if (encoded.length != fieldSizeInBytes * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(encoded, 0, fieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(encoded, fieldSizeInBytes, encoded.length)));
            checkPointOnCurve(eCPoint2, curve);
            return eCPoint2;
        } else if (i2 == 3) {
            BigInteger modulus = getModulus(curve);
            if (encoded.length != fieldSizeInBytes + 1) {
                throw new GeneralSecurityException("compressed point has wrong length");
            }
            if (encoded[0] != 2) {
                if (encoded[0] != 3) {
                    throw new GeneralSecurityException("invalid format");
                }
                z2 = true;
            }
            BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(encoded, 1, encoded.length));
            if (bigInteger.signum() == -1 || bigInteger.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("x is out of range");
            }
            return new ECPoint(bigInteger, getY(bigInteger, z2, curve));
        } else {
            throw new GeneralSecurityException("invalid format:" + format);
        }
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType format, ECPoint point) throws GeneralSecurityException {
        return pointEncode(getCurveSpec(curveType).getCurve(), format, point);
    }

    public static byte[] pointEncode(EllipticCurve curve, PointFormatType format, ECPoint point) throws GeneralSecurityException {
        checkPointOnCurve(point, curve);
        int fieldSizeInBytes = fieldSizeInBytes(curve);
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[format.ordinal()];
        if (i2 == 1) {
            int i3 = (fieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i3];
            byte[] byteArray = point.getAffineX().toByteArray();
            byte[] byteArray2 = point.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr, i3 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr, (fieldSizeInBytes + 1) - byteArray.length, byteArray.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                int i4 = fieldSizeInBytes + 1;
                byte[] bArr2 = new byte[i4];
                byte[] byteArray3 = point.getAffineX().toByteArray();
                System.arraycopy(byteArray3, 0, bArr2, i4 - byteArray3.length, byteArray3.length);
                bArr2[0] = (byte) (point.getAffineY().testBit(0) ? 3 : 2);
                return bArr2;
            }
            throw new GeneralSecurityException("invalid format:" + format);
        }
        int i5 = fieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i5];
        byte[] byteArray4 = point.getAffineX().toByteArray();
        if (byteArray4.length > fieldSizeInBytes) {
            byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - fieldSizeInBytes, byteArray4.length);
        }
        byte[] byteArray5 = point.getAffineY().toByteArray();
        if (byteArray5.length > fieldSizeInBytes) {
            byteArray5 = Arrays.copyOfRange(byteArray5, byteArray5.length - fieldSizeInBytes, byteArray5.length);
        }
        System.arraycopy(byteArray5, 0, bArr3, i5 - byteArray5.length, byteArray5.length);
        System.arraycopy(byteArray4, 0, bArr3, fieldSizeInBytes - byteArray4.length, byteArray4.length);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.subtle.EllipticCurves$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType;

        static {
            int[] iArr = new int[CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static ECParameterSpec getCurveSpec(CurveType curve) throws NoSuchAlgorithmException {
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curve.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return getNistP521Params();
                }
                throw new NoSuchAlgorithmException("curve not implemented:" + curve);
            }
            return getNistP384Params();
        }
        return getNistP256Params();
    }

    public static ECPublicKey getEcPublicKey(final byte[] x509PublicKey) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(x509PublicKey));
    }

    public static ECPublicKey getEcPublicKey(CurveType curve, PointFormatType pointFormat, final byte[] publicKey) throws GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(curve), pointFormat, publicKey);
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec spec, PointFormatType pointFormat, final byte[] publicKey) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(pointDecode(spec.getCurve(), pointFormat, publicKey), spec));
    }

    public static ECPublicKey getEcPublicKey(CurveType curve, final byte[] x2, final byte[] y2) throws GeneralSecurityException {
        ECParameterSpec curveSpec = getCurveSpec(curve);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, x2), new BigInteger(1, y2));
        checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }

    public static ECPrivateKey getEcPrivateKey(final byte[] pkcs8PrivateKey) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(pkcs8PrivateKey));
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curve, final byte[] keyValue) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, keyValue), getCurveSpec(curve)));
    }

    public static KeyPair generateKeyPair(CurveType curve) throws GeneralSecurityException {
        return generateKeyPair(getCurveSpec(curve));
    }

    public static KeyPair generateKeyPair(ECParameterSpec spec) throws GeneralSecurityException {
        KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        engineFactory.initialize(spec);
        return engineFactory.generateKeyPair();
    }

    private static void validateSharedSecret(byte[] secret, ECPrivateKey privateKey) throws GeneralSecurityException {
        EllipticCurve curve = privateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, secret);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(getModulus(curve)) >= 0) {
            throw new GeneralSecurityException("shared secret is out of range");
        }
        getY(bigInteger, true, curve);
    }

    public static byte[] computeSharedSecret(ECPrivateKey myPrivateKey, ECPublicKey peerPublicKey) throws GeneralSecurityException {
        validatePublicKeySpec(peerPublicKey, myPrivateKey);
        return computeSharedSecret(myPrivateKey, peerPublicKey.getW());
    }

    public static byte[] computeSharedSecret(ECPrivateKey myPrivateKey, ECPoint publicPoint) throws GeneralSecurityException {
        checkPointOnCurve(publicPoint, myPrivateKey.getParams().getCurve());
        PublicKey generatePublic = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(publicPoint, myPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(myPrivateKey);
        try {
            engineFactory.doPhase(generatePublic, true);
            byte[] generateSecret = engineFactory.generateSecret();
            validateSharedSecret(generateSecret, myPrivateKey);
            return generateSecret;
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}