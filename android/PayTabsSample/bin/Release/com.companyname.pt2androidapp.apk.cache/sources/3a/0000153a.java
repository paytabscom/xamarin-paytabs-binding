package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SafeCollector.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
final class SafeCollector$collectContextSize$1 extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
    public static final SafeCollector$collectContextSize$1 INSTANCE = new SafeCollector$collectContextSize$1();

    SafeCollector$collectContextSize$1() {
        super(2);
    }

    public final int invoke(int i2, CoroutineContext.Element element) {
        return i2 + 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
        return Integer.valueOf(invoke(num.intValue(), element));
    }
}