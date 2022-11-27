package mono.android.runtime;

import java.io.OutputStream;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OutputStreamAdapter extends OutputStream implements IGCUserPeer {
    public static final String __md_methods = "n_close:()V:GetCloseHandler\nn_flush:()V:GetFlushHandler\nn_write:([B)V:GetWrite_arrayBHandler\nn_write:([BII)V:GetWrite_arrayBIIHandler\nn_write:(I)V:GetWrite_IHandler\n";
    private ArrayList refList;

    private native void n_close();

    private native void n_flush();

    private native void n_write(int i2);

    private native void n_write(byte[] bArr);

    private native void n_write(byte[] bArr, int i2, int i3);

    static {
        Runtime.register("Android.Runtime.OutputStreamAdapter, Mono.Android", OutputStreamAdapter.class, __md_methods);
    }

    public OutputStreamAdapter() {
        if (getClass() == OutputStreamAdapter.class) {
            TypeManager.Activate("Android.Runtime.OutputStreamAdapter, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n_close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        n_flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        n_write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        n_write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        n_write(i2);
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