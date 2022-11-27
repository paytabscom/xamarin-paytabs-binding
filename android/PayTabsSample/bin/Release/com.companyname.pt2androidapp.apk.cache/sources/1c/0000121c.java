package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(TimeUnit.NANOSECONDS);
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m1388plusAssignLRDsOJo(long j2) {
        long j3;
        long m1352toLongimpl = Duration.m1352toLongimpl(j2, getUnit());
        if (m1352toLongimpl != Long.MIN_VALUE && m1352toLongimpl != LongCompanionObject.MAX_VALUE) {
            long j4 = this.reading;
            j3 = j4 + m1352toLongimpl;
            if ((m1352toLongimpl ^ j4) >= 0 && (j4 ^ j3) < 0) {
                m1387overflowLRDsOJo(j2);
            }
        } else {
            double m1349toDoubleimpl = this.reading + Duration.m1349toDoubleimpl(j2, getUnit());
            if (m1349toDoubleimpl > ((double) LongCompanionObject.MAX_VALUE) || m1349toDoubleimpl < Long.MIN_VALUE) {
                m1387overflowLRDsOJo(j2);
            }
            j3 = (long) m1349toDoubleimpl;
        }
        this.reading = j3;
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m1387overflowLRDsOJo(long j2) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + "ns is advanced by " + Duration.m1355toStringimpl(j2) + '.');
    }
}