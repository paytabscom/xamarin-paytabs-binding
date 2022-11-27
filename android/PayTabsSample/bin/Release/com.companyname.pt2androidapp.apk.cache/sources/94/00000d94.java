package com.payment.paymentsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.integrationmodels.PaymentSdkLanguageCode;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import com.payment.paymentsdk.save_cards.presentation.ui.SavedCardsActivity;
import com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0018H\u0016R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010&R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/payment/paymentsdk/PaymentSdkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lr0/a;", "", "", "setStatusBarColor", "requestPhoneStatePermission", "", "languageCode", "setLocale", "getLanguageCode", "Landroidx/fragment/app/Fragment;", "fragment", "showFragment", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "onMissingDataFinished", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "result", "returnPaymentFinishedToTheCaller", "returnCancelToTheCaller", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "returnErrorToTheCaller", "ptConfig$delegate", "Lkotlin/Lazy;", "getPtConfig", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "samsungPayToken$delegate", "getSamsungPayToken", "()Ljava/lang/String;", "samsungPayToken", "", "isSamsungPayEnabled$delegate", "isSamsungPayEnabled", "()Ljava/lang/Boolean;", "isApmEnabled$delegate", "isApmEnabled", "Ln0/a;", "savedCardsViewModel$delegate", "getSavedCardsViewModel", "()Ln0/a;", "savedCardsViewModel", "<init>", "()V", "Companion", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSdkActivity extends AppCompatActivity implements r0.a {
    public static final Companion Companion = new Companion(null);
    private static CallbackPaymentInterface mCallback;
    private final Lazy ptConfig$delegate = LazyKt.lazy(new d());
    private final Lazy samsungPayToken$delegate = LazyKt.lazy(new e());
    private final Lazy isSamsungPayEnabled$delegate = LazyKt.lazy(new c());
    private final Lazy isApmEnabled$delegate = LazyKt.lazy(new b());
    private final Lazy savedCardsViewModel$delegate = LazyKt.lazy(new f());

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007J&\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007J&\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007J0\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007J0\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007J:\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/payment/paymentsdk/PaymentSdkActivity$Companion;", "", "()V", "mCallback", "Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;", "getMCallback$paymentsdk_release$annotations", "getMCallback$paymentsdk_release", "()Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;", "setMCallback$paymentsdk_release", "(Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "start3DSecureTokenizedCardPayment", "", "context", "Landroid/app/Activity;", "ptConfigData", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "savedCardInfo", "Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;", PaymentSdkParams.TOKEN, "", "callback", "startAlternativePaymentMethods", "startCardPayment", "startPaymentWithSavedCards", "support3DS", "", "startSamsungPayment", "samsungPayToken", "startTokenizedCardPayment", "transactionRef", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getMCallback$paymentsdk_release$annotations() {
        }

        public final CallbackPaymentInterface getMCallback$paymentsdk_release() {
            return PaymentSdkActivity.mCallback;
        }

        public final void setMCallback$paymentsdk_release(CallbackPaymentInterface callbackPaymentInterface) {
            PaymentSdkActivity.mCallback = callbackPaymentInterface;
        }

        @JvmStatic
        public final void start3DSecureTokenizedCardPayment(Activity context, PaymentSdkConfigurationDetails ptConfigData, PaymentSDKSavedCardInfo savedCardInfo, String token, CallbackPaymentInterface callback) {
            PaymentSdkConfigurationDetails copy;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(savedCardInfo, "savedCardInfo");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(callback, "callback");
            setMCallback$paymentsdk_release(callback);
            copy = ptConfigData.copy((r49 & 1) != 0 ? ptConfigData.profileId : null, (r49 & 2) != 0 ? ptConfigData.serverKey : null, (r49 & 4) != 0 ? ptConfigData.clientKey : null, (r49 & 8) != 0 ? ptConfigData.billingDetails : null, (r49 & 16) != 0 ? ptConfigData.shippingDetails : null, (r49 & 32) != 0 ? ptConfigData.locale : null, (r49 & 64) != 0 ? ptConfigData.cartId : null, (r49 & 128) != 0 ? ptConfigData.currencyCode : null, (r49 & 256) != 0 ? ptConfigData.cartDescription : null, (r49 & 512) != 0 ? ptConfigData.transactionType : null, (r49 & 1024) != 0 ? ptConfigData.transactionClass : null, (r49 & 2048) != 0 ? ptConfigData.amount : null, (r49 & 4096) != 0 ? ptConfigData.screenTitle : null, (r49 & 8192) != 0 ? ptConfigData.customerIp : null, (r49 & 16384) != 0 ? ptConfigData.tokeniseType : null, (r49 & 32768) != 0 ? ptConfigData.tokenFormat : null, (r49 & 65536) != 0 ? ptConfigData.token : token, (r49 & 131072) != 0 ? ptConfigData.transactionReference : null, (r49 & 262144) != 0 ? ptConfigData.logoBitmap : null, (r49 & 524288) != 0 ? ptConfigData.logoUrl : null, (r49 & 1048576) != 0 ? ptConfigData.showBillingInfo : null, (r49 & 2097152) != 0 ? ptConfigData.showShippingInfo : null, (r49 & 4194304) != 0 ? ptConfigData.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? ptConfigData.merchantCountry : null, (r49 & 16777216) != 0 ? ptConfigData.hideCardScanner : false, (r49 & 33554432) != 0 ? ptConfigData.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? ptConfigData.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? ptConfigData.callback : null, (r49 & 268435456) != 0 ? ptConfigData.showSaveCardsUI : false, (r49 & 536870912) != 0 ? ptConfigData.request3DS : true, (r49 & BasicMeasure.EXACTLY) != 0 ? ptConfigData.savedCardInfo : savedCardInfo);
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", copy);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…gWithSavedCardInfoOption)");
            context.startActivity(putExtra);
        }

        @JvmStatic
        public final void startAlternativePaymentMethods(Activity context, PaymentSdkConfigurationDetails ptConfigData, CallbackPaymentInterface callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Boolean bool = Boolean.FALSE;
            ptConfigData.setShowBillingInfo(bool);
            ptConfigData.setShowShippingInfo(bool);
            setMCallback$paymentsdk_release(callback);
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", ptConfigData).putExtra("ARG_IS_APM_ENABLED", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…ARG_IS_APM_ENABLED, true)");
            context.startActivity(putExtra);
        }

        @JvmStatic
        public final void startCardPayment(Activity context, PaymentSdkConfigurationDetails ptConfigData, CallbackPaymentInterface callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(callback, "callback");
            setMCallback$paymentsdk_release(callback);
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", ptConfigData);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…ONFIG_DATA, ptConfigData)");
            context.startActivity(putExtra);
        }

        @JvmStatic
        public final void startPaymentWithSavedCards(Activity context, PaymentSdkConfigurationDetails ptConfigData, boolean z2, CallbackPaymentInterface callback) {
            PaymentSdkConfigurationDetails copy;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(callback, "callback");
            setMCallback$paymentsdk_release(callback);
            copy = ptConfigData.copy((r49 & 1) != 0 ? ptConfigData.profileId : null, (r49 & 2) != 0 ? ptConfigData.serverKey : null, (r49 & 4) != 0 ? ptConfigData.clientKey : null, (r49 & 8) != 0 ? ptConfigData.billingDetails : null, (r49 & 16) != 0 ? ptConfigData.shippingDetails : null, (r49 & 32) != 0 ? ptConfigData.locale : null, (r49 & 64) != 0 ? ptConfigData.cartId : null, (r49 & 128) != 0 ? ptConfigData.currencyCode : null, (r49 & 256) != 0 ? ptConfigData.cartDescription : null, (r49 & 512) != 0 ? ptConfigData.transactionType : null, (r49 & 1024) != 0 ? ptConfigData.transactionClass : null, (r49 & 2048) != 0 ? ptConfigData.amount : null, (r49 & 4096) != 0 ? ptConfigData.screenTitle : null, (r49 & 8192) != 0 ? ptConfigData.customerIp : null, (r49 & 16384) != 0 ? ptConfigData.tokeniseType : null, (r49 & 32768) != 0 ? ptConfigData.tokenFormat : null, (r49 & 65536) != 0 ? ptConfigData.token : null, (r49 & 131072) != 0 ? ptConfigData.transactionReference : null, (r49 & 262144) != 0 ? ptConfigData.logoBitmap : null, (r49 & 524288) != 0 ? ptConfigData.logoUrl : null, (r49 & 1048576) != 0 ? ptConfigData.showBillingInfo : null, (r49 & 2097152) != 0 ? ptConfigData.showShippingInfo : null, (r49 & 4194304) != 0 ? ptConfigData.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? ptConfigData.merchantCountry : null, (r49 & 16777216) != 0 ? ptConfigData.hideCardScanner : false, (r49 & 33554432) != 0 ? ptConfigData.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? ptConfigData.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? ptConfigData.callback : null, (r49 & 268435456) != 0 ? ptConfigData.showSaveCardsUI : true, (r49 & 536870912) != 0 ? ptConfigData.request3DS : z2, (r49 & BasicMeasure.EXACTLY) != 0 ? ptConfigData.savedCardInfo : null);
            Application application = context.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "context.application");
            if (new k0.a(application).d()) {
                SavedCardsActivity.f164c.a(context, callback, copy);
                return;
            }
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", copy);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…nfigWithSavedCardsOption)");
            context.startActivity(putExtra);
        }

        @JvmStatic
        public final void startSamsungPayment(Activity context, PaymentSdkConfigurationDetails ptConfigData, String samsungPayToken, CallbackPaymentInterface callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(samsungPayToken, "samsungPayToken");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Boolean bool = Boolean.FALSE;
            ptConfigData.setShowBillingInfo(bool);
            ptConfigData.setShowShippingInfo(bool);
            setMCallback$paymentsdk_release(callback);
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", ptConfigData).putExtra("samsung_token", samsungPayToken).putExtra("Is_SAM_PAY_ENABLED", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…IS_SAM_PAY_ENABLED, true)");
            context.startActivity(putExtra);
        }

        @JvmStatic
        public final void startTokenizedCardPayment(Activity context, PaymentSdkConfigurationDetails ptConfigData, String token, String transactionRef, CallbackPaymentInterface callback) {
            PaymentSdkConfigurationDetails copy;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ptConfigData, "ptConfigData");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(transactionRef, "transactionRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            setMCallback$paymentsdk_release(callback);
            copy = ptConfigData.copy((r49 & 1) != 0 ? ptConfigData.profileId : null, (r49 & 2) != 0 ? ptConfigData.serverKey : null, (r49 & 4) != 0 ? ptConfigData.clientKey : null, (r49 & 8) != 0 ? ptConfigData.billingDetails : null, (r49 & 16) != 0 ? ptConfigData.shippingDetails : null, (r49 & 32) != 0 ? ptConfigData.locale : null, (r49 & 64) != 0 ? ptConfigData.cartId : null, (r49 & 128) != 0 ? ptConfigData.currencyCode : null, (r49 & 256) != 0 ? ptConfigData.cartDescription : null, (r49 & 512) != 0 ? ptConfigData.transactionType : null, (r49 & 1024) != 0 ? ptConfigData.transactionClass : null, (r49 & 2048) != 0 ? ptConfigData.amount : null, (r49 & 4096) != 0 ? ptConfigData.screenTitle : null, (r49 & 8192) != 0 ? ptConfigData.customerIp : null, (r49 & 16384) != 0 ? ptConfigData.tokeniseType : null, (r49 & 32768) != 0 ? ptConfigData.tokenFormat : null, (r49 & 65536) != 0 ? ptConfigData.token : token, (r49 & 131072) != 0 ? ptConfigData.transactionReference : transactionRef, (r49 & 262144) != 0 ? ptConfigData.logoBitmap : null, (r49 & 524288) != 0 ? ptConfigData.logoUrl : null, (r49 & 1048576) != 0 ? ptConfigData.showBillingInfo : null, (r49 & 2097152) != 0 ? ptConfigData.showShippingInfo : null, (r49 & 4194304) != 0 ? ptConfigData.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? ptConfigData.merchantCountry : null, (r49 & 16777216) != 0 ? ptConfigData.hideCardScanner : false, (r49 & 33554432) != 0 ? ptConfigData.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? ptConfigData.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? ptConfigData.callback : null, (r49 & 268435456) != 0 ? ptConfigData.showSaveCardsUI : false, (r49 & 536870912) != 0 ? ptConfigData.request3DS : false, (r49 & BasicMeasure.EXACTLY) != 0 ? ptConfigData.savedCardInfo : null);
            Intent putExtra = new Intent(context, PaymentSdkActivity.class).putExtra("configData", copy);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentS…onfigWithRecurringOption)");
            context.startActivity(putExtra);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60a;

        static {
            int[] iArr = new int[PaymentSdkLanguageCode.values().length];
            iArr[PaymentSdkLanguageCode.AR.ordinal()] = 1;
            iArr[PaymentSdkLanguageCode.EN.ordinal()] = 2;
            f60a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(PaymentSdkActivity.this.getIntent().getBooleanExtra("ARG_IS_APM_ENABLED", false));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(PaymentSdkActivity.this.getIntent().getBooleanExtra("Is_SAM_PAY_ENABLED", false));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            return (PaymentSdkConfigurationDetails) PaymentSdkActivity.this.getIntent().getParcelableExtra("configData");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class e extends Lambda implements Function0<String> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return PaymentSdkActivity.this.getIntent().getStringExtra("samsung_token");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln0/a;", "a", "()Ln0/a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class f extends Lambda implements Function0<n0.a> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final n0.a invoke() {
            return (n0.a) new ViewModelProvider(PaymentSdkActivity.this).get(n0.a.class);
        }
    }

    private final String getLanguageCode() {
        PaymentSdkConfigurationDetails ptConfig = getPtConfig();
        PaymentSdkLanguageCode locale = ptConfig != null ? ptConfig.getLocale() : null;
        int i2 = locale == null ? -1 : a.f60a[locale.ordinal()];
        return i2 != 1 ? i2 != 2 ? new e0.c(this).a() : "en" : "ar";
    }

    private final PaymentSdkConfigurationDetails getPtConfig() {
        return (PaymentSdkConfigurationDetails) this.ptConfig$delegate.getValue();
    }

    private final String getSamsungPayToken() {
        return (String) this.samsungPayToken$delegate.getValue();
    }

    private final n0.a getSavedCardsViewModel() {
        return (n0.a) this.savedCardsViewModel$delegate.getValue();
    }

    private final Boolean isApmEnabled() {
        return (Boolean) this.isApmEnabled$delegate.getValue();
    }

    private final Boolean isSamsungPayEnabled() {
        return (Boolean) this.isSamsungPayEnabled$delegate.getValue();
    }

    private final void requestPhoneStatePermission() {
        if (e0.f.a(this, "android.permission.READ_PHONE_STATE")) {
            return;
        }
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), $$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…s.RequestPermission()) {}");
        registerForActivityResult.launch("android.permission.READ_PHONE_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestPhoneStatePermission$lambda-0  reason: not valid java name */
    public static final void m9requestPhoneStatePermission$lambda0(Boolean bool) {
    }

    private final void setLocale(String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = getResources().getConfiguration();
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    private final void setStatusBarColor() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.payment_sdk_status_bar_color));
    }

    private final void showFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_container, fragment).commit();
    }

    @JvmStatic
    public static final void start3DSecureTokenizedCardPayment(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, PaymentSDKSavedCardInfo paymentSDKSavedCardInfo, String str, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.start3DSecureTokenizedCardPayment(activity, paymentSdkConfigurationDetails, paymentSDKSavedCardInfo, str, callbackPaymentInterface);
    }

    @JvmStatic
    public static final void startAlternativePaymentMethods(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.startAlternativePaymentMethods(activity, paymentSdkConfigurationDetails, callbackPaymentInterface);
    }

    @JvmStatic
    public static final void startCardPayment(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.startCardPayment(activity, paymentSdkConfigurationDetails, callbackPaymentInterface);
    }

    @JvmStatic
    public static final void startPaymentWithSavedCards(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, boolean z2, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.startPaymentWithSavedCards(activity, paymentSdkConfigurationDetails, z2, callbackPaymentInterface);
    }

    @JvmStatic
    public static final void startSamsungPayment(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, String str, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.startSamsungPayment(activity, paymentSdkConfigurationDetails, str, callbackPaymentInterface);
    }

    @JvmStatic
    public static final void startTokenizedCardPayment(Activity activity, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, String str, String str2, CallbackPaymentInterface callbackPaymentInterface) {
        Companion.startTokenizedCardPayment(activity, paymentSdkConfigurationDetails, str, str2, callbackPaymentInterface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment_sdk);
        if (mCallback == null) {
            String string = getString(R.string.payment_sdk_error_missing_payment_callback);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.payme…missing_payment_callback)");
            e0.d.a(this, string);
        }
        setStatusBarColor();
        setLocale(getLanguageCode());
        showFragment(com.payment.paymentsdk.a.f92g.a(getPtConfig(), getSamsungPayToken(), isSamsungPayEnabled(), isApmEnabled()));
    }

    public void onMissingDataFinished(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        showFragment(com.payment.paymentsdk.a.f92g.a(getPtConfig(), getSamsungPayToken(), isSamsungPayEnabled(), isApmEnabled()));
    }

    @Override // r0.a
    public void returnCancelToTheCaller() {
        CallbackPaymentInterface callbackPaymentInterface = mCallback;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onPaymentCancel();
        }
        finish();
    }

    @Override // r0.a
    public void returnErrorToTheCaller(PaymentSdkError result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CallbackPaymentInterface callbackPaymentInterface = mCallback;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onError(result);
        }
        finish();
    }

    @Override // r0.a
    public void returnPaymentFinishedToTheCaller(PaymentSdkTransactionDetails result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Build.VERSION.SDK_INT >= 23) {
            getSavedCardsViewModel().a(getPtConfig(), result);
        }
        CallbackPaymentInterface callbackPaymentInterface = mCallback;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onPaymentFinish(result);
        }
        finish();
    }
}