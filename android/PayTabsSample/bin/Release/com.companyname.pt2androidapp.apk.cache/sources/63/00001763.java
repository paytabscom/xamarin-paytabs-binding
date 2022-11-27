package u0;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\t"}, d2 = {"Lu0/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    @SerializedName(NotificationCompat.CATEGORY_EMAIL)

    /* renamed from: a  reason: collision with root package name */
    private final String f464a;
    @SerializedName("shipping")

    /* renamed from: b  reason: collision with root package name */
    private final d f465b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f464a, ((b) obj).f464a) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public int hashCode() {
        this.f464a.hashCode();
        throw null;
    }

    public String toString() {
        return "PaymentShippingAddress(email=" + this.f464a + ", shipping=" + ((Object) null) + ')';
    }
}