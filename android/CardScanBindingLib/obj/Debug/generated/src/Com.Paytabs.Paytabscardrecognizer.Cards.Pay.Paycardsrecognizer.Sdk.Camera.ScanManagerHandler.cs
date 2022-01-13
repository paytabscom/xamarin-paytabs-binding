using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManagerHandler", DoNotGenerateAcw=true)]
	public sealed partial class ScanManagerHandler : global::Android.OS.Handler {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManagerHandler", typeof (ScanManagerHandler));

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

		internal ScanManagerHandler (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/constructor[@name='ScanManagerHandler' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager']]"
		[Register (".ctor", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager;)V", "")]
		public unsafe ScanManagerHandler (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager manager) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((manager == null) ? IntPtr.Zero : ((global::Java.Lang.Object) manager).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (manager);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendAutoFocusComplete' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='java.lang.String']]"
		[Register ("sendAutoFocusComplete", "(ZLjava/lang/String;)V", "")]
		public unsafe void SendAutoFocusComplete (bool isSuccess, string cameraFocusMode)
		{
			const string __id = "sendAutoFocusComplete.(ZLjava/lang/String;)V";
			IntPtr native_cameraFocusMode = JNIEnv.NewString (cameraFocusMode);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (isSuccess);
				__args [1] = new JniArgumentValue (native_cameraFocusMode);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_cameraFocusMode);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendAutoFocusMoving' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='java.lang.String']]"
		[Register ("sendAutoFocusMoving", "(ZLjava/lang/String;)V", "")]
		public unsafe void SendAutoFocusMoving (bool isStart, string cameraFocusMode)
		{
			const string __id = "sendAutoFocusMoving.(ZLjava/lang/String;)V";
			IntPtr native_cameraFocusMode = JNIEnv.NewString (cameraFocusMode);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (isStart);
				__args [1] = new JniArgumentValue (native_cameraFocusMode);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_cameraFocusMode);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendCameraOpened' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
		[Register ("sendCameraOpened", "(Landroid/hardware/Camera$Parameters;)V", "")]
		public unsafe void SendCameraOpened (global::Android.Hardware.Camera.Parameters cameraParameters)
		{
			const string __id = "sendCameraOpened.(Landroid/hardware/Camera$Parameters;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((cameraParameters == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cameraParameters).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (cameraParameters);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendFpsResport' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("sendFpsResport", "(Ljava/lang/String;)V", "")]
		public unsafe void SendFpsResport (string fpSreport)
		{
			const string __id = "sendFpsResport.(Ljava/lang/String;)V";
			IntPtr native_fpSreport = JNIEnv.NewString (fpSreport);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_fpSreport);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_fpSreport);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendFrameProcessed' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("sendFrameProcessed", "(I)V", "")]
		public unsafe void SendFrameProcessed (int newBorders)
		{
			const string __id = "sendFrameProcessed.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (newBorders);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendOpenCameraError' and count(parameter)=1 and parameter[1][@type='java.lang.Exception']]"
		[Register ("sendOpenCameraError", "(Ljava/lang/Exception;)V", "")]
		public unsafe void SendOpenCameraError (global::Java.Lang.Exception e)
		{
			const string __id = "sendOpenCameraError.(Ljava/lang/Exception;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((e == null) ? IntPtr.Zero : ((global::Java.Lang.Throwable) e).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (e);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManagerHandler']/method[@name='sendRenderThreadError' and count(parameter)=1 and parameter[1][@type='java.lang.Throwable']]"
		[Register ("sendRenderThreadError", "(Ljava/lang/Throwable;)V", "")]
		public unsafe void SendRenderThreadError (global::Java.Lang.Throwable e)
		{
			const string __id = "sendRenderThreadError.(Ljava/lang/Throwable;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((e == null) ? IntPtr.Zero : ((global::Java.Lang.Throwable) e).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (e);
			}
		}

	}
}
