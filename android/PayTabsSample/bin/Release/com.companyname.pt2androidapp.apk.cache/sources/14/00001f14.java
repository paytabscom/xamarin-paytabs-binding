package u0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\t"}, d2 = {"Lu0/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("data")

    /* renamed from: a  reason: collision with root package name */
    private final String f482a;
    @SerializedName("type")

    /* renamed from: b  reason: collision with root package name */
    private final String f483b;
    @SerializedName("version")

    /* renamed from: c  reason: collision with root package name */
    private final String f484c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f482a, aVar.f482a) && Intrinsics.areEqual(this.f483b, aVar.f483b) && Intrinsics.areEqual(this.f484c, aVar.f484c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f482a.hashCode() * 31) + this.f483b.hashCode()) * 31) + this.f484c.hashCode();
    }

    public String toString() {
        return "DS(data=" + this.f482a + ", type=" + this.f483b + ", version=" + this.f484c + ')';
    }
}