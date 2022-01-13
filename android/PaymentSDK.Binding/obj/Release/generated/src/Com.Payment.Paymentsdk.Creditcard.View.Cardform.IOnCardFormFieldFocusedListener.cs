using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormFieldFocusedListener']"
	[Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListener", "", "Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerInvoker")]
	public partial interface IOnCardFormFieldFocusedListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform']/interface[@name='OnCardFormFieldFocusedListener']/method[@name='onCardFormFieldFocused' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("onCardFormFieldFocused", "(Landroid/view/View;)V", "GetOnCardFormFieldFocused_Landroid_view_View_Handler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerInvoker, PaymentSDK.Binding")]
		void OnCardFormFieldFocused (global::Android.Views.View p0);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListener", DoNotGenerateAcw=true)]
	internal partial class IOnCardFormFieldFocusedListenerInvoker : global::Java.Lang.Object, IOnCardFormFieldFocusedListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListener", typeof (IOnCardFormFieldFocusedListenerInvoker));

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

		public static IOnCardFormFieldFocusedListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IOnCardFormFieldFocusedListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.creditcard.view.cardform.OnCardFormFieldFocusedListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IOnCardFormFieldFocusedListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onCardFormFieldFocused_Landroid_view_View_;
#pragma warning disable 0169
		static Delegate GetOnCardFormFieldFocused_Landroid_view_View_Handler ()
		{
			if (cb_onCardFormFieldFocused_Landroid_view_View_ == null)
				cb_onCardFormFieldFocused_Landroid_view_View_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnCardFormFieldFocused_Landroid_view_View_);
			return cb_onCardFormFieldFocused_Landroid_view_View_;
		}

		static void n_OnCardFormFieldFocused_Landroid_view_View_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnCardFormFieldFocused (p0);
		}
#pragma warning restore 0169

		IntPtr id_onCardFormFieldFocused_Landroid_view_View_;
		public unsafe void OnCardFormFieldFocused (global::Android.Views.View p0)
		{
			if (id_onCardFormFieldFocused_Landroid_view_View_ == IntPtr.Zero)
				id_onCardFormFieldFocused_Landroid_view_View_ = JNIEnv.GetMethodID (class_ref, "onCardFormFieldFocused", "(Landroid/view/View;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCardFormFieldFocused_Landroid_view_View_, __args);
		}

	}

	// event args for com.payment.paymentsdk.creditcard.view.cardform.OnCardFormFieldFocusedListener.onCardFormFieldFocused
	public partial class CardFormFieldFocusedEventArgs : global::System.EventArgs {
		public CardFormFieldFocusedEventArgs (global::Android.Views.View p0)
		{
			this.p0 = p0;
		}

		global::Android.Views.View p0;

		public global::Android.Views.View P0 {
			get { return p0; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListenerImplementor")]
	internal sealed partial class IOnCardFormFieldFocusedListenerImplementor : global::Java.Lang.Object, IOnCardFormFieldFocusedListener {

		object sender;

		public IOnCardFormFieldFocusedListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<CardFormFieldFocusedEventArgs> Handler;
		#pragma warning restore 0649

		public void OnCardFormFieldFocused (global::Android.Views.View p0)
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new CardFormFieldFocusedEventArgs (p0));
		}

		internal static bool __IsEmpty (IOnCardFormFieldFocusedListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
