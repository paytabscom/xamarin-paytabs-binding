package t0;

import com.google.gson.annotations.SerializedName;
import com.payment.paymentsdk.PaymentSdkParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006%"}, d2 = {"Lt0/d;", "", "", "toString", "", "hashCode", "other", "", "equals", "callback", "Lt0/a;", "cardDetails", "", "paymentMethods", "", "cartAmount", "cartCurrency", "cartDescription", "cartId", "Lv0/a;", "customerDetails", "paypageLang", "profileId", "returnX", "Lv0/c;", "shippingDetails", "tranClass", "tranType", "Lu0/c;", "samsungPayToken", "tokenise", PaymentSdkParams.TOKEN, "tranReference", "Lt0/b;", "deviceInfo", "<init>", "(Ljava/lang/String;Lt0/a;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv0/c;Ljava/lang/String;Ljava/lang/String;Lu0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt0/b;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    @SerializedName("callback")

    /* renamed from: a  reason: collision with root package name */
    private final String f436a;
    @SerializedName("card_details")

    /* renamed from: b  reason: collision with root package name */
    private final a f437b;
    @SerializedName("payment_methods")

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f438c;
    @SerializedName("cart_amount")

    /* renamed from: d  reason: collision with root package name */
    private final Double f439d;
    @SerializedName("cart_currency")

    /* renamed from: e  reason: collision with root package name */
    private final String f440e;
    @SerializedName("cart_description")

    /* renamed from: f  reason: collision with root package name */
    private final String f441f;
    @SerializedName("cart_id")

    /* renamed from: g  reason: collision with root package name */
    private final String f442g;
    @SerializedName("customer_details")

    /* renamed from: h  reason: collision with root package name */
    private final v0.a f443h;
    @SerializedName("paypage_lang")

    /* renamed from: i  reason: collision with root package name */
    private final String f444i;
    @SerializedName("profile_id")

    /* renamed from: j  reason: collision with root package name */
    private final String f445j;
    @SerializedName("return")

    /* renamed from: k  reason: collision with root package name */
    private final String f446k;
    @SerializedName("shipping_details")

    /* renamed from: l  reason: collision with root package name */
    private final v0.c f447l;
    @SerializedName("tran_class")

    /* renamed from: m  reason: collision with root package name */
    private final String f448m;
    @SerializedName("tran_type")

    /* renamed from: n  reason: collision with root package name */
    private final String f449n;
    @SerializedName("samsung_pay_token")

    /* renamed from: o  reason: collision with root package name */
    private final u0.c f450o;
    @SerializedName("tokenise")

    /* renamed from: p  reason: collision with root package name */
    private final String f451p;
    @SerializedName(PaymentSdkParams.TOKEN)

    /* renamed from: q  reason: collision with root package name */
    private final String f452q;
    @SerializedName("tran_ref")

    /* renamed from: r  reason: collision with root package name */
    private final String f453r;
    @SerializedName("device_info")

    /* renamed from: s  reason: collision with root package name */
    private final b f454s;

    public d(String str, a aVar, List<String> list, Double d2, String str2, String str3, String str4, v0.a aVar2, String str5, String str6, String str7, v0.c cVar, String str8, String str9, u0.c cVar2, String str10, String str11, String str12, b bVar) {
        this.f436a = str;
        this.f437b = aVar;
        this.f438c = list;
        this.f439d = d2;
        this.f440e = str2;
        this.f441f = str3;
        this.f442g = str4;
        this.f443h = aVar2;
        this.f444i = str5;
        this.f445j = str6;
        this.f446k = str7;
        this.f447l = cVar;
        this.f448m = str8;
        this.f449n = str9;
        this.f450o = cVar2;
        this.f451p = str10;
        this.f452q = str11;
        this.f453r = str12;
        this.f454s = bVar;
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
            return Intrinsics.areEqual(this.f436a, dVar.f436a) && Intrinsics.areEqual(this.f437b, dVar.f437b) && Intrinsics.areEqual(this.f438c, dVar.f438c) && Intrinsics.areEqual((Object) this.f439d, (Object) dVar.f439d) && Intrinsics.areEqual(this.f440e, dVar.f440e) && Intrinsics.areEqual(this.f441f, dVar.f441f) && Intrinsics.areEqual(this.f442g, dVar.f442g) && Intrinsics.areEqual(this.f443h, dVar.f443h) && Intrinsics.areEqual(this.f444i, dVar.f444i) && Intrinsics.areEqual(this.f445j, dVar.f445j) && Intrinsics.areEqual(this.f446k, dVar.f446k) && Intrinsics.areEqual(this.f447l, dVar.f447l) && Intrinsics.areEqual(this.f448m, dVar.f448m) && Intrinsics.areEqual(this.f449n, dVar.f449n) && Intrinsics.areEqual(this.f450o, dVar.f450o) && Intrinsics.areEqual(this.f451p, dVar.f451p) && Intrinsics.areEqual(this.f452q, dVar.f452q) && Intrinsics.areEqual(this.f453r, dVar.f453r) && Intrinsics.areEqual(this.f454s, dVar.f454s);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f436a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f437b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<String> list = this.f438c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Double d2 = this.f439d;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.f440e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f441f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f442g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        v0.a aVar2 = this.f443h;
        int hashCode8 = (hashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str5 = this.f444i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f445j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f446k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        v0.c cVar = this.f447l;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str8 = this.f448m;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f449n;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        u0.c cVar2 = this.f450o;
        int hashCode15 = (hashCode14 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str10 = this.f451p;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f452q;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f453r;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        b bVar = this.f454s;
        return hashCode18 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TransactionRequestBody(callback=" + this.f436a + ", cardDetails=" + this.f437b + ", paymentMethods=" + this.f438c + ", cartAmount=" + this.f439d + ", cartCurrency=" + this.f440e + ", cartDescription=" + this.f441f + ", cartId=" + this.f442g + ", customerDetails=" + this.f443h + ", paypageLang=" + this.f444i + ", profileId=" + this.f445j + ", returnX=" + this.f446k + ", shippingDetails=" + this.f447l + ", tranClass=" + this.f448m + ", tranType=" + this.f449n + ", samsungPayToken=" + this.f450o + ", tokenise=" + this.f451p + ", token=" + this.f452q + ", tranReference=" + this.f453r + ", deviceInfo=" + this.f454s + ')';
    }
}