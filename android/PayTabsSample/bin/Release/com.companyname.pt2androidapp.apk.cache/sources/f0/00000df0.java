package com.payment.paymentsdk.save_cards.presentation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface;
import e0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\fH\u0016R\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/payment/paymentsdk/save_cards/presentation/ui/SavedCardsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lr0/a;", "", "b", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "result", "returnPaymentFinishedToTheCaller", "returnCancelToTheCaller", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "returnErrorToTheCaller", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "Lkotlin/Lazy;", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "container", "<init>", "()V", "c", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SavedCardsActivity extends AppCompatActivity implements r0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f164c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static CallbackPaymentInterface f165d;

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f166a = LazyKt.lazy(new c());

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f167b;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/payment/paymentsdk/save_cards/presentation/ui/SavedCardsActivity$a;", "", "Landroid/content/Context;", "context", "Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;", "callback", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "config", "", "a", "(Landroid/content/Context;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "", "ARG_CONFIG_DATA", "Ljava/lang/String;", "callback1", "Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;", "getCallback1$annotations", "()V", "<init>", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, CallbackPaymentInterface callback, PaymentSdkConfigurationDetails config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(config, "config");
            SavedCardsActivity.f165d = callback;
            Intent intent = new Intent(context, SavedCardsActivity.class);
            intent.putExtra("configData", config);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/payment/paymentsdk/save_cards/presentation/ui/SavedCardsActivity$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "", "slideOffset", "onSlide", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float f2) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int i2) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i2 == 5) {
                SavedCardsActivity.this.finish();
                SavedCardsActivity.this.overridePendingTransition(0, 0);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            Intent intent = SavedCardsActivity.this.getIntent();
            Intrinsics.checkNotNull(intent);
            Parcelable parcelableExtra = intent.getParcelableExtra("configData");
            Intrinsics.checkNotNull(parcelableExtra);
            return (PaymentSdkConfigurationDetails) parcelableExtra;
        }
    }

    private final void b() {
        FrameLayout frameLayout = this.f167b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            frameLayout = null;
        }
        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
        Intrinsics.checkNotNullExpressionValue(from, "from(container)");
        from.setState(6);
        from.setSkipCollapsed(true);
        from.addBottomSheetCallback(new b());
    }

    public final PaymentSdkConfigurationDetails a() {
        return (PaymentSdkConfigurationDetails) this.f166a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_saved_cards);
        View findViewById = findViewById(R.id.fragmentContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.fragmentContainer)");
        this.f167b = (FrameLayout) findViewById;
        b();
        if (f165d == null) {
            String string = getString(R.string.payment_sdk_error_missing_payment_callback);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.payme…missing_payment_callback)");
            d.a(this, string);
        }
        m0.b bVar = new m0.b();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("configData", a());
        bVar.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, bVar).commit();
    }

    @Override // r0.a
    public void returnCancelToTheCaller() {
        CallbackPaymentInterface callbackPaymentInterface = f165d;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onPaymentCancel();
        }
        finish();
    }

    @Override // r0.a
    public void returnErrorToTheCaller(PaymentSdkError result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CallbackPaymentInterface callbackPaymentInterface = f165d;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onError(result);
        }
        finish();
    }

    @Override // r0.a
    public void returnPaymentFinishedToTheCaller(PaymentSdkTransactionDetails result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CallbackPaymentInterface callbackPaymentInterface = f165d;
        if (callbackPaymentInterface != null) {
            callbackPaymentInterface.onPaymentFinish(result);
        }
        finish();
    }
}