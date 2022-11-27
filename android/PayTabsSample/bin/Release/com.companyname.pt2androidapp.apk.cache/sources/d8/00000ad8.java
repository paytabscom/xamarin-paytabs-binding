package com.google.android.material.bottomnavigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import java.util.HashSet;

/* loaded from: classes.dex */
public class BottomNavigationMenuView extends ViewGroup implements MenuView {
    private static final long ACTIVE_ANIMATION_DURATION_MS = 115;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int ITEM_POOL_SIZE = 5;
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private SparseArray<BadgeDrawable> badgeDrawables;
    private BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private final Pools.Pool<BottomNavigationItemView> itemPool;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private MenuBuilder menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;
    private int[] tempChildWidths;

    private boolean isShifting(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    private boolean isValidId(int i2) {
        return i2 != -1;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.itemPool = new Pools.SynchronizedPool(5);
        this.onTouchListeners = new SparseArray<>(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = new SparseArray<>(5);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.itemHeight = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.itemTextColorDefault = createDefaultColorStateList(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.set = autoTransition;
        autoTransition.setOrdering(0);
        autoTransition.setDuration(ACTIVE_ANIMATION_DURATION_MS);
        autoTransition.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        autoTransition.addTransition(new TextScale());
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MenuItemImpl itemData = ((BottomNavigationItemView) view).getItemData();
                if (BottomNavigationMenuView.this.menu.performItemAction(itemData, BottomNavigationMenuView.this.presenter, 0)) {
                    return;
                }
                itemData.setChecked(true);
            }
        };
        this.tempChildWidths = new int[5];
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.menu.getVisibleItems().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.itemHeight, BasicMeasure.EXACTLY);
        if (isShifting(this.labelVisibilityMode, size2) && this.itemHorizontalTranslationEnabled) {
            View childAt = getChildAt(this.selectedItemPosition);
            int i4 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
            }
            int i5 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.inactiveItemMinWidth * i5), Math.min(i4, this.activeItemMaxWidth));
            int i6 = size - min;
            int min2 = Math.min(i6 / (i5 == 0 ? 1 : i5), this.inactiveItemMaxWidth);
            int i7 = i6 - (i5 * min2);
            int i8 = 0;
            while (i8 < childCount) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.tempChildWidths;
                    iArr[i8] = i8 == this.selectedItemPosition ? min : min2;
                    if (i7 > 0) {
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.tempChildWidths[i8] = 0;
                }
                i8++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.activeItemMaxWidth);
            int i9 = size - (size2 * min3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr2 = this.tempChildWidths;
                    iArr2[i10] = min3;
                    if (i9 > 0) {
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.tempChildWidths[i10] = 0;
                }
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths[i12], BasicMeasure.EXACTLY), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY), 0), View.resolveSizeAndState(this.itemHeight, makeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.menu.getVisibleItems().size(), false, 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public void setItemIconSize(int i2) {
        this.itemIconSize = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i2);
            }
        }
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.itemTextAppearanceInactive = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public void setItemTextAppearanceActive(int i2) {
        this.itemTextAppearanceActive = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public void setItemBackgroundRes(int i2) {
        this.itemBackgroundRes = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i2);
            }
        }
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null && bottomNavigationItemViewArr.length > 0) {
            return bottomNavigationItemViewArr[0].getBackground();
        }
        return this.itemBackground;
    }

    public void setLabelVisibilityMode(int i2) {
        this.labelVisibilityMode = i2;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.itemHorizontalTranslationEnabled = z2;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    public void setItemOnTouchListener(int i2, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i2);
        } else {
            this.onTouchListeners.put(i2, onTouchListener);
        }
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView.getItemData().getItemId() == i2) {
                    bottomNavigationItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public ColorStateList createDefaultColorStateList(int i2) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
                int i3 = typedValue.data;
                int defaultColor = colorStateList.getDefaultColor();
                int[] iArr = DISABLED_STATE_SET;
                return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i3, defaultColor});
            }
            return null;
        }
        return null;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.presenter = bottomNavigationPresenter;
    }

    public void buildMenuView() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.itemPool.release(bottomNavigationItemView);
                    bottomNavigationItemView.removeBadge();
                }
            }
        }
        if (this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        removeUnusedBadges();
        this.buttons = new BottomNavigationItemView[this.menu.size()];
        boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i2 = 0; i2 < this.menu.size(); i2++) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i2).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            BottomNavigationItemView newItem = getNewItem();
            this.buttons[i2] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextColor(this.itemTextColorFromUser);
            Drawable drawable = this.itemBackground;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setShifting(isShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.menu.getItem(i2);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i2);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
            newItem.setOnClickListener(this.onClickListener);
            int i3 = this.selectedItemId;
            if (i3 != 0 && itemId == i3) {
                this.selectedItemPosition = i2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.selectedItemPosition = min;
        this.menu.getItem(min).setChecked(true);
    }

    public void updateMenuView() {
        MenuBuilder menuBuilder = this.menu;
        if (menuBuilder == null || this.buttons == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != this.buttons.length) {
            buildMenuView();
            return;
        }
        int i2 = this.selectedItemId;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.menu.getItem(i3);
            if (item.isChecked()) {
                this.selectedItemId = item.getItemId();
                this.selectedItemPosition = i3;
            }
        }
        if (i2 != this.selectedItemId) {
            TransitionManager.beginDelayedTransition(this, this.set);
        }
        boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i4 = 0; i4 < size; i4++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i4].setLabelVisibilityMode(this.labelVisibilityMode);
            this.buttons[i4].setShifting(isShifting);
            this.buttons[i4].initialize((MenuItemImpl) this.menu.getItem(i4), 0);
            this.presenter.setUpdateSuspended(false);
        }
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView acquire = this.itemPool.acquire();
        return acquire == null ? new BottomNavigationItemView(getContext()) : acquire;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tryRestoreSelectedItemId(int i2) {
        int size = this.menu.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.menu.getItem(i3);
            if (i2 == item.getItemId()) {
                this.selectedItemId = i2;
                this.selectedItemPosition = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.badgeDrawables = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeDrawable getBadge(int i2) {
        return this.badgeDrawables.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeDrawable getOrCreateBadge(int i2) {
        validateMenuItemId(i2);
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i2);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i2, badgeDrawable);
        }
        BottomNavigationItemView findItemView = findItemView(i2);
        if (findItemView != null) {
            findItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeBadge(int i2) {
        validateMenuItemId(i2);
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i2);
        BottomNavigationItemView findItemView = findItemView(i2);
        if (findItemView != null) {
            findItemView.removeBadge();
        }
        if (badgeDrawable != null) {
            this.badgeDrawables.remove(i2);
        }
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if (isValidId(id) && (badgeDrawable = this.badgeDrawables.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    private void removeUnusedBadges() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.menu.size(); i2++) {
            hashSet.add(Integer.valueOf(this.menu.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.badgeDrawables.size(); i3++) {
            int keyAt = this.badgeDrawables.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.badgeDrawables.delete(keyAt);
            }
        }
    }

    BottomNavigationItemView findItemView(int i2) {
        validateMenuItemId(i2);
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.buttons;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView.getId() == i2) {
                    return bottomNavigationItemView;
                }
            }
            return null;
        }
        return null;
    }

    private void validateMenuItemId(int i2) {
        if (isValidId(i2)) {
            return;
        }
        throw new IllegalArgumentException(i2 + " is not a valid view id");
    }
}