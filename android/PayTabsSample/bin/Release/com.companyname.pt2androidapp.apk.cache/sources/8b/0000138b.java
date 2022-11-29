package com.payment.paymentsdk.integrationmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0004HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020-HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00064"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "Landroid/os/Parcelable;", "Lcom/payment/paymentsdk/integrationmodels/BaseBillingShippingDetails;", "city", "", "countryCode", NotificationCompat.CATEGORY_EMAIL, "name", "phone", "state", "addressLine", "zip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine", "()Ljava/lang/String;", "setAddressLine", "(Ljava/lang/String;)V", "getCity", "setCity", "getCountryCode", "setCountryCode", "getEmail", "setEmail", "getName", "setName", "getPhone", "setPhone", "getState", "setState", "getZip", "setZip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkBillingDetails extends BaseBillingShippingDetails {
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

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getAddressLine() {
        return this.addressLine;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getCity() {
        return this.city;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getEmail() {
        return this.email;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getName() {
        return this.name;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getPhone() {
        return this.phone;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getState() {
        return this.state;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return ((((((((((((((getCity() == null ? 0 : getCity().hashCode()) * 31) + (getCountryCode() == null ? 0 : getCountryCode().hashCode())) * 31) + (getEmail() == null ? 0 : getEmail().hashCode())) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getPhone() == null ? 0 : getPhone().hashCode())) * 31) + (getState() == null ? 0 : getState().hashCode())) * 31) + (getAddressLine() == null ? 0 : getAddressLine().hashCode())) * 31) + (getZip() != null ? getZip().hashCode() : 0);
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setAddressLine(String str) {
        this.addressLine = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setCity(String str) {
        this.city = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setEmail(String str) {
        this.email = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setName(String str) {
        this.name = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setPhone(String str) {
        this.phone = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setState(String str) {
        this.state = str;
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails
    public void setZip(String str) {
        this.zip = str;
    }

    public String toString() {
        return "PaymentSdkBillingDetails(city=" + getCity() + ", countryCode=" + getCountryCode() + ", email=" + getEmail() + ", name=" + getName() + ", phone=" + getPhone() + ", state=" + getState() + ", addressLine=" + getAddressLine() + ", zip=" + getZip() + ')';
    }

    @Override // com.payment.paymentsdk.integrationmodels.BaseBillingShippingDetails, android.os.Parcelable
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