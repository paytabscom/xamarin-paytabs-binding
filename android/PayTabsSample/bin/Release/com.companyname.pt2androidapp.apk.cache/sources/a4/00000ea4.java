package i;

import android.content.pm.ApplicationInfo;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText;
import com.payment.paymentsdk.creditcard.view.cardform.view.CardForm;
import com.payment.paymentsdk.creditcard.view.cardform.view.CardholderNameEditText;
import com.payment.paymentsdk.creditcard.view.cardform.view.CvvEditText;
import com.payment.paymentsdk.creditcard.view.customs.ExpandableBillingInfo;
import com.payment.paymentsdk.creditcard.view.customs.ExpandableShippingInfo;
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTokenise;
import com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo;
import com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody;
import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import t.a;

@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0003J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J&\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u000e\u0010\u0010\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001aR\u001d\u0010/\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001c\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Li/c;", "Lp0/b;", "", "j", "", "e", "Landroid/view/View;", "v", "a", "k", "h", "d", "c", "n", "o", "p", "b", "", "keyToListen", "Landroid/widget/ImageView;", "logo", "i", "Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "cardForm", "Landroid/widget/EditText;", "et", "", "l", "f", "m", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "view", "onViewCreated", "onResume", "dp", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig$delegate", "Lkotlin/Lazy;", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Ln/a;", "viewModel$delegate", "g", "()Ln/a;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c extends p0.b {

    /* renamed from: g */
    public static final a f219g = new a(null);

    /* renamed from: b */
    private final Lazy f220b = LazyKt.lazy(new k());

    /* renamed from: c */
    private ActivityResultLauncher<String> f221c;

    /* renamed from: d */
    private ExpandableBillingInfo f222d;

    /* renamed from: e */
    private ExpandableShippingInfo f223e;

    /* renamed from: f */
    private final Lazy f224f;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Li/c$a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "Li/c;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(PaymentSdkConfigurationDetails ptConfig) {
            Intrinsics.checkNotNullParameter(ptConfig, "ptConfig");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ptConfig", ptConfig);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.payment.paymentsdk.creditcard.view.PtCreditCardFragment$bindFromUrl$1", f = "CreditCardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f225a;

        /* renamed from: c */
        final /* synthetic */ ImageView f227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImageView imageView, Continuation<? super b> continuation) {
            super(2, continuation);
            c.this = r1;
            this.f227c = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f227c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f225a == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    PaymentSdkConfigurationDetails f2 = c.this.f();
                    URLConnection openConnection = new URL(f2 != null ? f2.getLogoUrl() : null).openConnection();
                    Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.connect();
                    this.f227c.setImageBitmap(BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
                } catch (Exception e2) {
                    z.c.d(this.f227c);
                    e2.printStackTrace();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: i.c$c */
    /* loaded from: classes.dex */
    public static final class C0014c extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0014c() {
            super(0);
            c.this = r1;
        }

        public final void a() {
            c.this.c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"i/c$d", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends OnBackPressedCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(true);
            c.this = r1;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            c.this.d();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            c.this = r1;
        }

        public final void a() {
            c.this.b("kb");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            c.this = r1;
        }

        public final void a() {
            c.this.b("ks");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(0);
            c.this = r1;
        }

        public final void a() {
            c.this.requireActivity().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "", "a", "(Landroid/os/Bundle;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends Lambda implements Function1<Bundle, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(1);
            c.this = r1;
        }

        public final void a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ExpandableBillingInfo expandableBillingInfo = c.this.f222d;
            if (expandableBillingInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
                expandableBillingInfo = null;
            }
            expandableBillingInfo.setCountry(bundle.getString("countryIso"));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
            a(bundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "", "a", "(Landroid/os/Bundle;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends Lambda implements Function1<Bundle, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(1);
            c.this = r1;
        }

        public final void a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ExpandableShippingInfo expandableShippingInfo = c.this.f223e;
            if (expandableShippingInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandableShippingInfo");
                expandableShippingInfo = null;
            }
            expandableShippingInfo.setCountry(bundle.getString("countryIso"));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
            a(bundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ CardForm f236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(CardForm cardForm) {
            super(0);
            c.this = r1;
            this.f236b = cardForm;
        }

        public final void a() {
            c.this.a(this.f236b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(0);
            c.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            Bundle arguments = c.this.getArguments();
            if (arguments != null) {
                return (PaymentSdkConfigurationDetails) arguments.getParcelable("ptConfig");
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$5"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends Lambda implements Function0<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f238a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Fragment invoke() {
            return this.f238a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "a", "()Landroidx/lifecycle/ViewModelStoreOwner;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class m extends Lambda implements Function0<ViewModelStoreOwner> {

        /* renamed from: a */
        final /* synthetic */ Function0 f239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0) {
            super(0);
            this.f239a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f239a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "a", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$6"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class n extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        final /* synthetic */ Lazy f240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Lazy lazy) {
            super(0);
            this.f240a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f240a).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$7"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o extends Lambda implements Function0<CreationExtras> {

        /* renamed from: a */
        final /* synthetic */ Function0 f241a;

        /* renamed from: b */
        final /* synthetic */ Lazy f242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, Lazy lazy) {
            super(0);
            this.f241a = function0;
            this.f242b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f241a;
            if (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) {
                ViewModelStoreOwner viewModelStoreOwner = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.f242b);
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
    public static final class p extends Lambda implements Function0<ViewModelProvider.Factory> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p() {
            super(0);
            c.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            return new o.a(new h.a(new x0.a(x.a.f543a.a())), new y0.a(c.this.f()), c.this.f());
        }
    }

    public c() {
        p pVar = new p();
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new m(new l(this)));
        this.f224f = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(n.a.class), new n(lazy), new o(null, lazy), pVar);
    }

    private final int a(EditText editText) {
        return editText.getRight() - editText.getCompoundDrawables()[2].getBounds().width();
    }

    private final void a(View view) {
        ApplicationInfo applicationInfo = requireContext().getPackageManager().getApplicationInfo(requireContext().getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "requireContext().package…ageManager.GET_META_DATA)");
        Bundle bundle = applicationInfo.metaData;
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("PTPoweredByLogo")) : null;
        if (valueOf == null || valueOf.intValue() <= 0) {
            return;
        }
        ((ImageView) z.c.a(view, R.id.iv_powered_by)).setImageResource(valueOf.intValue());
    }

    private final void a(View view, CardForm cardForm) {
        z.c.a(z.c.a(view, R.id.pt2_pay_button_id), new j(cardForm));
        PaymentSdkConfigurationDetails f2 = f();
        if ((f2 == null || f2.getHideCardScanner()) ? false : true) {
            c(cardForm);
        }
    }

    public static final void a(View v2, Boolean bool) {
        Intrinsics.checkNotNullParameter(v2, "$v");
        z.c.a(z.c.a(v2, R.id.cc_progress_bar), bool);
        ((Button) z.c.a(v2, R.id.pt2_pay_button_id)).setEnabled(!bool.booleanValue());
    }

    private final void a(ImageView imageView) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(imageView, null), 3, null);
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
        beginTransaction.addToBackStack(null);
        beginTransaction.replace(16908290, fragment, "").commit();
    }

    public final void a(CardForm cardForm) {
        CvvEditText cvvEditText;
        if (j()) {
            View view = getView();
            if (view == null || (cvvEditText = (CvvEditText) view.findViewById(R.id.bt_card_form_cvv)) == null) {
                return;
            }
            cvvEditText.e();
            if (cvvEditText.d()) {
                n.a g2 = g();
                String cardNumber = cardForm.getCardNumber();
                Intrinsics.checkNotNullExpressionValue(cardNumber, "cardForm.cardNumber");
                String expirationYear = cardForm.getExpirationYear();
                Intrinsics.checkNotNullExpressionValue(expirationYear, "cardForm.expirationYear");
                String expirationMonth = cardForm.getExpirationMonth();
                Intrinsics.checkNotNullExpressionValue(expirationMonth, "cardForm.expirationMonth");
                String cardholderName = cardForm.getCardholderName();
                Intrinsics.checkNotNullExpressionValue(cardholderName, "cardForm.cardholderName");
                String cvv = cardForm.getCvv();
                Intrinsics.checkNotNullExpressionValue(cvv, "cardForm.cvv");
                g2.a(cardNumber, expirationYear, expirationMonth, cardholderName, cvv, m());
                return;
            }
            return;
        }
        ExpandableBillingInfo expandableBillingInfo = this.f222d;
        ExpandableShippingInfo expandableShippingInfo = null;
        if (expandableBillingInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
            expandableBillingInfo = null;
        }
        expandableBillingInfo.c();
        ExpandableShippingInfo expandableShippingInfo2 = this.f223e;
        if (expandableShippingInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableShippingInfo");
            expandableShippingInfo2 = null;
        }
        expandableShippingInfo2.c();
        if (cardForm.b()) {
            ExpandableBillingInfo expandableBillingInfo2 = this.f222d;
            if (expandableBillingInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
                expandableBillingInfo2 = null;
            }
            if (expandableBillingInfo2.a()) {
                ExpandableShippingInfo expandableShippingInfo3 = this.f223e;
                if (expandableShippingInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("expandableShippingInfo");
                } else {
                    expandableShippingInfo = expandableShippingInfo3;
                }
                if (expandableShippingInfo.a()) {
                    n.a g3 = g();
                    String cardNumber2 = cardForm.getCardNumber();
                    Intrinsics.checkNotNullExpressionValue(cardNumber2, "cardForm.cardNumber");
                    String expirationYear2 = cardForm.getExpirationYear();
                    Intrinsics.checkNotNullExpressionValue(expirationYear2, "cardForm.expirationYear");
                    String expirationMonth2 = cardForm.getExpirationMonth();
                    Intrinsics.checkNotNullExpressionValue(expirationMonth2, "cardForm.expirationMonth");
                    String cardholderName2 = cardForm.getCardholderName();
                    Intrinsics.checkNotNullExpressionValue(cardholderName2, "cardForm.cardholderName");
                    String cvv2 = cardForm.getCvv();
                    Intrinsics.checkNotNullExpressionValue(cvv2, "cardForm.cvv");
                    g3.a(cardNumber2, expirationYear2, expirationMonth2, cardholderName2, cvv2, m());
                }
            }
        }
    }

    public static final void a(CardForm cardForm, c this$0, f.a aVar) {
        Intrinsics.checkNotNullParameter(cardForm, "$cardForm");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (aVar != null) {
            cardForm.getCardEditText().setText(aVar.a());
            cardForm.getCardholderNameEditText().setText(aVar.c());
            cardForm.getExpirationDateEditText().setText(aVar.b());
            return;
        }
        String string = this$0.getString(R.string.payment_sdk_error_card_scanner_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.payme…rror_card_scanner_failed)");
        z.a.a(this$0, string);
    }

    public static final void a(c this$0, Button btn, TextView tvMustCheck, CompoundButton compoundButton, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "$btn");
        Intrinsics.checkNotNullParameter(tvMustCheck, "$tvMustCheck");
        if (this$0.p()) {
            btn.setEnabled(z2);
            z.c.a(tvMustCheck, Boolean.valueOf(!btn.isEnabled()));
        }
    }

    public static final void a(c this$0, ErrorResponseBody errorResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), errorResponseBody != null ? errorResponseBody.getMsg() : null, 0).show();
    }

    public static final void a(c this$0, TransactionResponseBody it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.a(it);
    }

    public static final void a(c this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_generic), 0).show();
    }

    public static final boolean a(c this$0, CardForm cardForm, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardForm, "$cardForm");
        if (motionEvent.getAction() == 1) {
            float rawX = motionEvent.getRawX();
            CardEditText cardEditText = cardForm.getCardEditText();
            Intrinsics.checkNotNullExpressionValue(cardEditText, "cardForm.cardEditText");
            if (rawX >= this$0.a((EditText) cardEditText)) {
                this$0.l();
                return true;
            }
            return false;
        }
        return false;
    }

    private final void b(View view) {
        this.f222d = (ExpandableBillingInfo) z.c.a(view, R.id.payment_sdk_expandable_billing_info);
        ExpandableShippingInfo expandableShippingInfo = (ExpandableShippingInfo) z.c.a(view, R.id.payment_sdk_expandable_shipping_info);
        this.f223e = expandableShippingInfo;
        if (expandableShippingInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableShippingInfo");
            expandableShippingInfo = null;
        }
        PaymentSdkConfigurationDetails f2 = f();
        z.c.a(expandableShippingInfo, Boolean.valueOf(f2 != null ? Intrinsics.areEqual(f2.getShowShippingInfo(), Boolean.TRUE) : false));
        ExpandableBillingInfo expandableBillingInfo = this.f222d;
        if (expandableBillingInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
            expandableBillingInfo = null;
        }
        PaymentSdkConfigurationDetails f3 = f();
        z.c.a(expandableBillingInfo, Boolean.valueOf(f3 != null ? Intrinsics.areEqual(f3.getShowBillingInfo(), Boolean.TRUE) : false));
        ExpandableBillingInfo expandableBillingInfo2 = this.f222d;
        if (expandableBillingInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
            expandableBillingInfo2 = null;
        }
        PaymentSdkConfigurationDetails f4 = f();
        PaymentSdkBillingDetails billingDetails = f4 != null ? f4.getBillingDetails() : null;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        expandableBillingInfo2.a(billingDetails, viewLifecycleOwner, new e());
        ExpandableBillingInfo expandableBillingInfo3 = this.f222d;
        if (expandableBillingInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableBillingInfo");
            expandableBillingInfo3 = null;
        }
        PaymentSdkConfigurationDetails f5 = f();
        expandableBillingInfo3.a(f5 != null ? Intrinsics.areEqual(f5.getLinkBillingNameWithCardHolderName(), Boolean.FALSE) : false);
        ExpandableShippingInfo expandableShippingInfo2 = this.f223e;
        if (expandableShippingInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableShippingInfo");
            expandableShippingInfo2 = null;
        }
        PaymentSdkConfigurationDetails f6 = f();
        PaymentSdkShippingDetails shippingDetails = f6 != null ? f6.getShippingDetails() : null;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        PaymentSdkConfigurationDetails f7 = f();
        expandableShippingInfo2.a(shippingDetails, viewLifecycleOwner2, f7 != null ? f7.getForceShippingInfoValidation() : null, new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.widget.ImageView r5) {
        /*
            r4 = this;
            com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails r0 = r4.f()
            java.lang.String r1 = "parse(this)"
            r2 = 0
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getLogoUrl()
            if (r0 == 0) goto L1d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getScheme()
            goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.String r3 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L3d
            com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails r0 = r4.f()
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.getLogoUrl()
            if (r0 == 0) goto L39
            android.net.Uri r2 = android.net.Uri.parse(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
        L39:
            r5.setImageURI(r2)
            goto L40
        L3d:
            r4.a(r5)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.b(android.widget.ImageView):void");
    }

    private final void b(final CardForm cardForm) {
        ActivityResultLauncher<String> registerForActivityResult = registerForActivityResult(new g.b(), new ActivityResultCallback() { // from class: i.-$$Lambda$c$hOBLF7hfIl73dsFUzAuqnuipidc
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                c.lambda$hOBLF7hfIl73dsFUzAuqnuipidc(CardForm.this, this, (f.a) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f221c = registerForActivityResult;
    }

    public static final void b(c this$0, TransactionResponseBody transactionResponseBody) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.C0029a c0029a = t.a.f393j;
        PaymentSdkConfigurationDetails f2 = this$0.f();
        this$0.a(a.C0029a.a(c0029a, f2 != null ? f2.getProfileId() : null, transactionResponseBody.getRedirectUrl(), transactionResponseBody.getReturnX(), transactionResponseBody.getTranRef(), false, 16, null));
    }

    public static final void b(c this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.requireContext(), this$0.getString(R.string.payment_sdk_error_network), 0).show();
    }

    public final void b(String str) {
        i.a.f215b.a(str).show(getChildFragmentManager(), "");
    }

    private final void c(View view) {
        CheckBox checkBox = (CheckBox) z.c.a(view, R.id.cb_save_card);
        final Button button = (Button) z.c.a(view, R.id.pt2_pay_button_id);
        final TextView textView = (TextView) z.c.a(view, R.id.tv_must_check_toggle);
        z.c.a(checkBox, Boolean.valueOf(n()));
        z.c.a((TextView) z.c.a(view, R.id.tv_save_card), Boolean.valueOf(n()));
        checkBox.setClickable(!o());
        checkBox.setChecked(o());
        z.c.a(textView, Boolean.valueOf(p()));
        if (!j()) {
            button.setEnabled(!p());
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: i.-$$Lambda$c$eN-MIq-hNZ0e4miactJjBGaJPAg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                c.m15lambda$eNMIqhNZ0e4miactJjBGaJPAg(c.this, button, textView, compoundButton, z2);
            }
        });
    }

    private final void c(ImageView imageView) {
        if (i()) {
            z.c.d(imageView);
            return;
        }
        PaymentSdkConfigurationDetails f2 = f();
        if ((f2 != null ? f2.getLogoBitmap() : null) == null) {
            b(imageView);
            return;
        }
        PaymentSdkConfigurationDetails f3 = f();
        imageView.setImageBitmap(f3 != null ? f3.getLogoBitmap() : null);
    }

    private final void c(final CardForm cardForm) {
        cardForm.getCardEditText().setOnTouchListener(new View.OnTouchListener() { // from class: i.-$$Lambda$c$g5Nh7Tcp5hAN4mv_feO5E_g3_Mw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return c.lambda$g5Nh7Tcp5hAN4mv_feO5E_g3_Mw(c.this, cardForm, view, motionEvent);
            }
        });
    }

    public final void d() {
        String string = getString(R.string.payment_sdk_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.payment_sdk_confirmation)");
        String string2 = getString(R.string.payment_sdk_cancel_alert);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.payment_sdk_cancel_alert)");
        z.a.a(this, string, string2, new C0014c());
    }

    private final void d(View view) {
        String screenTitle;
        z.c.a(z.c.a(view, R.id.iv_back), new g());
        TextView textView = (TextView) z.c.a(view, R.id.payment_sdk_tv_title);
        PaymentSdkConfigurationDetails f2 = f();
        boolean z2 = false;
        if (f2 != null && (screenTitle = f2.getScreenTitle()) != null) {
            if (screenTitle.length() > 0) {
                z2 = true;
            }
        }
        z.c.a(textView, Boolean.valueOf(z2));
        PaymentSdkConfigurationDetails f3 = f();
        textView.setText(f3 != null ? f3.getScreenTitle() : null);
        if (i()) {
            ((ConstraintLayout) z.c.a(view, R.id.payment_sdk_cl_header)).setMaxHeight(b(100));
        }
    }

    private final void d(CardForm cardForm) {
        PaymentSdkBillingDetails billingDetails;
        CardForm a2 = cardForm.a(true).c(true).b(true).a(2);
        PaymentSdkConfigurationDetails f2 = f();
        a2.d(f2 != null ? f2.getHideCardScanner() : false).setup(requireActivity());
        PaymentSdkConfigurationDetails f3 = f();
        if (f3 != null ? Intrinsics.areEqual(f3.getLinkBillingNameWithCardHolderName(), Boolean.FALSE) : false) {
            return;
        }
        CardholderNameEditText cardholderNameEditText = cardForm.getCardholderNameEditText();
        PaymentSdkConfigurationDetails f4 = f();
        cardholderNameEditText.setText((f4 == null || (billingDetails = f4.getBillingDetails()) == null) ? null : billingDetails.getName());
    }

    private final void e() {
        View view = getView();
        if (view != null) {
            CardEditText cardEditText = (CardEditText) view.findViewById(R.id.bt_card_form_card_number);
            if (cardEditText != null) {
                Intrinsics.checkNotNullExpressionValue(cardEditText, "findViewById<CardEditTex…bt_card_form_card_number)");
                cardEditText.setFocusableInTouchMode(false);
                cardEditText.setEnabled(false);
                cardEditText.setKeyListener(null);
                PaymentSdkConfigurationDetails f2 = f();
                Intrinsics.checkNotNull(f2);
                PaymentSDKSavedCardInfo savedCardInfo$paymentsdk_release = f2.getSavedCardInfo$paymentsdk_release();
                Intrinsics.checkNotNull(savedCardInfo$paymentsdk_release);
                cardEditText.setText(savedCardInfo$paymentsdk_release.getMaskedCard());
                PaymentSdkConfigurationDetails f3 = f();
                Intrinsics.checkNotNull(f3);
                PaymentSDKSavedCardInfo savedCardInfo$paymentsdk_release2 = f3.getSavedCardInfo$paymentsdk_release();
                Intrinsics.checkNotNull(savedCardInfo$paymentsdk_release2);
                cardEditText.setIcon(savedCardInfo$paymentsdk_release2.getCardType());
            }
            view.findViewById(R.id.cardExpirationLayout).setVisibility(8);
            view.findViewById(R.id.showSaveCardNoLayout).setVisibility(8);
            view.findViewById(R.id.cardHolderLayout).setVisibility(8);
            view.findViewById(R.id.payment_sdk_expandable_billing_info).setVisibility(8);
            view.findViewById(R.id.tv_must_check_toggle).setVisibility(8);
        }
    }

    private final void e(View view) {
        TextView textView = (TextView) z.c.a(view, R.id.pt_tv_amount);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.payment_sdk_credit_card_pay_amount));
        sb.append(' ');
        PaymentSdkConfigurationDetails f2 = f();
        sb.append(f2 != null ? f2.getAmount() : null);
        sb.append(' ');
        PaymentSdkConfigurationDetails f3 = f();
        sb.append(f3 != null ? f3.getCurrencyCode() : null);
        textView.setText(sb.toString());
        c((ImageView) z.c.a(view, R.id.pt_iv_logo));
        b(view);
        c(view);
    }

    public final PaymentSdkConfigurationDetails f() {
        return (PaymentSdkConfigurationDetails) this.f220b.getValue();
    }

    private final void f(final View view) {
        g().a().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$LiRacsFZSo0TT_44Zt-V-fTCeOY
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.m14lambda$LiRacsFZSo0TT_44ZtVfTCeOY(view, (Boolean) obj);
            }
        });
        g().g().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$4ztzlt3l6RJVv_gcboYaFOoZ5JA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.lambda$4ztzlt3l6RJVv_gcboYaFOoZ5JA(c.this, (TransactionResponseBody) obj);
            }
        });
        g().f().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$4DIdQTmxHHsrL-5u5AiBdXP_PCo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.m13lambda$4DIdQTmxHHsrL5u5AiBdXP_PCo(c.this, (TransactionResponseBody) obj);
            }
        });
        g().c().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$eOxin9BRjAo3IfoOTTiYlxr4dwI
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.lambda$eOxin9BRjAo3IfoOTTiYlxr4dwI(c.this, (ErrorResponseBody) obj);
            }
        });
        g().e().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$rleyec3JtcAL2hDYDoqrze9uH5w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.lambda$rleyec3JtcAL2hDYDoqrze9uH5w(c.this, (Boolean) obj);
            }
        });
        g().d().observe(getViewLifecycleOwner(), new Observer() { // from class: i.-$$Lambda$c$sEtT3cr47asUflgsg_A0mveDsmA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.lambda$sEtT3cr47asUflgsg_A0mveDsmA(c.this, (Boolean) obj);
            }
        });
    }

    private final n.a g() {
        return (n.a) this.f224f.getValue();
    }

    private final void h() {
        requireActivity().getOnBackPressedDispatcher().addCallback(new d());
    }

    private final boolean i() {
        PaymentSdkConfigurationDetails f2 = f();
        if ((f2 != null ? f2.getLogoBitmap() : null) == null) {
            PaymentSdkConfigurationDetails f3 = f();
            if ((f3 != null ? f3.getLogoUrl() : null) == null) {
                return true;
            }
        }
        return false;
    }

    private final boolean j() {
        PaymentSdkConfigurationDetails f2 = f();
        if (f2 != null && f2.getRequest3DS$paymentsdk_release()) {
            PaymentSdkConfigurationDetails f3 = f();
            if ((f3 != null ? f3.getSavedCardInfo$paymentsdk_release() : null) != null) {
                PaymentSdkConfigurationDetails f4 = f();
                return (f4 != null ? f4.getToken() : null) != null;
            }
            return false;
        }
        return false;
    }

    private final void k() {
        z.a.a(this, "kb", new h());
        z.a.a(this, "ks", new i());
    }

    private final void l() {
        ActivityResultLauncher<String> activityResultLauncher = this.f221c;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityResult");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch("");
    }

    /* renamed from: lambda$4DIdQTmxHHsrL-5u5AiBdXP_PCo */
    public static /* synthetic */ void m13lambda$4DIdQTmxHHsrL5u5AiBdXP_PCo(c cVar, TransactionResponseBody transactionResponseBody) {
        b(cVar, transactionResponseBody);
    }

    public static /* synthetic */ void lambda$4ztzlt3l6RJVv_gcboYaFOoZ5JA(c cVar, TransactionResponseBody transactionResponseBody) {
        a(cVar, transactionResponseBody);
    }

    /* renamed from: lambda$LiRacsFZSo0TT_44Zt-V-fTCeOY */
    public static /* synthetic */ void m14lambda$LiRacsFZSo0TT_44ZtVfTCeOY(View view, Boolean bool) {
        a(view, bool);
    }

    /* renamed from: lambda$eN-MIq-hNZ0e4miactJjBGaJPAg */
    public static /* synthetic */ void m15lambda$eNMIqhNZ0e4miactJjBGaJPAg(c cVar, Button button, TextView textView, CompoundButton compoundButton, boolean z2) {
        a(cVar, button, textView, compoundButton, z2);
    }

    public static /* synthetic */ void lambda$eOxin9BRjAo3IfoOTTiYlxr4dwI(c cVar, ErrorResponseBody errorResponseBody) {
        a(cVar, errorResponseBody);
    }

    public static /* synthetic */ boolean lambda$g5Nh7Tcp5hAN4mv_feO5E_g3_Mw(c cVar, CardForm cardForm, View view, MotionEvent motionEvent) {
        return a(cVar, cardForm, view, motionEvent);
    }

    public static /* synthetic */ void lambda$hOBLF7hfIl73dsFUzAuqnuipidc(CardForm cardForm, c cVar, f.a aVar) {
        a(cardForm, cVar, aVar);
    }

    public static /* synthetic */ void lambda$rleyec3JtcAL2hDYDoqrze9uH5w(c cVar, Boolean bool) {
        a(cVar, bool);
    }

    public static /* synthetic */ void lambda$sEtT3cr47asUflgsg_A0mveDsmA(c cVar, Boolean bool) {
        b(cVar, bool);
    }

    private final boolean m() {
        View view = getView();
        CheckBox checkBox = view != null ? (CheckBox) z.c.a(view, R.id.cb_save_card) : null;
        if (n()) {
            return checkBox != null && checkBox.isChecked();
        }
        return false;
    }

    private final boolean n() {
        PaymentSdkConfigurationDetails f2 = f();
        return (f2 != null ? f2.getTokeniseType() : null) != PaymentSdkTokenise.NONE;
    }

    private final boolean o() {
        PaymentSdkConfigurationDetails f2 = f();
        return (f2 != null ? f2.getTokeniseType() : null) == PaymentSdkTokenise.MERCHANT_MANDATORY;
    }

    private final boolean p() {
        PaymentSdkConfigurationDetails f2 = f();
        return (f2 != null ? f2.getTokeniseType() : null) == PaymentSdkTokenise.USER_MANDATORY;
    }

    public final int b(int i2) {
        return i2 * (requireContext().getResources().getDisplayMetrics().densityDpi / 160);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View v2 = inflater.inflate(R.layout.fragment_payment_sdk_credit_card, viewGroup, false);
        View findViewById = v2.findViewById(R.id.card_form);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.payment.paymentsdk.creditcard.view.cardform.view.CardForm");
        CardForm cardForm = (CardForm) findViewById;
        g().a(b().h());
        d(cardForm);
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        a(v2, cardForm);
        d(v2);
        e(v2);
        f(v2);
        b(cardForm);
        k();
        a(v2);
        return v2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (j()) {
            e();
        }
    }
}