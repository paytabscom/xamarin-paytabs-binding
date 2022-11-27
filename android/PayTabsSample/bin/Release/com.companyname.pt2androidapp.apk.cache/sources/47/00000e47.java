package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.graphics.Rect;

/* loaded from: classes.dex */
class RecognitionCoreDummy implements RecognitionCoreImpl {
    private final Rect mCardFrameRect = new Rect(30, 432, 690, 848);

    public void deploy() {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public boolean isIdle() {
        return true;
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public int processFrameYV12(int i2, int i3, byte[] bArr) {
        return 0;
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void resetResult() {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setIdle(boolean z2) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setRecognitionMode(int i2) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setStatusListener(RecognitionStatusListener recognitionStatusListener) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setTorchListener(TorchStatusListener torchStatusListener) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public void setTorchStatus(boolean z2) {
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl
    public Rect getCardFrameRect() {
        return this.mCardFrameRect;
    }
}