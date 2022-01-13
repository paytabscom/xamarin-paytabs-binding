using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='DateValidator']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/utils/DateValidator", DoNotGenerateAcw=true)]
	public partial class DateValidator : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='DateValidator']/field[@name='MAXIMUM_VALID_YEAR_DIFFERENCE']"
		[Register ("MAXIMUM_VALID_YEAR_DIFFERENCE")]
		public const int MaximumValidYearDifference = (int) 20;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/utils/DateValidator", typeof (DateValidator));

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

		protected DateValidator (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='DateValidator']/constructor[@name='DateValidator' and count(parameter)=1 and parameter[1][@type='java.util.Calendar']]"
		[Register (".ctor", "(Ljava/util/Calendar;)V", "")]
		protected unsafe DateValidator (global::Java.Util.Calendar calendar) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/util/Calendar;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((calendar == null) ? IntPtr.Zero : ((global::Java.Lang.Object) calendar).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (calendar);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='DateValidator']/method[@name='isValid' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register ("isValid", "(Ljava/lang/String;Ljava/lang/String;)Z", "")]
		public static unsafe bool IsValid (string month, string year)
		{
			const string __id = "isValid.(Ljava/lang/String;Ljava/lang/String;)Z";
			IntPtr native_month = JNIEnv.NewString (month);
			IntPtr native_year = JNIEnv.NewString (year);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_month);
				__args [1] = new JniArgumentValue (native_year);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_month);
				JNIEnv.DeleteLocalRef (native_year);
			}
		}

		static Delegate cb_isValidHelper_Ljava_lang_String_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetIsValidHelper_Ljava_lang_String_Ljava_lang_String_Handler ()
		{
			if (cb_isValidHelper_Ljava_lang_String_Ljava_lang_String_ == null)
				cb_isValidHelper_Ljava_lang_String_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_Z) n_IsValidHelper_Ljava_lang_String_Ljava_lang_String_);
			return cb_isValidHelper_Ljava_lang_String_Ljava_lang_String_;
		}

		static bool n_IsValidHelper_Ljava_lang_String_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_monthString, IntPtr native_yearString)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.DateValidator> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var monthString = JNIEnv.GetString (native_monthString, JniHandleOwnership.DoNotTransfer);
			var yearString = JNIEnv.GetString (native_yearString, JniHandleOwnership.DoNotTransfer);
			bool __ret = __this.IsValidHelper (monthString, yearString);
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='DateValidator']/method[@name='isValidHelper' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register ("isValidHelper", "(Ljava/lang/String;Ljava/lang/String;)Z", "GetIsValidHelper_Ljava_lang_String_Ljava_lang_String_Handler")]
		protected virtual unsafe bool IsValidHelper (string monthString, string yearString)
		{
			const string __id = "isValidHelper.(Ljava/lang/String;Ljava/lang/String;)Z";
			IntPtr native_monthString = JNIEnv.NewString (monthString);
			IntPtr native_yearString = JNIEnv.NewString (yearString);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_monthString);
				__args [1] = new JniArgumentValue (native_yearString);
				var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_monthString);
				JNIEnv.DeleteLocalRef (native_yearString);
			}
		}

	}
}
