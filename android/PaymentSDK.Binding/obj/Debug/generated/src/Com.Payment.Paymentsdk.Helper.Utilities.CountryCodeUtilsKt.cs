using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/CountryCodeUtilsKt", DoNotGenerateAcw=true)]
	public sealed partial class CountryCodeUtilsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/CountryCodeUtilsKt", typeof (CountryCodeUtilsKt));

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

		internal CountryCodeUtilsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		public static unsafe global::System.Collections.Generic.IDictionary<string, string> CountriesFixedZipCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='getCountriesFixedZipCode' and count(parameter)=0]"
			[Register ("getCountriesFixedZipCode", "()Ljava/util/Map;", "")]
			get {
				const string __id = "getCountriesFixedZipCode.()Ljava/util/Map;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Android.Runtime.JavaDictionary<string, string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public static unsafe global::System.Collections.Generic.IList<string> CountriesNoZipCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='getCountriesNoZipCode' and count(parameter)=0]"
			[Register ("getCountriesNoZipCode", "()Ljava/util/List;", "")]
			get {
				const string __id = "getCountriesNoZipCode.()Ljava/util/List;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Android.Runtime.JavaList<string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public static unsafe global::System.Collections.Generic.IList<string> CountriesOptionalZipCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='getCountriesOptionalZipCode' and count(parameter)=0]"
			[Register ("getCountriesOptionalZipCode", "()Ljava/util/List;", "")]
			get {
				const string __id = "getCountriesOptionalZipCode.()Ljava/util/List;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Android.Runtime.JavaList<string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='availableCountriesDisplayName' and count(parameter)=0]"
		[Register ("availableCountriesDisplayName", "()Ljava/util/List;", "")]
		public static unsafe global::System.Collections.Generic.IList<string> AvailableCountriesDisplayName ()
		{
			const string __id = "availableCountriesDisplayName.()Ljava/util/List;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return global::Android.Runtime.JavaList<string>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='availableCountriesIso' and count(parameter)=0]"
		[Register ("availableCountriesIso", "()[Ljava/lang/String;", "")]
		public static unsafe string[] AvailableCountriesIso ()
		{
			const string __id = "availableCountriesIso.()[Ljava/lang/String;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return (string[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (string));
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='getCountryIso' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("getCountryIso", "(Ljava/lang/String;)Ljava/lang/String;", "")]
		public static unsafe string GetCountryIso (string countryDisplayName)
		{
			const string __id = "getCountryIso.(Ljava/lang/String;)Ljava/lang/String;";
			IntPtr native_countryDisplayName = JNIEnv.NewString (countryDisplayName);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_countryDisplayName);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_countryDisplayName);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='CountryCodeUtilsKt']/method[@name='isValidCountryCode' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("isValidCountryCode", "(Ljava/lang/String;)Z", "")]
		public static unsafe bool IsValidCountryCode (string country)
		{
			const string __id = "isValidCountryCode.(Ljava/lang/String;)Z";
			IntPtr native_country = JNIEnv.NewString (country);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_country);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_country);
			}
		}

	}
}
