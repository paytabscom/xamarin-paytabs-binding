using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkConfigBuilder", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkConfigBuilder : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/PaymentSdkConfigBuilder", typeof (PaymentSdkConfigBuilder));

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

		internal PaymentSdkConfigBuilder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/constructor[@name='PaymentSdkConfigBuilder' and count(parameter)=5 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='double'] and parameter[5][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "")]
		public unsafe PaymentSdkConfigBuilder (string profileId, string serverKey, string clientKey, double amount, string currencyCode) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_serverKey = JNIEnv.NewString (serverKey);
			IntPtr native_clientKey = JNIEnv.NewString (clientKey);
			IntPtr native_currencyCode = JNIEnv.NewString (currencyCode);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue (native_profileId);
				__args [1] = new JniArgumentValue (native_serverKey);
				__args [2] = new JniArgumentValue (native_clientKey);
				__args [3] = new JniArgumentValue (amount);
				__args [4] = new JniArgumentValue (native_currencyCode);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_serverKey);
				JNIEnv.DeleteLocalRef (native_clientKey);
				JNIEnv.DeleteLocalRef (native_currencyCode);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='build' and count(parameter)=0]"
		[Register ("build", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails Build ()
		{
			const string __id = "build.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='forceShippingInfo' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("forceShippingInfo", "(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder ForceShippingInfo (bool forceShippingDataValidation)
		{
			const string __id = "forceShippingInfo.(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (forceShippingDataValidation);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='hideCardScanner' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("hideCardScanner", "(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder HideCardScanner (bool hideCardScanner)
		{
			const string __id = "hideCardScanner.(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (hideCardScanner);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setAlternativePaymentMethods' and count(parameter)=1 and parameter[1][@type='java.util.List&lt;? extends com.payment.paymentsdk.integrationmodels.PaymentSdkApms&gt;']]"
		[Register ("setAlternativePaymentMethods", "(Ljava/util/List;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetAlternativePaymentMethods (global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> apms)
		{
			const string __id = "setAlternativePaymentMethods.(Ljava/util/List;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_apms = global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.ToLocalJniHandle (apms);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_apms);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_apms);
				global::System.GC.KeepAlive (apms);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setBillingData' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails']]"
		[Register ("setBillingData", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetBillingData (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails billingData)
		{
			const string __id = "setBillingData.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((billingData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) billingData).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (billingData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setCartDescription' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCartDescription", "(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetCartDescription (string cartDescription)
		{
			const string __id = "setCartDescription.(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_cartDescription = JNIEnv.NewString (cartDescription);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cartDescription);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cartDescription);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setCartId' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCartId", "(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetCartId (string cartId)
		{
			const string __id = "setCartId.(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_cartId = JNIEnv.NewString (cartId);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cartId);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cartId);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setLanguageCode' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkLanguageCode']]"
		[Register ("setLanguageCode", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetLanguageCode (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode locale)
		{
			const string __id = "setLanguageCode.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((locale == null) ? IntPtr.Zero : ((global::Java.Lang.Object) locale).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (locale);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setMerchantCountryCode' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setMerchantCountryCode", "(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetMerchantCountryCode (string merchantCountyCode)
		{
			const string __id = "setMerchantCountryCode.(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_merchantCountyCode = JNIEnv.NewString (merchantCountyCode);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_merchantCountyCode);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_merchantCountyCode);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setMerchantIcon' and count(parameter)=1 and parameter[1][@type='android.graphics.drawable.Drawable']]"
		[Register ("setMerchantIcon", "(Landroid/graphics/drawable/Drawable;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetMerchantIcon (global::Android.Graphics.Drawables.Drawable logo)
		{
			const string __id = "setMerchantIcon.(Landroid/graphics/drawable/Drawable;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((logo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) logo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (logo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setScreenTitle' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setScreenTitle", "(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetScreenTitle (string screenTitle)
		{
			const string __id = "setScreenTitle.(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_screenTitle = JNIEnv.NewString (screenTitle);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_screenTitle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_screenTitle);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setServerIp' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setServerIp", "(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetServerIp (string ip)
		{
			const string __id = "setServerIp.(Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_ip = JNIEnv.NewString (ip);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_ip);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_ip);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setShippingData' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails']]"
		[Register ("setShippingData", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetShippingData (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails shippingData)
		{
			const string __id = "setShippingData.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((shippingData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shippingData).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (shippingData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setTokenisationData' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register ("setTokenisationData", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetTokenisationData (string token, string transactionReference)
		{
			const string __id = "setTokenisationData.(Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			IntPtr native_token = JNIEnv.NewString (token);
			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_token);
				__args [1] = new JniArgumentValue (native_transactionReference);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_token);
				JNIEnv.DeleteLocalRef (native_transactionReference);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setTokenise' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTokenise'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTokenFormat']]"
		[Register ("setTokenise", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetTokenise (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise tokeniseType, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenFormat tokenFormat)
		{
			const string __id = "setTokenise.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((tokeniseType == null) ? IntPtr.Zero : ((global::Java.Lang.Object) tokeniseType).Handle);
				__args [1] = new JniArgumentValue ((tokenFormat == null) ? IntPtr.Zero : ((global::Java.Lang.Object) tokenFormat).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (tokeniseType);
				global::System.GC.KeepAlive (tokenFormat);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setTransactionClass' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionClass']]"
		[Register ("setTransactionClass", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetTransactionClass (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass transactionClass)
		{
			const string __id = "setTransactionClass.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((transactionClass == null) ? IntPtr.Zero : ((global::Java.Lang.Object) transactionClass).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (transactionClass);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='setTransactionType' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionType']]"
		[Register ("setTransactionType", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionType;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder SetTransactionType (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionType transactionType)
		{
			const string __id = "setTransactionType.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionType;)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((transactionType == null) ? IntPtr.Zero : ((global::Java.Lang.Object) transactionType).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (transactionType);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='showBillingInfo' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("showBillingInfo", "(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder ShowBillingInfo (bool showBillingInfo)
		{
			const string __id = "showBillingInfo.(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (showBillingInfo);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkConfigBuilder']/method[@name='showShippingInfo' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("showShippingInfo", "(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder ShowShippingInfo (bool showShippingInfo)
		{
			const string __id = "showShippingInfo.(Z)Lcom/payment/paymentsdk/PaymentSdkConfigBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (showShippingInfo);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.PaymentSdkConfigBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
