package b1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
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

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lb1/a;", "Lp0/b;", "", "f", "Landroidx/fragment/app/Fragment;", "fragment", "a", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig$delegate", "Lkotlin/Lazy;", "d", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Lc1/a;", "viewModel$delegate", "e", "()Lc1/a;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends p0.b {

    /* renamed from: e */
    public static final C0005a f18e = new C0005a(null);

    /* renamed from: b */
    private final Lazy f19b = LazyKt.lazy(new b());

    /* renamed from: c */
    private final Lazy f20c;

    /* renamed from: d */
    private ProgressBar f21d;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lb1/a$a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Lb1/a;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: b1.a$a */
    /* loaded from: classes.dex */
    public static final class C0005a {
        private C0005a() {
        }

        public /* synthetic */ C0005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(PaymentSdkConfigurationDetails ptConfig) {
            Intrinsics.checkNotNullParameter(ptConfig, "ptConfig");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ptConfig", ptConfig);
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$5"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements Function0<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f23a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f23a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Fragment invoke() {
            return this.f23a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "()Landroidx/lifecycle/ViewModelStoreOwner;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements Function0<ViewModelStoreOwner> {

        /* renamed from: a */
        final /* synthetic */ Function0 f24a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f24a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f24a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "a", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        final /* synthetic */ Lazy f25a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.f25a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f25a).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: a */
        final /* synthetic */ Function0 f26a;

        /* renamed from: b */
        final /* synthetic */ Lazy f27b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, Lazy lazy) {
            super(0);
            this.f26a = function0;
            this.f27b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26a;
            if (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) {
                ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f27b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
            return creationExtras;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$8"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* renamed from: a */
        final /* synthetic */ Fragment f28a;

        /* renamed from: b */
        final /* synthetic */ Lazy f29b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, Lazy lazy) {
            super(0);
            this.f28a = fragment;
            this.f29b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f29b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
            if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.f28a.getDefaultViewModelProviderFactory();
            }
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* renamed from: a */
        public static final h f30a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            return new d1.a(new a1.a(new x0.a(x.a.f543a.a())));
        }
    }

    public a() {
        Function0 function0 = h.f30a;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new d(new c(this)));
        this.f20c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(c1.a.class), new e(lazy), new f(null, lazy), function0 == null ? new g(this, lazy) : function0);
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

    public static final void a(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar progressBar = this$0.f21d;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingProgressBar");
            progressBar = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        progressBar.setVisibility(it.booleanValue() ? 0 : 8);
    }

    public static final void b(a this$0, TransactionResponseBody transactionResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.C0029a c0029a = t.a.f393j;
        PaymentSdkConfigurationDetails d2 = this$0.d();
        this$0.a(a.C0029a.a(c0029a, d2 != null ? d2.getProfileId() : null, transactionResponseBody.getRedirectUrl(), transactionResponseBody.getReturnX(), transactionResponseBody.getTranRef(), false, 16, null));
    }

    public static final void b(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_generic), 0).show();
    }

    public static final void c(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_network), 0).show();
    }

    private final PaymentSdkConfigurationDetails d() {
        return (PaymentSdkConfigurationDetails) this.f19b.getValue();
    }

    private final c1.a e() {
        return (c1.a) this.f20c.getValue();
    }

    private final void f() {
        e().a().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$o2NtONjjEgEe1cshcdo1YATsdo4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$o2NtONjjEgEe1cshcdo1YATsdo4(a.this, (Boolean) obj);
            }
        });
        e().g().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$lA53thlgNhxCPUPRwvrfA6X0rDI
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$lA53thlgNhxCPUPRwvrfA6X0rDI(a.this, (TransactionResponseBody) obj);
            }
        });
        e().f().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$x_ay45nUYU_cdXeTMU7Baae3lbI
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$x_ay45nUYU_cdXeTMU7Baae3lbI(a.this, (TransactionResponseBody) obj);
            }
        });
        e().c().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$c6w0OfQZn8pypDNQ-iAk0RUlVVc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m6lambda$c6w0OfQZn8pypDNQiAk0RUlVVc(a.this, (ErrorResponseBody) obj);
            }
        });
        e().e().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$yO58qezW0I5tsUoTeznitqPqSDg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$yO58qezW0I5tsUoTeznitqPqSDg(a.this, (Boolean) obj);
            }
        });
        e().d().observe(getViewLifecycleOwner(), new Observer() { // from class: b1.-$$Lambda$a$Gl5QL8oz9zaQiZScrzeUsXCAR5k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$Gl5QL8oz9zaQiZScrzeUsXCAR5k(a.this, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$Gl5QL8oz9zaQiZScrzeUsXCAR5k(a aVar, Boolean bool) {
        c(aVar, bool);
    }

    /* renamed from: lambda$c6w0OfQZn8pypDNQ-iAk0RUlVVc */
    public static /* synthetic */ void m6lambda$c6w0OfQZn8pypDNQiAk0RUlVVc(a aVar, ErrorResponseBody errorResponseBody) {
        a(aVar, errorResponseBody);
    }

    public static /* synthetic */ void lambda$lA53thlgNhxCPUPRwvrfA6X0rDI(a aVar, TransactionResponseBody transactionResponseBody) {
        a(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$o2NtONjjEgEe1cshcdo1YATsdo4(a aVar, Boolean bool) {
        a(aVar, bool);
    }

    public static /* synthetic */ void lambda$x_ay45nUYU_cdXeTMU7Baae3lbI(a aVar, TransactionResponseBody transactionResponseBody) {
        b(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$yO58qezW0I5tsUoTeznitqPqSDg(a aVar, Boolean bool) {
        b(aVar, bool);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_sam_pay, viewGroup, false);
        e().a(b().h());
        f();
        c1.a e2 = e();
        c1.a e3 = e();
        PaymentSdkConfigurationDetails d2 = d();
        Intrinsics.checkNotNull(d2);
        e2.a(e3.a(d2));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f21d = (ProgressBar) findViewById;
    }
}