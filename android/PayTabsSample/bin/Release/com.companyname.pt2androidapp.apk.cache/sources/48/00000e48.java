package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.graphics.Rect;

/* loaded from: classes.dex */
public interface RecognitionCoreImpl {
    Rect getCardFrameRect();

    boolean isIdle();

    int processFrameYV12(int i2, int i3, byte[] bArr);

    void resetResult();

    void setDisplayConfiguration(DisplayConfiguration displayConfiguration);

    void setIdle(boolean z2);

    void setRecognitionMode(int i2);

    void setStatusListener(RecognitionStatusListener recognitionStatusListener);

    void setTorchListener(TorchStatusListener torchStatusListener);

    void setTorchStatus(boolean z2);
}