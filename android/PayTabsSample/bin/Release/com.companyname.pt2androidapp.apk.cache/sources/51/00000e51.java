package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import cards.pay.paycardsrecognizer.sdk.R;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionAvailabilityChecker;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionCoreUtils;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.RecognitionUnavailableException;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCore;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class InitLibraryFragment extends Fragment {
    private static final int REQUEST_CAMERA_PERMISSION_CODE = 1;
    public static final String TAG = "InitLibraryFragment";
    private CameraPreviewLayout mCameraPreviewLayout;
    private DeployCoreTask mDeployCoreTask;
    private View mFlashButton;
    private InteractionListener mListener;
    private ViewGroup mMainContent;
    private View mProgressBar;

    /* loaded from: classes.dex */
    public interface InteractionListener {
        void onInitLibraryComplete();

        void onInitLibraryFailed(Throwable th);

        void onScanCardCanceled(int i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (InteractionListener) getActivity();
        } catch (ClassCastException unused) {
            throw new RuntimeException("Parent must implement " + ScanCardFragment.InteractionListener.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wocr_fragment_scan_card, viewGroup, false);
        this.mMainContent = (ViewGroup) inflate.findViewById(R.id.wocr_main_content);
        this.mProgressBar = inflate.findViewById(R.id.wocr_progress_bar);
        this.mCameraPreviewLayout = (CameraPreviewLayout) inflate.findViewById(R.id.wocr_card_recognition_view);
        this.mFlashButton = inflate.findViewById(R.id.wocr_iv_flash_id);
        View findViewById = inflate.findViewById(R.id.wocr_tv_enter_card_number_id);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.InitLibraryFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InitLibraryFragment.this.mListener != null) {
                    InitLibraryFragment.this.mListener.onScanCardCanceled(2);
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mProgressBar.setVisibility(8);
        this.mMainContent.setVisibility(0);
        this.mCameraPreviewLayout.setVisibility(0);
        this.mCameraPreviewLayout.getSurfaceView().setVisibility(8);
        this.mCameraPreviewLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        View view2 = this.mFlashButton;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!RecognitionAvailabilityChecker.doCheck(getContext()).isFailedOnCameraPermission()) {
            subscribeToInitCore(getActivity());
        } else if (bundle == null) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            subscribeToInitCore(getActivity());
            return;
        }
        InteractionListener interactionListener = this.mListener;
        if (interactionListener != null) {
            interactionListener.onInitLibraryFailed(new RecognitionUnavailableException(4));
        }
    }

    private void subscribeToInitCore(Context context) {
        View view = this.mProgressBar;
        if (view != null) {
            view.setVisibility(0);
        }
        DeployCoreTask deployCoreTask = this.mDeployCoreTask;
        if (deployCoreTask != null) {
            deployCoreTask.cancel(false);
        }
        DeployCoreTask deployCoreTask2 = new DeployCoreTask(this);
        this.mDeployCoreTask = deployCoreTask2;
        deployCoreTask2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        DeployCoreTask deployCoreTask = this.mDeployCoreTask;
        if (deployCoreTask != null) {
            deployCoreTask.cancel(false);
            this.mDeployCoreTask = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mProgressBar = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DeployCoreTask extends AsyncTask<Void, Void, Throwable> {
        private final Context appContext;
        private final WeakReference<InitLibraryFragment> fragmentRef;

        DeployCoreTask(InitLibraryFragment initLibraryFragment) {
            this.fragmentRef = new WeakReference<>(initLibraryFragment);
            this.appContext = initLibraryFragment.getContext().getApplicationContext();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Throwable doInBackground(Void... voidArr) {
            try {
                if (RecognitionAvailabilityChecker.doCheck(this.appContext).isFailed()) {
                    throw new RecognitionUnavailableException();
                }
                RecognitionCoreUtils.deployRecognitionCoreSync(this.appContext);
                if (RecognitionCore.getInstance(this.appContext).isDeviceSupported()) {
                    return null;
                }
                throw new RecognitionUnavailableException();
            } catch (RecognitionUnavailableException e2) {
                return e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Throwable th) {
            super.onPostExecute((DeployCoreTask) th);
            InitLibraryFragment initLibraryFragment = this.fragmentRef.get();
            if (initLibraryFragment == null || initLibraryFragment.mProgressBar == null || initLibraryFragment.mListener == null) {
                return;
            }
            initLibraryFragment.mProgressBar.setVisibility(8);
            if (th == null) {
                initLibraryFragment.mListener.onInitLibraryComplete();
            } else {
                initLibraryFragment.mListener.onInitLibraryFailed(th);
            }
        }
    }
}