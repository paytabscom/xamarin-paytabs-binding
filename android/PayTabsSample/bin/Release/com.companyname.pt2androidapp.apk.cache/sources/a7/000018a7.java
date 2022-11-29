package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: ThreadPoolDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreadPoolDispatcherKt {
    /* renamed from: lambda$IYX-93i18CF3E6e1K_suGGxRFcI */
    public static /* synthetic */ Thread m1425lambda$IYX93i18CF3E6e1K_suGGxRFcI(int i2, String str, AtomicInteger atomicInteger, Runnable runnable) {
        return m1426newFixedThreadPoolContext$lambda1(i2, str, atomicInteger, runnable);
    }

    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return newFixedThreadPoolContext(1, str);
    }

    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i2, final String str) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Expected at least one thread, but " + i2 + " specified").toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return ExecutorsKt.from((ExecutorService) Executors.newScheduledThreadPool(i2, new ThreadFactory() { // from class: kotlinx.coroutines.-$$Lambda$ThreadPoolDispatcherKt$IYX-93i18CF3E6e1K_suGGxRFcI
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ThreadPoolDispatcherKt.m1425lambda$IYX93i18CF3E6e1K_suGGxRFcI(i2, str, atomicInteger, runnable);
            }
        }));
    }

    /* renamed from: newFixedThreadPoolContext$lambda-1 */
    public static final Thread m1426newFixedThreadPoolContext$lambda1(int i2, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i2 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}