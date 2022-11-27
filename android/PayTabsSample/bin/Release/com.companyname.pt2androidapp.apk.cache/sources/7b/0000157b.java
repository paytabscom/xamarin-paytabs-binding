package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* compiled from: StackTraceRecovery.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a \u0010%\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010'\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190(\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u00020+*\u00060\u0007j\u0002`\b2\n\u0010,\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010-\u001a\u00020.*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00100\u001a\u0014\u00101\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00102\u001a\u00020+*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00103\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00104\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00105\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StackTraceRecoveryKt {
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    public static final /* synthetic */ Throwable access$recoverFromStackFrame(Throwable th, CoroutineStackFrame coroutineStackFrame) {
        return recoverFromStackFrame(th, coroutineStackFrame);
    }

    static {
        Object obj;
        Object obj2;
        Object obj3 = stackTraceRecoveryClass;
        Object obj4 = baseContinuationImplClass;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m21constructorimpl(Class.forName(baseContinuationImplClass).getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m21constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24exceptionOrNullimpl(obj) == null) {
            obj4 = obj;
        }
        baseContinuationImplClassName = (String) obj4;
        try {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.m21constructorimpl(Class.forName(stackTraceRecoveryClass).getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.m21constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m24exceptionOrNullimpl(obj2) == null) {
            obj3 = obj2;
        }
        stackTraceRecoveryClassName = (String) obj3;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e2) {
        Throwable tryCopyException;
        return (DebugKt.getRECOVER_STACK_TRACES() && (tryCopyException = ExceptionsConstuctorKt.tryCopyException(e2)) != null) ? (E) sanitizeStackTrace(tryCopyException) : e2;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e2) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int frameIndex = frameIndex(stackTrace, stackTraceRecoveryClassName);
        int i2 = frameIndex + 1;
        int frameIndex2 = frameIndex(stackTrace, baseContinuationImplClassName);
        int i3 = (length - frameIndex) - (frameIndex2 == -1 ? 0 : length - frameIndex2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                stackTraceElement = artificialFrame("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i2 + i4) - 1];
            }
            stackTraceElementArr[i4] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e2, Continuation<?> continuation) {
        return (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) ? (E) recoverFromStackFrame(e2, (CoroutineStackFrame) continuation) : e2;
    }

    public static final <E extends Throwable> E recoverFromStackFrame(E e2, CoroutineStackFrame coroutineStackFrame) {
        Pair causeAndStacktrace = causeAndStacktrace(e2);
        Throwable th = (Throwable) causeAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) causeAndStacktrace.component2();
        Throwable tryCopyException = ExceptionsConstuctorKt.tryCopyException(th);
        if (tryCopyException == null || (!Intrinsics.areEqual(tryCopyException.getMessage(), th.getMessage()))) {
            return e2;
        }
        ArrayDeque<StackTraceElement> createStackTrace = createStackTrace(coroutineStackFrame);
        if (createStackTrace.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            mergeRecoveredTraces(stackTraceElementArr, createStackTrace);
        }
        return (E) createFinalException(th, tryCopyException, createStackTrace);
    }

    private static final <E extends Throwable> E createFinalException(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(artificialFrame("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int frameIndex = frameIndex(stackTrace, baseContinuationImplClassName);
        int i2 = 0;
        if (frameIndex != -1) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + frameIndex];
            for (int i3 = 0; i3 < frameIndex; i3++) {
                stackTraceElementArr[i3] = stackTrace[i3];
            }
            for (StackTraceElement stackTraceElement : arrayDeque) {
                stackTraceElementArr[frameIndex + i2] = stackTraceElement;
                i2++;
            }
            e3.setStackTrace(stackTraceElementArr);
            return e3;
        }
        Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        e3.setStackTrace((StackTraceElement[]) array);
        return e3;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e2) {
        boolean z2;
        Throwable cause = e2.getCause();
        if (cause != null && Intrinsics.areEqual(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (isArtificial(stackTrace[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return TuplesKt.to(cause, stackTrace);
            }
            return TuplesKt.to(e2, new StackTraceElement[0]);
        }
        return TuplesKt.to(e2, new StackTraceElement[0]);
    }

    public static final Object recoverAndThrow(Throwable th, Continuation<?> continuation) {
        if (!DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        if (continuation instanceof CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
        }
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, Continuation continuation) {
        if (!DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        InlineMarker.mark(0);
        if (continuation instanceof CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
        }
        throw th;
    }

    public static final <E extends Throwable> E unwrap(E e2) {
        return !DebugKt.getRECOVER_STACK_TRACES() ? e2 : (E) unwrapImpl(e2);
    }

    public static final <E extends Throwable> E unwrapImpl(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null) {
            boolean z2 = true;
            if (!(!Intrinsics.areEqual(e3.getClass(), e2.getClass()))) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (isArtificial(stackTrace[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return e3;
                }
            }
        }
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    public static final StackTraceElement artificialFrame(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return StringsKt.startsWith$default(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 < i3) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            }
            length2--;
        }
    }

    private static final int frameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }
}