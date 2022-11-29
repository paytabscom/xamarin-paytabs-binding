package u0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\t"}, d2 = {"Lu0/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c {
    @SerializedName("3DS")

    /* renamed from: a  reason: collision with root package name */
    private final a f487a;
    @SerializedName("merchant_ref")

    /* renamed from: b  reason: collision with root package name */
    private final String f488b;
    @SerializedName("method")

    /* renamed from: c  reason: collision with root package name */
    private final String f489c;
    @SerializedName("payment_card_brand")

    /* renamed from: d  reason: collision with root package name */
    private final String f490d;
    @SerializedName("payment_currency_type")

    /* renamed from: e  reason: collision with root package name */
    private final String f491e;
    @SerializedName("payment_eco_opt_in")

    /* renamed from: f  reason: collision with root package name */
    private final String f492f;
    @SerializedName("payment_last4_dpan")

    /* renamed from: g  reason: collision with root package name */
    private final String f493g;
    @SerializedName("payment_last4_fpan")

    /* renamed from: h  reason: collision with root package name */
    private final String f494h;
    @SerializedName("payment_shipping_address")

    /* renamed from: i  reason: collision with root package name */
    private final b f495i;
    @SerializedName("payment_shipping_method")

    /* renamed from: j  reason: collision with root package name */
    private final String f496j;
    @SerializedName("recurring_payment")

    /* renamed from: k  reason: collision with root package name */
    private final boolean f497k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f487a, cVar.f487a) && Intrinsics.areEqual(this.f488b, cVar.f488b) && Intrinsics.areEqual(this.f489c, cVar.f489c) && Intrinsics.areEqual(this.f490d, cVar.f490d) && Intrinsics.areEqual(this.f491e, cVar.f491e) && Intrinsics.areEqual(this.f492f, cVar.f492f) && Intrinsics.areEqual(this.f493g, cVar.f493g) && Intrinsics.areEqual(this.f494h, cVar.f494h) && Intrinsics.areEqual(this.f495i, cVar.f495i) && Intrinsics.areEqual(this.f496j, cVar.f496j) && this.f497k == cVar.f497k;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f487a.hashCode() * 31) + this.f488b.hashCode()) * 31) + this.f489c.hashCode()) * 31) + this.f490d.hashCode()) * 31) + this.f491e.hashCode()) * 31) + this.f492f.hashCode()) * 31) + this.f493g.hashCode()) * 31) + this.f494h.hashCode()) * 31) + this.f495i.hashCode()) * 31) + this.f496j.hashCode()) * 31;
        boolean z2 = this.f497k;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SamPayTokenModel(dS=" + this.f487a + ", merchantRef=" + this.f488b + ", method=" + this.f489c + ", paymentCardBrand=" + this.f490d + ", paymentCurrencyType=" + this.f491e + ", paymentEcoOptIn=" + this.f492f + ", paymentLast4Dpan=" + this.f493g + ", paymentLast4Fpan=" + this.f494h + ", paymentShippingAddress=" + this.f495i + ", paymentShippingMethod=" + this.f496j + ", recurringPayment=" + this.f497k + ')';
    }
}