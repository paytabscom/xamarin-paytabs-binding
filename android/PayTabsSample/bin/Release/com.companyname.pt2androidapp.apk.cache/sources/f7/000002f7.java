package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.io.PrintStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class DesignTool implements ProxyInterface {
    private static final boolean DEBUG = false;
    private static final String TAG = "DesignTool";
    static final HashMap<Pair<Integer, Integer>, String> allAttributes;
    static final HashMap<String, String> allMargins;
    private final MotionLayout mMotionLayout;
    private MotionScene mSceneCache;
    private String mLastStartState = null;
    private String mLastEndState = null;
    private int mLastStartStateId = -1;
    private int mLastEndStateId = -1;

    public DesignTool(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        allAttributes = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        allMargins = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    private static int GetPxFromDp(int i2, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i2) / 160.0f);
    }

    private static void Connect(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3, int i4) {
        String str = allAttributes.get(Pair.create(Integer.valueOf(i3), Integer.valueOf(i4)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = allMargins.get(str);
            constraintSet.connect(view.getId(), i3, Integer.parseInt(str2), i4, str3 != null ? GetPxFromDp(i2, hashMap.get(str3)) : 0);
        }
    }

    private static void SetBias(ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i2) {
        String str = hashMap.get(i2 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i2 == 0) {
                constraintSet.setHorizontalBias(view.getId(), Float.parseFloat(str));
            } else if (i2 == 1) {
                constraintSet.setVerticalBias(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void SetDimensions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3) {
        String str = hashMap.get(i3 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int GetPxFromDp = str.equalsIgnoreCase("wrap_content") ? -2 : GetPxFromDp(i2, str);
            if (i3 == 0) {
                constraintSet.constrainWidth(view.getId(), GetPxFromDp);
            } else {
                constraintSet.constrainHeight(view.getId(), GetPxFromDp);
            }
        }
    }

    private static void SetAbsolutePositions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), GetPxFromDp(i2, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), GetPxFromDp(i2, str2));
        }
    }

    public int getAnimationPath(Object obj, float[] fArr, int i2) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildPath(fArr, i2);
        return i2;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        if (this.mMotionLayout.mScene == null) {
            return;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return;
        }
        motionController.buildRectangles(fArr, duration);
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildKeyFrames(fArr, null);
        return duration;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float f2) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        this.mMotionLayout.setProgress(f2);
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.requestLayout();
        this.mMotionLayout.invalidate();
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.mLastStartState == str) {
            return;
        }
        this.mLastStartState = str;
        this.mLastEndState = null;
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = str != null ? this.mMotionLayout.lookUpConstraintId(str) : R.id.motion_base;
        this.mLastStartStateId = lookUpConstraintId;
        if (lookUpConstraintId != 0) {
            if (lookUpConstraintId == this.mMotionLayout.getStartState()) {
                this.mMotionLayout.setProgress(0.0f);
            } else if (lookUpConstraintId == this.mMotionLayout.getEndState()) {
                this.mMotionLayout.setProgress(1.0f);
            } else {
                this.mMotionLayout.transitionToState(lookUpConstraintId);
                this.mMotionLayout.setProgress(1.0f);
            }
        }
        this.mMotionLayout.requestLayout();
    }

    public String getStartState() {
        int startState = this.mMotionLayout.getStartState();
        if (this.mLastStartStateId == startState) {
            return this.mLastStartState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(startState);
        if (constraintSetNames != null) {
            this.mLastStartState = constraintSetNames;
            this.mLastStartStateId = startState;
        }
        return this.mMotionLayout.getConstraintSetNames(startState);
    }

    public String getEndState() {
        int endState = this.mMotionLayout.getEndState();
        if (this.mLastEndStateId == endState) {
            return this.mLastEndState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(endState);
        if (constraintSetNames != null) {
            this.mLastEndState = constraintSetNames;
            this.mLastEndStateId = endState;
        }
        return constraintSetNames;
    }

    public float getProgress() {
        return this.mMotionLayout.getProgress();
    }

    public String getState() {
        if (this.mLastStartState != null && this.mLastEndState != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.mLastStartState;
            }
            if (progress >= 0.99f) {
                return this.mLastEndState;
            }
        }
        return this.mLastStartState;
    }

    public boolean isInTransition() {
        return (this.mLastStartState == null || this.mLastEndState == null) ? false : true;
    }

    public void setTransition(String str, String str2) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = this.mMotionLayout.lookUpConstraintId(str);
        int lookUpConstraintId2 = this.mMotionLayout.lookUpConstraintId(str2);
        this.mMotionLayout.setTransition(lookUpConstraintId, lookUpConstraintId2);
        this.mLastStartStateId = lookUpConstraintId;
        this.mLastEndStateId = lookUpConstraintId2;
        this.mLastStartState = str;
        this.mLastEndState = str2;
    }

    public void disableAutoTransition(boolean z2) {
        this.mMotionLayout.disableAutoTransition(z2);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
        return this.mMotionLayout.getTransitionTimeMs();
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getkeyFramePositions(iArr, fArr);
    }

    public int getKeyFrameInfo(Object obj, int i2, int[] iArr) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i2, iArr);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(Object obj, int i2, float f2, float f3) {
        return this.mMotionLayout.mFrameArrayList.get((View) obj).getKeyFrameParameter(i2, f2, f3);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(Object obj, int i2, String str, Object obj2) {
        if (this.mMotionLayout.mScene != null) {
            this.mMotionLayout.mScene.setKeyframe((View) obj, i2, str, obj2);
            this.mMotionLayout.mTransitionGoalPosition = i2 / 100.0f;
            this.mMotionLayout.mTransitionLastPosition = 0.0f;
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.evaluate(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(Object obj, int i2, int i3, float f2, float f3) {
        if (this.mMotionLayout.mScene != null) {
            MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
            int i4 = (int) (this.mMotionLayout.mTransitionPosition * 100.0f);
            if (motionController != null) {
                View view = (View) obj;
                if (this.mMotionLayout.mScene.hasKeyFramePosition(view, i4)) {
                    float keyFrameParameter = motionController.getKeyFrameParameter(2, f2, f3);
                    float keyFrameParameter2 = motionController.getKeyFrameParameter(5, f2, f3);
                    this.mMotionLayout.mScene.setKeyframe(view, i4, "motion:percentX", Float.valueOf(keyFrameParameter));
                    this.mMotionLayout.mScene.setKeyframe(view, i4, "motion:percentY", Float.valueOf(keyFrameParameter2));
                    this.mMotionLayout.rebuildScene();
                    this.mMotionLayout.evaluate(true);
                    this.mMotionLayout.invalidate();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setViewDebug(Object obj, int i2) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController != null) {
            motionController.setDrawPath(i2);
            this.mMotionLayout.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4) {
        MotionController motionController;
        View view = (View) obj;
        if (i2 == 0) {
            motionController = null;
        } else if (this.mMotionLayout.mScene == null || view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return -1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                int duration = this.mMotionLayout.mScene.getDuration() / 16;
                motionController.buildPath(fArr2, duration);
                return duration;
            } else if (i2 == 2) {
                int duration2 = this.mMotionLayout.mScene.getDuration() / 16;
                motionController.buildKeyFrames(fArr2, null);
                return duration2;
            } else if (i2 != 3) {
                return -1;
            } else {
                int duration3 = this.mMotionLayout.mScene.getDuration() / 16;
                return motionController.getAttributeValues(str, fArr2, i4);
            }
        }
        return 1;
    }

    public Object getKeyframe(int i2, int i3, int i4) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        return this.mMotionLayout.mScene.getKeyFrame(this.mMotionLayout.getContext(), i2, i3, i4);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public Object getKeyframeAtLocation(Object obj, float f2, float f3) {
        MotionController motionController;
        View view = (View) obj;
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        if (view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return motionController.getPositionKeyframe(viewGroup.getWidth(), viewGroup.getHeight(), f2, f3);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public Boolean getPositionKeyframe(Object obj, Object obj2, float f2, float f3, String[] strArr, float[] fArr) {
        if (obj instanceof KeyPositionBase) {
            View view = (View) obj2;
            this.mMotionLayout.mFrameArrayList.get(view).positionKeyframe(view, (KeyPositionBase) obj, f2, f3, strArr, fArr);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
            return true;
        }
        return false;
    }

    public Object getKeyframe(Object obj, int i2, int i3) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        return this.mMotionLayout.mScene.getKeyFrame(this.mMotionLayout.getContext(), i2, ((View) obj).getId(), i3);
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int i2, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int lookUpConstraintId = this.mMotionLayout.lookUpConstraintId(str);
        ConstraintSet constraintSet = this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId);
        if (constraintSet == null) {
            return;
        }
        constraintSet.clear(view.getId());
        SetDimensions(i2, constraintSet, view, hashMap, 0);
        SetDimensions(i2, constraintSet, view, hashMap, 1);
        Connect(i2, constraintSet, view, hashMap, 6, 6);
        Connect(i2, constraintSet, view, hashMap, 6, 7);
        Connect(i2, constraintSet, view, hashMap, 7, 7);
        Connect(i2, constraintSet, view, hashMap, 7, 6);
        Connect(i2, constraintSet, view, hashMap, 1, 1);
        Connect(i2, constraintSet, view, hashMap, 1, 2);
        Connect(i2, constraintSet, view, hashMap, 2, 2);
        Connect(i2, constraintSet, view, hashMap, 2, 1);
        Connect(i2, constraintSet, view, hashMap, 3, 3);
        Connect(i2, constraintSet, view, hashMap, 3, 4);
        Connect(i2, constraintSet, view, hashMap, 4, 3);
        Connect(i2, constraintSet, view, hashMap, 4, 4);
        Connect(i2, constraintSet, view, hashMap, 5, 5);
        SetBias(constraintSet, view, hashMap, 0);
        SetBias(constraintSet, view, hashMap, 1);
        SetAbsolutePositions(i2, constraintSet, view, hashMap);
        this.mMotionLayout.updateState(lookUpConstraintId, constraintSet);
        this.mMotionLayout.requestLayout();
    }

    public void dumpConstraintSet(String str) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = this.mMotionLayout.lookUpConstraintId(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + lookUpConstraintId + ")");
        try {
            this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId).dump(this.mMotionLayout.mScene, new int[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}