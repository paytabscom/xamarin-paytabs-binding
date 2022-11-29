package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class View_OnSystemUiVisibilityChangeListenerImplementor implements IGCUserPeer, View.OnSystemUiVisibilityChangeListener {
    public static final String __md_methods = "n_onSystemUiVisibilityChange:(I)V:GetOnSystemUiVisibilityChange_IHandler:Android.Views.View/IOnSystemUiVisibilityChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onSystemUiVisibilityChange(int i2);

    static {
        Runtime.register("Android.Views.View+IOnSystemUiVisibilityChangeListenerImplementor, Mono.Android", View_OnSystemUiVisibilityChangeListenerImplementor.class, __md_methods);
    }

    public View_OnSystemUiVisibilityChangeListenerImplementor() {
        if (getClass() == View_OnSystemUiVisibilityChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnSystemUiVisibilityChangeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i2) {
        n_onSystemUiVisibilityChange(i2);
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