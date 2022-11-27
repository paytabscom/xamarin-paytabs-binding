package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.solver.widgets.VirtualLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer constraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    /* loaded from: classes.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* loaded from: classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i2);
            if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.constraintWidgetContainer = constraintWidgetContainer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
        if (r8 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r5.mDimensionRatio <= 0.0f) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r12) {
        /*
            r11 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r12.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r12.optimizeFor(r1)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r2 = r12.getMeasurer()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lc4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r12.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lc0
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lc0
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lc0
        L30:
            if (r1 == 0) goto L4c
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L4c
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r5.verticalRun
            if (r6 == 0) goto L4c
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L4c
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L4c
            goto Lc0
        L4c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L67
            int r9 = r5.mMatchConstraintDefaultWidth
            if (r9 == r7) goto L67
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L67
            int r9 = r5.mMatchConstraintDefaultHeight
            if (r9 == r7) goto L67
            r9 = 1
            goto L68
        L67:
            r9 = 0
        L68:
            if (r9 != 0) goto Laa
            boolean r10 = r12.optimizeFor(r7)
            if (r10 == 0) goto Laa
            boolean r10 = r5 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r10 != 0) goto Laa
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r10) goto L87
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 != 0) goto L87
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r10) goto L87
            boolean r10 = r5.isInHorizontalChain()
            if (r10 != 0) goto L87
            r9 = 1
        L87:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r10) goto L9a
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 != 0) goto L9a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 == r10) goto L9a
            boolean r10 = r5.isInHorizontalChain()
            if (r10 != 0) goto L9a
            r9 = 1
        L9a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 == r10) goto La2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r6) goto Laa
        La2:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto Laa
            goto Lab
        Laa:
            r7 = r9
        Lab:
            if (r7 == 0) goto Lae
            goto Lc0
        Lae:
            int r6 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r11.measure(r2, r5, r6)
            androidx.constraintlayout.solver.Metrics r5 = r12.mMetrics
            if (r5 == 0) goto Lc0
            androidx.constraintlayout.solver.Metrics r5 = r12.mMetrics
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lc0:
            int r4 = r4 + 1
            goto L12
        Lc4:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i2, int i3) {
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setHeight(i3);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.constraintWidgetContainer.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z2;
        int i11;
        int i12;
        boolean z3;
        boolean z4;
        boolean z5;
        int i13;
        Measurer measurer;
        int i14;
        int i15;
        boolean z6;
        int i16;
        boolean z7;
        Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean enabled = Optimizer.enabled(i2, 128);
        boolean z8 = enabled || Optimizer.enabled(i2, 64);
        if (z8) {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i17);
                boolean z9 = (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z9) || ((constraintWidget.isInVerticalChain() && z9) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z8 = false;
                    break;
                }
            }
        }
        if (z8 && LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.measures++;
        }
        boolean z10 = z8 & ((i5 == 1073741824 && i7 == 1073741824) || enabled);
        if (z10) {
            int min = Math.min(constraintWidgetContainer.getMaxWidth(), i6);
            int min2 = Math.min(constraintWidgetContainer.getMaxHeight(), i8);
            if (i5 == 1073741824 && constraintWidgetContainer.getWidth() != min) {
                constraintWidgetContainer.setWidth(min);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i7 == 1073741824 && constraintWidgetContainer.getHeight() != min2) {
                constraintWidgetContainer.setHeight(min2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                z2 = constraintWidgetContainer.directMeasure(enabled);
                i11 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer.directMeasureSetup(enabled);
                if (i5 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer.directMeasureWithOrientation(enabled, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    z2 = constraintWidgetContainer.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i11++;
                } else {
                    z2 = directMeasureSetup;
                }
            }
            if (z2) {
                constraintWidgetContainer.updateFromRuns(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            z2 = false;
            i11 = 0;
        }
        if (z2 && i11 == 2) {
            return 0L;
        }
        int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
        if (size > 0) {
            measureChildren(constraintWidgetContainer);
        }
        updateHierarchy(constraintWidgetContainer);
        int size2 = this.mVariableDimensionsWidgets.size();
        if (size > 0) {
            solveLinearSystem(constraintWidgetContainer, "First pass", width, height);
        }
        if (size2 > 0) {
            boolean z11 = constraintWidgetContainer.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z12 = constraintWidgetContainer.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int max = Math.max(constraintWidgetContainer.getWidth(), this.constraintWidgetContainer.getMinWidth());
            int max2 = Math.max(constraintWidgetContainer.getHeight(), this.constraintWidgetContainer.getMinHeight());
            int i18 = 0;
            boolean z13 = false;
            while (i18 < size2) {
                ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i18);
                if (constraintWidget2 instanceof VirtualLayout) {
                    int width2 = constraintWidget2.getWidth();
                    i14 = optimizationLevel;
                    int height2 = constraintWidget2.getHeight();
                    i15 = width;
                    boolean measure = measure(measurer2, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS) | z13;
                    if (constraintWidgetContainer.mMetrics != null) {
                        z6 = measure;
                        i16 = height;
                        constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                    } else {
                        z6 = measure;
                        i16 = height;
                    }
                    int width3 = constraintWidget2.getWidth();
                    int height3 = constraintWidget2.getHeight();
                    if (width3 != width2) {
                        constraintWidget2.setWidth(width3);
                        if (z11 && constraintWidget2.getRight() > max) {
                            max = Math.max(max, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                        }
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (height3 != height2) {
                        constraintWidget2.setHeight(height3);
                        if (z12 && constraintWidget2.getBottom() > max2) {
                            max2 = Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                        }
                        z7 = true;
                    }
                    z13 = z7 | ((VirtualLayout) constraintWidget2).needSolverPass();
                } else {
                    i14 = optimizationLevel;
                    i15 = width;
                    i16 = height;
                }
                i18++;
                optimizationLevel = i14;
                width = i15;
                height = i16;
            }
            int i19 = optimizationLevel;
            int i20 = width;
            int i21 = height;
            int i22 = 0;
            int i23 = 2;
            while (i22 < i23) {
                int i24 = 0;
                while (i24 < size2) {
                    ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i24);
                    if (((constraintWidget3 instanceof Helper) && !(constraintWidget3 instanceof VirtualLayout)) || (constraintWidget3 instanceof Guideline) || constraintWidget3.getVisibility() == 8 || ((z10 && constraintWidget3.horizontalRun.dimension.resolved && constraintWidget3.verticalRun.dimension.resolved) || (constraintWidget3 instanceof VirtualLayout))) {
                        z5 = z10;
                        i13 = size2;
                        measurer = measurer2;
                    } else {
                        int width4 = constraintWidget3.getWidth();
                        int height4 = constraintWidget3.getHeight();
                        int baselineDistance = constraintWidget3.getBaselineDistance();
                        int i25 = Measure.TRY_GIVEN_DIMENSIONS;
                        z5 = z10;
                        if (i22 == 1) {
                            i25 = Measure.USE_GIVEN_DIMENSIONS;
                        }
                        boolean measure2 = measure(measurer2, constraintWidget3, i25) | z13;
                        if (constraintWidgetContainer.mMetrics != null) {
                            i13 = size2;
                            measurer = measurer2;
                            constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                        } else {
                            i13 = size2;
                            measurer = measurer2;
                        }
                        int width5 = constraintWidget3.getWidth();
                        int height5 = constraintWidget3.getHeight();
                        if (width5 != width4) {
                            constraintWidget3.setWidth(width5);
                            if (z11 && constraintWidget3.getRight() > max) {
                                max = Math.max(max, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            measure2 = true;
                        }
                        if (height5 != height4) {
                            constraintWidget3.setHeight(height5);
                            if (z12 && constraintWidget3.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            measure2 = true;
                        }
                        z13 = (!constraintWidget3.hasBaseline() || baselineDistance == constraintWidget3.getBaselineDistance()) ? measure2 : true;
                    }
                    i24++;
                    size2 = i13;
                    measurer2 = measurer;
                    z10 = z5;
                }
                boolean z14 = z10;
                int i26 = size2;
                Measurer measurer3 = measurer2;
                if (!z13) {
                    break;
                }
                solveLinearSystem(constraintWidgetContainer, "intermediate pass", i20, i21);
                i22++;
                measurer2 = measurer3;
                z10 = z14;
                i23 = 2;
                z13 = false;
                size2 = i26;
            }
            if (z13) {
                solveLinearSystem(constraintWidgetContainer, "2nd pass", i20, i21);
                if (constraintWidgetContainer.getWidth() < max) {
                    constraintWidgetContainer.setWidth(max);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (constraintWidgetContainer.getHeight() < max2) {
                    constraintWidgetContainer.setHeight(max2);
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    solveLinearSystem(constraintWidgetContainer, "3rd pass", i20, i21);
                }
            }
            i12 = i19;
        } else {
            i12 = optimizationLevel;
        }
        constraintWidgetContainer.setOptimizationLevel(i12);
        return 0L;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i2) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        this.mMeasure.measuredNeedsSolverPass = false;
        this.mMeasure.measureStrategy = i2;
        boolean z2 = this.mMeasure.horizontalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = this.mMeasure.verticalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z5 = z3 && constraintWidget.mDimensionRatio > 0.0f;
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            this.mMeasure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            this.mMeasure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        this.mMeasure.measureStrategy = Measure.SELF_DIMENSIONS;
        return this.mMeasure.measuredNeedsSolverPass;
    }
}