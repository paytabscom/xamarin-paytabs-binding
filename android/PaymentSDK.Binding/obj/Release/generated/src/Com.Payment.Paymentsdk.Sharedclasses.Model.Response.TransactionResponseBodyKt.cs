using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Response {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBodyKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBodyKt", DoNotGenerateAcw=true)]
	public sealed partial class TransactionResponseBodyKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBodyKt", typeof (TransactionResponseBodyKt));

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

		internal TransactionResponseBodyKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.response']/class[@name='TransactionResponseBodyKt']/method[@name='toPaymentSdkTransactionDetails' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody']]"
		[Register ("toPaymentSdkTransactionDetails", "(Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails ToPaymentSdkTransactionDetails (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.TransactionResponseBody obj)
		{
			const string __id = "toPaymentSdkTransactionDetails.(Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
