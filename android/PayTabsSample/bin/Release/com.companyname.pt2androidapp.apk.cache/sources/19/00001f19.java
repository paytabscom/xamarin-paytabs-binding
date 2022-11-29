package v0;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006\u001e"}, d2 = {"Lv0/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "city", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "country", "b", NotificationCompat.CATEGORY_EMAIL, "c", "name", "d", "phone", "e", "state", "f", "street1", "g", "zip", "h", "ip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("city")

    /* renamed from: a  reason: collision with root package name */
    private final String f499a;
    @SerializedName("country")

    /* renamed from: b  reason: collision with root package name */
    private final String f500b;
    @SerializedName(NotificationCompat.CATEGORY_EMAIL)

    /* renamed from: c  reason: collision with root package name */
    private final String f501c;
    @SerializedName("ip")

    /* renamed from: d  reason: collision with root package name */
    private final String f502d;
    @SerializedName("name")

    /* renamed from: e  reason: collision with root package name */
    private final String f503e;
    @SerializedName("phone")

    /* renamed from: f  reason: collision with root package name */
    private final String f504f;
    @SerializedName("state")

    /* renamed from: g  reason: collision with root package name */
    private final String f505g;
    @SerializedName("street1")

    /* renamed from: h  reason: collision with root package name */
    private final String f506h;
    @SerializedName("zip")

    /* renamed from: i  reason: collision with root package name */
    private final String f507i;

    public a() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f499a = str;
        this.f500b = str2;
        this.f501c = str3;
        this.f502d = str4;
        this.f503e = str5;
        this.f504f = str6;
        this.f505g = str7;
        this.f506h = str8;
        this.f507i = str9;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) == 0 ? str9 : null);
    }

    public final String a() {
        return this.f499a;
    }

    public final String b() {
        return this.f500b;
    }

    public final String c() {
        return this.f501c;
    }

    public final String d() {
        return this.f503e;
    }

    public final String e() {
        return this.f504f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f499a, aVar.f499a) && Intrinsics.areEqual(this.f500b, aVar.f500b) && Intrinsics.areEqual(this.f501c, aVar.f501c) && Intrinsics.areEqual(this.f502d, aVar.f502d) && Intrinsics.areEqual(this.f503e, aVar.f503e) && Intrinsics.areEqual(this.f504f, aVar.f504f) && Intrinsics.areEqual(this.f505g, aVar.f505g) && Intrinsics.areEqual(this.f506h, aVar.f506h) && Intrinsics.areEqual(this.f507i, aVar.f507i);
        }
        return false;
    }

    public final String f() {
        return this.f505g;
    }

    public final String g() {
        return this.f506h;
    }

    public final String h() {
        return this.f507i;
    }

    public int hashCode() {
        String str = this.f499a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f500b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f501c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f502d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f503e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f504f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f505g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f506h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f507i;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "CustomerDetails(city=" + this.f499a + ", country=" + this.f500b + ", email=" + this.f501c + ", ip=" + this.f502d + ", name=" + this.f503e + ", phone=" + this.f504f + ", state=" + this.f505g + ", street1=" + this.f506h + ", zip=" + this.f507i + ')';
    }
}