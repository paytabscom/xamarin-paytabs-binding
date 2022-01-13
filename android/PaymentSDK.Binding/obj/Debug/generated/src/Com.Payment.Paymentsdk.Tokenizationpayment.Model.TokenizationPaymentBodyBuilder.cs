using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Tokenizationpayment.Model {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder", DoNotGenerateAcw=true)]
	public sealed partial class TokenizationPaymentBodyBuilder : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder", typeof (TokenizationPaymentBodyBuilder));

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

		internal TokenizationPaymentBodyBuilder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/constructor[@name='TokenizationPaymentBodyBuilder' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe TokenizationPaymentBodyBuilder (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/method[@name='build' and count(parameter)=0]"
		[Register ("build", "()Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody Build ()
		{
			const string __id = "build.()Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/method[@name='setDeviceInfo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register ("setDeviceInfo", "(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder SetDeviceInfo (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo)
		{
			const string __id = "setDeviceInfo.(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/method[@name='setToken' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setToken", "(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder SetToken (string token)
		{
			const string __id = "setToken.(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;";
			IntPtr native_token = JNIEnv.NewString (token);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_token);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_token);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/method[@name='setTokenFormat' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setTokenFormat", "(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder SetTokenFormat (string tokenFormat)
		{
			const string __id = "setTokenFormat.(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;";
			IntPtr native_tokenFormat = JNIEnv.NewString (tokenFormat);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_tokenFormat);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_tokenFormat);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.model']/class[@name='TokenizationPaymentBodyBuilder']/method[@name='setTransactionReference' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setTransactionReference", "(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder SetTransactionReference (string transRef)
		{
			const string __id = "setTransactionReference.(Ljava/lang/String;)Lcom/payment/paymentsdk/tokenizationpayment/model/TokenizationPaymentBodyBuilder;";
			IntPtr native_transRef = JNIEnv.NewString (transRef);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_transRef);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.TokenizationPaymentBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_transRef);
			}
		}

	}
}
