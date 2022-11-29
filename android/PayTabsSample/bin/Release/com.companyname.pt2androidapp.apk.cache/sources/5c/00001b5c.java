package l0;

import android.os.Parcel;
import android.os.Parcelable;
import com.payment.paymentsdk.PaymentSdkParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001d"}, d2 = {"Ll0/a;", "Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", PaymentSdkParams.TOKEN, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "transactionRef", "d", "scheme", "b", "noMasked", "a", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0020a();

    /* renamed from: a  reason: collision with root package name */
    private final String f309a;

    /* renamed from: b  reason: collision with root package name */
    private final String f310b;

    /* renamed from: c  reason: collision with root package name */
    private final String f311c;

    /* renamed from: d  reason: collision with root package name */
    private final String f312d;

    /* renamed from: e  reason: collision with root package name */
    private final String f313e;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: l0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0020a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(String token, String transactionRef, String scheme, String type, String noMasked) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(transactionRef, "transactionRef");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(noMasked, "noMasked");
        this.f309a = token;
        this.f310b = transactionRef;
        this.f311c = scheme;
        this.f312d = type;
        this.f313e = noMasked;
    }

    public final String a() {
        return this.f313e;
    }

    public final String b() {
        return this.f311c;
    }

    public final String c() {
        return this.f309a;
    }

    public final String d() {
        return this.f310b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.payment.paymentsdk.save_cards.entities.SavedCard");
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f309a, aVar.f309a) && Intrinsics.areEqual(this.f313e, aVar.f313e);
        }
        return false;
    }

    public int hashCode() {
        return (this.f309a.hashCode() * 31) + this.f313e.hashCode();
    }

    public String toString() {
        return "SavedCard(token=" + this.f309a + ", transactionRef=" + this.f310b + ", scheme=" + this.f311c + ", type=" + this.f312d + ", noMasked=" + this.f313e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i2) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f309a);
        out.writeString(this.f310b);
        out.writeString(this.f311c);
        out.writeString(this.f312d);
        out.writeString(this.f313e);
    }
}