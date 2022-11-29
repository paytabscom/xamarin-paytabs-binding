package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RecognitionCoreNdk implements RecognitionCoreImpl {
    private static final int MESSAGE_CARD_IMAGE_RECEIVED = 2;
    private static final int MESSAGE_RESULT_RECEIVED = 1;
    private static volatile RecognitionCoreNdk sInstance;
    private final Context mAppContext;
    private final Rect mCardFrameRect = new Rect(30, 432, 690, 848);
    private DisplayConfiguration mDisplayConfiguration = new DisplayConfigurationImpl();
    private final Handler mMainThreadHandler;
    private RecognitionStatusListener mStatusListener;
    private TorchStatusListenerHandler mTorchStatusListener;

    static native void nativeDestroy();

    static native void nativeInit();

    native void nativeCalcWorkingArea(int i2, int i3, int i4, Rect rect);

    native void nativeDeploy();

    native boolean nativeIsIdle();

    native int nativeProcessFrameYV12(int i2, int i3, int i4, byte[] bArr);

    native void nativeResetResult();

    native void nativeSetDataPath(String str);

    native void nativeSetIdle(boolean z2);

    native void nativeSetOrientation(int i2);

    native void nativeSetRecognitionMode(int i2);

    native void nativeSetTorchStatus(boolean z2);

    public static RecognitionCoreNdk getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new RecognitionCoreNdk(context.getApplicationContext());
        }
        return sInstance;
    }

    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary(Constants.ASSETS_DIR);
    }

    private RecognitionCoreNdk(Context context) {
        nativeInit();
        this.mAppContext = context.getApplicationContext();
        try {
            deploy();
        } catch (IOException e2) {
            Log.e("CardRecognizerCore", "initialization failed", e2);
        }
        this.mMainThreadHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreNdk.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    if (RecognitionCoreNdk.this.mStatusListener != null) {
                        RecognitionCoreNdk.this.mStatusListener.onRecognitionComplete((RecognitionResult) message.obj);
                    }
                    return true;
                } else if (i2 != 2) {
                    return false;
                } else {
                    if (RecognitionCoreNdk.this.mStatusListener != null) {
                        RecognitionCoreNdk.this.mStatusListener.onCardImageReceived((Bitmap) message.obj);
                    }
                    return true;
                }
            }
        });
    }

    /* loaded from: classes.dex */
    private static class TorchStatusListenerHandler extends Handler {
        private static final int MESSAGE_TORCH_STATUS_CHANGED = 3;
        private final TorchStatusListener mListener;

        public TorchStatusListenerHandler(Looper looper, TorchStatusListener torchStatusListener) {
            super(looper);
            this.mListener = torchStatusListener;
        }

        public TorchStatusListenerHandler(TorchStatusListener torchStatusListener) {
            this.mListener = torchStatusListener;
        }

        public void sendStatusChanged(boolean z2) {
            removeMessages(3);
            sendMessage(Message.obtain(this, 3, z2 ? 1 : 0, 0));
        }

        public void stop() {
            removeMessages(3);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 3) {
                this.mListener.onTorchStatusChanged(message.arg1 != 0);
            }
            super.handleMessage(message);
        }
    }

    public void deploy() throws IOException {
        NeuroDataHelper neuroDataHelper = new NeuroDataHelper(this.mAppContext);
        neuroDataHelper.unpackAssets();
        nativeSetDataPath(neuroDataHelper.getDataBasePath().getAbsolutePath());
        nativeDeploy();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setStatusListener(RecognitionStatusListener recognitionStatusListener) {
        this.mStatusListener = recognitionStatusListener;
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setTorchStatus(boolean z2) {
        nativeSetTorchStatus(z2);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setTorchListener(TorchStatusListener torchStatusListener) {
        synchronized (this) {
            TorchStatusListenerHandler torchStatusListenerHandler = this.mTorchStatusListener;
            if (torchStatusListenerHandler == null || torchStatusListenerHandler.mListener != torchStatusListener) {
                TorchStatusListenerHandler torchStatusListenerHandler2 = this.mTorchStatusListener;
                if (torchStatusListenerHandler2 != null) {
                    torchStatusListenerHandler2.stop();
                    this.mTorchStatusListener = null;
                }
                if (torchStatusListener != null) {
                    this.mTorchStatusListener = new TorchStatusListenerHandler(Looper.myLooper(), torchStatusListener);
                }
            }
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public synchronized void setRecognitionMode(int i2) {
        nativeSetRecognitionMode(i2);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public synchronized void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        this.mDisplayConfiguration = displayConfiguration;
        nativeSetOrientation(displayConfiguration.getNativeDisplayRotation());
        nativeCalcWorkingArea(1280, 720, 32, this.mCardFrameRect);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public Rect getCardFrameRect() {
        return this.mCardFrameRect;
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public synchronized int processFrameYV12(int i2, int i3, byte[] bArr) {
        int preprocessFrameRotation = this.mDisplayConfiguration.getPreprocessFrameRotation(i2, i3);
        if (preprocessFrameRotation == -1) {
            return 0;
        }
        return nativeProcessFrameYV12(i2, i3, preprocessFrameRotation, bArr);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void resetResult() {
        nativeResetResult();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setIdle(boolean z2) {
        nativeSetIdle(z2);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public boolean isIdle() {
        return nativeIsIdle();
    }

    private static void onRecognitionResultReceived(boolean z2, boolean z3, String str, String str2, String str3, String str4, Bitmap bitmap, int i2, int i3, int i4, int i5) {
        if (sInstance == null) {
            return;
        }
        Message.obtain(sInstance.mMainThreadHandler, 1, new RecognitionResult.Builder().setIsFirst(z2).setIsFinal(z3).setNumber(str).setName(str3).setDate(str2).setNameRaw(str4).setNumberImageRect((i4 == 0 || i5 == 0) ? null : new Rect(i2, i3, i4 + i2, i5 + i3)).setCardImage(bitmap).build()).sendToTarget();
    }

    private static void onCardImageReceived(Bitmap bitmap) {
        Message.obtain(sInstance.mMainThreadHandler, 2, bitmap).sendToTarget();
    }

    private static void onTorchStatusChanged(boolean z2) {
        synchronized (RecognitionCoreNdk.class) {
            if (sInstance == null) {
                return;
            }
            synchronized (sInstance) {
                if (sInstance.mTorchStatusListener != null) {
                    sInstance.mTorchStatusListener.sendStatusChanged(z2);
                }
            }
        }
    }

    protected void finalize() throws Throwable {
        nativeDestroy();
        super.finalize();
    }
}