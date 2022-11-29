package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class RoundedBitmapDrawableFactory {
    private static final String TAG = "RoundedBitmapDrawableFa";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean z2) {
            if (this.mBitmap != null) {
                BitmapCompat.setHasMipMap(this.mBitmap, z2);
                invalidateSelf();
            }
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
            return this.mBitmap != null && BitmapCompat.hasMipMap(this.mBitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void gravityCompatApply(int i2, int i3, int i4, Rect rect, Rect rect2) {
            GravityCompat.apply(i2, i3, i4, rect, rect2, 0);
        }
    }

    public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RoundedBitmapDrawable21(resources, bitmap);
        }
        return new DefaultRoundedBitmapDrawable(resources, bitmap);
    }

    public static RoundedBitmapDrawable create(Resources resources, String str) {
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeFile(str));
        if (create.getBitmap() == null) {
            Log.w(TAG, "RoundedBitmapDrawable cannot decode " + str);
        }
        return create;
    }

    public static RoundedBitmapDrawable create(Resources resources, InputStream inputStream) {
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeStream(inputStream));
        if (create.getBitmap() == null) {
            Log.w(TAG, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return create;
    }

    private RoundedBitmapDrawableFactory() {
    }
}