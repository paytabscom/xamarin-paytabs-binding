package com.payment.paymentsdk.integrationmodels;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "equals", "", "other", "hashCode", "toString", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkError {
    private final Integer code;
    private final String msg;

    public PaymentSdkError(Integer num, String str) {
        this.code = num;
        this.msg = str;
    }

    public static /* synthetic */ PaymentSdkError copy$default(PaymentSdkError paymentSdkError, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = paymentSdkError.code;
        }
        if ((i2 & 2) != 0) {
            str = paymentSdkError.msg;
        }
        return paymentSdkError.copy(num, str);
    }

    public final Integer component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final PaymentSdkError copy(Integer num, String str) {
        return new PaymentSdkError(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSdkError) {
            PaymentSdkError paymentSdkError = (PaymentSdkError) obj;
            return Intrinsics.areEqual(this.code, paymentSdkError.code) && Intrinsics.areEqual(this.msg, paymentSdkError.msg);
        }
        return false;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSdkError(code=" + this.code + ", msg=" + this.msg + ')';
    }
}