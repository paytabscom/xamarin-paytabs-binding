using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetailsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetailsKt", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkBillingDetailsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetailsKt", typeof (PaymentSdkBillingDetailsKt));

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

		internal PaymentSdkBillingDetailsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetailsKt']/method[@name='customerDetails' and count(parameter)=3 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register ("customerDetails", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails CustomerDetails (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails obj, string ip, string nameOnCard)
		{
			const string __id = "customerDetails.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;";
			IntPtr native_ip = JNIEnv.NewString (ip);
			IntPtr native_nameOnCard = JNIEnv.NewString (nameOnCard);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_ip);
				__args [2] = new JniArgumentValue (native_nameOnCard);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_ip);
				JNIEnv.DeleteLocalRef (native_nameOnCard);
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
