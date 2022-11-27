package h0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import t.a;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lh0/a;", "Lp0/b;", "Landroid/view/View;", "v", "", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig$delegate", "Lkotlin/Lazy;", "d", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "", "samPayToken$delegate", "e", "()Ljava/lang/String;", "samPayToken", "Li0/a;", "viewModel$delegate", "f", "()Li0/a;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends p0.b {

    /* renamed from: e */
    public static final C0012a f203e = new C0012a(null);

    /* renamed from: b */
    private final Lazy f204b = LazyKt.lazy(new b());

    /* renamed from: c */
    private final Lazy f205c = LazyKt.lazy(new c());

    /* renamed from: d */
    private final Lazy f206d;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lh0/a$a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "", "samPayToken", "Lh0/a;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: h0.a$a */
    /* loaded from: classes.dex */
    public static final class C0012a {
        private C0012a() {
        }

        public /* synthetic */ C0012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(PaymentSdkConfigurationDetails ptConfig, String samPayToken) {
            Intrinsics.checkNotNullParameter(ptConfig, "ptConfig");
            Intrinsics.checkNotNullParameter(samPayToken, "samPayToken");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ptConfig", ptConfig);
            bundle.putString("ptsa", samPayToken);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return (PaymentSdkConfigurationDetails) arguments.getParcelable("ptConfig");
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements Function0<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return arguments.getString("ptsa");
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$5"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements Function0<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f209a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Fragment invoke() {
            return this.f209a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "()Landroidx/lifecycle/ViewModelStoreOwner;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<ViewModelStoreOwner> {

        /* renamed from: a */
        final /* synthetic */ Function0 f210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0) {
            super(0);
            this.f210a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f210a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "a", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        final /* synthetic */ Lazy f211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lazy lazy) {
            super(0);
            this.f211a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f211a).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: a */
        final /* synthetic */ Function0 f212a;

        /* renamed from: b */
        final /* synthetic */ Lazy f213b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, Lazy lazy) {
            super(0);
            this.f212a = function0;
            this.f213b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f212a;
            if (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) {
                ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f213b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
            return creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends Lambda implements Function0<ViewModelProvider.Factory> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            return new j0.a(new g0.a(new x0.a(x.a.f543a.a())), new y0.a(a.this.d()), a.this.d());
        }
    }

    public a() {
        h hVar = new h();
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e(new d(this)));
        this.f206d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(i0.a.class), new f(lazy), new g(null, lazy), hVar);
    }

    private final void a(View view) {
        f().a().observe(getViewLifecycleOwner(), $$Lambda$a$9WZl7kcCRsOUN6pkIifpcuju6S0.INSTANCE);
        f().f().observe(getViewLifecycleOwner(), $$Lambda$a$Fvkwup3yCTstaj9yDiV5XGeDX1A.INSTANCE);
        f().h().observe(getViewLifecycleOwner(), new Observer() { // from class: h0.-$$Lambda$a$TJeaSnc4QxNmegybfxkWCF5tiC0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$TJeaSnc4QxNmegybfxkWCF5tiC0(a.this, (TransactionResponseBody) obj);
            }
        });
        f().g().observe(getViewLifecycleOwner(), new Observer() { // from class: h0.-$$Lambda$a$Cx_9FFtsVtYQbzOG_wKA4_cc1D8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$Cx_9FFtsVtYQbzOG_wKA4_cc1D8(a.this, (TransactionResponseBody) obj);
            }
        });
        f().c().observe(getViewLifecycleOwner(), new Observer() { // from class: h0.-$$Lambda$a$b-mRiYpT4R3DcrRXJSTKmaRIYVU
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m11lambda$bmRiYpT4R3DcrRXJSTKmaRIYVU(a.this, (ErrorResponseBody) obj);
            }
        });
        f().e().observe(getViewLifecycleOwner(), new Observer() { // from class: h0.-$$Lambda$a$kHx7EB7IjUedzxMdg5wNlv0-_t0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m12lambda$kHx7EB7IjUedzxMdg5wNlv0_t0(a.this, (Boolean) obj);
            }
        });
        f().d().observe(getViewLifecycleOwner(), new Observer() { // from class: h0.-$$Lambda$a$ZAMBVJtYicChEZh8b5uzQDg1Fjc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$ZAMBVJtYicChEZh8b5uzQDg1Fjc(a.this, (Boolean) obj);
            }
        });
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
        beginTransaction.addToBackStack(null);
        beginTransaction.add(16908290, fragment, "").commit();
    }

    public static final void a(a this$0, ErrorResponseBody errorResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(errorResponseBody);
    }

    public static final void a(a this$0, TransactionResponseBody it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.a(it);
    }

    public static final void a(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_generic), 0).show();
    }

    public static final void a(Boolean bool) {
    }

    public static final void b(a this$0, TransactionResponseBody transactionResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.C0029a c0029a = t.a.f393j;
        PaymentSdkConfigurationDetails d2 = this$0.d();
        this$0.a(a.C0029a.a(c0029a, d2 != null ? d2.getProfileId() : null, transactionResponseBody.getRedirectUrl(), transactionResponseBody.getReturnX(), transactionResponseBody.getTranRef(), false, 16, null));
    }

    public static final void b(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_network), 0).show();
    }

    public static final void b(Boolean bool) {
    }

    public final PaymentSdkConfigurationDetails d() {
        return (PaymentSdkConfigurationDetails) this.f204b.getValue();
    }

    private final String e() {
        return (String) this.f205c.getValue();
    }

    private final i0.a f() {
        return (i0.a) this.f206d.getValue();
    }

    public static /* synthetic */ void lambda$Cx_9FFtsVtYQbzOG_wKA4_cc1D8(a aVar, TransactionResponseBody transactionResponseBody) {
        b(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$TJeaSnc4QxNmegybfxkWCF5tiC0(a aVar, TransactionResponseBody transactionResponseBody) {
        a(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$ZAMBVJtYicChEZh8b5uzQDg1Fjc(a aVar, Boolean bool) {
        b(aVar, bool);
    }

    /* renamed from: lambda$b-mRiYpT4R3DcrRXJSTKmaRIYVU */
    public static /* synthetic */ void m11lambda$bmRiYpT4R3DcrRXJSTKmaRIYVU(a aVar, ErrorResponseBody errorResponseBody) {
        a(aVar, errorResponseBody);
    }

    /* renamed from: lambda$kHx7EB7IjUedzxMdg5wNlv0-_t0 */
    public static /* synthetic */ void m12lambda$kHx7EB7IjUedzxMdg5wNlv0_t0(a aVar, Boolean bool) {
        a(aVar, bool);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View v2 = inflater.inflate(R.layout.fragment_sam_pay, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        a(v2);
        f().a(b().h());
        f().a(e());
        return v2;
    }
}