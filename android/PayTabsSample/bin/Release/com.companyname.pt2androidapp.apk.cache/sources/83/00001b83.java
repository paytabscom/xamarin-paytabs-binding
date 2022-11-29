package mono.android.accessibilityservice;

import android.accessibilityservice.AccessibilityService;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor implements IGCUserPeer, AccessibilityService.SoftKeyboardController.OnShowModeChangedListener {
    public static final String __md_methods = "n_onShowModeChanged:(Landroid/accessibilityservice/AccessibilityService$SoftKeyboardController;I)V:GetOnShowModeChanged_Landroid_accessibilityservice_AccessibilityService_SoftKeyboardController_IHandler:Android.AccessibilityServices.AccessibilityService/SoftKeyboardController/IOnShowModeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onShowModeChanged(AccessibilityService.SoftKeyboardController softKeyboardController, int i2);

    static {
        Runtime.register("Android.AccessibilityServices.AccessibilityService+SoftKeyboardController+IOnShowModeChangedListenerImplementor, Mono.Android", AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor.class, __md_methods);
    }

    public AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor() {
        if (getClass() == AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.AccessibilityServices.AccessibilityService+SoftKeyboardController+IOnShowModeChangedListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener
    public void onShowModeChanged(AccessibilityService.SoftKeyboardController softKeyboardController, int i2) {
        n_onShowModeChanged(softKeyboardController, i2);
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