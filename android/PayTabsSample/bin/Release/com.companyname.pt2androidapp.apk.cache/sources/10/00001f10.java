package t0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, d2 = {"Lt0/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "profileId", "transactionReference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c {
    @SerializedName("profile_id")

    /* renamed from: a  reason: collision with root package name */
    private final String f455a;
    @SerializedName("tran_ref")

    /* renamed from: b  reason: collision with root package name */
    private final String f456b;

    public c(String str, String str2) {
        this.f455a = str;
        this.f456b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f455a, cVar.f455a) && Intrinsics.areEqual(this.f456b, cVar.f456b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f455a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f456b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "QueryTransactionRequestBody(profileId=" + this.f455a + ", transactionReference=" + this.f456b + ')';
    }
}