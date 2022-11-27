package u0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\t"}, d2 = {"Lu0/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    @SerializedName("data")

    /* renamed from: a  reason: collision with root package name */
    private final String f461a;
    @SerializedName("type")

    /* renamed from: b  reason: collision with root package name */
    private final String f462b;
    @SerializedName("version")

    /* renamed from: c  reason: collision with root package name */
    private final String f463c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f461a, aVar.f461a) && Intrinsics.areEqual(this.f462b, aVar.f462b) && Intrinsics.areEqual(this.f463c, aVar.f463c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f461a.hashCode() * 31) + this.f462b.hashCode()) * 31) + this.f463c.hashCode();
    }

    public String toString() {
        return "DS(data=" + this.f461a + ", type=" + this.f462b + ", version=" + this.f463c + ')';
    }
}