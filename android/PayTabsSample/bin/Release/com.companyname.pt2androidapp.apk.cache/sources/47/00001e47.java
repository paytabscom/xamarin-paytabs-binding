package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* compiled from: -Utf8.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class _Utf8Kt {
    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        return commonToUtf8String(bArr, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String commonToUtf8String(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static final byte[] commonAsUtf8ToByteArray(String commonAsUtf8ToByteArray) {
        int i2;
        int i3;
        char charAt;
        Intrinsics.checkNotNullParameter(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt2 = commonAsUtf8ToByteArray.charAt(i4);
            if (Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i5 = i4;
                while (i4 < length2) {
                    char charAt3 = commonAsUtf8ToByteArray.charAt(i4);
                    if (Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i6 = i5 + 1;
                        bArr[i5] = (byte) charAt3;
                        i4++;
                        while (i4 < length2 && Intrinsics.compare((int) commonAsUtf8ToByteArray.charAt(i4), 128) < 0) {
                            bArr[i6] = (byte) commonAsUtf8ToByteArray.charAt(i4);
                            i4++;
                            i6++;
                        }
                        i5 = i6;
                    } else {
                        if (Intrinsics.compare((int) charAt3, 2048) < 0) {
                            int i7 = i5 + 1;
                            bArr[i5] = (byte) ((charAt3 >> 6) | 192);
                            i2 = i7 + 1;
                            bArr[i7] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i8 = i5 + 1;
                            bArr[i5] = (byte) ((charAt3 >> '\f') | 224);
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i2 = i9 + 1;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) charAt3, 56319) > 0 || length2 <= (i3 = i4 + 1) || 56320 > (charAt = commonAsUtf8ToByteArray.charAt(i3)) || 57343 < charAt) {
                            i2 = i5 + 1;
                            bArr[i5] = Utf8.REPLACEMENT_BYTE;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + commonAsUtf8ToByteArray.charAt(i3)) - 56613888;
                            int i10 = i5 + 1;
                            bArr[i5] = (byte) ((charAt4 >> 18) | 240);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i2 = i12 + 1;
                            bArr[i12] = (byte) ((charAt4 & 63) | 128);
                            i4 += 2;
                            i5 = i2;
                        }
                        i4++;
                        i5 = i2;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i5);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i4] = (byte) charAt2;
            i4++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        Intrinsics.checkNotNullExpressionValue(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }
}