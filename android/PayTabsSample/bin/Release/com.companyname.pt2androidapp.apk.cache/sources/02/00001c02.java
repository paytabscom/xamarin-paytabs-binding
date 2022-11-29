package mono.android.net.wifi;

import android.net.wifi.WifiManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class WifiManager_SuggestionUserApprovalStatusListenerImplementor implements IGCUserPeer, WifiManager.SuggestionUserApprovalStatusListener {
    public static final String __md_methods = "n_onUserApprovalStatusChange:(I)V:GetOnUserApprovalStatusChange_IHandler:Android.Net.Wifi.WifiManager/ISuggestionUserApprovalStatusListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onUserApprovalStatusChange(int i2);

    static {
        Runtime.register("Android.Net.Wifi.WifiManager+ISuggestionUserApprovalStatusListenerImplementor, Mono.Android", WifiManager_SuggestionUserApprovalStatusListenerImplementor.class, __md_methods);
    }

    public WifiManager_SuggestionUserApprovalStatusListenerImplementor() {
        if (getClass() == WifiManager_SuggestionUserApprovalStatusListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.WifiManager+ISuggestionUserApprovalStatusListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener
    public void onUserApprovalStatusChange(int i2) {
        n_onUserApprovalStatusChange(i2);
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