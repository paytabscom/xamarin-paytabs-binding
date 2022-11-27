package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.Card;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ScanCardIntent;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionAvailabilityChecker;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionCoreUtils;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionUnavailableException;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.InitLibraryFragment;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment;

/* loaded from: classes.dex */
public class ScanCardActivity extends AppCompatActivity implements ScanCardFragment.InteractionListener, InitLibraryFragment.InteractionListener {
    private static final String TAG = "ScanCardActivity";

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        getDelegate().onPostCreate(null);
        if (bundle == null) {
            RecognitionAvailabilityChecker.Result doCheck = RecognitionAvailabilityChecker.doCheck(this);
            if (doCheck.isFailed() && !doCheck.isFailedOnCameraPermission()) {
                onScanCardFailed(new RecognitionUnavailableException(doCheck.getMessage()));
            } else if (RecognitionCoreUtils.isRecognitionCoreDeployRequired(this) || doCheck.isFailedOnCameraPermission()) {
                showInitLibrary();
            } else {
                showScanCard();
            }
        }
    }

    private void showInitLibrary() {
        getSupportFragmentManager().beginTransaction().replace(16908290, new InitLibraryFragment(), InitLibraryFragment.TAG).setCustomAnimations(0, 0).commitNow();
    }

    private void showScanCard() {
        ScanCardFragment scanCardFragment = new ScanCardFragment();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(ScanCardIntent.KEY_SCAN_CARD_REQUEST, getScanRequest());
        scanCardFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(16908290, scanCardFragment, ScanCardFragment.TAG).setCustomAnimations(0, 0).commitNow();
        ViewCompat.requestApplyInsets(findViewById(16908290));
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.InteractionListener
    public void onScanCardFailed(Exception exc) {
        Log.e(TAG, "Scan card failed", new RuntimeException("onScanCardFinishedWithError()", exc));
        setResult(1);
        finish();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.InteractionListener
    public void onScanCardFinished(Card card, byte[] bArr) {
        Intent intent = new Intent();
        intent.putExtra(ScanCardIntent.RESULT_PAYCARDS_CARD, (Parcelable) card);
        if (bArr != null) {
            intent.putExtra(ScanCardIntent.RESULT_CARD_IMAGE, bArr);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.InitLibraryFragment.InteractionListener
    public void onInitLibraryFailed(Throwable th) {
        Log.e(TAG, "Init library failed", new RuntimeException("onInitLibraryFailed()", th));
        setResult(1);
        finish();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.InteractionListener, com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.InitLibraryFragment.InteractionListener
    public void onScanCardCanceled(int i2) {
        Intent intent = new Intent();
        intent.putExtra(ScanCardIntent.RESULT_CANCEL_REASON, i2);
        setResult(0, intent);
        finish();
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.InitLibraryFragment.InteractionListener
    public void onInitLibraryComplete() {
        if (isFinishing()) {
            return;
        }
        showScanCard();
    }

    private ScanCardRequest getScanRequest() {
        ScanCardRequest scanCardRequest = (ScanCardRequest) getIntent().getParcelableExtra(ScanCardIntent.KEY_SCAN_CARD_REQUEST);
        return scanCardRequest == null ? ScanCardRequest.getDefault() : scanCardRequest;
    }
}