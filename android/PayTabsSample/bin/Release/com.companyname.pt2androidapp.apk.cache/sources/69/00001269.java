package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Debug.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0081\b\u001a\b\u0010\u0016\u001a\u00020\u0013H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0003\"\u000e\u0010\u0011\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"ASSERTIONS_ENABLED", "", "getASSERTIONS_ENABLED", "()Z", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;", "DEBUG", "getDEBUG", "DEBUG_PROPERTY_NAME", "", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_OFF", "DEBUG_PROPERTY_VALUE_ON", "RECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES", "STACKTRACE_RECOVERY_PROPERTY_NAME", "assert", "", "value", "Lkotlin/Function0;", "resetCoroutineId", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DebugKt {
    private static final boolean ASSERTIONS_ENABLED = false;
    private static final AtomicLong COROUTINE_ID;
    private static final boolean DEBUG;
    public static final String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final String DEBUG_PROPERTY_VALUE_ON = "on";
    private static final boolean RECOVER_STACK_TRACES;
    public static final String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r1.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r1.equals("") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r1 = true;
     */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.CoroutineId> r0 = kotlinx.coroutines.CoroutineId.class
            r0 = 0
            kotlinx.coroutines.DebugKt.ASSERTIONS_ENABLED = r0
            java.lang.String r1 = "kotlinx.coroutines.debug"
            java.lang.String r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1)
            r2 = 1
            if (r1 != 0) goto Lf
            goto L2b
        Lf:
            int r3 = r1.hashCode()
            if (r3 == 0) goto L3f
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L36
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L2d
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L61
            java.lang.String r3 = "auto"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L61
        L2b:
            r1 = 0
            goto L48
        L2d:
            java.lang.String r3 = "off"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L61
            goto L2b
        L36:
            java.lang.String r3 = "on"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L61
            goto L47
        L3f:
            java.lang.String r3 = ""
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L61
        L47:
            r1 = 1
        L48:
            kotlinx.coroutines.DebugKt.DEBUG = r1
            if (r1 == 0) goto L55
            java.lang.String r1 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1, r2)
            if (r1 == 0) goto L55
            r0 = 1
        L55:
            kotlinx.coroutines.DebugKt.RECOVER_STACK_TRACES = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.DebugKt.COROUTINE_ID = r0
            return
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r0.append(r2)
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DebugKt.<clinit>():void");
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return ASSERTIONS_ENABLED;
    }

    public static final boolean getDEBUG() {
        return DEBUG;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return RECOVER_STACK_TRACES;
    }

    public static final AtomicLong getCOROUTINE_ID() {
        return COROUTINE_ID;
    }

    public static final void resetCoroutineId() {
        COROUTINE_ID.set(0L);
    }

    /* renamed from: assert  reason: not valid java name */
    private static final void m1394assert(Function0<Boolean> function0) {
        if (getASSERTIONS_ENABLED() && !function0.invoke().booleanValue()) {
            throw new AssertionError();
        }
    }
}