using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='WindowRotationListener']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener", DoNotGenerateAcw=true)]
	public sealed partial class WindowRotationListener : global::Java.Lang.Object {
		// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='WindowRotationListener.RotationListener']"
		[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener$RotationListener", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener/IRotationListenerInvoker")]
		public partial interface IRotationListener : IJavaObject, IJavaPeerable {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='WindowRotationListener.RotationListener']/method[@name='onWindowRotationChanged' and count(parameter)=0]"
			[Register ("onWindowRotationChanged", "()V", "GetOnWindowRotationChangedHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener/IRotationListenerInvoker, CardScanBindingLib")]
			void OnWindowRotationChanged ();

		}

		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener$RotationListener", DoNotGenerateAcw=true)]
		internal partial class IRotationListenerInvoker : global::Java.Lang.Object, IRotationListener {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener$RotationListener", typeof (IRotationListenerInvoker));

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

			public static IRotationListener GetObject (IntPtr handle, JniHandleOwnership transfer)
			{
				return global::Java.Lang.Object.GetObject<IRotationListener> (handle, transfer);
			}

			static IntPtr Validate (IntPtr handle)
			{
				if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
					throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.RotationListener'.");
				return handle;
			}

			protected override void Dispose (bool disposing)
			{
				if (this.class_ref != IntPtr.Zero)
					JNIEnv.DeleteGlobalRef (this.class_ref);
				this.class_ref = IntPtr.Zero;
				base.Dispose (disposing);
			}

			public IRotationListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
			{
				IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
				this.class_ref = JNIEnv.NewGlobalRef (local_ref);
				JNIEnv.DeleteLocalRef (local_ref);
			}

			static Delegate cb_onWindowRotationChanged;
#pragma warning disable 0169
			static Delegate GetOnWindowRotationChangedHandler ()
			{
				if (cb_onWindowRotationChanged == null)
					cb_onWindowRotationChanged = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_OnWindowRotationChanged);
				return cb_onWindowRotationChanged;
			}

			static void n_OnWindowRotationChanged (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener.IRotationListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				__this.OnWindowRotationChanged ();
			}
#pragma warning restore 0169

			IntPtr id_onWindowRotationChanged;
			public unsafe void OnWindowRotationChanged ()
			{
				if (id_onWindowRotationChanged == IntPtr.Zero)
					id_onWindowRotationChanged = JNIEnv.GetMethodID (class_ref, "onWindowRotationChanged", "()V");
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onWindowRotationChanged);
			}

		}

		[global::Android.Runtime.Register ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener_RotationListenerImplementor")]
		internal sealed partial class IRotationListenerImplementor : global::Java.Lang.Object, IRotationListener {

			object sender;

			public IRotationListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener_RotationListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
			{
				global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
				this.sender = sender;
			}

			#pragma warning disable 0649
			public EventHandler Handler;
			#pragma warning restore 0649

			public void OnWindowRotationChanged ()
			{
				var __h = Handler;
				if (__h != null)
					__h (sender, new EventArgs ());
			}

			internal static bool __IsEmpty (IRotationListenerImplementor value)
			{
				return value.Handler == null;
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener", typeof (WindowRotationListener));

		internal static IntPtr class_ref {
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
			get { return _members.JniPeerType.PeerReference.Handle; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

		internal WindowRotationListener (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='WindowRotationListener']/constructor[@name='WindowRotationListener' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe WindowRotationListener () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "()V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), null);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='WindowRotationListener']/method[@name='register' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.view.Display'] and parameter[3][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.RotationListener']]"
		[Register ("register", "(Landroid/content/Context;Landroid/view/Display;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener$RotationListener;)V", "")]
		public unsafe void Register (global::Android.Content.Context context, global::Android.Views.Display display, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.WindowRotationListener.IRotationListener listener)
		{
			const string __id = "register.(Landroid/content/Context;Landroid/view/Display;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/WindowRotationListener$RotationListener;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((display == null) ? IntPtr.Zero : ((global::Java.Lang.Object) display).Handle);
				__args [2] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (display);
				global::System.GC.KeepAlive (listener);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='WindowRotationListener']/method[@name='unregister' and count(parameter)=0]"
		[Register ("unregister", "()V", "")]
		public unsafe void Unregister ()
		{
			const string __id = "unregister.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
