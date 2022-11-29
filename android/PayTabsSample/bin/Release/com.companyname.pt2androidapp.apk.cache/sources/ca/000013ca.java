package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
public final class CameraConfigurationUtils {
    private static final boolean ENABLE_EXPOSURE = false;
    private static final boolean ENABLE_METERING = false;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final String TAG = "CameraConfig";
    private static final boolean DBG = Constants.DEBUG;
    private static final List<String> FOCUS_LIST = Arrays.asList("continuous-picture", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "macro", "edof");

    public static void setBestExposure(Camera.Parameters parameters, boolean z2) {
    }

    public static void setMetering(Camera.Parameters parameters) {
    }

    private CameraConfigurationUtils() {
    }

    static Camera createCamera() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 0) {
                return Camera.open(i2);
            }
        }
        if (numberOfCameras > 0) {
            return Camera.open(0);
        }
        return null;
    }

    static boolean isFlashSupported(Camera camera) {
        return camera.getParameters().getSupportedFlashModes() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setFlashLight(Camera camera, boolean z2) {
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            if (z2) {
                if (supportedFlashModes.contains("torch")) {
                    parameters.setFlashMode("torch");
                } else if (!supportedFlashModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                    return false;
                } else {
                    parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_ON);
                }
            } else {
                parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
        }
        setBestExposure(parameters, z2);
        camera.setParameters(parameters);
        return z2;
    }

    public static void initAutoFocus(Camera.Parameters parameters) {
        initAutoFocus(parameters, true);
    }

    public static void initAutoFocus(Camera.Parameters parameters, boolean z2) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList(FOCUS_LIST);
        if (!z2) {
            arrayList.remove("continuous-picture");
            arrayList.add("continuous-picture");
        }
        for (String str : arrayList) {
            if (supportedFocusModes.contains(str)) {
                parameters.setFocusMode(str);
                return;
            }
        }
    }

    public static void initWhiteBalance(Camera.Parameters parameters) {
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            return;
        }
        parameters.setWhiteBalance(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i(TAG, "Old focus areas: " + toString(parameters.getFocusAreas()));
            List<Camera.Area> buildCardArea = buildCardArea();
            Log.i(TAG, "Setting focus area to : " + toString(buildCardArea));
            parameters.setFocusAreas(buildCardArea);
            return;
        }
        Log.i(TAG, "Device does not support focus areas");
    }

    public static void setMeteringArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i(TAG, "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> buildCardArea = buildCardArea();
            Log.i(TAG, "Setting metering area to : " + toString(buildCardArea));
            parameters.setMeteringAreas(buildCardArea);
            return;
        }
        Log.i(TAG, "Device does not support metering areas");
    }

    private static List<Camera.Area> buildCardArea() {
        return Collections.singletonList(new Camera.Area(new Rect(-10, -10, 10, 10), 1));
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }
}