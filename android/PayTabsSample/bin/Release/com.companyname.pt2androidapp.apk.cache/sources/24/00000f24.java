package kotlin;

/* compiled from: UNumbers.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\r\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u001a\u001f\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001b\u001a\u001f\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u001f\u001a\u001f\u0010\"\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010!\u001a\u0017\u0010'\u001a\u00020\u0002*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010'\u001a\u00020\u0005*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0007\u001a\u0017\u0010'\u001a\u00020\b*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010'\u001a\u00020\u000b*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u0002*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010)\u001a\u0017\u0010/\u001a\u00020\u0005*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0007\u001a\u0017\u0010/\u001a\u00020\b*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u0010,\u001a\u0017\u0010/\u001a\u00020\u000b*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"countLeadingZeroBits", "", "Lkotlin/UByte;", "countLeadingZeroBits-7apg3OU", "(B)I", "Lkotlin/UInt;", "countLeadingZeroBits-WZ4Q5Ns", "(I)I", "Lkotlin/ULong;", "countLeadingZeroBits-VKZWuLQ", "(J)I", "Lkotlin/UShort;", "countLeadingZeroBits-xj2QHRw", "(S)I", "countOneBits", "countOneBits-7apg3OU", "countOneBits-WZ4Q5Ns", "countOneBits-VKZWuLQ", "countOneBits-xj2QHRw", "countTrailingZeroBits", "countTrailingZeroBits-7apg3OU", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits-VKZWuLQ", "countTrailingZeroBits-xj2QHRw", "rotateLeft", "bitCount", "rotateLeft-LxnNnR4", "(BI)B", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft-JSWoG40", "(JI)J", "rotateLeft-olVBNx4", "(SI)S", "rotateRight", "rotateRight-LxnNnR4", "rotateRight-V7xB4Y4", "rotateRight-JSWoG40", "rotateRight-olVBNx4", "takeHighestOneBit", "takeHighestOneBit-7apg3OU", "(B)B", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit", "takeLowestOneBit-7apg3OU", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit-VKZWuLQ", "takeLowestOneBit-xj2QHRw", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UNumbersKt {
    /* renamed from: countOneBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m270countOneBitsWZ4Q5Ns(int i2) {
        return Integer.bitCount(i2);
    }

    /* renamed from: countLeadingZeroBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m266countLeadingZeroBitsWZ4Q5Ns(int i2) {
        return Integer.numberOfLeadingZeros(i2);
    }

    /* renamed from: countTrailingZeroBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m274countTrailingZeroBitsWZ4Q5Ns(int i2) {
        return Integer.numberOfTrailingZeros(i2);
    }

    /* renamed from: takeHighestOneBit-WZ4Q5Ns  reason: not valid java name */
    private static final int m286takeHighestOneBitWZ4Q5Ns(int i2) {
        return UInt.m115constructorimpl(Integer.highestOneBit(i2));
    }

    /* renamed from: takeLowestOneBit-WZ4Q5Ns  reason: not valid java name */
    private static final int m290takeLowestOneBitWZ4Q5Ns(int i2) {
        return UInt.m115constructorimpl(Integer.lowestOneBit(i2));
    }

    /* renamed from: rotateLeft-V7xB4Y4  reason: not valid java name */
    private static final int m278rotateLeftV7xB4Y4(int i2, int i3) {
        return UInt.m115constructorimpl(Integer.rotateLeft(i2, i3));
    }

    /* renamed from: rotateRight-V7xB4Y4  reason: not valid java name */
    private static final int m282rotateRightV7xB4Y4(int i2, int i3) {
        return UInt.m115constructorimpl(Integer.rotateRight(i2, i3));
    }

    /* renamed from: countOneBits-VKZWuLQ  reason: not valid java name */
    private static final int m269countOneBitsVKZWuLQ(long j2) {
        return Long.bitCount(j2);
    }

    /* renamed from: countLeadingZeroBits-VKZWuLQ  reason: not valid java name */
    private static final int m265countLeadingZeroBitsVKZWuLQ(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    /* renamed from: countTrailingZeroBits-VKZWuLQ  reason: not valid java name */
    private static final int m273countTrailingZeroBitsVKZWuLQ(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    /* renamed from: takeHighestOneBit-VKZWuLQ  reason: not valid java name */
    private static final long m285takeHighestOneBitVKZWuLQ(long j2) {
        return ULong.m193constructorimpl(Long.highestOneBit(j2));
    }

    /* renamed from: takeLowestOneBit-VKZWuLQ  reason: not valid java name */
    private static final long m289takeLowestOneBitVKZWuLQ(long j2) {
        return ULong.m193constructorimpl(Long.lowestOneBit(j2));
    }

    /* renamed from: rotateLeft-JSWoG40  reason: not valid java name */
    private static final long m276rotateLeftJSWoG40(long j2, int i2) {
        return ULong.m193constructorimpl(Long.rotateLeft(j2, i2));
    }

    /* renamed from: rotateRight-JSWoG40  reason: not valid java name */
    private static final long m280rotateRightJSWoG40(long j2, int i2) {
        return ULong.m193constructorimpl(Long.rotateRight(j2, i2));
    }

    /* renamed from: countOneBits-7apg3OU  reason: not valid java name */
    private static final int m268countOneBits7apg3OU(byte b2) {
        return Integer.bitCount(UInt.m115constructorimpl(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: countLeadingZeroBits-7apg3OU  reason: not valid java name */
    private static final int m264countLeadingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfLeadingZeros(b2 & UByte.MAX_VALUE) - 24;
    }

    /* renamed from: countTrailingZeroBits-7apg3OU  reason: not valid java name */
    private static final int m272countTrailingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfTrailingZeros(b2 | UByte.MIN_VALUE);
    }

    /* renamed from: takeHighestOneBit-7apg3OU  reason: not valid java name */
    private static final byte m284takeHighestOneBit7apg3OU(byte b2) {
        return UByte.m39constructorimpl((byte) Integer.highestOneBit(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: takeLowestOneBit-7apg3OU  reason: not valid java name */
    private static final byte m288takeLowestOneBit7apg3OU(byte b2) {
        return UByte.m39constructorimpl((byte) Integer.lowestOneBit(b2 & UByte.MAX_VALUE));
    }

    /* renamed from: rotateLeft-LxnNnR4  reason: not valid java name */
    private static final byte m277rotateLeftLxnNnR4(byte b2, int i2) {
        return UByte.m39constructorimpl(NumbersKt.rotateLeft(b2, i2));
    }

    /* renamed from: rotateRight-LxnNnR4  reason: not valid java name */
    private static final byte m281rotateRightLxnNnR4(byte b2, int i2) {
        return UByte.m39constructorimpl(NumbersKt.rotateRight(b2, i2));
    }

    /* renamed from: countOneBits-xj2QHRw  reason: not valid java name */
    private static final int m271countOneBitsxj2QHRw(short s2) {
        return Integer.bitCount(UInt.m115constructorimpl(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: countLeadingZeroBits-xj2QHRw  reason: not valid java name */
    private static final int m267countLeadingZeroBitsxj2QHRw(short s2) {
        return Integer.numberOfLeadingZeros(s2 & UShort.MAX_VALUE) - 16;
    }

    /* renamed from: countTrailingZeroBits-xj2QHRw  reason: not valid java name */
    private static final int m275countTrailingZeroBitsxj2QHRw(short s2) {
        return Integer.numberOfTrailingZeros(s2 | UShort.MIN_VALUE);
    }

    /* renamed from: takeHighestOneBit-xj2QHRw  reason: not valid java name */
    private static final short m287takeHighestOneBitxj2QHRw(short s2) {
        return UShort.m299constructorimpl((short) Integer.highestOneBit(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: takeLowestOneBit-xj2QHRw  reason: not valid java name */
    private static final short m291takeLowestOneBitxj2QHRw(short s2) {
        return UShort.m299constructorimpl((short) Integer.lowestOneBit(s2 & UShort.MAX_VALUE));
    }

    /* renamed from: rotateLeft-olVBNx4  reason: not valid java name */
    private static final short m279rotateLeftolVBNx4(short s2, int i2) {
        return UShort.m299constructorimpl(NumbersKt.rotateLeft(s2, i2));
    }

    /* renamed from: rotateRight-olVBNx4  reason: not valid java name */
    private static final short m283rotateRightolVBNx4(short s2, int i2) {
        return UShort.m299constructorimpl(NumbersKt.rotateRight(s2, i2));
    }
}