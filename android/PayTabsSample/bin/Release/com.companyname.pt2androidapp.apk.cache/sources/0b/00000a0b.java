package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class FakeDrag {
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private final ScrollEventAdapter mScrollEventAdapter;
    private VelocityTracker mVelocityTracker;
    private final ViewPager2 mViewPager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FakeDrag(ViewPager2 viewPager2, ScrollEventAdapter scrollEventAdapter, RecyclerView recyclerView) {
        this.mViewPager = viewPager2;
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mRecyclerView = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFakeDragging() {
        return this.mScrollEventAdapter.isFakeDragging();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean beginFakeDrag() {
        if (this.mScrollEventAdapter.isDragging()) {
            return false;
        }
        this.mActualDraggedDistance = 0;
        this.mRequestedDragDistance = 0;
        this.mFakeDragBeginTime = SystemClock.uptimeMillis();
        beginFakeVelocityTracker();
        this.mScrollEventAdapter.notifyBeginFakeDrag();
        if (!this.mScrollEventAdapter.isIdle()) {
            this.mRecyclerView.stopScroll();
        }
        addFakeMotionEvent(this.mFakeDragBeginTime, 0, 0.0f, 0.0f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean fakeDragBy(float f2) {
        if (this.mScrollEventAdapter.isFakeDragging()) {
            float f3 = this.mRequestedDragDistance - f2;
            this.mRequestedDragDistance = f3;
            int round = Math.round(f3 - this.mActualDraggedDistance);
            this.mActualDraggedDistance += round;
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z2 = this.mViewPager.getOrientation() == 0;
            int i2 = z2 ? round : 0;
            int i3 = z2 ? 0 : round;
            float f4 = z2 ? this.mRequestedDragDistance : 0.0f;
            float f5 = z2 ? 0.0f : this.mRequestedDragDistance;
            this.mRecyclerView.scrollBy(i2, i3);
            addFakeMotionEvent(uptimeMillis, 2, f4, f5);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean endFakeDrag() {
        if (this.mScrollEventAdapter.isFakeDragging()) {
            this.mScrollEventAdapter.notifyEndFakeDrag();
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            if (this.mRecyclerView.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return true;
            }
            this.mViewPager.snapToPage();
            return true;
        }
        return false;
    }

    private void beginFakeVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
            this.mMaximumVelocity = ViewConfiguration.get(this.mViewPager.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    private void addFakeMotionEvent(long j2, int i2, float f2, float f3) {
        MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, j2, i2, f2, f3, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }
}