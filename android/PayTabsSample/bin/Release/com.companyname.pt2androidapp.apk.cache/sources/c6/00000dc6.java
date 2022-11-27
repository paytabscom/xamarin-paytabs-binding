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

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010&B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b$\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J7\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b\u0007\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0011R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/payment/paymentsdk/creditcard/view/customs/ExpandableShippingInfo;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "a", "", "Lm/a;", "Lcom/payment/paymentsdk/creditcard/view/customs/PaytabsEditText;", "getEditTextsIdsMap", "b", "Lp0/a;", "data", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "shouldValidate", "Lkotlin/Function0;", "onCountryClicked", "(Lp0/a;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V", "", "countryIso", "setCountry", "c", "Landroidx/lifecycle/LifecycleOwner;", "viewLifeCycleOwner", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "Ljava/lang/Boolean;", "Landroidx/lifecycle/MutableLiveData;", "Lw0/b;", "f", "Landroidx/lifecycle/MutableLiveData;", "validatorLD", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExpandableShippingInfo extends ConstraintLayout {

    /* renamed from: a */
    private LifecycleOwner f150a;

    /* renamed from: b */
    private ConstraintLayout f151b;

    /* renamed from: c */
    private Boolean f152c;

    /* renamed from: d */
    private b f153d;

    /* renamed from: e */
    private y0.b f154e;

    /* renamed from: f */
    private MutableLiveData<w0.b> f155f;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f156a;

        /* renamed from: b */
        final /* synthetic */ ExpandableShippingInfo f157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LinearLayout linearLayout, ExpandableShippingInfo expandableShippingInfo) {
            super(0);
            this.f156a = linearLayout;
            this.f157b = expandableShippingInfo;
        }

        public final void a() {
            b bVar = null;
            if (this.f156a.getVisibility() == 0) {
                b bVar2 = this.f157b.f153d;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar = bVar2;
                }
                bVar.a();
                return;
            }
            b bVar3 = this.f157b.f153d;
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
    public ExpandableShippingInfo(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f152c = Boolean.TRUE;
        this.f155f = new MutableLiveData<>();
        a(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableShippingInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f152c = Boolean.TRUE;
        this.f155f = new MutableLiveData<>();
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableShippingInfo(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f152c = Boolean.TRUE;
        this.f155f = new MutableLiveData<>();
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_expandable_shipping_info, (ViewGroup) this, true);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f151b = constraintLayout;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout = null;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) c.a((View) constraintLayout, R.id.cl_main_shipping);
        ConstraintLayout constraintLayout4 = this.f151b;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout4 = null;
        }
        LinearLayout linearLayout = (LinearLayout) c.a((View) constraintLayout4, R.id.ll_shipping);
        ConstraintLayout constraintLayout5 = this.f151b;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout5 = null;
        }
        ImageView imageView = (ImageView) c.a((View) constraintLayout5, R.id.payment_sdk_iv_expandable_shipping_arrow);
        ConstraintLayout constraintLayout6 = this.f151b;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            constraintLayout2 = constraintLayout6;
        }
        b bVar = new b(context, constraintLayout3, linearLayout, (TextView) c.a((View) constraintLayout2, R.id.payment_sdk_tv_expandable_shipping_info), imageView, getEditTextsIdsMap());
        this.f153d = bVar;
        bVar.a();
        c.a(c.a((View) constraintLayout3, R.id.payment_sdk_cl_shipping_expandable), new a(linearLayout, this));
    }

    public static final void a(ExpandableShippingInfo this$0, w0.b bVar) {
        m.a aVar;
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar2 = null;
        if (bVar instanceof b.c) {
            boolean a2 = ((b.c) bVar).a();
            m.b bVar3 = this$0.f153d;
            if (a2) {
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar3;
                }
                aVar = m.a.COUNTRY;
                i2 = R.string.payment_sdk_error_empty_shipping_country_code;
            } else {
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar3;
                }
                aVar = m.a.COUNTRY;
                i2 = R.string.payment_sdk_error_invalid_shipping_country_code;
            }
        } else if (bVar instanceof b.C0032b) {
            boolean a3 = ((b.C0032b) bVar).a();
            m.b bVar4 = this$0.f153d;
            if (a3) {
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar4;
                }
                aVar = m.a.CITY;
                i2 = R.string.payment_sdk_error_empty_shipping_city;
            } else {
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar4;
                }
                aVar = m.a.CITY;
                i2 = R.string.payment_sdk_error_invalid_shipping_city;
            }
        } else if (bVar instanceof b.h) {
            boolean a4 = ((b.h) bVar).a();
            m.b bVar5 = this$0.f153d;
            if (a4) {
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar5;
                }
                aVar = m.a.STATE;
                i2 = R.string.payment_sdk_error_empty_shipping_state;
            } else {
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar5;
                }
                aVar = m.a.STATE;
                i2 = R.string.payment_sdk_error_invalid_shipping_state;
            }
        } else if (bVar instanceof b.i) {
            boolean a5 = ((b.i) bVar).a();
            m.b bVar6 = this$0.f153d;
            if (a5) {
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar6;
                }
                aVar = m.a.ADDRESS;
                i2 = R.string.payment_sdk_error_empty_shipping_address;
            } else {
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar6;
                }
                aVar = m.a.ADDRESS;
                i2 = R.string.payment_sdk_error_invalid_shipping_address;
            }
        } else if (bVar instanceof b.j) {
            boolean a6 = ((b.j) bVar).a();
            m.b bVar7 = this$0.f153d;
            if (a6) {
                if (bVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar7;
                }
                aVar = m.a.ZIP;
                i2 = R.string.payment_sdk_error_empty_shipping_zip_code;
            } else {
                if (bVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar7;
                }
                aVar = m.a.ZIP;
                i2 = R.string.payment_sdk_error_invalid_shipping_zip_code;
            }
        } else if (bVar instanceof b.d) {
            boolean a7 = ((b.d) bVar).a();
            m.b bVar8 = this$0.f153d;
            if (a7) {
                if (bVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar8;
                }
                aVar = m.a.EMAIL;
                i2 = R.string.payment_sdk_error_empty_shipping_email;
            } else {
                if (bVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar8;
                }
                aVar = m.a.EMAIL;
                i2 = R.string.payment_sdk_error_invalid_shipping_email;
            }
        } else if (bVar instanceof b.g) {
            boolean a8 = ((b.g) bVar).a();
            m.b bVar9 = this$0.f153d;
            if (a8) {
                if (bVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar9;
                }
                aVar = m.a.PHONE;
                i2 = R.string.payment_sdk_error_empty_shipping_phone;
            } else {
                if (bVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar9;
                }
                aVar = m.a.PHONE;
                i2 = R.string.payment_sdk_error_invalid_shipping_phone;
            }
        } else if (!(bVar instanceof b.e)) {
            return;
        } else {
            boolean a9 = ((b.e) bVar).a();
            m.b bVar10 = this$0.f153d;
            if (a9) {
                if (bVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar10;
                }
                aVar = m.a.NAME;
                i2 = R.string.payment_sdk_error_empty_shipping_full_name;
            } else {
                if (bVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar10;
                }
                aVar = m.a.NAME;
                i2 = R.string.payment_sdk_error_invalid_shipping_full_name;
            }
        }
        bVar2.a(aVar, i2);
    }

    private final void b() {
        MutableLiveData<w0.b> mutableLiveData = this.f155f;
        LifecycleOwner lifecycleOwner = this.f150a;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifeCycleOwner");
            lifecycleOwner = null;
        }
        mutableLiveData.observe(lifecycleOwner, new Observer() { // from class: com.payment.paymentsdk.creditcard.view.customs.-$$Lambda$ExpandableShippingInfo$6sQC7Io7Qe0VnB1k6ig0rIno9k4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ExpandableShippingInfo.lambda$6sQC7Io7Qe0VnB1k6ig0rIno9k4(ExpandableShippingInfo.this, (w0.b) obj);
            }
        });
    }

    private final Map<m.a, PaytabsEditText> getEditTextsIdsMap() {
        Pair[] pairArr = new Pair[8];
        m.a aVar = m.a.COUNTRY;
        ConstraintLayout constraintLayout = this.f151b;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout = null;
        }
        pairArr[0] = TuplesKt.to(aVar, c.a((View) constraintLayout, R.id.pet_shipping_country));
        m.a aVar2 = m.a.CITY;
        ConstraintLayout constraintLayout3 = this.f151b;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout3 = null;
        }
        pairArr[1] = TuplesKt.to(aVar2, c.a((View) constraintLayout3, R.id.pet_shipping_city));
        m.a aVar3 = m.a.STATE;
        ConstraintLayout constraintLayout4 = this.f151b;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout4 = null;
        }
        pairArr[2] = TuplesKt.to(aVar3, c.a((View) constraintLayout4, R.id.pet_shipping_state));
        m.a aVar4 = m.a.ADDRESS;
        ConstraintLayout constraintLayout5 = this.f151b;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout5 = null;
        }
        pairArr[3] = TuplesKt.to(aVar4, c.a((View) constraintLayout5, R.id.pet_shipping_address));
        m.a aVar5 = m.a.ZIP;
        ConstraintLayout constraintLayout6 = this.f151b;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout6 = null;
        }
        pairArr[4] = TuplesKt.to(aVar5, c.a((View) constraintLayout6, R.id.pet_shipping_zip));
        m.a aVar6 = m.a.NAME;
        ConstraintLayout constraintLayout7 = this.f151b;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout7 = null;
        }
        pairArr[5] = TuplesKt.to(aVar6, c.a((View) constraintLayout7, R.id.pet_shipping_name));
        m.a aVar7 = m.a.PHONE;
        ConstraintLayout constraintLayout8 = this.f151b;
        if (constraintLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            constraintLayout8 = null;
        }
        pairArr[6] = TuplesKt.to(aVar7, c.a((View) constraintLayout8, R.id.pet_shipping_phone));
        m.a aVar8 = m.a.EMAIL;
        ConstraintLayout constraintLayout9 = this.f151b;
        if (constraintLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            constraintLayout2 = constraintLayout9;
        }
        pairArr[7] = TuplesKt.to(aVar8, c.a((View) constraintLayout2, R.id.pet_shipping_email));
        return MapsKt.mapOf(pairArr);
    }

    public static /* synthetic */ void lambda$6sQC7Io7Qe0VnB1k6ig0rIno9k4(ExpandableShippingInfo expandableShippingInfo, w0.b bVar) {
        a(expandableShippingInfo, bVar);
    }

    public final void a(p0.a aVar, LifecycleOwner lifecycleOwner, Boolean bool, Function0<Unit> onCountryClicked) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onCountryClicked, "onCountryClicked");
        m.b bVar = this.f153d;
        m.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            bVar = null;
        }
        bVar.a(aVar);
        this.f150a = lifecycleOwner;
        this.f154e = new y0.b(aVar, true);
        this.f152c = bool;
        m.b bVar3 = this.f153d;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        } else {
            bVar2 = bVar3;
        }
        bVar2.a(onCountryClicked);
    }

    public final boolean a() {
        boolean z2 = true;
        if (Intrinsics.areEqual(this.f152c, Boolean.TRUE)) {
            if (getVisibility() == 0) {
                y0.b bVar = this.f154e;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("validator");
                    bVar = null;
                }
                z2 = y0.b.a(bVar, this.f155f, false, 2, null);
                if (!z2) {
                    c.c(this);
                }
            }
        }
        return z2;
    }

    public final void c() {
        if (Intrinsics.areEqual(this.f152c, Boolean.TRUE)) {
            if (getVisibility() == 0) {
                y0.b bVar = this.f154e;
                m.b bVar2 = null;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("validator");
                    bVar = null;
                }
                if (y0.b.a(bVar, this.f155f, false, 2, null)) {
                    return;
                }
                b();
                m.b bVar3 = this.f153d;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                } else {
                    bVar2 = bVar3;
                }
                bVar2.b();
            }
        }
    }

    public final void setCountry(String str) {
        m.b bVar = this.f153d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            bVar = null;
        }
        bVar.a(str);
    }
}