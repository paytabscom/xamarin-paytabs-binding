package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    private HashMap<Integer, String> mMap;
    protected String mReferenceIds;
    protected String mReferenceTags;
    protected boolean mUseViewMeasure;
    private View[] mViews;
    protected Context myContext;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z2) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void addView(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
        } else {
            this.mReferenceIds = null;
            addRscID(view.getId());
            requestLayout();
        }
    }

    public void removeView(View view) {
        int i2;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.mReferenceIds = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.mCount) {
                break;
            } else if (this.mIds[i3] == id) {
                while (true) {
                    i2 = this.mCount;
                    if (i3 >= i2 - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i4 = i3 + 1;
                    iArr[i3] = iArr[i4];
                    i3 = i4;
                }
                this.mIds[i2 - 1] = 0;
                this.mCount = i2 - 1;
            } else {
                i3++;
            }
        }
        requestLayout();
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i2 : iArr) {
            addRscID(i2);
        }
    }

    private void addRscID(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i3 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i4 = this.mCount;
        iArr2[i4] = i2;
        this.mCount = i4 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
        }
    }

    private void addID(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int findId = findId(trim);
        if (findId != 0) {
            this.mMap.put(Integer.valueOf(findId), trim);
            addRscID(findId);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void addTag(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    private int findId(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i2 = ((Integer) designInformation).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = findId(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.myContext.getResources().getIdentifier(str, "id", this.myContext.getPackageName()) : i2;
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    protected void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                addID(str.substring(i2));
                return;
            } else {
                addID(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                addTag(str.substring(i2));
                return;
            } else {
                addTag(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    protected void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.mCount; i2++) {
            View viewById = constraintLayout.getViewById(this.mIds[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        String str;
        int findId;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            int i3 = this.mIds[i2];
            View viewById = constraintLayout.getViewById(i3);
            if (viewById == null && (findId = findId(constraintLayout, (str = this.mMap.get(Integer.valueOf(i3))))) != 0) {
                this.mIds[i2] = findId;
                this.mMap.put(Integer.valueOf(findId), str);
                viewById = constraintLayout.getViewById(findId);
            }
            if (viewById != null) {
                this.mHelperWidget.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            helper.add(sparseArray.get(this.mIds[i2]));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.mViews[i2] = constraintLayout.getViewById(this.mIds[i2]);
        }
        return this.mViews;
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
        } else if (constraint.layout.mReferenceIdString != null && constraint.layout.mReferenceIdString.length() > 0) {
            constraint.layout.mReferenceIds = convertReferenceString(this, constraint.layout.mReferenceIdString);
        }
        helperWidget.removeAllIds();
        if (constraint.layout.mReferenceIds != null) {
            for (int i2 = 0; i2 < constraint.layout.mReferenceIds.length; i2++) {
                ConstraintWidget constraintWidget = sparseArray.get(constraint.layout.mReferenceIds[i2]);
                if (constraintWidget != null) {
                    helperWidget.add(constraintWidget);
                }
            }
        }
    }

    private int[] convertReferenceString(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        for (String str2 : split) {
            int findId = findId(str2.trim());
            if (findId != 0) {
                iArr[i2] = findId;
                i2++;
            }
        }
        return i2 != split.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.mReferenceIds == null) {
            addRscID(i2);
        }
    }
}