package com.google.android.material.timepicker;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* loaded from: classes.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private TimeModel time;
    private TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = this.time.getHourForDisplay() * getDegreesPerHour();
        this.minuteRotation = this.time.minute * 6;
        setSelection(this.time.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    private String[] getHourClockValues() {
        return this.time.format == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    private int getDegreesPerHour() {
        return this.time.format == 1 ? 15 : 30;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f2, boolean z2) {
        if (this.broadcasting) {
            return;
        }
        int i2 = this.time.hour;
        int i3 = this.time.minute;
        int round = Math.round(f2);
        if (this.time.selection == 12) {
            this.time.setMinute((round + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            this.time.setHour((round + (getDegreesPerHour() / 2)) / getDegreesPerHour());
            this.hourRotation = this.time.getHourForDisplay() * getDegreesPerHour();
        }
        if (z2) {
            return;
        }
        updateTime();
        performHapticFeedback(i2, i3);
    }

    private void performHapticFeedback(int i2, int i3) {
        if (this.time.minute == i3 && this.time.hour == i2) {
            return;
        }
        this.timePickerView.performHapticFeedback(Build.VERSION.SDK_INT >= 21 ? 4 : 1);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i2) {
        setSelection(i2, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i2) {
        this.time.setPeriod(i2);
    }

    void setSelection(int i2, boolean z2) {
        boolean z3 = i2 == 12;
        this.timePickerView.setAnimateOnTouchUp(z3);
        this.time.selection = i2;
        this.timePickerView.setValues(z3 ? MINUTE_CLOCK_VALUES : getHourClockValues(), z3 ? R.string.material_minute_suffix : R.string.material_hour_suffix);
        this.timePickerView.setHandRotation(z3 ? this.minuteRotation : this.hourRotation, z2);
        this.timePickerView.setActiveSelection(i2);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_hour_selection));
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f2, boolean z2) {
        this.broadcasting = true;
        int i2 = this.time.minute;
        int i3 = this.time.hour;
        if (this.time.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            if (!((AccessibilityManager) ContextCompat.getSystemService(this.timePickerView.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                setSelection(12, true);
            }
        } else {
            int round = Math.round(f2);
            if (!z2) {
                this.time.setMinute(((round + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z2);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i3, i2);
    }

    private void updateTime() {
        this.timePickerView.updateTime(this.time.period, this.time.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(HOUR_CLOCK_24_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    private void updateValues(String[] strArr, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i2], str);
        }
    }
}