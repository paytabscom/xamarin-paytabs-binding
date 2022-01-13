using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/QueryTransactionRequestBody", DoNotGenerateAcw=true)]
	public sealed partial class QueryTransactionRequestBody : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/QueryTransactionRequestBody", typeof (QueryTransactionRequestBody));

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

		internal QueryTransactionRequestBody (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/constructor[@name='QueryTransactionRequestBody' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe QueryTransactionRequestBody (string profileId, string transactionReference) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_profileId);
				__args [1] = new JniArgumentValue (native_transactionReference);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_transactionReference);
			}
		}

		public unsafe string ProfileId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/method[@name='getProfileId' and count(parameter)=0]"
			[Register ("getProfileId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getProfileId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionReference {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/method[@name='getTransactionReference' and count(parameter)=0]"
			[Register ("getTransactionReference", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionReference.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='QueryTransactionRequestBody']/method[@name='copy' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/QueryTransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.QueryTransactionRequestBody Copy (string profileId, string transactionReference)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/QueryTransactionRequestBody;";
			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_profileId);
				__args [1] = new JniArgumentValue (native_transactionReference);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.QueryTransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_transactionReference);
			}
		}

	}
}
