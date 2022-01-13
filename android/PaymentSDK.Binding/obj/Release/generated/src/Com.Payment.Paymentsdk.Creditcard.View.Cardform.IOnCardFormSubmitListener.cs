using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormSubmitListener']"
	[Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListener", "", "Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerInvoker")]
	public partial interface IOnCardFormSubmitListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormSubmitListener']/method[@name='onCardFormSubmit' and count(parameter)=0]"
		[Register ("onCardFormSubmit", "()V", "GetOnCardFormSubmitHandler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerInvoker, PaymentSDK.Binding")]
		void OnCardFormSubmit ();

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListener", DoNotGenerateAcw=true)]
	internal partial class IOnCardFormSubmitListenerInvoker : global::Java.Lang.Object, IOnCardFormSubmitListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListener", typeof (IOnCardFormSubmitListenerInvoker));

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

		public static IOnCardFormSubmitListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IOnCardFormSubmitListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.creditcard.view.cardform.OnCardFormSubmitListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IOnCardFormSubmitListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onCardFormSubmit;
#pragma warning disable 0169
		static Delegate GetOnCardFormSubmitHandler ()
		{
			if (cb_onCardFormSubmit == null)
				cb_onCardFormSubmit = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_OnCardFormSubmit);
			return cb_onCardFormSubmit;
		}

		static void n_OnCardFormSubmit (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnCardFormSubmit ();
		}
#pragma warning restore 0169

		IntPtr id_onCardFormSubmit;
		public unsafe void OnCardFormSubmit ()
		{
			if (id_onCardFormSubmit == IntPtr.Zero)
				id_onCardFormSubmit = JNIEnv.GetMethodID (class_ref, "onCardFormSubmit", "()V");
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCardFormSubmit);
		}

	}

	[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListenerImplementor")]
	internal sealed partial class IOnCardFormSubmitListenerImplementor : global::Java.Lang.Object, IOnCardFormSubmitListener {

		object sender;

		public IOnCardFormSubmitListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler Handler;
		#pragma warning restore 0649

		public void OnCardFormSubmit ()
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new EventArgs ());
		}

		internal static bool __IsEmpty (IOnCardFormSubmitListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
