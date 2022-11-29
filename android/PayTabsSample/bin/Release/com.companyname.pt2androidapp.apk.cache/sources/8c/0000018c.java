package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface MenuView {

    /* loaded from: classes.dex */
    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i2);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z2);

        void setChecked(boolean z2);

        void setEnabled(boolean z2);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z2, char c2);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(MenuBuilder menuBuilder);
}