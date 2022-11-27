package m;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.payment.paymentsdk.R;
import com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b'\u0010(J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J5\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000eJ\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¨\u0006)"}, d2 = {"Lm/b;", "", "", "text", "Lm/a;", "viewResourceKey", "", "a", "petResourceKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "onChange", "", "drawableResourceToSet", "b", "colorResource", "c", "arrowResource", "stringId", "Lp0/a;", "data", "Lkotlin/Function0;", "onCountryClicked", "countryIso", "Landroid/content/Context;", "context", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mainLayout", "Landroid/widget/LinearLayout;", "infoLayout", "Landroid/widget/TextView;", "tvInfo", "Landroid/widget/ImageView;", "ivArrow", "", "Lcom/payment/paymentsdk/creditcard/view/customs/PaytabsEditText;", "paymentSdkEditTextsMap", "<init>", "(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Ljava/util/Map;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f311a;

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f312b;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayout f313c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f314d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f315e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<m.a, PaytabsEditText> f316f;

    /* renamed from: g  reason: collision with root package name */
    private p0.a f317g;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaytabsEditText f319b;

        public a(Function1 function1, PaytabsEditText paytabsEditText) {
            this.f318a = function1;
            this.f319b = paytabsEditText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f318a.invoke(String.valueOf(charSequence));
            this.f319b.setError(null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0020b extends Lambda implements Function0<Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0020b(Function0<Unit> function0, EditText editText) {
            super(0);
            this.f320a = function0;
            this.f321b = editText;
        }

        public final void a() {
            this.f320a.invoke();
            z.c.a((View) this.f321b, 1000L);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p0.a aVar) {
            super(1);
            this.f322a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f322a;
            if (aVar == null) {
                return;
            }
            aVar.setCountryCode(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p0.a aVar) {
            super(1);
            this.f323a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f323a;
            if (aVar == null) {
                return;
            }
            aVar.setCity(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class e extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p0.a aVar) {
            super(1);
            this.f324a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f324a;
            if (aVar == null) {
                return;
            }
            aVar.setName(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class f extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p0.a aVar) {
            super(1);
            this.f325a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f325a;
            if (aVar == null) {
                return;
            }
            aVar.setEmail(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class g extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p0.a aVar) {
            super(1);
            this.f326a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f326a;
            if (aVar == null) {
                return;
            }
            aVar.setPhone(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class h extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p0.a aVar) {
            super(1);
            this.f327a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f327a;
            if (aVar == null) {
                return;
            }
            aVar.setAddressLine(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class i extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(p0.a aVar) {
            super(1);
            this.f328a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f328a;
            if (aVar == null) {
                return;
            }
            aVar.setState(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class j extends Lambda implements Function1<String, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.a f329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p0.a aVar) {
            super(1);
            this.f329a = aVar;
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            p0.a aVar = this.f329a;
            if (aVar == null) {
                return;
            }
            aVar.setZip(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    public b(Context context, ConstraintLayout mainLayout, LinearLayout infoLayout, TextView tvInfo, ImageView ivArrow, Map<m.a, PaytabsEditText> paymentSdkEditTextsMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainLayout, "mainLayout");
        Intrinsics.checkNotNullParameter(infoLayout, "infoLayout");
        Intrinsics.checkNotNullParameter(tvInfo, "tvInfo");
        Intrinsics.checkNotNullParameter(ivArrow, "ivArrow");
        Intrinsics.checkNotNullParameter(paymentSdkEditTextsMap, "paymentSdkEditTextsMap");
        this.f311a = context;
        this.f312b = mainLayout;
        this.f313c = infoLayout;
        this.f314d = tvInfo;
        this.f315e = ivArrow;
        this.f316f = paymentSdkEditTextsMap;
    }

    private final void a(int i2) {
        this.f315e.setImageResource(i2);
    }

    private final void a(String str, m.a aVar) {
        EditText editText;
        PaytabsEditText paytabsEditText = this.f316f.get(aVar);
        if (paytabsEditText == null || (editText = paytabsEditText.getEditText()) == null) {
            return;
        }
        editText.setText(str);
    }

    private final void a(m.a aVar, Function1<? super String, Unit> function1) {
        PaytabsEditText paytabsEditText = this.f316f.get(aVar);
        if (paytabsEditText != null) {
            paytabsEditText.getEditText().addTextChangedListener(new a(function1, paytabsEditText));
        }
    }

    private final void b(int i2) {
        this.f312b.setBackground(ContextCompat.getDrawable(this.f311a, i2));
    }

    private final void c(int i2) {
        this.f314d.setTextColor(ContextCompat.getColor(this.f311a, i2));
    }

    public final void a() {
        b(R.drawable.bg_expandable);
        z.c.a(this.f313c);
        a(R.drawable.ic_payment_sdk_icon_arrow_collapsed);
        c(R.color.payment_sdk_button_text_color);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        z.c.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = e0.b.b(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Map<m.a, com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText> r0 = r3.f316f
            m.a r1 = m.a.ZIP
            java.lang.Object r0 = r0.get(r1)
            com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText r0 = (com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText) r0
            java.util.List r1 = e0.b.d()
            boolean r1 = kotlin.collections.CollectionsKt.contains(r1, r4)
            if (r1 == 0) goto L1e
            if (r0 == 0) goto L48
            goto L3f
        L1e:
            java.util.Map r1 = e0.b.c()
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L43
            if (r0 == 0) goto L3d
            android.widget.EditText r1 = r0.getEditText()
            if (r1 == 0) goto L3d
            java.util.Map r2 = e0.b.c()
            java.lang.Object r2 = r2.get(r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L3d:
            if (r0 == 0) goto L48
        L3f:
            z.c.a(r0)
            goto L48
        L43:
            if (r0 == 0) goto L48
            z.c.c(r0)
        L48:
            m.a r0 = m.a.COUNTRY
            r3.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.a(java.lang.String):void");
    }

    public final void a(Function0<Unit> onCountryClicked) {
        Intrinsics.checkNotNullParameter(onCountryClicked, "onCountryClicked");
        PaytabsEditText paytabsEditText = this.f316f.get(m.a.COUNTRY);
        EditText editText = paytabsEditText != null ? paytabsEditText.getEditText() : null;
        if (editText != null) {
            z.c.a(editText, new C0020b(onCountryClicked, editText));
        }
    }

    public final void a(m.a aVar, int i2) {
        PaytabsEditText paytabsEditText = this.f316f.get(aVar);
        if (paytabsEditText != null) {
            paytabsEditText.setError(this.f311a.getString(i2));
        }
    }

    public final void a(p0.a aVar) {
        this.f317g = aVar;
        a(aVar != null ? aVar.getCountryCode() : null);
        String city = aVar != null ? aVar.getCity() : null;
        m.a aVar2 = m.a.CITY;
        a(city, aVar2);
        String name = aVar != null ? aVar.getName() : null;
        m.a aVar3 = m.a.NAME;
        a(name, aVar3);
        String email = aVar != null ? aVar.getEmail() : null;
        m.a aVar4 = m.a.EMAIL;
        a(email, aVar4);
        String phone = aVar != null ? aVar.getPhone() : null;
        m.a aVar5 = m.a.PHONE;
        a(phone, aVar5);
        String addressLine = aVar != null ? aVar.getAddressLine() : null;
        m.a aVar6 = m.a.ADDRESS;
        a(addressLine, aVar6);
        String state = aVar != null ? aVar.getState() : null;
        m.a aVar7 = m.a.STATE;
        a(state, aVar7);
        String zip = aVar != null ? aVar.getZip() : null;
        m.a aVar8 = m.a.ZIP;
        a(zip, aVar8);
        a(m.a.COUNTRY, new c(aVar));
        a(aVar2, new d(aVar));
        a(aVar3, new e(aVar));
        a(aVar4, new f(aVar));
        a(aVar5, new g(aVar));
        a(aVar6, new h(aVar));
        a(aVar7, new i(aVar));
        a(aVar8, new j(aVar));
    }

    public final void b() {
        b(R.drawable.bg_white);
        z.c.c(this.f313c);
        a(R.drawable.ic_payment_sdk_icon_arrow_expanded);
        c(R.color.payment_sdk_secondary_color);
    }
}