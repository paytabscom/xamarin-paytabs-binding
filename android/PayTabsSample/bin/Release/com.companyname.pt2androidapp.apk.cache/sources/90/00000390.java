package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;

/* loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {
    private int mPaddingTop = 0;
    private int mPaddingBottom = 0;
    private int mPaddingLeft = 0;
    private int mPaddingRight = 0;
    private int mPaddingStart = 0;
    private int mPaddingEnd = 0;
    private int mResolvedPaddingLeft = 0;
    private int mResolvedPaddingRight = 0;
    private boolean mNeedsCallFromSolver = false;
    private int mMeasuredWidth = 0;
    private int mMeasuredHeight = 0;
    protected BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    BasicMeasure.Measurer mMeasurer = null;

    public void measure(int i2, int i3, int i4, int i5) {
    }

    public void setPadding(int i2) {
        this.mPaddingLeft = i2;
        this.mPaddingTop = i2;
        this.mPaddingRight = i2;
        this.mPaddingBottom = i2;
        this.mPaddingStart = i2;
        this.mPaddingEnd = i2;
    }

    public void setPaddingStart(int i2) {
        this.mPaddingStart = i2;
        this.mResolvedPaddingLeft = i2;
        this.mResolvedPaddingRight = i2;
    }

    public void setPaddingEnd(int i2) {
        this.mPaddingEnd = i2;
    }

    public void setPaddingLeft(int i2) {
        this.mPaddingLeft = i2;
        this.mResolvedPaddingLeft = i2;
    }

    public void applyRtl(boolean z2) {
        int i2 = this.mPaddingStart;
        if (i2 > 0 || this.mPaddingEnd > 0) {
            if (z2) {
                this.mResolvedPaddingLeft = this.mPaddingEnd;
                this.mResolvedPaddingRight = i2;
                return;
            }
            this.mResolvedPaddingLeft = i2;
            this.mResolvedPaddingRight = this.mPaddingEnd;
        }
    }

    public void setPaddingTop(int i2) {
        this.mPaddingTop = i2;
    }

    public void setPaddingRight(int i2) {
        this.mPaddingRight = i2;
        this.mResolvedPaddingRight = i2;
    }

    public void setPaddingBottom(int i2) {
        this.mPaddingBottom = i2;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mResolvedPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mResolvedPaddingRight;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void needsCallbackFromSolver(boolean z2) {
        this.mNeedsCallFromSolver = z2;
    }

    public boolean needSolverPass() {
        return this.mNeedsCallFromSolver;
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    public void captureWidgets() {
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            ConstraintWidget constraintWidget = this.mWidgets[i2];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public int getMeasuredWidth() {
        return this.mMeasuredWidth;
    }

    public int getMeasuredHeight() {
        return this.mMeasuredHeight;
    }

    public void setMeasure(int i2, int i3) {
        this.mMeasuredWidth = i2;
        this.mMeasuredHeight = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean measureChildren() {
        BasicMeasure.Measurer measurer = this.mParent != null ? ((ConstraintWidgetContainer) this.mParent).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= this.mWidgetsCount) {
                return true;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i2];
            if (constraintWidget != null && !(constraintWidget instanceof Guideline)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                if (!((dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight == 1) ? false : false)) {
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.mMeasure.horizontalBehavior = dimensionBehaviour;
                    this.mMeasure.verticalBehavior = dimensionBehaviour2;
                    this.mMeasure.horizontalDimension = constraintWidget.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget.getHeight();
                    measurer.measure(constraintWidget, this.mMeasure);
                    constraintWidget.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        while (this.mMeasurer == null && getParent() != null) {
            this.mMeasurer = ((ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        this.mMeasure.horizontalBehavior = dimensionBehaviour;
        this.mMeasure.verticalBehavior = dimensionBehaviour2;
        this.mMeasure.horizontalDimension = i2;
        this.mMeasure.verticalDimension = i3;
        this.mMeasurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }
}