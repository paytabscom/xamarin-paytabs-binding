using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Utils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='CardUtils']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/CardUtils", DoNotGenerateAcw=true)]
	public sealed partial class CardUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/CardUtils", typeof (CardUtils));

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

		internal CardUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='CardUtils']/method[@name='getCardNumberRedacted' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("getCardNumberRedacted", "(Ljava/lang/String;)Ljava/lang/String;", "")]
		public static unsafe string GetCardNumberRedacted (string cardNumber)
		{
			const string __id = "getCardNumberRedacted.(Ljava/lang/String;)Ljava/lang/String;";
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cardNumber);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cardNumber);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='CardUtils']/method[@name='prettyPrintCardNumber' and count(parameter)=1 and parameter[1][@type='java.lang.CharSequence']]"
		[Register ("prettyPrintCardNumber", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "")]
		public static unsafe string PrettyPrintCardNumber (global::Java.Lang.ICharSequence cardNumber)
		{
			const string __id = "prettyPrintCardNumber.(Ljava/lang/CharSequence;)Ljava/lang/String;";
			IntPtr native_cardNumber = CharSequence.ToLocalJniHandle (cardNumber);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cardNumber);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cardNumber);
				global::System.GC.KeepAlive (cardNumber);
			}
		}

		public static string PrettyPrintCardNumber (string cardNumber)
		{
			var jls_cardNumber = cardNumber == null ? null : new global::Java.Lang.String (cardNumber);
			string __result = PrettyPrintCardNumber (jls_cardNumber);
			var __rsval = __result;
			jls_cardNumber?.Dispose ();
			return __rsval;
		}

	}
}
