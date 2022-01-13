using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTokenFormatKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormatKt", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkTokenFormatKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormatKt", typeof (PaymentSdkTokenFormatKt));

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

		internal PaymentSdkTokenFormatKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTokenFormatKt']/method[@name='createPaymentSdkTokenFormat' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("createPaymentSdkTokenFormat", "(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenFormat CreatePaymentSdkTokenFormat (string name)
		{
			const string __id = "createPaymentSdkTokenFormat.(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;";
			IntPtr native_name = JNIEnv.NewString (name);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_name);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenFormat> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_name);
			}
		}

	}
}
