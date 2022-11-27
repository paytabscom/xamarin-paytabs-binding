package com.payment.paymentsdk.integrationmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p0.a;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÖ\u0001R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006'"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "Landroid/os/Parcelable;", "Lp0/a;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "", "city", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "countryCode", "getCountryCode", "setCountryCode", NotificationCompat.CATEGORY_EMAIL, "getEmail", "setEmail", "name", "getName", "setName", "phone", "getPhone", "setPhone", "state", "getState", "setState", "addressLine", "getAddressLine", "setAddressLine", "zip", "getZip", "setZip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkShippingDetails extends a {
    public static final Parcelable.Creator<PaymentSdkShippingDetails> CREATOR = new Creator();
    private String addressLine;
    private String city;
    private String countryCode;
    private String email;
    private String name;
    private String phone;
    private String state;
    private String zip;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSdkShippingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkShippingDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentSdkShippingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkShippingDetails[] newArray(int i2) {
            return new PaymentSdkShippingDetails[i2];
        }
    }

    public PaymentSdkShippingDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PaymentSdkShippingDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.city = str;
        this.countryCode = str2;
        this.email = str3;
        this.name = str4;
        this.phone = str5;
        this.state = str6;
        this.addressLine = str7;
        this.zip = str8;
    }

    public /* synthetic */ PaymentSdkShippingDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) == 0 ? str8 : null);
    }

    @Override // p0.a
    public String getAddressLine() {
        return this.addressLine;
    }

    @Override // p0.a
    public String getCity() {
        return this.city;
    }

    @Override // p0.a
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // p0.a
    public String getEmail() {
        return this.email;
    }

    @Override // p0.a
    public String getName() {
        return this.name;
    }

    @Override // p0.a
    public String getPhone() {
        return this.phone;
    }

    @Override // p0.a
    public String getState() {
        return this.state;
    }

    @Override // p0.a
    public String getZip() {
        return this.zip;
    }

    @Override // p0.a
    public void setAddressLine(String str) {
        this.addressLine = str;
    }

    @Override // p0.a
    public void setCity(String str) {
        this.city = str;
    }

    @Override // p0.a
    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    @Override // p0.a
    public void setEmail(String str) {
        this.email = str;
    }

    @Override // p0.a
    public void setName(String str) {
        this.name = str;
    }

    @Override // p0.a
    public void setPhone(String str) {
        this.phone = str;
    }

    @Override // p0.a
    public void setState(String str) {
        this.state = str;
    }

    @Override // p0.a
    public void setZip(String str) {
        this.zip = str;
    }

    @Override // p0.a, android.os.Parcelable
    public void writeToParcel(Parcel out, int i2) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.city);
        out.writeString(this.countryCode);
        out.writeString(this.email);
        out.writeString(this.name);
        out.writeString(this.phone);
        out.writeString(this.state);
        out.writeString(this.addressLine);
        out.writeString(this.zip);
    }
}