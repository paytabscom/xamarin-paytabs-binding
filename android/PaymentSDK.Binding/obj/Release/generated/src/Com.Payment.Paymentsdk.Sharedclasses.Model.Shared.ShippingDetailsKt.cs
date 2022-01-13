using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Shared {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='ShippingDetailsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/shared/ShippingDetailsKt", DoNotGenerateAcw=true)]
	public sealed partial class ShippingDetailsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/shared/ShippingDetailsKt", typeof (ShippingDetailsKt));

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

		internal ShippingDetailsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='ShippingDetailsKt']/method[@name='toPaymentSdkShippingDetails' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.shared.ShippingDetails']]"
		[Register ("toPaymentSdkShippingDetails", "(Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails ToPaymentSdkShippingDetails (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.ShippingDetails obj)
		{
			const string __id = "toPaymentSdkShippingDetails.(Lcom/payment/paymentsdk/sharedclasses/model/shared/ShippingDetails;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
