package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.widget.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.SplineSet;
import androidx.constraintlayout.motion.widget.TimeCycleSplineSet;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    View mView;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private int mPathMotionArc = Key.UNSET;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionPaths getKeyFrame(int i2) {
        return this.mMotionPaths.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionController(View view) {
        setView(view);
    }

    float getStartX() {
        return this.mStartMotionPath.f10x;
    }

    float getStartY() {
        return this.mStartMotionPath.f11y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFinalX() {
        return this.mEndMotionPath.f10x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFinalY() {
        return this.mEndMotionPath.f11y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildPath(float[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.buildPath(float[], int):void");
    }

    void buildBounds(float[] fArr, int i2) {
        float f2;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f4 = i3 * f3;
            float f5 = this.mStaggerScale;
            float f6 = 0.0f;
            if (f5 != 1.0f) {
                float f7 = this.mStaggerOffset;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = (f4 - f7) * f5;
                }
            }
            double d2 = f4;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f8 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                MotionPaths next = it.next();
                if (next.mKeyFrameEasing != null) {
                    if (next.time < f4) {
                        easing = next.mKeyFrameEasing;
                        f6 = next.time;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d2 = (((float) easing.get((f4 - f6) / f2)) * (f8 - f6)) + f6;
            }
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i3 * 2);
        }
    }

    private float getPreCycleDistance() {
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d2 = 0.0d;
        double d3 = 0.0d;
        float f4 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f5 = i2 * f3;
            double d4 = f5;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f7 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                if (next.mKeyFrameEasing != null) {
                    if (next.time < f5) {
                        Easing easing2 = next.mKeyFrameEasing;
                        f7 = next.time;
                        easing = easing2;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d4 = (((float) easing.get((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                f4 = (float) (f4 + Math.hypot(d3 - fArr[1], d2 - fArr[0]));
            }
            d2 = fArr[0];
            d3 = fArr[1];
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyPositionBase getPositionKeyframe(int i2, int i3, float f2, float f3) {
        RectF rectF = new RectF();
        rectF.left = this.mStartMotionPath.f10x;
        rectF.top = this.mStartMotionPath.f11y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        RectF rectF2 = new RectF();
        rectF2.left = this.mEndMotionPath.f10x;
        rectF2.top = this.mEndMotionPath.f11y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i2, i3, rectF, rectF2, f2, f3)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] timePoints = this.mSpline[0].getTimePoints();
            if (iArr != null) {
                Iterator<MotionPaths> it = this.mMotionPaths.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = it.next().mMode;
                    i2++;
                }
            }
            int i3 = 0;
            for (double d2 : timePoints) {
                this.mSpline[0].getPos(d2, this.mInterpolateData);
                this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
                i3 += 2;
            }
            return i3 / 2;
        }
        return 0;
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] timePoints = this.mSpline[0].getTimePoints();
            if (iArr != null) {
                Iterator<MotionPaths> it = this.mMotionPaths.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = it.next().mMode;
                    i2++;
                }
            }
            int i3 = 0;
            for (double d2 : timePoints) {
                this.mSpline[0].getPos(d2, this.mInterpolateData);
                this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
                i3 += 2;
            }
            return i3 / 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAttributeValues(String str, float[] fArr, int i2) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = splineSet.get(i3 / (fArr.length - 1));
        }
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildRect(float f2, float[] fArr, int i2) {
        this.mSpline[0].getPos(getAdjustedPosition(f2, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void buildRectangles(float[] fArr, int i2) {
        float f2 = 1.0f / (i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            this.mSpline[0].getPos(getAdjustedPosition(i3 * f2, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i3 * 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getKeyFrameParameter(int i2, float f2, float f3) {
        float f4 = this.mEndMotionPath.f10x - this.mStartMotionPath.f10x;
        float f5 = this.mEndMotionPath.f11y - this.mStartMotionPath.f11y;
        float f6 = this.mStartMotionPath.f10x + (this.mStartMotionPath.width / 2.0f);
        float f7 = this.mStartMotionPath.f11y + (this.mStartMotionPath.height / 2.0f);
        float hypot = (float) Math.hypot(f4, f5);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f8 = f2 - f6;
        float f9 = f3 - f7;
        if (((float) Math.hypot(f8, f9)) == 0.0f) {
            return 0.0f;
        }
        float f10 = (f8 * f4) + (f9 * f5);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return 0.0f;
                            }
                            return f9 / f5;
                        }
                        return f8 / f5;
                    }
                    return f9 / f4;
                }
                return f8 / f4;
            }
            return (float) Math.sqrt((hypot * hypot) - (f10 * f10));
        }
        return f10 / hypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        int binarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (binarySearch == 0) {
            Log.e(TAG, " KeyPath positon \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-binarySearch) - 1, motionPaths);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void setPathMotionArc(int i2) {
        this.mPathMotionArc = i2;
    }

    public void setup(int i2, int i3, float f2, long j2) {
        ArrayList arrayList;
        TimeCycleSplineSet makeSpline;
        ConstraintAttribute constraintAttribute;
        SplineSet makeSpline2;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (this.mPathMotionArc != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = this.mPathMotionArc;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i2, i3, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    if (keyPosition.mCurveFit != Key.UNSET) {
                        this.mCurveFitType = keyPosition.mCurveFit;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c2 = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c3 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c3];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        if (next3.mCustomConstraints != null && (constraintAttribute2 = next3.mCustomConstraints.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute2);
                        }
                    }
                    makeSpline2 = SplineSet.makeCustomSpline(next2, sparseArray);
                } else {
                    makeSpline2 = SplineSet.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c3 = 1;
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                this.mAttributesMap.get(str2).setup(hashMap.containsKey(str2) ? hashMap.get(str2).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            if (next6.mCustomConstraints != null && (constraintAttribute = next6.mCustomConstraints.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute);
                            }
                        }
                        makeSpline = TimeCycleSplineSet.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = TimeCycleSplineSet.makeSpline(next5, j2);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i4 = 2;
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i5 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i5] = it8.next();
            i5++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpCount = new int[strArr.length];
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.mAttributeNames;
            if (i6 >= strArr2.length) {
                break;
            }
            String str6 = strArr2[i6];
            this.mAttributeInterpCount[i6] = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                } else if (motionPathsArr[i7].attributes.containsKey(str6)) {
                    int[] iArr = this.mAttributeInterpCount;
                    iArr[i6] = iArr[i6] + motionPathsArr[i7].attributes.get(str6).noOfInterpValues();
                    break;
                } else {
                    i7++;
                }
            }
            i6++;
        }
        boolean z2 = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + this.mAttributeNames.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 1; i8 < size; i8++) {
            motionPathsArr[i8].different(motionPathsArr[i8 - 1], zArr, this.mAttributeNames, z2);
        }
        int i9 = 0;
        for (int i10 = 1; i10 < length; i10++) {
            if (zArr[i10]) {
                i9++;
            }
        }
        int[] iArr2 = new int[i9];
        this.mInterpolateVariables = iArr2;
        this.mInterpolateData = new double[iArr2.length];
        this.mInterpolateVelocity = new double[iArr2.length];
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                this.mInterpolateVariables[i11] = i12;
                i11++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i13 = 0; i13 < size; i13++) {
            motionPathsArr[i13].fillStandard(dArr[i13], this.mInterpolateVariables);
            dArr2[i13] = motionPathsArr[i13].time;
        }
        int i14 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i14 >= iArr3.length) {
                break;
            }
            if (iArr3[i14] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i14]] + " [";
                for (int i15 = 0; i15 < size; i15++) {
                    str7 = str7 + dArr[i15][i14];
                }
            }
            i14++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i16 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i16 >= strArr3.length) {
                break;
            }
            double[][] dArr3 = null;
            String str8 = strArr3[i16];
            double[] dArr4 = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < size) {
                if (motionPathsArr[i17].hasCustomData(str8)) {
                    if (dArr3 == null) {
                        int[] iArr4 = new int[i4];
                        iArr4[1] = motionPathsArr[i17].getCustomDataCount(str8);
                        iArr4[c2] = size;
                        dArr3 = (double[][]) Array.newInstance(double.class, iArr4);
                        dArr4 = new double[size];
                    }
                    dArr4[i18] = motionPathsArr[i17].time;
                    motionPathsArr[i17].getCustomData(str8, dArr3[i18], 0);
                    i18++;
                }
                i17++;
                i4 = 2;
                c2 = 0;
            }
            i16++;
            this.mSpline[i16] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr4, i18), (double[][]) Arrays.copyOf(dArr3, i18));
            i4 = 2;
            c2 = 0;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, size, 2);
            for (int i19 = 0; i19 < size; i19++) {
                iArr5[i19] = motionPathsArr[i19].mPathMotionArc;
                dArr5[i19] = motionPathsArr[i19].time;
                dArr6[i19][0] = motionPathsArr[i19].f10x;
                dArr6[i19][1] = motionPathsArr[i19].f11y;
            }
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        float f3 = Float.NaN;
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                KeyCycleOscillator makeSpline3 = KeyCycleOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f3)) {
                        f3 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next8);
                    this.mCycleMap.put(next8, makeSpline3);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            for (KeyCycleOscillator keyCycleOscillator : this.mCycleMap.values()) {
                keyCycleOscillator.setup(f3);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f10x + " y: " + this.mStartMotionPath.f11y + " end: x: " + this.mEndMotionPath.f10x + " y: " + this.mEndMotionPath.f11y;
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartCurrentState(View view) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mStartMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        readView(this.mStartMotionPath);
        this.mStartMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        this.mEndMotionPath.time = 1.0f;
        this.mEndMotionPath.position = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    private float getAdjustedPosition(float f2, float[] fArr) {
        float f3 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.mStaggerScale;
            if (f4 != 1.0d) {
                float f5 = this.mStaggerOffset;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = (f2 - f5) * f4;
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f6 = Float.NaN;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths next = it.next();
            if (next.mKeyFrameEasing != null) {
                if (next.time < f2) {
                    easing = next.mKeyFrameEasing;
                    f3 = next.time;
                } else if (Float.isNaN(f6)) {
                    f6 = next.time;
                }
            }
        }
        if (easing != null) {
            float f7 = (Float.isNaN(f6) ? 1.0f : f6) - f3;
            double d2 = (f2 - f3) / f7;
            f2 = (((float) easing.get(d2)) * f7) + f3;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d2);
            }
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean interpolate(View view, float f2, long j2, KeyCache keyCache) {
        TimeCycleSplineSet.PathRotate pathRotate;
        boolean z2;
        double d2;
        float adjustedPosition = getAdjustedPosition(f2, null);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            for (SplineSet splineSet : hashMap.values()) {
                splineSet.setProperty(view, adjustedPosition);
            }
        }
        HashMap<String, TimeCycleSplineSet> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            pathRotate = null;
            boolean z3 = false;
            for (TimeCycleSplineSet timeCycleSplineSet : hashMap2.values()) {
                if (timeCycleSplineSet instanceof TimeCycleSplineSet.PathRotate) {
                    pathRotate = (TimeCycleSplineSet.PathRotate) timeCycleSplineSet;
                } else {
                    z3 |= timeCycleSplineSet.setProperty(view, adjustedPosition, j2, keyCache);
                }
            }
            z2 = z3;
        } else {
            pathRotate = null;
            z2 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d3 = adjustedPosition;
            curveFitArr[0].getPos(d3, this.mInterpolateData);
            this.mSpline[0].getSlope(d3, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d3, dArr);
                    this.mArcSpline.getSlope(d3, this.mInterpolateVelocity);
                }
            }
            this.mStartMotionPath.setView(view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (SplineSet splineSet2 : hashMap3.values()) {
                    if (splineSet2 instanceof SplineSet.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        ((SplineSet.PathRotate) splineSet2).setPathRotate(view, adjustedPosition, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                d2 = d3;
                z2 = pathRotate.setPathRotate(view, keyCache, adjustedPosition, j2, dArr3[0], dArr3[1]) | z2;
            } else {
                d2 = d3;
            }
            int i2 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d2, this.mValuesBuff);
                this.mStartMotionPath.attributes.get(this.mAttributeNames[i2 - 1]).setInterpolatedValue(view, this.mValuesBuff);
                i2++;
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= 0.0f) {
                    view.setVisibility(this.mStartPoint.visibility);
                } else if (adjustedPosition >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != this.mStartPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i3 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i3 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i3].conditionallyFire(adjustedPosition, view);
                    i3++;
                }
            }
        } else {
            float f3 = this.mStartMotionPath.f10x + ((this.mEndMotionPath.f10x - this.mStartMotionPath.f10x) * adjustedPosition);
            float f4 = this.mStartMotionPath.f11y + ((this.mEndMotionPath.f11y - this.mStartMotionPath.f11y) * adjustedPosition);
            float f5 = f3 + 0.5f;
            int i4 = (int) f5;
            float f6 = f4 + 0.5f;
            int i5 = (int) f6;
            int i6 = (int) (f5 + this.mStartMotionPath.width + ((this.mEndMotionPath.width - this.mStartMotionPath.width) * adjustedPosition));
            int i7 = (int) (f6 + this.mStartMotionPath.height + ((this.mEndMotionPath.height - this.mStartMotionPath.height) * adjustedPosition));
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.mEndMotionPath.width != this.mStartMotionPath.width || this.mEndMotionPath.height != this.mStartMotionPath.height) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY));
            }
            view.layout(i4, i5, i6, i7);
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap4.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    keyCycleOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getDpDt(float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f2, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i2 = 0;
        if (curveFitArr != null) {
            double d2 = adjustedPosition;
            curveFitArr[0].getSlope(d2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            float f5 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * f5;
                i2++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d2, dArr2);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        float f6 = this.mEndMotionPath.f10x - this.mStartMotionPath.f10x;
        float f7 = this.mEndMotionPath.f11y - this.mStartMotionPath.f11y;
        float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f7;
        fArr[0] = (f6 * (1.0f - f3)) + (((this.mEndMotionPath.width - this.mStartMotionPath.width) + f6) * f3);
        fArr[1] = (f7 * (1.0f - f4)) + (f8 * f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getPostLayoutDvDp(float f2, int i2, int i3, float f3, float f4, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f2, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d2 = adjustedPosition;
                curveFit.getPos(d2, dArr);
                this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f3, f4, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f5 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i4 < dArr2.length) {
                    dArr2[i4] = dArr2[i4] * f5;
                    i4++;
                } else {
                    this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f3, f4, i2, i3, fArr);
                    return;
                }
            }
        } else {
            float f6 = this.mEndMotionPath.f10x - this.mStartMotionPath.f10x;
            float f7 = this.mEndMotionPath.f11y - this.mStartMotionPath.f11y;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f7;
            fArr[0] = (f6 * (1.0f - f3)) + (((this.mEndMotionPath.width - this.mStartMotionPath.width) + f6) * f3);
            fArr[1] = (f7 * (1.0f - f4)) + (f8 * f4);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f3, f4, i2, i3, fArr);
        }
    }

    public int getDrawPath() {
        int i2 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().mDrawPath);
        }
        return Math.max(i2, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int i2) {
        this.mStartMotionPath.mDrawPath = i2;
    }

    String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f2, float f3, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        rectF.left = this.mStartMotionPath.f10x;
        rectF.top = this.mStartMotionPath.f11y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        RectF rectF2 = new RectF();
        rectF2.left = this.mEndMotionPath.f10x;
        rectF2.top = this.mEndMotionPath.f11y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f2, f3, strArr, fArr);
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it = this.mKeyList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            iArr[i2] = next.mFramePosition + (next.mType * 1000);
            this.mSpline[0].getPos(next.mFramePosition / 100.0f, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    public int getKeyFrameInfo(int i2, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            if (next.mType == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i5 = i4 + 1;
                iArr[i5] = next.mType;
                int i6 = i5 + 1;
                iArr[i6] = next.mFramePosition;
                this.mSpline[0].getPos(next.mFramePosition / 100.0f, this.mInterpolateData);
                this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i7 = i6 + 1;
                iArr[i7] = Float.floatToIntBits(fArr[0]);
                int i8 = i7 + 1;
                iArr[i8] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i9 = i8 + 1;
                    iArr[i9] = keyPosition.mPositionType;
                    int i10 = i9 + 1;
                    iArr[i10] = Float.floatToIntBits(keyPosition.mPercentX);
                    i8 = i10 + 1;
                    iArr[i8] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i11 = i8 + 1;
                iArr[i4] = i11 - i4;
                i3++;
                i4 = i11;
            }
        }
        return i3;
    }
}