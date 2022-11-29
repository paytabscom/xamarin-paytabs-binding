package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: UnsignedUtils.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UnsignedKt {
    public static final double uintToDouble(int i2) {
        return (Integer.MAX_VALUE & i2) + (((i2 >>> 31) << 30) * 2);
    }

    public static final int ulongCompare(long j2, long j3) {
        return ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE) ? 1 : ((j2 ^ Long.MIN_VALUE) == (j3 ^ Long.MIN_VALUE) ? 0 : -1));
    }

    public static final double ulongToDouble(long j2) {
        return ((j2 >>> 11) * 2048) + (j2 & 2047);
    }

    public static final int uintCompare(int i2, int i3) {
        return Intrinsics.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    /* renamed from: uintDivide-J1ME1BU  reason: not valid java name */
    public static final int m389uintDivideJ1ME1BU(int i2, int i3) {
        return UInt.m136constructorimpl((int) ((i2 & 4294967295L) / (i3 & 4294967295L)));
    }

    /* renamed from: uintRemainder-J1ME1BU  reason: not valid java name */
    public static final int m390uintRemainderJ1ME1BU(int i2, int i3) {
        return UInt.m136constructorimpl((int) ((i2 & 4294967295L) % (i3 & 4294967295L)));
    }

    /* renamed from: ulongDivide-eb3DHEI  reason: not valid java name */
    public static final long m391ulongDivideeb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return ulongCompare(j2, j3) < 0 ? ULong.m214constructorimpl(0L) : ULong.m214constructorimpl(1L);
        } else if (j2 >= 0) {
            return ULong.m214constructorimpl(j2 / j3);
        } else {
            long j4 = ((j2 >>> 1) / j3) << 1;
            return ULong.m214constructorimpl(j4 + (ulongCompare(ULong.m214constructorimpl(j2 - (j4 * j3)), ULong.m214constructorimpl(j3)) < 0 ? 0 : 1));
        }
    }

    /* renamed from: ulongRemainder-eb3DHEI  reason: not valid java name */
    public static final long m392ulongRemaindereb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return ulongCompare(j2, j3) < 0 ? j2 : ULong.m214constructorimpl(j2 - j3);
        } else if (j2 >= 0) {
            return ULong.m214constructorimpl(j2 % j3);
        } else {
            long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
            if (ulongCompare(ULong.m214constructorimpl(j4), ULong.m214constructorimpl(j3)) < 0) {
                j3 = 0;
            }
            return ULong.m214constructorimpl(j4 - j3);
        }
    }

    public static final int doubleToUInt(double d2) {
        if (!Double.isNaN(d2) && d2 > uintToDouble(0)) {
            if (d2 >= uintToDouble(-1)) {
                return -1;
            }
            double d3 = Integer.MAX_VALUE;
            if (d2 <= d3) {
                return UInt.m136constructorimpl((int) d2);
            }
            return UInt.m136constructorimpl(UInt.m136constructorimpl((int) (d2 - d3)) + UInt.m136constructorimpl(Integer.MAX_VALUE));
        }
        return 0;
    }

    public static final long doubleToULong(double d2) {
        if (!Double.isNaN(d2) && d2 > ulongToDouble(0L)) {
            if (d2 >= ulongToDouble(-1L)) {
                return -1L;
            }
            if (d2 < Long.MAX_VALUE) {
                return ULong.m214constructorimpl((long) d2);
            }
            return ULong.m214constructorimpl(ULong.m214constructorimpl((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return 0L;
    }

    public static final String ulongToString(long j2) {
        return ulongToString(j2, 10);
    }

    public static final String ulongToString(long j2, int i2) {
        if (j2 >= 0) {
            String l2 = Long.toString(j2, CharsKt.checkRadix(i2));
            Intrinsics.checkNotNullExpressionValue(l2, "java.lang.Long.toString(this, checkRadix(radix))");
            return l2;
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        String l3 = Long.toString(j4, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(l3, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l3);
        String l4 = Long.toString(j5, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(l4, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l4);
        return sb.toString();
    }
}