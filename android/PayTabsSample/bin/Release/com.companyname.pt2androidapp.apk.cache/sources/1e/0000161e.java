package mono.android.bluetooth;

import android.bluetooth.BluetoothProfile;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class BluetoothProfile_ServiceListenerImplementor implements IGCUserPeer, BluetoothProfile.ServiceListener {
    public static final String __md_methods = "n_onServiceConnected:(ILandroid/bluetooth/BluetoothProfile;)V:GetOnServiceConnected_ILandroid_bluetooth_BluetoothProfile_Handler:Android.Bluetooth.IBluetoothProfileServiceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceDisconnected:(I)V:GetOnServiceDisconnected_IHandler:Android.Bluetooth.IBluetoothProfileServiceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onServiceConnected(int i2, BluetoothProfile bluetoothProfile);

    private native void n_onServiceDisconnected(int i2);

    static {
        Runtime.register("Android.Bluetooth.IBluetoothProfileServiceListenerImplementor, Mono.Android", BluetoothProfile_ServiceListenerImplementor.class, __md_methods);
    }

    public BluetoothProfile_ServiceListenerImplementor() {
        if (getClass() == BluetoothProfile_ServiceListenerImplementor.class) {
            TypeManager.Activate("Android.Bluetooth.IBluetoothProfileServiceListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
        n_onServiceConnected(i2, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i2) {
        n_onServiceDisconnected(i2);
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