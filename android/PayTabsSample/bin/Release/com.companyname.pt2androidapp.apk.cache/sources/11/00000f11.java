package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

/* compiled from: UByte.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u000fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0012J\u001b\u0010H\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0012J\u001b\u0010M\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\rH\u0087\b¢\u0006\u0004\b]\u0010-J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010\u0005J\u0016\u0010l\u001a\u00020\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010aJ\u0016\u0010p\u001a\u00020\u0016H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010eJ\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
@JvmInline
/* loaded from: classes.dex */
public final class UByte implements Comparable<UByte> {
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UByte m33boximpl(byte b2) {
        return new UByte(b2);
    }

    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private int m34compareTo7apg3OU(byte b2) {
        return m35compareTo7apg3OU(this.data, b2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static byte m39constructorimpl(byte b2) {
        return b2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m45equalsimpl(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).m88unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m46equalsimpl0(byte b2, byte b3) {
        return b2 == b3;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m51hashCodeimpl(byte b2) {
        return b2;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m76toByteimpl(byte b2) {
        return b2;
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m77toDoubleimpl(byte b2) {
        return b2 & MAX_VALUE;
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m78toFloatimpl(byte b2) {
        return b2 & MAX_VALUE;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m79toIntimpl(byte b2) {
        return b2 & MAX_VALUE;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m80toLongimpl(byte b2) {
        return b2 & 255;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m81toShortimpl(byte b2) {
        return (short) (b2 & 255);
    }

    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m83toUBytew2LRezQ(byte b2) {
        return b2;
    }

    public boolean equals(Object obj) {
        return m45equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m51hashCodeimpl(this.data);
    }

    public String toString() {
        return m82toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ byte m88unboximpl() {
        return this.data;
    }

    private /* synthetic */ UByte(byte b2) {
        this.data = b2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return m34compareTo7apg3OU(uByte.m88unboximpl());
    }

    /* compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static int m35compareTo7apg3OU(byte b2, byte b3) {
        return Intrinsics.compare(b2 & MAX_VALUE, b3 & MAX_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m38compareToxj2QHRw(byte b2, short s2) {
        return Intrinsics.compare(b2 & MAX_VALUE, s2 & UShort.MAX_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m37compareToWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.uintCompare(UInt.m115constructorimpl(b2 & MAX_VALUE), i2);
    }

    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m36compareToVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.ulongCompare(ULong.m193constructorimpl(b2 & 255), j2);
    }

    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m63plus7apg3OU(byte b2, byte b3) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) + UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m66plusxj2QHRw(byte b2, short s2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) + UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m65plusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) + i2);
    }

    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m64plusVKZWuLQ(byte b2, long j2) {
        return ULong.m193constructorimpl(ULong.m193constructorimpl(b2 & 255) + j2);
    }

    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m54minus7apg3OU(byte b2, byte b3) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) - UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m57minusxj2QHRw(byte b2, short s2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) - UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m56minusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) - i2);
    }

    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m55minusVKZWuLQ(byte b2, long j2) {
        return ULong.m193constructorimpl(ULong.m193constructorimpl(b2 & 255) - j2);
    }

    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m72times7apg3OU(byte b2, byte b3) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) * UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m75timesxj2QHRw(byte b2, short s2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) * UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m74timesWZ4Q5Ns(byte b2, int i2) {
        return UInt.m115constructorimpl(UInt.m115constructorimpl(b2 & MAX_VALUE) * i2);
    }

    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m73timesVKZWuLQ(byte b2, long j2) {
        return ULong.m193constructorimpl(ULong.m193constructorimpl(b2 & 255) * j2);
    }

    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m41div7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m44divxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m43divWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), i2);
    }

    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m42divVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m370ulongDivideeb3DHEI(ULong.m193constructorimpl(b2 & 255), j2);
    }

    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m68rem7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m71remxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m70remWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), i2);
    }

    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m69remVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m371ulongRemaindereb3DHEI(ULong.m193constructorimpl(b2 & 255), j2);
    }

    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m47floorDiv7apg3OU(byte b2, byte b3) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(b3 & MAX_VALUE));
    }

    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m50floorDivxj2QHRw(byte b2, short s2) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m49floorDivWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m368uintDivideJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), i2);
    }

    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m48floorDivVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m370ulongDivideeb3DHEI(ULong.m193constructorimpl(b2 & 255), j2);
    }

    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m58mod7apg3OU(byte b2, byte b3) {
        return m39constructorimpl((byte) UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(b3 & MAX_VALUE)));
    }

    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m61modxj2QHRw(byte b2, short s2) {
        return UShort.m299constructorimpl((short) UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(s2 & UShort.MAX_VALUE)));
    }

    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m60modWZ4Q5Ns(byte b2, int i2) {
        return UnsignedKt.m369uintRemainderJ1ME1BU(UInt.m115constructorimpl(b2 & MAX_VALUE), i2);
    }

    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m59modVKZWuLQ(byte b2, long j2) {
        return UnsignedKt.m371ulongRemaindereb3DHEI(ULong.m193constructorimpl(b2 & 255), j2);
    }

    /* renamed from: inc-w2LRezQ  reason: not valid java name */
    private static final byte m52incw2LRezQ(byte b2) {
        return m39constructorimpl((byte) (b2 + 1));
    }

    /* renamed from: dec-w2LRezQ  reason: not valid java name */
    private static final byte m40decw2LRezQ(byte b2) {
        return m39constructorimpl((byte) (b2 - 1));
    }

    /* renamed from: rangeTo-7apg3OU  reason: not valid java name */
    private static final UIntRange m67rangeTo7apg3OU(byte b2, byte b3) {
        return new UIntRange(UInt.m115constructorimpl(b2 & MAX_VALUE), UInt.m115constructorimpl(b3 & MAX_VALUE), null);
    }

    /* renamed from: and-7apg3OU  reason: not valid java name */
    private static final byte m32and7apg3OU(byte b2, byte b3) {
        return m39constructorimpl((byte) (b2 & b3));
    }

    /* renamed from: or-7apg3OU  reason: not valid java name */
    private static final byte m62or7apg3OU(byte b2, byte b3) {
        return m39constructorimpl((byte) (b2 | b3));
    }

    /* renamed from: xor-7apg3OU  reason: not valid java name */
    private static final byte m87xor7apg3OU(byte b2, byte b3) {
        return m39constructorimpl((byte) (b2 ^ b3));
    }

    /* renamed from: inv-w2LRezQ  reason: not valid java name */
    private static final byte m53invw2LRezQ(byte b2) {
        return m39constructorimpl((byte) (~b2));
    }

    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m86toUShortMh2AYeg(byte b2) {
        return UShort.m299constructorimpl((short) (b2 & 255));
    }

    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m84toUIntpVg5ArA(byte b2) {
        return UInt.m115constructorimpl(b2 & MAX_VALUE);
    }

    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m85toULongsVKNKU(byte b2) {
        return ULong.m193constructorimpl(b2 & 255);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m82toStringimpl(byte b2) {
        return String.valueOf(b2 & MAX_VALUE);
    }
}