using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.Model {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder", DoNotGenerateAcw=true)]
	public sealed partial class CreditCardRequestBodyBuilder : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder", typeof (CreditCardRequestBodyBuilder));

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

		internal CreditCardRequestBodyBuilder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/constructor[@name='CreditCardRequestBodyBuilder' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe CreditCardRequestBodyBuilder (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='build' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setCardNumber' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCardNumber", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetCardNumber (string cardNumber)
		{
			const string __id = "setCardNumber.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cardNumber);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cardNumber);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setCvv' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCvv", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetCvv (string cvv)
		{
			const string __id = "setCvv.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			IntPtr native_cvv = JNIEnv.NewString (cvv);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cvv);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cvv);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setDeviceInfo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register ("setDeviceInfo", "(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetDeviceInfo (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo)
		{
			const string __id = "setDeviceInfo.(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setExpMonth' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setExpMonth", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetExpMonth (string expMonth)
		{
			const string __id = "setExpMonth.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			IntPtr native_expMonth = JNIEnv.NewString (expMonth);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_expMonth);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_expMonth);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setExpYear' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setExpYear", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetExpYear (string expYear)
		{
			const string __id = "setExpYear.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			IntPtr native_expYear = JNIEnv.NewString (expYear);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_expYear);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_expYear);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setHolderName' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setHolderName", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetHolderName (string holderName)
		{
			const string __id = "setHolderName.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			IntPtr native_holderName = JNIEnv.NewString (holderName);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_holderName);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_holderName);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model']/class[@name='CreditCardRequestBodyBuilder']/method[@name='setShouldTokenise' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setShouldTokenise", "(Z)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder SetShouldTokenise (bool shouldTokenise)
		{
			const string __id = "setShouldTokenise.(Z)Lcom/payment/paymentsdk/creditcard/model/CreditCardRequestBodyBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (shouldTokenise);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.Model.CreditCardRequestBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
