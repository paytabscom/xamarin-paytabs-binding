package i;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "s", "", "a", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final boolean a(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return new Regex("(?<! )^[\\p{L}][\\p{L},.'-]+(?: [\\p{L},.'-]+)+$").matches(s2);
    }
}