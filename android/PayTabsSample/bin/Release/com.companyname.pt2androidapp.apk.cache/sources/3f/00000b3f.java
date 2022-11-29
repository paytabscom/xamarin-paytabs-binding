package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE;
    private static final int NARROW_FORMAT = 4;
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    static {
        CALENDAR_DAY_STYLE = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = utcCalendar.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public Integer getItem(int i2) {
        if (i2 >= this.daysInWeek) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(i2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.daysInWeek;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.calendar.set(7, positionToDayOfWeek(i2));
        textView.setText(this.calendar.getDisplayName(7, CALENDAR_DAY_STYLE, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    private int positionToDayOfWeek(int i2) {
        int i3 = i2 + this.firstDayOfWeek;
        int i4 = this.daysInWeek;
        return i3 > i4 ? i3 - i4 : i3;
    }
}