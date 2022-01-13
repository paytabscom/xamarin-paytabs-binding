using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormValidListener']"
	[Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListener", "", "Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerInvoker")]
	public partial interface IOnCardFormValidListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormValidListener']/method[@name='onCardFormValid' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("onCardFormValid", "(Z)V", "GetOnCardFormValid_ZHandler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerInvoker, PaymentSDK.Binding")]
		void OnCardFormValid (bool p0);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListener", DoNotGenerateAcw=true)]
	internal partial class IOnCardFormValidListenerInvoker : global::Java.Lang.Object, IOnCardFormValidListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListener", typeof (IOnCardFormValidListenerInvoker));

		static IntPtr java_class_ref {
			get { return _members.JniPeerType.PeerReference.Handle; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		public override global::Java.Interop.JniPeerMembers JniPeerMembers {
			get { return _members; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override IntPtr ThresholdClass {
			get { return class_ref; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

		IntPtr class_ref;

		public static IOnCardFormValidListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IOnCardFormValidListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.creditcard.view.cardform.OnCardFormValidListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IOnCardFormValidListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onCardFormValid_Z;
#pragma warning disable 0169
		static Delegate GetOnCardFormValid_ZHandler ()
		{
			if (cb_onCardFormValid_Z == null)
				cb_onCardFormValid_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_OnCardFormValid_Z);
			return cb_onCardFormValid_Z;
		}

		static void n_OnCardFormValid_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnCardFormValid (p0);
		}
#pragma warning restore 0169

		IntPtr id_onCardFormValid_Z;
		public unsafe void OnCardFormValid (bool p0)
		{
			if (id_onCardFormValid_Z == IntPtr.Zero)
				id_onCardFormValid_Z = JNIEnv.GetMethodID (class_ref, "onCardFormValid", "(Z)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (p0);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCardFormValid_Z, __args);
		}

	}

	// event args for com.payment.paymentsdk.creditcard.view.cardform.OnCardFormValidListener.onCardFormValid
	public partial class CardFormValidEventArgs : global::System.EventArgs {
		public CardFormValidEventArgs (bool p0)
		{
			this.p0 = p0;
		}

		bool p0;

		public bool P0 {
			get { return p0; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListenerImplementor")]
	internal sealed partial class IOnCardFormValidListenerImplementor : global::Java.Lang.Object, IOnCardFormValidListener {

		object sender;

		public IOnCardFormValidListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<CardFormValidEventArgs> Handler;
		#pragma warning restore 0649

		public void OnCardFormValid (bool p0)
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new CardFormValidEventArgs (p0));
		}

		internal static bool __IsEmpty (IOnCardFormValidListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
