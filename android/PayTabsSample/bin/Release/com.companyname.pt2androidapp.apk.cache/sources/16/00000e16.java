package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.util.Locale;

/* loaded from: classes.dex */
class ProcessFrameThread extends Thread {
    private static final boolean DBG = Constants.DEBUG;
    private static final String TAG = "ProcessFrameThread";
    private boolean mActive;
    private final Callbacks mCallbacks;
    private final Camera mCamera;
    private final FpsCounter mDropFpsCounter;
    private final FpsCounter mFpsCounter;
    private int mFpsNo;
    private final Object mLock;
    private volatile byte[] mPendingFrameData;
    int mPredBorders;
    private final RecognitionCore mRecognitionCore;

    /* loaded from: classes.dex */
    public interface Callbacks {
        void onFpsReport(String str);

        void onFrameProcessed(int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActive(boolean z2) {
        synchronized (this.mLock) {
            if (z2 != this.mActive) {
                this.mActive = z2;
                if (!z2) {
                    this.mLock.notifyAll();
                } else if (this.mPendingFrameData != null) {
                    this.mLock.notifyAll();
                }
            }
        }
    }

    public void processFrame(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalStateException();
        }
        synchronized (this.mLock) {
            if (this.mPendingFrameData != null) {
                this.mCamera.addCallbackBuffer(this.mPendingFrameData);
                this.mPendingFrameData = null;
                if (DBG) {
                    tickDropFps();
                }
            }
            this.mPendingFrameData = bArr;
            this.mLock.notifyAll();
        }
    }

    public ProcessFrameThread(Context context, Camera camera, Callbacks callbacks) {
        super(TAG);
        this.mLock = new Object();
        this.mActive = true;
        this.mPredBorders = 0;
        this.mRecognitionCore = RecognitionCore.getInstance(context);
        this.mCamera = camera;
        this.mCallbacks = callbacks;
        if (DBG) {
            this.mFpsCounter = new FpsCounter();
            this.mDropFpsCounter = new FpsCounter();
            return;
        }
        this.mFpsCounter = null;
        this.mDropFpsCounter = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (DBG) {
            Log.d(TAG, "Thread started. TID: " + Thread.currentThread().getId());
        }
        while (true) {
            synchronized (this.mLock) {
                if (this.mPendingFrameData == null) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e2) {
                        if (DBG) {
                            Log.d(TAG, "Frame processing loop terminated.", e2);
                        }
                    }
                }
                if (!this.mActive) {
                    break;
                }
                byte[] bArr = this.mPendingFrameData;
                this.mPendingFrameData = null;
                boolean z2 = DBG;
                if (z2) {
                    tickFps(bArr);
                }
                if (bArr == null) {
                    if (z2) {
                        Log.e(TAG, "data is null");
                    }
                    throw null;
                }
                int processFrameYV12 = this.mRecognitionCore.processFrameYV12(1280, 720, bArr);
                if (processFrameYV12 != this.mPredBorders) {
                    this.mPredBorders = processFrameYV12;
                }
                if (!this.mActive) {
                    break;
                }
                this.mCamera.addCallbackBuffer(bArr);
                this.mCallbacks.onFrameProcessed(processFrameYV12);
            }
        }
        if (DBG) {
            Log.d(TAG, "Thread finished. TID: " + Thread.currentThread().getId());
        }
    }

    private void tickFps(byte[] bArr) {
        this.mFpsCounter.tickFPS();
        this.mDropFpsCounter.update();
        nextFps();
        if (this.mFpsNo == 1 && DBG) {
            Log.d(TAG, "onPreviewFrame() called with: data.length: " + bArr.length + "; thread: " + Thread.currentThread() + "; ");
        }
    }

    private void tickDropFps() {
        this.mDropFpsCounter.tickFPS();
        nextFps();
    }

    private void nextFps() {
        int i2 = this.mFpsNo + 1;
        this.mFpsNo = i2;
        if (i2 == 1) {
            this.mFpsCounter.setUpdateFPSFrames(50);
            this.mDropFpsCounter.setUpdateFPSFrames(50);
        } else if (DBG && i2 % 20 == 0) {
            this.mCallbacks.onFpsReport(String.format(Locale.US, "%s dropped: %.1f fps", this.mFpsCounter.toString(), Float.valueOf(this.mDropFpsCounter.getLastFPS())));
        }
    }
}