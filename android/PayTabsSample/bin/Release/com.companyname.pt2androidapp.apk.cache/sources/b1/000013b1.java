package com.payment.paymentsdk.sharedclasses.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorResponseBody {
    @SerializedName("code")
    private final String code;
    @SerializedName("message")
    private final String msg;

    public ErrorResponseBody(String code, String msg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = code;
        this.msg = msg;
    }

    public static /* synthetic */ ErrorResponseBody copy$default(ErrorResponseBody errorResponseBody, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorResponseBody.code;
        }
        if ((i2 & 2) != 0) {
            str2 = errorResponseBody.msg;
        }
        return errorResponseBody.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final ErrorResponseBody copy(String code, String msg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ErrorResponseBody(code, msg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorResponseBody) {
            ErrorResponseBody errorResponseBody = (ErrorResponseBody) obj;
            return Intrinsics.areEqual(this.code, errorResponseBody.code) && Intrinsics.areEqual(this.msg, errorResponseBody.msg);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "ErrorResponseBody(code=" + this.code + ", msg=" + this.msg + ')';
    }
}