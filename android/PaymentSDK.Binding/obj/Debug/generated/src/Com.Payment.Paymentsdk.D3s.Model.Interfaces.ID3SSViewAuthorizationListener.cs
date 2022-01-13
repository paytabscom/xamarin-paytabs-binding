using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.Model.Interfaces {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.interfaces']/interface[@name='D3SSViewAuthorizationListener']"
	[Register ("com/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener", "", "Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerInvoker")]
	public partial interface ID3SSViewAuthorizationListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.interfaces']/interface[@name='D3SSViewAuthorizationListener']/method[@name='onAuthorizationCompleted' and count(parameter)=0]"
		[Register ("onAuthorizationCompleted", "()V", "GetOnAuthorizationCompletedHandler:Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerInvoker, PaymentSDK.Binding")]
		void OnAuthorizationCompleted ();

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.interfaces']/interface[@name='D3SSViewAuthorizationListener']/method[@name='onAuthorizationWebPageLoadingProgressChanged' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("onAuthorizationWebPageLoadingProgressChanged", "(I)V", "GetOnAuthorizationWebPageLoadingProgressChanged_IHandler:Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListenerInvoker, PaymentSDK.Binding")]
		void OnAuthorizationWebPageLoadingProgressChanged (int progress);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener", DoNotGenerateAcw=true)]
	internal partial class ID3SSViewAuthorizationListenerInvoker : global::Java.Lang.Object, ID3SSViewAuthorizationListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener", typeof (ID3SSViewAuthorizationListenerInvoker));

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

		public static ID3SSViewAuthorizationListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<ID3SSViewAuthorizationListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.d3s.model.interfaces.D3SSViewAuthorizationListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public ID3SSViewAuthorizationListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onAuthorizationCompleted;
#pragma warning disable 0169
		static Delegate GetOnAuthorizationCompletedHandler ()
		{
			if (cb_onAuthorizationCompleted == null)
				cb_onAuthorizationCompleted = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_OnAuthorizationCompleted);
			return cb_onAuthorizationCompleted;
		}

		static void n_OnAuthorizationCompleted (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnAuthorizationCompleted ();
		}
#pragma warning restore 0169

		IntPtr id_onAuthorizationCompleted;
		public unsafe void OnAuthorizationCompleted ()
		{
			if (id_onAuthorizationCompleted == IntPtr.Zero)
				id_onAuthorizationCompleted = JNIEnv.GetMethodID (class_ref, "onAuthorizationCompleted", "()V");
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAuthorizationCompleted);
		}

		static Delegate cb_onAuthorizationWebPageLoadingProgressChanged_I;
#pragma warning disable 0169
		static Delegate GetOnAuthorizationWebPageLoadingProgressChanged_IHandler ()
		{
			if (cb_onAuthorizationWebPageLoadingProgressChanged_I == null)
				cb_onAuthorizationWebPageLoadingProgressChanged_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_V) n_OnAuthorizationWebPageLoadingProgressChanged_I);
			return cb_onAuthorizationWebPageLoadingProgressChanged_I;
		}

		static void n_OnAuthorizationWebPageLoadingProgressChanged_I (IntPtr jnienv, IntPtr native__this, int progress)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnAuthorizationWebPageLoadingProgressChanged (progress);
		}
#pragma warning restore 0169

		IntPtr id_onAuthorizationWebPageLoadingProgressChanged_I;
		public unsafe void OnAuthorizationWebPageLoadingProgressChanged (int progress)
		{
			if (id_onAuthorizationWebPageLoadingProgressChanged_I == IntPtr.Zero)
				id_onAuthorizationWebPageLoadingProgressChanged_I = JNIEnv.GetMethodID (class_ref, "onAuthorizationWebPageLoadingProgressChanged", "(I)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (progress);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAuthorizationWebPageLoadingProgressChanged_I, __args);
		}

	}

	// event args for com.payment.paymentsdk.d3s.model.interfaces.D3SSViewAuthorizationListener.onAuthorizationWebPageLoadingProgressChanged
	public partial class AuthorizationWebPageLoadingProgressChangedEventArgs : global::System.EventArgs {
		public AuthorizationWebPageLoadingProgressChangedEventArgs (int progress)
		{
			this.progress = progress;
		}

		int progress;

		public int Progress {
			get { return progress; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListenerImplementor")]
	internal sealed partial class ID3SSViewAuthorizationListenerImplementor : global::Java.Lang.Object, ID3SSViewAuthorizationListener {

		object sender;

		public ID3SSViewAuthorizationListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler OnAuthorizationCompletedHandler;
		#pragma warning restore 0649

		public void OnAuthorizationCompleted ()
		{
			var __h = OnAuthorizationCompletedHandler;
			if (__h != null)
				__h (sender, new EventArgs ());
		}

		#pragma warning disable 0649
		public EventHandler<AuthorizationWebPageLoadingProgressChangedEventArgs> OnAuthorizationWebPageLoadingProgressChangedHandler;
		#pragma warning restore 0649

		public void OnAuthorizationWebPageLoadingProgressChanged (int progress)
		{
			var __h = OnAuthorizationWebPageLoadingProgressChangedHandler;
			if (__h != null)
				__h (sender, new AuthorizationWebPageLoadingProgressChangedEventArgs (progress));
		}

		internal static bool __IsEmpty (ID3SSViewAuthorizationListenerImplementor value)
		{
			return value.OnAuthorizationCompletedHandler == null && value.OnAuthorizationWebPageLoadingProgressChangedHandler == null;
		}

	}
}
