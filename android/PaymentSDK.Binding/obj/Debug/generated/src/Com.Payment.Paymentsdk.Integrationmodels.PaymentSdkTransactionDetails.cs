using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkTransactionDetails : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails", typeof (PaymentSdkTransactionDetails));

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

		internal PaymentSdkTransactionDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/constructor[@name='PaymentSdkTransactionDetails' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe PaymentSdkTransactionDetails () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/constructor[@name='PaymentSdkTransactionDetails' and count(parameter)=15 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentResult'] and parameter[9][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)V", "")]
		public unsafe PaymentSdkTransactionDetails (string transactionReference, string transactionType, string cartID, string cartDescription, string cartCurrency, string cartAmount, string payResponseReturn, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult paymentResult, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo paymentInfo, string redirectUrl, string errorCode, string errorMsg, string token, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails billingDetails, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails shippingDetails) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			IntPtr native_transactionType = JNIEnv.NewString (transactionType);
			IntPtr native_cartID = JNIEnv.NewString (cartID);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartAmount = JNIEnv.NewString (cartAmount);
			IntPtr native_payResponseReturn = JNIEnv.NewString (payResponseReturn);
			IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
			IntPtr native_errorCode = JNIEnv.NewString (errorCode);
			IntPtr native_errorMsg = JNIEnv.NewString (errorMsg);
			IntPtr native_token = JNIEnv.NewString (token);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [15];
				__args [0] = new JniArgumentValue (native_transactionReference);
				__args [1] = new JniArgumentValue (native_transactionType);
				__args [2] = new JniArgumentValue (native_cartID);
				__args [3] = new JniArgumentValue (native_cartDescription);
				__args [4] = new JniArgumentValue (native_cartCurrency);
				__args [5] = new JniArgumentValue (native_cartAmount);
				__args [6] = new JniArgumentValue (native_payResponseReturn);
				__args [7] = new JniArgumentValue ((paymentResult == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentResult).Handle);
				__args [8] = new JniArgumentValue ((paymentInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentInfo).Handle);
				__args [9] = new JniArgumentValue (native_redirectUrl);
				__args [10] = new JniArgumentValue (native_errorCode);
				__args [11] = new JniArgumentValue (native_errorMsg);
				__args [12] = new JniArgumentValue (native_token);
				__args [13] = new JniArgumentValue ((billingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) billingDetails).Handle);
				__args [14] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_transactionReference);
				JNIEnv.DeleteLocalRef (native_transactionType);
				JNIEnv.DeleteLocalRef (native_cartID);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartAmount);
				JNIEnv.DeleteLocalRef (native_payResponseReturn);
				JNIEnv.DeleteLocalRef (native_redirectUrl);
				JNIEnv.DeleteLocalRef (native_errorCode);
				JNIEnv.DeleteLocalRef (native_errorMsg);
				JNIEnv.DeleteLocalRef (native_token);
				global::System.GC.KeepAlive (paymentResult);
				global::System.GC.KeepAlive (paymentInfo);
				global::System.GC.KeepAlive (billingDetails);
				global::System.GC.KeepAlive (shippingDetails);
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails BillingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getBillingDetails' and count(parameter)=0]"
			[Register ("getBillingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
			get {
				const string __id = "getBillingDetails.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartAmount {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getCartAmount' and count(parameter)=0]"
			[Register ("getCartAmount", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartAmount.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartCurrency {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getCartCurrency' and count(parameter)=0]"
			[Register ("getCartCurrency", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartCurrency.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartDescription {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getCartDescription' and count(parameter)=0]"
			[Register ("getCartDescription", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartDescription.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartID {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getCartID' and count(parameter)=0]"
			[Register ("getCartID", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartID.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ErrorCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getErrorCode' and count(parameter)=0]"
			[Register ("getErrorCode", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getErrorCode.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ErrorMsg {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getErrorMsg' and count(parameter)=0]"
			[Register ("getErrorMsg", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getErrorMsg.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PayResponseReturn {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getPayResponseReturn' and count(parameter)=0]"
			[Register ("getPayResponseReturn", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPayResponseReturn.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo PaymentInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getPaymentInfo' and count(parameter)=0]"
			[Register ("getPaymentInfo", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "")]
			get {
				const string __id = "getPaymentInfo.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult PaymentResult {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getPaymentResult' and count(parameter)=0]"
			[Register ("getPaymentResult", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;", "")]
			get {
				const string __id = "getPaymentResult.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string RedirectUrl {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getRedirectUrl' and count(parameter)=0]"
			[Register ("getRedirectUrl", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getRedirectUrl.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails ShippingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getShippingDetails' and count(parameter)=0]"
			[Register ("getShippingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "")]
			get {
				const string __id = "getShippingDetails.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Token {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getToken' and count(parameter)=0]"
			[Register ("getToken", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getToken.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionReference {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getTransactionReference' and count(parameter)=0]"
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

		public unsafe string TransactionType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='getTransactionType' and count(parameter)=0]"
			[Register ("getTransactionType", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionType.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component10' and count(parameter)=0]"
		[Register ("component10", "()Ljava/lang/String;", "")]
		public unsafe string Component10 ()
		{
			const string __id = "component10.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component11' and count(parameter)=0]"
		[Register ("component11", "()Ljava/lang/String;", "")]
		public unsafe string Component11 ()
		{
			const string __id = "component11.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component12' and count(parameter)=0]"
		[Register ("component12", "()Ljava/lang/String;", "")]
		public unsafe string Component12 ()
		{
			const string __id = "component12.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component13' and count(parameter)=0]"
		[Register ("component13", "()Ljava/lang/String;", "")]
		public unsafe string Component13 ()
		{
			const string __id = "component13.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component14' and count(parameter)=0]"
		[Register ("component14", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails Component14 ()
		{
			const string __id = "component14.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component15' and count(parameter)=0]"
		[Register ("component15", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails Component15 ()
		{
			const string __id = "component15.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component3' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component4' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component5' and count(parameter)=0]"
		[Register ("component5", "()Ljava/lang/String;", "")]
		public unsafe string Component5 ()
		{
			const string __id = "component5.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component6' and count(parameter)=0]"
		[Register ("component6", "()Ljava/lang/String;", "")]
		public unsafe string Component6 ()
		{
			const string __id = "component6.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component7' and count(parameter)=0]"
		[Register ("component7", "()Ljava/lang/String;", "")]
		public unsafe string Component7 ()
		{
			const string __id = "component7.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult Component8 ()
		{
			const string __id = "component8.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo Component9 ()
		{
			const string __id = "component9.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='copy' and count(parameter)=15 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentResult'] and parameter[9][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails Copy (string transactionReference, string transactionType, string cartID, string cartDescription, string cartCurrency, string cartAmount, string payResponseReturn, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult paymentResult, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo paymentInfo, string redirectUrl, string errorCode, string errorMsg, string token, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails billingDetails, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails shippingDetails)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;";
			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			IntPtr native_transactionType = JNIEnv.NewString (transactionType);
			IntPtr native_cartID = JNIEnv.NewString (cartID);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartAmount = JNIEnv.NewString (cartAmount);
			IntPtr native_payResponseReturn = JNIEnv.NewString (payResponseReturn);
			IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
			IntPtr native_errorCode = JNIEnv.NewString (errorCode);
			IntPtr native_errorMsg = JNIEnv.NewString (errorMsg);
			IntPtr native_token = JNIEnv.NewString (token);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [15];
				__args [0] = new JniArgumentValue (native_transactionReference);
				__args [1] = new JniArgumentValue (native_transactionType);
				__args [2] = new JniArgumentValue (native_cartID);
				__args [3] = new JniArgumentValue (native_cartDescription);
				__args [4] = new JniArgumentValue (native_cartCurrency);
				__args [5] = new JniArgumentValue (native_cartAmount);
				__args [6] = new JniArgumentValue (native_payResponseReturn);
				__args [7] = new JniArgumentValue ((paymentResult == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentResult).Handle);
				__args [8] = new JniArgumentValue ((paymentInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentInfo).Handle);
				__args [9] = new JniArgumentValue (native_redirectUrl);
				__args [10] = new JniArgumentValue (native_errorCode);
				__args [11] = new JniArgumentValue (native_errorMsg);
				__args [12] = new JniArgumentValue (native_token);
				__args [13] = new JniArgumentValue ((billingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) billingDetails).Handle);
				__args [14] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_transactionReference);
				JNIEnv.DeleteLocalRef (native_transactionType);
				JNIEnv.DeleteLocalRef (native_cartID);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartAmount);
				JNIEnv.DeleteLocalRef (native_payResponseReturn);
				JNIEnv.DeleteLocalRef (native_redirectUrl);
				JNIEnv.DeleteLocalRef (native_errorCode);
				JNIEnv.DeleteLocalRef (native_errorMsg);
				JNIEnv.DeleteLocalRef (native_token);
				global::System.GC.KeepAlive (paymentResult);
				global::System.GC.KeepAlive (paymentInfo);
				global::System.GC.KeepAlive (billingDetails);
				global::System.GC.KeepAlive (shippingDetails);
			}
		}

	}
}
