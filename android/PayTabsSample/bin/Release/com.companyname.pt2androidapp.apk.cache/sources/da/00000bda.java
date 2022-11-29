package com.google.android.material.internal;

import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class ToolbarUtils {
    private ToolbarUtils() {
    }

    public static View getSecondaryActionMenuItemView(Toolbar toolbar) {
        ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static ActionMenuView getActionMenuView(Toolbar toolbar) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(Toolbar toolbar) {
        if (toolbar.getChildCount() > 0) {
            View childAt = toolbar.getChildAt(0);
            if (childAt instanceof ImageButton) {
                return (ImageButton) childAt;
            }
            return null;
        }
        return null;
    }

    public static ActionMenuItemView getActionMenuItemView(Toolbar toolbar, int i2) {
        ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i3 = 0; i3 < actionMenuView.getChildCount(); i3++) {
                View childAt = actionMenuView.getChildAt(i3);
                if (childAt instanceof ActionMenuItemView) {
                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                    if (actionMenuItemView.getItemData().getItemId() == i2) {
                        return actionMenuItemView;
                    }
                }
            }
            return null;
        }
        return null;
    }
}