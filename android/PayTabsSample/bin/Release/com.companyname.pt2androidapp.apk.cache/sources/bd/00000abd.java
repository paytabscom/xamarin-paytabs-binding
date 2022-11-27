package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean sensitivitySet;
    ViewDragHelper viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i2) {
            int i3 = this.activePointerId;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i2) {
            this.activePointerId = i2;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i2) {
            if (SwipeDismissBehavior.this.listener != null) {
                SwipeDismissBehavior.this.listener.onDragStateChanged(i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f2, float f3) {
            int i2;
            boolean z2;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f2)) {
                int left = view.getLeft();
                int i3 = this.originalCapturedViewLeft;
                i2 = left < i3 ? i3 - width : i3 + width;
                z2 = true;
            } else {
                i2 = this.originalCapturedViewLeft;
                z2 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i2, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(view, z2));
            } else if (!z2 || SwipeDismissBehavior.this.listener == null) {
            } else {
                SwipeDismissBehavior.this.listener.onDismiss(view);
            }
        }

        private boolean shouldDismiss(View view, float f2) {
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i2 == 0) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z2 = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.swipeDirection == 2) {
                return true;
            }
            if (SwipeDismissBehavior.this.swipeDirection == 0) {
                if (z2) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (i2 <= 0) {
                    return false;
                }
                return true;
            } else if (SwipeDismissBehavior.this.swipeDirection == 1) {
                if (z2) {
                    if (i2 <= 0) {
                        return false;
                    }
                } else if (f2 >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z2 = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.swipeDirection == 0) {
                if (z2) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (SwipeDismissBehavior.this.swipeDirection != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z2) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i2, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f2), 1.0f));
            }
        }
    };

    /* loaded from: classes.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i2);
    }

    static float fraction(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    public void setSwipeDirection(int i2) {
        this.swipeDirection = i2;
    }

    public void setDragDismissDistance(float f2) {
        this.dragDismissThreshold = clamp(0.0f, f2, 1.0f);
    }

    public void setStartAlphaSwipeDistance(float f2) {
        this.alphaStartSwipeDistance = clamp(0.0f, f2, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f2) {
        this.alphaEndSwipeDistance = clamp(0.0f, f2, 1.0f);
    }

    public void setSensitivity(float f2) {
        this.sensitivity = f2;
        this.sensitivitySet = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v2, i2);
        if (ViewCompat.getImportantForAccessibility(v2) == 0) {
            ViewCompat.setImportantForAccessibility(v2, 1);
            updateAccessibilityActions(v2);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.isPointInChildBounds(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (z2) {
            ensureViewDragHelper(coordinatorLayout);
            return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        ViewDragHelper create;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                create = ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                create = ViewDragHelper.create(viewGroup, this.dragCallback);
            }
            this.viewDragHelper = create;
        }
    }

    /* loaded from: classes.dex */
    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(View view, boolean z2) {
            this.view = view;
            this.dismiss = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwipeDismissBehavior.this.viewDragHelper != null && SwipeDismissBehavior.this.viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else if (!this.dismiss || SwipeDismissBehavior.this.listener == null) {
            } else {
                SwipeDismissBehavior.this.listener.onDismiss(this.view);
            }
        }
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(View view2, AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z2 = false;
                    if (SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        boolean z3 = ViewCompat.getLayoutDirection(view2) == 1;
                        if ((SwipeDismissBehavior.this.swipeDirection == 0 && z3) || (SwipeDismissBehavior.this.swipeDirection == 1 && !z3)) {
                            z2 = true;
                        }
                        int width = view2.getWidth();
                        if (z2) {
                            width = -width;
                        }
                        ViewCompat.offsetLeftAndRight(view2, width);
                        view2.setAlpha(0.0f);
                        if (SwipeDismissBehavior.this.listener != null) {
                            SwipeDismissBehavior.this.listener.onDismiss(view2);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    static float clamp(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int clamp(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }
}