package t0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001b"}, d2 = {"Lt0/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "deviceId", "appId", "platform", "brand", "model", "carrier", "os", "version", "app_version", "sdk_version", "timestamp", "screenWidth", "screenHeight", "appLanguage", "deviceLanguage", "connection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("device_id")

    /* renamed from: a  reason: collision with root package name */
    private final String f439a;
    @SerializedName("app_id")

    /* renamed from: b  reason: collision with root package name */
    private final String f440b;
    @SerializedName("platform")

    /* renamed from: c  reason: collision with root package name */
    private final String f441c;
    @SerializedName("brand")

    /* renamed from: d  reason: collision with root package name */
    private final String f442d;
    @SerializedName("model")

    /* renamed from: e  reason: collision with root package name */
    private final String f443e;
    @SerializedName("carrier")

    /* renamed from: f  reason: collision with root package name */
    private final String f444f;
    @SerializedName("os")

    /* renamed from: g  reason: collision with root package name */
    private final String f445g;
    @SerializedName("version")

    /* renamed from: h  reason: collision with root package name */
    private final String f446h;
    @SerializedName("app_version")

    /* renamed from: i  reason: collision with root package name */
    private final String f447i;
    @SerializedName("sdk_version")

    /* renamed from: j  reason: collision with root package name */
    private final String f448j;
    @SerializedName("timestamp")

    /* renamed from: k  reason: collision with root package name */
    private final String f449k;
    @SerializedName("screen_width")

    /* renamed from: l  reason: collision with root package name */
    private final String f450l;
    @SerializedName("screen_height")

    /* renamed from: m  reason: collision with root package name */
    private final String f451m;
    @SerializedName("app_lang")

    /* renamed from: n  reason: collision with root package name */
    private final String f452n;
    @SerializedName("device_lang")

    /* renamed from: o  reason: collision with root package name */
    private final String f453o;
    @SerializedName("connection")

    /* renamed from: p  reason: collision with root package name */
    private final String f454p;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.f439a = str;
        this.f440b = str2;
        this.f441c = str3;
        this.f442d = str4;
        this.f443e = str5;
        this.f444f = str6;
        this.f445g = str7;
        this.f446h = str8;
        this.f447i = str9;
        this.f448j = str10;
        this.f449k = str11;
        this.f450l = str12;
        this.f451m = str13;
        this.f452n = str14;
        this.f453o = str15;
        this.f454p = str16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f439a, bVar.f439a) && Intrinsics.areEqual(this.f440b, bVar.f440b) && Intrinsics.areEqual(this.f441c, bVar.f441c) && Intrinsics.areEqual(this.f442d, bVar.f442d) && Intrinsics.areEqual(this.f443e, bVar.f443e) && Intrinsics.areEqual(this.f444f, bVar.f444f) && Intrinsics.areEqual(this.f445g, bVar.f445g) && Intrinsics.areEqual(this.f446h, bVar.f446h) && Intrinsics.areEqual(this.f447i, bVar.f447i) && Intrinsics.areEqual(this.f448j, bVar.f448j) && Intrinsics.areEqual(this.f449k, bVar.f449k) && Intrinsics.areEqual(this.f450l, bVar.f450l) && Intrinsics.areEqual(this.f451m, bVar.f451m) && Intrinsics.areEqual(this.f452n, bVar.f452n) && Intrinsics.areEqual(this.f453o, bVar.f453o) && Intrinsics.areEqual(this.f454p, bVar.f454p);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f439a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f440b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f441c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f442d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f443e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f444f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f445g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f446h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f447i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f448j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f449k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f450l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f451m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f452n;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f453o;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f454p;
        return hashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        return "PtDeviceInfo(deviceId=" + this.f439a + ", appId=" + this.f440b + ", platform=" + this.f441c + ", brand=" + this.f442d + ", model=" + this.f443e + ", carrier=" + this.f444f + ", os=" + this.f445g + ", version=" + this.f446h + ", app_version=" + this.f447i + ", sdk_version=" + this.f448j + ", timestamp=" + this.f449k + ", screenWidth=" + this.f450l + ", screenHeight=" + this.f451m + ", appLanguage=" + this.f452n + ", deviceLanguage=" + this.f453o + ", connection=" + this.f454p + ')';
    }
}