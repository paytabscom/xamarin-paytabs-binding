package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;

/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new CursorWindow(str, j2);
        }
        if (Build.VERSION.SDK_INT >= 15) {
            return new CursorWindow(str);
        }
        return new CursorWindow(false);
    }
}