package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ListViewCompat {
    public static void scrollListBy(ListView listView, int i2) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i2);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
    }

    public static boolean canScrollList(ListView listView, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(i2);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i2 > 0) {
            return firstVisiblePosition + childCount < listView.getCount() || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight() - listView.getListPaddingBottom();
        }
        return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    private ListViewCompat() {
    }
}