package com.payment.paymentsdk.creditcard.view.customs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.payment.paymentsdk.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m.b;
import w0.b;
import z.c;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010#B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u0010\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0017J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/payment/paymentsdk/creditcard/view/customs/ExpandableBillingInfo;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "a", "b", "", "Lm/a;", "Lcom/payment/paymentsdk/creditcard/view/customs/PaytabsEditText;", "getEditTextsIdsMap", "Lp0/a;", "data", "Landroidx/lifecycle/LifecycleOwner;", "lifeCycleOwner", "Lkotlin/Function0;", "onCountryClicked", "", "countryIso", "setCountry", "c", "", "shouldShow", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "Landroidx/lifecycle/MutableLiveData;", "Lw0/b;", "e", "Landroidx/lifecycle/MutableLiveData;", "validatorLD", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExpandableBillingInfo extends ConstraintLayout {

    /* renamed from: a */
    private LifecycleOwner f143a;

    /* renamed from: b */
    private ConstraintLayout f144b;

    /* renamed from: c */
    private b f145c;

    /* renamed from: d */
    private y0.b f146d;

    /* renamed from: e */
    private MutableLiveData<w0.b> f147e;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f148a;

        /* renamed from: b */
        final /* synthetic */ ExpandableBillingInfo f149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LinearLayout linearLayout, ExpandableBillingInfo expandableBillingInfo) {
            super(0);
            this.f148a = linearLayout;
            this.f149b = expandableBillingInfo;
        }

        public final void a() {
            b bVar = null;
            if (this.f148a.getVisibility() == 0) {
                b bVar2 = this.f149b.f145c;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar = bVar2;
                }
                bVar.a();
                return;
            }
            b bVar3 = this.f149b.f145c;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                bVar = bVar3;
            }
            bVar.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableBillingInfo(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f147e = new MutableLiveData<>();
        a(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableBillingInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f147e = new MutableLiveData<>();
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableBillingInfo(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f147e = new MutableLiveData<>();
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_expandable_billing_info, (ViewGroup) this, true);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f144b = constraintLayout;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout = null;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) c.a((View) constraintLayout, R.id.cl_main_billing);
        ConstraintLayout constraintLayout4 = this.f144b;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout4 = null;
        }
        LinearLayout linearLayout = (LinearLayout) c.a((View) constraintLayout4, R.id.ll_billing);
        ConstraintLayout constraintLayout5 = this.f144b;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout5 = null;
        }
        ImageView imageView = (ImageView) c.a((View) constraintLayout5, R.id.payment_sdk_iv_expandable_billing_arrow);
        ConstraintLayout constraintLayout6 = this.f144b;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            constraintLayout2 = constraintLayout6;
        }
        b bVar = new b(context, constraintLayout3, linearLayout, (TextView) c.a((View) constraintLayout2, R.id.payment_sdk_tv_expandable_billing_info), imageView, getEditTextsIdsMap());
        this.f145c = bVar;
        bVar.a();
        c.a(c.a((View) constraintLayout3, R.id.payment_sdk_cl_billing_expandable), new a(linearLayout, this));
    }

    public static final void a(ExpandableBillingInfo this$0, w0.b bVar) {
        m.a aVar;
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar2 = null;
        if (bVar instanceof b.c) {
            boolean a2 = ((b.c) bVar).a();
            m.b bVar3 = this$0.f145c;
            if (a2) {
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar3;
                }
                aVar = m.a.COUNTRY;
                i2 = R.string.payment_sdk_error_empty_billing_country_code;
            } else {
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar3;
                }
                aVar = m.a.COUNTRY;
                i2 = R.string.payment_sdk_error_invalid_billing_country_code;
            }
        } else if (bVar instanceof b.C0032b) {
            boolean a3 = ((b.C0032b) bVar).a();
            m.b bVar4 = this$0.f145c;
            if (a3) {
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar4;
                }
                aVar = m.a.CITY;
                i2 = R.string.payment_sdk_error_empty_billing_city;
            } else {
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar4;
                }
                aVar = m.a.CITY;
                i2 = R.string.payment_sdk_error_invalid_billing_city;
            }
        } else if (bVar instanceof b.h) {
            boolean a4 = ((b.h) bVar).a();
            m.b bVar5 = this$0.f145c;
            if (a4) {
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar5;
                }
                aVar = m.a.STATE;
                i2 = R.string.payment_sdk_error_empty_billing_state;
            } else {
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar5;
                }
                aVar = m.a.STATE;
                i2 = R.string.payment_sdk_error_invalid_billing_state;
            }
        } else if (bVar instanceof b.i) {
            boolean a5 = ((b.i) bVar).a();
            m.b bVar6 = this$0.f145c;
            if (a5) {
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar6;
                }
                aVar = m.a.ADDRESS;
                i2 = R.string.payment_sdk_error_empty_billing_address;
            } else {
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar6;
                }
                aVar = m.a.ADDRESS;
                i2 = R.string.payment_sdk_error_invalid_billing_address;
            }
        } else if (bVar instanceof b.j) {
            boolean a6 = ((b.j) bVar).a();
            m.b bVar7 = this$0.f145c;
            if (a6) {
                if (bVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar7;
                }
                aVar = m.a.ZIP;
                i2 = R.string.payment_sdk_error_empty_billing_zip_code;
            } else {
                if (bVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar7;
                }
                aVar = m.a.ZIP;
                i2 = R.string.payment_sdk_error_invalid_billing_zip_code;
            }
        } else if (bVar instanceof b.d) {
            boolean a7 = ((b.d) bVar).a();
            m.b bVar8 = this$0.f145c;
            if (a7) {
                if (bVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar8;
                }
                aVar = m.a.EMAIL;
                i2 = R.string.payment_sdk_error_empty_billing_email;
            } else {
                if (bVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar8;
                }
                aVar = m.a.EMAIL;
                i2 = R.string.payment_sdk_error_invalid_billing_email;
            }
        } else if (bVar instanceof b.g) {
            boolean a8 = ((b.g) bVar).a();
            m.b bVar9 = this$0.f145c;
            if (a8) {
                if (bVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar9;
                }
                aVar = m.a.PHONE;
                i2 = R.string.payment_sdk_error_empty_billing_phone;
            } else {
                if (bVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar9;
                }
                aVar = m.a.PHONE;
                i2 = R.string.payment_sdk_error_invalid_billing_phone;
            }
        } else if (!(bVar instanceof b.e)) {
            if (Intrinsics.areEqual(bVar, b.f.f538a)) {
                return;
            }
            Intrinsics.areEqual(bVar, b.a.f533a);
            return;
        } else {
            boolean a9 = ((b.e) bVar).a();
            m.b bVar10 = this$0.f145c;
            if (a9) {
                if (bVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar10;
                }
                aVar = m.a.NAME;
                i2 = R.string.payment_sdk_error_empty_billing_full_name;
            } else {
                if (bVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar10;
                }
                aVar = m.a.NAME;
                i2 = R.string.payment_sdk_error_invalid_billing_full_name;
            }
        }
        bVar2.a(aVar, i2);
    }

    private final void b() {
        MutableLiveData<w0.b> mutableLiveData = this.f147e;
        LifecycleOwner lifecycleOwner = this.f143a;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifeCycleOwner");
            lifecycleOwner = null;
        }
        mutableLiveData.observe(lifecycleOwner, new Observer() { // from class: com.payment.paymentsdk.creditcard.view.customs.-$$Lambda$ExpandableBillingInfo$SYGV1hm48YtJopZQkvIywpOxPAw
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ExpandableBillingInfo.lambda$SYGV1hm48YtJopZQkvIywpOxPAw(ExpandableBillingInfo.this, (w0.b) obj);
            }
        });
    }

    private final Map<m.a, PaytabsEditText> getEditTextsIdsMap() {
        Pair[] pairArr = new Pair[8];
        m.a aVar = m.a.COUNTRY;
        ConstraintLayout constraintLayout = this.f144b;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout = null;
        }
        pairArr[0] = TuplesKt.to(aVar, c.a((View) constraintLayout, R.id.pet_billing_country));
        m.a aVar2 = m.a.CITY;
        ConstraintLayout constraintLayout3 = this.f144b;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout3 = null;
        }
        pairArr[1] = TuplesKt.to(aVar2, c.a((View) constraintLayout3, R.id.pet_billing_city));
        m.a aVar3 = m.a.STATE;
        ConstraintLayout constraintLayout4 = this.f144b;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout4 = null;
        }
        pairArr[2] = TuplesKt.to(aVar3, c.a((View) constraintLayout4, R.id.pet_billing_state));
        m.a aVar4 = m.a.ADDRESS;
        ConstraintLayout constraintLayout5 = this.f144b;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout5 = null;
        }
        pairArr[3] = TuplesKt.to(aVar4, c.a((View) constraintLayout5, R.id.pet_billing_address));
        m.a aVar5 = m.a.ZIP;
        ConstraintLayout constraintLayout6 = this.f144b;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout6 = null;
        }
        pairArr[4] = TuplesKt.to(aVar5, c.a((View) constraintLayout6, R.id.pet_billing_zip));
        m.a aVar6 = m.a.NAME;
        ConstraintLayout constraintLayout7 = this.f144b;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout7 = null;
        }
        pairArr[5] = TuplesKt.to(aVar6, c.a((View) constraintLayout7, R.id.pet_billing_name));
        m.a aVar7 = m.a.PHONE;
        ConstraintLayout constraintLayout8 = this.f144b;
        if (constraintLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout8 = null;
        }
        pairArr[6] = TuplesKt.to(aVar7, c.a((View) constraintLayout8, R.id.pet_billing_phone));
        m.a aVar8 = m.a.EMAIL;
        ConstraintLayout constraintLayout9 = this.f144b;
        if (constraintLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            constraintLayout2 = constraintLayout9;
        }
        pairArr[7] = TuplesKt.to(aVar8, c.a((View) constraintLayout2, R.id.pet_billing_email));
        return MapsKt.mapOf(pairArr);
    }

    public static /* synthetic */ void lambda$SYGV1hm48YtJopZQkvIywpOxPAw(ExpandableBillingInfo expandableBillingInfo, w0.b bVar) {
        a(expandableBillingInfo, bVar);
    }

    public final void a(p0.a aVar, LifecycleOwner lifeCycleOwner, Function0<Unit> onCountryClicked) {
        Intrinsics.checkNotNullParameter(lifeCycleOwner, "lifeCycleOwner");
        Intrinsics.checkNotNullParameter(onCountryClicked, "onCountryClicked");
        m.b bVar = this.f145c;
        m.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            bVar = null;
        }
        bVar.a(aVar);
        this.f143a = lifeCycleOwner;
        this.f146d = new y0.b(aVar, false);
        m.b bVar3 = this.f145c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        } else {
            bVar2 = bVar3;
        }
        bVar2.a(onCountryClicked);
    }

    public final void a(boolean z2) {
        ConstraintLayout constraintLayout = this.f144b;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout = null;
        }
        View a2 = c.a((View) constraintLayout, R.id.pet_billing_name);
        Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText");
        ((PaytabsEditText) a2).setVisibility(z2 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001f, code lost:
        if ((getVisibility() == 0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            y0.b r0 = r5.f146d
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "validator"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        Lb:
            androidx.lifecycle.MutableLiveData<w0.b> r2 = r5.f147e
            r3 = 2
            r4 = 0
            boolean r0 = y0.b.a(r0, r2, r4, r3, r1)
            r1 = 1
            if (r0 != 0) goto L21
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L22
        L21:
            r4 = 1
        L22:
            if (r4 != 0) goto L27
            z.c.c(r5)
        L27:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payment.paymentsdk.creditcard.view.customs.ExpandableBillingInfo.a():boolean");
    }

    public final void c() {
        if (getVisibility() == 0) {
            y0.b bVar = this.f146d;
            m.b bVar2 = null;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("validator");
                bVar = null;
            }
            if (y0.b.a(bVar, this.f147e, false, 2, null)) {
                return;
            }
            b();
            m.b bVar3 = this.f145c;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                bVar2 = bVar3;
            }
            bVar2.b();
        }
    }

    public final void setCountry(String str) {
        m.b bVar = this.f145c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            bVar = null;
        }
        bVar.a(str);
    }
}