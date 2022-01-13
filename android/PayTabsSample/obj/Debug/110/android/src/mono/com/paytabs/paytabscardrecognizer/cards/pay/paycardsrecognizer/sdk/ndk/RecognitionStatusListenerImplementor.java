package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;


public class RecognitionStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCardImageReceived:(Landroid/graphics/Bitmap;)V:GetOnCardImageReceived_Landroid_graphics_Bitmap_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib\n" +
			"n_onRecognitionComplete:(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V:GetOnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib\n" +
			"";
		mono.android.Runtime.register ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerImplementor, CardScanBindingLib", RecognitionStatusListenerImplementor.class, __md_methods);
	}


	public RecognitionStatusListenerImplementor ()
	{
		super ();
		if (getClass () == RecognitionStatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerImplementor, CardScanBindingLib", "", this, new java.lang.Object[] {  });
	}


	public void onCardImageReceived (android.graphics.Bitmap p0)
	{
		n_onCardImageReceived (p0);
	}

	private native void n_onCardImageReceived (android.graphics.Bitmap p0);


	public void onRecognitionComplete (com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult p0)
	{
		n_onRecognitionComplete (p0);
	}

	private native void n_onRecognitionComplete (com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult p0);

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
