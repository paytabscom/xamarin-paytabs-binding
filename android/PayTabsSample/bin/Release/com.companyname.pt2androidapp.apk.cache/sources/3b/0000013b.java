package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ColorStateListInflaterCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class AppCompatResources {
    private static final String LOG_TAG = "AppCompatResources";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);
    private static final Object sColorStateCacheLock = new Object();

    private AppCompatResources() {
    }

    public static ColorStateList getColorStateList(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList cachedColorStateList = getCachedColorStateList(context, i2);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList inflateColorStateList = inflateColorStateList(context, i2);
        if (inflateColorStateList != null) {
            addColorStateListToCache(context, i2, inflateColorStateList);
            return inflateColorStateList;
        }
        return ContextCompat.getColorStateList(context, i2);
    }

    public static Drawable getDrawable(Context context, int i2) {
        return ResourceManagerInternal.get().getDrawable(context, i2);
    }

    private static ColorStateList inflateColorStateList(Context context, int i2) {
        if (isColorInt(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e(LOG_TAG, "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static ColorStateList getCachedColorStateList(Context context, int i2) {
        ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (sColorStateCacheLock) {
            SparseArray<ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i2)) != null) {
                if (colorStateListCacheEntry.configuration.equals(context.getResources().getConfiguration())) {
                    return colorStateListCacheEntry.value;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    private static void addColorStateListToCache(Context context, int i2, ColorStateList colorStateList) {
        synchronized (sColorStateCacheLock) {
            WeakHashMap<Context, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            SparseArray<ColorStateListCacheEntry> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new ColorStateListCacheEntry(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean isColorInt(Context context, int i2) {
        Resources resources = context.getResources();
        TypedValue typedValue = getTypedValue();
        resources.getValue(i2, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = TL_TYPED_VALUE;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ColorStateListCacheEntry {
        final Configuration configuration;
        final ColorStateList value;

        ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration) {
            this.value = colorStateList;
            this.configuration = configuration;
        }
    }
}