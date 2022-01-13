using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager", DoNotGenerateAcw=true)]
	public sealed partial class AutoFocusManager : global::Java.Lang.Object {
		// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='AutoFocusManager.FocusMoveCallback']"
		[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager$FocusMoveCallback", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager/IFocusMoveCallbackInvoker")]
		public partial interface IFocusMoveCallback : IJavaObject, IJavaPeerable {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='AutoFocusManager.FocusMoveCallback']/method[@name='onAutoFocusComplete' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='android.hardware.Camera']]"
			[Register ("onAutoFocusComplete", "(ZLandroid/hardware/Camera;)V", "GetOnAutoFocusComplete_ZLandroid_hardware_Camera_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager/IFocusMoveCallbackInvoker, CardScanBindingLib")]
			void OnAutoFocusComplete (bool p0, global::Android.Hardware.Camera p1);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='AutoFocusManager.FocusMoveCallback']/method[@name='onAutoFocusMoving' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='android.hardware.Camera']]"
			[Register ("onAutoFocusMoving", "(ZLandroid/hardware/Camera;)V", "GetOnAutoFocusMoving_ZLandroid_hardware_Camera_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager/IFocusMoveCallbackInvoker, CardScanBindingLib")]
			void OnAutoFocusMoving (bool p0, global::Android.Hardware.Camera p1);

		}

		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager$FocusMoveCallback", DoNotGenerateAcw=true)]
		internal partial class IFocusMoveCallbackInvoker : global::Java.Lang.Object, IFocusMoveCallback {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager$FocusMoveCallback", typeof (IFocusMoveCallbackInvoker));

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

			public static IFocusMoveCallback GetObject (IntPtr handle, JniHandleOwnership transfer)
			{
				return global::Java.Lang.Object.GetObject<IFocusMoveCallback> (handle, transfer);
			}

			static IntPtr Validate (IntPtr handle)
			{
				if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
					throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusMoveCallback'.");
				return handle;
			}

			protected override void Dispose (bool disposing)
			{
				if (this.class_ref != IntPtr.Zero)
					JNIEnv.DeleteGlobalRef (this.class_ref);
				this.class_ref = IntPtr.Zero;
				base.Dispose (disposing);
			}

			public IFocusMoveCallbackInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
			{
				IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
				this.class_ref = JNIEnv.NewGlobalRef (local_ref);
				JNIEnv.DeleteLocalRef (local_ref);
			}

			static Delegate cb_onAutoFocusComplete_ZLandroid_hardware_Camera_;
#pragma warning disable 0169
			static Delegate GetOnAutoFocusComplete_ZLandroid_hardware_Camera_Handler ()
			{
				if (cb_onAutoFocusComplete_ZLandroid_hardware_Camera_ == null)
					cb_onAutoFocusComplete_ZLandroid_hardware_Camera_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZL_V) n_OnAutoFocusComplete_ZLandroid_hardware_Camera_);
				return cb_onAutoFocusComplete_ZLandroid_hardware_Camera_;
			}

			static void n_OnAutoFocusComplete_ZLandroid_hardware_Camera_ (IntPtr jnienv, IntPtr native__this, bool p0, IntPtr native_p1)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager.IFocusMoveCallback> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p1 = global::Java.Lang.Object.GetObject<global::Android.Hardware.Camera> (native_p1, JniHandleOwnership.DoNotTransfer);
				__this.OnAutoFocusComplete (p0, p1);
			}
#pragma warning restore 0169

			IntPtr id_onAutoFocusComplete_ZLandroid_hardware_Camera_;
			public unsafe void OnAutoFocusComplete (bool p0, global::Android.Hardware.Camera p1)
			{
				if (id_onAutoFocusComplete_ZLandroid_hardware_Camera_ == IntPtr.Zero)
					id_onAutoFocusComplete_ZLandroid_hardware_Camera_ = JNIEnv.GetMethodID (class_ref, "onAutoFocusComplete", "(ZLandroid/hardware/Camera;)V");
				JValue* __args = stackalloc JValue [2];
				__args [0] = new JValue (p0);
				__args [1] = new JValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAutoFocusComplete_ZLandroid_hardware_Camera_, __args);
			}

			static Delegate cb_onAutoFocusMoving_ZLandroid_hardware_Camera_;
#pragma warning disable 0169
			static Delegate GetOnAutoFocusMoving_ZLandroid_hardware_Camera_Handler ()
			{
				if (cb_onAutoFocusMoving_ZLandroid_hardware_Camera_ == null)
					cb_onAutoFocusMoving_ZLandroid_hardware_Camera_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZL_V) n_OnAutoFocusMoving_ZLandroid_hardware_Camera_);
				return cb_onAutoFocusMoving_ZLandroid_hardware_Camera_;
			}

			static void n_OnAutoFocusMoving_ZLandroid_hardware_Camera_ (IntPtr jnienv, IntPtr native__this, bool p0, IntPtr native_p1)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager.IFocusMoveCallback> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p1 = global::Java.Lang.Object.GetObject<global::Android.Hardware.Camera> (native_p1, JniHandleOwnership.DoNotTransfer);
				__this.OnAutoFocusMoving (p0, p1);
			}
#pragma warning restore 0169

			IntPtr id_onAutoFocusMoving_ZLandroid_hardware_Camera_;
			public unsafe void OnAutoFocusMoving (bool p0, global::Android.Hardware.Camera p1)
			{
				if (id_onAutoFocusMoving_ZLandroid_hardware_Camera_ == IntPtr.Zero)
					id_onAutoFocusMoving_ZLandroid_hardware_Camera_ = JNIEnv.GetMethodID (class_ref, "onAutoFocusMoving", "(ZLandroid/hardware/Camera;)V");
				JValue* __args = stackalloc JValue [2];
				__args [0] = new JValue (p0);
				__args [1] = new JValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAutoFocusMoving_ZLandroid_hardware_Camera_, __args);
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager", typeof (AutoFocusManager));

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

		internal AutoFocusManager (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']/constructor[@name='AutoFocusManager' and count(parameter)=2 and parameter[1][@type='android.hardware.Camera'] and parameter[2][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.AutoFocusManager.FocusMoveCallback']]"
		[Register (".ctor", "(Landroid/hardware/Camera;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager$FocusMoveCallback;)V", "")]
		public unsafe AutoFocusManager (global::Android.Hardware.Camera camera, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.AutoFocusManager.IFocusMoveCallback @callback) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/hardware/Camera;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/AutoFocusManager$FocusMoveCallback;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((camera == null) ? IntPtr.Zero : ((global::Java.Lang.Object) camera).Handle);
				__args [1] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (camera);
				global::System.GC.KeepAlive (@callback);
			}
		}

		public unsafe bool IsStarted {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']/method[@name='isStarted' and count(parameter)=0]"
			[Register ("isStarted", "()Z", "")]
			get {
				const string __id = "isStarted.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']/method[@name='requestFocus' and count(parameter)=0]"
		[Register ("requestFocus", "()V", "")]
		public unsafe void RequestFocus ()
		{
			const string __id = "requestFocus.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']/method[@name='start' and count(parameter)=0]"
		[Register ("start", "()V", "")]
		public unsafe void Start ()
		{
			const string __id = "start.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='AutoFocusManager']/method[@name='stop' and count(parameter)=0]"
		[Register ("stop", "()V", "")]
		public unsafe void Stop ()
		{
			const string __id = "stop.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
