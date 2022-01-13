using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Tokenizationpayment.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragmentKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragmentKt", DoNotGenerateAcw=true)]
	public sealed partial class TokenizationPaymentFragmentKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragmentKt", typeof (TokenizationPaymentFragmentKt));

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

		internal TokenizationPaymentFragmentKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
