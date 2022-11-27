package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WindowRotationListener_RotationListenerImplementor implements IGCUserPeer, WindowRotationListener.RotationListener {
    public static final String __md_methods = "n_onWindowRotationChanged:()V:GetOnWindowRotationChangedHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener/IRotationListenerInvoker, CardScanBindingLib\n";
    private ArrayList refList;

    private native void n_onWindowRotationChanged();

    static {
        Runtime.register("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener+IRotationListenerImplementor, CardScanBindingLib", WindowRotationListener_RotationListenerImplementor.class, __md_methods);
    }

    public WindowRotationListener_RotationListenerImplementor() {
        if (getClass() == WindowRotationListener_RotationListenerImplementor.class) {
            TypeManager.Activate("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener+IRotationListenerImplementor, CardScanBindingLib", "", this, new Object[0]);
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.RotationListener
    public void onWindowRotationChanged() {
        n_onWindowRotationChanged();
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