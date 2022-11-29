package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionAvailabilityChecker;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class RecognitionCoreUtils {
    private static AtomicBoolean deployRecognitionCoreActive = new AtomicBoolean();

    private RecognitionCoreUtils() {
    }

    public static boolean isRecognitionCoreDeployRequired(Context context) {
        return RecognitionAvailabilityChecker.isDeviceHasCamera(context) && RecognitionAvailabilityChecker.isDeviceNewEnough(context) && !RecognitionCore.isInitialized();
    }

    public static void deployRecognitionCoreSync(Context context) {
        if (isRecognitionCoreDeployRequired(context)) {
            try {
                RecognitionCore.deploy(context);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionCoreUtils$1] */
    public static void startDeployRecognitionCore(Context context) {
        if (isRecognitionCoreDeployRequired(context) && !deployRecognitionCoreActive.get()) {
            final Context applicationContext = context.getApplicationContext();
            new Thread() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionCoreUtils.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    if (RecognitionCoreUtils.deployRecognitionCoreActive.compareAndSet(false, true)) {
                        try {
                            RecognitionCore.deploy(applicationContext);
                        } catch (Throwable unused) {
                        }
                        RecognitionCoreUtils.deployRecognitionCoreActive.set(true);
                    }
                }
            }.start();
        }
    }

    public static boolean isScanCardSupported(Context context) {
        RecognitionAvailabilityChecker.Result doCheck = RecognitionAvailabilityChecker.doCheck(context);
        return doCheck.isPassed() || doCheck.isAdditionalCheckRequired() || doCheck.isFailedOnCameraPermission();
    }
}