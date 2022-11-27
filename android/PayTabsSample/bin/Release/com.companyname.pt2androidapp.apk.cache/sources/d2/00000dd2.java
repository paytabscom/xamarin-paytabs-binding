package com.payment.paymentsdk.integrationmodels;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.payment.paymentsdk.PaymentSdkParams;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTokenFormat;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u001e\u0012\b\b\u0002\u0010)\u001a\u00020\u001e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010,J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010m\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010n\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u001eHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000e\u0010t\u001a\u00020\u001eHÀ\u0003¢\u0006\u0002\buJ\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000e\u0010w\u001a\u00020\u001eHÀ\u0003¢\u0006\u0002\bxJ\u0010\u0010y\u001a\u0004\u0018\u00010+HÀ\u0003¢\u0006\u0002\bzJ\u000b\u0010{\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0084\u0003\u0010\u0081\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u001e2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0003\u0010\u0082\u0001J\u000b\u0010\u0083\u0001\u001a\u00030\u0084\u0001HÖ\u0001J\u0016\u0010\u0085\u0001\u001a\u00020\u001e2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\u000b\u0010\u0088\u0001\u001a\u00030\u0084\u0001HÖ\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0003HÖ\u0001J\u001f\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u0084\u0001HÖ\u0001R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0015\u0010 \u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0011\u0010\"\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010&\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bB\u0010>\"\u0004\bC\u0010DR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0014\u0010)\u001a\u00020\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0016\u0010*\u001a\u0004\u0018\u00010+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bS\u0010>\"\u0004\bT\u0010DR\u0016\u0010(\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bV\u0010>\"\u0004\bW\u0010DR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00105¨\u0006\u008f\u0001"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "Landroid/os/Parcelable;", "profileId", "", "serverKey", "clientKey", "billingDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "shippingDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "locale", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "cartId", "currencyCode", "cartDescription", "transactionType", "transactionClass", "amount", "", "screenTitle", "customerIp", "tokeniseType", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "tokenFormat", PaymentSdkParams.TOKEN, "transactionReference", "logoBitmap", "Landroid/graphics/Bitmap;", "logoUrl", "showBillingInfo", "", "showShippingInfo", "forceShippingInfoValidation", "merchantCountry", "hideCardScanner", "alternativePaymentMethods", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkApms;", "linkBillingNameWithCardHolderName", "callback", "showSaveCardsUI", "request3DS", "savedCardInfo", "Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)V", "getAlternativePaymentMethods", "()Ljava/util/List;", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBillingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "getCallback", "()Ljava/lang/String;", "setCallback", "(Ljava/lang/String;)V", "getCartDescription", "getCartId", "getClientKey", "getCurrencyCode", "getCustomerIp", "getForceShippingInfoValidation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHideCardScanner", "()Z", "getLinkBillingNameWithCardHolderName", "setLinkBillingNameWithCardHolderName", "(Ljava/lang/Boolean;)V", "getLocale", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "getLogoBitmap", "()Landroid/graphics/Bitmap;", "getLogoUrl", "getMerchantCountry", "getProfileId", "getRequest3DS$paymentsdk_release", "getSavedCardInfo$paymentsdk_release", "()Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;", "getScreenTitle", "getServerKey", "getShippingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "getShowBillingInfo", "setShowBillingInfo", "getShowSaveCardsUI$paymentsdk_release", "getShowShippingInfo", "setShowShippingInfo", "getToken", "getTokenFormat", "getTokeniseType", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "getTransactionClass", "getTransactionReference", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component29$paymentsdk_release", "component3", "component30", "component30$paymentsdk_release", "component31", "component31$paymentsdk_release", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkConfigurationDetails implements Parcelable {
    public static final Parcelable.Creator<PaymentSdkConfigurationDetails> CREATOR = new Creator();
    private final List<PaymentSdkApms> alternativePaymentMethods;
    private final Double amount;
    private final PaymentSdkBillingDetails billingDetails;
    private String callback;
    private final String cartDescription;
    private final String cartId;
    private final String clientKey;
    private final String currencyCode;
    private final String customerIp;
    private final Boolean forceShippingInfoValidation;
    private final boolean hideCardScanner;
    private Boolean linkBillingNameWithCardHolderName;
    private final PaymentSdkLanguageCode locale;
    private final Bitmap logoBitmap;
    private final String logoUrl;
    private final String merchantCountry;
    private final String profileId;
    private final boolean request3DS;
    private final PaymentSDKSavedCardInfo savedCardInfo;
    private final String screenTitle;
    private final String serverKey;
    private final PaymentSdkShippingDetails shippingDetails;
    private Boolean showBillingInfo;
    private final boolean showSaveCardsUI;
    private Boolean showShippingInfo;
    private final String token;
    private final String tokenFormat;
    private final PaymentSdkTokenise tokeniseType;
    private final String transactionClass;
    private final String transactionReference;
    private final String transactionType;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSdkConfigurationDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkConfigurationDetails createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool;
            ArrayList arrayList;
            String str;
            Boolean valueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            PaymentSdkBillingDetails createFromParcel = parcel.readInt() == 0 ? null : PaymentSdkBillingDetails.CREATOR.createFromParcel(parcel);
            PaymentSdkShippingDetails createFromParcel2 = parcel.readInt() == 0 ? null : PaymentSdkShippingDetails.CREATOR.createFromParcel(parcel);
            PaymentSdkLanguageCode createFromParcel3 = parcel.readInt() == 0 ? null : PaymentSdkLanguageCode.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            PaymentSdkTokenise valueOf6 = parcel.readInt() == 0 ? null : PaymentSdkTokenise.valueOf(parcel.readString());
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            Bitmap bitmap = (Bitmap) parcel.readParcelable(PaymentSdkConfigurationDetails.class.getClassLoader());
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString15 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = valueOf;
                str = readString9;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                bool = valueOf;
                arrayList = new ArrayList(readInt);
                str = readString9;
                int i2 = 0;
                while (i2 != readInt) {
                    arrayList.add(PaymentSdkApms.valueOf(parcel.readString()));
                    i2++;
                    readInt = readInt;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PaymentSdkConfigurationDetails(readString, readString2, readString3, createFromParcel, createFromParcel2, createFromParcel3, readString4, readString5, readString6, readString7, readString8, valueOf5, str, readString10, valueOf6, readString11, readString12, readString13, bitmap, readString14, bool, valueOf2, valueOf3, readString15, z2, arrayList, valueOf4, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentSDKSavedCardInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSdkConfigurationDetails[] newArray(int i2) {
            return new PaymentSdkConfigurationDetails[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSdkConfigurationDetails(String str, String str2, String str3, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, PaymentSdkLanguageCode paymentSdkLanguageCode, String str4, String str5, String str6, String str7, String str8, Double d2, String str9, String str10, PaymentSdkTokenise paymentSdkTokenise, String str11, String str12, String str13, Bitmap bitmap, String str14, Boolean bool, Boolean bool2, Boolean bool3, String str15, boolean z2, List<? extends PaymentSdkApms> list, Boolean bool4, String str16, boolean z3, boolean z4, PaymentSDKSavedCardInfo paymentSDKSavedCardInfo) {
        this.profileId = str;
        this.serverKey = str2;
        this.clientKey = str3;
        this.billingDetails = paymentSdkBillingDetails;
        this.shippingDetails = paymentSdkShippingDetails;
        this.locale = paymentSdkLanguageCode;
        this.cartId = str4;
        this.currencyCode = str5;
        this.cartDescription = str6;
        this.transactionType = str7;
        this.transactionClass = str8;
        this.amount = d2;
        this.screenTitle = str9;
        this.customerIp = str10;
        this.tokeniseType = paymentSdkTokenise;
        this.tokenFormat = str11;
        this.token = str12;
        this.transactionReference = str13;
        this.logoBitmap = bitmap;
        this.logoUrl = str14;
        this.showBillingInfo = bool;
        this.showShippingInfo = bool2;
        this.forceShippingInfoValidation = bool3;
        this.merchantCountry = str15;
        this.hideCardScanner = z2;
        this.alternativePaymentMethods = list;
        this.linkBillingNameWithCardHolderName = bool4;
        this.callback = str16;
        this.showSaveCardsUI = z3;
        this.request3DS = z4;
        this.savedCardInfo = paymentSDKSavedCardInfo;
    }

    public /* synthetic */ PaymentSdkConfigurationDetails(String str, String str2, String str3, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, PaymentSdkLanguageCode paymentSdkLanguageCode, String str4, String str5, String str6, String str7, String str8, Double d2, String str9, String str10, PaymentSdkTokenise paymentSdkTokenise, String str11, String str12, String str13, Bitmap bitmap, String str14, Boolean bool, Boolean bool2, Boolean bool3, String str15, boolean z2, List list, Boolean bool4, String str16, boolean z3, boolean z4, PaymentSDKSavedCardInfo paymentSDKSavedCardInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, paymentSdkBillingDetails, (i2 & 16) != 0 ? null : paymentSdkShippingDetails, (i2 & 32) != 0 ? PaymentSdkLanguageCode.DEFAULT : paymentSdkLanguageCode, (i2 & 64) != 0 ? "" : str4, str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, d2, (i2 & 4096) != 0 ? "" : str9, str10, (i2 & 16384) != 0 ? PaymentSdkTokenise.NONE : paymentSdkTokenise, (32768 & i2) != 0 ? new PaymentSdkTokenFormat.Hex32Format().getValue() : str11, str12, str13, bitmap, str14, (1048576 & i2) != 0 ? Boolean.TRUE : bool, (2097152 & i2) != 0 ? Boolean.TRUE : bool2, (4194304 & i2) != 0 ? Boolean.TRUE : bool3, str15, z2, (33554432 & i2) != 0 ? CollectionsKt.emptyList() : list, (67108864 & i2) != 0 ? Boolean.TRUE : bool4, (134217728 & i2) != 0 ? null : str16, (268435456 & i2) != 0 ? false : z3, (536870912 & i2) != 0 ? false : z4, (i2 & BasicMeasure.EXACTLY) != 0 ? null : paymentSDKSavedCardInfo);
    }

    public final String component1() {
        return this.profileId;
    }

    public final String component10() {
        return this.transactionType;
    }

    public final String component11() {
        return this.transactionClass;
    }

    public final Double component12() {
        return this.amount;
    }

    public final String component13() {
        return this.screenTitle;
    }

    public final String component14() {
        return this.customerIp;
    }

    public final PaymentSdkTokenise component15() {
        return this.tokeniseType;
    }

    public final String component16() {
        return this.tokenFormat;
    }

    public final String component17() {
        return this.token;
    }

    public final String component18() {
        return this.transactionReference;
    }

    public final Bitmap component19() {
        return this.logoBitmap;
    }

    public final String component2() {
        return this.serverKey;
    }

    public final String component20() {
        return this.logoUrl;
    }

    public final Boolean component21() {
        return this.showBillingInfo;
    }

    public final Boolean component22() {
        return this.showShippingInfo;
    }

    public final Boolean component23() {
        return this.forceShippingInfoValidation;
    }

    public final String component24() {
        return this.merchantCountry;
    }

    public final boolean component25() {
        return this.hideCardScanner;
    }

    public final List<PaymentSdkApms> component26() {
        return this.alternativePaymentMethods;
    }

    public final Boolean component27() {
        return this.linkBillingNameWithCardHolderName;
    }

    public final String component28() {
        return this.callback;
    }

    public final boolean component29$paymentsdk_release() {
        return this.showSaveCardsUI;
    }

    public final String component3() {
        return this.clientKey;
    }

    public final boolean component30$paymentsdk_release() {
        return this.request3DS;
    }

    public final PaymentSDKSavedCardInfo component31$paymentsdk_release() {
        return this.savedCardInfo;
    }

    public final PaymentSdkBillingDetails component4() {
        return this.billingDetails;
    }

    public final PaymentSdkShippingDetails component5() {
        return this.shippingDetails;
    }

    public final PaymentSdkLanguageCode component6() {
        return this.locale;
    }

    public final String component7() {
        return this.cartId;
    }

    public final String component8() {
        return this.currencyCode;
    }

    public final String component9() {
        return this.cartDescription;
    }

    public final PaymentSdkConfigurationDetails copy(String str, String str2, String str3, PaymentSdkBillingDetails paymentSdkBillingDetails, PaymentSdkShippingDetails paymentSdkShippingDetails, PaymentSdkLanguageCode paymentSdkLanguageCode, String str4, String str5, String str6, String str7, String str8, Double d2, String str9, String str10, PaymentSdkTokenise paymentSdkTokenise, String str11, String str12, String str13, Bitmap bitmap, String str14, Boolean bool, Boolean bool2, Boolean bool3, String str15, boolean z2, List<? extends PaymentSdkApms> list, Boolean bool4, String str16, boolean z3, boolean z4, PaymentSDKSavedCardInfo paymentSDKSavedCardInfo) {
        return new PaymentSdkConfigurationDetails(str, str2, str3, paymentSdkBillingDetails, paymentSdkShippingDetails, paymentSdkLanguageCode, str4, str5, str6, str7, str8, d2, str9, str10, paymentSdkTokenise, str11, str12, str13, bitmap, str14, bool, bool2, bool3, str15, z2, list, bool4, str16, z3, z4, paymentSDKSavedCardInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSdkConfigurationDetails) {
            PaymentSdkConfigurationDetails paymentSdkConfigurationDetails = (PaymentSdkConfigurationDetails) obj;
            return Intrinsics.areEqual(this.profileId, paymentSdkConfigurationDetails.profileId) && Intrinsics.areEqual(this.serverKey, paymentSdkConfigurationDetails.serverKey) && Intrinsics.areEqual(this.clientKey, paymentSdkConfigurationDetails.clientKey) && Intrinsics.areEqual(this.billingDetails, paymentSdkConfigurationDetails.billingDetails) && Intrinsics.areEqual(this.shippingDetails, paymentSdkConfigurationDetails.shippingDetails) && this.locale == paymentSdkConfigurationDetails.locale && Intrinsics.areEqual(this.cartId, paymentSdkConfigurationDetails.cartId) && Intrinsics.areEqual(this.currencyCode, paymentSdkConfigurationDetails.currencyCode) && Intrinsics.areEqual(this.cartDescription, paymentSdkConfigurationDetails.cartDescription) && Intrinsics.areEqual(this.transactionType, paymentSdkConfigurationDetails.transactionType) && Intrinsics.areEqual(this.transactionClass, paymentSdkConfigurationDetails.transactionClass) && Intrinsics.areEqual((Object) this.amount, (Object) paymentSdkConfigurationDetails.amount) && Intrinsics.areEqual(this.screenTitle, paymentSdkConfigurationDetails.screenTitle) && Intrinsics.areEqual(this.customerIp, paymentSdkConfigurationDetails.customerIp) && this.tokeniseType == paymentSdkConfigurationDetails.tokeniseType && Intrinsics.areEqual(this.tokenFormat, paymentSdkConfigurationDetails.tokenFormat) && Intrinsics.areEqual(this.token, paymentSdkConfigurationDetails.token) && Intrinsics.areEqual(this.transactionReference, paymentSdkConfigurationDetails.transactionReference) && Intrinsics.areEqual(this.logoBitmap, paymentSdkConfigurationDetails.logoBitmap) && Intrinsics.areEqual(this.logoUrl, paymentSdkConfigurationDetails.logoUrl) && Intrinsics.areEqual(this.showBillingInfo, paymentSdkConfigurationDetails.showBillingInfo) && Intrinsics.areEqual(this.showShippingInfo, paymentSdkConfigurationDetails.showShippingInfo) && Intrinsics.areEqual(this.forceShippingInfoValidation, paymentSdkConfigurationDetails.forceShippingInfoValidation) && Intrinsics.areEqual(this.merchantCountry, paymentSdkConfigurationDetails.merchantCountry) && this.hideCardScanner == paymentSdkConfigurationDetails.hideCardScanner && Intrinsics.areEqual(this.alternativePaymentMethods, paymentSdkConfigurationDetails.alternativePaymentMethods) && Intrinsics.areEqual(this.linkBillingNameWithCardHolderName, paymentSdkConfigurationDetails.linkBillingNameWithCardHolderName) && Intrinsics.areEqual(this.callback, paymentSdkConfigurationDetails.callback) && this.showSaveCardsUI == paymentSdkConfigurationDetails.showSaveCardsUI && this.request3DS == paymentSdkConfigurationDetails.request3DS && Intrinsics.areEqual(this.savedCardInfo, paymentSdkConfigurationDetails.savedCardInfo);
        }
        return false;
    }

    public final List<PaymentSdkApms> getAlternativePaymentMethods() {
        return this.alternativePaymentMethods;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final PaymentSdkBillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final String getCallback() {
        return this.callback;
    }

    public final String getCartDescription() {
        return this.cartDescription;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCustomerIp() {
        return this.customerIp;
    }

    public final Boolean getForceShippingInfoValidation() {
        return this.forceShippingInfoValidation;
    }

    public final boolean getHideCardScanner() {
        return this.hideCardScanner;
    }

    public final Boolean getLinkBillingNameWithCardHolderName() {
        return this.linkBillingNameWithCardHolderName;
    }

    public final PaymentSdkLanguageCode getLocale() {
        return this.locale;
    }

    public final Bitmap getLogoBitmap() {
        return this.logoBitmap;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMerchantCountry() {
        return this.merchantCountry;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getRequest3DS$paymentsdk_release() {
        return this.request3DS;
    }

    public final PaymentSDKSavedCardInfo getSavedCardInfo$paymentsdk_release() {
        return this.savedCardInfo;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public final String getServerKey() {
        return this.serverKey;
    }

    public final PaymentSdkShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final Boolean getShowBillingInfo() {
        return this.showBillingInfo;
    }

    public final boolean getShowSaveCardsUI$paymentsdk_release() {
        return this.showSaveCardsUI;
    }

    public final Boolean getShowShippingInfo() {
        return this.showShippingInfo;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenFormat() {
        return this.tokenFormat;
    }

    public final PaymentSdkTokenise getTokeniseType() {
        return this.tokeniseType;
    }

    public final String getTransactionClass() {
        return this.transactionClass;
    }

    public final String getTransactionReference() {
        return this.transactionReference;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.profileId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentSdkBillingDetails paymentSdkBillingDetails = this.billingDetails;
        int hashCode4 = (hashCode3 + (paymentSdkBillingDetails == null ? 0 : paymentSdkBillingDetails.hashCode())) * 31;
        PaymentSdkShippingDetails paymentSdkShippingDetails = this.shippingDetails;
        int hashCode5 = (hashCode4 + (paymentSdkShippingDetails == null ? 0 : paymentSdkShippingDetails.hashCode())) * 31;
        PaymentSdkLanguageCode paymentSdkLanguageCode = this.locale;
        int hashCode6 = (hashCode5 + (paymentSdkLanguageCode == null ? 0 : paymentSdkLanguageCode.hashCode())) * 31;
        String str4 = this.cartId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyCode;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cartDescription;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.transactionType;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transactionClass;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d2 = this.amount;
        int hashCode12 = (hashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str9 = this.screenTitle;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.customerIp;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        PaymentSdkTokenise paymentSdkTokenise = this.tokeniseType;
        int hashCode15 = (hashCode14 + (paymentSdkTokenise == null ? 0 : paymentSdkTokenise.hashCode())) * 31;
        String str11 = this.tokenFormat;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.token;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transactionReference;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Bitmap bitmap = this.logoBitmap;
        int hashCode19 = (hashCode18 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str14 = this.logoUrl;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.showBillingInfo;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showShippingInfo;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.forceShippingInfoValidation;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str15 = this.merchantCountry;
        int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        boolean z2 = this.hideCardScanner;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode24 + i2) * 31;
        List<PaymentSdkApms> list = this.alternativePaymentMethods;
        int hashCode25 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.linkBillingNameWithCardHolderName;
        int hashCode26 = (hashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str16 = this.callback;
        int hashCode27 = (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        boolean z3 = this.showSaveCardsUI;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode27 + i4) * 31;
        boolean z4 = this.request3DS;
        int i6 = (i5 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        PaymentSDKSavedCardInfo paymentSDKSavedCardInfo = this.savedCardInfo;
        return i6 + (paymentSDKSavedCardInfo != null ? paymentSDKSavedCardInfo.hashCode() : 0);
    }

    public final void setCallback(String str) {
        this.callback = str;
    }

    public final void setLinkBillingNameWithCardHolderName(Boolean bool) {
        this.linkBillingNameWithCardHolderName = bool;
    }

    public final void setShowBillingInfo(Boolean bool) {
        this.showBillingInfo = bool;
    }

    public final void setShowShippingInfo(Boolean bool) {
        this.showShippingInfo = bool;
    }

    public String toString() {
        return "PaymentSdkConfigurationDetails(profileId=" + this.profileId + ", serverKey=" + this.serverKey + ", clientKey=" + this.clientKey + ", billingDetails=" + this.billingDetails + ", shippingDetails=" + this.shippingDetails + ", locale=" + this.locale + ", cartId=" + this.cartId + ", currencyCode=" + this.currencyCode + ", cartDescription=" + this.cartDescription + ", transactionType=" + this.transactionType + ", transactionClass=" + this.transactionClass + ", amount=" + this.amount + ", screenTitle=" + this.screenTitle + ", customerIp=" + this.customerIp + ", tokeniseType=" + this.tokeniseType + ", tokenFormat=" + this.tokenFormat + ", token=" + this.token + ", transactionReference=" + this.transactionReference + ", logoBitmap=" + this.logoBitmap + ", logoUrl=" + this.logoUrl + ", showBillingInfo=" + this.showBillingInfo + ", showShippingInfo=" + this.showShippingInfo + ", forceShippingInfoValidation=" + this.forceShippingInfoValidation + ", merchantCountry=" + this.merchantCountry + ", hideCardScanner=" + this.hideCardScanner + ", alternativePaymentMethods=" + this.alternativePaymentMethods + ", linkBillingNameWithCardHolderName=" + this.linkBillingNameWithCardHolderName + ", callback=" + this.callback + ", showSaveCardsUI=" + this.showSaveCardsUI + ", request3DS=" + this.request3DS + ", savedCardInfo=" + this.savedCardInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i2) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.profileId);
        out.writeString(this.serverKey);
        out.writeString(this.clientKey);
        PaymentSdkBillingDetails paymentSdkBillingDetails = this.billingDetails;
        if (paymentSdkBillingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentSdkBillingDetails.writeToParcel(out, i2);
        }
        PaymentSdkShippingDetails paymentSdkShippingDetails = this.shippingDetails;
        if (paymentSdkShippingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentSdkShippingDetails.writeToParcel(out, i2);
        }
        PaymentSdkLanguageCode paymentSdkLanguageCode = this.locale;
        if (paymentSdkLanguageCode == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentSdkLanguageCode.writeToParcel(out, i2);
        }
        out.writeString(this.cartId);
        out.writeString(this.currencyCode);
        out.writeString(this.cartDescription);
        out.writeString(this.transactionType);
        out.writeString(this.transactionClass);
        Double d2 = this.amount;
        if (d2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d2.doubleValue());
        }
        out.writeString(this.screenTitle);
        out.writeString(this.customerIp);
        PaymentSdkTokenise paymentSdkTokenise = this.tokeniseType;
        if (paymentSdkTokenise == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(paymentSdkTokenise.name());
        }
        out.writeString(this.tokenFormat);
        out.writeString(this.token);
        out.writeString(this.transactionReference);
        out.writeParcelable(this.logoBitmap, i2);
        out.writeString(this.logoUrl);
        Boolean bool = this.showBillingInfo;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showShippingInfo;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.forceShippingInfoValidation;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        out.writeString(this.merchantCountry);
        out.writeInt(this.hideCardScanner ? 1 : 0);
        List<PaymentSdkApms> list = this.alternativePaymentMethods;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentSdkApms paymentSdkApms : list) {
                out.writeString(paymentSdkApms.name());
            }
        }
        Boolean bool4 = this.linkBillingNameWithCardHolderName;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        out.writeString(this.callback);
        out.writeInt(this.showSaveCardsUI ? 1 : 0);
        out.writeInt(this.request3DS ? 1 : 0);
        PaymentSDKSavedCardInfo paymentSDKSavedCardInfo = this.savedCardInfo;
        if (paymentSDKSavedCardInfo == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        paymentSDKSavedCardInfo.writeToParcel(out, i2);
    }
}