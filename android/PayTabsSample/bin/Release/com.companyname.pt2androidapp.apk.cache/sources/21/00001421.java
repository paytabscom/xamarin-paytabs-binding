package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils;

import android.content.Context;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionAvailabilityChecker;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionCoreUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class PaycardsHelper {
    private static AtomicBoolean deployRecognitionCoreActive = new AtomicBoolean();

    public static boolean isScanCardSupported(Context context) {
        RecognitionAvailabilityChecker.Result doCheck = RecognitionAvailabilityChecker.doCheck(context);
        return doCheck.isPassed() || doCheck.isAdditionalCheckRequired() || doCheck.isFailedOnCameraPermission();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.PaycardsHelper$1] */
    public static void startDeployRecognitionCore(Context context) {
        if (RecognitionCoreUtils.isRecognitionCoreDeployRequired(context) && !deployRecognitionCoreActive.get()) {
            final Context applicationContext = context.getApplicationContext();
            new Thread() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.PaycardsHelper.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    if (PaycardsHelper.deployRecognitionCoreActive.compareAndSet(false, true)) {
                        RecognitionCoreUtils.deployRecognitionCoreSync(applicationContext);
                        PaycardsHelper.deployRecognitionCoreActive.set(true);
                    }
                }
            }.start();
        }
    }
}