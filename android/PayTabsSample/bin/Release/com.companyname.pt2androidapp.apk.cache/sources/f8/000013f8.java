package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Delay.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
final class FlowKt__DelayKt$debounce$2 extends Lambda implements Function1<T, Long> {
    final /* synthetic */ long $timeoutMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$2(long j2) {
        super(1);
        this.$timeoutMillis = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Long invoke(Object obj) {
        return Long.valueOf(invoke((FlowKt__DelayKt$debounce$2) obj));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [long, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(T t2) {
        return this.$timeoutMillis;
    }
}