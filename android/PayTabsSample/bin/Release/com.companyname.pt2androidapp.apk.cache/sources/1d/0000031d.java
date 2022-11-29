package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Flow;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.VirtualLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private DesignTool mDesignTool;
    DevModeDraw mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    Interpolator mInterpolator;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    private View mRegionView;
    MotionScene mScene;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private StateCache mStateCache;
    private StopLogic mStopLogic;
    private boolean mTemporalInterpolator;
    ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private ArrayList<TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i2);

        void computeCurrentVelocity(int i2, float f2);

        float getXVelocity();

        float getXVelocity(int i2);

        float getYVelocity();

        float getYVelocity(int i2);

        void recycle();
    }

    /* loaded from: classes.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i2, int i3, float f2);

        void onTransitionCompleted(MotionLayout motionLayout, int i2);

        void onTransitionStarted(MotionLayout motionLayout, int i2, int i3);

        void onTransitionTrigger(MotionLayout motionLayout, int i2, boolean z2, float f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private static boolean willJump(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
    }

    public MotionLayout(Context context) {
        super(context);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(null);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    public void enableTransition(int i2, boolean z2) {
        MotionScene.Transition transition = getTransition(i2);
        if (z2) {
            transition.setEnable(true);
            return;
        }
        if (transition == this.mScene.mCurrentTransition) {
            Iterator<MotionScene.Transition> it = this.mScene.getTransitionsWithState(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.mScene.mCurrentTransition = next;
                    break;
                }
            }
        }
        transition.setEnable(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        if (transitionState == TransitionState.FINISHED && this.mCurrentState == -1) {
            return;
        }
        TransitionState transitionState2 = this.mTransitionState;
        this.mTransitionState = transitionState;
        if (transitionState2 == TransitionState.MOVING && transitionState == TransitionState.MOVING) {
            fireTransitionChange();
        }
        int i2 = AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[transitionState2.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (transitionState == TransitionState.MOVING) {
                fireTransitionChange();
            }
            if (transitionState == TransitionState.FINISHED) {
                fireTransitionCompleted();
            }
        } else if (i2 == 3 && transitionState == TransitionState.FINISHED) {
            fireTransitionCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        static {
            int[] iArr = new int[TransitionState.values().length];
            $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class MyTracker implements MotionTracker {
        private static MyTracker me = new MyTracker();
        VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            me.tracker = VelocityTracker.obtain();
            return me;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i2) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i2);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i2, float f2) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i2, f2);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i2) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i2);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i2) {
            if (this.tracker != null) {
                return getYVelocity(i2);
            }
            return 0.0f;
        }
    }

    public void setTransition(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i2);
            this.mStateCache.setEndState(i3);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i2;
            this.mEndState = i3;
            motionScene.setTransition(i2, i3);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i2), this.mScene.getConstraintSet(i3));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(int i2) {
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i2);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            float f2 = Float.NaN;
            int i3 = this.mCurrentState;
            if (i3 == this.mBeginState) {
                f2 = 0.0f;
            } else if (i3 == this.mEndState) {
                f2 = 1.0f;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            this.mTransitionLastPosition = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v(TAG, Debug.getLocation() + " transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId == this.mBeginState && endId == this.mEndState) {
            return;
        }
        this.mBeginState = startId;
        this.mEndState = endId;
        this.mScene.setTransition(startId, endId);
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
        this.mModel.reEvaluateState();
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i2) {
        if (i2 != 0) {
            try {
                this.mScene = new MotionScene(getContext(), this, i2);
                if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                    this.mScene.readFallback(this);
                    this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
                    rebuildScene();
                    this.mScene.setRtl(isRtl());
                    return;
                }
                return;
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
        this.mScene = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i2, int i3, int i4) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i2;
        this.mBeginState = -1;
        this.mEndState = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.updateConstraints(i2, i3, i4);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i2).applyTo(this);
        }
    }

    public void setInterpolatedProgress(float f2) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setProgress(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f2);
            this.mStateCache.setVelocity(f3);
            return;
        }
        setProgress(f2);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f3;
        animateTo(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class StateCache {
        float mProgress = Float.NaN;
        float mVelocity = Float.NaN;
        int startState = -1;
        int endState = -1;
        final String KeyProgress = "motion.progress";
        final String KeyVelocity = "motion.velocity";
        final String KeyStartState = "motion.StartState";
        final String KeyEndState = "motion.EndState";

        StateCache() {
        }

        void apply() {
            int i2 = this.startState;
            if (i2 != -1 || this.endState != -1) {
                if (i2 == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i3 = this.endState;
                    if (i3 == -1) {
                        MotionLayout.this.setState(i2, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i2, i3);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.mVelocity)) {
                if (Float.isNaN(this.mProgress)) {
                    return;
                }
                MotionLayout.this.setProgress(this.mProgress);
                return;
            }
            MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
            this.mProgress = Float.NaN;
            this.mVelocity = Float.NaN;
            this.startState = -1;
            this.endState = -1;
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setProgress(float f2) {
            this.mProgress = f2;
        }

        public void setEndState(int i2) {
            this.endState = i2;
        }

        public void setVelocity(float f2) {
            this.mVelocity = f2;
        }

        public void setStartState(int i2) {
            this.startState = i2;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public void setProgress(float f2) {
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w(TAG, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f2);
            return;
        }
        if (i2 <= 0) {
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene == null) {
            return;
        }
        this.mTransitionInstantly = true;
        this.mTransitionGoalPosition = f2;
        this.mTransitionPosition = f2;
        this.mTransitionLastTime = -1L;
        this.mAnimationStartTime = -1L;
        this.mInterpolator = null;
        this.mInTransition = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z2 = true;
        this.mInTransition = true;
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        int i2 = 0;
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i4));
            if (motionController2 != null) {
                this.mScene.getKeyFrames(motionController2);
                motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z3 = ((double) staggered) < 0.0d;
            float abs = Math.abs(staggered);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            int i5 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i5 >= childCount) {
                    z2 = false;
                    break;
                }
                MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i5));
                if (!Float.isNaN(motionController3.mMotionStagger)) {
                    break;
                }
                float finalX = motionController3.getFinalX();
                float finalY = motionController3.getFinalY();
                float f6 = z3 ? finalY - finalX : finalY + finalX;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i5++;
            }
            if (!z2) {
                while (i2 < childCount) {
                    MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i2));
                    float finalX2 = motionController4.getFinalX();
                    float finalY2 = motionController4.getFinalY();
                    float f7 = z3 ? finalY2 - finalX2 : finalY2 + finalX2;
                    motionController4.mStaggerScale = 1.0f / (1.0f - abs);
                    motionController4.mStaggerOffset = abs - (((f7 - f4) * abs) / (f5 - f4));
                    i2++;
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i6));
                if (!Float.isNaN(motionController5.mMotionStagger)) {
                    f3 = Math.min(f3, motionController5.mMotionStagger);
                    f2 = Math.max(f2, motionController5.mMotionStagger);
                }
            }
            while (i2 < childCount) {
                MotionController motionController6 = this.mFrameArrayList.get(getChildAt(i2));
                if (!Float.isNaN(motionController6.mMotionStagger)) {
                    motionController6.mStaggerScale = 1.0f / (1.0f - abs);
                    if (z3) {
                        motionController6.mStaggerOffset = abs - (((f2 - motionController6.mMotionStagger) / (f2 - f3)) * abs);
                    } else {
                        motionController6.mStaggerOffset = abs - (((motionController6.mMotionStagger - f3) * abs) / (f2 - f3));
                    }
                }
                i2++;
            }
        }
    }

    public void touchAnimateTo(int i2, float f2, float f3) {
        if (this.mScene == null || this.mTransitionLastPosition == f2) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        float duration = this.mScene.getDuration() / 1000.0f;
        this.mTransitionDuration = duration;
        this.mTransitionGoalPosition = f2;
        this.mInTransition = true;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (i2 == 1) {
                f2 = 0.0f;
            } else if (i2 == 2) {
                f2 = 1.0f;
            }
            this.mStopLogic.config(this.mTransitionLastPosition, f2, f3, duration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
            int i3 = this.mCurrentState;
            this.mTransitionGoalPosition = f2;
            this.mCurrentState = i3;
            this.mInterpolator = this.mStopLogic;
        } else if (i2 == 4) {
            this.mDecelerateLogic.config(f3, this.mTransitionLastPosition, this.mScene.getMaxAcceleration());
            this.mInterpolator = this.mDecelerateLogic;
        } else if (i2 == 5) {
            if (willJump(f3, this.mTransitionLastPosition, this.mScene.getMaxAcceleration())) {
                this.mDecelerateLogic.config(f3, this.mTransitionLastPosition, this.mScene.getMaxAcceleration());
                this.mInterpolator = this.mDecelerateLogic;
            } else {
                this.mStopLogic.config(this.mTransitionLastPosition, f2, f3, this.mTransitionDuration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
                this.mLastVelocity = 0.0f;
                int i4 = this.mCurrentState;
                this.mTransitionGoalPosition = f2;
                this.mCurrentState = i4;
                this.mInterpolator = this.mStopLogic;
            }
        }
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    /* loaded from: classes.dex */
    class DecelerateInterpolator extends MotionInterpolator {
        float maxA;
        float initalV = 0.0f;
        float currentP = 0.0f;

        DecelerateInterpolator() {
        }

        public void config(float f2, float f3, float f4) {
            this.initalV = f2;
            this.currentP = f3;
            this.maxA = f4;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3;
            float f4;
            float f5 = this.initalV;
            if (f5 > 0.0f) {
                float f6 = this.maxA;
                if (f5 / f6 < f2) {
                    f2 = f5 / f6;
                }
                MotionLayout.this.mLastVelocity = f5 - (f6 * f2);
                f3 = (this.initalV * f2) - (((this.maxA * f2) * f2) / 2.0f);
                f4 = this.currentP;
            } else {
                float f7 = this.maxA;
                if ((-f5) / f7 < f2) {
                    f2 = (-f5) / f7;
                }
                MotionLayout.this.mLastVelocity = f5 + (f7 * f2);
                f3 = (this.initalV * f2) + (((this.maxA * f2) * f2) / 2.0f);
                f4 = this.currentP;
            }
            return f3 + f4;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    void animateTo(float f2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        float f3 = this.mTransitionLastPosition;
        float f4 = this.mTransitionPosition;
        if (f3 != f4 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f4;
        }
        float f5 = this.mTransitionLastPosition;
        if (f5 == f2) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f2;
        this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = this.mScene.getInterpolator();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f5;
        this.mTransitionLastPosition = f5;
        invalidate();
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i2);
            return;
        }
        transitionToState(i2, -1, -1);
    }

    public void transitionToState(int i2, int i3, int i4) {
        int convertToConstraintSet;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && motionScene.mStateSet != null && (convertToConstraintSet = this.mScene.mStateSet.convertToConstraintSet(this.mCurrentState, i2, i3, i4)) != -1) {
            i2 = convertToConstraintSet;
        }
        int i5 = this.mCurrentState;
        if (i5 == i2) {
            return;
        }
        if (this.mBeginState == i2) {
            animateTo(0.0f);
        } else if (this.mEndState == i2) {
            animateTo(1.0f);
        } else {
            this.mEndState = i2;
            if (i5 != -1) {
                setTransition(i5, i2);
                animateTo(1.0f);
                this.mTransitionLastPosition = 0.0f;
                transitionToEnd();
                return;
            }
            this.mTemporalInterpolator = false;
            this.mTransitionGoalPosition = 1.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionLastTime = getNanoTime();
            this.mAnimationStartTime = getNanoTime();
            this.mTransitionInstantly = false;
            this.mInterpolator = null;
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
            this.mBeginState = -1;
            this.mScene.setTransition(-1, this.mEndState);
            this.mScene.getStartId();
            int childCount = getChildCount();
            this.mFrameArrayList.clear();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                this.mFrameArrayList.put(childAt, new MotionController(childAt));
            }
            this.mInTransition = true;
            this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(i2));
            rebuildScene();
            this.mModel.build();
            computeCurrentPositions();
            int width = getWidth();
            int height = getHeight();
            for (int i7 = 0; i7 < childCount; i7++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                this.mScene.getKeyFrames(motionController);
                motionController.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
            float staggered = this.mScene.getStaggered();
            if (staggered != 0.0f) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i8 = 0; i8 < childCount; i8++) {
                    MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i8));
                    float finalY = motionController2.getFinalY() + motionController2.getFinalX();
                    f2 = Math.min(f2, finalY);
                    f3 = Math.max(f3, finalY);
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i9));
                    float finalX = motionController3.getFinalX();
                    float finalY2 = motionController3.getFinalY();
                    motionController3.mStaggerScale = 1.0f / (1.0f - staggered);
                    motionController3.mStaggerOffset = staggered - ((((finalX + finalY2) - f2) * staggered) / (f3 - f2));
                }
            }
            this.mTransitionPosition = 0.0f;
            this.mTransitionLastPosition = 0.0f;
            this.mInTransition = true;
            invalidate();
        }
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f2, float f3, float[] fArr, int i2) {
        float f4;
        float f5 = this.mLastVelocity;
        float f6 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f6);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f5 = (signum * ((interpolation - interpolation2) / EPSILON)) / this.mTransitionDuration;
            f4 = interpolation2;
        } else {
            f4 = f6;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f5 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i2 & 1) == 0) {
            motionController.getPostLayoutDvDp(f4, view.getWidth(), view.getHeight(), f2, f3, fArr);
        } else {
            motionController.getDpDt(f4, f2, f3, fArr);
        }
        if (i2 < 2) {
            fArr[0] = fArr[0] * f5;
            fArr[1] = fArr[1] * f5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Model {
        int mEndId;
        int mStartId;
        ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        ConstraintSet mStart = null;
        ConstraintSet mEnd = null;

        Model() {
        }

        void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof Barrier) {
                    constraintWidget = new Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutStart);
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutEnd);
            if (MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.mLayoutStart.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.mLayoutStart.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            }
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = children.get(i2);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(layoutParams.startToStart != -1 ? "SS" : "__");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(layoutParams.startToEnd != -1 ? "|SE" : "|__");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(layoutParams.endToStart != -1 ? "|ES" : "|__");
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(layoutParams.endToEnd != -1 ? "|EE" : "|__");
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(layoutParams.leftToLeft != -1 ? "|LL" : "|__");
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            sb11.append(layoutParams.leftToRight != -1 ? "|LR" : "|__");
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            sb13.append(layoutParams.rightToLeft != -1 ? "|RL" : "|__");
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            sb15.append(layoutParams.rightToRight != -1 ? "|RR" : "|__");
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            sb17.append(layoutParams.topToTop != -1 ? "|TT" : "|__");
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            sb19.append(layoutParams.topToBottom != -1 ? "|TB" : "|__");
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            sb21.append(layoutParams.bottomToTop != -1 ? "|BT" : "|__");
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            sb23.append(layoutParams.bottomToBottom != -1 ? "|BB" : "|__");
            String sb24 = sb23.toString();
            Log.v(MotionLayout.TAG, str + sb24);
        }

        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str5 = "__";
            if (constraintWidget.mTop.mTarget != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                sb2.append(constraintWidget.mTop.mTarget.mType == ConstraintAnchor.Type.TOP ? "T" : "B");
                str2 = sb2.toString();
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (constraintWidget.mBottom.mTarget != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                sb5.append(constraintWidget.mBottom.mTarget.mType == ConstraintAnchor.Type.TOP ? "T" : "B");
                str3 = sb5.toString();
            } else {
                str3 = "__";
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (constraintWidget.mLeft.mTarget != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                sb8.append(constraintWidget.mLeft.mTarget.mType == ConstraintAnchor.Type.LEFT ? "L" : "R");
                str4 = sb8.toString();
            } else {
                str4 = "__";
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (constraintWidget.mRight.mTarget != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("R");
                sb11.append(constraintWidget.mRight.mTarget.mType == ConstraintAnchor.Type.LEFT ? "L" : "R");
                str5 = sb11.toString();
            }
            sb10.append(str5);
            String sb12 = sb10.toString();
            Log.v(MotionLayout.TAG, str + sb12 + " ---  " + constraintWidget);
        }

        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            String str2 = str + " " + Debug.getName((View) constraintWidgetContainer.getCompanionWidget());
            Log.v(MotionLayout.TAG, str2 + "  ========= " + constraintWidgetContainer);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i2 = 0; i2 < size; i2++) {
                String str3 = str2 + "[" + i2 + "] ";
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i2);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(constraintWidget.mTop.mTarget != null ? "T" : "_");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(constraintWidget.mBottom.mTarget != null ? "B" : "_");
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(constraintWidget.mLeft.mTarget != null ? "L" : "_");
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                sb7.append(constraintWidget.mRight.mTarget != null ? "R" : "_");
                String sb8 = sb7.toString();
                View view = (View) constraintWidget.getCompanionWidget();
                String name = Debug.getName(view);
                if (view instanceof TextView) {
                    name = name + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(MotionLayout.TAG, str3 + "  " + name + " " + constraintWidget + " " + sb8);
            }
            Log.v(MotionLayout.TAG, str2 + " done. ");
        }

        public void reEvaluateState() {
            measure(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void measure(int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            MotionLayout.this.mWidthMeasureMode = mode;
            MotionLayout.this.mHeightMeasureMode = mode2;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            if (MotionLayout.this.mCurrentState == MotionLayout.this.getStartState()) {
                MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                if (this.mStart != null) {
                    MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                }
            } else {
                if (this.mStart != null) {
                    MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                }
                MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout.this.mWidthMeasureMode = mode;
                MotionLayout.this.mHeightMeasureMode = mode2;
                if (MotionLayout.this.mCurrentState == MotionLayout.this.getStartState()) {
                    MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                    if (this.mStart != null) {
                        MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                    }
                } else {
                    if (this.mStart != null) {
                        MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                    }
                    MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                }
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.mMeasureDuringTransition = (motionLayout.mStartWrapWidth == MotionLayout.this.mEndWrapWidth && MotionLayout.this.mStartWrapHeight == MotionLayout.this.mEndWrapHeight) ? false : true;
            }
            int i4 = MotionLayout.this.mStartWrapWidth;
            int i5 = MotionLayout.this.mStartWrapHeight;
            if (MotionLayout.this.mWidthMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mWidthMeasureMode == 0) {
                i4 = (int) (MotionLayout.this.mStartWrapWidth + (MotionLayout.this.mPostInterpolationPosition * (MotionLayout.this.mEndWrapWidth - MotionLayout.this.mStartWrapWidth)));
            }
            int i6 = i4;
            if (MotionLayout.this.mHeightMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mHeightMeasureMode == 0) {
                i5 = (int) (MotionLayout.this.mStartWrapHeight + (MotionLayout.this.mPostInterpolationPosition * (MotionLayout.this.mEndWrapHeight - MotionLayout.this.mStartWrapHeight)));
            }
            MotionLayout.this.resolveMeasuredDimension(i2, i3, i6, i5, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        public void build() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = MotionLayout.this.getChildAt(i2);
                MotionLayout.this.mFrameArrayList.put(childAt, new MotionController(childAt));
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = MotionLayout.this.getChildAt(i3);
                MotionController motionController = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (motionController != null) {
                    if (this.mStart != null) {
                        ConstraintWidget widget = getWidget(this.mLayoutStart, childAt2);
                        if (widget != null) {
                            motionController.setStartState(widget, this.mStart);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.mEnd != null) {
                        ConstraintWidget widget2 = getWidget(this.mLayoutEnd, childAt2);
                        if (widget2 != null) {
                            motionController.setEndState(widget2, this.mEnd);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        public void setMeasuredId(int i2, int i3) {
            this.mStartId = i2;
            this.mEndId = i3;
        }

        public boolean isNotConfiguredWith(int i2, int i3) {
            return (i2 == this.mStartId && i3 == this.mEndId) ? false : true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (motionScene = this.mScene) == null || motionScene.mCurrentTransition == null || this.mScene.mCurrentTransition.getLayoutDuringTransition() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.mScene == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        boolean z3 = (this.mLastWidthMeasureSpec == i2 && this.mLastHeightMeasureSpec == i3) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.mLastWidthMeasureSpec = i2;
        this.mLastHeightMeasureSpec = i3;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z3 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i2, i3);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            z2 = true;
        }
        if (this.mMeasureDuringTransition || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i4 = this.mWidthMeasureMode;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.mStartWrapWidth;
                width = (int) (i5 + (this.mPostInterpolationPosition * (this.mEndWrapWidth - i5)));
                requestLayout();
            }
            int i6 = this.mHeightMeasureMode;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.mStartWrapHeight;
                height = (int) (i7 + (this.mPostInterpolationPosition * (this.mEndWrapHeight - i7)));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        MotionScene motionScene = this.mScene;
        return (motionScene == null || motionScene.mCurrentTransition == null || this.mScene.mCurrentTransition.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        float f2 = this.mScrollTargetDX;
        float f3 = this.mScrollTargetDT;
        motionScene.processScrollUp(f2 / f3, this.mScrollTargetDY / f3);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.mUndergoingMotion || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.mUndergoingMotion = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(final View view, int i2, int i3, int[] iArr, int i4) {
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene == null || motionScene.mCurrentTransition == null || !this.mScene.mCurrentTransition.isEnabled()) {
            return;
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition == null || !transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
            MotionScene motionScene2 = this.mScene;
            if (motionScene2 != null && motionScene2.getMoveWhenScrollAtTop()) {
                float f2 = this.mTransitionPosition;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 1) != 0) {
                float progressDirection = this.mScene.getProgressDirection(i2, i3);
                float f3 = this.mTransitionLastPosition;
                if ((f3 <= 0.0f && progressDirection < 0.0f) || (f3 >= 1.0f && progressDirection > 0.0f)) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                            @Override // java.lang.Runnable
                            public void run() {
                                view.setNestedScrollingEnabled(true);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            float f4 = this.mTransitionPosition;
            long nanoTime = getNanoTime();
            float f5 = i2;
            this.mScrollTargetDX = f5;
            float f6 = i3;
            this.mScrollTargetDY = f6;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            this.mScene.processScrollMove(f5, f6);
            if (f4 != this.mTransitionPosition) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            evaluate(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.mUndergoingMotion = true;
        }
    }

    /* loaded from: classes.dex */
    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        DashPathEffect mDashPathEffect;
        Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        Paint mPaint;
        Paint mPaintGraph;
        Paint mPaintKeyframes;
        Path mPath;
        int[] mPathMode;
        float[] mPoints;
        private float[] mRectangle;
        int mShadowTranslate;
        Paint mTextPaint;
        final int RED_COLOR = -21965;
        final int KEYFRAME_COLOR = -2067046;
        final int GRAPH_COLOR = -13391360;
        final int SHADOW_COLOR = 1996488704;
        final int DIAMOND_SIZE = 10;
        Rect mBounds = new Rect();
        boolean mPresentationMode = false;

        public DevModeDraw() {
            this.mShadowTranslate = 1;
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i2, int i3) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.mTextPaint);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.mPaint);
            }
            for (MotionController motionController : hashMap.values()) {
                int drawPath = motionController.getDrawPath();
                if (i3 > 0 && drawPath == 0) {
                    drawPath = 1;
                }
                if (drawPath != 0) {
                    this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                    if (drawPath >= 1) {
                        int i4 = i2 / 16;
                        float[] fArr = this.mPoints;
                        if (fArr == null || fArr.length != i4 * 2) {
                            this.mPoints = new float[i4 * 2];
                            this.mPath = new Path();
                        }
                        int i5 = this.mShadowTranslate;
                        canvas.translate(i5, i5);
                        this.mPaint.setColor(1996488704);
                        this.mFillPaint.setColor(1996488704);
                        this.mPaintKeyframes.setColor(1996488704);
                        this.mPaintGraph.setColor(1996488704);
                        motionController.buildPath(this.mPoints, i4);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        this.mPaint.setColor(-21965);
                        this.mPaintKeyframes.setColor(-2067046);
                        this.mFillPaint.setColor(-2067046);
                        this.mPaintGraph.setColor(-13391360);
                        int i6 = this.mShadowTranslate;
                        canvas.translate(-i6, -i6);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        if (drawPath == 5) {
                            drawRectangle(canvas, motionController);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void drawAll(Canvas canvas, int i2, int i3, MotionController motionController) {
            if (i2 == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i2 == 2) {
                drawPathRelative(canvas);
            }
            if (i2 == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i2, i3, motionController);
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i2, int i3, MotionController motionController) {
            int i4;
            int i5;
            float f2;
            float f3;
            int i6;
            if (motionController.mView != null) {
                i4 = motionController.mView.getWidth();
                i5 = motionController.mView.getHeight();
            } else {
                i4 = 0;
                i5 = 0;
            }
            for (int i7 = 1; i7 < i3 - 1; i7++) {
                if (i2 != 4 || this.mPathMode[i7 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i8 = i7 * 2;
                    float f4 = fArr[i8];
                    float f5 = fArr[i8 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f4, f5 + 10.0f);
                    this.mPath.lineTo(f4 + 10.0f, f5);
                    this.mPath.lineTo(f4, f5 - 10.0f);
                    this.mPath.lineTo(f4 - 10.0f, f5);
                    this.mPath.close();
                    int i9 = i7 - 1;
                    motionController.getKeyFrame(i9);
                    if (i2 == 4) {
                        int[] iArr = this.mPathMode;
                        if (iArr[i9] == 1) {
                            drawPathRelativeTicks(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr[i9] == 2) {
                            drawPathCartesianTicks(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr[i9] == 3) {
                            i6 = 3;
                            f2 = f5;
                            f3 = f4;
                            drawPathScreenTicks(canvas, f4 - 0.0f, f5 - 0.0f, i4, i5);
                            canvas.drawPath(this.mPath, this.mFillPaint);
                        }
                        f2 = f5;
                        f3 = f4;
                        i6 = 3;
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f2 = f5;
                        f3 = f4;
                        i6 = 3;
                    }
                    if (i2 == 2) {
                        drawPathRelativeTicks(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i2 == i6) {
                        drawPathCartesianTicks(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i2 == 6) {
                        drawPathScreenTicks(canvas, f3 - 0.0f, f2 - 0.0f, i4, i5);
                    }
                    canvas.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f2, float f3, float f4, float f5) {
            canvas.drawRect(f2, f3, f4, f5, this.mPaintGraph);
            canvas.drawLine(f2, f3, f4, f5, this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < this.mKeyFrameCount; i2++) {
                int[] iArr = this.mPathMode;
                if (iArr[i2] == 1) {
                    z2 = true;
                }
                if (iArr[i2] == 2) {
                    z3 = true;
                }
            }
            if (z2) {
                drawPathRelative(canvas);
            }
            if (z3) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathRelativeTicks(Canvas canvas, float f2, float f3) {
            float[] fArr = this.mPoints;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f4 - f6, f5 - f7);
            float f8 = f6 - f4;
            float f9 = f7 - f5;
            float f10 = (((f2 - f4) * f8) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f11 = f4 + (f8 * f10);
            float f12 = f5 + (f10 * f9);
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f11, f12);
            float hypot2 = (float) Math.hypot(f11 - f2, f12 - f3);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, f11, f12, this.mPaintGraph);
        }

        void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.mPaintGraph);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f2, float f3) {
            float[] fArr = this.mPoints;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = f2 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - f3;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, f3 - 20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.mPaintGraph);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f7 - f5)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, f2 + 5.0f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f2, float f3, int i2, int i3) {
            String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i2)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((f2 / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f3 - 20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, Math.min(0.0f, 1.0f), f3, this.mPaintGraph);
            String str2 = "" + (((int) ((((f3 - (i3 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i3)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, f2 + 5.0f, 0.0f - ((f3 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f2, f3, f2, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i2 = 0; i2 <= 50; i2++) {
                motionController.buildRect(i2 / 50, this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.mPath, this.mPaint);
        }
    }

    private void debugPos() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.v(TAG, " " + Debug.getLocation() + " " + Debug.getName(this) + " " + Debug.getName(getContext(), this.mCurrentState) + " " + Debug.getName(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        long j2;
        evaluate(false);
        super.dispatchDraw(canvas);
        if (this.mScene == null) {
            return;
        }
        if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
            this.mFrames++;
            long nanoTime = getNanoTime();
            long j3 = this.mLastDrawTime;
            if (j3 != -1) {
                if (nanoTime - j3 > 200000000) {
                    this.mLastFps = ((int) ((this.mFrames / (((float) j2) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.mFrames = 0;
                    this.mLastDrawTime = nanoTime;
                }
            } else {
                this.mLastDrawTime = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(this.mLastFps + " fps " + Debug.getState(this, this.mBeginState) + " -> ");
            sb.append(Debug.getState(this, this.mEndState));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i2 = this.mCurrentState;
            sb.append(i2 == -1 ? "undefined" : Debug.getState(this, i2));
            String sb2 = sb.toString();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.mDebugPath > 1) {
            if (this.mDevModeDraw == null) {
                this.mDevModeDraw = new DevModeDraw();
            }
            this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
        }
    }

    private void evaluateLayout() {
        boolean z2;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f2 = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f2 = this.mTransitionGoalPosition;
        }
        int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i2 <= 0 || f2 < this.mTransitionGoalPosition) && (signum > 0.0f || f2 > this.mTransitionGoalPosition)) {
            z2 = false;
        } else {
            f2 = this.mTransitionGoalPosition;
            z2 = true;
        }
        if (interpolator != null && !z2) {
            if (this.mTemporalInterpolator) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i2 > 0 && f2 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f2 <= this.mTransitionGoalPosition)) {
            f2 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f2, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void evaluate(boolean z2) {
        float f2;
        boolean z3;
        int i2;
        float interpolation;
        boolean z4;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f3 = this.mTransitionLastPosition;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z5 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z2 || this.mTransitionGoalPosition != f3))) {
            float signum = Math.signum(this.mTransitionGoalPosition - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.mInterpolator;
            if (interpolator instanceof MotionInterpolator) {
                f2 = 0.0f;
            } else {
                f2 = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
                this.mLastVelocity = f2;
            }
            float f4 = this.mTransitionLastPosition + f2;
            if (this.mTransitionInstantly) {
                f4 = this.mTransitionGoalPosition;
            }
            int i3 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i3 <= 0 || f4 < this.mTransitionGoalPosition) && (signum > 0.0f || f4 > this.mTransitionGoalPosition)) {
                z3 = false;
            } else {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z3 = true;
            }
            this.mTransitionLastPosition = f4;
            this.mTransitionPosition = f4;
            this.mTransitionLastTime = nanoTime;
            if (interpolator != null && !z3) {
                if (this.mTemporalInterpolator) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
                    this.mTransitionLastPosition = interpolation;
                    this.mTransitionLastTime = nanoTime;
                    Interpolator interpolator2 = this.mInterpolator;
                    if (interpolator2 instanceof MotionInterpolator) {
                        float velocity = ((MotionInterpolator) interpolator2).getVelocity();
                        this.mLastVelocity = velocity;
                        if (Math.abs(velocity) * this.mTransitionDuration <= EPSILON) {
                            this.mInTransition = false;
                        }
                        if (velocity > 0.0f && interpolation >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            interpolation = 1.0f;
                        }
                        if (velocity < 0.0f && interpolation <= 0.0f) {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f4 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.mInterpolator;
                    if (interpolator3 instanceof MotionInterpolator) {
                        this.mLastVelocity = ((MotionInterpolator) interpolator3).getVelocity();
                    } else {
                        this.mLastVelocity = ((interpolator3.getInterpolation(f4 + f2) - interpolation) * signum) / f2;
                    }
                }
                f4 = interpolation;
            }
            if (Math.abs(this.mLastVelocity) > EPSILON) {
                setState(TransitionState.MOVING);
            }
            if ((i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition)) {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
            }
            int i4 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            if (i4 >= 0 || f4 <= 0.0f) {
                this.mInTransition = false;
                setState(TransitionState.FINISHED);
            }
            int childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime2 = getNanoTime();
            this.mPostInterpolationPosition = f4;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                MotionController motionController = this.mFrameArrayList.get(childAt);
                if (motionController != null) {
                    this.mKeepAnimating = motionController.interpolate(childAt, f4, nanoTime2, this.mKeyCache) | this.mKeepAnimating;
                }
            }
            boolean z6 = (i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition);
            if (!this.mKeepAnimating && !this.mInTransition && z6) {
                setState(TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.mKeepAnimating = (!z6) | this.mKeepAnimating;
            if (f4 <= 0.0f && (i2 = this.mBeginState) != -1 && this.mCurrentState != i2) {
                this.mCurrentState = i2;
                this.mScene.getConstraintSet(i2).applyCustomAttributes(this);
                setState(TransitionState.FINISHED);
                z5 = true;
            }
            if (f4 >= 1.0d) {
                int i6 = this.mCurrentState;
                int i7 = this.mEndState;
                if (i6 != i7) {
                    this.mCurrentState = i7;
                    this.mScene.getConstraintSet(i7).applyCustomAttributes(this);
                    setState(TransitionState.FINISHED);
                    z5 = true;
                }
            }
            if (this.mKeepAnimating || this.mInTransition) {
                invalidate();
            } else if ((i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                setState(TransitionState.FINISHED);
            }
            if ((!this.mKeepAnimating && this.mInTransition && i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                onNewStateAttachHandlers();
            }
        }
        float f5 = this.mTransitionLastPosition;
        if (f5 >= 1.0f) {
            int i8 = this.mCurrentState;
            int i9 = this.mEndState;
            z4 = i8 == i9 ? z5 : true;
            this.mCurrentState = i9;
        } else {
            if (f5 <= 0.0f) {
                int i10 = this.mCurrentState;
                int i11 = this.mBeginState;
                z4 = i10 == i11 ? z5 : true;
                this.mCurrentState = i11;
            }
            this.mNeedsFireTransitionCompleted |= z5;
            if (z5 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        z5 = z4;
        this.mNeedsFireTransitionCompleted |= z5;
        if (z5) {
            requestLayout();
        }
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z2, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.mLastLayoutWidth != i6 || this.mLastLayoutHeight != i7) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i6;
            this.mLastLayoutHeight = i7;
            this.mOldWidth = i6;
            this.mOldHeight = i7;
        } finally {
            this.mInLayout = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z2 = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z2 = obtainStyledAttributes.getBoolean(index, z2);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z2) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState != -1 || (motionScene = this.mScene) == null) {
            return;
        }
        this.mCurrentState = motionScene.getStartId();
        this.mBeginState = this.mScene.getStartId();
        this.mEndState = this.mScene.getEndId();
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    private void checkStructure() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            if (next == this.mScene.mCurrentTransition) {
                Log.v(TAG, "CHECK: CURRENT");
            }
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void checkStructure(int i2, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(TAG, "CHECK: " + name + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (constraintSet.getConstraint(id) == null) {
                Log.w(TAG, "CHECK: " + name + " NO CONSTRAINTS for " + Debug.getName(childAt));
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i4 = 0; i4 < knownIds.length; i4++) {
            int i5 = knownIds[i4];
            String name2 = Debug.getName(getContext(), i5);
            if (findViewById(knownIds[i4]) == null) {
                Log.w(TAG, "CHECK: " + name + " NO View matches id " + name2);
            }
            if (constraintSet.getHeight(i5) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i5) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void checkStructure(MotionScene.Transition transition) {
        Log.v(TAG, "CHECK: transition = " + transition.debugString(getContext()));
        Log.v(TAG, "CHECK: transition.setDuration = " + transition.getDuration());
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void setDebugMode(int i2) {
        this.mDebugPath = i2;
        invalidate();
    }

    public void getDebugMode(boolean z2) {
        this.mDebugPath = z2 ? 2 : 1;
        invalidate();
    }

    private boolean handlesTouchEvent(float f2, float f3, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (handlesTouchEvent(view.getLeft() + f2, view.getTop() + f3, viewGroup.getChildAt(i2), motionEvent)) {
                    return true;
                }
            }
        }
        this.mBoundsCheck.set(view.getLeft() + f2, view.getTop() + f3, f2 + view.getRight(), f3 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
            View view = this.mRegionView;
            if (view == null || view.getId() != touchRegionId) {
                this.mRegionView = findViewById(touchRegionId);
            }
            View view2 = this.mRegionView;
            if (view2 != null) {
                this.mBoundsCheck.set(view2.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(0.0f, 0.0f, this.mRegionView, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled && motionScene.supportTouch()) {
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && !transition.isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (i2 = this.mCurrentState) != -1) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i2);
            this.mScene.readFallback(this);
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            stateCache.apply();
            return;
        }
        MotionScene motionScene2 = this.mScene;
        if (motionScene2 == null || motionScene2.mCurrentTransition == null || this.mScene.mCurrentTransition.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        if (motionScene.autoTransition(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i2 = this.mCurrentState;
        if (i2 != -1) {
            this.mScene.addOnClickListeners(this, i2);
        }
        if (this.mScene.supportTouch()) {
            this.mScene.setupTouch();
        }
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getAnchorDpDt(int i2, float f2, float f3, float f4, float[] fArr) {
        String resourceName;
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i2);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f2, f3, f4, fArr);
            float y2 = viewById.getY();
            int i3 = ((f2 - this.lastPos) > 0.0f ? 1 : ((f2 - this.lastPos) == 0.0f ? 0 : -1));
            this.lastPos = f2;
            this.lastY = y2;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i2;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i2);
        }
        Log.w(TAG, "WARNING could not find view id " + resourceName);
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
        }
        return this.mTransitionDuration * 1000.0f;
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new ArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(transitionListener);
    }

    public void fireTrigger(int i2, boolean z2, float f2) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i2, z2, f2);
        }
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<TransitionListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i2, z2, f2);
            }
        }
    }

    private void fireTransitionChange() {
        ArrayList<TransitionListener> arrayList;
        if ((this.mTransitionListener == null && ((arrayList = this.mTransitionListeners) == null || arrayList.isEmpty())) || this.mListenerPosition == this.mTransitionPosition) {
            return;
        }
        if (this.mListenerState != -1) {
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
            }
            ArrayList<TransitionListener> arrayList2 = this.mTransitionListeners;
            if (arrayList2 != null) {
                Iterator<TransitionListener> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
            }
            this.mIsAnimating = true;
        }
        this.mListenerState = -1;
        float f2 = this.mTransitionPosition;
        this.mListenerPosition = f2;
        TransitionListener transitionListener2 = this.mTransitionListener;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f2);
        }
        ArrayList<TransitionListener> arrayList3 = this.mTransitionListeners;
        if (arrayList3 != null) {
            Iterator<TransitionListener> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
            }
        }
        this.mIsAnimating = true;
    }

    protected void fireTransitionCompleted() {
        int i2;
        ArrayList<TransitionListener> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (this.mTransitionCompleted.isEmpty()) {
                i2 = -1;
            } else {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i2 = arrayList2.get(arrayList2.size() - 1).intValue();
            }
            int i3 = this.mCurrentState;
            if (i2 != i3 && i3 != -1) {
                this.mTransitionCompleted.add(Integer.valueOf(i3));
            }
        }
        processTransitionCompleted();
    }

    private void processTransitionCompleted() {
        ArrayList<TransitionListener> arrayList;
        if (this.mTransitionListener == null && ((arrayList = this.mTransitionListeners) == null || arrayList.isEmpty())) {
            return;
        }
        this.mIsAnimating = false;
        Iterator<Integer> it = this.mTransitionCompleted.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, next.intValue());
            }
            ArrayList<TransitionListener> arrayList2 = this.mTransitionListeners;
            if (arrayList2 != null) {
                Iterator<TransitionListener> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionCompleted(this, next.intValue());
                }
            }
        }
        this.mTransitionCompleted.clear();
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new ArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mOnShowHelpers.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mOnHideHelpers.get(i2).setProgress(f2);
            }
        }
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public ConstraintSet getConstraintSet(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i2);
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public void updateState(int i2, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i2, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i2) {
            constraintSet.applyTo(this);
        }
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i2);
        }
    }

    public MotionScene.Transition getTransition(int i2) {
        return this.mScene.getTransitionById(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lookUpConstraintId(String str) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getConstraintSetNames(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disableAutoTransition(boolean z2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(z2);
    }

    public void setInteractionEnabled(boolean z2) {
        this.mInteractionEnabled = z2;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i2, int i3) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, i2, i3);
        }
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<TransitionListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i2, i3);
            }
        }
    }
}