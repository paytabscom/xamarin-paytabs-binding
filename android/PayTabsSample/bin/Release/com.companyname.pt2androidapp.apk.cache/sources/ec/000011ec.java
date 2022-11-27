package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    public static /* synthetic */ String trimMargin$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return StringsKt.trimMargin(str, str2);
    }

    public static final String trimMargin(String trimMargin, String marginPrefix) {
        Intrinsics.checkNotNullParameter(trimMargin, "$this$trimMargin");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return StringsKt.replaceIndentByMargin(trimMargin, "", marginPrefix);
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        if ((i2 & 2) != 0) {
            str3 = "|";
        }
        return StringsKt.replaceIndentByMargin(str, str2, str3);
    }

    public static final String replaceIndentByMargin(String replaceIndentByMargin, String newIndent, String marginPrefix) {
        Appendable joinTo;
        int i2;
        String invoke;
        Intrinsics.checkNotNullParameter(replaceIndentByMargin, "$this$replaceIndentByMargin");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!StringsKt.isBlank(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> lines = StringsKt.lines(replaceIndentByMargin);
        int length = replaceIndentByMargin.length() + (newIndent.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : lines) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String str2 = null;
            if ((i3 != 0 && i3 != lastIndex) || !StringsKt.isBlank(str)) {
                String str3 = str;
                int length2 = str3.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i2 = -1;
                        break;
                    } else if (!CharsKt.isWhitespace(str3.charAt(i5))) {
                        i2 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = i2;
                    if (StringsKt.startsWith$default(str, marginPrefix, i2, false, 4, (Object) null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        str2 = str.substring(i6 + marginPrefix.length());
                        Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).substring(startIndex)");
                    }
                }
                if (str2 != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(str2)) != null) {
                    str = invoke;
                }
                str2 = str;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i3 = i4;
        }
        joinTo = CollectionsKt.joinTo(arrayList, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static final String trimIndent(String trimIndent) {
        Intrinsics.checkNotNullParameter(trimIndent, "$this$trimIndent");
        return StringsKt.replaceIndent(trimIndent, "");
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        return StringsKt.replaceIndent(str, str2);
    }

    public static final String replaceIndent(String replaceIndent, String newIndent) {
        Appendable joinTo;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(replaceIndent, "$this$replaceIndent");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt.lines(replaceIndent);
        List<String> list = lines;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (String str2 : arrayList2) {
            arrayList3.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(str2)));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable<? extends Comparable>) arrayList3);
        int i2 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = replaceIndent.length() + (newIndent.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(str3)) {
                str = null;
            } else {
                String drop = StringsKt.drop(str3, intValue);
                if (drop != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str3 = invoke;
                }
                str = str3;
            }
            if (str != null) {
                arrayList4.add(str);
            }
            i2 = i3;
        }
        joinTo = CollectionsKt.joinTo(arrayList4, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "    ";
        }
        return StringsKt.prependIndent(str, str2);
    }

    public static final String prependIndent(String prependIndent, String indent) {
        Intrinsics.checkNotNullParameter(prependIndent, "$this$prependIndent");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence(prependIndent), new StringsKt__IndentKt$prependIndent$1(indent)), "\n", null, null, 0, null, null, 62, null);
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        String str2 = str;
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!CharsKt.isWhitespace(str2.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        return i2 == -1 ? str.length() : i2;
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String str) {
        return str.length() == 0 ? StringsKt__IndentKt$getIndentFunction$1.INSTANCE : new StringsKt__IndentKt$getIndentFunction$2(str);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i2, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        Appendable joinTo;
        String str;
        String invoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if ((i3 == 0 || i3 == lastIndex) && StringsKt.isBlank(str2)) {
                str = null;
            } else {
                String invoke2 = function12.invoke(str2);
                if (invoke2 != null && (invoke = function1.invoke(invoke2)) != null) {
                    str2 = invoke;
                }
                str = str2;
            }
            if (str != null) {
                arrayList.add(str);
            }
            i3 = i4;
        }
        joinTo = CollectionsKt.joinTo(arrayList, new StringBuilder(i2), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }
}