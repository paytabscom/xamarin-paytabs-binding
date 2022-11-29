package mono.android.hardware;

import android.hardware.SensorListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class SensorListenerImplementor implements IGCUserPeer, SensorListener {
    public static final String __md_methods = "n_onAccuracyChanged:(II)V:GetOnAccuracyChanged_IIHandler:Android.Hardware.ISensorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSensorChanged:(I[F)V:GetOnSensorChanged_IarrayFHandler:Android.Hardware.ISensorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAccuracyChanged(int i2, int i3);

    private native void n_onSensorChanged(int i2, float[] fArr);

    static {
        Runtime.register("Android.Hardware.ISensorListenerImplementor, Mono.Android", SensorListenerImplementor.class, __md_methods);
    }

    public SensorListenerImplementor() {
        if (getClass() == SensorListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.ISensorListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.hardware.SensorListener
    public void onAccuracyChanged(int i2, int i3) {
        n_onAccuracyChanged(i2, i3);
    }

    @Override // android.hardware.SensorListener
    public void onSensorChanged(int i2, float[] fArr) {
        n_onSensorChanged(i2, fArr);
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