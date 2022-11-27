package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

/* loaded from: classes.dex */
public final class RecognitionUnavailableException extends Exception {
    public static final int ERROR_CAMERA_NOT_SUPPORTED = 3;
    public static final int ERROR_NO_CAMERA = 1;
    public static final int ERROR_NO_CAMERA_PERMISSION = 4;
    public static final int ERROR_OLD_DEVICE = 2;
    public static final int ERROR_OTHER = 0;
    public static final int ERROR_UNSUPPORTED_ARCHITECTURE = 5;
    public final int errorCode;

    public RecognitionUnavailableException() {
        this.errorCode = 0;
    }

    public RecognitionUnavailableException(int i2) {
        this.errorCode = i2;
    }

    public RecognitionUnavailableException(String str) {
        super(str);
        this.errorCode = 0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i2 = this.errorCode;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.getMessage() : "Unsupported architecture" : "No camera permission" : "Camera not supported" : "Device is considered being too old for smooth camera experience, so camera will not be used." : "No camera";
    }
}