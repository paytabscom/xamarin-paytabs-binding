package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Thread.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ThreadsKt {
    public static /* synthetic */ Thread thread$default(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, Function0 function0, int i3, Object obj) {
        boolean z4 = (i3 & 1) != 0 ? true : z2;
        boolean z5 = (i3 & 2) != 0 ? false : z3;
        if ((i3 & 4) != 0) {
            classLoader = null;
        }
        ClassLoader classLoader2 = classLoader;
        if ((i3 & 8) != 0) {
            str = null;
        }
        return thread(z4, z5, classLoader2, str, (i3 & 16) != 0 ? -1 : i2, function0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.concurrent.ThreadsKt$thread$thread$1] */
    public static final Thread thread(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ?? r02 = new Thread() { // from class: kotlin.concurrent.ThreadsKt$thread$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Function0.this.invoke();
            }
        };
        if (z3) {
            r02.setDaemon(true);
        }
        if (i2 > 0) {
            r02.setPriority(i2);
        }
        if (str != null) {
            r02.setName(str);
        }
        if (classLoader != null) {
            r02.setContextClassLoader(classLoader);
        }
        if (z2) {
            r02.start();
        }
        return (Thread) r02;
    }

    private static final <T> T getOrSet(ThreadLocal<T> threadLocal, Function0<? extends T> function0) {
        T t2 = threadLocal.get();
        if (t2 != null) {
            return t2;
        }
        T invoke = function0.invoke();
        threadLocal.set(invoke);
        return invoke;
    }
}