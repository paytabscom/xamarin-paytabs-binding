using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkError", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkError : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkError", typeof (PaymentSdkError));

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

		internal PaymentSdkError (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/constructor[@name='PaymentSdkError' and count(parameter)=2 and parameter[1][@type='java.lang.Integer'] and parameter[2][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/Integer;Ljava/lang/String;)V", "")]
		public unsafe PaymentSdkError (global::Java.Lang.Integer code, string msg) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/Integer;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_msg = JNIEnv.NewString (msg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((code == null) ? IntPtr.Zero : ((global::Java.Lang.Object) code).Handle);
				__args [1] = new JniArgumentValue (native_msg);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_msg);
				global::System.GC.KeepAlive (code);
			}
		}

		public unsafe global::Java.Lang.Integer Code {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/method[@name='getCode' and count(parameter)=0]"
			[Register ("getCode", "()Ljava/lang/Integer;", "")]
			get {
				const string __id = "getCode.()Ljava/lang/Integer;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Msg {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/method[@name='getMsg' and count(parameter)=0]"
			[Register ("getMsg", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getMsg.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Ljava/lang/Integer;", "")]
		public unsafe global::Java.Lang.Integer Component1 ()
		{
			const string __id = "component1.()Ljava/lang/Integer;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Ljava/lang/String;", "")]
		public unsafe string Component2 ()
		{
			const string __id = "component2.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkError']/method[@name='copy' and count(parameter)=2 and parameter[1][@type='java.lang.Integer'] and parameter[2][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError Copy (global::Java.Lang.Integer code, string msg)
		{
			const string __id = "copy.(Ljava/lang/Integer;Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;";
			IntPtr native_msg = JNIEnv.NewString (msg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((code == null) ? IntPtr.Zero : ((global::Java.Lang.Object) code).Handle);
				__args [1] = new JniArgumentValue (native_msg);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_msg);
				global::System.GC.KeepAlive (code);
			}
		}

	}
}
