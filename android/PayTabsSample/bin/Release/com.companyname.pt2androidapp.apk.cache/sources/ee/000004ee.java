package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    /* JADX INFO: Access modifiers changed from: protected */
    public RoundedBitmapDrawable21(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z2) {
        if (this.mBitmap != null) {
            this.mBitmap.setHasMipMap(z2);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        return this.mBitmap != null && this.mBitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void gravityCompatApply(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, rect2, 0);
    }
}