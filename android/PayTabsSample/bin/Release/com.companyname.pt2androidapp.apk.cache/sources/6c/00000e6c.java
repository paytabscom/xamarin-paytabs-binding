package crc647f2808e12a92411e;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.payment.paymentsdk.integrationmodels.PaymentSdkError;
import com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails;
import com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface;
import java.io.Serializable;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity implements IGCUserPeer, CallbackPaymentInterface, Serializable, View.OnClickListener {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\nn_onError:(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V:GetOnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\nn_onPaymentCancel:()V:GetOnPaymentCancelHandler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\nn_onPaymentFinish:(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V:GetOnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\nn_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onClick(View view);

    private native void n_onCreate(Bundle bundle);

    private native void n_onError(PaymentSdkError paymentSdkError);

    private native void n_onPaymentCancel();

    private native void n_onPaymentFinish(PaymentSdkTransactionDetails paymentSdkTransactionDetails);

    private native void n_onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);

    static {
        Runtime.register("Pt2AndroidApp.MainActivity, Pt2AndroidApp", MainActivity.class, __md_methods);
    }

    public MainActivity() {
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("Pt2AndroidApp.MainActivity, Pt2AndroidApp", "", this, new Object[0]);
        }
    }

    public MainActivity(int i2) {
        super(i2);
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("Pt2AndroidApp.MainActivity, Pt2AndroidApp", "System.Int32, mscorlib", this, new Object[]{Integer.valueOf(i2)});
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        n_onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onError(PaymentSdkError paymentSdkError) {
        n_onError(paymentSdkError);
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onPaymentCancel() {
        n_onPaymentCancel();
    }

    @Override // com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface
    public void onPaymentFinish(PaymentSdkTransactionDetails paymentSdkTransactionDetails) {
        n_onPaymentFinish(paymentSdkTransactionDetails);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n_onClick(view);
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