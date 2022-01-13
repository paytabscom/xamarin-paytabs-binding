package mono.com.payment.paymentsdk.creditcard.view.cardform;


public class OnCardFormSubmitListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.creditcard.view.cardform.OnCardFormSubmitListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCardFormSubmit:()V:GetOnCardFormSubmitHandler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor, PaymentSDK.Binding", OnCardFormSubmitListenerImplementor.class, __md_methods);
	}


	public OnCardFormSubmitListenerImplementor ()
	{
		super ();
		if (getClass () == OnCardFormSubmitListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onCardFormSubmit ()
	{
		n_onCardFormSubmit ();
	}

	private native void n_onCardFormSubmit ();

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
