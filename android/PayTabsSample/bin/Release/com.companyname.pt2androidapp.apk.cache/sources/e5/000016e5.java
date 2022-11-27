package mono.android.widget;

import android.widget.NumberPicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class NumberPicker_OnScrollListenerImplementor implements IGCUserPeer, NumberPicker.OnScrollListener {
    public static final String __md_methods = "n_onScrollStateChange:(Landroid/widget/NumberPicker;I)V:GetOnScrollStateChange_Landroid_widget_NumberPicker_IHandler:Android.Widget.NumberPicker/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onScrollStateChange(NumberPicker numberPicker, int i2);

    static {
        Runtime.register("Android.Widget.NumberPicker+IOnScrollListenerImplementor, Mono.Android", NumberPicker_OnScrollListenerImplementor.class, __md_methods);
    }

    public NumberPicker_OnScrollListenerImplementor() {
        if (getClass() == NumberPicker_OnScrollListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.NumberPicker+IOnScrollListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.widget.NumberPicker.OnScrollListener
    public void onScrollStateChange(NumberPicker numberPicker, int i2) {
        n_onScrollStateChange(numberPicker, i2);
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