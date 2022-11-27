package t0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001b"}, d2 = {"Lt0/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "deviceId", "appId", "platform", "brand", "model", "carrier", "os", "version", "app_version", "sdk_version", "timestamp", "screenWidth", "screenHeight", "appLanguage", "deviceLanguage", "connection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    @SerializedName("device_id")

    /* renamed from: a  reason: collision with root package name */
    private final String f418a;
    @SerializedName("app_id")

    /* renamed from: b  reason: collision with root package name */
    private final String f419b;
    @SerializedName("platform")

    /* renamed from: c  reason: collision with root package name */
    private final String f420c;
    @SerializedName("brand")

    /* renamed from: d  reason: collision with root package name */
    private final String f421d;
    @SerializedName("model")

    /* renamed from: e  reason: collision with root package name */
    private final String f422e;
    @SerializedName("carrier")

    /* renamed from: f  reason: collision with root package name */
    private final String f423f;
    @SerializedName("os")

    /* renamed from: g  reason: collision with root package name */
    private final String f424g;
    @SerializedName("version")

    /* renamed from: h  reason: collision with root package name */
    private final String f425h;
    @SerializedName("app_version")

    /* renamed from: i  reason: collision with root package name */
    private final String f426i;
    @SerializedName("sdk_version")

    /* renamed from: j  reason: collision with root package name */
    private final String f427j;
    @SerializedName("timestamp")

    /* renamed from: k  reason: collision with root package name */
    private final String f428k;
    @SerializedName("screen_width")

    /* renamed from: l  reason: collision with root package name */
    private final String f429l;
    @SerializedName("screen_height")

    /* renamed from: m  reason: collision with root package name */
    private final String f430m;
    @SerializedName("app_lang")

    /* renamed from: n  reason: collision with root package name */
    private final String f431n;
    @SerializedName("device_lang")

    /* renamed from: o  reason: collision with root package name */
    private final String f432o;
    @SerializedName("connection")

    /* renamed from: p  reason: collision with root package name */
    private final String f433p;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.f418a = str;
        this.f419b = str2;
        this.f420c = str3;
        this.f421d = str4;
        this.f422e = str5;
        this.f423f = str6;
        this.f424g = str7;
        this.f425h = str8;
        this.f426i = str9;
        this.f427j = str10;
        this.f428k = str11;
        this.f429l = str12;
        this.f430m = str13;
        this.f431n = str14;
        this.f432o = str15;
        this.f433p = str16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f418a, bVar.f418a) && Intrinsics.areEqual(this.f419b, bVar.f419b) && Intrinsics.areEqual(this.f420c, bVar.f420c) && Intrinsics.areEqual(this.f421d, bVar.f421d) && Intrinsics.areEqual(this.f422e, bVar.f422e) && Intrinsics.areEqual(this.f423f, bVar.f423f) && Intrinsics.areEqual(this.f424g, bVar.f424g) && Intrinsics.areEqual(this.f425h, bVar.f425h) && Intrinsics.areEqual(this.f426i, bVar.f426i) && Intrinsics.areEqual(this.f427j, bVar.f427j) && Intrinsics.areEqual(this.f428k, bVar.f428k) && Intrinsics.areEqual(this.f429l, bVar.f429l) && Intrinsics.areEqual(this.f430m, bVar.f430m) && Intrinsics.areEqual(this.f431n, bVar.f431n) && Intrinsics.areEqual(this.f432o, bVar.f432o) && Intrinsics.areEqual(this.f433p, bVar.f433p);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f418a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f419b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f420c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f421d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f422e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f423f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f424g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f425h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f426i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f427j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f428k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f429l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f430m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f431n;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f432o;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f433p;
        return hashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        return "PtDeviceInfo(deviceId=" + this.f418a + ", appId=" + this.f419b + ", platform=" + this.f420c + ", brand=" + this.f421d + ", model=" + this.f422e + ", carrier=" + this.f423f + ", os=" + this.f424g + ", version=" + this.f425h + ", app_version=" + this.f426i + ", sdk_version=" + this.f427j + ", timestamp=" + this.f428k + ", screenWidth=" + this.f429l + ", screenHeight=" + this.f430m + ", appLanguage=" + this.f431n + ", deviceLanguage=" + this.f432o + ", connection=" + this.f433p + ')';
    }
}