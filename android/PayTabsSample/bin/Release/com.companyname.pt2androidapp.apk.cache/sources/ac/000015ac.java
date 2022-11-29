package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UComparisons.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a&\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes.dex */
public class UComparisonsKt___UComparisonsKt {
    /* renamed from: maxOf-J1ME1BU  reason: not valid java name */
    public static final int m1206maxOfJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3) >= 0 ? i2 : i3;
    }

    /* renamed from: maxOf-eb3DHEI  reason: not valid java name */
    public static final long m1214maxOfeb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3) >= 0 ? j2 : j3;
    }

    /* renamed from: maxOf-Kr8caGY  reason: not valid java name */
    public static final byte m1207maxOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b3 & UByte.MAX_VALUE) >= 0 ? b2 : b3;
    }

    /* renamed from: maxOf-5PvTz6A  reason: not valid java name */
    public static final short m1205maxOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & UShort.MAX_VALUE, 65535 & s3) >= 0 ? s2 : s3;
    }

    /* renamed from: maxOf-WZ9TVnA  reason: not valid java name */
    private static final int m1211maxOfWZ9TVnA(int i2, int i3, int i4) {
        return UComparisonsKt.m1206maxOfJ1ME1BU(i2, UComparisonsKt.m1206maxOfJ1ME1BU(i3, i4));
    }

    /* renamed from: maxOf-sambcqE  reason: not valid java name */
    private static final long m1215maxOfsambcqE(long j2, long j3, long j4) {
        return UComparisonsKt.m1214maxOfeb3DHEI(j2, UComparisonsKt.m1214maxOfeb3DHEI(j3, j4));
    }

    /* renamed from: maxOf-b33U2AM  reason: not valid java name */
    private static final byte m1213maxOfb33U2AM(byte b2, byte b3, byte b4) {
        return UComparisonsKt.m1207maxOfKr8caGY(b2, UComparisonsKt.m1207maxOfKr8caGY(b3, b4));
    }

    /* renamed from: maxOf-VKSA0NQ  reason: not valid java name */
    private static final short m1210maxOfVKSA0NQ(short s2, short s3, short s4) {
        return UComparisonsKt.m1205maxOf5PvTz6A(s2, UComparisonsKt.m1205maxOf5PvTz6A(s3, s4));
    }

    /* renamed from: maxOf-Md2H83M  reason: not valid java name */
    public static final int m1208maxOfMd2H83M(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i3 : other) {
            i2 = UComparisonsKt.m1206maxOfJ1ME1BU(i2, i3);
        }
        return i2;
    }

    /* renamed from: maxOf-R03FKyM  reason: not valid java name */
    public static final long m1209maxOfR03FKyM(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j2 = UComparisonsKt.m1214maxOfeb3DHEI(j2, j3);
        }
        return j2;
    }

    /* renamed from: maxOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1212maxOfWr6uiD8(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b3 : other) {
            b2 = UComparisonsKt.m1207maxOfKr8caGY(b2, b3);
        }
        return b2;
    }

    /* renamed from: maxOf-t1qELG4  reason: not valid java name */
    public static final short m1216maxOft1qELG4(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s3 : other) {
            s2 = UComparisonsKt.m1205maxOf5PvTz6A(s2, s3);
        }
        return s2;
    }

    /* renamed from: minOf-J1ME1BU  reason: not valid java name */
    public static final int m1218minOfJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3) <= 0 ? i2 : i3;
    }

    /* renamed from: minOf-eb3DHEI  reason: not valid java name */
    public static final long m1226minOfeb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3) <= 0 ? j2 : j3;
    }

    /* renamed from: minOf-Kr8caGY  reason: not valid java name */
    public static final byte m1219minOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b3 & UByte.MAX_VALUE) <= 0 ? b2 : b3;
    }

    /* renamed from: minOf-5PvTz6A  reason: not valid java name */
    public static final short m1217minOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & UShort.MAX_VALUE, 65535 & s3) <= 0 ? s2 : s3;
    }

    /* renamed from: minOf-WZ9TVnA  reason: not valid java name */
    private static final int m1223minOfWZ9TVnA(int i2, int i3, int i4) {
        return UComparisonsKt.m1218minOfJ1ME1BU(i2, UComparisonsKt.m1218minOfJ1ME1BU(i3, i4));
    }

    /* renamed from: minOf-sambcqE  reason: not valid java name */
    private static final long m1227minOfsambcqE(long j2, long j3, long j4) {
        return UComparisonsKt.m1226minOfeb3DHEI(j2, UComparisonsKt.m1226minOfeb3DHEI(j3, j4));
    }

    /* renamed from: minOf-b33U2AM  reason: not valid java name */
    private static final byte m1225minOfb33U2AM(byte b2, byte b3, byte b4) {
        return UComparisonsKt.m1219minOfKr8caGY(b2, UComparisonsKt.m1219minOfKr8caGY(b3, b4));
    }

    /* renamed from: minOf-VKSA0NQ  reason: not valid java name */
    private static final short m1222minOfVKSA0NQ(short s2, short s3, short s4) {
        return UComparisonsKt.m1217minOf5PvTz6A(s2, UComparisonsKt.m1217minOf5PvTz6A(s3, s4));
    }

    /* renamed from: minOf-Md2H83M  reason: not valid java name */
    public static final int m1220minOfMd2H83M(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i3 : other) {
            i2 = UComparisonsKt.m1218minOfJ1ME1BU(i2, i3);
        }
        return i2;
    }

    /* renamed from: minOf-R03FKyM  reason: not valid java name */
    public static final long m1221minOfR03FKyM(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j2 = UComparisonsKt.m1226minOfeb3DHEI(j2, j3);
        }
        return j2;
    }

    /* renamed from: minOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1224minOfWr6uiD8(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b3 : other) {
            b2 = UComparisonsKt.m1219minOfKr8caGY(b2, b3);
        }
        return b2;
    }

    /* renamed from: minOf-t1qELG4  reason: not valid java name */
    public static final short m1228minOft1qELG4(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s3 : other) {
            s2 = UComparisonsKt.m1217minOf5PvTz6A(s2, s3);
        }
        return s2;
    }
}