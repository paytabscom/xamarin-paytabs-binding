package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ProgressBarIndeterminate extends ProgressBar {
    public ProgressBarIndeterminate(Context context) {
        super(context);
    }

    public ProgressBarIndeterminate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProgressBarIndeterminate(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        clearAnimation();
        if (i2 == 0) {
            setAlpha(1.0f);
        }
    }

    public void hideSlow() {
        if (getVisibility() != 0) {
            return;
        }
        animate().alpha(0.0f).setDuration(getResources().getInteger(17694720)).setListener(new Animator.AnimatorListener() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views.ProgressBarIndeterminate.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ProgressBarIndeterminate.this.setVisibility(8);
                ProgressBarIndeterminate.this.setAlpha(1.0f);
            }
        });
    }
}