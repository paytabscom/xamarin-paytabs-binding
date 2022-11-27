package com.payment.paymentsdk.integrationmodels;

import com.google.gson.annotations.SerializedName;
import com.payment.paymentsdk.PaymentSdkParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001cJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003Jþ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\b\u0010M\u001a\u00020\u0003H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u0018\u0010&R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u001a\u0010&R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u0019\u0010&R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u001b\u0010&R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u0016\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 ¨\u0006N"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "", "transactionReference", "", "transactionType", "cartID", "cartDescription", "cartCurrency", "cartAmount", "payResponseReturn", "paymentResult", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;", "paymentInfo", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "redirectUrl", "errorCode", "errorMsg", PaymentSdkParams.TOKEN, "billingDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "shippingDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "isSuccess", "", "isAuthorized", "isPending", "isOnHold", "isProcessed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBillingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "getCartAmount", "()Ljava/lang/String;", "getCartCurrency", "getCartDescription", "getCartID", "getErrorCode", "getErrorMsg", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPayResponseReturn", "getPaymentInfo", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "getPaymentResult", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;", "getRedirectUrl", "getShippingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "getToken", "getTransactionReference", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "equals", "other", "hashCode", "", "toString", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkTransactionDetails {
    @SerializedName("billingDetails")
    private final PaymentSdkBillingDetails billingDetails;
    private final String cartAmount;
    private final String cartCurrency;
    private final String cartDescription;
    private final String cartID;
    private final String errorCode;
    private final String errorMsg;
    private final Boolean isAuthorized;
    private final Boolean isOnHold;
    private final Boolean isPending;
    private final Boolean isProcessed;
    private final Boolean isSuccess;
    private final String payResponseReturn;
    private final PaymentSdkPaymentInfo paymentInfo;
    private final PaymentSdkPaymentResult paymentResult;
    private final String redirectUrl;
    @SerializedName("shippingDetails")
    private final PaymentSdkShippingDetails shippingDetails;
    private final String token;
    private final String transactionReference;
    private final String transactionType;

    public PaymentSdkTransactionDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public PaymentSdkTransactionDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, PaymentSdkPaymentResult paymentSdkPaymentResult, PaymentSdkPaymentInfo paymentSdkPaymentInfo, String str8, String str9, String str10, String str11, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.transactionReference = str;
        this.transactionType = str2;
        this.cartID = str3;
        this.cartDescription = str4;
        this.cartCurrency = str5;
        this.cartAmount = str6;
        this.payResponseReturn = str7;
        this.paymentResult = paymentSdkPaymentResult;
        this.paymentInfo = paymentSdkPaymentInfo;
        this.redirectUrl = str8;
        this.errorCode = str9;
        this.errorMsg = str10;
        this.token = str11;
        this.billingDetails = paymentSdkBillingDetails;
        this.shippingDetails = paymentSdkShippingDetails;
        this.isSuccess = bool;
        this.isAuthorized = bool2;
        this.isPending = bool3;
        this.isOnHold = bool4;
        this.isProcessed = bool5;
    }

    public /* synthetic */ PaymentSdkTransactionDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, PaymentSdkPaymentResult paymentSdkPaymentResult, PaymentSdkPaymentInfo paymentSdkPaymentInfo, String str8, String str9, String str10, String str11, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : paymentSdkPaymentResult, (i2 & 256) != 0 ? null : paymentSdkPaymentInfo, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? null : str10, (i2 & 4096) != 0 ? null : str11, (i2 & 8192) != 0 ? null : paymentSdkBillingDetails, (i2 & 16384) != 0 ? null : paymentSdkShippingDetails, (i2 & 32768) != 0 ? null : bool, (i2 & 65536) != 0 ? null : bool2, (i2 & 131072) != 0 ? null : bool3, (i2 & 262144) != 0 ? null : bool4, (i2 & 524288) != 0 ? null : bool5);
    }

    public final String component1() {
        return this.transactionReference;
    }

    public final String component10() {
        return this.redirectUrl;
    }

    public final String component11() {
        return this.errorCode;
    }

    public final String component12() {
        return this.errorMsg;
    }

    public final String component13() {
        return this.token;
    }

    public final PaymentSdkBillingDetails component14() {
        return this.billingDetails;
    }

    public final PaymentSdkShippingDetails component15() {
        return this.shippingDetails;
    }

    public final Boolean component16() {
        return this.isSuccess;
    }

    public final Boolean component17() {
        return this.isAuthorized;
    }

    public final Boolean component18() {
        return this.isPending;
    }

    public final Boolean component19() {
        return this.isOnHold;
    }

    public final String component2() {
        return this.transactionType;
    }

    public final Boolean component20() {
        return this.isProcessed;
    }

    public final String component3() {
        return this.cartID;
    }

    public final String component4() {
        return this.cartDescription;
    }

    public final String component5() {
        return this.cartCurrency;
    }

    public final String component6() {
        return this.cartAmount;
    }

    public final String component7() {
        return this.payResponseReturn;
    }

    public final PaymentSdkPaymentResult component8() {
        return this.paymentResult;
    }

    public final PaymentSdkPaymentInfo component9() {
        return this.paymentInfo;
    }

    public final PaymentSdkTransactionDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, PaymentSdkPaymentResult paymentSdkPaymentResult, PaymentSdkPaymentInfo paymentSdkPaymentInfo, String str8, String str9, String str10, String str11, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        return new PaymentSdkTransactionDetails(str, str2, str3, str4, str5, str6, str7, paymentSdkPaymentResult, paymentSdkPaymentInfo, str8, str9, str10, str11, paymentSdkBillingDetails, paymentSdkShippingDetails, bool, bool2, bool3, bool4, bool5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSdkTransactionDetails) {
            PaymentSdkTransactionDetails paymentSdkTransactionDetails = (PaymentSdkTransactionDetails) obj;
            return Intrinsics.areEqual(this.transactionReference, paymentSdkTransactionDetails.transactionReference) && Intrinsics.areEqual(this.transactionType, paymentSdkTransactionDetails.transactionType) && Intrinsics.areEqual(this.cartID, paymentSdkTransactionDetails.cartID) && Intrinsics.areEqual(this.cartDescription, paymentSdkTransactionDetails.cartDescription) && Intrinsics.areEqual(this.cartCurrency, paymentSdkTransactionDetails.cartCurrency) && Intrinsics.areEqual(this.cartAmount, paymentSdkTransactionDetails.cartAmount) && Intrinsics.areEqual(this.payResponseReturn, paymentSdkTransactionDetails.payResponseReturn) && Intrinsics.areEqual(this.paymentResult, paymentSdkTransactionDetails.paymentResult) && Intrinsics.areEqual(this.paymentInfo, paymentSdkTransactionDetails.paymentInfo) && Intrinsics.areEqual(this.redirectUrl, paymentSdkTransactionDetails.redirectUrl) && Intrinsics.areEqual(this.errorCode, paymentSdkTransactionDetails.errorCode) && Intrinsics.areEqual(this.errorMsg, paymentSdkTransactionDetails.errorMsg) && Intrinsics.areEqual(this.token, paymentSdkTransactionDetails.token) && Intrinsics.areEqual(this.billingDetails, paymentSdkTransactionDetails.billingDetails) && Intrinsics.areEqual(this.shippingDetails, paymentSdkTransactionDetails.shippingDetails) && Intrinsics.areEqual(this.isSuccess, paymentSdkTransactionDetails.isSuccess) && Intrinsics.areEqual(this.isAuthorized, paymentSdkTransactionDetails.isAuthorized) && Intrinsics.areEqual(this.isPending, paymentSdkTransactionDetails.isPending) && Intrinsics.areEqual(this.isOnHold, paymentSdkTransactionDetails.isOnHold) && Intrinsics.areEqual(this.isProcessed, paymentSdkTransactionDetails.isProcessed);
        }
        return false;
    }

    public final PaymentSdkBillingDetails getBillingDetails() {
        return this.billingDetails;
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

    public final String getCartID() {
        return this.cartID;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getPayResponseReturn() {
        return this.payResponseReturn;
    }

    public final PaymentSdkPaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final PaymentSdkPaymentResult getPaymentResult() {
        return this.paymentResult;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final PaymentSdkShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTransactionReference() {
        return this.transactionReference;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        String str = this.transactionReference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cartID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cartDescription;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cartCurrency;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cartAmount;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payResponseReturn;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PaymentSdkPaymentResult paymentSdkPaymentResult = this.paymentResult;
        int hashCode8 = (hashCode7 + (paymentSdkPaymentResult == null ? 0 : paymentSdkPaymentResult.hashCode())) * 31;
        PaymentSdkPaymentInfo paymentSdkPaymentInfo = this.paymentInfo;
        int hashCode9 = (hashCode8 + (paymentSdkPaymentInfo == null ? 0 : paymentSdkPaymentInfo.hashCode())) * 31;
        String str8 = this.redirectUrl;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.errorCode;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.errorMsg;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.token;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        PaymentSdkBillingDetails paymentSdkBillingDetails = this.billingDetails;
        int hashCode14 = (hashCode13 + (paymentSdkBillingDetails == null ? 0 : paymentSdkBillingDetails.hashCode())) * 31;
        PaymentSdkShippingDetails paymentSdkShippingDetails = this.shippingDetails;
        int hashCode15 = (hashCode14 + (paymentSdkShippingDetails == null ? 0 : paymentSdkShippingDetails.hashCode())) * 31;
        Boolean bool = this.isSuccess;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAuthorized;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPending;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isOnHold;
        int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isProcessed;
        return hashCode19 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean isAuthorized() {
        return this.isAuthorized;
    }

    public final Boolean isOnHold() {
        return this.isOnHold;
    }

    public final Boolean isPending() {
        return this.isPending;
    }

    public final Boolean isProcessed() {
        return this.isProcessed;
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return "PaymentSdkTransactionDetails(transactionReference=" + this.transactionReference + ", transactionType=" + this.transactionType + ", cartId=" + this.cartID + ", cartDescription=" + this.cartDescription + ", cartCurrency=" + this.cartCurrency + ", cartAmount=" + this.cartAmount + ", payResponseReturn=" + this.payResponseReturn + ", paymentResult=" + this.paymentResult + ", paymentInfo=" + this.paymentInfo + ", redirectUrl=" + this.redirectUrl + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", token=" + this.token + ", billingDetails=" + this.billingDetails + ", shippingDetails=" + this.shippingDetails + ", isAuthorized=" + this.isAuthorized + ", isPending=" + this.isPending + ", isOnHold=" + this.isOnHold + ", isProcessed=" + this.isProcessed + ')';
    }
}