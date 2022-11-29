package t0;

import com.google.gson.annotations.SerializedName;
import com.payment.paymentsdk.PaymentSdkParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006%"}, d2 = {"Lt0/d;", "", "", "toString", "", "hashCode", "other", "", "equals", "callback", "Lt0/a;", "cardDetails", "", "paymentMethods", "", "cartAmount", "cartCurrency", "cartDescription", "cartId", "Lv0/a;", "customerDetails", "paypageLang", "profileId", "returnX", "Lv0/c;", "shippingDetails", "tranClass", "tranType", "Lu0/c;", "samsungPayToken", "tokenise", PaymentSdkParams.TOKEN, "tranReference", "Lt0/b;", "deviceInfo", "<init>", "(Ljava/lang/String;Lt0/a;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv0/c;Ljava/lang/String;Ljava/lang/String;Lu0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt0/b;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d {
    @SerializedName("callback")

    /* renamed from: a  reason: collision with root package name */
    private final String f457a;
    @SerializedName("card_details")

    /* renamed from: b  reason: collision with root package name */
    private final a f458b;
    @SerializedName("payment_methods")

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f459c;
    @SerializedName("cart_amount")

    /* renamed from: d  reason: collision with root package name */
    private final Double f460d;
    @SerializedName("cart_currency")

    /* renamed from: e  reason: collision with root package name */
    private final String f461e;
    @SerializedName("cart_description")

    /* renamed from: f  reason: collision with root package name */
    private final String f462f;
    @SerializedName("cart_id")

    /* renamed from: g  reason: collision with root package name */
    private final String f463g;
    @SerializedName("customer_details")

    /* renamed from: h  reason: collision with root package name */
    private final v0.a f464h;
    @SerializedName("paypage_lang")

    /* renamed from: i  reason: collision with root package name */
    private final String f465i;
    @SerializedName("profile_id")

    /* renamed from: j  reason: collision with root package name */
    private final String f466j;
    @SerializedName("return")

    /* renamed from: k  reason: collision with root package name */
    private final String f467k;
    @SerializedName("shipping_details")

    /* renamed from: l  reason: collision with root package name */
    private final v0.c f468l;
    @SerializedName("tran_class")

    /* renamed from: m  reason: collision with root package name */
    private final String f469m;
    @SerializedName("tran_type")

    /* renamed from: n  reason: collision with root package name */
    private final String f470n;
    @SerializedName("samsung_pay_token")

    /* renamed from: o  reason: collision with root package name */
    private final u0.c f471o;
    @SerializedName("tokenise")

    /* renamed from: p  reason: collision with root package name */
    private final String f472p;
    @SerializedName(PaymentSdkParams.TOKEN)

    /* renamed from: q  reason: collision with root package name */
    private final String f473q;
    @SerializedName("tran_ref")

    /* renamed from: r  reason: collision with root package name */
    private final String f474r;
    @SerializedName("device_info")

    /* renamed from: s  reason: collision with root package name */
    private final b f475s;

    public d(String str, a aVar, List<String> list, Double d2, String str2, String str3, String str4, v0.a aVar2, String str5, String str6, String str7, v0.c cVar, String str8, String str9, u0.c cVar2, String str10, String str11, String str12, b bVar) {
        this.f457a = str;
        this.f458b = aVar;
        this.f459c = list;
        this.f460d = d2;
        this.f461e = str2;
        this.f462f = str3;
        this.f463g = str4;
        this.f464h = aVar2;
        this.f465i = str5;
        this.f466j = str6;
        this.f467k = str7;
        this.f468l = cVar;
        this.f469m = str8;
        this.f470n = str9;
        this.f471o = cVar2;
        this.f472p = str10;
        this.f473q = str11;
        this.f474r = str12;
        this.f475s = bVar;
    }

    public /* synthetic */ d(String str, a aVar, List list, Double d2, String str2, String str3, String str4, v0.a aVar2, String str5, String str6, String str7, v0.c cVar, String str8, String str9, u0.c cVar2, String str10, String str11, String str12, b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : list, d2, str2, str3, str4, (i2 & 128) != 0 ? null : aVar2, str5, str6, (i2 & 1024) != 0 ? o0.b.a() : str7, (i2 & 2048) != 0 ? null : cVar, str8, str9, (i2 & 16384) != 0 ? null : cVar2, (32768 & i2) != 0 ? null : str10, (65536 & i2) != 0 ? null : str11, (131072 & i2) != 0 ? null : str12, (i2 & 262144) != 0 ? null : bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f457a, dVar.f457a) && Intrinsics.areEqual(this.f458b, dVar.f458b) && Intrinsics.areEqual(this.f459c, dVar.f459c) && Intrinsics.areEqual((Object) this.f460d, (Object) dVar.f460d) && Intrinsics.areEqual(this.f461e, dVar.f461e) && Intrinsics.areEqual(this.f462f, dVar.f462f) && Intrinsics.areEqual(this.f463g, dVar.f463g) && Intrinsics.areEqual(this.f464h, dVar.f464h) && Intrinsics.areEqual(this.f465i, dVar.f465i) && Intrinsics.areEqual(this.f466j, dVar.f466j) && Intrinsics.areEqual(this.f467k, dVar.f467k) && Intrinsics.areEqual(this.f468l, dVar.f468l) && Intrinsics.areEqual(this.f469m, dVar.f469m) && Intrinsics.areEqual(this.f470n, dVar.f470n) && Intrinsics.areEqual(this.f471o, dVar.f471o) && Intrinsics.areEqual(this.f472p, dVar.f472p) && Intrinsics.areEqual(this.f473q, dVar.f473q) && Intrinsics.areEqual(this.f474r, dVar.f474r) && Intrinsics.areEqual(this.f475s, dVar.f475s);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f457a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f458b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<String> list = this.f459c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Double d2 = this.f460d;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.f461e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f462f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f463g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        v0.a aVar2 = this.f464h;
        int hashCode8 = (hashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str5 = this.f465i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f466j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f467k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        v0.c cVar = this.f468l;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str8 = this.f469m;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f470n;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        u0.c cVar2 = this.f471o;
        int hashCode15 = (hashCode14 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str10 = this.f472p;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f473q;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f474r;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        b bVar = this.f475s;
        return hashCode18 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TransactionRequestBody(callback=" + this.f457a + ", cardDetails=" + this.f458b + ", paymentMethods=" + this.f459c + ", cartAmount=" + this.f460d + ", cartCurrency=" + this.f461e + ", cartDescription=" + this.f462f + ", cartId=" + this.f463g + ", customerDetails=" + this.f464h + ", paypageLang=" + this.f465i + ", profileId=" + this.f466j + ", returnX=" + this.f467k + ", shippingDetails=" + this.f468l + ", tranClass=" + this.f469m + ", tranType=" + this.f470n + ", samsungPayToken=" + this.f471o + ", tokenise=" + this.f472p + ", token=" + this.f473q + ", tranReference=" + this.f474r + ", deviceInfo=" + this.f475s + ')';
    }
}