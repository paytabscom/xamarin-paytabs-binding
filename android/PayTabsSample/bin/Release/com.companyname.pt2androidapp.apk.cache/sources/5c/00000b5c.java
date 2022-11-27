package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MonthAdapter extends BaseAdapter {
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final Month month;
    private Collection<Long> previouslySelectedDates;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    @Override // android.widget.Adapter
    public Long getItem(int i2) {
        if (i2 < this.month.daysFromStartOfWeekToFirstOfMonth() || i2 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i2)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.month.daysInWeek;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.month.daysInMonth + firstPositionInMonth();
    }

    @Override // android.widget.Adapter
    public TextView getView(int i2, View view, ViewGroup viewGroup) {
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int firstPositionInMonth = i2 - firstPositionInMonth();
        if (firstPositionInMonth < 0 || firstPositionInMonth >= this.month.daysInMonth) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i3 = firstPositionInMonth + 1;
            textView.setTag(this.month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i3)));
            long day = this.month.getDay(i3);
            if (this.month.year == Month.current().year) {
                textView.setContentDescription(DateStrings.getMonthDayOfWeekDay(day));
            } else {
                textView.setContentDescription(DateStrings.getYearMonthDayOfWeekDay(day));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue());
        return textView;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l2 : this.previouslySelectedDates) {
            updateSelectedStateForDate(materialCalendarGridView, l2.longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            for (Long l3 : dateSelector.getSelectedDays()) {
                updateSelectedStateForDate(materialCalendarGridView, l3.longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.create(j2).equals(this.month)) {
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().dayToPosition(this.month.getDayOfMonth(j2)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    private void updateSelectedState(TextView textView, long j2) {
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        if (this.calendarConstraints.getDateValidator().isValid(j2)) {
            textView.setEnabled(true);
            if (isSelected(j2)) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else if (UtcDates.getTodayCalendar().getTimeInMillis() == j2) {
                calendarItemStyle = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle = this.calendarStyle.day;
            }
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        calendarItemStyle.styleItem(textView);
    }

    private boolean isSelected(long j2) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j2) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lastPositionInMonth() {
        return (this.month.daysFromStartOfWeekToFirstOfMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i2) {
        return (i2 - this.month.daysFromStartOfWeekToFirstOfMonth()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int dayToPosition(int i2) {
        return firstPositionInMonth() + (i2 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean withinMonth(int i2) {
        return i2 >= firstPositionInMonth() && i2 <= lastPositionInMonth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFirstInRow(int i2) {
        return i2 % this.month.daysInWeek == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLastInRow(int i2) {
        return (i2 + 1) % this.month.daysInWeek == 0;
    }
}