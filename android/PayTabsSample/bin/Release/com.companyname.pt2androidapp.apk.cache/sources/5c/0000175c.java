package t0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0010"}, d2 = {"Lt0/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "cvv", "expiryMonth", "expiryYear", "pan", "maskedCard", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    @SerializedName("cvv")

    /* renamed from: a  reason: collision with root package name */
    private final String f413a;
    @SerializedName("expiry_month")

    /* renamed from: b  reason: collision with root package name */
    private final Integer f414b;
    @SerializedName("expiry_year")

    /* renamed from: c  reason: collision with root package name */
    private final Integer f415c;
    @SerializedName("pan")

    /* renamed from: d  reason: collision with root package name */
    private final String f416d;
    @SerializedName("masked_card")

    /* renamed from: e  reason: collision with root package name */
    private final String f417e;

    public a(String cvv, Integer num, Integer num2, String str, String str2) {
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f413a = cvv;
        this.f414b = num;
        this.f415c = num2;
        this.f416d = str;
        this.f417e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f413a, aVar.f413a) && Intrinsics.areEqual(this.f414b, aVar.f414b) && Intrinsics.areEqual(this.f415c, aVar.f415c) && Intrinsics.areEqual(this.f416d, aVar.f416d) && Intrinsics.areEqual(this.f417e, aVar.f417e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f413a.hashCode() * 31;
        Integer num = this.f414b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f415c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f416d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f417e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CardDetails(cvv=" + this.f413a + ", expiryMonth=" + this.f414b + ", expiryYear=" + this.f415c + ", pan=" + this.f416d + ", maskedCard=" + this.f417e + ')';
    }
}