package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface RecognitionStatusListener {
    void onCardImageReceived(Bitmap bitmap);

    void onRecognitionComplete(RecognitionResult recognitionResult);
}