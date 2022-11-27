package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    private boolean tryDismissWithAnimation(boolean z2) {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
            if (behavior.isHideable() && bottomSheetDialog.getDismissWithAnimation()) {
                dismissWithAnimation(behavior, z2);
                return true;
            }
            return false;
        }
        return false;
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z2) {
        this.waitingForDismissAllowingStateLoss = z2;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetDismissCallback());
        bottomSheetBehavior.setState(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f2) {
        }

        private BottomSheetDismissCallback() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i2) {
            if (i2 == 5) {
                BottomSheetDialogFragment.this.dismissAfterAnimation();
            }
        }
    }
}