package mono.com.payment.paymentsdk.creditcard.view.cardform;


public class OnCardFormFieldFocusedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.creditcard.view.cardform.OnCardFormFieldFocusedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCardFormFieldFocused:(Landroid/view/View;)V:GetOnCardFormFieldFocused_Landroid_view_View_Handler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor, PaymentSDK.Binding", OnCardFormFieldFocusedListenerImplementor.class, __md_methods);
	}


	public OnCardFormFieldFocusedListenerImplementor ()
	{
		super ();
		if (getClass () == OnCardFormFieldFocusedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onCardFormFieldFocused (android.view.View p0)
	{
		n_onCardFormFieldFocused (p0);
	}

	private native void n_onCardFormFieldFocused (android.view.View p0);

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
