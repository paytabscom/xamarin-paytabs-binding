using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraConfigurationUtils", DoNotGenerateAcw=true)]
	public sealed partial class CameraConfigurationUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraConfigurationUtils", typeof (CameraConfigurationUtils));

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

		internal CameraConfigurationUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='initAutoFocus' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("initAutoFocus", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public static unsafe void InitAutoFocus (global::Android.Hardware.Camera.Parameters cameraParameters)
		{
			const string __id = "initAutoFocus.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((cameraParameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cameraParameters).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (cameraParameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='initAutoFocus' and count(parameter)=2 and parameter[1][@type='android.hardware.Camera.Parameters'] and parameter[2][@type='boolean']]"
		[Register ("initAutoFocus", "(Landroid/hardware/Camera$Parameters;Z)V", "")]
		public static unsafe void InitAutoFocus (global::Android.Hardware.Camera.Parameters cameraParameters, bool enableContinuousFocus)
		{
			const string __id = "initAutoFocus.(Landroid/hardware/Camera$Parameters;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((cameraParameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cameraParameters).Handle);
				__args [1] = new JniArgumentValue (enableContinuousFocus);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (cameraParameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='initWhiteBalance' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("initWhiteBalance", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public static unsafe void InitWhiteBalance (global::Android.Hardware.Camera.Parameters parameters)
		{
			const string __id = "initWhiteBalance.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((parameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parameters).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (parameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='setBestExposure' and count(parameter)=2 and parameter[1][@type='android.hardware.Camera.Parameters'] and parameter[2][@type='boolean']]"
		[Register ("setBestExposure", "(Landroid/hardware/Camera$Parameters;Z)V", "")]
		public static unsafe void SetBestExposure (global::Android.Hardware.Camera.Parameters parameters, bool lightOn)
		{
			const string __id = "setBestExposure.(Landroid/hardware/Camera$Parameters;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((parameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parameters).Handle);
				__args [1] = new JniArgumentValue (lightOn);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (parameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='setFocusArea' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("setFocusArea", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public static unsafe void SetFocusArea (global::Android.Hardware.Camera.Parameters parameters)
		{
			const string __id = "setFocusArea.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((parameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parameters).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (parameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='setMetering' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("setMetering", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public static unsafe void SetMetering (global::Android.Hardware.Camera.Parameters parameters)
		{
			const string __id = "setMetering.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((parameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parameters).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (parameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraConfigurationUtils']/method[@name='setMeteringArea' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("setMeteringArea", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public static unsafe void SetMeteringArea (global::Android.Hardware.Camera.Parameters parameters)
		{
			const string __id = "setMeteringArea.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((parameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parameters).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (parameters);
			}
		}

	}
}
