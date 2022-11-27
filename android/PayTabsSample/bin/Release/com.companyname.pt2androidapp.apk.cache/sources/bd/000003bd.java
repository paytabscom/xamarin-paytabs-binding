package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
        this.mConstraintLayout = constraintLayout;
        load(context, i2);
    }

    public boolean needsToChange(int i2, float f2, float f3) {
        int i3 = this.mCurrentStateId;
        if (i3 != i2) {
            return true;
        }
        State valueAt = i2 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i3);
        return (this.mCurrentConstraintNumber == -1 || !valueAt.mVariants.get(this.mCurrentConstraintNumber).match(f2, f3)) && this.mCurrentConstraintNumber != valueAt.findMatch(f2, f3);
    }

    public void updateConstraints(int i2, float f2, float f3) {
        ConstraintSet constraintSet;
        int i3;
        State state;
        int findMatch;
        ConstraintSet constraintSet2;
        int i4;
        int i5 = this.mCurrentStateId;
        if (i5 == i2) {
            if (i2 == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(i5);
            }
            if ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(this.mCurrentConstraintNumber).match(f2, f3)) && this.mCurrentConstraintNumber != (findMatch = state.findMatch(f2, f3))) {
                if (findMatch == -1) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = state.mVariants.get(findMatch).mConstraintSet;
                }
                if (findMatch == -1) {
                    i4 = state.mConstraintID;
                } else {
                    i4 = state.mVariants.get(findMatch).mConstraintID;
                }
                if (constraintSet2 == null) {
                    return;
                }
                this.mCurrentConstraintNumber = findMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i4);
                }
                constraintSet2.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i4);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = i2;
        State state2 = this.mStateList.get(i2);
        int findMatch2 = state2.findMatch(f2, f3);
        if (findMatch2 == -1) {
            constraintSet = state2.mConstraintSet;
        } else {
            constraintSet = state2.mVariants.get(findMatch2).mConstraintSet;
        }
        if (findMatch2 == -1) {
            i3 = state2.mConstraintID;
        } else {
            i3 = state2.mVariants.get(findMatch2).mConstraintID;
        }
        if (constraintSet == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f3);
            return;
        }
        this.mCurrentConstraintNumber = findMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i2, i3);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i2, i3);
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f2, float f3) {
            for (int i2 = 0; i2 < this.mVariants.size(); i2++) {
                if (this.mVariants.get(i2).match(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Variant {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean match(float f2, float f3) {
            if (Float.isNaN(this.mMinWidth) || f2 >= this.mMinWidth) {
                if (Float.isNaN(this.mMinHeight) || f3 >= this.mMinHeight) {
                    if (Float.isNaN(this.mMaxWidth) || f2 <= this.mMaxWidth) {
                        return Float.isNaN(this.mMaxHeight) || f3 <= this.mMaxHeight;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    private void load(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        State state = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            state = new State(context, xml);
                            this.mStateList.put(state.mId, state);
                            continue;
                        } else if (c2 == 3) {
                            Variant variant = new Variant(context, xml);
                            if (state != null) {
                                state.add(variant);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c2 == 4) {
                            parseConstraintSet(context, xml);
                            continue;
                        } else {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue != null && attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }
}