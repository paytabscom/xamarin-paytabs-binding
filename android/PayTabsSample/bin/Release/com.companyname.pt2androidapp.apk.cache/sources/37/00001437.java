package e0;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes.dex */
public class f {
    public static boolean a() {
        return Build.VERSION.SDK_INT > 22;
    }

    public static boolean a(Activity activity, String str) {
        return !a() || activity.checkSelfPermission(str) == 0;
    }
}