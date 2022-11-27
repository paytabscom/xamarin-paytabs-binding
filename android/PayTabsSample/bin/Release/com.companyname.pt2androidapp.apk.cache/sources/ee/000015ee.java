package m0;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.payment.paymentsdk.PaymentSdkActivity;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u0006\u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lm0/b;", "Landroidx/fragment/app/Fragment;", "Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;", "Lm0/a;", "adapter", "", "a", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "error", "onError", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "paymentSdkTransactionDetails", "onPaymentFinish", "onPaymentCancel", "Ln0/a;", "viewModel$delegate", "Lkotlin/Lazy;", "c", "()Ln0/a;", "viewModel", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "config$delegate", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "config", "Lcom/payment/paymentsdk/b;", "paymentSdkViewModel$delegate", "b", "()Lcom/payment/paymentsdk/b;", "paymentSdkViewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends Fragment implements CallbackPaymentInterface {

    /* renamed from: g */
    public static final a f339g = new a(null);

    /* renamed from: a */
    private int f340a = 1;

    /* renamed from: b */
    private final Lazy f341b = LazyKt.lazy(new f());

    /* renamed from: c */
    private final Lazy f342c = LazyKt.lazy(new C0022b());

    /* renamed from: d */
    private final Lazy f343d = LazyKt.lazy(new e());

    /* renamed from: e */
    private Button f344e;

    /* renamed from: f */
    private RecyclerView f345f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lm0/b$a;", "", "", "ARG_COLUMN_COUNT", "Ljava/lang/String;", "ARG_CONFIG_DATA", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: m0.b$b */
    /* loaded from: classes.dex */
    public static final class C0022b extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0022b() {
            super(0);
            b.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            Parcelable parcelable = b.this.requireArguments().getParcelable("configData");
            Intrinsics.checkNotNull(parcelable);
            return (PaymentSdkConfigurationDetails) parcelable;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll0/a;", "card", "", "<anonymous parameter 1>", "", "a", "(Ll0/a;I)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends Lambda implements Function2<l0.a, Integer, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(2);
            b.this = r1;
        }

        public final void a(l0.a card, int i2) {
            Intrinsics.checkNotNullParameter(card, "card");
            b.this.c().a(card);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(l0.a aVar, Integer num) {
            a(aVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll0/a;", "card", "", "<anonymous parameter 1>", "", "a", "(Ll0/a;I)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends Lambda implements Function2<l0.a, Integer, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(2);
            b.this = r1;
        }

        public final void a(l0.a card, int i2) {
            PaymentSdkConfigurationDetails copy;
            PaymentSdkConfigurationDetails copy2;
            Intrinsics.checkNotNullParameter(card, "card");
            copy = r3.copy((r49 & 1) != 0 ? r3.profileId : null, (r49 & 2) != 0 ? r3.serverKey : null, (r49 & 4) != 0 ? r3.clientKey : null, (r49 & 8) != 0 ? r3.billingDetails : null, (r49 & 16) != 0 ? r3.shippingDetails : null, (r49 & 32) != 0 ? r3.locale : null, (r49 & 64) != 0 ? r3.cartId : null, (r49 & 128) != 0 ? r3.currencyCode : null, (r49 & 256) != 0 ? r3.cartDescription : null, (r49 & 512) != 0 ? r3.transactionType : null, (r49 & 1024) != 0 ? r3.transactionClass : null, (r49 & 2048) != 0 ? r3.amount : null, (r49 & 4096) != 0 ? r3.screenTitle : null, (r49 & 8192) != 0 ? r3.customerIp : null, (r49 & 16384) != 0 ? r3.tokeniseType : null, (r49 & 32768) != 0 ? r3.tokenFormat : null, (r49 & 65536) != 0 ? r3.token : card.c(), (r49 & 131072) != 0 ? r3.transactionReference : card.d(), (r49 & 262144) != 0 ? r3.logoBitmap : null, (r49 & 524288) != 0 ? r3.logoUrl : null, (r49 & 1048576) != 0 ? r3.showBillingInfo : null, (r49 & 2097152) != 0 ? r3.showShippingInfo : null, (r49 & 4194304) != 0 ? r3.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? r3.merchantCountry : null, (r49 & 16777216) != 0 ? r3.hideCardScanner : false, (r49 & 33554432) != 0 ? r3.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? r3.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? r3.callback : null, (r49 & 268435456) != 0 ? r3.showSaveCardsUI : false, (r49 & 536870912) != 0 ? r3.request3DS : false, (r49 & BasicMeasure.EXACTLY) != 0 ? b.this.a().savedCardInfo : null);
            b.this.b().a(copy);
            if (!copy.getRequest3DS$paymentsdk_release()) {
                FragmentTransaction beginTransaction = b.this.requireActivity().getSupportFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
                beginTransaction.addToBackStack(null);
                beginTransaction.add(16908290, b1.a.f18e.a(copy), "").commit();
                return;
            }
            FragmentActivity requireActivity = b.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            PaymentSdkActivity.Companion companion = PaymentSdkActivity.Companion;
            copy2 = copy.copy((r49 & 1) != 0 ? copy.profileId : null, (r49 & 2) != 0 ? copy.serverKey : null, (r49 & 4) != 0 ? copy.clientKey : null, (r49 & 8) != 0 ? copy.billingDetails : null, (r49 & 16) != 0 ? copy.shippingDetails : null, (r49 & 32) != 0 ? copy.locale : null, (r49 & 64) != 0 ? copy.cartId : null, (r49 & 128) != 0 ? copy.currencyCode : null, (r49 & 256) != 0 ? copy.cartDescription : null, (r49 & 512) != 0 ? copy.transactionType : null, (r49 & 1024) != 0 ? copy.transactionClass : null, (r49 & 2048) != 0 ? copy.amount : null, (r49 & 4096) != 0 ? copy.screenTitle : null, (r49 & 8192) != 0 ? copy.customerIp : null, (r49 & 16384) != 0 ? copy.tokeniseType : null, (r49 & 32768) != 0 ? copy.tokenFormat : null, (r49 & 65536) != 0 ? copy.token : null, (r49 & 131072) != 0 ? copy.transactionReference : null, (r49 & 262144) != 0 ? copy.logoBitmap : null, (r49 & 524288) != 0 ? copy.logoUrl : null, (r49 & 1048576) != 0 ? copy.showBillingInfo : null, (r49 & 2097152) != 0 ? copy.showShippingInfo : null, (r49 & 4194304) != 0 ? copy.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? copy.merchantCountry : null, (r49 & 16777216) != 0 ? copy.hideCardScanner : false, (r49 & 33554432) != 0 ? copy.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? copy.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? copy.callback : null, (r49 & 268435456) != 0 ? copy.showSaveCardsUI : false, (r49 & 536870912) != 0 ? copy.request3DS : false, (r49 & BasicMeasure.EXACTLY) != 0 ? copy.savedCardInfo : new PaymentSDKSavedCardInfo(card.a(), card.b()));
            CallbackPaymentInterface mCallback$paymentsdk_release = companion.getMCallback$paymentsdk_release();
            Intrinsics.checkNotNull(mCallback$paymentsdk_release);
            companion.startCardPayment(requireActivity, copy2, mCallback$paymentsdk_release);
            requireActivity.finish();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(l0.a aVar, Integer num) {
            a(aVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/b;", "a", "()Lcom/payment/paymentsdk/b;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<com.payment.paymentsdk.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            b.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.payment.paymentsdk.b invoke() {
            b bVar = b.this;
            Application application = bVar.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "requireActivity().application");
            return (com.payment.paymentsdk.b) new ViewModelProvider(bVar, new com.payment.paymentsdk.c(application, new y0.a(b.this.a()))).get(com.payment.paymentsdk.b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln0/a;", "a", "()Ln0/a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<n0.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            b.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final n0.a invoke() {
            return (n0.a) new ViewModelProvider(b.this).get(n0.a.class);
        }
    }

    public final PaymentSdkConfigurationDetails a() {
        return (PaymentSdkConfigurationDetails) this.f342c.getValue();
    }

    private final void a(m0.a aVar) {
        if (aVar != null) {
            View view = getView();
            AppCompatButton appCompatButton = view != null ? (AppCompatButton) view.findViewById(R.id.edit) : null;
            if (appCompatButton == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(appCompatButton, "view?.findViewById<AppCo…ton>(R.id.edit) ?: return");
            appCompatButton.setText(aVar.a() ? R.string.done : R.string.edit);
        }
    }

    public static final void a(b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RecyclerView recyclerView = this$0.f345f;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
            recyclerView = null;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        m0.a aVar = adapter instanceof m0.a ? (m0.a) adapter : null;
        if (aVar != null) {
            aVar.a(!aVar.a());
            this$0.a(aVar);
        }
    }

    public final com.payment.paymentsdk.b b() {
        return (com.payment.paymentsdk.b) this.f343d.getValue();
    }

    public static final void b(b this$0, View view) {
        PaymentSdkConfigurationDetails copy;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().finish();
        PaymentSdkActivity.Companion companion = PaymentSdkActivity.Companion;
        FragmentActivity requireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        copy = r4.copy((r49 & 1) != 0 ? r4.profileId : null, (r49 & 2) != 0 ? r4.serverKey : null, (r49 & 4) != 0 ? r4.clientKey : null, (r49 & 8) != 0 ? r4.billingDetails : null, (r49 & 16) != 0 ? r4.shippingDetails : null, (r49 & 32) != 0 ? r4.locale : null, (r49 & 64) != 0 ? r4.cartId : null, (r49 & 128) != 0 ? r4.currencyCode : null, (r49 & 256) != 0 ? r4.cartDescription : null, (r49 & 512) != 0 ? r4.transactionType : null, (r49 & 1024) != 0 ? r4.transactionClass : null, (r49 & 2048) != 0 ? r4.amount : null, (r49 & 4096) != 0 ? r4.screenTitle : null, (r49 & 8192) != 0 ? r4.customerIp : null, (r49 & 16384) != 0 ? r4.tokeniseType : null, (r49 & 32768) != 0 ? r4.tokenFormat : null, (r49 & 65536) != 0 ? r4.token : null, (r49 & 131072) != 0 ? r4.transactionReference : null, (r49 & 262144) != 0 ? r4.logoBitmap : null, (r49 & 524288) != 0 ? r4.logoUrl : null, (r49 & 1048576) != 0 ? r4.showBillingInfo : null, (r49 & 2097152) != 0 ? r4.showShippingInfo : null, (r49 & 4194304) != 0 ? r4.forceShippingInfoValidation : null, (r49 & 8388608) != 0 ? r4.merchantCountry : null, (r49 & 16777216) != 0 ? r4.hideCardScanner : false, (r49 & 33554432) != 0 ? r4.alternativePaymentMethods : null, (r49 & 67108864) != 0 ? r4.linkBillingNameWithCardHolderName : null, (r49 & 134217728) != 0 ? r4.callback : null, (r49 & 268435456) != 0 ? r4.showSaveCardsUI : false, (r49 & 536870912) != 0 ? r4.request3DS : false, (r49 & BasicMeasure.EXACTLY) != 0 ? this$0.a().savedCardInfo : null);
        CallbackPaymentInterface mCallback$paymentsdk_release = companion.getMCallback$paymentsdk_release();
        Intrinsics.checkNotNull(mCallback$paymentsdk_release);
        companion.startCardPayment(requireActivity, copy, mCallback$paymentsdk_release);
    }

    public final n0.a c() {
        return (n0.a) this.f341b.getValue();
    }

    public static /* synthetic */ void lambda$7r8PZL4KAQPUm8On3VFOqPXNetg(b bVar, View view) {
        b(bVar, view);
    }

    public static /* synthetic */ void lambda$fN7Mc8T6odn5_Vzp2VcS95EtTXs(b bVar, View view) {
        a(bVar, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f340a = arguments.getInt("column-count");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_item_list, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.payWithNewCard);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.payWithNewCard)");
        this.f344e = (Button) findViewById;
        View findViewById2 = inflate.findViewById(R.id.list);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.list)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f345f = recyclerView;
        Button button = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(this.f340a <= 1 ? new LinearLayoutManager(recyclerView.getContext()) : new GridLayoutManager(recyclerView.getContext(), this.f340a));
        recyclerView.setAdapter(new m0.a(CollectionsKt.toMutableList((Collection) c().a()), new c(), new d()));
        ((AppCompatButton) inflate.findViewById(R.id.edit)).setOnClickListener(new View.OnClickListener() { // from class: m0.-$$Lambda$b$fN7Mc8T6odn5_Vzp2VcS95EtTXs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.lambda$fN7Mc8T6odn5_Vzp2VcS95EtTXs(b.this, view);
            }
        });
        Button button2 = this.f344e;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCardBtn");
        } else {
            button = button2;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: m0.-$$Lambda$b$7r8PZL4KAQPUm8On3VFOqPXNetg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.lambda$7r8PZL4KAQPUm8On3VFOqPXNetg(b.this, view);
            }
        });
        return inflate;
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onError(PaymentSdkError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onPaymentCancel() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onPaymentFinish(PaymentSdkTransactionDetails paymentSdkTransactionDetails) {
        Intrinsics.checkNotNullParameter(paymentSdkTransactionDetails, "paymentSdkTransactionDetails");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.f345f;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
            recyclerView = null;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        a(adapter instanceof m0.a ? (m0.a) adapter : null);
    }
}