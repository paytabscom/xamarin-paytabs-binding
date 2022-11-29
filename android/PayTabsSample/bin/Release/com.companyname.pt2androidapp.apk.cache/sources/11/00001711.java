package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: _URanges.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010C\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010C\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010C\u001a\u00020\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\f\u0010J\u001a\u000208*\u000208H\u0007\u001a\f\u0010J\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010K\u001a\u000208*\u0002082\u0006\u0010K\u001a\u00020LH\u0087\u0004\u001a\u0015\u0010K\u001a\u00020>*\u00020>2\u0006\u0010K\u001a\u00020MH\u0087\u0004\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001f\u0010N\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010N\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes.dex */
class URangesKt___URangesKt {
    private static final int random(UIntRange uIntRange) {
        return URangesKt.random(uIntRange, Random.Default);
    }

    private static final long random(ULongRange uLongRange) {
        return URangesKt.random(uLongRange, Random.Default);
    }

    public static final int random(UIntRange random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return URandomKt.nextUInt(random2, random);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final long random(ULongRange random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return URandomKt.nextULong(random2, random);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final UInt randomOrNull(UIntRange uIntRange) {
        return URangesKt.randomOrNull(uIntRange, Random.Default);
    }

    private static final ULong randomOrNull(ULongRange uLongRange) {
        return URangesKt.randomOrNull(uLongRange, Random.Default);
    }

    public static final UInt randomOrNull(UIntRange randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return UInt.m130boximpl(URandomKt.nextUInt(random, randomOrNull));
    }

    public static final ULong randomOrNull(ULongRange randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return ULong.m208boximpl(URandomKt.nextULong(random, randomOrNull));
    }

    /* renamed from: contains-biwQdVI  reason: not valid java name */
    private static final boolean m1278containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m1250containsWZ4Q5Ns(uInt.m187unboximpl());
    }

    /* renamed from: contains-GYNo2lE  reason: not valid java name */
    private static final boolean m1274containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m1256containsVKZWuLQ(uLong.m265unboximpl());
    }

    /* renamed from: contains-68kG9v0  reason: not valid java name */
    public static final boolean m1273contains68kG9v0(UIntRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1250containsWZ4Q5Ns(UInt.m136constructorimpl(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: contains-ULb-yJY  reason: not valid java name */
    public static final boolean m1276containsULbyJY(ULongRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1256containsVKZWuLQ(ULong.m214constructorimpl(b2 & 255));
    }

    /* renamed from: contains-Gab390E  reason: not valid java name */
    public static final boolean m1275containsGab390E(ULongRange contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1256containsVKZWuLQ(ULong.m214constructorimpl(i2 & 4294967295L));
    }

    /* renamed from: contains-fz5IDCE  reason: not valid java name */
    public static final boolean m1279containsfz5IDCE(UIntRange contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m214constructorimpl(j2 >>> 32) == 0 && contains.m1250containsWZ4Q5Ns(UInt.m136constructorimpl((int) j2));
    }

    /* renamed from: contains-ZsK3CEQ  reason: not valid java name */
    public static final boolean m1277containsZsK3CEQ(UIntRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1250containsWZ4Q5Ns(UInt.m136constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: contains-uhHAxoY  reason: not valid java name */
    public static final boolean m1280containsuhHAxoY(ULongRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1256containsVKZWuLQ(ULong.m214constructorimpl(s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: downTo-Kr8caGY  reason: not valid java name */
    public static final UIntProgression m1283downToKr8caGY(byte b2, byte b3) {
        return UIntProgression.Companion.m1249fromClosedRangeNkh28Cs(UInt.m136constructorimpl(b2 & UByte.MAX_VALUE), UInt.m136constructorimpl(b3 & UByte.MAX_VALUE), -1);
    }

    /* renamed from: downTo-J1ME1BU  reason: not valid java name */
    public static final UIntProgression m1282downToJ1ME1BU(int i2, int i3) {
        return UIntProgression.Companion.m1249fromClosedRangeNkh28Cs(i2, i3, -1);
    }

    /* renamed from: downTo-eb3DHEI  reason: not valid java name */
    public static final ULongProgression m1284downToeb3DHEI(long j2, long j3) {
        return ULongProgression.Companion.m1255fromClosedRange7ftBX0g(j2, j3, -1L);
    }

    /* renamed from: downTo-5PvTz6A  reason: not valid java name */
    public static final UIntProgression m1281downTo5PvTz6A(short s2, short s3) {
        return UIntProgression.Companion.m1249fromClosedRangeNkh28Cs(UInt.m136constructorimpl(s2 & UShort.MAX_VALUE), UInt.m136constructorimpl(s3 & UShort.MAX_VALUE), -1);
    }

    public static final UIntProgression reversed(UIntProgression reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return UIntProgression.Companion.m1249fromClosedRangeNkh28Cs(reversed.m1248getLastpVg5ArA(), reversed.m1247getFirstpVg5ArA(), -reversed.getStep());
    }

    public static final ULongProgression reversed(ULongProgression reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return ULongProgression.Companion.m1255fromClosedRange7ftBX0g(reversed.m1254getLastsVKNKU(), reversed.m1253getFirstsVKNKU(), -reversed.getStep());
    }

    public static final UIntProgression step(UIntProgression step, int i2) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        UIntProgression.Companion companion = UIntProgression.Companion;
        int m1247getFirstpVg5ArA = step.m1247getFirstpVg5ArA();
        int m1248getLastpVg5ArA = step.m1248getLastpVg5ArA();
        if (step.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.m1249fromClosedRangeNkh28Cs(m1247getFirstpVg5ArA, m1248getLastpVg5ArA, i2);
    }

    public static final ULongProgression step(ULongProgression step, long j2) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        RangesKt.checkStepIsPositive(j2 > 0, Long.valueOf(j2));
        ULongProgression.Companion companion = ULongProgression.Companion;
        long m1253getFirstsVKNKU = step.m1253getFirstsVKNKU();
        long m1254getLastsVKNKU = step.m1254getLastsVKNKU();
        if (step.getStep() <= 0) {
            j2 = -j2;
        }
        return companion.m1255fromClosedRange7ftBX0g(m1253getFirstsVKNKU, m1254getLastsVKNKU, j2);
    }

    /* renamed from: until-Kr8caGY  reason: not valid java name */
    public static final UIntRange m1287untilKr8caGY(byte b2, byte b3) {
        int i2 = b3 & UByte.MAX_VALUE;
        return Intrinsics.compare(i2, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m136constructorimpl(b2 & UByte.MAX_VALUE), UInt.m136constructorimpl(UInt.m136constructorimpl(i2) - 1), null);
    }

    /* renamed from: until-J1ME1BU  reason: not valid java name */
    public static final UIntRange m1286untilJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i3, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(i2, UInt.m136constructorimpl(i3 - 1), null);
    }

    /* renamed from: until-eb3DHEI  reason: not valid java name */
    public static final ULongRange m1288untileb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j3, 0L) <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange(j2, ULong.m214constructorimpl(j3 - ULong.m214constructorimpl(1 & 4294967295L)), null);
    }

    /* renamed from: until-5PvTz6A  reason: not valid java name */
    public static final UIntRange m1285until5PvTz6A(short s2, short s3) {
        int i2 = s3 & UShort.MAX_VALUE;
        return Intrinsics.compare(i2, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m136constructorimpl(s2 & UShort.MAX_VALUE), UInt.m136constructorimpl(UInt.m136constructorimpl(i2) - 1), null);
    }

    /* renamed from: coerceAtLeast-J1ME1BU  reason: not valid java name */
    public static final int m1260coerceAtLeastJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3) < 0 ? i3 : i2;
    }

    /* renamed from: coerceAtLeast-eb3DHEI  reason: not valid java name */
    public static final long m1262coerceAtLeasteb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3) < 0 ? j3 : j2;
    }

    /* renamed from: coerceAtLeast-Kr8caGY  reason: not valid java name */
    public static final byte m1261coerceAtLeastKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b3 & UByte.MAX_VALUE) < 0 ? b3 : b2;
    }

    /* renamed from: coerceAtLeast-5PvTz6A  reason: not valid java name */
    public static final short m1259coerceAtLeast5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & UShort.MAX_VALUE, 65535 & s3) < 0 ? s3 : s2;
    }

    /* renamed from: coerceAtMost-J1ME1BU  reason: not valid java name */
    public static final int m1264coerceAtMostJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3) > 0 ? i3 : i2;
    }

    /* renamed from: coerceAtMost-eb3DHEI  reason: not valid java name */
    public static final long m1266coerceAtMosteb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3) > 0 ? j3 : j2;
    }

    /* renamed from: coerceAtMost-Kr8caGY  reason: not valid java name */
    public static final byte m1265coerceAtMostKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b3 & UByte.MAX_VALUE) > 0 ? b3 : b2;
    }

    /* renamed from: coerceAtMost-5PvTz6A  reason: not valid java name */
    public static final short m1263coerceAtMost5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & UShort.MAX_VALUE, 65535 & s3) > 0 ? s3 : s2;
    }

    /* renamed from: coerceIn-WZ9TVnA  reason: not valid java name */
    public static final int m1269coerceInWZ9TVnA(int i2, int i3, int i4) {
        if (UnsignedKt.uintCompare(i3, i4) <= 0) {
            return UnsignedKt.uintCompare(i2, i3) < 0 ? i3 : UnsignedKt.uintCompare(i2, i4) > 0 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UInt.m181toStringimpl(i4) + " is less than minimum " + UInt.m181toStringimpl(i3) + '.');
    }

    /* renamed from: coerceIn-sambcqE  reason: not valid java name */
    public static final long m1271coerceInsambcqE(long j2, long j3, long j4) {
        if (UnsignedKt.ulongCompare(j3, j4) <= 0) {
            return UnsignedKt.ulongCompare(j2, j3) < 0 ? j3 : UnsignedKt.ulongCompare(j2, j4) > 0 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ULong.m259toStringimpl(j4) + " is less than minimum " + ULong.m259toStringimpl(j3) + '.');
    }

    /* renamed from: coerceIn-b33U2AM  reason: not valid java name */
    public static final byte m1270coerceInb33U2AM(byte b2, byte b3, byte b4) {
        int i2 = b3 & UByte.MAX_VALUE;
        int i3 = b4 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i2, i3) <= 0) {
            int i4 = b2 & UByte.MAX_VALUE;
            return Intrinsics.compare(i4, i2) < 0 ? b3 : Intrinsics.compare(i4, i3) > 0 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UByte.m103toStringimpl(b4) + " is less than minimum " + UByte.m103toStringimpl(b3) + '.');
    }

    /* renamed from: coerceIn-VKSA0NQ  reason: not valid java name */
    public static final short m1268coerceInVKSA0NQ(short s2, short s3, short s4) {
        int i2 = s3 & UShort.MAX_VALUE;
        int i3 = s4 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i2, i3) <= 0) {
            int i4 = 65535 & s2;
            return Intrinsics.compare(i4, i2) < 0 ? s3 : Intrinsics.compare(i4, i3) > 0 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UShort.m363toStringimpl(s4) + " is less than minimum " + UShort.m363toStringimpl(s3) + '.');
    }

    /* renamed from: coerceIn-wuiCnnA  reason: not valid java name */
    public static final int m1272coerceInwuiCnnA(int i2, ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt.coerceIn(UInt.m130boximpl(i2), (ClosedFloatingPointRange<UInt>) range)).m187unboximpl();
        }
        if (!range.isEmpty()) {
            return UnsignedKt.uintCompare(i2, range.getStart().m187unboximpl()) < 0 ? range.getStart().m187unboximpl() : UnsignedKt.uintCompare(i2, range.getEndInclusive().m187unboximpl()) > 0 ? range.getEndInclusive().m187unboximpl() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: coerceIn-JPwROB0  reason: not valid java name */
    public static final long m1267coerceInJPwROB0(long j2, ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt.coerceIn(ULong.m208boximpl(j2), (ClosedFloatingPointRange<ULong>) range)).m265unboximpl();
        }
        if (!range.isEmpty()) {
            return UnsignedKt.ulongCompare(j2, range.getStart().m265unboximpl()) < 0 ? range.getStart().m265unboximpl() : UnsignedKt.ulongCompare(j2, range.getEndInclusive().m265unboximpl()) > 0 ? range.getEndInclusive().m265unboximpl() : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}