package com.payment.paymentsdk.helper.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/payment/paymentsdk/helper/ui/NonScrollingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollVertically", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class NonScrollingLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }
}