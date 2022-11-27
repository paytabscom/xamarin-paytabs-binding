package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes.dex */
public final class MenuCompat {
    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i2) {
        menuItem.setShowAsAction(i2);
    }

    public static void setGroupDividerEnabled(Menu menu, boolean z2) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z2);
        } else if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z2);
        }
    }

    private MenuCompat() {
    }
}