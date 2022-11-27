package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter2().firstPositionInMonth()) {
            super.setSelection(getAdapter2().firstPositionInMonth());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (super.onKeyDown(i2, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().firstPositionInMonth()) {
                return true;
            }
            if (19 == i2) {
                setSelection(getAdapter2().firstPositionInMonth());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter */
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int width;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.dateSelector;
        CalendarStyle calendarStyle = adapter2.calendarStyle;
        Long item = adapter2.getItem(adapter2.firstPositionInMonth());
        Long item2 = adapter2.getItem(adapter2.lastPositionInMonth());
        for (Pair<Long, Long> pair : dateSelector.getSelectedRanges()) {
            if (pair.first != null) {
                if (pair.second != null) {
                    long longValue = pair.first.longValue();
                    long longValue2 = pair.second.longValue();
                    if (!skipMonth(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            dayToPosition = adapter2.firstPositionInMonth();
                            if (adapter2.isFirstInRow(dayToPosition)) {
                                horizontalMidPoint = 0;
                            } else if (!isLayoutRtl) {
                                horizontalMidPoint = materialCalendarGridView.getChildAt(dayToPosition - 1).getRight();
                            } else {
                                horizontalMidPoint = materialCalendarGridView.getChildAt(dayToPosition - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            dayToPosition = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition));
                        }
                        if (longValue2 > item2.longValue()) {
                            dayToPosition2 = Math.min(adapter2.lastPositionInMonth(), getChildCount() - 1);
                            if (adapter2.isLastInRow(dayToPosition2)) {
                                horizontalMidPoint2 = getWidth();
                            } else if (!isLayoutRtl) {
                                horizontalMidPoint2 = materialCalendarGridView.getChildAt(dayToPosition2).getRight();
                            } else {
                                horizontalMidPoint2 = materialCalendarGridView.getChildAt(dayToPosition2).getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            dayToPosition2 = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition2));
                        }
                        int itemId = (int) adapter2.getItemId(dayToPosition);
                        int itemId2 = (int) adapter2.getItemId(dayToPosition2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + calendarStyle.day.getTopInset();
                            int bottom = childAt.getBottom() - calendarStyle.day.getBottomInset();
                            if (!isLayoutRtl) {
                                i2 = numColumns > dayToPosition ? 0 : horizontalMidPoint;
                                width = dayToPosition2 > numColumns2 ? getWidth() : horizontalMidPoint2;
                            } else {
                                int i3 = dayToPosition2 > numColumns2 ? 0 : horizontalMidPoint2;
                                width = numColumns > dayToPosition ? getWidth() : horizontalMidPoint;
                                i2 = i3;
                            }
                            canvas.drawRect(i2, top, width, bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.nestedScrollable) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (z2) {
            gainFocus(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    private void gainFocus(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter2().lastPositionInMonth());
        } else if (i2 == 130) {
            setSelection(getAdapter2().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    private static boolean skipMonth(Long l2, Long l3, Long l4, Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    private static int horizontalMidPoint(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}