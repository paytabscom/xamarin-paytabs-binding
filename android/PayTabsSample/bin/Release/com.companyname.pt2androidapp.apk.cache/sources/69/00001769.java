package v0;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006\u001e"}, d2 = {"Lv0/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "city", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "country", "b", NotificationCompat.CATEGORY_EMAIL, "c", "name", "d", "phone", "e", "state", "f", "street1", "g", "zip", "h", "ip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    @SerializedName("city")

    /* renamed from: a  reason: collision with root package name */
    private final String f487a;
    @SerializedName("country")

    /* renamed from: b  reason: collision with root package name */
    private final String f488b;
    @SerializedName(NotificationCompat.CATEGORY_EMAIL)

    /* renamed from: c  reason: collision with root package name */
    private final String f489c;
    @SerializedName("ip")

    /* renamed from: d  reason: collision with root package name */
    private final String f490d;
    @SerializedName("name")

    /* renamed from: e  reason: collision with root package name */
    private final String f491e;
    @SerializedName("phone")

    /* renamed from: f  reason: collision with root package name */
    private final String f492f;
    @SerializedName("state")

    /* renamed from: g  reason: collision with root package name */
    private final String f493g;
    @SerializedName("street1")

    /* renamed from: h  reason: collision with root package name */
    private final String f494h;
    @SerializedName("zip")

    /* renamed from: i  reason: collision with root package name */
    private final String f495i;

    public c() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f487a = str;
        this.f488b = str2;
        this.f489c = str3;
        this.f490d = str4;
        this.f491e = str5;
        this.f492f = str6;
        this.f493g = str7;
        this.f494h = str8;
        this.f495i = str9;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) == 0 ? str9 : null);
    }

    public final String a() {
        return this.f487a;
    }

    public final String b() {
        return this.f488b;
    }

    public final String c() {
        return this.f489c;
    }

    public final String d() {
        return this.f491e;
    }

    public final String e() {
        return this.f492f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f487a, cVar.f487a) && Intrinsics.areEqual(this.f488b, cVar.f488b) && Intrinsics.areEqual(this.f489c, cVar.f489c) && Intrinsics.areEqual(this.f490d, cVar.f490d) && Intrinsics.areEqual(this.f491e, cVar.f491e) && Intrinsics.areEqual(this.f492f, cVar.f492f) && Intrinsics.areEqual(this.f493g, cVar.f493g) && Intrinsics.areEqual(this.f494h, cVar.f494h) && Intrinsics.areEqual(this.f495i, cVar.f495i);
        }
        return false;
    }

    public final String f() {
        return this.f493g;
    }

    public final String g() {
        return this.f494h;
    }

    public final String h() {
        return this.f495i;
    }

    public int hashCode() {
        String str = this.f487a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f488b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f489c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f490d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f491e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f492f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f493g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f494h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f495i;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "ShippingDetails(city=" + this.f487a + ", country=" + this.f488b + ", email=" + this.f489c + ", ip=" + this.f490d + ", name=" + this.f491e + ", phone=" + this.f492f + ", state=" + this.f493g + ", street1=" + this.f494h + ", zip=" + this.f495i + ')';
    }
}