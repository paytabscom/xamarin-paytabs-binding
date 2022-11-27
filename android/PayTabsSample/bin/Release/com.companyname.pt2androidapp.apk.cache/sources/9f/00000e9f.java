package i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.payment.paymentsdk.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, d2 = {"Li/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "La0/a;", "", "", "getTheme", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "t", "", "a", "keyToListen$delegate", "Lkotlin/Lazy;", "()Ljava/lang/String;", "keyToListen", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends BottomSheetDialogFragment implements a0.a<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final C0013a f215b = new C0013a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f216a = LazyKt.lazy(new b());

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Li/a$a;", "", "", "keyToListen", "Li/a;", "a", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0013a {
        private C0013a() {
        }

        public /* synthetic */ C0013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String keyToListen) {
            Intrinsics.checkNotNullParameter(keyToListen, "keyToListen");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("keyToListen", keyToListen);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends Lambda implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            Bundle arguments = a.this.getArguments();
            if (arguments != null) {
                return arguments.getString("keyToListen");
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        public final void a() {
            a.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private final String a() {
        return (String) this.f216a.getValue();
    }

    @Override // a0.a
    public void a(String str) {
        String a2 = e0.b.a(str);
        String a3 = a();
        if (a3 != null) {
            FragmentKt.setFragmentResult(this, a3, BundleKt.bundleOf(TuplesKt.to("countryIso", a2)));
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.BaseBottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View v2 = inflater.inflate(R.layout.bottom_sheet_list_single_selection, viewGroup, false);
        f.b bVar = new f.b(e0.b.a(), this);
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        ((RecyclerView) z.c.a(v2, R.id.payment_sdk_recyclerView)).setAdapter(bVar);
        z.c.a(z.c.a(v2, R.id.payment_sdk_iv_close), new c());
        return v2;
    }
}