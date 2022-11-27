package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0086\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0086\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0087\n\u001a\u0018\u0010\u0014\u001a\u00020\r*\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\r*\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001e\u001a:\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010 \u001a\u00020\r*\u00020\u00022\u0006\u0010!\u001a\u00020\u0006\u001a7\u0010\"\u001a\u0002H#\"\f\b\u0000\u0010$*\u00020\u0002*\u0002H#\"\u0004\b\u0001\u0010#*\u0002H$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0&H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010'\u001a7\u0010(\u001a\u0002H#\"\f\b\u0000\u0010$*\u00020\u0002*\u0002H#\"\u0004\b\u0001\u0010#*\u0002H$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0&H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010'\u001a&\u0010)\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010)\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0002\b+\u001a&\u0010)\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010-\u001a\u00020\u0006*\u00020\u00022\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010-\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u00100\u001a\u00020\r*\u00020\u0002H\u0087\b\u001a\r\u00101\u001a\u00020\r*\u00020\u0002H\u0087\b\u001a\r\u00102\u001a\u00020\r*\u00020\u0002H\u0087\b\u001a \u00103\u001a\u00020\r*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00104\u001a\u00020\r*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0086\u0002\u001a&\u00107\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00107\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00108\u001a\u00020\u0006*\u00020\u00022\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u00108\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001a\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0<*\u00020\u0002\u001a\u0015\u0010=\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0087\f\u001a\u000f\u0010>\u001a\u00020\n*\u0004\u0018\u00010\nH\u0087\b\u001a\u001c\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u0011\u001a\u001c\u0010?\u001a\u00020\n*\u00020\n2\u0006\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u0011\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u0011\u001a\u001c\u0010B\u001a\u00020\n*\u00020\n2\u0006\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u0011\u001aG\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010:*\u00020\u00022\u000e\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0E2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010H\u001a=\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010:*\u00020\u00022\u0006\u0010D\u001a\u00020/2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0002\bG\u001a4\u0010I\u001a\u00020\r*\u00020\u00022\u0006\u0010J\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0002\u001a\u0012\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0002\u001a\u001a\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0001\u001a\u001d\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010O\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u0012\u0010P\u001a\u00020\n*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u0012\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u0002\u001a\u001a\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u0012\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u0002\u001a\u001a\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u001a.\u0010S\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010T\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00020UH\u0087\bø\u0001\u0000\u001a\u001d\u0010S\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\nH\u0087\b\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010[\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010[\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a$\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001d\u0010]\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\nH\u0087\b\u001a)\u0010^\u001a\u00020\n*\u00020\n2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110UH\u0087\bø\u0001\u0000¢\u0006\u0002\b_\u001a)\u0010^\u001a\u00020\n*\u00020\n2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020UH\u0087\bø\u0001\u0000¢\u0006\u0002\b`\u001a\"\u0010a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0002\u001a\u001a\u0010a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u0002\u001a%\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u0002H\u0087\b\u001a=\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0012\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0E\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006¢\u0006\u0002\u0010c\u001a0\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\n\u0010D\u001a\u00020/\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006\u001a/\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0006\u0010R\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0002\bd\u001a%\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010F\u001a\u00020\u0006H\u0087\b\u001a=\u0010e\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0E\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006¢\u0006\u0002\u0010f\u001a0\u0010e\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010D\u001a\u00020/\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010F\u001a\u00020\u0006\u001a\u001c\u0010g\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010g\u001a\u00020\r*\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010g\u001a\u00020\r*\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0001\u001a\u001d\u0010h\u001a\u00020\u0002*\u00020\n2\u0006\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010k\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010k\u001a\u00020\n*\u00020\u00022\u0006\u0010O\u001a\u00020\u0001\u001a\u0012\u0010k\u001a\u00020\n*\u00020\n2\u0006\u0010O\u001a\u00020\u0001\u001a\u001c\u0010l\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010l\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010m\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010m\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010n\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010n\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010o\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u00112\b\b\u0002\u0010Y\u001a\u00020\n\u001a\u001c\u0010o\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\n2\b\b\u0002\u0010Y\u001a\u00020\n\u001a\f\u0010p\u001a\u00020\r*\u00020\nH\u0007\u001a\u0013\u0010q\u001a\u0004\u0018\u00010\r*\u00020\nH\u0007¢\u0006\u0002\u0010r\u001a\n\u0010s\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010s\u001a\u00020\u0002*\u00020\u00022\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010s\u001a\u00020\u0002*\u00020\u00022\n\u0010.\u001a\u00020/\"\u00020\u0011\u001a\r\u0010s\u001a\u00020\n*\u00020\nH\u0087\b\u001a$\u0010s\u001a\u00020\n*\u00020\n2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010s\u001a\u00020\n*\u00020\n2\n\u0010.\u001a\u00020/\"\u00020\u0011\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u0010.\u001a\u00020/\"\u00020\u0011\u001a\r\u0010u\u001a\u00020\n*\u00020\nH\u0087\b\u001a$\u0010u\u001a\u00020\n*\u00020\n2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\n*\u00020\n2\n\u0010.\u001a\u00020/\"\u00020\u0011\u001a\n\u0010v\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010v\u001a\u00020\u0002*\u00020\u00022\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\u0002*\u00020\u00022\n\u0010.\u001a\u00020/\"\u00020\u0011\u001a\r\u0010v\u001a\u00020\n*\u00020\nH\u0087\b\u001a$\u0010v\u001a\u00020\n*\u00020\n2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\n*\u00020\n2\n\u0010.\u001a\u00020/\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006w"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    private static final String orEmpty(String str) {
        return str != null ? str : "";
    }

    public static final CharSequence trim(CharSequence trim, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(trim, "$this$trim");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = trim.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(trim.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return trim.subSequence(i2, length + 1);
    }

    public static final String trim(String trim, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(trim, "$this$trim");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str = trim;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(str.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static final CharSequence trimStart(CharSequence trimStart, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(trimStart, "$this$trimStart");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = trimStart.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(trimStart.charAt(i2))).booleanValue()) {
                return trimStart.subSequence(i2, trimStart.length());
            }
        }
        return "";
    }

    public static final String trimStart(String trimStart, Function1<? super Character, Boolean> predicate) {
        String str;
        Intrinsics.checkNotNullParameter(trimStart, "$this$trimStart");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = trimStart;
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (!predicate.invoke(Character.valueOf(str2.charAt(i2))).booleanValue()) {
                    str = str2.subSequence(i2, str2.length());
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return str.toString();
    }

    public static final CharSequence trimEnd(CharSequence trimEnd, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(trimEnd, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = trimEnd.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (predicate.invoke(Character.valueOf(trimEnd.charAt(length))).booleanValue());
        return trimEnd.subSequence(0, length + 1);
    }

    public static final String trimEnd(String trimEnd, Function1<? super Character, Boolean> predicate) {
        String str;
        Intrinsics.checkNotNullParameter(trimEnd, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = trimEnd;
        int length = str2.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!predicate.invoke(Character.valueOf(str2.charAt(length))).booleanValue()) {
                    str = str2.subSequence(0, length + 1);
                    break;
                }
            } else {
                break;
            }
        }
        return str.toString();
    }

    private static final String trim(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.trim((CharSequence) str).toString();
    }

    private static final String trimStart(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.trimStart((CharSequence) str).toString();
    }

    private static final String trimEnd(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.trimEnd((CharSequence) str).toString();
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padStart(charSequence, i2, c2);
    }

    public static final CharSequence padStart(CharSequence padStart, int i2, char c2) {
        Intrinsics.checkNotNullParameter(padStart, "$this$padStart");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        } else if (i2 <= padStart.length()) {
            return padStart.subSequence(0, padStart.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - padStart.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c2);
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append(padStart);
            return sb;
        }
    }

    public static /* synthetic */ String padStart$default(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padStart(str, i2, c2);
    }

    public static final String padStart(String padStart, int i2, char c2) {
        Intrinsics.checkNotNullParameter(padStart, "$this$padStart");
        return StringsKt.padStart((CharSequence) padStart, i2, c2).toString();
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padEnd(charSequence, i2, c2);
    }

    public static final CharSequence padEnd(CharSequence padEnd, int i2, char c2) {
        Intrinsics.checkNotNullParameter(padEnd, "$this$padEnd");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        } else if (i2 <= padEnd.length()) {
            return padEnd.subSequence(0, padEnd.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(padEnd);
            int length = i2 - padEnd.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c2);
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            return sb;
        }
    }

    public static /* synthetic */ String padEnd$default(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padEnd(str, i2, c2);
    }

    public static final String padEnd(String padEnd, int i2, char c2) {
        Intrinsics.checkNotNullParameter(padEnd, "$this$padEnd");
        return StringsKt.padEnd((CharSequence) padEnd, i2, c2).toString();
    }

    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static final boolean isEmpty(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    private static final boolean isNotEmpty(CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    private static final boolean isNotBlank(CharSequence charSequence) {
        return !StringsKt.isBlank(charSequence);
    }

    private static final boolean isNullOrBlank(CharSequence charSequence) {
        return charSequence == null || StringsKt.isBlank(charSequence);
    }

    public static final CharIterator iterator(final CharSequence iterator) {
        Intrinsics.checkNotNullParameter(iterator, "$this$iterator");
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1
            private int index;

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                CharSequence charSequence = iterator;
                int i2 = this.index;
                this.index = i2 + 1;
                return charSequence.charAt(i2);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iterator.length();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifEmpty(C c2, Function0<? extends R> function0) {
        return c2.length() == 0 ? function0.invoke() : c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifBlank(C c2, Function0<? extends R> function0) {
        return StringsKt.isBlank(c2) ? function0.invoke() : c2;
    }

    public static final IntRange getIndices(CharSequence indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return new IntRange(0, indices.length() - 1);
    }

    public static final int getLastIndex(CharSequence lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return lastIndex.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence hasSurrogatePairAt, int i2) {
        Intrinsics.checkNotNullParameter(hasSurrogatePairAt, "$this$hasSurrogatePairAt");
        return i2 >= 0 && hasSurrogatePairAt.length() + (-2) >= i2 && Character.isHighSurrogate(hasSurrogatePairAt.charAt(i2)) && Character.isLowSurrogate(hasSurrogatePairAt.charAt(i2 + 1));
    }

    public static final String substring(String substring, IntRange range) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        Intrinsics.checkNotNullParameter(range, "range");
        String substring2 = substring.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring2;
    }

    public static final CharSequence subSequence(CharSequence subSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(subSequence, "$this$subSequence");
        Intrinsics.checkNotNullParameter(range, "range");
        return subSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence subSequence(String str, int i2, int i3) {
        return str.subSequence(i2, i3);
    }

    private static final String substring(CharSequence charSequence, int i2, int i3) {
        return charSequence.subSequence(i2, i3).toString();
    }

    static /* synthetic */ String substring$default(CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(i2, i3).toString();
    }

    public static final String substring(CharSequence substring, IntRange range) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        Intrinsics.checkNotNullParameter(range, "range");
        return substring.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substringBefore$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringBefore(str, c2, str2);
    }

    public static final String substringBefore(String substringBefore, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringBefore, "$this$substringBefore");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) substringBefore, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringBefore.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBefore(str, str2, str3);
    }

    public static final String substringBefore(String substringBefore, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringBefore, "$this$substringBefore");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) substringBefore, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringBefore.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfter(str, c2, str2);
    }

    public static final String substringAfter(String substringAfter, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringAfter, "$this$substringAfter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) substringAfter, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringAfter.substring(indexOf$default + 1, substringAfter.length());
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfter(str, str2, str3);
    }

    public static final String substringAfter(String substringAfter, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringAfter, "$this$substringAfter");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) substringAfter, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringAfter.substring(indexOf$default + delimiter.length(), substringAfter.length());
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringBeforeLast(str, c2, str2);
    }

    public static final String substringBeforeLast(String substringBeforeLast, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringBeforeLast, "$this$substringBeforeLast");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substringBeforeLast, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringBeforeLast.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBeforeLast(str, str2, str3);
    }

    public static final String substringBeforeLast(String substringBeforeLast, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringBeforeLast, "$this$substringBeforeLast");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substringBeforeLast, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringBeforeLast.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfterLast(str, c2, str2);
    }

    public static final String substringAfterLast(String substringAfterLast, char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringAfterLast, "$this$substringAfterLast");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substringAfterLast, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringAfterLast.substring(lastIndexOf$default + 1, substringAfterLast.length());
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfterLast(str, str2, str3);
    }

    public static final String substringAfterLast(String substringAfterLast, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(substringAfterLast, "$this$substringAfterLast");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substringAfterLast, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = substringAfterLast.substring(lastIndexOf$default + delimiter.length(), substringAfterLast.length());
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence replaceRange(CharSequence replaceRange, int i2, int i3, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(replaceRange, "$this$replaceRange");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(replaceRange, 0, i2);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        sb.append(replacement);
        sb.append(replaceRange, i3, replaceRange.length());
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    private static final String replaceRange(String str, int i2, int i3, CharSequence charSequence) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.replaceRange((CharSequence) str, i2, i3, charSequence).toString();
    }

    public static final CharSequence replaceRange(CharSequence replaceRange, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(replaceRange, "$this$replaceRange");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange(replaceRange, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    private static final String replaceRange(String str, IntRange intRange, CharSequence charSequence) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.replaceRange((CharSequence) str, intRange, charSequence).toString();
    }

    public static final CharSequence removeRange(CharSequence removeRange, int i2, int i3) {
        Intrinsics.checkNotNullParameter(removeRange, "$this$removeRange");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        } else if (i3 == i2) {
            return removeRange.subSequence(0, removeRange.length());
        } else {
            StringBuilder sb = new StringBuilder(removeRange.length() - (i3 - i2));
            sb.append(removeRange, 0, i2);
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            sb.append(removeRange, i3, removeRange.length());
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    private static final String removeRange(String str, int i2, int i3) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.removeRange((CharSequence) str, i2, i3).toString();
    }

    public static final CharSequence removeRange(CharSequence removeRange, IntRange range) {
        Intrinsics.checkNotNullParameter(removeRange, "$this$removeRange");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange(removeRange, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    private static final String removeRange(String str, IntRange intRange) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.removeRange((CharSequence) str, intRange).toString();
    }

    public static final CharSequence removePrefix(CharSequence removePrefix, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(removePrefix, "$this$removePrefix");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default(removePrefix, prefix, false, 2, (Object) null)) {
            return removePrefix.subSequence(prefix.length(), removePrefix.length());
        }
        return removePrefix.subSequence(0, removePrefix.length());
    }

    public static final String removePrefix(String removePrefix, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(removePrefix, "$this$removePrefix");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default((CharSequence) removePrefix, prefix, false, 2, (Object) null)) {
            String substring = removePrefix.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return removePrefix;
    }

    public static final CharSequence removeSuffix(CharSequence removeSuffix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(removeSuffix, "$this$removeSuffix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default(removeSuffix, suffix, false, 2, (Object) null)) {
            return removeSuffix.subSequence(0, removeSuffix.length() - suffix.length());
        }
        return removeSuffix.subSequence(0, removeSuffix.length());
    }

    public static final String removeSuffix(String removeSuffix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(removeSuffix, "$this$removeSuffix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default((CharSequence) removeSuffix, suffix, false, 2, (Object) null)) {
            String substring = removeSuffix.substring(0, removeSuffix.length() - suffix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return removeSuffix;
    }

    public static final CharSequence removeSurrounding(CharSequence removeSurrounding, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(removeSurrounding, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (removeSurrounding.length() >= prefix.length() + suffix.length() && StringsKt.startsWith$default(removeSurrounding, prefix, false, 2, (Object) null) && StringsKt.endsWith$default(removeSurrounding, suffix, false, 2, (Object) null)) {
            return removeSurrounding.subSequence(prefix.length(), removeSurrounding.length() - suffix.length());
        }
        return removeSurrounding.subSequence(0, removeSurrounding.length());
    }

    public static final String removeSurrounding(String removeSurrounding, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(removeSurrounding, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (removeSurrounding.length() >= prefix.length() + suffix.length()) {
            String str = removeSurrounding;
            if (StringsKt.startsWith$default((CharSequence) str, prefix, false, 2, (Object) null) && StringsKt.endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
                String substring = removeSurrounding.substring(prefix.length(), removeSurrounding.length() - suffix.length());
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            return removeSurrounding;
        }
        return removeSurrounding;
    }

    public static final CharSequence removeSurrounding(CharSequence removeSurrounding, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(removeSurrounding, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding(removeSurrounding, delimiter, delimiter);
    }

    public static final String removeSurrounding(String removeSurrounding, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(removeSurrounding, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding(removeSurrounding, delimiter, delimiter);
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBefore(str, c2, str2, str3);
    }

    public static final String replaceBefore(String replaceBefore, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceBefore, "$this$replaceBefore");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceBefore;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBefore(str, str2, str3, str4);
    }

    public static final String replaceBefore(String replaceBefore, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceBefore, "$this$replaceBefore");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceBefore;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfter(str, c2, str2, str3);
    }

    public static final String replaceAfter(String replaceAfter, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceAfter, "$this$replaceAfter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceAfter;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, indexOf$default + 1, replaceAfter.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfter(str, str2, str3, str4);
    }

    public static final String replaceAfter(String replaceAfter, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceAfter, "$this$replaceAfter");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceAfter;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, indexOf$default + delimiter.length(), replaceAfter.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceAfterLast(String replaceAfterLast, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceAfterLast, "$this$replaceAfterLast");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceAfterLast;
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, lastIndexOf$default + delimiter.length(), replaceAfterLast.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfterLast(str, c2, str2, str3);
    }

    public static final String replaceAfterLast(String replaceAfterLast, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceAfterLast, "$this$replaceAfterLast");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceAfterLast;
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, lastIndexOf$default + 1, replaceAfterLast.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBeforeLast(str, c2, str2, str3);
    }

    public static final String replaceBeforeLast(String replaceBeforeLast, char c2, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceBeforeLast, "$this$replaceBeforeLast");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceBeforeLast;
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBeforeLast(str, str2, str3, str4);
    }

    public static final String replaceBeforeLast(String replaceBeforeLast, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(replaceBeforeLast, "$this$replaceBeforeLast");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        String str = replaceBeforeLast;
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : StringsKt.replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
    }

    private static final String replace(CharSequence charSequence, Regex regex, String str) {
        return regex.replace(charSequence, str);
    }

    private static final String replace(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> function1) {
        return regex.replace(charSequence, function1);
    }

    private static final String replaceFirst(CharSequence charSequence, Regex regex, String str) {
        return regex.replaceFirst(charSequence, str);
    }

    private static final String replaceFirstCharWithChar(String str, Function1<? super Character, Character> function1) {
        if (str.length() > 0) {
            char charValue = function1.invoke(Character.valueOf(str.charAt(0))).charValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(charValue) + substring;
        }
        return str;
    }

    private static final String replaceFirstCharWithCharSequence(String str, Function1<? super Character, ? extends CharSequence> function1) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(function1.invoke(Character.valueOf(str.charAt(0))).toString());
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    private static final boolean matches(CharSequence charSequence, Regex regex) {
        return regex.matches(charSequence);
    }

    public static final boolean regionMatchesImpl(CharSequence regionMatchesImpl, int i2, CharSequence other, int i3, int i4, boolean z2) {
        Intrinsics.checkNotNullParameter(regionMatchesImpl, "$this$regionMatchesImpl");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > regionMatchesImpl.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!CharsKt.equals(regionMatchesImpl.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, c2, z2);
    }

    public static final boolean startsWith(CharSequence startsWith, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        return startsWith.length() > 0 && CharsKt.equals(startsWith.charAt(0), c2, z2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.endsWith(charSequence, c2, z2);
    }

    public static final boolean endsWith(CharSequence endsWith, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(endsWith, "$this$endsWith");
        return endsWith.length() > 0 && CharsKt.equals(endsWith.charAt(StringsKt.getLastIndex(endsWith)), c2, z2);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, z2);
    }

    public static final boolean startsWith(CharSequence startsWith, CharSequence prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z2 && (startsWith instanceof String) && (prefix instanceof String)) {
            return StringsKt.startsWith$default((String) startsWith, (String) prefix, false, 2, (Object) null);
        }
        return StringsKt.regionMatchesImpl(startsWith, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, i2, z2);
    }

    public static final boolean startsWith(CharSequence startsWith, CharSequence prefix, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z2 && (startsWith instanceof String) && (prefix instanceof String)) {
            return StringsKt.startsWith$default((String) startsWith, (String) prefix, i2, false, 4, (Object) null);
        }
        return StringsKt.regionMatchesImpl(startsWith, i2, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.endsWith(charSequence, charSequence2, z2);
    }

    public static final boolean endsWith(CharSequence endsWith, CharSequence suffix, boolean z2) {
        Intrinsics.checkNotNullParameter(endsWith, "$this$endsWith");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z2 && (endsWith instanceof String) && (suffix instanceof String)) {
            return StringsKt.endsWith$default((String) endsWith, (String) suffix, false, 2, (Object) null);
        }
        return StringsKt.regionMatchesImpl(endsWith, endsWith.length() - suffix.length(), suffix, 0, suffix.length(), z2);
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.commonPrefixWith(charSequence, charSequence2, z2);
    }

    public static final String commonPrefixWith(CharSequence commonPrefixWith, CharSequence other, boolean z2) {
        Intrinsics.checkNotNullParameter(commonPrefixWith, "$this$commonPrefixWith");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(commonPrefixWith.length(), other.length());
        int i2 = 0;
        while (i2 < min && CharsKt.equals(commonPrefixWith.charAt(i2), other.charAt(i2), z2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (StringsKt.hasSurrogatePairAt(commonPrefixWith, i3) || StringsKt.hasSurrogatePairAt(other, i3)) {
            i2--;
        }
        return commonPrefixWith.subSequence(0, i2).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.commonSuffixWith(charSequence, charSequence2, z2);
    }

    public static final String commonSuffixWith(CharSequence commonSuffixWith, CharSequence other, boolean z2) {
        int length;
        Intrinsics.checkNotNullParameter(commonSuffixWith, "$this$commonSuffixWith");
        Intrinsics.checkNotNullParameter(other, "other");
        int length2 = commonSuffixWith.length();
        int min = Math.min(length2, other.length());
        int i2 = 0;
        while (i2 < min && CharsKt.equals(commonSuffixWith.charAt((length2 - i2) - 1), other.charAt((length - i2) - 1), z2)) {
            i2++;
        }
        if (StringsKt.hasSurrogatePairAt(commonSuffixWith, (length2 - i2) - 1) || StringsKt.hasSurrogatePairAt(other, (length - i2) - 1)) {
            i2--;
        }
        return commonSuffixWith.subSequence(length2 - i2, length2).toString();
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOfAny(charSequence, cArr, i2, z2);
    }

    public static final int indexOfAny(CharSequence indexOfAny, char[] chars, int i2, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(indexOfAny, "$this$indexOfAny");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z2 && chars.length == 1 && (indexOfAny instanceof String)) {
            return ((String) indexOfAny).indexOf(ArraysKt.single(chars), i2);
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
        int lastIndex = StringsKt.getLastIndex(indexOfAny);
        if (coerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char charAt = indexOfAny.charAt(coerceAtLeast);
            int length = chars.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z3 = false;
                    break;
                } else if (CharsKt.equals(chars[i3], charAt, z2)) {
                    z3 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z3) {
                return coerceAtLeast;
            }
            if (coerceAtLeast == lastIndex) {
                return -1;
            }
            coerceAtLeast++;
        }
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, cArr, i2, z2);
    }

    public static final int lastIndexOfAny(CharSequence lastIndexOfAny, char[] chars, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(lastIndexOfAny, "$this$lastIndexOfAny");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z2 && chars.length == 1 && (lastIndexOfAny instanceof String)) {
            return ((String) lastIndexOfAny).lastIndexOf(ArraysKt.single(chars), i2);
        }
        for (int coerceAtMost = RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(lastIndexOfAny)); coerceAtMost >= 0; coerceAtMost--) {
            char charAt = lastIndexOfAny.charAt(coerceAtMost);
            int length = chars.length;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (CharsKt.equals(chars[i3], charAt, z2)) {
                    z3 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z3) {
                return coerceAtMost;
            }
        }
        return -1;
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i2, i3, z2, (i4 & 16) != 0 ? false : z3);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        IntRange downTo;
        if (!z3) {
            downTo = new IntRange(RangesKt.coerceAtLeast(i2, 0), RangesKt.coerceAtMost(i3, charSequence.length()));
        } else {
            downTo = RangesKt.downTo(RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(charSequence)), RangesKt.coerceAtLeast(i3, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = downTo.getFirst();
            int last = downTo.getLast();
            int step = downTo.getStep();
            if (step >= 0) {
                if (first > last) {
                    return -1;
                }
            } else if (first < last) {
                return -1;
            }
            while (!StringsKt.regionMatches((String) charSequence2, 0, (String) charSequence, first, charSequence2.length(), z2)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = downTo.getFirst();
        int last2 = downTo.getLast();
        int step2 = downTo.getStep();
        if (step2 >= 0) {
            if (first2 > last2) {
                return -1;
            }
        } else if (first2 < last2) {
            return -1;
        }
        while (!StringsKt.regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z2)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    public static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i2, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        if (!z2 && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int indexOf$default = !z3 ? StringsKt.indexOf$default(charSequence, str, i2, false, 4, (Object) null) : StringsKt.lastIndexOf$default(charSequence, str, i2, false, 4, (Object) null);
            if (indexOf$default < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(indexOf$default), str);
        }
        IntRange intRange = !z3 ? new IntRange(RangesKt.coerceAtLeast(i2, 0), charSequence.length()) : RangesKt.downTo(RangesKt.coerceAtMost(i2, StringsKt.getLastIndex(charSequence)), 0);
        if (charSequence instanceof String) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (StringsKt.regionMatches(str2, 0, (String) charSequence, first, str2.length(), z2)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return TuplesKt.to(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int step2 = intRange.getStep();
            if (step2 < 0 ? first2 >= last2 : first2 <= last2) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (StringsKt.regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z2)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return TuplesKt.to(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.findAnyOf(charSequence, collection, i2, z2);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence findAnyOf, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(findAnyOf, "$this$findAnyOf");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(findAnyOf, strings, i2, z2, false);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.findLastAnyOf(charSequence, collection, i2, z2);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence findLastAnyOf, Collection<String> strings, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(findLastAnyOf, "$this$findLastAnyOf");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(findLastAnyOf, strings, i2, z2, true);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOfAny(charSequence, collection, i2, z2);
    }

    public static final int indexOfAny(CharSequence indexOfAny, Collection<String> strings, int i2, boolean z2) {
        Integer first;
        Intrinsics.checkNotNullParameter(indexOfAny, "$this$indexOfAny");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(indexOfAny, strings, i2, z2, false);
        if (findAnyOf$StringsKt__StringsKt == null || (first = findAnyOf$StringsKt__StringsKt.getFirst()) == null) {
            return -1;
        }
        return first.intValue();
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, collection, i2, z2);
    }

    public static final int lastIndexOfAny(CharSequence lastIndexOfAny, Collection<String> strings, int i2, boolean z2) {
        Integer first;
        Intrinsics.checkNotNullParameter(lastIndexOfAny, "$this$lastIndexOfAny");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(lastIndexOfAny, strings, i2, z2, true);
        if (findAnyOf$StringsKt__StringsKt == null || (first = findAnyOf$StringsKt__StringsKt.getFirst()) == null) {
            return -1;
        }
        return first.intValue();
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOf(charSequence, c2, i2, z2);
    }

    public static final int indexOf(CharSequence indexOf, char c2, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        if (z2 || !(indexOf instanceof String)) {
            return StringsKt.indexOfAny(indexOf, new char[]{c2}, i2, z2);
        }
        return ((String) indexOf).indexOf(c2, i2);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.indexOf(charSequence, str, i2, z2);
    }

    public static final int indexOf(CharSequence indexOf, String string, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter(string, "string");
        if (z2 || !(indexOf instanceof String)) {
            return indexOf$StringsKt__StringsKt$default(indexOf, string, i2, indexOf.length(), z2, false, 16, null);
        }
        return ((String) indexOf).indexOf(string, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOf(charSequence, c2, i2, z2);
    }

    public static final int lastIndexOf(CharSequence lastIndexOf, char c2, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        if (z2 || !(lastIndexOf instanceof String)) {
            return StringsKt.lastIndexOfAny(lastIndexOf, new char[]{c2}, i2, z2);
        }
        return ((String) lastIndexOf).lastIndexOf(c2, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.getLastIndex(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.lastIndexOf(charSequence, str, i2, z2);
    }

    public static final int lastIndexOf(CharSequence lastIndexOf, String string, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        Intrinsics.checkNotNullParameter(string, "string");
        if (z2 || !(lastIndexOf instanceof String)) {
            return indexOf$StringsKt__StringsKt(lastIndexOf, string, i2, 0, z2, true);
        }
        return ((String) lastIndexOf).lastIndexOf(string, i2);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.contains(charSequence, charSequence2, z2);
    }

    public static final boolean contains(CharSequence contains, CharSequence other, boolean z2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (StringsKt.indexOf$default(contains, (String) other, 0, z2, 2, (Object) null) >= 0) {
                return true;
            }
        } else if (indexOf$StringsKt__StringsKt$default(contains, other, 0, contains.length(), z2, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.contains(charSequence, c2, z2);
    }

    public static final boolean contains(CharSequence contains, char c2, boolean z2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return StringsKt.indexOf$default(contains, c2, 0, z2, 2, (Object) null) >= 0;
    }

    private static final boolean contains(CharSequence contains, Regex regex) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return regex.containsMatchIn(contains);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i2, z2, i3);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
        }
        return new DelimitedRangesSequence(charSequence, i2, i3, new StringsKt__StringsKt$rangesDelimitedBy$2(cArr, z2));
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i2, z2, i3);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
        }
        return new DelimitedRangesSequence(charSequence, i2, i3, new StringsKt__StringsKt$rangesDelimitedBy$4(ArraysKt.asList(strArr), z2));
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.splitToSequence(charSequence, strArr, z2, i2);
    }

    public static final Sequence<String> splitToSequence(CharSequence splitToSequence, String[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(splitToSequence, "$this$splitToSequence");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(splitToSequence, delimiters, 0, z2, i2, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$1(splitToSequence));
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.split(charSequence, strArr, z2, i2);
    }

    public static final List<String> split(CharSequence split, String[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(split, "$this$split");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return split$StringsKt__StringsKt(split, str, z2, i2);
            }
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(split, delimiters, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange intRange : asIterable) {
            arrayList.add(StringsKt.substring(split, intRange));
        }
        return arrayList;
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.splitToSequence(charSequence, cArr, z2, i2);
    }

    public static final Sequence<String> splitToSequence(CharSequence splitToSequence, char[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(splitToSequence, "$this$splitToSequence");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(splitToSequence, delimiters, 0, z2, i2, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$2(splitToSequence));
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return StringsKt.split(charSequence, cArr, z2, i2);
    }

    public static final List<String> split(CharSequence split, char[] delimiters, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(split, "$this$split");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return split$StringsKt__StringsKt(split, String.valueOf(delimiters[0]), z2, i2);
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(split, delimiters, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange intRange : asIterable) {
            arrayList.add(StringsKt.substring(split, intRange));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z2, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
        }
        int indexOf = StringsKt.indexOf(charSequence, str, 0, z2);
        if (indexOf == -1 || i2 == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z3 = i2 > 0;
        ArrayList arrayList = new ArrayList(z3 ? RangesKt.coerceAtMost(i2, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i3, indexOf).toString());
            i3 = str.length() + indexOf;
            if (z3 && arrayList.size() == i2 - 1) {
                break;
            }
            indexOf = StringsKt.indexOf(charSequence, str, i3, z2);
        } while (indexOf != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    private static final List<String> split(CharSequence charSequence, Regex regex, int i2) {
        return regex.split(charSequence, i2);
    }

    static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return regex.split(charSequence, i2);
    }

    public static final Sequence<String> lineSequence(CharSequence lineSequence) {
        Intrinsics.checkNotNullParameter(lineSequence, "$this$lineSequence");
        return StringsKt.splitToSequence$default(lineSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> lines(CharSequence lines) {
        Intrinsics.checkNotNullParameter(lines, "$this$lines");
        return SequencesKt.toList(StringsKt.lineSequence(lines));
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.equals(charSequence.charAt(i2), charSequence2.charAt(i2), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean toBooleanStrict(String toBooleanStrict) {
        Intrinsics.checkNotNullParameter(toBooleanStrict, "$this$toBooleanStrict");
        int hashCode = toBooleanStrict.hashCode();
        if (hashCode == 3569038) {
            if (toBooleanStrict.equals("true")) {
                return true;
            }
        } else if (hashCode == 97196323 && toBooleanStrict.equals("false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + toBooleanStrict);
    }

    public static final Boolean toBooleanStrictOrNull(String toBooleanStrictOrNull) {
        Intrinsics.checkNotNullParameter(toBooleanStrictOrNull, "$this$toBooleanStrictOrNull");
        int hashCode = toBooleanStrictOrNull.hashCode();
        if (hashCode == 3569038) {
            if (toBooleanStrictOrNull.equals("true")) {
                return true;
            }
        } else if (hashCode == 97196323 && toBooleanStrictOrNull.equals("false")) {
            return false;
        }
        return null;
    }

    public static final CharSequence trim(CharSequence trim, char... chars) {
        Intrinsics.checkNotNullParameter(trim, "$this$trim");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = trim.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean contains = ArraysKt.contains(chars, trim.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return trim.subSequence(i2, length + 1);
    }

    public static final String trim(String trim, char... chars) {
        Intrinsics.checkNotNullParameter(trim, "$this$trim");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str = trim;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean contains = ArraysKt.contains(chars, str.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static final CharSequence trimStart(CharSequence trimStart, char... chars) {
        Intrinsics.checkNotNullParameter(trimStart, "$this$trimStart");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = trimStart.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!ArraysKt.contains(chars, trimStart.charAt(i2))) {
                return trimStart.subSequence(i2, trimStart.length());
            }
        }
        return "";
    }

    public static final String trimStart(String trimStart, char... chars) {
        String str;
        Intrinsics.checkNotNullParameter(trimStart, "$this$trimStart");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str2 = trimStart;
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (!ArraysKt.contains(chars, str2.charAt(i2))) {
                    str = str2.subSequence(i2, str2.length());
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return str.toString();
    }

    public static final CharSequence trimEnd(CharSequence trimEnd, char... chars) {
        Intrinsics.checkNotNullParameter(trimEnd, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = trimEnd.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (ArraysKt.contains(chars, trimEnd.charAt(length)));
        return trimEnd.subSequence(0, length + 1);
    }

    public static final String trimEnd(String trimEnd, char... chars) {
        String str;
        Intrinsics.checkNotNullParameter(trimEnd, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String str2 = trimEnd;
        int length = str2.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!ArraysKt.contains(chars, str2.charAt(length))) {
                    str = str2.subSequence(0, length + 1);
                    break;
                }
            } else {
                break;
            }
        }
        return str.toString();
    }

    public static final CharSequence trim(CharSequence trim) {
        Intrinsics.checkNotNullParameter(trim, "$this$trim");
        int length = trim.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean isWhitespace = CharsKt.isWhitespace(trim.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return trim.subSequence(i2, length + 1);
    }

    public static final CharSequence trimStart(CharSequence trimStart) {
        Intrinsics.checkNotNullParameter(trimStart, "$this$trimStart");
        int length = trimStart.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.isWhitespace(trimStart.charAt(i2))) {
                return trimStart.subSequence(i2, trimStart.length());
            }
        }
        return "";
    }

    public static final CharSequence trimEnd(CharSequence trimEnd) {
        Intrinsics.checkNotNullParameter(trimEnd, "$this$trimEnd");
        int length = trimEnd.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (CharsKt.isWhitespace(trimEnd.charAt(length)));
        return trimEnd.subSequence(0, length + 1);
    }
}