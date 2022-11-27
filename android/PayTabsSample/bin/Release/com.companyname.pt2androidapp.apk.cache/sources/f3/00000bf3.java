package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ProgressIndicator;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final Animatable2Compat.AnimationCallback hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final Animatable2Compat.AnimationCallback switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ShowAnimationBehavior {
    }

    abstract S createSpec(Context context, AttributeSet attributeSet);

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, DEF_STYLE_RES), attributeSet, i2);
        this.lastShowStartTime = -1L;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        this.delayedShow = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.internalShow();
            }
        };
        this.delayedHide = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.internalHide();
                BaseProgressIndicator.this.lastShowStartTime = -1L;
            }
        };
        this.switchIndeterminateModeCallback = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                BaseProgressIndicator.this.setIndeterminate(false);
                BaseProgressIndicator.this.setProgressCompat(0, false);
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.storedProgress, BaseProgressIndicator.this.storedProgressAnimated);
            }
        };
        this.hideAnimationCallback = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                if (BaseProgressIndicator.this.isIndeterminateModeChangeRequested) {
                    return;
                }
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.visibilityAfterHide);
            }
        };
        Context context2 = getContext();
        this.spec = createSpec(context2, attributeSet);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i2, i3, new int[0]);
        this.showDelay = obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.minHideDelay = Math.min(obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        obtainStyledAttributes.recycle();
        this.animatorDurationScaleProvider = new AnimatorDurationScaleProvider();
        this.isParentDoneInitializing = true;
    }

    private void registerAnimationCallbacks() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().getAnimatorDelegate().registerAnimatorsCompleteCallback(this.switchIndeterminateModeCallback);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
    }

    private void unregisterAnimationCallbacks() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
            getIndeterminateDrawable().getAnimatorDelegate().unregisterAnimatorsCompleteCallback();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
        }
    }

    public void show() {
        if (this.showDelay > 0) {
            removeCallbacks(this.delayedShow);
            postDelayed(this.delayedShow, this.showDelay);
            return;
        }
        this.delayedShow.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long uptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i2 = this.minHideDelay;
        if (uptimeMillis >= ((long) i2)) {
            this.delayedHide.run();
        } else {
            postDelayed(this.delayedHide, i2 - uptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, true);
        if (isNoLongerNeedToBeVisible()) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        applyNewVisibility(i2 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        applyNewVisibility(false);
    }

    protected void applyNewVisibility(boolean z2) {
        if (this.isParentDoneInitializing) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, z2);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerAnimationCallbacks();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).hideNow();
        unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i2, i3);
        DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int preferredWidth = currentDrawingDelegate.getPreferredWidth();
        int preferredHeight = currentDrawingDelegate.getPreferredHeight();
        if (preferredWidth < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = preferredWidth + getPaddingLeft() + getPaddingRight();
        }
        if (preferredHeight < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = preferredHeight + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().getDrawingDelegate();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().getDrawingDelegate();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevelByFraction(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean visibleToUser() {
        return ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    private boolean isNoLongerNeedToBeVisible() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        if (z2 == isIndeterminate()) {
            return;
        }
        if (visibleToUser() && z2) {
            throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
        }
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange != null) {
            drawableWithAnimatedVisibilityChange.hideNow();
        }
        super.setIndeterminate(z2);
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange2 != null) {
            drawableWithAnimatedVisibilityChange2.setVisible(visibleToUser(), false, false);
        }
        this.isIndeterminateModeChangeRequested = false;
    }

    public int getTrackThickness() {
        return this.spec.trackThickness;
    }

    public void setTrackThickness(int i2) {
        if (this.spec.trackThickness != i2) {
            this.spec.trackThickness = i2;
            requestLayout();
        }
    }

    public int[] getIndicatorColor() {
        return this.spec.indicatorColors;
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.spec.indicatorColors = iArr;
        getIndeterminateDrawable().getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public int getTrackColor() {
        return this.spec.trackColor;
    }

    public void setTrackColor(int i2) {
        if (this.spec.trackColor != i2) {
            this.spec.trackColor = i2;
            invalidate();
        }
    }

    public int getTrackCornerRadius() {
        return this.spec.trackCornerRadius;
    }

    public void setTrackCornerRadius(int i2) {
        if (this.spec.trackCornerRadius != i2) {
            S s2 = this.spec;
            s2.trackCornerRadius = Math.min(i2, s2.trackThickness / 2);
        }
    }

    public int getShowAnimationBehavior() {
        return this.spec.showAnimationBehavior;
    }

    public void setShowAnimationBehavior(int i2) {
        this.spec.showAnimationBehavior = i2;
        invalidate();
    }

    public int getHideAnimationBehavior() {
        return this.spec.hideAnimationBehavior;
    }

    public void setHideAnimationBehavior(int i2) {
        this.spec.hideAnimationBehavior = i2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i2, false);
    }

    public void setProgressCompat(int i2, boolean z2) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.storedProgress = i2;
                this.storedProgressAnimated = z2;
                this.isIndeterminateModeChangeRequested = true;
                if (!getIndeterminateDrawable().isVisible() || this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(getContext().getContentResolver()) == 0.0f) {
                    this.switchIndeterminateModeCallback.onAnimationEnd(getIndeterminateDrawable());
                    return;
                } else {
                    getIndeterminateDrawable().getAnimatorDelegate().requestCancelAnimatorAfterCurrentCycle();
                    return;
                }
            }
            return;
        }
        super.setProgress(i2);
        if (getProgressDrawable() == null || z2) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    public void setVisibilityAfterHide(int i2) {
        if (i2 != 0 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.visibilityAfterHide = i2;
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.animatorDurationScaleProvider = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
    }
}