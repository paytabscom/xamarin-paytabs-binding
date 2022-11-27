package c;

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

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lc/a;", "Lp0/b;", "Landroid/view/View;", "v", "", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig$delegate", "Lkotlin/Lazy;", "d", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Ld/a;", "viewModel$delegate", "e", "()Ld/a;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends p0.b {

    /* renamed from: d */
    public static final C0006a f31d = new C0006a(null);

    /* renamed from: b */
    private final Lazy f32b = LazyKt.lazy(new b());

    /* renamed from: c */
    private final Lazy f33c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lc/a$a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Lc/a;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static final class C0006a {
        private C0006a() {
        }

        public /* synthetic */ C0006a(DefaultConstructorMarker defaultConstructorMarker) {
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
        final /* synthetic */ Fragment f35a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f35a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Fragment invoke() {
            return this.f35a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "()Landroidx/lifecycle/ViewModelStoreOwner;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements Function0<ViewModelStoreOwner> {

        /* renamed from: a */
        final /* synthetic */ Function0 f36a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f36a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f36a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "a", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        final /* synthetic */ Lazy f37a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.f37a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f37a).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: a */
        final /* synthetic */ Function0 f38a;

        /* renamed from: b */
        final /* synthetic */ Lazy f39b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, Lazy lazy) {
            super(0);
            this.f38a = function0;
            this.f39b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f38a;
            if (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) {
                ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f39b);
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
        final /* synthetic */ Fragment f40a;

        /* renamed from: b */
        final /* synthetic */ Lazy f41b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, Lazy lazy) {
            super(0);
            this.f40a = fragment;
            this.f41b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f41b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
            if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.f40a.getDefaultViewModelProviderFactory();
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
        public static final h f42a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            return new e.a(new b.a(new x0.a(x.a.f543a.a())));
        }
    }

    public a() {
        Function0 function0 = h.f42a;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new d(new c(this)));
        this.f33c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(d.a.class), new e(lazy), new f(null, lazy), function0 == null ? new g(this, lazy) : function0);
    }

    private final void a(final View view) {
        e().a().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$kuMiR_Hq2m_Pf7MW4gAEF1Z7BS8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$kuMiR_Hq2m_Pf7MW4gAEF1Z7BS8(view, (Boolean) obj);
            }
        });
        e().g().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$qmU5Yu2MdStTwRuIHZdbcE0xMWI
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$qmU5Yu2MdStTwRuIHZdbcE0xMWI(a.this, (TransactionResponseBody) obj);
            }
        });
        e().f().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$dtyXjGVWB91qAZvlcS153GOUE-4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m8lambda$dtyXjGVWB91qAZvlcS153GOUE4(a.this, (TransactionResponseBody) obj);
            }
        });
        e().c().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$dPYuhrQzEbM5cSfIUXJb-V0i6sE
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m7lambda$dPYuhrQzEbM5cSfIUXJbV0i6sE(a.this, (ErrorResponseBody) obj);
            }
        });
        e().e().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$FcXfY2eN7JwsOhXQOguQdCuqBgM
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$FcXfY2eN7JwsOhXQOguQdCuqBgM(a.this, (Boolean) obj);
            }
        });
        e().d().observe(getViewLifecycleOwner(), new Observer() { // from class: c.-$$Lambda$a$gy4S14aIf1UR8E85sYnt31cb3zE
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$gy4S14aIf1UR8E85sYnt31cb3zE(a.this, (Boolean) obj);
            }
        });
    }

    public static final void a(View v2, Boolean bool) {
        Intrinsics.checkNotNullParameter(v2, "$v");
        z.c.a(z.c.a(v2, R.id.progress_bar), bool);
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
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

    public static final void b(a this$0, TransactionResponseBody transactionResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.C0029a c0029a = t.a.f393j;
        PaymentSdkConfigurationDetails d2 = this$0.d();
        this$0.a(c0029a.a(d2 != null ? d2.getProfileId() : null, transactionResponseBody.getRedirectUrl(), transactionResponseBody.getReturnX(), transactionResponseBody.getTranRef(), true));
    }

    public static final void b(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_network), 0).show();
    }

    private final PaymentSdkConfigurationDetails d() {
        return (PaymentSdkConfigurationDetails) this.f32b.getValue();
    }

    private final d.a e() {
        return (d.a) this.f33c.getValue();
    }

    public static /* synthetic */ void lambda$FcXfY2eN7JwsOhXQOguQdCuqBgM(a aVar, Boolean bool) {
        a(aVar, bool);
    }

    /* renamed from: lambda$dPYuhrQzEbM5cSfIUXJb-V0i6sE */
    public static /* synthetic */ void m7lambda$dPYuhrQzEbM5cSfIUXJbV0i6sE(a aVar, ErrorResponseBody errorResponseBody) {
        a(aVar, errorResponseBody);
    }

    /* renamed from: lambda$dtyXjGVWB91qAZvlcS153GOUE-4 */
    public static /* synthetic */ void m8lambda$dtyXjGVWB91qAZvlcS153GOUE4(a aVar, TransactionResponseBody transactionResponseBody) {
        b(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$gy4S14aIf1UR8E85sYnt31cb3zE(a aVar, Boolean bool) {
        b(aVar, bool);
    }

    public static /* synthetic */ void lambda$kuMiR_Hq2m_Pf7MW4gAEF1Z7BS8(View view, Boolean bool) {
        a(view, bool);
    }

    public static /* synthetic */ void lambda$qmU5Yu2MdStTwRuIHZdbcE0xMWI(a aVar, TransactionResponseBody transactionResponseBody) {
        a(aVar, transactionResponseBody);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View v2 = inflater.inflate(R.layout.fragment_sam_pay, viewGroup, false);
        e().a(b().h());
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        a(v2);
        d.a e2 = e();
        d.a e3 = e();
        PaymentSdkConfigurationDetails d2 = d();
        Intrinsics.checkNotNull(d2);
        e2.a(e3.a(d2));
        return v2;
    }
}