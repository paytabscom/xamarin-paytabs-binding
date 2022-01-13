using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/ConstantsKt", DoNotGenerateAcw=true)]
	public sealed partial class ConstantsKt : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='FRAGMENT_RESULT_COUNTRY_BUNDLE']"
		[Register ("FRAGMENT_RESULT_COUNTRY_BUNDLE")]
		public const string FragmentResultCountryBundle = (string) "countryIso";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='LANGUAGE_CODE_ARABIC']"
		[Register ("LANGUAGE_CODE_ARABIC")]
		public const string LanguageCodeArabic = (string) "ar";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='LANGUAGE_CODE_ENGLISH']"
		[Register ("LANGUAGE_CODE_ENGLISH")]
		public const string LanguageCodeEnglish = (string) "en";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='PAYMENT_SDK_VALODATION_ERROR_CODE']"
		[Register ("PAYMENT_SDK_VALODATION_ERROR_CODE")]
		public const int PaymentSdkValodationErrorCode = (int) -1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='SUCCESS_RESP_CODE']"
		[Register ("SUCCESS_RESP_CODE")]
		public const string SuccessRespCode = (string) "0";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='SUCCESS_STATUS_CODE']"
		[Register ("SUCCESS_STATUS_CODE")]
		public const string SuccessStatusCode = (string) "A";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/field[@name='TAG_PAYMENT_SDK']"
		[Register ("TAG_PAYMENT_SDK")]
		public const string TagPaymentSdk = (string) "payment_sdk_Logs";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/ConstantsKt", typeof (ConstantsKt));

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

		internal ConstantsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkRegion SelectedRegion {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/method[@name='getSelectedRegion' and count(parameter)=0]"
			[Register ("getSelectedRegion", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;", "")]
			get {
				const string __id = "getSelectedRegion.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkRegion> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='ConstantsKt']/method[@name='setSelectedRegion' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkRegion']]"
			[Register ("setSelectedRegion", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;)V", "")]
			set {
				const string __id = "setSelectedRegion.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkRegion;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.StaticMethods.InvokeVoidMethod (__id, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

	}
}
