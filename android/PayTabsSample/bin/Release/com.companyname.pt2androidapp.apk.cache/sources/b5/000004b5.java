package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypedArray.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0015\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001a*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a/\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u001e0 H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"checkAttribute", "", "Landroid/content/res/TypedArray;", "index", "", "getBooleanOrThrow", "", "getColorOrThrow", "getColorStateListOrThrow", "Landroid/content/res/ColorStateList;", "getDimensionOrThrow", "", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "getDrawableOrThrow", "Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "getFontOrThrow", "Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "getStringOrThrow", "", "getTextArrayOrThrow", "", "", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "getTextOrThrow", "use", "R", "block", "Lkotlin/Function1;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i2) {
        if (!typedArray.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray getBooleanOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getBooleanOrThrow, "$this$getBooleanOrThrow");
        checkAttribute(getBooleanOrThrow, i2);
        return getBooleanOrThrow.getBoolean(i2, false);
    }

    public static final int getColorOrThrow(TypedArray getColorOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getColorOrThrow, "$this$getColorOrThrow");
        checkAttribute(getColorOrThrow, i2);
        return getColorOrThrow.getColor(i2, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray getColorStateListOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getColorStateListOrThrow, "$this$getColorStateListOrThrow");
        checkAttribute(getColorStateListOrThrow, i2);
        ColorStateList colorStateList = getColorStateListOrThrow.getColorStateList(i2);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(TypedArray getDimensionOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getDimensionOrThrow, "$this$getDimensionOrThrow");
        checkAttribute(getDimensionOrThrow, i2);
        return getDimensionOrThrow.getDimension(i2, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray getDimensionPixelOffsetOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getDimensionPixelOffsetOrThrow, "$this$getDimensionPixelOffsetOrThrow");
        checkAttribute(getDimensionPixelOffsetOrThrow, i2);
        return getDimensionPixelOffsetOrThrow.getDimensionPixelOffset(i2, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray getDimensionPixelSizeOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getDimensionPixelSizeOrThrow, "$this$getDimensionPixelSizeOrThrow");
        checkAttribute(getDimensionPixelSizeOrThrow, i2);
        return getDimensionPixelSizeOrThrow.getDimensionPixelSize(i2, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray getDrawableOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getDrawableOrThrow, "$this$getDrawableOrThrow");
        checkAttribute(getDrawableOrThrow, i2);
        Drawable drawable = getDrawableOrThrow.getDrawable(i2);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray getFloatOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getFloatOrThrow, "$this$getFloatOrThrow");
        checkAttribute(getFloatOrThrow, i2);
        return getFloatOrThrow.getFloat(i2, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray getFontOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getFontOrThrow, "$this$getFontOrThrow");
        checkAttribute(getFontOrThrow, i2);
        Typeface font = getFontOrThrow.getFont(i2);
        Intrinsics.checkNotNull(font);
        return font;
    }

    public static final int getIntOrThrow(TypedArray getIntOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getIntOrThrow, "$this$getIntOrThrow");
        checkAttribute(getIntOrThrow, i2);
        return getIntOrThrow.getInt(i2, 0);
    }

    public static final int getIntegerOrThrow(TypedArray getIntegerOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getIntegerOrThrow, "$this$getIntegerOrThrow");
        checkAttribute(getIntegerOrThrow, i2);
        return getIntegerOrThrow.getInteger(i2, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray getResourceIdOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getResourceIdOrThrow, "$this$getResourceIdOrThrow");
        checkAttribute(getResourceIdOrThrow, i2);
        return getResourceIdOrThrow.getResourceId(i2, 0);
    }

    public static final String getStringOrThrow(TypedArray getStringOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getStringOrThrow, "$this$getStringOrThrow");
        checkAttribute(getStringOrThrow, i2);
        String string = getStringOrThrow.getString(i2);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final CharSequence getTextOrThrow(TypedArray getTextOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getTextOrThrow, "$this$getTextOrThrow");
        checkAttribute(getTextOrThrow, i2);
        CharSequence text = getTextOrThrow.getText(i2);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray getTextArrayOrThrow, int i2) {
        Intrinsics.checkNotNullParameter(getTextArrayOrThrow, "$this$getTextArrayOrThrow");
        checkAttribute(getTextArrayOrThrow, i2);
        CharSequence[] textArray = getTextArrayOrThrow.getTextArray(i2);
        Intrinsics.checkNotNullExpressionValue(textArray, "getTextArray(index)");
        return textArray;
    }

    public static final <R> R use(TypedArray use, Function1<? super TypedArray, ? extends R> block) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        Intrinsics.checkNotNullParameter(block, "block");
        R invoke = block.invoke(use);
        use.recycle();
        return invoke;
    }
}