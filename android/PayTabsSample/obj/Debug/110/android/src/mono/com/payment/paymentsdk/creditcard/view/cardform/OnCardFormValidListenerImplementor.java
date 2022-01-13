package mono.com.payment.paymentsdk.creditcard.view.cardform;


public class OnCardFormValidListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.creditcard.view.cardform.OnCardFormValidListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCardFormValid:(Z)V:GetOnCardFormValid_ZHandler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor, PaymentSDK.Binding", OnCardFormValidListenerImplementor.class, __md_methods);
	}


	public OnCardFormValidListenerImplementor ()
	{
		super ();
		if (getClass () == OnCardFormValidListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onCardFormValid (boolean p0)
	{
		n_onCardFormValid (p0);
	}

	private native void n_onCardFormValid (boolean p0);

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
