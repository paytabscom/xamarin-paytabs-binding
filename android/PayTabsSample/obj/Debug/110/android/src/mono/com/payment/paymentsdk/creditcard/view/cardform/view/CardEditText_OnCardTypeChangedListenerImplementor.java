package mono.com.payment.paymentsdk.creditcard.view.cardform.view;


public class CardEditText_OnCardTypeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.OnCardTypeChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCardTypeChanged:(Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V:GetOnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText/IOnCardTypeChangedListenerInvoker, PaymentSDK.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText+IOnCardTypeChangedListenerImplementor, PaymentSDK.Binding", CardEditText_OnCardTypeChangedListenerImplementor.class, __md_methods);
	}


	public CardEditText_OnCardTypeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == CardEditText_OnCardTypeChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText+IOnCardTypeChangedListenerImplementor, PaymentSDK.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onCardTypeChanged (com.payment.paymentsdk.creditcard.view.cardform.utils.CardType p0)
	{
		n_onCardTypeChanged (p0);
	}

	private native void n_onCardTypeChanged (com.payment.paymentsdk.creditcard.view.cardform.utils.CardType p0);

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
