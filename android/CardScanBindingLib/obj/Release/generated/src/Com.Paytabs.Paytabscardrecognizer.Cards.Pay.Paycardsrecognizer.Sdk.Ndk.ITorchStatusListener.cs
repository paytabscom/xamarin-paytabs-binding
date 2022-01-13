using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='TorchStatusListener']"
	[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListener", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListenerInvoker")]
	public partial interface ITorchStatusListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='TorchStatusListener']/method[@name='onTorchStatusChanged' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("onTorchStatusChanged", "(Z)V", "GetOnTorchStatusChanged_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListenerInvoker, CardScanBindingLib")]
		void OnTorchStatusChanged (bool p0);

	}

	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListener", DoNotGenerateAcw=true)]
	internal partial class ITorchStatusListenerInvoker : global::Java.Lang.Object, ITorchStatusListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListener", typeof (ITorchStatusListenerInvoker));

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

		public static ITorchStatusListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<ITorchStatusListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public ITorchStatusListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onTorchStatusChanged_Z;
#pragma warning disable 0169
		static Delegate GetOnTorchStatusChanged_ZHandler ()
		{
			if (cb_onTorchStatusChanged_Z == null)
				cb_onTorchStatusChanged_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_OnTorchStatusChanged_Z);
			return cb_onTorchStatusChanged_Z;
		}

		static void n_OnTorchStatusChanged_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnTorchStatusChanged (p0);
		}
#pragma warning restore 0169

		IntPtr id_onTorchStatusChanged_Z;
		public unsafe void OnTorchStatusChanged (bool p0)
		{
			if (id_onTorchStatusChanged_Z == IntPtr.Zero)
				id_onTorchStatusChanged_Z = JNIEnv.GetMethodID (class_ref, "onTorchStatusChanged", "(Z)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (p0);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onTorchStatusChanged_Z, __args);
		}

	}

	// event args for com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener.onTorchStatusChanged
	public partial class TorchStatusEventArgs : global::System.EventArgs {
		public TorchStatusEventArgs (bool p0)
		{
			this.p0 = p0;
		}

		bool p0;

		public bool P0 {
			get { return p0; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListenerImplementor")]
	internal sealed partial class ITorchStatusListenerImplementor : global::Java.Lang.Object, ITorchStatusListener {

		object sender;

		public ITorchStatusListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<TorchStatusEventArgs> Handler;
		#pragma warning restore 0649

		public void OnTorchStatusChanged (bool p0)
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new TorchStatusEventArgs (p0));
		}

		internal static bool __IsEmpty (ITorchStatusListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
