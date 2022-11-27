package com.payment.paymentsdk.integrationmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p0.a;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b4\u00105J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016HÖ\u0001R$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%¨\u00066"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "Landroid/os/Parcelable;", "Lp0/a;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "city", "countryCode", NotificationCompat.CATEGORY_EMAIL, "name", "phone", "state", "addressLine", "zip", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getEmail", "setEmail", "getName", "setName", "getPhone", "setPhone", "getState", "setState", "getAddressLine", "setAddressLine", "getZip", "setZip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkBillingDetails extends a {
    public static final Parcelable.Creator<PaymentSdkBillingDetails> CREATOR = new Creator();
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
    public static final class Creator implements Parcelable.Creator<PaymentSdkBillingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkBillingDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentSdkBillingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkBillingDetails[] newArray(int i2) {
            return new PaymentSdkBillingDetails[i2];
        }
    }

    public PaymentSdkBillingDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PaymentSdkBillingDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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

    public /* synthetic */ PaymentSdkBillingDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) == 0 ? str8 : "");
    }

    public final String component1() {
        return getCity();
    }

    public final String component2() {
        return getCountryCode();
    }

    public final String component3() {
        return getEmail();
    }

    public final String component4() {
        return getName();
    }

    public final String component5() {
        return getPhone();
    }

    public final String component6() {
        return getState();
    }

    public final String component7() {
        return getAddressLine();
    }

    public final String component8() {
        return getZip();
    }

    public final PaymentSdkBillingDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new PaymentSdkBillingDetails(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSdkBillingDetails) {
            PaymentSdkBillingDetails paymentSdkBillingDetails = (PaymentSdkBillingDetails) obj;
            return Intrinsics.areEqual(getCity(), paymentSdkBillingDetails.getCity()) && Intrinsics.areEqual(getCountryCode(), paymentSdkBillingDetails.getCountryCode()) && Intrinsics.areEqual(getEmail(), paymentSdkBillingDetails.getEmail()) && Intrinsics.areEqual(getName(), paymentSdkBillingDetails.getName()) && Intrinsics.areEqual(getPhone(), paymentSdkBillingDetails.getPhone()) && Intrinsics.areEqual(getState(), paymentSdkBillingDetails.getState()) && Intrinsics.areEqual(getAddressLine(), paymentSdkBillingDetails.getAddressLine()) && Intrinsics.areEqual(getZip(), paymentSdkBillingDetails.getZip());
        }
        return false;
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

    public int hashCode() {
        return ((((((((((((((getCity() == null ? 0 : getCity().hashCode()) * 31) + (getCountryCode() == null ? 0 : getCountryCode().hashCode())) * 31) + (getEmail() == null ? 0 : getEmail().hashCode())) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getPhone() == null ? 0 : getPhone().hashCode())) * 31) + (getState() == null ? 0 : getState().hashCode())) * 31) + (getAddressLine() == null ? 0 : getAddressLine().hashCode())) * 31) + (getZip() != null ? getZip().hashCode() : 0);
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

    public String toString() {
        return "PaymentSdkBillingDetails(city=" + getCity() + ", countryCode=" + getCountryCode() + ", email=" + getEmail() + ", name=" + getName() + ", phone=" + getPhone() + ", state=" + getState() + ", addressLine=" + getAddressLine() + ", zip=" + getZip() + ')';
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