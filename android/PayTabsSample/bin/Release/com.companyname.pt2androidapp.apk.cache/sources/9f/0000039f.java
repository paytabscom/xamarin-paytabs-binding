package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelperReferences extends WidgetRun {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return false;
    }

    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void reset() {
        this.start.resolved = false;
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.dependencies.add(dependencyNode);
        dependencyNode.targets.add(this.start);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void apply() {
        if (this.widget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) this.widget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.allowsGoneWidget();
            int i2 = 0;
            if (barrierType == 0) {
                this.start.type = DependencyNode.Type.LEFT;
                while (i2 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget = barrier.mWidgets[i2];
                    if (allowsGoneWidget || constraintWidget.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget.horizontalRun.start;
                        dependencyNode.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode);
                    }
                    i2++;
                }
                addDependency(this.widget.horizontalRun.start);
                addDependency(this.widget.horizontalRun.end);
            } else if (barrierType == 1) {
                this.start.type = DependencyNode.Type.RIGHT;
                while (i2 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i2];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.horizontalRun.end;
                        dependencyNode2.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode2);
                    }
                    i2++;
                }
                addDependency(this.widget.horizontalRun.start);
                addDependency(this.widget.horizontalRun.end);
            } else if (barrierType == 2) {
                this.start.type = DependencyNode.Type.TOP;
                while (i2 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget3 = barrier.mWidgets[i2];
                    if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.verticalRun.start;
                        dependencyNode3.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode3);
                    }
                    i2++;
                }
                addDependency(this.widget.verticalRun.start);
                addDependency(this.widget.verticalRun.end);
            } else if (barrierType != 3) {
            } else {
                this.start.type = DependencyNode.Type.BOTTOM;
                while (i2 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i2];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.verticalRun.end;
                        dependencyNode4.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode4);
                    }
                    i2++;
                }
                addDependency(this.widget.verticalRun.start);
                addDependency(this.widget.verticalRun.end);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.widget;
        int barrierType = barrier.getBarrierType();
        int i2 = 0;
        int i3 = -1;
        for (DependencyNode dependencyNode : this.start.targets) {
            int i4 = dependencyNode.value;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(i3 + barrier.getMargin());
        } else {
            this.start.resolve(i2 + barrier.getMargin());
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (this.widget instanceof Barrier) {
            int barrierType = ((Barrier) this.widget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.widget.setX(this.start.value);
            } else {
                this.widget.setY(this.start.value);
            }
        }
    }
}