using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Customs {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='PaymentSdkEditTextKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/customs/PaymentSdkEditTextKt", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkEditTextKt : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='PaymentSdkEditTextKt']/field[@name='PAYTABS_INPUT_TYPE_NUMBER']"
		[Register ("PAYTABS_INPUT_TYPE_NUMBER")]
		public const int PaytabsInputTypeNumber = (int) 1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='PaymentSdkEditTextKt']/field[@name='PAYTABS_INPUT_TYPE_TEXT']"
		[Register ("PAYTABS_INPUT_TYPE_TEXT")]
		public const int PaytabsInputTypeText = (int) 0;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/customs/PaymentSdkEditTextKt", typeof (PaymentSdkEditTextKt));

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

		internal PaymentSdkEditTextKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
