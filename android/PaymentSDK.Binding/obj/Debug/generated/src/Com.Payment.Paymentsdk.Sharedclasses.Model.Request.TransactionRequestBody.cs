using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody", DoNotGenerateAcw=true)]
	public sealed partial class TransactionRequestBody : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody", typeof (TransactionRequestBody));

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

		internal TransactionRequestBody (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/constructor[@name='TransactionRequestBody' and count(parameter)=19 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.sharedclasses.model.request.CardDetails'] and parameter[3][@type='java.util.List&lt;java.lang.String&gt;'] and parameter[4][@type='java.lang.Double'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.sharedclasses.model.shared.CustomerDetails'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='com.payment.paymentsdk.sharedclasses.model.shared.ShippingDetails'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.SamPayTokenModel'] and parameter[16][@type='java.lang.String'] and parameter[17][@type='java.lang.String'] and parameter[18][@type='java.lang.String'] and parameter[19][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register (".ctor", "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)V", "")]
		public unsafe TransactionRequestBody (string @callback, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails cardDetails, global::System.Collections.Generic.IList<string> paymentMethods, global::Java.Lang.Double cartAmount, string cartCurrency, string cartDescription, string cartId, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails customerDetails, string paypageLang, string profileId, string returnX, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails shippingDetails, string tranClass, string tranType, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel samsungPayToken, string tokenise, string token, string tranReference, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native__callback = JNIEnv.NewString (@callback);
			IntPtr native_paymentMethods = global::Android.Runtime.JavaList<string>.ToLocalJniHandle (paymentMethods);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartId = JNIEnv.NewString (cartId);
			IntPtr native_paypageLang = JNIEnv.NewString (paypageLang);
			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_returnX = JNIEnv.NewString (returnX);
			IntPtr native_tranClass = JNIEnv.NewString (tranClass);
			IntPtr native_tranType = JNIEnv.NewString (tranType);
			IntPtr native_tokenise = JNIEnv.NewString (tokenise);
			IntPtr native_token = JNIEnv.NewString (token);
			IntPtr native_tranReference = JNIEnv.NewString (tranReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [19];
				__args [0] = new JniArgumentValue (native__callback);
				__args [1] = new JniArgumentValue ((cardDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cardDetails).Handle);
				__args [2] = new JniArgumentValue (native_paymentMethods);
				__args [3] = new JniArgumentValue ((cartAmount == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cartAmount).Handle);
				__args [4] = new JniArgumentValue (native_cartCurrency);
				__args [5] = new JniArgumentValue (native_cartDescription);
				__args [6] = new JniArgumentValue (native_cartId);
				__args [7] = new JniArgumentValue ((customerDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) customerDetails).Handle);
				__args [8] = new JniArgumentValue (native_paypageLang);
				__args [9] = new JniArgumentValue (native_profileId);
				__args [10] = new JniArgumentValue (native_returnX);
				__args [11] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				__args [12] = new JniArgumentValue (native_tranClass);
				__args [13] = new JniArgumentValue (native_tranType);
				__args [14] = new JniArgumentValue ((samsungPayToken == null) ? IntPtr.Zero : ((global::Java.Lang.Object) samsungPayToken).Handle);
				__args [15] = new JniArgumentValue (native_tokenise);
				__args [16] = new JniArgumentValue (native_token);
				__args [17] = new JniArgumentValue (native_tranReference);
				__args [18] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native__callback);
				JNIEnv.DeleteLocalRef (native_paymentMethods);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartId);
				JNIEnv.DeleteLocalRef (native_paypageLang);
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_returnX);
				JNIEnv.DeleteLocalRef (native_tranClass);
				JNIEnv.DeleteLocalRef (native_tranType);
				JNIEnv.DeleteLocalRef (native_tokenise);
				JNIEnv.DeleteLocalRef (native_token);
				JNIEnv.DeleteLocalRef (native_tranReference);
				global::System.GC.KeepAlive (cardDetails);
				global::System.GC.KeepAlive (paymentMethods);
				global::System.GC.KeepAlive (cartAmount);
				global::System.GC.KeepAlive (customerDetails);
				global::System.GC.KeepAlive (shippingDetails);
				global::System.GC.KeepAlive (samsungPayToken);
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

		public unsafe string Callback {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCallback' and count(parameter)=0]"
			[Register ("getCallback", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCallback.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails CardDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCardDetails' and count(parameter)=0]"
			[Register ("getCardDetails", "()Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;", "")]
			get {
				const string __id = "getCardDetails.()Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Double CartAmount {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCartAmount' and count(parameter)=0]"
			[Register ("getCartAmount", "()Ljava/lang/Double;", "")]
			get {
				const string __id = "getCartAmount.()Ljava/lang/Double;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Double> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartCurrency {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCartCurrency' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCartDescription' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCartId' and count(parameter)=0]"
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

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails CustomerDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getCustomerDetails' and count(parameter)=0]"
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

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo DeviceInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getDeviceInfo' and count(parameter)=0]"
			[Register ("getDeviceInfo", "()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;", "")]
			get {
				const string __id = "getDeviceInfo.()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::System.Collections.Generic.IList<string> PaymentMethods {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getPaymentMethods' and count(parameter)=0]"
			[Register ("getPaymentMethods", "()Ljava/util/List;", "")]
			get {
				const string __id = "getPaymentMethods.()Ljava/util/List;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Android.Runtime.JavaList<string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaypageLang {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getPaypageLang' and count(parameter)=0]"
			[Register ("getPaypageLang", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaypageLang.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ProfileId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getProfileId' and count(parameter)=0]"
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

		public unsafe string ReturnX {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getReturnX' and count(parameter)=0]"
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

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel SamsungPayToken {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getSamsungPayToken' and count(parameter)=0]"
			[Register ("getSamsungPayToken", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;", "")]
			get {
				const string __id = "getSamsungPayToken.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails ShippingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getShippingDetails' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getToken' and count(parameter)=0]"
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

		public unsafe string Tokenise {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getTokenise' and count(parameter)=0]"
			[Register ("getTokenise", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTokenise.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TranClass {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getTranClass' and count(parameter)=0]"
			[Register ("getTranClass", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTranClass.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TranReference {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getTranReference' and count(parameter)=0]"
			[Register ("getTranReference", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTranReference.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TranType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='getTranType' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component10' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component11' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component12' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component13' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component14' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component15' and count(parameter)=0]"
		[Register ("component15", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel Component15 ()
		{
			const string __id = "component15.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component16' and count(parameter)=0]"
		[Register ("component16", "()Ljava/lang/String;", "")]
		public unsafe string Component16 ()
		{
			const string __id = "component16.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component17' and count(parameter)=0]"
		[Register ("component17", "()Ljava/lang/String;", "")]
		public unsafe string Component17 ()
		{
			const string __id = "component17.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component18' and count(parameter)=0]"
		[Register ("component18", "()Ljava/lang/String;", "")]
		public unsafe string Component18 ()
		{
			const string __id = "component18.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component19' and count(parameter)=0]"
		[Register ("component19", "()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo Component19 ()
		{
			const string __id = "component19.()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails Component2 ()
		{
			const string __id = "component2.()Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/util/List;", "")]
		public unsafe global::System.Collections.Generic.IList<string> Component3 ()
		{
			const string __id = "component3.()Ljava/util/List;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Android.Runtime.JavaList<string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Ljava/lang/Double;", "")]
		public unsafe global::Java.Lang.Double Component4 ()
		{
			const string __id = "component4.()Ljava/lang/Double;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Double> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component5' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component6' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component7' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails Component8 ()
		{
			const string __id = "component8.()Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Ljava/lang/String;", "")]
		public unsafe string Component9 ()
		{
			const string __id = "component9.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='TransactionRequestBody']/method[@name='copy' and count(parameter)=19 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.sharedclasses.model.request.CardDetails'] and parameter[3][@type='java.util.List&lt;java.lang.String&gt;'] and parameter[4][@type='java.lang.Double'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.sharedclasses.model.shared.CustomerDetails'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='com.payment.paymentsdk.sharedclasses.model.shared.ShippingDetails'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.SamPayTokenModel'] and parameter[16][@type='java.lang.String'] and parameter[17][@type='java.lang.String'] and parameter[18][@type='java.lang.String'] and parameter[19][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register ("copy", "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody Copy (string @callback, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails cardDetails, global::System.Collections.Generic.IList<string> paymentMethods, global::Java.Lang.Double cartAmount, string cartCurrency, string cartDescription, string cartId, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails customerDetails, string paypageLang, string profileId, string returnX, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails shippingDetails, string tranClass, string tranType, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel samsungPayToken, string tokenise, string token, string tranReference, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo)
		{
			const string __id = "copy.(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			IntPtr native__callback = JNIEnv.NewString (@callback);
			IntPtr native_paymentMethods = global::Android.Runtime.JavaList<string>.ToLocalJniHandle (paymentMethods);
			IntPtr native_cartCurrency = JNIEnv.NewString (cartCurrency);
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			IntPtr native_cartId = JNIEnv.NewString (cartId);
			IntPtr native_paypageLang = JNIEnv.NewString (paypageLang);
			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_returnX = JNIEnv.NewString (returnX);
			IntPtr native_tranClass = JNIEnv.NewString (tranClass);
			IntPtr native_tranType = JNIEnv.NewString (tranType);
			IntPtr native_tokenise = JNIEnv.NewString (tokenise);
			IntPtr native_token = JNIEnv.NewString (token);
			IntPtr native_tranReference = JNIEnv.NewString (tranReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [19];
				__args [0] = new JniArgumentValue (native__callback);
				__args [1] = new JniArgumentValue ((cardDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cardDetails).Handle);
				__args [2] = new JniArgumentValue (native_paymentMethods);
				__args [3] = new JniArgumentValue ((cartAmount == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cartAmount).Handle);
				__args [4] = new JniArgumentValue (native_cartCurrency);
				__args [5] = new JniArgumentValue (native_cartDescription);
				__args [6] = new JniArgumentValue (native_cartId);
				__args [7] = new JniArgumentValue ((customerDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) customerDetails).Handle);
				__args [8] = new JniArgumentValue (native_paypageLang);
				__args [9] = new JniArgumentValue (native_profileId);
				__args [10] = new JniArgumentValue (native_returnX);
				__args [11] = new JniArgumentValue ((shippingDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingDetails).Handle);
				__args [12] = new JniArgumentValue (native_tranClass);
				__args [13] = new JniArgumentValue (native_tranType);
				__args [14] = new JniArgumentValue ((samsungPayToken == null) ? IntPtr.Zero : ((global::Java.Lang.Object) samsungPayToken).Handle);
				__args [15] = new JniArgumentValue (native_tokenise);
				__args [16] = new JniArgumentValue (native_token);
				__args [17] = new JniArgumentValue (native_tranReference);
				__args [18] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native__callback);
				JNIEnv.DeleteLocalRef (native_paymentMethods);
				JNIEnv.DeleteLocalRef (native_cartCurrency);
				JNIEnv.DeleteLocalRef (native_cartDescription);
				JNIEnv.DeleteLocalRef (native_cartId);
				JNIEnv.DeleteLocalRef (native_paypageLang);
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_returnX);
				JNIEnv.DeleteLocalRef (native_tranClass);
				JNIEnv.DeleteLocalRef (native_tranType);
				JNIEnv.DeleteLocalRef (native_tokenise);
				JNIEnv.DeleteLocalRef (native_token);
				JNIEnv.DeleteLocalRef (native_tranReference);
				global::System.GC.KeepAlive (cardDetails);
				global::System.GC.KeepAlive (paymentMethods);
				global::System.GC.KeepAlive (cartAmount);
				global::System.GC.KeepAlive (customerDetails);
				global::System.GC.KeepAlive (shippingDetails);
				global::System.GC.KeepAlive (samsungPayToken);
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

	}
}
