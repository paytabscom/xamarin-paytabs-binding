package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.content.ContextCompat;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;
import com.facebook.device.yearclass.YearClass;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import java.util.Locale;

/* loaded from: classes.dex */
public final class RecognitionAvailabilityChecker {
    private static final boolean DBG = BuildConfig.DEBUG;
    public static final String TAG = "CameraChecker";

    public static Result doCheck(Context context) {
        return doCheckInternal(context).build();
    }

    public static Result doCheckBlocking(Context context) {
        RecognitionCheckResultBuilder doCheckInternal = doCheckInternal(context);
        Result build = doCheckInternal.build();
        if (doCheckInternal.build().isAdditionalCheckRequired()) {
            doCheckInternal.isBlockingCheck(true);
            doCheckInternal.recognitionCoreSupported(RecognitionCore.getInstance(context).isDeviceSupported());
            if (doCheckInternal.recognitionCoreSupported == -1) {
                return doCheckInternal.build();
            }
            doCheckInternal.isCameraSupported(CameraUtils.isCameraSupportedBlocking());
            return doCheckInternal.build();
        }
        return build;
    }

    private static RecognitionCheckResultBuilder doCheckInternal(Context context) {
        RecognitionCheckResultBuilder hasCameraPermission = new RecognitionCheckResultBuilder().isBlockingCheck(false).isDeviceNewEnough(isDeviceNewEnough(context)).hasCamera(isDeviceHasCamera(context)).hasCameraPermission(ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0);
        try {
            hasCameraPermission.isCameraSupported(CameraUtils.isCameraSupported());
        } catch (BlockingOperationException unused) {
        }
        if (RecognitionCore.isInitialized()) {
            hasCameraPermission.recognitionCoreSupported(RecognitionCore.getInstance(context).isDeviceSupported());
        }
        return hasCameraPermission;
    }

    public static boolean isDeviceNewEnough(Context context) {
        int i2 = YearClass.get(context);
        if (DBG) {
            Log.d(TAG, "Device year is: " + i2);
        }
        return i2 >= 2011;
    }

    public static boolean isDeviceHasCamera(Context context) {
        PackageManager packageManager = context.getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        packageManager.hasSystemFeature("android.hardware.camera.autofocus");
        return hasSystemFeature;
    }

    /* loaded from: classes.dex */
    public static class Result {
        public static final int STATUS_FAILED = -1;
        public static final int STATUS_NOT_CHECKED = 0;
        public static final int STATUS_PASSED = 1;
        public final int hasCamera;
        public final int hasCameraPermission;
        public final boolean isBlockingCheck;
        public final int isCameraSupported;
        public final int isDeviceNewEnough;
        public final int recognitionCoreSupported;

        Result(boolean z2, int i2, int i3, int i4, int i5, int i6) {
            this.isBlockingCheck = z2;
            this.isDeviceNewEnough = i2;
            this.recognitionCoreSupported = i3;
            this.hasCamera = i4;
            this.hasCameraPermission = i5;
            this.isCameraSupported = i6;
        }

        private boolean isFailedNonBlocking() {
            return this.isDeviceNewEnough == -1 || this.recognitionCoreSupported == -1 || this.hasCamera == -1 || this.hasCameraPermission == -1 || this.isCameraSupported == -1;
        }

        public boolean isFailed() {
            if (this.isBlockingCheck) {
                return !isPassed();
            }
            return isFailedNonBlocking();
        }

        public boolean isPassed() {
            return this.isDeviceNewEnough == 1 && this.recognitionCoreSupported == 1 && this.hasCamera == 1 && this.hasCameraPermission == 1 && this.isCameraSupported == 1;
        }

        public boolean isAdditionalCheckRequired() {
            return (isFailed() || isPassed()) ? false : true;
        }

        public boolean isFailedOnCameraPermission() {
            return (this.hasCameraPermission != -1 || this.isDeviceNewEnough == -1 || this.recognitionCoreSupported == -1 || this.hasCamera == -1 || this.isCameraSupported == -1) ? false : true;
        }

        private String statusToString(int i2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 == 1) {
                        return "yes";
                    }
                    throw new IllegalArgumentException();
                }
                return "not checked";
            }
            return "no";
        }

        public String getMessage() {
            return this.isDeviceNewEnough == -1 ? "Device is considered being too old for smooth camera experience, so camera will not be used." : this.hasCamera == -1 ? "No camera" : this.hasCameraPermission == -1 ? "No camera permission" : this.isCameraSupported == -1 ? "Camera not supported" : this.recognitionCoreSupported == -1 ? "Unsupported architecture" : toString();
        }

        public String toString() {
            return String.format(Locale.US, "Is new enough: %s, has camera: %s, has camera persmission: %s, recognition library supported: %s, camera supported: %s", statusToString(this.isDeviceNewEnough), statusToString(this.hasCamera), statusToString(this.hasCameraPermission), statusToString(this.recognitionCoreSupported), statusToString(this.isCameraSupported));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class RecognitionCheckResultBuilder {
        private boolean isBlockingCheck = true;
        private int hasCameraPermission = 0;
        private int isDeviceNewEnough = 0;
        private int recognitionCoreSupported = 0;
        private int hasCamera = 0;
        private int isCameraSupported = 0;

        private int toStatus(boolean z2) {
            return z2 ? 1 : -1;
        }

        public RecognitionCheckResultBuilder isBlockingCheck(boolean z2) {
            this.isBlockingCheck = z2;
            return this;
        }

        public RecognitionCheckResultBuilder isDeviceNewEnough(boolean z2) {
            this.isDeviceNewEnough = toStatus(z2);
            return this;
        }

        public RecognitionCheckResultBuilder recognitionCoreSupported(boolean z2) {
            this.recognitionCoreSupported = toStatus(z2);
            return this;
        }

        public RecognitionCheckResultBuilder hasCamera(boolean z2) {
            this.hasCamera = toStatus(z2);
            return this;
        }

        public RecognitionCheckResultBuilder hasCameraPermission(boolean z2) {
            this.hasCameraPermission = toStatus(z2);
            return this;
        }

        public RecognitionCheckResultBuilder isCameraSupported(boolean z2) {
            this.isCameraSupported = toStatus(z2);
            return this;
        }

        public Result build() {
            return new Result(this.isBlockingCheck, this.isDeviceNewEnough, this.recognitionCoreSupported, this.hasCamera, this.hasCameraPermission, this.isCameraSupported);
        }
    }
}