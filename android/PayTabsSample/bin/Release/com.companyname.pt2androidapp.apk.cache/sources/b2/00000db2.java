package com.payment.paymentsdk;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import b1.a;
import c.a;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import h0.a;
import i.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import w0.a;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b!\u0010\u001fR\u001b\u0010&\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/payment/paymentsdk/a;", "Lp0/b;", "", "g", "", "j", "", "stringId", "b", "Landroidx/fragment/app/Fragment;", "fragment", "a", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "Lkotlin/Lazy;", "d", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "", "c", "e", "()Ljava/lang/String;", "samsungPayToken", "i", "()Ljava/lang/Boolean;", "isSamsungPayEnabled", "h", "isApmsEnabled", "Lcom/payment/paymentsdk/b;", "f", "()Lcom/payment/paymentsdk/b;", "viewModel", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends p0.b {

    /* renamed from: g */
    public static final C0009a f92g = new C0009a(null);

    /* renamed from: b */
    private final Lazy f93b = LazyKt.lazy(new d());

    /* renamed from: c */
    private final Lazy f94c = LazyKt.lazy(new e());

    /* renamed from: d */
    private final Lazy f95d = LazyKt.lazy(new c());

    /* renamed from: e */
    private final Lazy f96e = LazyKt.lazy(new b());

    /* renamed from: f */
    private final Lazy f97f = LazyKt.lazy(new f());

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/payment/paymentsdk/a$a;", "", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfig", "", "samsungPaymentToken", "", "isSamsungPaymentEnabled", "isApmEnabled", "Lcom/payment/paymentsdk/a;", "a", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/payment/paymentsdk/a;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.payment.paymentsdk.a$a */
    /* loaded from: classes.dex */
    public static final class C0009a {
        private C0009a() {
        }

        public /* synthetic */ C0009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(PaymentSdkConfigurationDetails paymentSdkConfigurationDetails, String str, Boolean bool, Boolean bool2) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("configData", paymentSdkConfigurationDetails);
            bundle.putString("samsung_token", str);
            bundle.putBoolean("Is_SAM_PAY_ENABLED", bool != null ? bool.booleanValue() : false);
            bundle.putBoolean("ARG_IS_APM_ENABLED", bool2 != null ? bool2.booleanValue() : false);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements Function0<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Boolean invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return Boolean.valueOf(arguments.getBoolean("ARG_IS_APM_ENABLED", false));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements Function0<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Boolean invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return Boolean.valueOf(arguments.getBoolean("Is_SAM_PAY_ENABLED", false));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements Function0<PaymentSdkConfigurationDetails> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentSdkConfigurationDetails invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return (PaymentSdkConfigurationDetails) arguments.getParcelable("configData");
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function0<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return arguments.getString("samsung_token");
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/payment/paymentsdk/b;", "a", "()Lcom/payment/paymentsdk/b;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends Lambda implements Function0<com.payment.paymentsdk.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.payment.paymentsdk.b invoke() {
            a aVar = a.this;
            Application application = aVar.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "requireActivity().application");
            return (com.payment.paymentsdk.b) new ViewModelProvider(aVar, new com.payment.paymentsdk.c(application, new y0.a(a.this.d()))).get(com.payment.paymentsdk.b.class);
        }
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
        beginTransaction.add(16908290, fragment, "").commit();
    }

    public static final void a(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            c.a aVar = i.c.f219g;
            PaymentSdkConfigurationDetails d2 = this$0.d();
            Intrinsics.checkNotNull(d2);
            this$0.a(aVar.a(d2));
        }
    }

    public static final void a(a this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.C0012a c0012a = h0.a.f203e;
        PaymentSdkConfigurationDetails d2 = this$0.d();
        Intrinsics.checkNotNull(d2);
        String e2 = this$0.e();
        Intrinsics.checkNotNull(e2);
        this$0.a(c0012a.a(d2, e2));
    }

    public static final void a(a this$0, w0.a aVar) {
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(aVar, a.s.f525a)) {
            i2 = R.string.payment_sdk_error_missing_config_data;
        } else if (Intrinsics.areEqual(aVar, a.t.f526a)) {
            i2 = R.string.payment_sdk_error_missing_profile_id;
        } else if (Intrinsics.areEqual(aVar, a.w.f529a)) {
            i2 = R.string.payment_sdk_error_missing_server_key;
        } else if (aVar instanceof a.d) {
            i2 = ((a.d) aVar).a() ? R.string.payment_sdk_error_empty_billing_country_code : R.string.payment_sdk_error_invalid_billing_country_code;
        } else if (aVar instanceof a.c) {
            i2 = ((a.c) aVar).a() ? R.string.payment_sdk_error_empty_billing_city : R.string.payment_sdk_error_invalid_billing_city;
        } else if (aVar instanceof a.i) {
            i2 = ((a.i) aVar).a() ? R.string.payment_sdk_error_empty_billing_state : R.string.payment_sdk_error_invalid_billing_state;
        } else if (aVar instanceof a.j) {
            i2 = ((a.j) aVar).a() ? R.string.payment_sdk_error_empty_billing_address : R.string.payment_sdk_error_invalid_billing_address;
        } else if (aVar instanceof a.k) {
            i2 = ((a.k) aVar).a() ? R.string.payment_sdk_error_empty_billing_zip_code : R.string.payment_sdk_error_invalid_billing_zip_code;
        } else if (aVar instanceof a.e) {
            i2 = ((a.e) aVar).a() ? R.string.payment_sdk_error_empty_billing_email : R.string.payment_sdk_error_invalid_billing_email;
        } else if (aVar instanceof a.h) {
            i2 = ((a.h) aVar).a() ? R.string.payment_sdk_error_empty_billing_phone : R.string.payment_sdk_error_invalid_billing_phone;
        } else if (aVar instanceof a.f) {
            i2 = ((a.f) aVar).a() ? R.string.payment_sdk_error_empty_billing_full_name : R.string.payment_sdk_error_invalid_billing_full_name;
        } else if (Intrinsics.areEqual(aVar, a.g.f513a)) {
            i2 = R.string.payment_sdk_error_missing_billing_info;
        } else if (Intrinsics.areEqual(aVar, a.l.f518a)) {
            i2 = R.string.payment_sdk_error_invalid_amount;
        } else if (Intrinsics.areEqual(aVar, a.q.f523a)) {
            i2 = R.string.payment_sdk_error_missing_server_ip;
        } else if (aVar instanceof a.m) {
            i2 = ((a.m) aVar).a() ? R.string.payment_sdk_error_missing_currency : R.string.payment_sdk_error_invalid_currency;
        } else if (aVar instanceof a.y) {
            i2 = ((a.y) aVar).a() ? R.string.payment_sdk_error_empty_shipping_country_code : R.string.payment_sdk_error_invalid_shipping_country_code;
        } else if (aVar instanceof a.x) {
            i2 = ((a.x) aVar).a() ? R.string.payment_sdk_error_empty_shipping_city : R.string.payment_sdk_error_invalid_shipping_city;
        } else if (aVar instanceof a.d0) {
            i2 = ((a.d0) aVar).a() ? R.string.payment_sdk_error_empty_shipping_state : R.string.payment_sdk_error_invalid_shipping_state;
        } else if (aVar instanceof a.e0) {
            i2 = ((a.e0) aVar).a() ? R.string.payment_sdk_error_empty_shipping_address : R.string.payment_sdk_error_invalid_shipping_address;
        } else if (aVar instanceof a.f0) {
            i2 = ((a.f0) aVar).a() ? R.string.payment_sdk_error_empty_shipping_zip_code : R.string.payment_sdk_error_invalid_shipping_zip_code;
        } else if (aVar instanceof a.z) {
            i2 = ((a.z) aVar).a() ? R.string.payment_sdk_error_empty_shipping_email : R.string.payment_sdk_error_invalid_shipping_email;
        } else if (aVar instanceof a.c0) {
            i2 = ((a.c0) aVar).a() ? R.string.payment_sdk_error_empty_shipping_phone : R.string.payment_sdk_error_invalid_shipping_phone;
        } else if (aVar instanceof a.a0) {
            i2 = ((a.a0) aVar).a() ? R.string.payment_sdk_error_empty_shipping_full_name : R.string.payment_sdk_error_invalid_shipping_full_name;
        } else if (Intrinsics.areEqual(aVar, a.b0.f504a)) {
            i2 = R.string.payment_sdk_error_missing_shipping_info;
        } else if (Intrinsics.areEqual(aVar, a.o.f521a)) {
            i2 = R.string.payment_sdk_error_missing_cart_id;
        } else if (Intrinsics.areEqual(aVar, a.n.f520a)) {
            i2 = R.string.payment_sdk_error_missing_cart_description;
        } else if (aVar instanceof a.r) {
            i2 = ((a.r) aVar).a() ? R.string.payment_sdk_error_missing_merchant_country_code : R.string.payment_sdk_error_invalid_merchant_country_code;
        } else if (Intrinsics.areEqual(aVar, a.p.f522a)) {
            i2 = R.string.payment_sdk_error_missing_client_key;
        } else if (Intrinsics.areEqual(aVar, a.u.f527a)) {
            i2 = R.string.payment_sdk_error_missing_saved_card_info;
        } else if (Intrinsics.areEqual(aVar, a.v.f528a)) {
            i2 = R.string.payment_sdk_error_missing_card_token;
        } else if (Intrinsics.areEqual(aVar, a.b.f503a)) {
            com.payment.paymentsdk.b f2 = this$0.f();
            PaymentSdkConfigurationDetails d2 = this$0.d();
            Intrinsics.checkNotNull(d2);
            f2.a(d2);
            com.payment.paymentsdk.b f3 = this$0.f();
            PaymentSdkConfigurationDetails d3 = this$0.d();
            Intrinsics.checkNotNull(d3);
            f3.a(d3, this$0.e(), this$0.i(), this$0.h());
            return;
        } else if (!Intrinsics.areEqual(aVar, a.C0031a.f501a)) {
            return;
        } else {
            i2 = R.string.payment_sdk_error_no_apms;
        }
        this$0.b(i2);
    }

    private final void b(int i2) {
        String string = getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(stringId)");
        a(string);
    }

    public static final void b(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            a.C0005a c0005a = b1.a.f18e;
            PaymentSdkConfigurationDetails d2 = this$0.d();
            Intrinsics.checkNotNull(d2);
            this$0.a(c0005a.a(d2));
        }
    }

    public static final void c(a this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            a.C0006a c0006a = c.a.f31d;
            PaymentSdkConfigurationDetails d2 = this$0.d();
            Intrinsics.checkNotNull(d2);
            this$0.a(c0006a.a(d2));
        }
    }

    public final PaymentSdkConfigurationDetails d() {
        return (PaymentSdkConfigurationDetails) this.f93b.getValue();
    }

    public static final void d(a this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(R.string.payment_sdk_samsung_pay_error_missing_token);
    }

    private final String e() {
        return (String) this.f94c.getValue();
    }

    private final com.payment.paymentsdk.b f() {
        return (com.payment.paymentsdk.b) this.f97f.getValue();
    }

    private final boolean g() {
        if (Build.VERSION.SDK_INT >= 23) {
            Application application = requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "requireActivity().application");
            return new k0.a(application).d();
        }
        return false;
    }

    private final Boolean h() {
        return (Boolean) this.f96e.getValue();
    }

    private final Boolean i() {
        return (Boolean) this.f95d.getValue();
    }

    private final void j() {
        f().h().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$4DPJlTe0zecQmWVpG_l_0lJwkBA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$4DPJlTe0zecQmWVpG_l_0lJwkBA(a.this, (Boolean) obj);
            }
        });
        f().i().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$GiuXPbNW5JtWjeBiKqvvIQq6tso
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$GiuXPbNW5JtWjeBiKqvvIQq6tso(a.this, (String) obj);
            }
        });
        f().j().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$RG6cRA831qh19oLMl_GebJMk4Yc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$RG6cRA831qh19oLMl_GebJMk4Yc(a.this, (Boolean) obj);
            }
        });
        f().g().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$LlD1vQGGq1YjI6-O_xwJNp7eVwA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.m10lambda$LlD1vQGGq1YjI6O_xwJNp7eVwA(a.this, (Boolean) obj);
            }
        });
        f().f().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$Ca66ILM_MRXGwR2YPhZ22rfm8qM
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$Ca66ILM_MRXGwR2YPhZ22rfm8qM(a.this, (Boolean) obj);
            }
        });
        f().k().observe(getViewLifecycleOwner(), new Observer() { // from class: com.payment.paymentsdk.-$$Lambda$a$d85jefloGB41FXC1ae4yJdfTeGw
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$d85jefloGB41FXC1ae4yJdfTeGw(a.this, (w0.a) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$4DPJlTe0zecQmWVpG_l_0lJwkBA(a aVar, Boolean bool) {
        a(aVar, bool);
    }

    public static /* synthetic */ void lambda$Ca66ILM_MRXGwR2YPhZ22rfm8qM(a aVar, Boolean bool) {
        d(aVar, bool);
    }

    public static /* synthetic */ void lambda$GiuXPbNW5JtWjeBiKqvvIQq6tso(a aVar, String str) {
        a(aVar, str);
    }

    /* renamed from: lambda$LlD1vQGGq1YjI6-O_xwJNp7eVwA */
    public static /* synthetic */ void m10lambda$LlD1vQGGq1YjI6O_xwJNp7eVwA(a aVar, Boolean bool) {
        c(aVar, bool);
    }

    public static /* synthetic */ void lambda$RG6cRA831qh19oLMl_GebJMk4Yc(a aVar, Boolean bool) {
        b(aVar, bool);
    }

    public static /* synthetic */ void lambda$d85jefloGB41FXC1ae4yJdfTeGw(a aVar, w0.a aVar2) {
        a(aVar, aVar2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        f().a(i(), Intrinsics.areEqual(h(), Boolean.TRUE), g());
        j();
        return inflater.inflate(R.layout.activity_payment_sdk, viewGroup, false);
    }
}