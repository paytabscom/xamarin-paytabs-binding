package e0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.core.app.NotificationCompat;
import com.payment.paymentsdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "activity", "", NotificationCompat.CATEGORY_MESSAGE, "", "a", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    public static final void a(Activity activity, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        dialogInterface.dismiss();
        activity.finish();
    }

    public static final void a(final Activity activity, String msg) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(msg, "msg");
        new AlertDialog.Builder(activity).setTitle(R.string.payment_sdk_error_validation_title).setMessage(msg).setCancelable(false).setPositiveButton(R.string.payment_sdk_ok, new DialogInterface.OnClickListener() { // from class: e0.-$$Lambda$d$E1_UxlGEYrATYt2bCLBK7XyOImg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                d.lambda$E1_UxlGEYrATYt2bCLBK7XyOImg(activity, dialogInterface, i2);
            }
        }).show();
    }

    public static /* synthetic */ void lambda$E1_UxlGEYrATYt2bCLBK7XyOImg(Activity activity, DialogInterface dialogInterface, int i2) {
        a(activity, dialogInterface, i2);
    }
}