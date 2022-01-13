package mono.com.payment.paymentsdk.d3s.model.interfaces;


public class D3SSViewAuthorizationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.d3s.model.interfaces.D3SSViewAuthorizationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthorizationCompleted:()V:GetOnAuthorizationCompletedHandler:Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerInvoker, PaymentSDK.Binding\n" +
			"n_onAuthorizationWebPageLoadingProgressChanged:(I)V:GetOnAuthorizationWebPageLoadingProgressChanged_IHandler:Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerImplementor, PaymentSDK.Binding", D3SSViewAuthorizationListenerImplementor.class, __md_methods);
	}


	public D3SSViewAuthorizationListenerImplementor ()
	{
		super ();
		if (getClass () == D3SSViewAuthorizationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onAuthorizationCompleted ()
	{
		n_onAuthorizationCompleted ();
	}

	private native void n_onAuthorizationCompleted ();


	public void onAuthorizationWebPageLoadingProgressChanged (int p0)
	{
		n_onAuthorizationWebPageLoadingProgressChanged (p0);
	}

	private native void n_onAuthorizationWebPageLoadingProgressChanged (int p0);

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
