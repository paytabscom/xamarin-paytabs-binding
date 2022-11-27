package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkArgument(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t2) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException();
        }
        return t2;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t2, Object obj) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t2;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t2, String str, Object... objArr) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t2;
    }

    public static <T> T checkNotNull(T t2) {
        Objects.requireNonNull(t2);
        return t2;
    }

    public static <T> T checkNotNull(T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkState(boolean z2) {
        checkState(z2, null);
    }

    public static int checkFlagsArgument(int i2, int i3) {
        if ((i2 & i3) == i2) {
            return i2;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(i3) + " are allowed");
    }

    public static int checkArgumentNonnegative(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkArgumentNonnegative(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static int checkArgumentInRange(int i2, int i3, int i4, String str) {
        if (i2 >= i3) {
            if (i2 <= i4) {
                return i2;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    private Preconditions() {
    }
}