package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

/* loaded from: classes.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT;

    static {
        USE_COMPAT_PARENT = Build.VERSION.SDK_INT < 18;
    }

    private BadgeUtils() {
    }

    public static void updateBadgeBounds(Rect rect, float f2, float f3, float f4, float f5) {
        rect.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else if (USE_COMPAT_PARENT) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i2) {
        attachBadgeDrawable(badgeDrawable, toolbar, i2, null);
    }

    public static void attachBadgeDrawable(final BadgeDrawable badgeDrawable, final Toolbar toolbar, final int i2, final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(Toolbar.this, i2);
                if (actionMenuItemView != null) {
                    BadgeDrawable badgeDrawable2 = badgeDrawable;
                    badgeDrawable2.setHorizontalOffset(badgeDrawable2.getHorizontalOffset() + Toolbar.this.getResources().getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
                    BadgeDrawable badgeDrawable3 = badgeDrawable;
                    badgeDrawable3.setVerticalOffset(badgeDrawable3.getVerticalOffset() + Toolbar.this.getResources().getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                }
            }
        });
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i2) {
        if (badgeDrawable == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i2);
        if (actionMenuItemView != null) {
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            return;
        }
        Log.w(LOG_TAG, "Trying to remove badge from a null menuItemView: " + i2);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            BadgeDrawable valueAt = sparseArray.valueAt(i2);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i2 = 0; i2 < parcelableSparseArray.size(); i2++) {
            int keyAt = parcelableSparseArray.keyAt(i2);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i2);
            if (savedState == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, savedState));
        }
        return sparseArray;
    }
}