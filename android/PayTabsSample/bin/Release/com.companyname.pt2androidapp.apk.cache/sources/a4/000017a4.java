package z;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import com.payment.paymentsdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a\u0012\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001\u001a(\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "reqKey", "Lkotlin/Function1;", "Landroid/os/Bundle;", "Lkotlin/ParameterName;", "name", "bundle", "", "callback", "a", NotificationCompat.CATEGORY_MESSAGE, "title", "Lkotlin/Function0;", "onPositiveClicked", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final void a(Fragment fragment, String msg) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Toast.makeText(fragment.requireContext(), msg, 0).show();
    }

    public static final void a(Fragment fragment, String title, String msg, final Function0<Unit> onPositiveClicked) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(onPositiveClicked, "onPositiveClicked");
        new AlertDialog.Builder(fragment.requireContext()).setTitle(title).setMessage(msg).setPositiveButton(R.string.payment_sdk_yes, new DialogInterface.OnClickListener() { // from class: z.-$$Lambda$a$77XVLEs-wdQkOssvA3BX8iL5M_I
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.m1453lambda$77XVLEswdQkOssvA3BX8iL5M_I(Function0.this, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.payment_sdk_no, (DialogInterface.OnClickListener) null).show();
    }

    public static final void a(Fragment fragment, String reqKey, final Function1<? super Bundle, Unit> callback) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(reqKey, "reqKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fragment.getChildFragmentManager().setFragmentResultListener(reqKey, fragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: z.-$$Lambda$a$65hecHwr_rseiGAtVkt3-5x1poI
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                a.m1452lambda$65hecHwr_rseiGAtVkt35x1poI(Function1.this, str, bundle);
            }
        });
    }

    public static final void a(Function0 onPositiveClicked, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(onPositiveClicked, "$onPositiveClicked");
        onPositiveClicked.invoke();
    }

    public static final void a(Function1 callback, String str, Bundle b2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(b2, "b");
        callback.invoke(b2);
    }

    /* renamed from: lambda$65hecHwr_rseiGAtVkt3-5x1poI */
    public static /* synthetic */ void m1452lambda$65hecHwr_rseiGAtVkt35x1poI(Function1 function1, String str, Bundle bundle) {
        a(function1, str, bundle);
    }

    /* renamed from: lambda$77XVLEs-wdQkOssvA3BX8iL5M_I */
    public static /* synthetic */ void m1453lambda$77XVLEswdQkOssvA3BX8iL5M_I(Function0 function0, DialogInterface dialogInterface, int i2) {
        a(function0, dialogInterface, i2);
    }
}