package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i2, int i3, int i4) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i2, i3, i4);
    }

    public static final long systemProp(String str, long j2, long j3, long j4) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j2, j3, j4);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final boolean systemProp(String str, boolean z2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z2);
    }
}