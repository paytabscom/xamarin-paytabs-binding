package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "", "cardScheme", "", "cardType", "paymentDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardScheme", "()Ljava/lang/String;", "getCardType", "getPaymentDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkPaymentInfo {
    private final String cardScheme;
    private final String cardType;
    private final String paymentDescription;

    public PaymentSdkPaymentInfo(String str, String str2, String str3) {
        this.cardScheme = str;
        this.cardType = str2;
        this.paymentDescription = str3;
    }

    public static /* synthetic */ PaymentSdkPaymentInfo copy$default(PaymentSdkPaymentInfo paymentSdkPaymentInfo, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentSdkPaymentInfo.cardScheme;
        }
        if ((i2 & 2) != 0) {
            str2 = paymentSdkPaymentInfo.cardType;
        }
        if ((i2 & 4) != 0) {
            str3 = paymentSdkPaymentInfo.paymentDescription;
        }
        return paymentSdkPaymentInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cardScheme;
    }

    public final String component2() {
        return this.cardType;
    }

    public final String component3() {
        return this.paymentDescription;
    }

    public final PaymentSdkPaymentInfo copy(String str, String str2, String str3) {
        return new PaymentSdkPaymentInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSdkPaymentInfo) {
            PaymentSdkPaymentInfo paymentSdkPaymentInfo = (PaymentSdkPaymentInfo) obj;
            return Intrinsics.areEqual(this.cardScheme, paymentSdkPaymentInfo.cardScheme) && Intrinsics.areEqual(this.cardType, paymentSdkPaymentInfo.cardType) && Intrinsics.areEqual(this.paymentDescription, paymentSdkPaymentInfo.paymentDescription);
        }
        return false;
    }

    public final String getCardScheme() {
        return this.cardScheme;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getPaymentDescription() {
        return this.paymentDescription;
    }

    public int hashCode() {
        String str = this.cardScheme;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentDescription;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSdkPaymentInfo(cardScheme=" + this.cardScheme + ", cardType=" + this.cardType + ", paymentDescription=" + this.paymentDescription + ')';
    }
}