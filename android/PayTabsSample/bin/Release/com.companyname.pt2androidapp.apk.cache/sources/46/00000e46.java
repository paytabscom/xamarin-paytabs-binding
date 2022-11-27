package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class RecognitionCore {
    private static volatile RecognitionCoreImpl sImpl = new RecognitionCoreDummy();
    private static volatile RecognitionCore sInstance;

    public static RecognitionCore getInstance(Context context) {
        try {
            deploy(context);
        } catch (IOException | UnsatisfiedLinkError e2) {
            Log.e("RecognitionCore", "initialization failed", e2);
        }
        return sInstance;
    }

    public static void deploy(Context context) throws IOException, UnsatisfiedLinkError {
        if (sInstance == null) {
            synchronized (RecognitionCore.class) {
                if (sInstance == null) {
                    RecognitionCoreNdk recognitionCoreNdk = RecognitionCoreNdk.getInstance(context.getApplicationContext());
                    recognitionCoreNdk.deploy();
                    sImpl = recognitionCoreNdk;
                    sInstance = new RecognitionCore();
                }
            }
        }
    }

    public static boolean isInitialized() {
        boolean z2;
        synchronized (RecognitionCore.class) {
            z2 = sInstance != null;
        }
        return z2;
    }

    public boolean isDeviceSupported() {
        return !(sImpl instanceof RecognitionCoreDummy);
    }

    public void setStatusListener(RecognitionStatusListener recognitionStatusListener) {
        sImpl.setStatusListener(recognitionStatusListener);
    }

    public void setTorchStatus(boolean z2) {
        sImpl.setTorchStatus(z2);
    }

    public void setTorchListener(TorchStatusListener torchStatusListener) {
        sImpl.setTorchListener(torchStatusListener);
    }

    public void setRecognitionMode(int i2) {
        sImpl.setRecognitionMode(i2);
    }

    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        sImpl.setDisplayConfiguration(displayConfiguration);
    }

    public Rect getCardFrameRect() {
        return sImpl.getCardFrameRect();
    }

    public int processFrameYV12(int i2, int i3, byte[] bArr) {
        return sImpl.processFrameYV12(i2, i3, bArr);
    }

    public void resetResult() {
        sImpl.resetResult();
    }

    public void setIdle(boolean z2) {
        sImpl.setIdle(z2);
    }

    public boolean isIdle() {
        return sImpl.isIdle();
    }
}