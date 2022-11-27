package t;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.d3s.view.D3SView;
import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lt/a;", "Lp0/b;", "Lp/a;", "Lcom/payment/paymentsdk/d3s/view/D3SView;", "webView", "", "a", "f", "d", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "", NotificationCompat.CATEGORY_PROGRESS, "Lu/a;", "viewModel$delegate", "Lkotlin/Lazy;", "e", "()Lu/a;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends p0.b implements p.a {

    /* renamed from: j */
    public static final C0029a f393j = new C0029a(null);

    /* renamed from: b */
    private String f394b;

    /* renamed from: c */
    private String f395c;

    /* renamed from: d */
    private String f396d;

    /* renamed from: e */
    private String f397e;

    /* renamed from: f */
    private boolean f398f;

    /* renamed from: g */
    private D3SView f399g;

    /* renamed from: h */
    private ProgressBar f400h;

    /* renamed from: i */
    private final Lazy f401i;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Lt/a$a;", "", "", "profileId", "redirectUrl", "returnUrl", "transactionReference", "", "isApm", "Lt/a;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: t.a$a */
    /* loaded from: classes.dex */
    public static final class C0029a {
        private C0029a() {
        }

        public /* synthetic */ C0029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a a(C0029a c0029a, String str, String str2, String str3, String str4, boolean z2, int i2, Object obj) {
            return c0029a.a(str, str2, str3, str4, (i2 & 16) != 0 ? false : z2);
        }

        @JvmStatic
        public final a a(String str, String str2, String str3, String str4, boolean z2) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("profileId", str);
            bundle.putString("redUrl", str2);
            bundle.putString("retUrl", str3);
            bundle.putString("transactionReference", str4);
            bundle.putBoolean("TOKENIZE", z2);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            a.this = r1;
        }

        public final void a() {
            a.this.c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"t/a$c", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends OnBackPressedCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(true);
            a.this = r1;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!a.this.f398f) {
                a.this.requireActivity().getSupportFragmentManager().popBackStack();
                return;
            }
            D3SView d3SView = a.this.f399g;
            D3SView d3SView2 = null;
            if (d3SView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                d3SView = null;
            }
            if (!d3SView.canGoBack()) {
                a.this.d();
                return;
            }
            D3SView d3SView3 = a.this.f399g;
            if (d3SView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                d3SView2 = d3SView3;
            }
            d3SView2.goBack();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            a.this = r1;
        }

        public final void a() {
            a.this.g();
            a aVar = a.this;
            D3SView d3SView = aVar.f399g;
            if (d3SView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                d3SView = null;
            }
            aVar.a(d3SView);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$5"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f405a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Fragment invoke() {
            return this.f405a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "()Landroidx/lifecycle/ViewModelStoreOwner;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<ViewModelStoreOwner> {

        /* renamed from: a */
        final /* synthetic */ Function0 f406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0) {
            super(0);
            this.f406a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f406a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "a", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        final /* synthetic */ Lazy f407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Lazy lazy) {
            super(0);
            this.f407a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f407a).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: a */
        final /* synthetic */ Function0 f408a;

        /* renamed from: b */
        final /* synthetic */ Lazy f409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, Lazy lazy) {
            super(0);
            this.f408a = function0;
            this.f409b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f408a;
            if (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) {
                ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f409b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
            return creationExtras;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$8"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* renamed from: a */
        final /* synthetic */ Fragment f410a;

        /* renamed from: b */
        final /* synthetic */ Lazy f411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, Lazy lazy) {
            super(0);
            this.f410a = fragment;
            this.f411b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f411b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
            if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.f410a.getDefaultViewModelProviderFactory();
            }
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* renamed from: a */
        public static final j f412a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            return new v.a(new q.a(new x0.a(x.a.f543a.a())));
        }
    }

    public a() {
        Function0 function0 = j.f412a;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new f(new e(this)));
        this.f401i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(u.a.class), new g(lazy), new h(null, lazy), function0 == null ? new i(this, lazy) : function0);
    }

    public final void a(D3SView d3SView) {
        d3SView.a(this.f396d, this.f397e, this);
    }

    public static final void a(a this$0, ErrorResponseBody errorResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (errorResponseBody != null) {
            this$0.a(errorResponseBody);
            this$0.requireActivity().onBackPressed();
        }
    }

    public static final void a(a this$0, TransactionResponseBody it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.a(it);
    }

    public static final void a(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar progressBar = this$0.f400h;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        z.c.a(progressBar, bool);
    }

    public static final void b(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_generic), 0).show();
            this$0.requireActivity().onBackPressed();
        }
    }

    public static final void c(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_network), 0).show();
            this$0.requireActivity().onBackPressed();
        }
    }

    public final void d() {
        String string = getString(R.string.payment_sdk_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.payment_sdk_confirmation)");
        String string2 = getString(R.string.payment_sdk_cancel_alert);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.payment_sdk_cancel_alert)");
        z.a.a(this, string, string2, new b());
    }

    private final u.a e() {
        return (u.a) this.f401i.getValue();
    }

    private final void f() {
        requireActivity().getOnBackPressedDispatcher().addCallback(new c());
    }

    public final void g() {
        e().a().observe(getViewLifecycleOwner(), new Observer() { // from class: t.-$$Lambda$a$HsLKwfJVASz5IdV31fk4BuqJuGE
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$HsLKwfJVASz5IdV31fk4BuqJuGE(a.this, (Boolean) obj);
            }
        });
        e().f().observe(getViewLifecycleOwner(), new Observer() { // from class: t.-$$Lambda$a$XJ6vCK6wiJfPg1iubPhKtZyMjg4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$XJ6vCK6wiJfPg1iubPhKtZyMjg4(a.this, (TransactionResponseBody) obj);
            }
        });
        e().c().observe(getViewLifecycleOwner(), new Observer() { // from class: t.-$$Lambda$a$XZUumpxnkCpl4urntx7Gb2AgufY
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$XZUumpxnkCpl4urntx7Gb2AgufY(a.this, (ErrorResponseBody) obj);
            }
        });
        e().e().observe(getViewLifecycleOwner(), new Observer() { // from class: t.-$$Lambda$a$iYHrkHaaLh2GYkqxB_iShTvAIUc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$iYHrkHaaLh2GYkqxB_iShTvAIUc(a.this, (Boolean) obj);
            }
        });
        e().d().observe(getViewLifecycleOwner(), new Observer() { // from class: t.-$$Lambda$a$0qbwaQr2CyV8UznlxXBNPtTj6kk
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$0qbwaQr2CyV8UznlxXBNPtTj6kk(a.this, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$0qbwaQr2CyV8UznlxXBNPtTj6kk(a aVar, Boolean bool) {
        c(aVar, bool);
    }

    public static /* synthetic */ void lambda$HsLKwfJVASz5IdV31fk4BuqJuGE(a aVar, Boolean bool) {
        a(aVar, bool);
    }

    public static /* synthetic */ void lambda$XJ6vCK6wiJfPg1iubPhKtZyMjg4(a aVar, TransactionResponseBody transactionResponseBody) {
        a(aVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$XZUumpxnkCpl4urntx7Gb2AgufY(a aVar, ErrorResponseBody errorResponseBody) {
        a(aVar, errorResponseBody);
    }

    public static /* synthetic */ void lambda$iYHrkHaaLh2GYkqxB_iShTvAIUc(a aVar, Boolean bool) {
        b(aVar, bool);
    }

    @Override // p.a
    public void a() {
        D3SView d3SView = this.f399g;
        if (d3SView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            d3SView = null;
        }
        z.c.d(d3SView);
        e().a(this.f395c, this.f394b);
    }

    @Override // p.a
    public void a(int i2) {
        ProgressBar progressBar = this.f400h;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        z.c.a(progressBar, Boolean.valueOf(i2 < 100));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f394b = arguments.getString("profileId");
            this.f395c = arguments.getString("transactionReference");
            this.f396d = arguments.getString("redUrl");
            this.f397e = arguments.getString("retUrl");
            this.f398f = arguments.getBoolean("TOKENIZE", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View v2 = inflater.inflate(R.layout.fragment_d3s, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        this.f399g = (D3SView) z.c.a(v2, R.id.d3s_webView);
        this.f400h = (ProgressBar) z.c.a(v2, R.id.progress_bar);
        a(0);
        z.b.a((Function0<Unit>) new d());
        f();
        return v2;
    }
}