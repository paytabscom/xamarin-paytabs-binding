package k;

import android.content.Context;
import android.os.Vibrator;

/* loaded from: classes.dex */
public class d {
    public static void a(Context context, int i2) {
        if (a(context)) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(i2);
        }
    }

    public static boolean a(Context context) {
        return context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0;
    }
}