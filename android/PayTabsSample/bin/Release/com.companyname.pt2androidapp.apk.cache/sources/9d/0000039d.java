package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public static boolean validInGroup(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        return (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0391 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean simpleSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r16, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r17) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WidgetGroup widgetGroup = arrayList.get(i3);
            if (i2 == widgetGroup.id) {
                return widgetGroup;
            }
        }
        return null;
    }

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int i3;
        int findGroupInDependents;
        if (i2 == 0) {
            i3 = constraintWidget.horizontalGroup;
        } else {
            i3 = constraintWidget.verticalGroup;
        }
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.id)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i4);
                if (widgetGroup2.getId() == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i2, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i2)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i5);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i5++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i2);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                guideline.getAnchor().findDependents(guideline.getOrientation() == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i2 == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i2, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i2, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i2, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i2, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i2, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i2, arrayList, widgetGroup);
        }
        return widgetGroup;
    }
}