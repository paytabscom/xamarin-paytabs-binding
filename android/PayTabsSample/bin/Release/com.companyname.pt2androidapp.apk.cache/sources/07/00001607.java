package mono.android.animation;

import android.animation.TimeAnimator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class TimeAnimator_TimeListenerImplementor implements IGCUserPeer, TimeAnimator.TimeListener {
    public static final String __md_methods = "n_onTimeUpdate:(Landroid/animation/TimeAnimator;JJ)V:GetOnTimeUpdate_Landroid_animation_TimeAnimator_JJHandler:Android.Animation.TimeAnimator/ITimeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onTimeUpdate(TimeAnimator timeAnimator, long j2, long j3);

    static {
        Runtime.register("Android.Animation.TimeAnimator+ITimeListenerImplementor, Mono.Android", TimeAnimator_TimeListenerImplementor.class, __md_methods);
    }

    public TimeAnimator_TimeListenerImplementor() {
        if (getClass() == TimeAnimator_TimeListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.TimeAnimator+ITimeListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public void onTimeUpdate(TimeAnimator timeAnimator, long j2, long j3) {
        n_onTimeUpdate(timeAnimator, j2, j3);
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