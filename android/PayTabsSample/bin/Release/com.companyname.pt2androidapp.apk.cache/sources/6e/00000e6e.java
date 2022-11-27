package crc64a865ca0c03c3b074;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ScanCardActivityResultCallback extends ActivityResultContract implements IGCUserPeer {
    public static final String __md_methods = "n_createIntent:(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;:GetCreateIntent_Landroid_content_Context_Ljava_lang_Object_Handler\nn_parseResult:(ILandroid/content/Intent;)Ljava/lang/Object;:GetParseResult_ILandroid_content_Intent_Handler\n";
    private ArrayList refList;

    private native Intent n_createIntent(Context context, Object obj);

    private native Object n_parseResult(int i2, Intent intent);

    static {
        Runtime.register("Com.Payment.Paymentsdk.Creditcard.Model.ScanCardActivityResultCallback, PaymentSDK.Binding", ScanCardActivityResultCallback.class, __md_methods);
    }

    public ScanCardActivityResultCallback() {
        if (getClass() == ScanCardActivityResultCallback.class) {
            TypeManager.Activate("Com.Payment.Paymentsdk.Creditcard.Model.ScanCardActivityResultCallback, PaymentSDK.Binding", "", this, new Object[0]);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Object obj) {
        return n_createIntent(context, obj);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Object parseResult(int i2, Intent intent) {
        return n_parseResult(i2, intent);
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