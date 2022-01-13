using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionClass']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkTransactionClass : global::Java.Lang.Enum {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionClass']/field[@name='ECOM']"
		[Register ("ECOM")]
		public static global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass Ecom {
			get {
				const string __id = "ECOM.Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}


		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionClass']/field[@name='RECURRING']"
		[Register ("RECURRING")]
		public static global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass Recurring {
			get {
				const string __id = "RECURRING.Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass", typeof (PaymentSdkTransactionClass));

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

		internal PaymentSdkTransactionClass (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionClass']/method[@name='valueOf' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("valueOf", "(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass ValueOf (string p0)
		{
			const string __id = "valueOf.(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkTransactionClass']/method[@name='values' and count(parameter)=0]"
		[Register ("values", "()[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass[] Values ()
		{
			const string __id = "values.()[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionClass;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionClass));
			} finally {
			}
		}

	}
}
