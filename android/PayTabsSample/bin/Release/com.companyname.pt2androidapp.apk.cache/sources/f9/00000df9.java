package com.payment.paymentsdk.sharedclasses.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "", "responseCode", "", "responseMessage", "responseStatus", "transactionTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResponseCode", "()Ljava/lang/String;", "getResponseMessage", "getResponseStatus", "getTransactionTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentResult {
    @SerializedName("response_code")
    private final String responseCode;
    @SerializedName("response_message")
    private final String responseMessage;
    @SerializedName("response_status")
    private final String responseStatus;
    @SerializedName("transaction_time")
    private final String transactionTime;

    public PaymentResult(String str, String str2, String str3, String str4) {
        this.responseCode = str;
        this.responseMessage = str2;
        this.responseStatus = str3;
        this.transactionTime = str4;
    }

    public static /* synthetic */ PaymentResult copy$default(PaymentResult paymentResult, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentResult.responseCode;
        }
        if ((i2 & 2) != 0) {
            str2 = paymentResult.responseMessage;
        }
        if ((i2 & 4) != 0) {
            str3 = paymentResult.responseStatus;
        }
        if ((i2 & 8) != 0) {
            str4 = paymentResult.transactionTime;
        }
        return paymentResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.responseMessage;
    }

    public final String component3() {
        return this.responseStatus;
    }

    public final String component4() {
        return this.transactionTime;
    }

    public final PaymentResult copy(String str, String str2, String str3, String str4) {
        return new PaymentResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentResult) {
            PaymentResult paymentResult = (PaymentResult) obj;
            return Intrinsics.areEqual(this.responseCode, paymentResult.responseCode) && Intrinsics.areEqual(this.responseMessage, paymentResult.responseMessage) && Intrinsics.areEqual(this.responseStatus, paymentResult.responseStatus) && Intrinsics.areEqual(this.transactionTime, paymentResult.transactionTime);
        }
        return false;
    }

    public final String getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final String getResponseStatus() {
        return this.responseStatus;
    }

    public final String getTransactionTime() {
        return this.transactionTime;
    }

    public int hashCode() {
        String str = this.responseCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.responseMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.responseStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionTime;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PaymentResult(responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", responseStatus=" + this.responseStatus + ", transactionTime=" + this.transactionTime + ')';
    }
}