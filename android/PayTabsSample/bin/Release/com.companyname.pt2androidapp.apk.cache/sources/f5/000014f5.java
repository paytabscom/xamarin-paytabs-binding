package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: SharingStarted.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;DD)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I$default  reason: not valid java name */
    public static /* synthetic */ SharingStarted m1429WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, double d2, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = Duration.Companion.m1366getZEROUwyO8pc();
        }
        if ((i2 & 2) != 0) {
            d3 = Duration.Companion.m1364getINFINITEUwyO8pc();
        }
        return m1428WhileSubscribed5qebJ5I(companion, d2, d3);
    }

    /* renamed from: WhileSubscribed-5qebJ5I  reason: not valid java name */
    public static final SharingStarted m1428WhileSubscribed5qebJ5I(SharingStarted.Companion companion, double d2, double d3) {
        return new StartedWhileSubscribed(Duration.toLongMilliseconds-impl(d2), Duration.toLongMilliseconds-impl(d3));
    }
}