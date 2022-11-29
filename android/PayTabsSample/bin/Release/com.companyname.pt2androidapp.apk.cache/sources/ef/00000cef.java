package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    private final Long fixedTimeMs;
    private final TimeZone fixedTimeZone;

    private TimeSource(Long l2, TimeZone timeZone) {
        this.fixedTimeMs = l2;
        this.fixedTimeZone = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    static TimeSource fixed(long j2, TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j2), timeZone);
    }

    static TimeSource fixed(long j2) {
        return new TimeSource(Long.valueOf(j2), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    Calendar now(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.fixedTimeMs;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }
}