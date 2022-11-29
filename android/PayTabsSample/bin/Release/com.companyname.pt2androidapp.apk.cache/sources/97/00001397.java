package com.payment.paymentsdk.integrationmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006%"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "Landroid/os/Parcelable;", "Lcom/payment/paymentsdk/integrationmodels/BaseBillingShippingDetails;", "city", "", "countryCode", NotificationCompat.CATEGORY_EMAIL, "name", "phone", "state", "addressLine", "zip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine", "()Ljava/lang/String;", "setAddressLine", "(Ljava/lang/String;)V", "getCity", "setCity", "getCountryCode", "setCountryCode", "getEmail", "setEmail", "getName", "setName", "getPhone", "setPhone", "getState", "setState", "getZip", "setZip", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkShippingDetails extends BaseBillingShippingDetails {
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