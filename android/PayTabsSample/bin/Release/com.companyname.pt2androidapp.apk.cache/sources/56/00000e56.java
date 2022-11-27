package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.SoundPool;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import cards.pay.paycardsrecognizer.sdk.R;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.Card;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ScanCardIntent;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views.ProgressBarIndeterminate;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class ScanCardFragment extends Fragment {
    public static final String TAG = "ScanCardFragment";
    private CameraPreviewLayout mCameraPreviewLayout;
    private int mCapturedSoundId = -1;
    private View mFlashButton;
    private InteractionListener mListener;
    private ViewGroup mMainContent;
    private ProgressBarIndeterminate mProgressBar;
    private ScanCardRequest mRequest;
    private ScanManager mScanManager;
    private SoundPool mSoundPool;

    /* loaded from: classes.dex */
    public interface InteractionListener {
        void onScanCardCanceled(int i2);

        void onScanCardFailed(Exception exc);

        void onScanCardFinished(Card card, byte[] bArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (InteractionListener) getActivity();
        } catch (ClassCastException unused) {
            throw new RuntimeException("Parent must implement " + InteractionListener.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mRequest = null;
        if (getArguments() != null) {
            this.mRequest = (ScanCardRequest) getArguments().getParcelable(ScanCardIntent.KEY_SCAN_CARD_REQUEST);
        }
        if (this.mRequest == null) {
            this.mRequest = ScanCardRequest.getDefault();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i2, boolean z2, int i3) {
        if (Constants.DEBUG) {
            Log.d(TAG, "onCreateAnimation() called with: transit = [" + i2 + "], enter = [" + z2 + "], nextAnim = [" + i3 + "]");
        }
        Animation animation = new Animation() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.1
        };
        animation.setDuration(0L);
        return animation;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wocr_fragment_scan_card, viewGroup, false);
        this.mProgressBar = (ProgressBarIndeterminate) inflate.findViewById(R.id.wocr_progress_bar);
        this.mCameraPreviewLayout = (CameraPreviewLayout) inflate.findViewById(R.id.wocr_card_recognition_view);
        this.mMainContent = (ViewGroup) inflate.findViewById(R.id.wocr_main_content);
        this.mFlashButton = inflate.findViewById(R.id.wocr_iv_flash_id);
        initView(inflate);
        showMainContent();
        this.mProgressBar.setVisibility(0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!isTablet()) {
            getActivity().setRequestedOrientation(1);
        } else {
            this.mCameraPreviewLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        int i2 = this.mRequest.isScanCardHolderEnabled() ? 5 : 1;
        if (this.mRequest.isScanExpirationDateEnabled()) {
            i2 |= 2;
        }
        if (this.mRequest.isGrabCardImageEnabled()) {
            i2 |= 8;
        }
        this.mScanManager = new ScanManager(i2, getActivity(), this.mCameraPreviewLayout, new ScanManager.Callbacks() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.2
            private byte[] mLastCardImage = null;

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onAutoFocusComplete(boolean z2, String str) {
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onAutoFocusMoving(boolean z2, String str) {
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onFpsReport(String str) {
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onCameraOpened(Camera.Parameters parameters) {
                boolean z2 = (parameters.getSupportedFlashModes() == null || parameters.getSupportedFlashModes().isEmpty()) ? false : true;
                if (ScanCardFragment.this.getView() == null) {
                    return;
                }
                ScanCardFragment.this.mProgressBar.hideSlow();
                ScanCardFragment.this.mCameraPreviewLayout.setBackgroundDrawable(null);
                if (ScanCardFragment.this.mFlashButton != null) {
                    ScanCardFragment.this.mFlashButton.setVisibility(z2 ? 0 : 8);
                }
                ScanCardFragment.this.innitSoundPool();
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onOpenCameraError(Exception exc) {
                ScanCardFragment.this.mProgressBar.hideSlow();
                ScanCardFragment.this.hideMainContent();
                ScanCardFragment.this.finishWithError(exc);
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onRecognitionComplete(RecognitionResult recognitionResult) {
                String str;
                if (recognitionResult.isFirst()) {
                    if (ScanCardFragment.this.mScanManager != null) {
                        ScanCardFragment.this.mScanManager.freezeCameraPreview();
                    }
                    ScanCardFragment.this.playCaptureSound();
                }
                if (recognitionResult.isFinal()) {
                    if (TextUtils.isEmpty(recognitionResult.getDate())) {
                        str = null;
                    } else {
                        str = recognitionResult.getDate().substring(0, 2) + '/' + recognitionResult.getDate().substring(2);
                    }
                    Card card = new Card(recognitionResult.getNumber(), recognitionResult.getName(), str);
                    byte[] bArr = this.mLastCardImage;
                    this.mLastCardImage = null;
                    ScanCardFragment.this.finishWithResult(card, bArr);
                }
            }

            @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks
            public void onCardImageReceived(Bitmap bitmap) {
                this.mLastCardImage = compressCardImage(bitmap);
            }

            private byte[] compressCardImage(Bitmap bitmap) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream)) {
                    return byteArrayOutputStream.toByteArray();
                }
                return null;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ScanManager scanManager = this.mScanManager;
        if (scanManager != null) {
            scanManager.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ScanManager scanManager = this.mScanManager;
        if (scanManager != null) {
            scanManager.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SoundPool soundPool = this.mSoundPool;
        if (soundPool != null) {
            soundPool.release();
            this.mSoundPool = null;
        }
        this.mCapturedSoundId = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void innitSoundPool() {
        if (this.mRequest.isSoundEnabled()) {
            SoundPool soundPool = new SoundPool(1, 1, 0);
            this.mSoundPool = soundPool;
            this.mCapturedSoundId = soundPool.load(getActivity(), R.raw.wocr_capture_card, 0);
        }
    }

    private void initView(View view) {
        view.findViewById(R.id.wocr_tv_enter_card_number_id).setOnClickListener(new View.OnClickListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (view2.isEnabled()) {
                    view2.setEnabled(false);
                    if (ScanCardFragment.this.mListener != null) {
                        ScanCardFragment.this.mListener.onScanCardCanceled(2);
                    }
                }
            }
        });
        View view2 = this.mFlashButton;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    if (ScanCardFragment.this.mScanManager != null) {
                        ScanCardFragment.this.mScanManager.toggleFlash();
                    }
                }
            });
        }
        TextView textView = (TextView) view.findViewById(R.id.wocr_powered_by_paycards_link);
        SpannableString spannableString = new SpannableString(getText(R.string.wocr_powered_by_pay_cards));
        spannableString.setSpan(new URLSpan(Constants.PAYCARDS_URL), 0, spannableString.length(), 17);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void showMainContent() {
        this.mMainContent.setVisibility(0);
        this.mCameraPreviewLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainContent() {
        this.mMainContent.setVisibility(4);
        this.mCameraPreviewLayout.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithError(Exception exc) {
        InteractionListener interactionListener = this.mListener;
        if (interactionListener != null) {
            interactionListener.onScanCardFailed(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithResult(Card card, byte[] bArr) {
        InteractionListener interactionListener = this.mListener;
        if (interactionListener != null) {
            interactionListener.onScanCardFinished(card, bArr);
        }
    }

    private boolean isTablet() {
        return getResources().getBoolean(R.bool.wocr_is_tablet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playCaptureSound() {
        int i2 = this.mCapturedSoundId;
        if (i2 >= 0) {
            this.mSoundPool.play(i2, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}