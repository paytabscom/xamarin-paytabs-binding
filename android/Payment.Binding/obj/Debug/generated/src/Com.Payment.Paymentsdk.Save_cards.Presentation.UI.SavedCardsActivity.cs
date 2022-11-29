using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Save_cards.Presentation.UI {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/save_cards/presentation/ui/SavedCardsActivity", DoNotGenerateAcw=true)]
	public sealed partial class SavedCardsActivity : global::AndroidX.AppCompat.App.AppCompatActivity {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/save_cards/presentation/ui/SavedCardsActivity", typeof (SavedCardsActivity));

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

		internal SavedCardsActivity (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']/constructor[@name='SavedCardsActivity' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe SavedCardsActivity () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']/method[@name='a' and count(parameter)=0]"
		[Register ("a", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails A ()
		{
			const string __id = "a.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']/method[@name='returnCancelToTheCaller' and count(parameter)=0]"
		[Register ("returnCancelToTheCaller", "()V", "")]
		public unsafe void ReturnCancelToTheCaller ()
		{
			const string __id = "returnCancelToTheCaller.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']/method[@name='returnErrorToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkError']]"
		[Register ("returnErrorToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V", "")]
		public unsafe void ReturnErrorToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError p0)
		{
			const string __id = "returnErrorToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.save_cards.presentation.ui']/class[@name='SavedCardsActivity']/method[@name='returnPaymentFinishedToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails']]"
		[Register ("returnPaymentFinishedToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V", "")]
		public unsafe void ReturnPaymentFinishedToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails p0)
		{
			const string __id = "returnPaymentFinishedToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

	}
}
