package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001f\u00101\u001a\u00020\u0007*\u00020\b2\u0006\u00102\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00101\u001a\u00020\u0007*\u00020\u00052\u0006\u00102\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a \u00107\u001a\u00020\u0007*\u00020\b2\n\u00108\u001a\u000609j\u0002`:H\u0007ø\u0001\u0000¢\u0006\u0002\u0010;\u001a \u00107\u001a\u00020\u0007*\u00020\u00052\n\u00108\u001a\u000609j\u0002`:H\u0007ø\u0001\u0000¢\u0006\u0002\u0010<\u001a \u00107\u001a\u00020\u0007*\u00020\u00012\n\u00108\u001a\u000609j\u0002`:H\u0007ø\u0001\u0000¢\u0006\u0002\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "(DLjava/util/concurrent/TimeUnit;)J", "(ILjava/util/concurrent/TimeUnit;)J", "(JLjava/util/concurrent/TimeUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long j2, int i2) {
        return durationOf(j2, i2);
    }

    public static final /* synthetic */ long access$durationOfMillis(long j2) {
        return durationOfMillis(j2);
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long j2) {
        return durationOfMillisNormalized(j2);
    }

    public static final /* synthetic */ long access$durationOfNanos(long j2) {
        return durationOfNanos(j2);
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long j2) {
        return durationOfNanosNormalized(j2);
    }

    public static final /* synthetic */ long access$millisToNanos(long j2) {
        return millisToNanos(j2);
    }

    public static final /* synthetic */ long access$nanosToMillis(long j2) {
        return nanosToMillis(j2);
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getDays$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getDays$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getDays$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getHours$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getHours$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getHours$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMicroseconds$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMicroseconds$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMicroseconds$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMilliseconds$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMilliseconds$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMilliseconds$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMinutes$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMinutes$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getMinutes$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getNanoseconds$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getNanoseconds$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getNanoseconds$annotations(long j2) {
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getSeconds$annotations(double d2) {
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getSeconds$annotations(int i2) {
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static /* synthetic */ void getSeconds$annotations(long j2) {
    }

    public static final long millisToNanos(long j2) {
        return j2 * ((long) NANOS_IN_MILLIS);
    }

    public static final long toDuration(int i2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(TimeUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(i2, unit, TimeUnit.NANOSECONDS));
        }
        return toDuration(i2, unit);
    }

    public static final long toDuration(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long convertDurationUnitOverflow = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, TimeUnit.NANOSECONDS, unit);
        if ((-convertDurationUnitOverflow) <= j2 && convertDurationUnitOverflow >= j2) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(j2, unit, TimeUnit.NANOSECONDS));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(j2, unit, TimeUnit.MILLISECONDS), -4611686018427387903L, (long) MAX_MILLIS));
    }

    public static final long toDuration(double d2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt.convertDurationUnit(d2, unit, TimeUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long j2 = (long) convertDurationUnit;
            if (-4611686018426999999L <= j2 && MAX_NANOS >= j2) {
                return durationOfNanos(j2);
            }
            return durationOfMillisNormalized((long) DurationUnitKt.convertDurationUnit(d2, unit, TimeUnit.MILLISECONDS));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long getNanoseconds(int i2) {
        return toDuration(i2, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(long j2) {
        return toDuration(j2, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(double d2) {
        return toDuration(d2, TimeUnit.NANOSECONDS);
    }

    public static final long getMicroseconds(int i2) {
        return toDuration(i2, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(long j2) {
        return toDuration(j2, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(double d2) {
        return toDuration(d2, TimeUnit.MICROSECONDS);
    }

    public static final long getMilliseconds(int i2) {
        return toDuration(i2, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(long j2) {
        return toDuration(j2, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(double d2) {
        return toDuration(d2, TimeUnit.MILLISECONDS);
    }

    public static final long getSeconds(int i2) {
        return toDuration(i2, TimeUnit.SECONDS);
    }

    public static final long getSeconds(long j2) {
        return toDuration(j2, TimeUnit.SECONDS);
    }

    public static final long getSeconds(double d2) {
        return toDuration(d2, TimeUnit.SECONDS);
    }

    public static final long getMinutes(int i2) {
        return toDuration(i2, TimeUnit.MINUTES);
    }

    public static final long getMinutes(long j2) {
        return toDuration(j2, TimeUnit.MINUTES);
    }

    public static final long getMinutes(double d2) {
        return toDuration(d2, TimeUnit.MINUTES);
    }

    public static final long getHours(int i2) {
        return toDuration(i2, TimeUnit.HOURS);
    }

    public static final long getHours(long j2) {
        return toDuration(j2, TimeUnit.HOURS);
    }

    public static final long getHours(double d2) {
        return toDuration(d2, TimeUnit.HOURS);
    }

    public static final long getDays(int i2) {
        return toDuration(i2, TimeUnit.DAYS);
    }

    public static final long getDays(long j2) {
        return toDuration(j2, TimeUnit.DAYS);
    }

    public static final long getDays(double d2) {
        return toDuration(d2, TimeUnit.DAYS);
    }

    /* renamed from: times-mvk6XK0 */
    private static final long m1386timesmvk6XK0(int i2, long j2) {
        return Duration.m1344timesUwyO8pc(j2, i2);
    }

    /* renamed from: times-kIfJnKk */
    private static final long m1385timeskIfJnKk(double d2, long j2) {
        return Duration.m1343timesUwyO8pc(j2, d2);
    }

    public static final long nanosToMillis(long j2) {
        return j2 / ((long) NANOS_IN_MILLIS);
    }

    public static final long durationOfNanos(long j2) {
        return Duration.m1305constructorimpl(j2 << 1);
    }

    public static final long durationOfMillis(long j2) {
        return Duration.m1305constructorimpl((j2 << 1) + 1);
    }

    public static final long durationOf(long j2, int i2) {
        return Duration.m1305constructorimpl((j2 << 1) + i2);
    }

    public static final long durationOfNanosNormalized(long j2) {
        if (-4611686018426999999L <= j2 && MAX_NANOS >= j2) {
            return durationOfNanos(j2);
        }
        return durationOfMillis(nanosToMillis(j2));
    }

    public static final long durationOfMillisNormalized(long j2) {
        if (-4611686018426L <= j2 && MAX_NANOS_IN_MILLIS >= j2) {
            return durationOfNanos(millisToNanos(j2));
        }
        return durationOfMillis(RangesKt.coerceIn(j2, -4611686018427387903L, (long) MAX_MILLIS));
    }
}