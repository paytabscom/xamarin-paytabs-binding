package u0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\t"}, d2 = {"Lu0/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    @SerializedName("3DS")

    /* renamed from: a  reason: collision with root package name */
    private final a f466a;
    @SerializedName("merchant_ref")

    /* renamed from: b  reason: collision with root package name */
    private final String f467b;
    @SerializedName("method")

    /* renamed from: c  reason: collision with root package name */
    private final String f468c;
    @SerializedName("payment_card_brand")

    /* renamed from: d  reason: collision with root package name */
    private final String f469d;
    @SerializedName("payment_currency_type")

    /* renamed from: e  reason: collision with root package name */
    private final String f470e;
    @SerializedName("payment_eco_opt_in")

    /* renamed from: f  reason: collision with root package name */
    private final String f471f;
    @SerializedName("payment_last4_dpan")

    /* renamed from: g  reason: collision with root package name */
    private final String f472g;
    @SerializedName("payment_last4_fpan")

    /* renamed from: h  reason: collision with root package name */
    private final String f473h;
    @SerializedName("payment_shipping_address")

    /* renamed from: i  reason: collision with root package name */
    private final b f474i;
    @SerializedName("payment_shipping_method")

    /* renamed from: j  reason: collision with root package name */
    private final String f475j;
    @SerializedName("recurring_payment")

    /* renamed from: k  reason: collision with root package name */
    private final boolean f476k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f466a, cVar.f466a) && Intrinsics.areEqual(this.f467b, cVar.f467b) && Intrinsics.areEqual(this.f468c, cVar.f468c) && Intrinsics.areEqual(this.f469d, cVar.f469d) && Intrinsics.areEqual(this.f470e, cVar.f470e) && Intrinsics.areEqual(this.f471f, cVar.f471f) && Intrinsics.areEqual(this.f472g, cVar.f472g) && Intrinsics.areEqual(this.f473h, cVar.f473h) && Intrinsics.areEqual(this.f474i, cVar.f474i) && Intrinsics.areEqual(this.f475j, cVar.f475j) && this.f476k == cVar.f476k;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f466a.hashCode() * 31) + this.f467b.hashCode()) * 31) + this.f468c.hashCode()) * 31) + this.f469d.hashCode()) * 31) + this.f470e.hashCode()) * 31) + this.f471f.hashCode()) * 31) + this.f472g.hashCode()) * 31) + this.f473h.hashCode()) * 31) + this.f474i.hashCode()) * 31) + this.f475j.hashCode()) * 31;
        boolean z2 = this.f476k;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SamPayTokenModel(dS=" + this.f466a + ", merchantRef=" + this.f467b + ", method=" + this.f468c + ", paymentCardBrand=" + this.f469d + ", paymentCurrencyType=" + this.f470e + ", paymentEcoOptIn=" + this.f471f + ", paymentLast4Dpan=" + this.f472g + ", paymentLast4Fpan=" + this.f473h + ", paymentShippingAddress=" + this.f474i + ", paymentShippingMethod=" + this.f475j + ", recurringPayment=" + this.f476k + ')';
    }
}