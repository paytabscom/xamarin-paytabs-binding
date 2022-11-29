package okio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utf8.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i2) {
        return (i2 >= 0 && 31 >= i2) || (127 <= i2 && 159 >= i2);
    }

    public static final boolean isUtf8Continuation(byte b2) {
        return (b2 & 192) == 128;
    }

    public static final long size(String str) {
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i2) {
        return size$default(str, i2, 0, 2, null);
    }

    public static /* synthetic */ long size$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return size(str, i2, i3);
    }

    public static final long size(String utf8Size, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(utf8Size, "$this$utf8Size");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= utf8Size.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + utf8Size.length()).toString());
        }
        long j2 = 0;
        while (i2 < i3) {
            char charAt = utf8Size.charAt(i2);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i4 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i4 = 3;
                } else {
                    int i5 = i2 + 1;
                    char charAt2 = i5 < i3 ? utf8Size.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i2 = i5;
                    } else {
                        j2 += 4;
                        i2 += 2;
                    }
                }
                j2 += i4;
            }
            i2++;
        }
        return j2;
    }

    public static final void processUtf8Bytes(String processUtf8Bytes, int i2, int i3, Function1<? super Byte, Unit> yield) {
        int i4;
        char charAt;
        Intrinsics.checkNotNullParameter(processUtf8Bytes, "$this$processUtf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i2 < i3) {
            char charAt2 = processUtf8Bytes.charAt(i2);
            if (Intrinsics.compare((int) charAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) charAt2));
                i2++;
                while (i2 < i3 && Intrinsics.compare((int) processUtf8Bytes.charAt(i2), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i2)));
                    i2++;
                }
            } else {
                if (Intrinsics.compare((int) charAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) charAt2, 56319) > 0 || i3 <= (i4 = i2 + 1) || 56320 > (charAt = processUtf8Bytes.charAt(i4)) || 57343 < charAt) {
                    yield.invoke(Byte.valueOf((byte) REPLACEMENT_BYTE));
                } else {
                    int charAt3 = ((charAt2 << '\n') + processUtf8Bytes.charAt(i4)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i2 += 2;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(byte[] r16, int r17, int r18, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(byte[] r16, int r17, int r18, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    public static final int process2Utf8Bytes(byte[] process2Utf8Bytes, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process2Utf8Bytes, "$this$process2Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 1;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b2 = process2Utf8Bytes[i2];
        byte b3 = process2Utf8Bytes[i4];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        int i5 = (b3 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6);
        if (i5 < 128) {
            yield.invoke(valueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i5));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] process3Utf8Bytes, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process3Utf8Bytes, "$this$process3Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 2;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(valueOf);
            int i5 = i2 + 1;
            if (i3 > i5) {
                if ((process3Utf8Bytes[i5] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = process3Utf8Bytes[i2];
        byte b3 = process3Utf8Bytes[i2 + 1];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b4 = process3Utf8Bytes[i4];
        if (!((b4 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        int i6 = ((b4 ^ ByteCompanionObject.MIN_VALUE) ^ (b3 << 6)) ^ (b2 << 12);
        if (i6 < 2048) {
            yield.invoke(valueOf);
            return 3;
        } else if (55296 <= i6 && 57343 >= i6) {
            yield.invoke(valueOf);
            return 3;
        } else {
            yield.invoke(Integer.valueOf(i6));
            return 3;
        }
    }

    public static final int process4Utf8Bytes(byte[] process4Utf8Bytes, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process4Utf8Bytes, "$this$process4Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 3;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(valueOf);
            int i5 = i2 + 1;
            if (i3 > i5) {
                if ((process4Utf8Bytes[i5] & 192) == 128) {
                    int i6 = i2 + 2;
                    if (i3 > i6) {
                        if ((process4Utf8Bytes[i6] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = process4Utf8Bytes[i2];
        byte b3 = process4Utf8Bytes[i2 + 1];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b4 = process4Utf8Bytes[i2 + 2];
        if (!((b4 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        byte b5 = process4Utf8Bytes[i4];
        if (!((b5 & 192) == 128)) {
            yield.invoke(valueOf);
            return 3;
        }
        int i7 = (((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
        if (i7 > 1114111) {
            yield.invoke(valueOf);
            return 4;
        } else if (55296 <= i7 && 57343 >= i7) {
            yield.invoke(valueOf);
            return 4;
        } else if (i7 < 65536) {
            yield.invoke(valueOf);
            return 4;
        } else {
            yield.invoke(Integer.valueOf(i7));
            return 4;
        }
    }
}