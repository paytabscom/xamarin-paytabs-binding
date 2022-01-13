package crc647f2808e12a92411e;


public class MainActivity
	extends androidx.appcompat.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface,
		java.io.Serializable,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n" +
			"n_onError:(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V:GetOnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\n" +
			"n_onPaymentCancel:()V:GetOnPaymentCancelHandler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\n" +
			"n_onPaymentFinish:(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V:GetOnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Pt2AndroidApp.MainActivity, Pt2AndroidApp", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("Pt2AndroidApp.MainActivity, Pt2AndroidApp", "", this, new java.lang.Object[] {  });
	}


	public MainActivity (int p0)
	{
		super (p0);
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("Pt2AndroidApp.MainActivity, Pt2AndroidApp", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2)
	{
		n_onRequestPermissionsResult (p0, p1, p2);
	}

	private native void n_onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2);


	public void onError (com.payment.paymentsdk.integrationmodels.PaymentSdkError p0)
	{
		n_onError (p0);
	}

	private native void n_onError (com.payment.paymentsdk.integrationmodels.PaymentSdkError p0);


	public void onPaymentCancel ()
	{
		n_onPaymentCancel ();
	}

	private native void n_onPaymentCancel ();


	public void onPaymentFinish (com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails p0)
	{
		n_onPaymentFinish (p0);
	}

	private native void n_onPaymentFinish (com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails p0);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
