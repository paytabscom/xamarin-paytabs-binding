using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel", DoNotGenerateAcw=true)]
	public sealed partial class SamPayTokenModel : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel", typeof (SamPayTokenModel));

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

		internal SamPayTokenModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/constructor[@name='SamPayTokenModel' and count(parameter)=11 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.DS'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.PaymentShippingAddress'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='boolean']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;Ljava/lang/String;Z)V", "")]
		public unsafe SamPayTokenModel (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS dS, string merchantRef, string method, string paymentCardBrand, string paymentCurrencyType, string paymentEcoOptIn, string paymentLast4Dpan, string paymentLast4Fpan, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress paymentShippingAddress, string paymentShippingMethod, bool recurringPayment) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;Ljava/lang/String;Z)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_merchantRef = JNIEnv.NewString (merchantRef);
			IntPtr native_method = JNIEnv.NewString (method);
			IntPtr native_paymentCardBrand = JNIEnv.NewString (paymentCardBrand);
			IntPtr native_paymentCurrencyType = JNIEnv.NewString (paymentCurrencyType);
			IntPtr native_paymentEcoOptIn = JNIEnv.NewString (paymentEcoOptIn);
			IntPtr native_paymentLast4Dpan = JNIEnv.NewString (paymentLast4Dpan);
			IntPtr native_paymentLast4Fpan = JNIEnv.NewString (paymentLast4Fpan);
			IntPtr native_paymentShippingMethod = JNIEnv.NewString (paymentShippingMethod);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [11];
				__args [0] = new JniArgumentValue ((dS == null) ? IntPtr.Zero : ((global::Java.Lang.Object) dS).Handle);
				__args [1] = new JniArgumentValue (native_merchantRef);
				__args [2] = new JniArgumentValue (native_method);
				__args [3] = new JniArgumentValue (native_paymentCardBrand);
				__args [4] = new JniArgumentValue (native_paymentCurrencyType);
				__args [5] = new JniArgumentValue (native_paymentEcoOptIn);
				__args [6] = new JniArgumentValue (native_paymentLast4Dpan);
				__args [7] = new JniArgumentValue (native_paymentLast4Fpan);
				__args [8] = new JniArgumentValue ((paymentShippingAddress == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentShippingAddress).Handle);
				__args [9] = new JniArgumentValue (native_paymentShippingMethod);
				__args [10] = new JniArgumentValue (recurringPayment);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_merchantRef);
				JNIEnv.DeleteLocalRef (native_method);
				JNIEnv.DeleteLocalRef (native_paymentCardBrand);
				JNIEnv.DeleteLocalRef (native_paymentCurrencyType);
				JNIEnv.DeleteLocalRef (native_paymentEcoOptIn);
				JNIEnv.DeleteLocalRef (native_paymentLast4Dpan);
				JNIEnv.DeleteLocalRef (native_paymentLast4Fpan);
				JNIEnv.DeleteLocalRef (native_paymentShippingMethod);
				global::System.GC.KeepAlive (dS);
				global::System.GC.KeepAlive (paymentShippingAddress);
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS DS {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getDS' and count(parameter)=0]"
			[Register ("getDS", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;", "")]
			get {
				const string __id = "getDS.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string MerchantRef {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getMerchantRef' and count(parameter)=0]"
			[Register ("getMerchantRef", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getMerchantRef.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Method {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getMethod' and count(parameter)=0]"
			[Register ("getMethod", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getMethod.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentCardBrand {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentCardBrand' and count(parameter)=0]"
			[Register ("getPaymentCardBrand", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentCardBrand.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentCurrencyType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentCurrencyType' and count(parameter)=0]"
			[Register ("getPaymentCurrencyType", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentCurrencyType.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentEcoOptIn {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentEcoOptIn' and count(parameter)=0]"
			[Register ("getPaymentEcoOptIn", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentEcoOptIn.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentLast4Dpan {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentLast4Dpan' and count(parameter)=0]"
			[Register ("getPaymentLast4Dpan", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentLast4Dpan.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentLast4Fpan {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentLast4Fpan' and count(parameter)=0]"
			[Register ("getPaymentLast4Fpan", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentLast4Fpan.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress PaymentShippingAddress {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentShippingAddress' and count(parameter)=0]"
			[Register ("getPaymentShippingAddress", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;", "")]
			get {
				const string __id = "getPaymentShippingAddress.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string PaymentShippingMethod {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getPaymentShippingMethod' and count(parameter)=0]"
			[Register ("getPaymentShippingMethod", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPaymentShippingMethod.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe bool RecurringPayment {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='getRecurringPayment' and count(parameter)=0]"
			[Register ("getRecurringPayment", "()Z", "")]
			get {
				const string __id = "getRecurringPayment.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS Component1 ()
		{
			const string __id = "component1.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component10' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component11' and count(parameter)=0]"
		[Register ("component11", "()Z", "")]
		public unsafe bool Component11 ()
		{
			const string __id = "component11.()Z";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component3' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component4' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component5' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component6' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component7' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Ljava/lang/String;", "")]
		public unsafe string Component8 ()
		{
			const string __id = "component8.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress Component9 ()
		{
			const string __id = "component9.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='SamPayTokenModel']/method[@name='copy' and count(parameter)=11 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.DS'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.PaymentShippingAddress'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='boolean']]"
		[Register ("copy", "(Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;Ljava/lang/String;Z)Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel Copy (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.DS dS, string merchantRef, string method, string paymentCardBrand, string paymentCurrencyType, string paymentEcoOptIn, string paymentLast4Dpan, string paymentLast4Fpan, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress paymentShippingAddress, string paymentShippingMethod, bool recurringPayment)
		{
			const string __id = "copy.(Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/DS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;Ljava/lang/String;Z)Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/SamPayTokenModel;";
			IntPtr native_merchantRef = JNIEnv.NewString (merchantRef);
			IntPtr native_method = JNIEnv.NewString (method);
			IntPtr native_paymentCardBrand = JNIEnv.NewString (paymentCardBrand);
			IntPtr native_paymentCurrencyType = JNIEnv.NewString (paymentCurrencyType);
			IntPtr native_paymentEcoOptIn = JNIEnv.NewString (paymentEcoOptIn);
			IntPtr native_paymentLast4Dpan = JNIEnv.NewString (paymentLast4Dpan);
			IntPtr native_paymentLast4Fpan = JNIEnv.NewString (paymentLast4Fpan);
			IntPtr native_paymentShippingMethod = JNIEnv.NewString (paymentShippingMethod);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [11];
				__args [0] = new JniArgumentValue ((dS == null) ? IntPtr.Zero : ((global::Java.Lang.Object) dS).Handle);
				__args [1] = new JniArgumentValue (native_merchantRef);
				__args [2] = new JniArgumentValue (native_method);
				__args [3] = new JniArgumentValue (native_paymentCardBrand);
				__args [4] = new JniArgumentValue (native_paymentCurrencyType);
				__args [5] = new JniArgumentValue (native_paymentEcoOptIn);
				__args [6] = new JniArgumentValue (native_paymentLast4Dpan);
				__args [7] = new JniArgumentValue (native_paymentLast4Fpan);
				__args [8] = new JniArgumentValue ((paymentShippingAddress == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentShippingAddress).Handle);
				__args [9] = new JniArgumentValue (native_paymentShippingMethod);
				__args [10] = new JniArgumentValue (recurringPayment);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.SamPayTokenModel> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_merchantRef);
				JNIEnv.DeleteLocalRef (native_method);
				JNIEnv.DeleteLocalRef (native_paymentCardBrand);
				JNIEnv.DeleteLocalRef (native_paymentCurrencyType);
				JNIEnv.DeleteLocalRef (native_paymentEcoOptIn);
				JNIEnv.DeleteLocalRef (native_paymentLast4Dpan);
				JNIEnv.DeleteLocalRef (native_paymentLast4Fpan);
				JNIEnv.DeleteLocalRef (native_paymentShippingMethod);
				global::System.GC.KeepAlive (dS);
				global::System.GC.KeepAlive (paymentShippingAddress);
			}
		}

	}
}
