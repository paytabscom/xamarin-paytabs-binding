package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.hardware.Camera;
import android.text.TextUtils;
import android.view.Display;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CameraUtils {
    public static final NativeSupportedSize CAMERA_RESOLUTION = NativeSupportedSize.RESOLUTION_1280_X_720;
    private static NativeSupportedSize sBestCameraPreviewSize;

    public static boolean isCameraSupported() throws BlockingOperationException {
        NativeSupportedSize nativeSupportedSize = sBestCameraPreviewSize;
        if (nativeSupportedSize != null) {
            return nativeSupportedSize != NativeSupportedSize.RESOLUTION_NO_CAMERA;
        }
        throw new BlockingOperationException();
    }

    public static boolean isCameraSupportedBlocking() {
        try {
            return isCameraSupported();
        } catch (BlockingOperationException unused) {
            generateBestCameraPreviewSize();
            return (sBestCameraPreviewSize == null || sBestCameraPreviewSize == NativeSupportedSize.RESOLUTION_NO_CAMERA) ? false : true;
        }
    }

    public static NativeSupportedSize findBestCameraSupportedSize(Iterable<Camera.Size> iterable) {
        NativeSupportedSize nativeSupportedSize = NativeSupportedSize.RESOLUTION_NO_CAMERA;
        if (iterable == null) {
            return NativeSupportedSize.RESOLUTION_NO_CAMERA;
        }
        for (Camera.Size size : iterable) {
            NativeSupportedSize[] values = NativeSupportedSize.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    NativeSupportedSize nativeSupportedSize2 = values[i2];
                    if (size.width != nativeSupportedSize2.size.width || size.height != nativeSupportedSize2.size.height) {
                        i2++;
                    } else if (nativeSupportedSize2.compareTo(nativeSupportedSize) < 0) {
                        nativeSupportedSize = nativeSupportedSize2;
                    }
                }
            }
        }
        return nativeSupportedSize;
    }

    public static void generateBestCameraPreviewSize() {
        if (sBestCameraPreviewSize == null) {
            try {
                Camera open = Camera.open();
                if (open != null) {
                    generateBestCameraPreviewSize(open, open.getParameters().getSupportedPreviewSizes());
                    open.release();
                }
            } catch (Exception unused) {
            }
        }
    }

    static void generateBestCameraPreviewSize(Camera camera, Iterable<Camera.Size> iterable) {
        NativeSupportedSize[] values;
        if (iterable == null) {
            sBestCameraPreviewSize = NativeSupportedSize.RESOLUTION_NO_CAMERA;
            return;
        }
        NativeSupportedSize findBestCameraSupportedSize = findBestCameraSupportedSize(iterable);
        sBestCameraPreviewSize = findBestCameraSupportedSize;
        if (findBestCameraSupportedSize == NativeSupportedSize.RESOLUTION_NO_CAMERA) {
            for (NativeSupportedSize nativeSupportedSize : NativeSupportedSize.values()) {
                if (tryToSetCameraSize(camera, nativeSupportedSize)) {
                    sBestCameraPreviewSize = nativeSupportedSize;
                    return;
                }
            }
            sBestCameraPreviewSize = NativeSupportedSize.RESOLUTION_NO_CAMERA;
        }
    }

    private static boolean tryToSetCameraSize(Camera camera, NativeSupportedSize nativeSupportedSize) {
        if (camera == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(nativeSupportedSize.size.width, nativeSupportedSize.size.height);
        try {
            camera.setParameters(parameters);
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            if (previewSize.width != nativeSupportedSize.size.width) {
                if (previewSize.height != nativeSupportedSize.size.height) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getSupportedSizesDescription(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(String.format(Locale.US, "[%dx%d]", Integer.valueOf(size.width), Integer.valueOf(size.height)));
        }
        return TextUtils.join(", ", arrayList);
    }

    public static Camera.CameraInfo getBackCameraInfo() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 0) {
                return cameraInfo;
            }
        }
        return null;
    }

    public static int getBackCameraSensorOrientation() {
        Camera.CameraInfo backCameraInfo = getBackCameraInfo();
        if (backCameraInfo == null) {
            return 0;
        }
        return backCameraInfo.orientation;
    }

    public static int getBackCameraDataRotation(Display display) {
        return getCameraDataRotation(display, getBackCameraInfo());
    }

    private static int getCameraDataRotation(Display display, Camera.CameraInfo cameraInfo) {
        int displayRotationDegrees = OrientationHelper.getDisplayRotationDegrees(display);
        if (cameraInfo == null) {
            return 0;
        }
        return OrientationHelper.getCameraRotationToNatural(displayRotationDegrees, cameraInfo.orientation, cameraInfo.facing == 1);
    }

    /* loaded from: classes.dex */
    public enum NativeSupportedSize {
        RESOLUTION_1280_X_720(1280, 720),
        RESOLUTION_NO_CAMERA(-1, -1);
        
        public final Size size;

        NativeSupportedSize(int i2, int i3) {
            this.size = new Size(i2, i3);
        }
    }
}