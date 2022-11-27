package crc64cf8d3d895a83e85d;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class StringArrayBottomSheetListAdapter extends RecyclerView.Adapter implements IGCUserPeer {
    public static final String __md_methods = "n_getItemCount:()I:GetGetItemCountHandler\nn_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\nn_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\n";
    private ArrayList refList;

    private native int n_getItemCount();

    private native void n_onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2);

    private native RecyclerView.ViewHolder n_onCreateViewHolder(ViewGroup viewGroup, int i2);

    static {
        Runtime.register("Com.Payment.Paymentsdk.Creditcard.StringArrayBottomSheetListAdapter, PaymentSDK.Binding", StringArrayBottomSheetListAdapter.class, __md_methods);
    }

    public StringArrayBottomSheetListAdapter() {
        if (getClass() == StringArrayBottomSheetListAdapter.class) {
            TypeManager.Activate("Com.Payment.Paymentsdk.Creditcard.StringArrayBottomSheetListAdapter, PaymentSDK.Binding", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return n_getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        n_onBindViewHolder(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return n_onCreateViewHolder(viewGroup, i2);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}