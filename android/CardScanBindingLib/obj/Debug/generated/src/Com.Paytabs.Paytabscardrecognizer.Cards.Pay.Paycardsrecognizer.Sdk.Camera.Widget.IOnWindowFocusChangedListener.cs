using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/interface[@name='OnWindowFocusChangedListener']"
	[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/OnWindowFocusChangedListener", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerInvoker")]
	public partial interface IOnWindowFocusChangedListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/interface[@name='OnWindowFocusChangedListener']/method[@name='onWindowFocusChanged' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='boolean']]"
		[Register ("onWindowFocusChanged", "(Landroid/view/View;Z)V", "GetOnWindowFocusChanged_Landroid_view_View_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListenerInvoker, CardScanBindingLib")]
		void OnWindowFocusChanged (global::Android.Views.View p0, bool p1);

	}

	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/OnWindowFocusChangedListener", DoNotGenerateAcw=true)]
	internal partial class IOnWindowFocusChangedListenerInvoker : global::Java.Lang.Object, IOnWindowFocusChangedListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/OnWindowFocusChangedListener", typeof (IOnWindowFocusChangedListenerInvoker));

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

		public static IOnWindowFocusChangedListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IOnWindowFocusChangedListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IOnWindowFocusChangedListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onWindowFocusChanged_Landroid_view_View_Z;
#pragma warning disable 0169
		static Delegate GetOnWindowFocusChanged_Landroid_view_View_ZHandler ()
		{
			if (cb_onWindowFocusChanged_Landroid_view_View_Z == null)
				cb_onWindowFocusChanged_Landroid_view_View_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLZ_V) n_OnWindowFocusChanged_Landroid_view_View_Z);
			return cb_onWindowFocusChanged_Landroid_view_View_Z;
		}

		static void n_OnWindowFocusChanged_Landroid_view_View_Z (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, bool p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.IOnWindowFocusChangedListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnWindowFocusChanged (p0, p1);
		}
#pragma warning restore 0169

		IntPtr id_onWindowFocusChanged_Landroid_view_View_Z;
		public unsafe void OnWindowFocusChanged (global::Android.Views.View p0, bool p1)
		{
			if (id_onWindowFocusChanged_Landroid_view_View_Z == IntPtr.Zero)
				id_onWindowFocusChanged_Landroid_view_View_Z = JNIEnv.GetMethodID (class_ref, "onWindowFocusChanged", "(Landroid/view/View;Z)V");
			JValue* __args = stackalloc JValue [2];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			__args [1] = new JValue (p1);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onWindowFocusChanged_Landroid_view_View_Z, __args);
		}

	}

	// event args for com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.OnWindowFocusChangedListener.onWindowFocusChanged
	public partial class WindowFocusChangedEventArgs : global::System.EventArgs {
		public WindowFocusChangedEventArgs (global::Android.Views.View p0, bool p1)
		{
			this.p0 = p0;
			this.p1 = p1;
		}

		global::Android.Views.View p0;

		public global::Android.Views.View P0 {
			get { return p0; }
		}

		bool p1;

		public bool P1 {
			get { return p1; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/OnWindowFocusChangedListenerImplementor")]
	internal sealed partial class IOnWindowFocusChangedListenerImplementor : global::Java.Lang.Object, IOnWindowFocusChangedListener {

		object sender;

		public IOnWindowFocusChangedListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/OnWindowFocusChangedListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<WindowFocusChangedEventArgs> Handler;
		#pragma warning restore 0649

		public void OnWindowFocusChanged (global::Android.Views.View p0, bool p1)
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new WindowFocusChangedEventArgs (p0, p1));
		}

		internal static bool __IsEmpty (IOnWindowFocusChangedListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
