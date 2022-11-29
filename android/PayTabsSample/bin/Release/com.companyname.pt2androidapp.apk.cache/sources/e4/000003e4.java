package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.R;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    private float mCrossfade;
    private ImageFilterView.ImageMatrix mImageMatrix;
    LayerDrawable mLayer;
    Drawable[] mLayers;
    private boolean mOverlay;
    private Path mPath;
    RectF mRect;
    private float mRound;
    private float mRoundPercent;
    ViewOutlineProvider mViewOutlineProvider;

    public ImageFilterButton(Context context) {
        super(context);
        this.mImageMatrix = new ImageFilterView.ImageMatrix();
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mOverlay = true;
        init(context, null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mImageMatrix = new ImageFilterView.ImageMatrix();
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mOverlay = true;
        init(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mImageMatrix = new ImageFilterView.ImageMatrix();
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mOverlay = true;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.mCrossfade = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.mOverlay));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.mLayers = drawableArr;
                drawableArr[0] = getDrawable();
                this.mLayers[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
                this.mLayer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
                super.setImageDrawable(this.mLayer);
            }
        }
    }

    private void setOverlay(boolean z2) {
        this.mOverlay = z2;
    }

    public void setSaturation(float f2) {
        this.mImageMatrix.mSaturation = f2;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getSaturation() {
        return this.mImageMatrix.mSaturation;
    }

    public void setContrast(float f2) {
        this.mImageMatrix.mContrast = f2;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getContrast() {
        return this.mImageMatrix.mContrast;
    }

    public void setWarmth(float f2) {
        this.mImageMatrix.mWarmth = f2;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getWarmth() {
        return this.mImageMatrix.mWarmth;
    }

    public void setCrossfade(float f2) {
        this.mCrossfade = f2;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public float getCrossfade() {
        return this.mCrossfade;
    }

    public void setBrightness(float f2) {
        this.mImageMatrix.mBrightness = f2;
        this.mImageMatrix.updateMatrix(this);
    }

    public void setRoundPercent(float f2) {
        boolean z2 = this.mRoundPercent != f2;
        this.mRoundPercent = f2;
        if (f2 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            int width = ImageFilterButton.this.getWidth();
                            int height = ImageFilterButton.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.mRoundPercent) / 2.0f);
                        }
                    };
                    this.mViewOutlineProvider = viewOutlineProvider;
                    setOutlineProvider(viewOutlineProvider);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (!z2 || Build.VERSION.SDK_INT < 21) {
            return;
        }
        invalidateOutline();
    }

    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.mRound = f2;
            float f3 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z2 = this.mRound != f2;
        this.mRound = f2;
        if (f2 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.mRound);
                        }
                    };
                    this.mViewOutlineProvider = viewOutlineProvider;
                    setOutlineProvider(viewOutlineProvider);
                }
                setClipToOutline(true);
            }
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f4 = this.mRound;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (!z2 || Build.VERSION.SDK_INT < 21) {
            return;
        }
        invalidateOutline();
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getRound() {
        return this.mRound;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 21 || this.mRound == 0.0f || this.mPath == null) {
            z2 = false;
        } else {
            z2 = true;
            canvas.save();
            canvas.clipPath(this.mPath);
        }
        super.draw(canvas);
        if (z2) {
            canvas.restore();
        }
    }
}