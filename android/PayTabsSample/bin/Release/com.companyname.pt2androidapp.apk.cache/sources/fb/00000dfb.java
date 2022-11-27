package com.payment.paymentsdk.sharedclasses.model.response;

import com.google.gson.annotations.SerializedName;
import com.payment.paymentsdk.PaymentSdkParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.a;
import v0.c;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bE\u0010FJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J½\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b3\u0010.R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b:\u0010.R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b;\u0010.R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b<\u0010.R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b=\u0010.R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b>\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010!\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "Lv0/a;", "component7", "Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "component8", "Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "component9", "component10", "component11", "Lv0/c;", "component12", "component13", "component14", "component15", "cartAmount", "code", "message", "cartCurrency", "cartDescription", "cartId", "customerDetails", "paymentInfo", "paymentResult", "returnX", "redirectUrl", "shippingDetails", PaymentSdkParams.TOKEN, "tranRef", "tranType", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCartAmount", "()Ljava/lang/String;", "getCode", "getMessage", "getCartCurrency", "getCartDescription", "getCartId", "Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "getPaymentInfo", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "getPaymentResult", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "getReturnX", "getRedirectUrl", "getToken", "getTranRef", "getTranType", "Lv0/a;", "getCustomerDetails", "()Lv0/a;", "Lv0/c;", "getShippingDetails", "()Lv0/c;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv0/a;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;Ljava/lang/String;Ljava/lang/String;Lv0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TransactionResponseBody {
    @SerializedName("cart_amount")
    private final String cartAmount;
    @SerializedName("cart_currency")
    private final String cartCurrency;
    @SerializedName("cart_description")
    private final String cartDescription;
    @SerializedName("cart_id")
    private final String cartId;
    @SerializedName("code")
    private final String code;
    @SerializedName("customer_details")
    private final a customerDetails;
    @SerializedName("message")
    private final String message;
    @SerializedName("payment_info")
    private final PaymentInfo paymentInfo;
    @SerializedName("payment_result")
    private final PaymentResult paymentResult;
    @SerializedName("redirect_url")
    private final String redirectUrl;
    @SerializedName("return")
    private final String returnX;
    @SerializedName("shipping_details")
    private final c shippingDetails;
    @SerializedName(PaymentSdkParams.TOKEN)
    private final String token;
    @SerializedName("tran_ref")
    private final String tranRef;
    @SerializedName("tran_type")
    private final String tranType;

    public TransactionResponseBody(String str, String str2, String str3, String str4, String str5, String str6, a aVar, PaymentInfo paymentInfo, PaymentResult paymentResult, String str7, String str8, c cVar, String str9, String str10, String str11) {
        this.cartAmount = str;
        this.code = str2;
        this.message = str3;
        this.cartCurrency = str4;
        this.cartDescription = str5;
        this.cartId = str6;
        this.customerDetails = aVar;
        this.paymentInfo = paymentInfo;
        this.paymentResult = paymentResult;
        this.returnX = str7;
        this.redirectUrl = str8;
        this.shippingDetails = cVar;
        this.token = str9;
        this.tranRef = str10;
        this.tranType = str11;
    }

    public final String component1() {
        return this.cartAmount;
    }

    public final String component10() {
        return this.returnX;
    }

    public final String component11() {
        return this.redirectUrl;
    }

    public final c component12() {
        return this.shippingDetails;
    }

    public final String component13() {
        return this.token;
    }

    public final String component14() {
        return this.tranRef;
    }

    public final String component15() {
        return this.tranType;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.cartCurrency;
    }

    public final String component5() {
        return this.cartDescription;
    }

    public final String component6() {
        return this.cartId;
    }

    public final a component7() {
        return this.customerDetails;
    }

    public final PaymentInfo component8() {
        return this.paymentInfo;
    }

    public final PaymentResult component9() {
        return this.paymentResult;
    }

    public final TransactionResponseBody copy(String str, String str2, String str3, String str4, String str5, String str6, a aVar, PaymentInfo paymentInfo, PaymentResult paymentResult, String str7, String str8, c cVar, String str9, String str10, String str11) {
        return new TransactionResponseBody(str, str2, str3, str4, str5, str6, aVar, paymentInfo, paymentResult, str7, str8, cVar, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionResponseBody) {
            TransactionResponseBody transactionResponseBody = (TransactionResponseBody) obj;
            return Intrinsics.areEqual(this.cartAmount, transactionResponseBody.cartAmount) && Intrinsics.areEqual(this.code, transactionResponseBody.code) && Intrinsics.areEqual(this.message, transactionResponseBody.message) && Intrinsics.areEqual(this.cartCurrency, transactionResponseBody.cartCurrency) && Intrinsics.areEqual(this.cartDescription, transactionResponseBody.cartDescription) && Intrinsics.areEqual(this.cartId, transactionResponseBody.cartId) && Intrinsics.areEqual(this.customerDetails, transactionResponseBody.customerDetails) && Intrinsics.areEqual(this.paymentInfo, transactionResponseBody.paymentInfo) && Intrinsics.areEqual(this.paymentResult, transactionResponseBody.paymentResult) && Intrinsics.areEqual(this.returnX, transactionResponseBody.returnX) && Intrinsics.areEqual(this.redirectUrl, transactionResponseBody.redirectUrl) && Intrinsics.areEqual(this.shippingDetails, transactionResponseBody.shippingDetails) && Intrinsics.areEqual(this.token, transactionResponseBody.token) && Intrinsics.areEqual(this.tranRef, transactionResponseBody.tranRef) && Intrinsics.areEqual(this.tranType, transactionResponseBody.tranType);
        }
        return false;
    }

    public final String getCartAmount() {
        return this.cartAmount;
    }

    public final String getCartCurrency() {
        return this.cartCurrency;
    }

    public final String getCartDescription() {
        return this.cartDescription;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getCode() {
        return this.code;
    }

    public final a getCustomerDetails() {
        return this.customerDetails;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final PaymentResult getPaymentResult() {
        return this.paymentResult;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getReturnX() {
        return this.returnX;
    }

    public final c getShippingDetails() {
        return this.shippingDetails;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTranRef() {
        return this.tranRef;
    }

    public final String getTranType() {
        return this.tranType;
    }

    public int hashCode() {
        String str = this.cartAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cartCurrency;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cartDescription;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cartId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        a aVar = this.customerDetails;
        int hashCode7 = (hashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int hashCode8 = (hashCode7 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        PaymentResult paymentResult = this.paymentResult;
        int hashCode9 = (hashCode8 + (paymentResult == null ? 0 : paymentResult.hashCode())) * 31;
        String str7 = this.returnX;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.redirectUrl;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        c cVar = this.shippingDetails;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str9 = this.token;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tranRef;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tranType;
        return hashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "TransactionResponseBody(cartAmount=" + this.cartAmount + ", code=" + this.code + ", message=" + this.message + ", cartCurrency=" + this.cartCurrency + ", cartDescription=" + this.cartDescription + ", cartId=" + this.cartId + ", customerDetails=" + this.customerDetails + ", paymentInfo=" + this.paymentInfo + ", paymentResult=" + this.paymentResult + ", returnX=" + this.returnX + ", redirectUrl=" + this.redirectUrl + ", shippingDetails=" + this.shippingDetails + ", token=" + this.token + ", tranRef=" + this.tranRef + ", tranType=" + this.tranType + ')';
    }
}