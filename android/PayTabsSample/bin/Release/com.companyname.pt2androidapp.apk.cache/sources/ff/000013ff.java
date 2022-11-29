package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RecognitionConstants {
    public static final int DETECTED_BORDER_BOTTOM = 2;
    public static final int DETECTED_BORDER_LEFT = 4;
    public static final int DETECTED_BORDER_RIGHT = 8;
    public static final int DETECTED_BORDER_TOP = 1;
    public static final int RECOGNIZER_MODE_DATE = 2;
    public static final int RECOGNIZER_MODE_GRAB_CARD_IMAGE = 8;
    public static final int RECOGNIZER_MODE_NAME = 4;
    public static final int RECOGNIZER_MODE_NUMBER = 1;
    static final int WORK_AREA_ORIENTATION_LANDSCAPE_LEFT = 4;
    static final int WORK_AREA_ORIENTATION_LANDSCAPE_RIGHT = 3;
    static final int WORK_AREA_ORIENTATION_PORTAIT = 1;
    static final int WORK_AREA_ORIENTATION_PORTAIT_UPSIDE_DOWN = 2;
    static final int WORK_AREA_ORIENTATION_UNKNOWN = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DetectedBorderFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RecognitionMode {
    }

    private RecognitionConstants() {
    }
}