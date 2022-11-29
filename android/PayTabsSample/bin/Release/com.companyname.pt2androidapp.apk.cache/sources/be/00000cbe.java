package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonth(Context context, long j2) {
        return DateUtils.formatDateTime(context, j2 - TimeZone.getDefault().getOffset(j2), 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonthDay(long j2) {
        return getYearMonthDay(j2, Locale.getDefault());
    }

    static String getYearMonthDay(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j2));
        }
        return UtcDates.getMediumFormat(locale).format(new Date(j2));
    }

    static String getMonthDay(long j2) {
        return getMonthDay(j2, Locale.getDefault());
    }

    static String getMonthDay(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j2));
        }
        return UtcDates.getMediumNoYear(locale).format(new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMonthDayOfWeekDay(long j2) {
        return getMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j2));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonthDayOfWeekDay(long j2) {
        return getYearMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j2));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getDateString(long j2) {
        return getDateString(j2, null);
    }

    static String getDateString(long j2, SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j2);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j2));
        }
        if (todayCalendar.get(1) == utcCalendar.get(1)) {
            return getMonthDay(j2);
        }
        return getYearMonthDay(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<String, String> getDateRangeString(Long l2, Long l3) {
        return getDateRangeString(l2, l3, null);
    }

    static Pair<String, String> getDateRangeString(Long l2, Long l3, SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return Pair.create(null, null);
        }
        if (l2 == null) {
            return Pair.create(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return Pair.create(getDateString(l2.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l2.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        } else if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault()));
            }
            return Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
        } else {
            return Pair.create(getYearMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
        }
    }
}