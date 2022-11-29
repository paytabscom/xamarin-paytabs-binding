package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    private static final int ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    /* loaded from: classes.dex */
    public interface OnActionUpListener {
        void onActionUp(float f2, boolean z2);
    }

    /* loaded from: classes.dex */
    public interface OnRotateListener {
        void onRotate(float f2, boolean z2);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i2, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.selectorStrokeWidth = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        setHandRotation(getHandRotation());
    }

    public void setHandRotation(float f2) {
        setHandRotation(f2, false);
    }

    public void setHandRotation(float f2, boolean z2) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            setHandRotationInternal(f2, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.setHandRotationInternal(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    private Pair<Float, Float> getValuesForAnimation(float f2) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f2) > 180.0f) {
            if (handRotation > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (handRotation < 180.0f && f2 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHandRotationInternal(float f2, boolean z2) {
        float f3 = f2 % 360.0f;
        this.originalDeg = f3;
        this.degRad = Math.toRadians(f3 - 90.0f);
        float width = (getWidth() / 2) + (this.circleRadius * ((float) Math.cos(this.degRad)));
        float height = (getHeight() / 2) + (this.circleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i2 = this.selectorRadius;
        rectF.set(width - i2, height - i2, width + i2, height + i2);
        for (OnRotateListener onRotateListener : this.listeners) {
            onRotateListener.onRotate(f3, z2);
        }
        invalidate();
    }

    public void setAnimateOnTouchUp(boolean z2) {
        this.animatingOnTouchUp = z2;
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    private void drawSelector(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f2 = height;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle((this.circleRadius * ((float) Math.cos(this.degRad))) + width2, (this.circleRadius * ((float) Math.sin(this.degRad))) + f2, this.selectorRadius, this.paint);
        double sin = Math.sin(this.degRad);
        double cos = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(width2, f2, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.paint);
        canvas.drawCircle(width2, f2, this.centerDotRadius, this.paint);
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    public void setCircleRadius(int i2) {
        this.circleRadius = i2;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x2 - this.downX);
                int i3 = (int) (y2 - this.downY);
                this.isInTapRegion = (i2 * i2) + (i3 * i3) > this.scaledTouchSlop;
                boolean z5 = this.changedDuringTouch;
                z2 = actionMasked == 1;
                z3 = z5;
            } else {
                z2 = false;
                z3 = false;
            }
            z4 = false;
        } else {
            this.downX = x2;
            this.downY = y2;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z2 = false;
            z3 = false;
            z4 = true;
        }
        boolean handleTouchInput = handleTouchInput(x2, y2, z3, z4, z2) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z2 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x2, y2), this.isInTapRegion);
        }
        return true;
    }

    private boolean handleTouchInput(float f2, float f3, boolean z2, boolean z3, boolean z4) {
        float degreesFromXY = getDegreesFromXY(f2, f3);
        boolean z5 = false;
        boolean z6 = getHandRotation() != degreesFromXY;
        if (z3 && z6) {
            return true;
        }
        if (z6 || z2) {
            if (z4 && this.animatingOnTouchUp) {
                z5 = true;
            }
            setHandRotation(degreesFromXY, z5);
            return true;
        }
        return false;
    }

    private int getDegreesFromXY(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }
}