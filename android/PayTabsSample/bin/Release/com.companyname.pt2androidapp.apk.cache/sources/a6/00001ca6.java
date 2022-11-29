package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class TorchStatusListenerImplementor implements IGCUserPeer, TorchStatusListener {
    public static final String __md_methods = "n_onTorchStatusChanged:(Z)V:GetOnTorchStatusChanged_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListenerInvoker, CardScanBindingLib\n";
    private ArrayList refList;

    private native void n_onTorchStatusChanged(boolean z2);

    static {
        Runtime.register("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListenerImplementor, CardScanBindingLib", TorchStatusListenerImplementor.class, __md_methods);
    }

    public TorchStatusListenerImplementor() {
        if (getClass() == TorchStatusListenerImplementor.class) {
            TypeManager.Activate("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListenerImplementor, CardScanBindingLib", "", this, new Object[0]);
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener
    public void onTorchStatusChanged(boolean z2) {
        n_onTorchStatusChanged(z2);
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