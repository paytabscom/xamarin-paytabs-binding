package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
@Metadata(d1 = {"\u0000n\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\r\u0010*\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u0010*\u001a\u00020\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u0010*\u001a\u00020\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u0010*\u001a\u00020\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u0010-\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u0010/\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00101\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00102\u001a\n\u00103\u001a\u00020)*\u00020)\u001a\n\u00103\u001a\u00020&*\u00020&\u001a\n\u00103\u001a\u00020(*\u00020(\u001a\u0015\u00104\u001a\u00020)*\u00020)2\u0006\u00104\u001a\u00020\bH\u0086\u0004\u001a\u0015\u00104\u001a\u00020&*\u00020&2\u0006\u00104\u001a\u00020\bH\u0086\u0004\u001a\u0015\u00104\u001a\u00020(*\u00020(2\u0006\u00104\u001a\u00020\tH\u0086\u0004\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u00106\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u00108\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u00109\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010:\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010C\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004¨\u0006H"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b2, byte b3) {
        return b2 < b3 ? b3 : b2;
    }

    public static final double coerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final float coerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final int coerceAtLeast(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static final long coerceAtLeast(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static final short coerceAtLeast(short s2, short s3) {
        return s2 < s3 ? s3 : s2;
    }

    public static final byte coerceAtMost(byte b2, byte b3) {
        return b2 > b3 ? b3 : b2;
    }

    public static final double coerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final float coerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final int coerceAtMost(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static final long coerceAtMost(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static final short coerceAtMost(short s2, short s3) {
        return s2 > s3 ? s3 : s2;
    }

    private static final int random(IntRange intRange) {
        return RangesKt.random(intRange, Random.Default);
    }

    private static final long random(LongRange longRange) {
        return RangesKt.random(longRange, Random.Default);
    }

    private static final char random(CharRange charRange) {
        return RangesKt.random(charRange, Random.Default);
    }

    public static final int random(IntRange random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return RandomKt.nextInt(random2, random);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final long random(LongRange random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return RandomKt.nextLong(random2, random);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final char random(CharRange random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return (char) random2.nextInt(random.getFirst(), random.getLast() + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final Integer randomOrNull(IntRange intRange) {
        return RangesKt.randomOrNull(intRange, Random.Default);
    }

    private static final Long randomOrNull(LongRange longRange) {
        return RangesKt.randomOrNull(longRange, Random.Default);
    }

    private static final Character randomOrNull(CharRange charRange) {
        return RangesKt.randomOrNull(charRange, Random.Default);
    }

    public static final Integer randomOrNull(IntRange randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, randomOrNull));
    }

    public static final Long randomOrNull(LongRange randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, randomOrNull));
    }

    public static final Character randomOrNull(CharRange randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(randomOrNull.getFirst(), randomOrNull.getLast() + 1));
    }

    private static final boolean contains(IntRange contains, Integer num) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return num != null && contains.contains(num.intValue());
    }

    private static final boolean contains(LongRange contains, Long l2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return l2 != null && contains.contains(l2.longValue());
    }

    private static final boolean contains(CharRange contains, Character ch) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ch != null && contains.contains(ch.charValue());
    }

    public static final boolean intRangeContains(ClosedRange<Integer> contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Integer.valueOf(b2));
    }

    public static final boolean longRangeContains(ClosedRange<Long> contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Long.valueOf(b2));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Short.valueOf(b2));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange<Integer> contains, double d2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(d2);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange<Long> contains, double d2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(d2);
        if (longExactOrNull != null) {
            return contains.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange<Byte> contains, double d2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(d2);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange<Short> contains, double d2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(d2);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(ClosedRange<Float> contains, double d2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Float.valueOf((float) d2));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange<Integer> contains, float f2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(f2);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange<Long> contains, float f2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(f2);
        if (longExactOrNull != null) {
            return contains.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange<Byte> contains, float f2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(f2);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange<Short> contains, float f2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(f2);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(ClosedRange<Double> contains, float f2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Double.valueOf(f2));
    }

    public static final boolean longRangeContains(ClosedRange<Long> contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Long.valueOf(i2));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i2);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i2);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(ClosedRange<Integer> contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j2);
        if (intExactOrNull != null) {
            return contains.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j2);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j2);
        if (shortExactOrNull != null) {
            return contains.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(ClosedRange<Integer> contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Integer.valueOf(s2));
    }

    public static final boolean longRangeContains(ClosedRange<Long> contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.contains(Long.valueOf(s2));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s2);
        if (byteExactOrNull != null) {
            return contains.contains(byteExactOrNull);
        }
        return false;
    }

    public static final IntProgression downTo(int i2, byte b2) {
        return IntProgression.Companion.fromClosedRange(i2, b2, -1);
    }

    public static final LongProgression downTo(long j2, byte b2) {
        return LongProgression.Companion.fromClosedRange(j2, b2, -1L);
    }

    public static final IntProgression downTo(byte b2, byte b3) {
        return IntProgression.Companion.fromClosedRange(b2, b3, -1);
    }

    public static final IntProgression downTo(short s2, byte b2) {
        return IntProgression.Companion.fromClosedRange(s2, b2, -1);
    }

    public static final CharProgression downTo(char c2, char c3) {
        return CharProgression.Companion.fromClosedRange(c2, c3, -1);
    }

    public static final IntProgression downTo(int i2, int i3) {
        return IntProgression.Companion.fromClosedRange(i2, i3, -1);
    }

    public static final LongProgression downTo(long j2, int i2) {
        return LongProgression.Companion.fromClosedRange(j2, i2, -1L);
    }

    public static final IntProgression downTo(byte b2, int i2) {
        return IntProgression.Companion.fromClosedRange(b2, i2, -1);
    }

    public static final IntProgression downTo(short s2, int i2) {
        return IntProgression.Companion.fromClosedRange(s2, i2, -1);
    }

    public static final LongProgression downTo(int i2, long j2) {
        return LongProgression.Companion.fromClosedRange(i2, j2, -1L);
    }

    public static final LongProgression downTo(long j2, long j3) {
        return LongProgression.Companion.fromClosedRange(j2, j3, -1L);
    }

    public static final LongProgression downTo(byte b2, long j2) {
        return LongProgression.Companion.fromClosedRange(b2, j2, -1L);
    }

    public static final LongProgression downTo(short s2, long j2) {
        return LongProgression.Companion.fromClosedRange(s2, j2, -1L);
    }

    public static final IntProgression downTo(int i2, short s2) {
        return IntProgression.Companion.fromClosedRange(i2, s2, -1);
    }

    public static final LongProgression downTo(long j2, short s2) {
        return LongProgression.Companion.fromClosedRange(j2, s2, -1L);
    }

    public static final IntProgression downTo(byte b2, short s2) {
        return IntProgression.Companion.fromClosedRange(b2, s2, -1);
    }

    public static final IntProgression downTo(short s2, short s3) {
        return IntProgression.Companion.fromClosedRange(s2, s3, -1);
    }

    public static final IntProgression reversed(IntProgression reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return IntProgression.Companion.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final LongProgression reversed(LongProgression reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return LongProgression.Companion.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final CharProgression reversed(CharProgression reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return CharProgression.Companion.fromClosedRange(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final IntProgression step(IntProgression step, int i2) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = step.getFirst();
        int last = step.getLast();
        if (step.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.fromClosedRange(first, last, i2);
    }

    public static final LongProgression step(LongProgression step, long j2) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        RangesKt.checkStepIsPositive(j2 > 0, Long.valueOf(j2));
        LongProgression.Companion companion = LongProgression.Companion;
        long first = step.getFirst();
        long last = step.getLast();
        if (step.getStep() <= 0) {
            j2 = -j2;
        }
        return companion.fromClosedRange(first, last, j2);
    }

    public static final CharProgression step(CharProgression step, int i2) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        CharProgression.Companion companion = CharProgression.Companion;
        char first = step.getFirst();
        char last = step.getLast();
        if (step.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.fromClosedRange(first, last, i2);
    }

    public static final Byte toByteExactOrNull(int i2) {
        if (-128 <= i2 && 127 >= i2) {
            return Byte.valueOf((byte) i2);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(long j2) {
        long j3 = 127;
        if (-128 <= j2 && j3 >= j2) {
            return Byte.valueOf((byte) j2);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(short s2) {
        short s3 = (short) 127;
        if (((short) (-128)) <= s2 && s3 >= s2) {
            return Byte.valueOf((byte) s2);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(double d2) {
        double d3 = 127;
        if (d2 < -128 || d2 > d3) {
            return null;
        }
        return Byte.valueOf((byte) d2);
    }

    public static final Byte toByteExactOrNull(float f2) {
        float f3 = 127;
        if (f2 < -128 || f2 > f3) {
            return null;
        }
        return Byte.valueOf((byte) f2);
    }

    public static final Integer toIntExactOrNull(long j2) {
        long j3 = Integer.MAX_VALUE;
        if (Integer.MIN_VALUE <= j2 && j3 >= j2) {
            return Integer.valueOf((int) j2);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d2) {
        double d3 = Integer.MAX_VALUE;
        if (d2 < Integer.MIN_VALUE || d2 > d3) {
            return null;
        }
        return Integer.valueOf((int) d2);
    }

    public static final Integer toIntExactOrNull(float f2) {
        float f3 = Integer.MAX_VALUE;
        if (f2 < Integer.MIN_VALUE || f2 > f3) {
            return null;
        }
        return Integer.valueOf((int) f2);
    }

    public static final Long toLongExactOrNull(double d2) {
        double d3 = Long.MAX_VALUE;
        if (d2 < Long.MIN_VALUE || d2 > d3) {
            return null;
        }
        return Long.valueOf((long) d2);
    }

    public static final Long toLongExactOrNull(float f2) {
        float f3 = (float) Long.MAX_VALUE;
        if (f2 < ((float) Long.MIN_VALUE) || f2 > f3) {
            return null;
        }
        return Long.valueOf(f2);
    }

    public static final Short toShortExactOrNull(int i2) {
        if (-32768 <= i2 && 32767 >= i2) {
            return Short.valueOf((short) i2);
        }
        return null;
    }

    public static final Short toShortExactOrNull(long j2) {
        long j3 = 32767;
        if (-32768 <= j2 && j3 >= j2) {
            return Short.valueOf((short) j2);
        }
        return null;
    }

    public static final Short toShortExactOrNull(double d2) {
        double d3 = 32767;
        if (d2 < -32768 || d2 > d3) {
            return null;
        }
        return Short.valueOf((short) d2);
    }

    public static final Short toShortExactOrNull(float f2) {
        float f3 = 32767;
        if (f2 < -32768 || f2 > f3) {
            return null;
        }
        return Short.valueOf((short) f2);
    }

    public static final IntRange until(int i2, byte b2) {
        return new IntRange(i2, b2 - 1);
    }

    public static final LongRange until(long j2, byte b2) {
        return new LongRange(j2, b2 - 1);
    }

    public static final IntRange until(byte b2, byte b3) {
        return new IntRange(b2, b3 - 1);
    }

    public static final IntRange until(short s2, byte b2) {
        return new IntRange(s2, b2 - 1);
    }

    public static final CharRange until(char c2, char c3) {
        return Intrinsics.compare((int) c3, 0) <= 0 ? CharRange.Companion.getEMPTY() : new CharRange(c2, (char) (c3 - 1));
    }

    public static final IntRange until(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(i2, i3 - 1);
    }

    public static final LongRange until(long j2, int i2) {
        return new LongRange(j2, i2 - 1);
    }

    public static final IntRange until(byte b2, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(b2, i2 - 1);
    }

    public static final IntRange until(short s2, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(s2, i2 - 1);
    }

    public static final LongRange until(int i2, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(i2, j2 - 1);
    }

    public static final LongRange until(long j2, long j3) {
        if (j3 <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(j2, j3 - 1);
    }

    public static final LongRange until(byte b2, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(b2, j2 - 1);
    }

    public static final LongRange until(short s2, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(s2, j2 - 1);
    }

    public static final IntRange until(int i2, short s2) {
        return new IntRange(i2, s2 - 1);
    }

    public static final LongRange until(long j2, short s2) {
        return new LongRange(j2, s2 - 1);
    }

    public static final IntRange until(byte b2, short s2) {
        return new IntRange(b2, s2 - 1);
    }

    public static final IntRange until(short s2, short s3) {
        return new IntRange(s2, s3 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T coerceAtLeast, T minimumValue) {
        Intrinsics.checkNotNullParameter(coerceAtLeast, "$this$coerceAtLeast");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return coerceAtLeast.compareTo(minimumValue) < 0 ? minimumValue : coerceAtLeast;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T coerceAtMost, T maximumValue) {
        Intrinsics.checkNotNullParameter(coerceAtMost, "$this$coerceAtMost");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return coerceAtMost.compareTo(maximumValue) > 0 ? maximumValue : coerceAtMost;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T coerceIn, T t2, T t3) {
        Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            } else if (coerceIn.compareTo(t2) < 0) {
                return t2;
            } else {
                if (coerceIn.compareTo(t3) > 0) {
                    return t3;
                }
            }
        } else if (t2 != null && coerceIn.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t3 != null && coerceIn.compareTo(t3) > 0) {
                return t3;
            }
        }
        return coerceIn;
    }

    public static final byte coerceIn(byte b2, byte b3, byte b4) {
        if (b3 <= b4) {
            return b2 < b3 ? b3 : b2 > b4 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b4) + " is less than minimum " + ((int) b3) + '.');
    }

    public static final short coerceIn(short s2, short s3, short s4) {
        if (s3 <= s4) {
            return s2 < s3 ? s3 : s2 > s4 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s4) + " is less than minimum " + ((int) s3) + '.');
    }

    public static final int coerceIn(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static final long coerceIn(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static final float coerceIn(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static final double coerceIn(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T coerceIn, ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(coerceIn, range.getStart()) || range.lessThanOrEquals(range.getStart(), coerceIn)) ? (!range.lessThanOrEquals(range.getEndInclusive(), coerceIn) || range.lessThanOrEquals(coerceIn, range.getEndInclusive())) ? coerceIn : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T coerceIn, ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(coerceIn, "$this$coerceIn");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) RangesKt.coerceIn((Comparable) coerceIn, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return coerceIn.compareTo(range.getStart()) < 0 ? range.getStart() : coerceIn.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final int coerceIn(int i2, ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Integer.valueOf(i2), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i2 < range.getStart().intValue() ? range.getStart().intValue() : i2 > range.getEndInclusive().intValue() ? range.getEndInclusive().intValue() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final long coerceIn(long j2, ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Long.valueOf(j2), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j2 < range.getStart().longValue() ? range.getStart().longValue() : j2 > range.getEndInclusive().longValue() ? range.getEndInclusive().longValue() : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}