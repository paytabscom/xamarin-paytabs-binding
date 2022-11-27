package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bitmap.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a)\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0014H\u0086\n\u001a\u001d\u0010\u0015\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\n\u001a'\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086\b\u001a'\u0010\u001a\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0003H\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "hasAlpha", "", "colorSpace", "Landroid/graphics/ColorSpace;", "applyCanvas", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "contains", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "get", "x", "y", "scale", "filter", "set", "color", "core-ktx_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap applyCanvas, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(applyCanvas, "$this$applyCanvas");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(new Canvas(applyCanvas));
        return applyCanvas;
    }

    public static final int get(Bitmap get, int i2, int i3) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        return get.getPixel(i2, i3);
    }

    public static final void set(Bitmap set, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setPixel(i2, i3, i4);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap scale, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z2 = true;
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(scale, i2, i3, z2);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return createScaledBitmap;
    }

    public static final Bitmap scale(Bitmap scale, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(scale, i2, i3, z2);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, boolean z2, ColorSpace colorSpace, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i4 & 8) != 0) {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace, "ColorSpace.get(ColorSpace.Named.SRGB)");
        }
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config, boolean z2, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final boolean contains(Bitmap contains, Point p2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(p2, "p");
        return p2.x >= 0 && p2.x < contains.getWidth() && p2.y >= 0 && p2.y < contains.getHeight();
    }

    public static final boolean contains(Bitmap contains, PointF p2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(p2, "p");
        float f2 = 0;
        return p2.x >= f2 && p2.x < ((float) contains.getWidth()) && p2.y >= f2 && p2.y < ((float) contains.getHeight());
    }
}