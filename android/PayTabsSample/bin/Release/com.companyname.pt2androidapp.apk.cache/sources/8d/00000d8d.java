package com.payment.paymentsdk;

import androidx.activity.result.ActivityResultCallback;

/* compiled from: lambda */
/* renamed from: com.payment.paymentsdk.-$$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY implements ActivityResultCallback {
    public static final /* synthetic */ $$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY INSTANCE = new $$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY();

    private /* synthetic */ $$Lambda$PaymentSdkActivity$YralNfd5ShPkwX0Qu_PGS5RPRmY() {
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        PaymentSdkActivity.m9requestPhoneStatePermission$lambda0((Boolean) obj);
    }
}