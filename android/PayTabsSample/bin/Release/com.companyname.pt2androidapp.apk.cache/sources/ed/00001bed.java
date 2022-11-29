package mono.android.media;

import android.media.RemoteController;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class RemoteController_OnClientUpdateListenerImplementor implements IGCUserPeer, RemoteController.OnClientUpdateListener {
    public static final String __md_methods = "n_onClientChange:(Z)V:GetOnClientChange_ZHandler:Android.Media.RemoteController/IOnClientUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onClientMetadataUpdate:(Landroid/media/RemoteController$MetadataEditor;)V:GetOnClientMetadataUpdate_Landroid_media_RemoteController_MetadataEditor_Handler:Android.Media.RemoteController/IOnClientUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onClientPlaybackStateUpdate:(I)V:GetOnClientPlaybackStateUpdateSimple_IHandler:Android.Media.RemoteController/IOnClientUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onClientPlaybackStateUpdate:(IJJF)V:GetOnClientPlaybackStateUpdate_IJJFHandler:Android.Media.RemoteController/IOnClientUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onClientTransportControlUpdate:(I)V:GetOnClientTransportControlUpdate_IHandler:Android.Media.RemoteController/IOnClientUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClientChange(boolean z2);

    private native void n_onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor);

    private native void n_onClientPlaybackStateUpdate(int i2);

    private native void n_onClientPlaybackStateUpdate(int i2, long j2, long j3, float f2);

    private native void n_onClientTransportControlUpdate(int i2);

    static {
        Runtime.register("Android.Media.RemoteController+IOnClientUpdateListenerImplementor, Mono.Android", RemoteController_OnClientUpdateListenerImplementor.class, __md_methods);
    }

    public RemoteController_OnClientUpdateListenerImplementor() {
        if (getClass() == RemoteController_OnClientUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.RemoteController+IOnClientUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean z2) {
        n_onClientChange(z2);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        n_onClientMetadataUpdate(metadataEditor);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i2) {
        n_onClientPlaybackStateUpdate(i2);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i2, long j2, long j3, float f2) {
        n_onClientPlaybackStateUpdate(i2, j2, j3, f2);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int i2) {
        n_onClientTransportControlUpdate(i2);
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