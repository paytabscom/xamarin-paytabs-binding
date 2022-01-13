package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget;


public class OnWindowFocusChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onWindowFocusChanged:(Landroid/view/View;Z)V:GetOnWindowFocusChanged_Landroid_view_View_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerInvoker, CardScanBindingLib\n" +
			"";
		mono.android.Runtime.register ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerImplementor, CardScanBindingLib", OnWindowFocusChangedListenerImplementor.class, __md_methods);
	}


	public OnWindowFocusChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnWindowFocusChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerImplementor, CardScanBindingLib", "", this, new java.lang.Object[] {  });
	}


	public void onWindowFocusChanged (android.view.View p0, boolean p1)
	{
		n_onWindowFocusChanged (p0, p1);
	}

	private native void n_onWindowFocusChanged (android.view.View p0, boolean p1);

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
