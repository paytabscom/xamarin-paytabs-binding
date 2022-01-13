using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkParams", DoNotGenerateAcw=true)]
	public partial class PaymentSdkParams : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']/field[@name='RESPONSE_CODE']"
		[Register ("RESPONSE_CODE")]
		public const string ResponseCode = (string) "RESPONSE_CODE";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']/field[@name='RESULT_MESSAGE']"
		[Register ("RESULT_MESSAGE")]
		public const string ResultMessage = (string) "RESULT_MESSAGE";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']/field[@name='TOKEN']"
		[Register ("TOKEN")]
		public const string Token = (string) "token";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']/field[@name='TRANSACTION_REFERENCE']"
		[Register ("TRANSACTION_REFERENCE")]
		public const string TransactionReference = (string) "TRANSACTION_ID";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/PaymentSdkParams", typeof (PaymentSdkParams));

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

		protected PaymentSdkParams (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkParams']/constructor[@name='PaymentSdkParams' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe PaymentSdkParams () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "()V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), null);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, null);
			} finally {
			}
		}

	}
}
