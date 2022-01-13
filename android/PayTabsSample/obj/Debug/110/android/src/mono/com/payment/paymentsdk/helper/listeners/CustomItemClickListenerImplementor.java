package mono.com.payment.paymentsdk.helper.listeners;


public class CustomItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.helper.listeners.CustomItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Ljava/lang/Object;)V:GetOnClick_Ljava_lang_Object_Handler:Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListenerImplementor, PaymentSDK.Binding", CustomItemClickListenerImplementor.class, __md_methods);
	}


	public CustomItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == CustomItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onClick (java.lang.Object p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (java.lang.Object p0);

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
