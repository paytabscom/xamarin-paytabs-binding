package k;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.payment.paymentsdk.R;

/* loaded from: classes.dex */
public class e {
    public static boolean a(Activity activity) {
        int color = activity.getResources().getColor(R.color.bt_white);
        try {
            Drawable background = activity.getWindow().getDecorView().getRootView().getBackground();
            if (background instanceof ColorDrawable) {
                color = ((ColorDrawable) background).getColor();
            }
        } catch (Exception unused) {
        }
        return ((((double) Color.red(color)) * 0.2126d) + (((double) Color.green(color)) * 0.7152d)) + (((double) Color.blue(color)) * 0.0722d) < 128.0d;
    }
}