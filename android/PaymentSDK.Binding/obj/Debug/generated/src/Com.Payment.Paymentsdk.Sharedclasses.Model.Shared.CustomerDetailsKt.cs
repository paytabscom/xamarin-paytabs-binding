using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Shared {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetailsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/shared/CustomerDetailsKt", DoNotGenerateAcw=true)]
	public sealed partial class CustomerDetailsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/shared/CustomerDetailsKt", typeof (CustomerDetailsKt));

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

		internal CustomerDetailsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetailsKt']/method[@name='toPaymentSdkBillingDetails' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.shared.CustomerDetails']]"
		[Register ("toPaymentSdkBillingDetails", "(Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails ToPaymentSdkBillingDetails (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails obj)
		{
			const string __id = "toPaymentSdkBillingDetails.(Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
