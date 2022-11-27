package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i2) {
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i2);
        setReverseLayout(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z2) {
        this.mRecycleChildrenOnDetach = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z2 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.mAnchorLayoutFromEnd = z2;
            if (z2) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.mAnchorPosition = getPosition(childClosestToStart);
                savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
            }
        } else {
            savedState.invalidateAnchor();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.invalidateAnchor();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z2) {
            return;
        }
        this.mStackFromEnd = z2;
        requestLayout();
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        assertNotInLayoutOrScroll(null);
        if (i2 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i2);
            this.mOrientationHelper = createOrientationHelper;
            this.mAnchorInfo.mOrientationHelper = createOrientationHelper;
            this.mOrientation = i2;
            requestLayout();
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (z2 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i2 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i2) {
                return childAt;
            }
        }
        return super.findViewByPosition(i2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i2;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.mLayoutDirection == -1) {
            i2 = 0;
        } else {
            i2 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = (i2 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        int i3;
        int i4;
        int i5;
        int fixLayoutEndGap;
        int i6;
        View findViewByPosition;
        int decoratedStart;
        int i7;
        int i8 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            this.mAnchorInfo.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        } else if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
            this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = layoutState.mLastScrollDelta >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.getStartAfterPadding();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.getEndPadding();
        if (state.isPreLayout() && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                i7 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i9 = i7 - decoratedStart;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        if (!this.mAnchorInfo.mLayoutFromEnd ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(recycler, state, this.mAnchorInfo, i8);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        this.mLayoutState.mNoRecycleSpace = 0;
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtraFillSpace = max;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.mOffset;
            int i10 = this.mLayoutState.mCurrentPosition;
            if (this.mLayoutState.mAvailable > 0) {
                max2 += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtraFillSpace = max2;
            this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                int i11 = this.mLayoutState.mAvailable;
                updateLayoutStateToFillStart(i10, i3);
                this.mLayoutState.mExtraFillSpace = i11;
                fill(recycler, this.mLayoutState, state, false);
                i3 = this.mLayoutState.mOffset;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtraFillSpace = max2;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.mOffset;
            int i12 = this.mLayoutState.mCurrentPosition;
            if (this.mLayoutState.mAvailable > 0) {
                max += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtraFillSpace = max;
            this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                int i13 = this.mLayoutState.mAvailable;
                updateLayoutStateToFillEnd(i12, i2);
                this.mLayoutState.mExtraFillSpace = i13;
                fill(recycler, this.mLayoutState, state, false);
                i2 = this.mLayoutState.mOffset;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i2, recycler, state, true);
                i4 = i3 + fixLayoutEndGap2;
                i5 = i2 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i4, recycler, state, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i3, recycler, state, true);
                i4 = i3 + fixLayoutStartGap;
                i5 = i2 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i5, recycler, state, false);
            }
            i3 = i4 + fixLayoutEndGap;
            i2 = i5 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.mOrientationHelper.onLayoutComplete();
        } else {
            this.mAnchorInfo.reset();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.reset();
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3) {
        if (!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
        int size = scrapList.size();
        int position = getPosition(getChildAt(0));
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.ViewHolder viewHolder = scrapList.get(i6);
            if (!viewHolder.isRemoved()) {
                if (((viewHolder.getLayoutPosition() < position) != this.mShouldReverseLayout ? (char) 65535 : (char) 1) == 65535) {
                    i4 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                } else {
                    i5 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                }
            }
        }
        this.mLayoutState.mScrapList = scrapList;
        if (i4 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i2);
            this.mLayoutState.mExtraFillSpace = i4;
            this.mLayoutState.mAvailable = 0;
            this.mLayoutState.assignPositionFromScrapList();
            fill(recycler, this.mLayoutState, state, false);
        }
        if (i5 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i3);
            this.mLayoutState.mExtraFillSpace = i5;
            this.mLayoutState.mAvailable = 0;
            this.mLayoutState.assignPositionFromScrapList();
            fill(recycler, this.mLayoutState, state, false);
        }
        this.mLayoutState.mScrapList = null;
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = this.mStackFromEnd ? state.getItemCount() - 1 : 0;
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View findReferenceChild;
        boolean z2 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd == this.mStackFromEnd && (findReferenceChild = findReferenceChild(recycler, state, anchorInfo.mLayoutFromEnd, this.mStackFromEnd)) != null) {
            anchorInfo.assignFromView(findReferenceChild, getPosition(findReferenceChild));
            if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                int decoratedStart = this.mOrientationHelper.getDecoratedStart(findReferenceChild);
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findReferenceChild);
                int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
                boolean z3 = decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding;
                if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                    z2 = true;
                }
                if (z3 || z2) {
                    if (anchorInfo.mLayoutFromEnd) {
                        startAfterPadding = endAfterPadding;
                    }
                    anchorInfo.mCoordinate = startAfterPadding;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i2;
        int decoratedStart;
        if (!state.isPreLayout() && (i2 = this.mPendingScrollPosition) != -1) {
            if (i2 < 0 || i2 >= state.getItemCount()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.hasValidAnchor()) {
                    anchorInfo.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    if (anchorInfo.mLayoutFromEnd) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        } else if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        } else if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        } else {
                            if (anchorInfo.mLayoutFromEnd) {
                                decoratedStart = this.mOrientationHelper.getDecoratedEnd(findViewByPosition) + this.mOrientationHelper.getTotalSpaceChange();
                            } else {
                                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                            }
                            anchorInfo.mCoordinate = decoratedStart;
                        }
                    } else {
                        if (getChildCount() > 0) {
                            anchorInfo.mLayoutFromEnd = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        anchorInfo.assignCoordinateFromPadding();
                    }
                    return true;
                } else {
                    anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
                    if (this.mShouldReverseLayout) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private int fixLayoutEndGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i2;
        if (endAfterPadding2 > 0) {
            int i3 = -scrollBy(-endAfterPadding2, recycler, state);
            int i4 = i2 + i3;
            if (!z2 || (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i4) <= 0) {
                return i3;
            }
            this.mOrientationHelper.offsetChildren(endAfterPadding);
            return endAfterPadding + i3;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int startAfterPadding;
        int startAfterPadding2 = i2 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i3 = -scrollBy(startAfterPadding2, recycler, state);
            int i4 = i2 + i3;
            if (!z2 || (startAfterPadding = i4 - this.mOrientationHelper.getStartAfterPadding()) <= 0) {
                return i3;
            }
            this.mOrientationHelper.offsetChildren(-startAfterPadding);
            return i3 - startAfterPadding;
        }
        return 0;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillEnd(int i2, int i3) {
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i3;
        this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.mCurrentPosition = i2;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = i3;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(int i2, int i3) {
        this.mLayoutState.mAvailable = i3 - this.mOrientationHelper.getStartAfterPadding();
        this.mLayoutState.mCurrentPosition = i2;
        this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = i3;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    LayoutState createLayoutState() {
        return new LayoutState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z2) {
        this.mSmoothScrollbarEnabled = z2;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    private void updateLayoutState(int i2, int i3, boolean z2, RecyclerView.State state) {
        int startAfterPadding;
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mLayoutDirection = i2;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z3 = i2 == 1;
        this.mLayoutState.mExtraFillSpace = z3 ? max2 : max;
        LayoutState layoutState = this.mLayoutState;
        if (!z3) {
            max = max2;
        }
        layoutState.mNoRecycleSpace = max;
        if (z3) {
            this.mLayoutState.mExtraFillSpace += this.mOrientationHelper.getEndPadding();
            View childClosestToEnd = getChildClosestToEnd();
            this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToEnd) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.mExtraFillSpace += this.mOrientationHelper.getStartAfterPadding();
            this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToStart) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        this.mLayoutState.mAvailable = i3;
        if (z2) {
            this.mLayoutState.mAvailable -= startAfterPadding;
        }
        this.mLayoutState.mScrollingOffset = startAfterPadding;
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = layoutState.mCurrentPosition;
        if (i2 < 0 || i2 >= state.getItemCount()) {
            return;
        }
        layoutPrefetchRegistry.addPosition(i2, Math.max(0, layoutState.mScrollingOffset));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z2;
        int i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            z2 = this.mPendingSavedState.mAnchorLayoutFromEnd;
            i3 = this.mPendingSavedState.mAnchorPosition;
        } else {
            resolveShouldLayoutReverse();
            z2 = this.mShouldReverseLayout;
            i3 = this.mPendingScrollPosition;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.mInitialPrefetchItemCount && i3 >= 0 && i3 < i2; i5++) {
            layoutPrefetchRegistry.addPosition(i3, 0);
            i3 += i4;
        }
    }

    public void setInitialPrefetchItemCount(int i2) {
        this.mInitialPrefetchItemCount = i2;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i2 > 0 ? 1 : -1, Math.abs(i2), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    int scrollBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        updateLayoutState(i3, abs, true, state);
        int fill = this.mLayoutState.mScrollingOffset + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i2 = i3 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i2);
        this.mLayoutState.mLastScrollDelta = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                removeAndRecycleViewAt(i2, recycler);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            removeAndRecycleViewAt(i4, recycler);
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (this.mOrientationHelper.getDecoratedEnd(childAt) > i4 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i4) {
                    recycleChildren(recycler, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = childCount - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i4 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i4) {
                recycleChildren(recycler, i6, i7);
                return;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i2, int i3) {
        int childCount = getChildCount();
        if (i2 < 0) {
            return;
        }
        int end = (this.mOrientationHelper.getEnd() - i2) + i3;
        if (this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                    recycleChildren(recycler, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                recycleChildren(recycler, i5, i6);
                return;
            }
        }
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.mRecycle || layoutState.mInfinite) {
            return;
        }
        int i2 = layoutState.mScrollingOffset;
        int i3 = layoutState.mNoRecycleSpace;
        if (layoutState.mLayoutDirection == -1) {
            recycleViewsFromEnd(recycler, i2, i3);
        } else {
            recycleViewsFromStart(recycler, i2, i3);
        }
    }

    int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z2) {
        int i2 = layoutState.mAvailable;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i3 = layoutState.mAvailable + layoutState.mExtraFillSpace;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.mInfinite && i3 <= 0) || !layoutState.hasMore(state)) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                layoutState.mOffset += layoutChunkResult.mConsumed * layoutState.mLayoutDirection;
                if (!layoutChunkResult.mIgnoreConsumed || layoutState.mScrapList != null || !state.isPreLayout()) {
                    layoutState.mAvailable -= layoutChunkResult.mConsumed;
                    i3 -= layoutChunkResult.mConsumed;
                }
                if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
                    layoutState.mScrollingOffset += layoutChunkResult.mConsumed;
                    if (layoutState.mAvailable < 0) {
                        layoutState.mScrollingOffset += layoutState.mAvailable;
                    }
                    recycleByLayoutState(recycler, layoutState);
                }
                if (z2 && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.mAvailable;
    }

    void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int i2;
        int i3;
        int i4;
        int i5;
        int decoratedMeasurementInOther;
        View next = layoutState.next(recycler);
        if (next == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
        if (layoutState.mScrapList == null) {
            if (this.mShouldReverseLayout == (layoutState.mLayoutDirection == -1)) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (layoutState.mLayoutDirection == -1)) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i5 = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                i5 = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + i5;
            }
            if (layoutState.mLayoutDirection == -1) {
                int i6 = layoutState.mOffset;
                i3 = layoutState.mOffset - layoutChunkResult.mConsumed;
                i2 = decoratedMeasurementInOther;
                i4 = i6;
            } else {
                int i7 = layoutState.mOffset;
                i4 = layoutState.mOffset + layoutChunkResult.mConsumed;
                i2 = decoratedMeasurementInOther;
                i3 = i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingTop;
            if (layoutState.mLayoutDirection == -1) {
                i3 = paddingTop;
                i2 = layoutState.mOffset;
                i4 = decoratedMeasurementInOther2;
                i5 = layoutState.mOffset - layoutChunkResult.mConsumed;
            } else {
                int i8 = layoutState.mOffset;
                i2 = layoutState.mOffset + layoutChunkResult.mConsumed;
                i3 = paddingTop;
                i4 = decoratedMeasurementInOther2;
                i5 = i8;
            }
        }
        layoutDecoratedWithMargins(next, i5, i3, i2, i4);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = next.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z2, boolean z3) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z2, z3);
        }
        return findOneVisibleChild(0, getChildCount(), z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z2, boolean z3) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z2, z3);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z2, z3);
    }

    View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i2;
        int i3;
        ensureLayoutState();
        int childCount = getChildCount();
        int i4 = -1;
        if (z3) {
            i2 = getChildCount() - 1;
            i3 = -1;
        } else {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        }
        int itemCount = state.getItemCount();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (position >= 0 && position < itemCount) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z4 = decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding;
                    boolean z5 = decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding;
                    if (!z4 && !z5) {
                        return childAt;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOneVisibleChild(int i2, int i3, boolean z2, boolean z3) {
        ensureLayoutState();
        int i4 = z2 ? 24579 : 320;
        int i5 = z3 ? 320 : 0;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i2, i3, i4, i5);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i2, i3, i4, i5);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i2, int i3) {
        int i4;
        int i5;
        ensureLayoutState();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i2);
        }
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i2)) < this.mOrientationHelper.getStartAfterPadding()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i2, i3, i4, i5);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, state);
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mRecycle = false;
        fill(recycler, this.mLayoutState, state, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(decoratedStart2 < decoratedStart);
                    throw new RuntimeException(sb.toString());
                } else if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(decoratedStart3 < decoratedStart);
                throw new RuntimeException(sb2.toString());
            } else if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(View view, View view2, int i2, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(view2) + this.mOrientationHelper.getDecoratedMeasurement(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            }
        } else if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LayoutState {
        static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        boolean mInfinite;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        int mScrollingOffset;
        boolean mRecycle = true;
        int mExtraFillSpace = 0;
        int mNoRecycleSpace = 0;
        boolean mIsPreLayout = false;
        List<RecyclerView.ViewHolder> mScrapList = null;

        LayoutState() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasMore(RecyclerView.State state) {
            int i2 = this.mCurrentPosition;
            return i2 >= 0 && i2 < state.getItemCount();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View next(RecyclerView.Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        private View nextViewFromScrapList() {
            int size = this.mScrapList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.mScrapList.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.mCurrentPosition == layoutParams.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        public void assignPositionFromScrapList(View view) {
            View nextViewInLimitedList = nextViewInLimitedList(view);
            if (nextViewInLimitedList == null) {
                this.mCurrentPosition = -1;
            } else {
                this.mCurrentPosition = ((RecyclerView.LayoutParams) nextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public View nextViewInLimitedList(View view) {
            int viewLayoutPosition;
            int size = this.mScrapList.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.mScrapList.get(i3).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection) >= 0 && viewLayoutPosition < i2) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i2 = viewLayoutPosition;
                }
            }
            return view2;
        }

        void log() {
            Log.d(TAG, "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }

        boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        OrientationHelper mOrientationHelper;
        int mPosition;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        void assignCoordinateFromPadding() {
            int startAfterPadding;
            if (this.mLayoutFromEnd) {
                startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            } else {
                startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            }
            this.mCoordinate = startAfterPadding;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }

        boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount();
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i2) {
            int totalSpaceChange = this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view, i2);
                return;
            }
            this.mPosition = i2;
            if (this.mLayoutFromEnd) {
                int endAfterPadding = (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.mCoordinate - this.mOrientationHelper.getDecoratedMeasurement(view);
                    int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                    int min = decoratedMeasurement - (startAfterPadding + Math.min(this.mOrientationHelper.getDecoratedStart(view) - startAfterPadding, 0));
                    if (min < 0) {
                        this.mCoordinate += Math.min(endAfterPadding, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view))) - (decoratedStart + this.mOrientationHelper.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.mCoordinate -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        public void assignFromView(View view, int i2) {
            if (this.mLayoutFromEnd) {
                this.mCoordinate = this.mOrientationHelper.getDecoratedEnd(view) + this.mOrientationHelper.getTotalSpaceChange();
            } else {
                this.mCoordinate = this.mOrientationHelper.getDecoratedStart(view);
            }
            this.mPosition = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult() {
        }

        void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }
}