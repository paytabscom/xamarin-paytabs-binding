package mono.android.os;

import android.os.MessageQueue;
import java.io.FileDescriptor;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MessageQueue_OnFileDescriptorEventListenerImplementor implements IGCUserPeer, MessageQueue.OnFileDescriptorEventListener {
    public static final String __md_methods = "n_onFileDescriptorEvents:(Ljava/io/FileDescriptor;I)I:GetOnFileDescriptorEvents_Ljava_io_FileDescriptor_IHandler:Android.OS.MessageQueue/IOnFileDescriptorEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native int n_onFileDescriptorEvents(FileDescriptor fileDescriptor, int i2);

    static {
        Runtime.register("Android.OS.MessageQueue+IOnFileDescriptorEventListenerImplementor, Mono.Android", MessageQueue_OnFileDescriptorEventListenerImplementor.class, __md_methods);
    }

    public MessageQueue_OnFileDescriptorEventListenerImplementor() {
        if (getClass() == MessageQueue_OnFileDescriptorEventListenerImplementor.class) {
            TypeManager.Activate("Android.OS.MessageQueue+IOnFileDescriptorEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.os.MessageQueue.OnFileDescriptorEventListener
    public int onFileDescriptorEvents(FileDescriptor fileDescriptor, int i2) {
        return n_onFileDescriptorEvents(fileDescriptor, i2);
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