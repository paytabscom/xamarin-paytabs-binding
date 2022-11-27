package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ScanManagerHandler extends Handler {
    private static final boolean DBG = Constants.DEBUG;
    private static final int MSG_SEND_AUTO_FOCUS_COMPLETE = 7;
    private static final int MSG_SEND_AUTO_FOCUS_MOVING = 6;
    private static final int MSG_SEND_CAMERA_OPENED = 3;
    private static final int MSG_SEND_FPS_REPORT = 5;
    private static final int MSG_SEND_NEW_BORDERS = 4;
    private static final int MSG_SEND_OPEN_CAMERA_ERROR = 1;
    private static final int MSG_SEND_RENDER_THREAD_ERROR = 2;
    private static final String TAG = "ScanManagerHandler";
    private WeakReference<ScanManager> mWeakScanManager;

    public ScanManagerHandler(ScanManager scanManager) {
        this.mWeakScanManager = new WeakReference<>(scanManager);
    }

    public void sendOpenCameraError(Exception exc) {
        sendMessage(obtainMessage(1, exc));
    }

    public void sendRenderThreadError(Throwable th) {
        sendMessage(obtainMessage(2, th));
    }

    public void sendCameraOpened(Camera.Parameters parameters) {
        sendMessage(obtainMessage(3, parameters));
    }

    public void sendFrameProcessed(int i2) {
        sendMessage(obtainMessage(4, i2, 0));
    }

    public void sendFpsResport(String str) {
        sendMessage(obtainMessage(5, str));
    }

    public void sendAutoFocusMoving(boolean z2, String str) {
        sendMessage(obtainMessage(6, z2 ? 1 : 0, 0, str));
    }

    public void sendAutoFocusComplete(boolean z2, String str) {
        sendMessage(obtainMessage(7, z2 ? 1 : 0, 0, str));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ScanManager scanManager = this.mWeakScanManager.get();
        if (scanManager == null) {
            if (DBG) {
                Log.d(TAG, "Got message for dead activity");
                return;
            }
            return;
        }
        switch (message.what) {
            case 1:
                scanManager.onOpenCameraError((Exception) message.obj);
                return;
            case 2:
                scanManager.onRenderThreadError((Throwable) message.obj);
                return;
            case 3:
                scanManager.onCameraOpened((Camera.Parameters) message.obj);
                return;
            case 4:
                scanManager.onFrameProcessed(message.arg1);
                return;
            case 5:
                scanManager.onFpsReport((String) message.obj);
                return;
            case 6:
                scanManager.onAutoFocusMoving(message.arg1 != 0, (String) message.obj);
                return;
            case 7:
                scanManager.onAutoFocusComplete(message.arg1 != 0, (String) message.obj);
                return;
            default:
                throw new RuntimeException("Unknown message " + message.what);
        }
    }
}