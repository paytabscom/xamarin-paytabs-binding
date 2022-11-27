package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    private static final int m469partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i4;
        byte m96getw2LRezQ = UByteArray.m96getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int m96getw2LRezQ2 = UByteArray.m96getw2LRezQ(bArr, i2) & UByte.MAX_VALUE;
                i4 = m96getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m96getw2LRezQ2, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UByteArray.m96getw2LRezQ(bArr, i3) & UByte.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                byte m96getw2LRezQ3 = UByteArray.m96getw2LRezQ(bArr, i2);
                UByteArray.m101setVurrAj0(bArr, i2, UByteArray.m96getw2LRezQ(bArr, i3));
                UByteArray.m101setVurrAj0(bArr, i3, m96getw2LRezQ3);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    private static final void m473quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int m469partition4UcCI2c = m469partition4UcCI2c(bArr, i2, i3);
        int i4 = m469partition4UcCI2c - 1;
        if (i2 < i4) {
            m473quickSort4UcCI2c(bArr, i2, i4);
        }
        if (m469partition4UcCI2c < i3) {
            m473quickSort4UcCI2c(bArr, m469partition4UcCI2c, i3);
        }
    }

    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    private static final int m470partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i4;
        short m356getMh2AYeg = UShortArray.m356getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int m356getMh2AYeg2 = UShortArray.m356getMh2AYeg(sArr, i2) & UShort.MAX_VALUE;
                i4 = m356getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m356getMh2AYeg2, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UShortArray.m356getMh2AYeg(sArr, i3) & UShort.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short m356getMh2AYeg3 = UShortArray.m356getMh2AYeg(sArr, i2);
                UShortArray.m361set01HTLdE(sArr, i2, UShortArray.m356getMh2AYeg(sArr, i3));
                UShortArray.m361set01HTLdE(sArr, i3, m356getMh2AYeg3);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    private static final void m474quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int m470partitionAa5vz7o = m470partitionAa5vz7o(sArr, i2, i3);
        int i4 = m470partitionAa5vz7o - 1;
        if (i2 < i4) {
            m474quickSortAa5vz7o(sArr, i2, i4);
        }
        if (m470partitionAa5vz7o < i3) {
            m474quickSortAa5vz7o(sArr, m470partitionAa5vz7o, i3);
        }
    }

    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    private static final int m471partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int m174getpVg5ArA = UIntArray.m174getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (UnsignedKt.uintCompare(UIntArray.m174getpVg5ArA(iArr, i2), m174getpVg5ArA) < 0) {
                i2++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m174getpVg5ArA(iArr, i3), m174getpVg5ArA) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int m174getpVg5ArA2 = UIntArray.m174getpVg5ArA(iArr, i2);
                UIntArray.m179setVXSXFK8(iArr, i2, UIntArray.m174getpVg5ArA(iArr, i3));
                UIntArray.m179setVXSXFK8(iArr, i3, m174getpVg5ArA2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    private static final void m475quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int m471partitionoBK06Vg = m471partitionoBK06Vg(iArr, i2, i3);
        int i4 = m471partitionoBK06Vg - 1;
        if (i2 < i4) {
            m475quickSortoBK06Vg(iArr, i2, i4);
        }
        if (m471partitionoBK06Vg < i3) {
            m475quickSortoBK06Vg(iArr, m471partitionoBK06Vg, i3);
        }
    }

    /* renamed from: partition--nroSd4  reason: not valid java name */
    private static final int m468partitionnroSd4(long[] jArr, int i2, int i3) {
        long m252getsVKNKU = ULongArray.m252getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (UnsignedKt.ulongCompare(ULongArray.m252getsVKNKU(jArr, i2), m252getsVKNKU) < 0) {
                i2++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m252getsVKNKU(jArr, i3), m252getsVKNKU) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long m252getsVKNKU2 = ULongArray.m252getsVKNKU(jArr, i2);
                ULongArray.m257setk8EXiF4(jArr, i2, ULongArray.m252getsVKNKU(jArr, i3));
                ULongArray.m257setk8EXiF4(jArr, i3, m252getsVKNKU2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    private static final void m472quickSortnroSd4(long[] jArr, int i2, int i3) {
        int m468partitionnroSd4 = m468partitionnroSd4(jArr, i2, i3);
        int i4 = m468partitionnroSd4 - 1;
        if (i2 < i4) {
            m472quickSortnroSd4(jArr, i2, i4);
        }
        if (m468partitionnroSd4 < i3) {
            m472quickSortnroSd4(jArr, m468partitionnroSd4, i3);
        }
    }

    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m477sortArray4UcCI2c(byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m473quickSort4UcCI2c(array, i2, i3 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m478sortArrayAa5vz7o(short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m474quickSortAa5vz7o(array, i2, i3 - 1);
    }

    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m479sortArrayoBK06Vg(int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m475quickSortoBK06Vg(array, i2, i3 - 1);
    }

    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m476sortArraynroSd4(long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m472quickSortnroSd4(array, i2, i3 - 1);
    }
}