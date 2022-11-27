package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    WidgetRun firstRun;
    int groupIndex;
    WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i2) {
        this.firstRun = null;
        this.lastRun = null;
        this.groupIndex = 0;
        int i3 = index;
        this.groupIndex = i3;
        index = i3 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i2;
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    private long traverseStart(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.dependencies.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.dependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j3 = Math.max(j3, traverseStart(dependencyNode2, dependencyNode2.margin + j2));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j2 + widgetRun.getWrapDimension();
            return Math.max(Math.max(j3, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
        }
        return j3;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.dependencies.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.dependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j3 = Math.min(j3, traverseEnd(dependencyNode2, dependencyNode2.margin + j2));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j2 - widgetRun.getWrapDimension();
            return Math.min(Math.min(j3, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
        }
        return j3;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        long wrapDimension;
        int i3;
        WidgetRun widgetRun = this.firstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = i2 == 0 ? constraintWidgetContainer.horizontalRun.start : constraintWidgetContainer.verticalRun.start;
        DependencyNode dependencyNode2 = i2 == 0 ? constraintWidgetContainer.horizontalRun.end : constraintWidgetContainer.verticalRun.end;
        boolean contains = this.firstRun.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.firstRun.start, 0L);
            long traverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j2 = traverseStart - wrapDimension2;
            if (j2 >= (-this.firstRun.end.margin)) {
                j2 += this.firstRun.end.margin;
            }
            long j3 = ((-traverseEnd) - wrapDimension2) - this.firstRun.start.margin;
            if (j3 >= this.firstRun.start.margin) {
                j3 -= this.firstRun.start.margin;
            }
            float biasPercent = this.firstRun.widget.getBiasPercent(i2);
            float f2 = (float) (biasPercent > 0.0f ? (((float) j3) / biasPercent) + (((float) j2) / (1.0f - biasPercent)) : 0L);
            wrapDimension = this.firstRun.start.margin + (f2 * biasPercent) + 0.5f + wrapDimension2 + (f2 * (1.0f - biasPercent)) + 0.5f;
            i3 = this.firstRun.end.margin;
        } else if (contains) {
            return Math.max(traverseStart(this.firstRun.start, this.firstRun.start.margin), this.firstRun.start.margin + wrapDimension2);
        } else {
            if (contains2) {
                return Math.max(-traverseEnd(this.firstRun.end, this.firstRun.end.margin), (-this.firstRun.end.margin) + wrapDimension2);
            }
            wrapDimension = this.firstRun.start.margin + this.firstRun.getWrapDimension();
            i3 = this.firstRun.end.margin;
        }
        return wrapDimension - i3;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i2) {
        if (widgetRun.widget.isTerminalWidget[i2]) {
            for (Dependency dependency : widgetRun.start.dependencies) {
                if (dependency instanceof DependencyNode) {
                    DependencyNode dependencyNode = (DependencyNode) dependency;
                    if (dependencyNode.run != widgetRun && dependencyNode == dependencyNode.run.start) {
                        if (widgetRun instanceof ChainRun) {
                            Iterator<WidgetRun> it = ((ChainRun) widgetRun).widgets.iterator();
                            while (it.hasNext()) {
                                defineTerminalWidget(it.next(), i2);
                            }
                        } else if (!(widgetRun instanceof HelperReferences)) {
                            widgetRun.widget.isTerminalWidget[i2] = false;
                        }
                        defineTerminalWidget(dependencyNode.run, i2);
                    }
                }
            }
            for (Dependency dependency2 : widgetRun.end.dependencies) {
                if (dependency2 instanceof DependencyNode) {
                    DependencyNode dependencyNode2 = (DependencyNode) dependency2;
                    if (dependencyNode2.run != widgetRun && dependencyNode2 == dependencyNode2.run.start) {
                        if (widgetRun instanceof ChainRun) {
                            Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).widgets.iterator();
                            while (it2.hasNext()) {
                                defineTerminalWidget(it2.next(), i2);
                            }
                        } else if (!(widgetRun instanceof HelperReferences)) {
                            widgetRun.widget.isTerminalWidget[i2] = false;
                        }
                        defineTerminalWidget(dependencyNode2.run, i2);
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void defineTerminalWidgets(boolean z2, boolean z3) {
        if (z2) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z3) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}