package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;


public class WindowRotationListener_RotationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.RotationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onWindowRotationChanged:()V:GetOnWindowRotationChangedHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener/IRotationListenerInvoker, CardScanBindingLib\n" +
			"";
		mono.android.Runtime.register ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener+IRotationListenerImplementor, CardScanBindingLib", WindowRotationListener_RotationListenerImplementor.class, __md_methods);
	}


	public WindowRotationListener_RotationListenerImplementor ()
	{
		super ();
		if (getClass () == WindowRotationListener_RotationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener+IRotationListenerImplementor, CardScanBindingLib", "", this, new java.lang.Object[] {  });
	}


	public void onWindowRotationChanged ()
	{
		n_onWindowRotationChanged ();
	}

	private native void n_onWindowRotationChanged ();

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
