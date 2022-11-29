package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk;

import android.content.Context;
import android.content.Intent;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardActivity;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ScanCardIntent {
    public static final int ADD_MANUALLY_PRESSED = 2;
    public static final int BACK_PRESSED = 1;
    public static final String KEY_SCAN_CARD_REQUEST = "cards.pay.paycardsrecognizer.sdk.ui.ScanCardActivity.SCAN_CARD_REQUEST";
    public static final String RESULT_CANCEL_REASON = "RESULT_CANCEL_REASON";
    public static final String RESULT_CARD_IMAGE = "RESULT_CARD_IMAGE";
    public static final int RESULT_CODE_ERROR = 1;
    public static final String RESULT_PAYCARDS_CARD = "RESULT_PAYCARDS_CARD";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface CancelReason {
    }

    private ScanCardIntent() {
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Context mContext;
        private boolean mEnableSound = true;
        private boolean mScanExpirationDate = true;
        private boolean mScanCardHolder = true;
        private boolean mGrabCardImage = false;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder setScanExpirationDate(boolean z2) {
            this.mScanExpirationDate = z2;
            return this;
        }

        public Builder setScanCardHolder(boolean z2) {
            this.mScanCardHolder = z2;
            return this;
        }

        public Builder setSoundEnabled(boolean z2) {
            this.mEnableSound = z2;
            return this;
        }

        public Builder setSaveCard(boolean z2) {
            this.mGrabCardImage = z2;
            return this;
        }

        public Intent build() {
            Intent intent = new Intent(this.mContext, ScanCardActivity.class);
            intent.putExtra(ScanCardIntent.KEY_SCAN_CARD_REQUEST, new ScanCardRequest(this.mEnableSound, this.mScanExpirationDate, this.mScanCardHolder, this.mGrabCardImage));
            return intent;
        }
    }
}