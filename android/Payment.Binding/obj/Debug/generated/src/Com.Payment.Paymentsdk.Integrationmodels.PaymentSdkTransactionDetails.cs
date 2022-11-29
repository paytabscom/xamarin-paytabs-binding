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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/constructor[@name='PaymentSdkTransactionDetails' and count(parameter)=20 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentResult'] and parameter[9][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails'] and parameter[16][@type='java.lang.Boolean'] and parameter[17][@type='java.lang.Boolean'] and parameter[18][@type='java.lang.Boolean'] and parameter[19][@type='java.lang.Boolean'] and parameter[20][@type='java.lang.Boolean']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "")]
		public unsafe PaymentSdkTransactionDetails (string p0, string p1, string p2, string p3, string p4, string p5, string p6, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult p7, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo p8, string p9, string p10, string p11, string p12, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails p13, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails p14, global::Java.Lang.Boolean p15, global::Java.Lang.Boolean p16, global::Java.Lang.Boolean p17, global::Java.Lang.Boolean p18, global::Java.Lang.Boolean p19) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_p0 = JNIEnv.NewString (p0);
			IntPtr native_p1 = JNIEnv.NewString (p1);
			IntPtr native_p2 = JNIEnv.NewString (p2);
			IntPtr native_p3 = JNIEnv.NewString (p3);
			IntPtr native_p4 = JNIEnv.NewString (p4);
			IntPtr native_p5 = JNIEnv.NewString (p5);
			IntPtr native_p6 = JNIEnv.NewString (p6);
			IntPtr native_p9 = JNIEnv.NewString (p9);
			IntPtr native_p10 = JNIEnv.NewString (p10);
			IntPtr native_p11 = JNIEnv.NewString (p11);
			IntPtr native_p12 = JNIEnv.NewString (p12);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [20];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (native_p1);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue (native_p3);
				__args [4] = new JniArgumentValue (native_p4);
				__args [5] = new JniArgumentValue (native_p5);
				__args [6] = new JniArgumentValue (native_p6);
				__args [7] = new JniArgumentValue ((p7 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p7).Handle);
				__args [8] = new JniArgumentValue ((p8 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p8).Handle);
				__args [9] = new JniArgumentValue (native_p9);
				__args [10] = new JniArgumentValue (native_p10);
				__args [11] = new JniArgumentValue (native_p11);
				__args [12] = new JniArgumentValue (native_p12);
				__args [13] = new JniArgumentValue ((p13 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p13).Handle);
				__args [14] = new JniArgumentValue ((p14 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p14).Handle);
				__args [15] = new JniArgumentValue ((p15 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p15).Handle);
				__args [16] = new JniArgumentValue ((p16 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p16).Handle);
				__args [17] = new JniArgumentValue ((p17 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p17).Handle);
				__args [18] = new JniArgumentValue ((p18 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p18).Handle);
				__args [19] = new JniArgumentValue ((p19 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p19).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				JNIEnv.DeleteLocalRef (native_p1);
				JNIEnv.DeleteLocalRef (native_p2);
				JNIEnv.DeleteLocalRef (native_p3);
				JNIEnv.DeleteLocalRef (native_p4);
				JNIEnv.DeleteLocalRef (native_p5);
				JNIEnv.DeleteLocalRef (native_p6);
				JNIEnv.DeleteLocalRef (native_p9);
				JNIEnv.DeleteLocalRef (native_p10);
				JNIEnv.DeleteLocalRef (native_p11);
				JNIEnv.DeleteLocalRef (native_p12);
				global::System.GC.KeepAlive (p7);
				global::System.GC.KeepAlive (p8);
				global::System.GC.KeepAlive (p13);
				global::System.GC.KeepAlive (p14);
				global::System.GC.KeepAlive (p15);
				global::System.GC.KeepAlive (p16);
				global::System.GC.KeepAlive (p17);
				global::System.GC.KeepAlive (p18);
				global::System.GC.KeepAlive (p19);
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component16' and count(parameter)=0]"
		[Register ("component16", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component16 ()
		{
			const string __id = "component16.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component17' and count(parameter)=0]"
		[Register ("component17", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component17 ()
		{
			const string __id = "component17.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component18' and count(parameter)=0]"
		[Register ("component18", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component18 ()
		{
			const string __id = "component18.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component19' and count(parameter)=0]"
		[Register ("component19", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component19 ()
		{
			const string __id = "component19.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='component20' and count(parameter)=0]"
		[Register ("component20", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component20 ()
		{
			const string __id = "component20.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='copy' and count(parameter)=20 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentResult'] and parameter[9][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkPaymentInfo'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails'] and parameter[16][@type='java.lang.Boolean'] and parameter[17][@type='java.lang.Boolean'] and parameter[18][@type='java.lang.Boolean'] and parameter[19][@type='java.lang.Boolean'] and parameter[20][@type='java.lang.Boolean']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails Copy (string p0, string p1, string p2, string p3, string p4, string p5, string p6, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentResult p7, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkPaymentInfo p8, string p9, string p10, string p11, string p12, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails p13, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails p14, global::Java.Lang.Boolean p15, global::Java.Lang.Boolean p16, global::Java.Lang.Boolean p17, global::Java.Lang.Boolean p18, global::Java.Lang.Boolean p19)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentResult;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkPaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			IntPtr native_p1 = JNIEnv.NewString (p1);
			IntPtr native_p2 = JNIEnv.NewString (p2);
			IntPtr native_p3 = JNIEnv.NewString (p3);
			IntPtr native_p4 = JNIEnv.NewString (p4);
			IntPtr native_p5 = JNIEnv.NewString (p5);
			IntPtr native_p6 = JNIEnv.NewString (p6);
			IntPtr native_p9 = JNIEnv.NewString (p9);
			IntPtr native_p10 = JNIEnv.NewString (p10);
			IntPtr native_p11 = JNIEnv.NewString (p11);
			IntPtr native_p12 = JNIEnv.NewString (p12);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [20];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (native_p1);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue (native_p3);
				__args [4] = new JniArgumentValue (native_p4);
				__args [5] = new JniArgumentValue (native_p5);
				__args [6] = new JniArgumentValue (native_p6);
				__args [7] = new JniArgumentValue ((p7 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p7).Handle);
				__args [8] = new JniArgumentValue ((p8 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p8).Handle);
				__args [9] = new JniArgumentValue (native_p9);
				__args [10] = new JniArgumentValue (native_p10);
				__args [11] = new JniArgumentValue (native_p11);
				__args [12] = new JniArgumentValue (native_p12);
				__args [13] = new JniArgumentValue ((p13 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p13).Handle);
				__args [14] = new JniArgumentValue ((p14 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p14).Handle);
				__args [15] = new JniArgumentValue ((p15 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p15).Handle);
				__args [16] = new JniArgumentValue ((p16 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p16).Handle);
				__args [17] = new JniArgumentValue ((p17 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p17).Handle);
				__args [18] = new JniArgumentValue ((p18 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p18).Handle);
				__args [19] = new JniArgumentValue ((p19 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p19).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				JNIEnv.DeleteLocalRef (native_p1);
				JNIEnv.DeleteLocalRef (native_p2);
				JNIEnv.DeleteLocalRef (native_p3);
				JNIEnv.DeleteLocalRef (native_p4);
				JNIEnv.DeleteLocalRef (native_p5);
				JNIEnv.DeleteLocalRef (native_p6);
				JNIEnv.DeleteLocalRef (native_p9);
				JNIEnv.DeleteLocalRef (native_p10);
				JNIEnv.DeleteLocalRef (native_p11);
				JNIEnv.DeleteLocalRef (native_p12);
				global::System.GC.KeepAlive (p7);
				global::System.GC.KeepAlive (p8);
				global::System.GC.KeepAlive (p13);
				global::System.GC.KeepAlive (p14);
				global::System.GC.KeepAlive (p15);
				global::System.GC.KeepAlive (p16);
				global::System.GC.KeepAlive (p17);
				global::System.GC.KeepAlive (p18);
				global::System.GC.KeepAlive (p19);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='isAuthorized' and count(parameter)=0]"
		[Register ("isAuthorized", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean IsAuthorized ()
		{
			const string __id = "isAuthorized.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='isOnHold' and count(parameter)=0]"
		[Register ("isOnHold", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean IsOnHold ()
		{
			const string __id = "isOnHold.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='isPending' and count(parameter)=0]"
		[Register ("isPending", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean IsPending ()
		{
			const string __id = "isPending.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='isProcessed' and count(parameter)=0]"
		[Register ("isProcessed", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean IsProcessed ()
		{
			const string __id = "isProcessed.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionDetails']/method[@name='isSuccess' and count(parameter)=0]"
		[Register ("isSuccess", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean IsSuccess ()
		{
			const string __id = "isSuccess.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
