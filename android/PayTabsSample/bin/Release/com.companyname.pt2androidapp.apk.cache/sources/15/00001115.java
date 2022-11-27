package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "fastLog2", "value", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class RandomKt {
    public static final int takeUpperBits(int i2, int i3) {
        return (i2 >>> (32 - i3)) & ((-i3) >> 31);
    }

    public static final Random Random(int i2) {
        return new XorWowRandom(i2, i2 >> 31);
    }

    public static final Random Random(long j2) {
        return new XorWowRandom((int) j2, (int) (j2 >> 32));
    }

    public static final int nextInt(Random nextInt, IntRange range) {
        Intrinsics.checkNotNullParameter(nextInt, "$this$nextInt");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? nextInt.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? nextInt.nextInt(range.getFirst() - 1, range.getLast()) + 1 : nextInt.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextLong(Random nextLong, LongRange range) {
        Intrinsics.checkNotNullParameter(nextLong, "$this$nextLong");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < LongCompanionObject.MAX_VALUE ? nextLong.nextLong(range.getFirst(), range.getLast() + 1) : range.getFirst() > Long.MIN_VALUE ? nextLong.nextLong(range.getFirst() - 1, range.getLast()) + 1 : nextLong.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int fastLog2(int i2) {
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static final void checkRangeBounds(int i2, int i3) {
        if (!(i3 > i2)) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i2), Integer.valueOf(i3)).toString());
        }
    }

    public static final void checkRangeBounds(long j2, long j3) {
        if (!(j3 > j2)) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j2), Long.valueOf(j3)).toString());
        }
    }

    public static final void checkRangeBounds(double d2, double d3) {
        if (!(d3 > d2)) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d2), Double.valueOf(d3)).toString());
        }
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }
}