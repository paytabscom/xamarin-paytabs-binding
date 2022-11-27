package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget;

import android.view.View;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnWindowFocusChangedListenerImplementor implements IGCUserPeer, OnWindowFocusChangedListener {
    public static final String __md_methods = "n_onWindowFocusChanged:(Landroid/view/View;Z)V:GetOnWindowFocusChanged_Landroid_view_View_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerInvoker, CardScanBindingLib\n";
    private ArrayList refList;

    private native void n_onWindowFocusChanged(View view, boolean z2);

    static {
        Runtime.register("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerImplementor, CardScanBindingLib", OnWindowFocusChangedListenerImplementor.class, __md_methods);
    }

    public OnWindowFocusChangedListenerImplementor() {
        if (getClass() == OnWindowFocusChangedListenerImplementor.class) {
            TypeManager.Activate("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerImplementor, CardScanBindingLib", "", this, new Object[0]);
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener
    public void onWindowFocusChanged(View view, boolean z2) {
        n_onWindowFocusChanged(view, z2);
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