using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Response {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/response/PaymentResult", DoNotGenerateAcw=true)]
	public sealed partial class PaymentResult : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/response/PaymentResult", typeof (PaymentResult));

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

		internal PaymentResult (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/constructor[@name='PaymentResult' and count(parameter)=4 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe PaymentResult (string responseCode, string responseMessage, string responseStatus, string transactionTime) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_responseCode = JNIEnv.NewString (responseCode);
			IntPtr native_responseMessage = JNIEnv.NewString (responseMessage);
			IntPtr native_responseStatus = JNIEnv.NewString (responseStatus);
			IntPtr native_transactionTime = JNIEnv.NewString (transactionTime);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_responseCode);
				__args [1] = new JniArgumentValue (native_responseMessage);
				__args [2] = new JniArgumentValue (native_responseStatus);
				__args [3] = new JniArgumentValue (native_transactionTime);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_responseCode);
				JNIEnv.DeleteLocalRef (native_responseMessage);
				JNIEnv.DeleteLocalRef (native_responseStatus);
				JNIEnv.DeleteLocalRef (native_transactionTime);
			}
		}

		public unsafe string ResponseCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='getResponseCode' and count(parameter)=0]"
			[Register ("getResponseCode", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getResponseCode.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ResponseMessage {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='getResponseMessage' and count(parameter)=0]"
			[Register ("getResponseMessage", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getResponseMessage.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ResponseStatus {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='getResponseStatus' and count(parameter)=0]"
			[Register ("getResponseStatus", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getResponseStatus.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionTime {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='getTransactionTime' and count(parameter)=0]"
			[Register ("getTransactionTime", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionTime.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Ljava/lang/String;", "")]
		public unsafe string Component1 ()
		{
			const string __id = "component1.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/lang/String;", "")]
		public unsafe string Component3 ()
		{
			const string __id = "component3.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Ljava/lang/String;", "")]
		public unsafe string Component4 ()
		{
			const string __id = "component4.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='PaymentResult']/method[@name='copy' and count(parameter)=4 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult Copy (string responseCode, string responseMessage, string responseStatus, string transactionTime)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;";
			IntPtr native_responseCode = JNIEnv.NewString (responseCode);
			IntPtr native_responseMessage = JNIEnv.NewString (responseMessage);
			IntPtr native_responseStatus = JNIEnv.NewString (responseStatus);
			IntPtr native_transactionTime = JNIEnv.NewString (transactionTime);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_responseCode);
				__args [1] = new JniArgumentValue (native_responseMessage);
				__args [2] = new JniArgumentValue (native_responseStatus);
				__args [3] = new JniArgumentValue (native_transactionTime);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_responseCode);
				JNIEnv.DeleteLocalRef (native_responseMessage);
				JNIEnv.DeleteLocalRef (native_responseStatus);
				JNIEnv.DeleteLocalRef (native_transactionTime);
			}
		}

	}
}
