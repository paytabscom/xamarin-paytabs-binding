using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Response {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody", DoNotGenerateAcw=true)]
	public sealed partial class TransactionResponseBody : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody", typeof (TransactionResponseBody));

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

		internal TransactionResponseBody (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/constructor[@name='TransactionResponseBody' and count(parameter)=15 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='com.payment.paymentsdk.sharedclasses.model.shared.CustomerDetails'] and parameter[8][@type='com.payment.paymentsdk.sharedclasses.model.response.PaymentInfo'] and parameter[9][@type='com.payment.paymentsdk.sharedclasses.model.response.PaymentResult'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='com.payment.paymentsdk.sharedclasses.model.shared.ShippingDetails'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe TransactionResponseBody (string cartAmount, string code, string message, string cartCurrency, string cartDescription, string cartId, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails customerDetails, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo paymentInfo, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult paymentResult, string returnX, string redirectUrl, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails shippingDetails, string token, string tranRef, string tranType) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_cartAmount = JNIEnv.NewString (cartAmount);
			IntPtr native_code = JNIEnv.NewString (code);
			IntPtr native_message = JNIEnv.NewString (message);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartId = JNIEnv.NewString (cartId);
			IntPtr native_returnX = JNIEnv.NewString (returnX);
			IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
			IntPtr native_token = JNIEnv.NewString (token);
			IntPtr native_tranRef = JNIEnv.NewString (tranRef);
			IntPtr native_tranType = JNIEnv.NewString (tranType);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [15];
				__args [0] = new JniArgumentValue (native_cartAmount);
				__args [1] = new JniArgumentValue (native_code);
				__args [2] = new JniArgumentValue (native_message);
				__args [3] = new JniArgumentValue (native_cartCurrency);
				__args [4] = new JniArgumentValue (native_cartDescription);
				__args [5] = new JniArgumentValue (native_cartId);
				__args [6] = new JniArgumentValue ((customerDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) customerDetails).Handle);
				__args [7] = new JniArgumentValue ((paymentInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentInfo).Handle);
				__args [8] = new JniArgumentValue ((paymentResult == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentResult).Handle);
				__args [9] = new JniArgumentValue (native_returnX);
				__args [10] = new JniArgumentValue (native_redirectUrl);
				__args [11] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				__args [12] = new JniArgumentValue (native_token);
				__args [13] = new JniArgumentValue (native_tranRef);
				__args [14] = new JniArgumentValue (native_tranType);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_cartAmount);
				JNIEnv.DeleteLocalRef (native_code);
				JNIEnv.DeleteLocalRef (native_message);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartId);
				JNIEnv.DeleteLocalRef (native_returnX);
				JNIEnv.DeleteLocalRef (native_redirectUrl);
				JNIEnv.DeleteLocalRef (native_token);
				JNIEnv.DeleteLocalRef (native_tranRef);
				JNIEnv.DeleteLocalRef (native_tranType);
				global::System.GC.KeepAlive (customerDetails);
				global::System.GC.KeepAlive (paymentInfo);
				global::System.GC.KeepAlive (paymentResult);
				global::System.GC.KeepAlive (shippingDetails);
			}
		}

		public unsafe string CartAmount {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCartAmount' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCartCurrency' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCartDescription' and count(parameter)=0]"
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

		public unsafe string CartId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCartId' and count(parameter)=0]"
			[Register ("getCartId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Code {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCode' and count(parameter)=0]"
			[Register ("getCode", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCode.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails CustomerDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getCustomerDetails' and count(parameter)=0]"
			[Register ("getCustomerDetails", "()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;", "")]
			get {
				const string __id = "getCustomerDetails.()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Message {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getMessage' and count(parameter)=0]"
			[Register ("getMessage", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getMessage.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo PaymentInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getPaymentInfo' and count(parameter)=0]"
			[Register ("getPaymentInfo", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "")]
			get {
				const string __id = "getPaymentInfo.()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult PaymentResult {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getPaymentResult' and count(parameter)=0]"
			[Register ("getPaymentResult", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "")]
			get {
				const string __id = "getPaymentResult.()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string RedirectUrl {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getRedirectUrl' and count(parameter)=0]"
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

		public unsafe string ReturnX {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getReturnX' and count(parameter)=0]"
			[Register ("getReturnX", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getReturnX.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails ShippingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getShippingDetails' and count(parameter)=0]"
			[Register ("getShippingDetails", "()Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;", "")]
			get {
				const string __id = "getShippingDetails.()Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Token {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getToken' and count(parameter)=0]"
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

		public unsafe string TranRef {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getTranRef' and count(parameter)=0]"
			[Register ("getTranRef", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTranRef.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TranType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='getTranType' and count(parameter)=0]"
			[Register ("getTranType", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTranType.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component10' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component11' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component12' and count(parameter)=0]"
		[Register ("component12", "()Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails Component12 ()
		{
			const string __id = "component12.()Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component13' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component14' and count(parameter)=0]"
		[Register ("component14", "()Ljava/lang/String;", "")]
		public unsafe string Component14 ()
		{
			const string __id = "component14.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component15' and count(parameter)=0]"
		[Register ("component15", "()Ljava/lang/String;", "")]
		public unsafe string Component15 ()
		{
			const string __id = "component15.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component3' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component4' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component5' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component6' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component7' and count(parameter)=0]"
		[Register ("component7", "()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails Component7 ()
		{
			const string __id = "component7.()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo Component8 ()
		{
			const string __id = "component8.()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult Component9 ()
		{
			const string __id = "component9.()Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBody']/method[@name='copy' and count(parameter)=15 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='com.payment.paymentsdk.sharedclasses.model.shared.CustomerDetails'] and parameter[8][@type='com.payment.paymentsdk.sharedclasses.model.response.PaymentInfo'] and parameter[9][@type='com.payment.paymentsdk.sharedclasses.model.response.PaymentResult'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='com.payment.paymentsdk.sharedclasses.model.shared.ShippingDetails'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.TransactionResponseBody Copy (string cartAmount, string code, string message, string cartCurrency, string cartDescription, string cartId, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails customerDetails, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentInfo paymentInfo, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.PaymentResult paymentResult, string returnX, string redirectUrl, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails shippingDetails, string token, string tranRef, string tranType)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentInfo;Lcom/payment/paymentsdk/sharedclasses/model/response/PaymentResult;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;";
			IntPtr native_cartAmount = JNIEnv.NewString (cartAmount);
			IntPtr native_code = JNIEnv.NewString (code);
			IntPtr native_message = JNIEnv.NewString (message);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartId = JNIEnv.NewString (cartId);
			IntPtr native_returnX = JNIEnv.NewString (returnX);
			IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
			IntPtr native_token = JNIEnv.NewString (token);
			IntPtr native_tranRef = JNIEnv.NewString (tranRef);
			IntPtr native_tranType = JNIEnv.NewString (tranType);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [15];
				__args [0] = new JniArgumentValue (native_cartAmount);
				__args [1] = new JniArgumentValue (native_code);
				__args [2] = new JniArgumentValue (native_message);
				__args [3] = new JniArgumentValue (native_cartCurrency);
				__args [4] = new JniArgumentValue (native_cartDescription);
				__args [5] = new JniArgumentValue (native_cartId);
				__args [6] = new JniArgumentValue ((customerDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) customerDetails).Handle);
				__args [7] = new JniArgumentValue ((paymentInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentInfo).Handle);
				__args [8] = new JniArgumentValue ((paymentResult == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentResult).Handle);
				__args [9] = new JniArgumentValue (native_returnX);
				__args [10] = new JniArgumentValue (native_redirectUrl);
				__args [11] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				__args [12] = new JniArgumentValue (native_token);
				__args [13] = new JniArgumentValue (native_tranRef);
				__args [14] = new JniArgumentValue (native_tranType);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.TransactionResponseBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cartAmount);
				JNIEnv.DeleteLocalRef (native_code);
				JNIEnv.DeleteLocalRef (native_message);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartId);
				JNIEnv.DeleteLocalRef (native_returnX);
				JNIEnv.DeleteLocalRef (native_redirectUrl);
				JNIEnv.DeleteLocalRef (native_token);
				JNIEnv.DeleteLocalRef (native_tranRef);
				JNIEnv.DeleteLocalRef (native_tranType);
				global::System.GC.KeepAlive (customerDetails);
				global::System.GC.KeepAlive (paymentInfo);
				global::System.GC.KeepAlive (paymentResult);
				global::System.GC.KeepAlive (shippingDetails);
			}
		}

	}
}
