using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.Model.Repo {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model.repo']/class[@name='CreditCardRepo']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/model/repo/CreditCardRepo", DoNotGenerateAcw=true)]
	public sealed partial class CreditCardRepo : global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseTransactionRepo {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/model/repo/CreditCardRepo", typeof (CreditCardRepo));

		internal static new IntPtr class_ref {
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

		internal CreditCardRepo (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.model.repo']/class[@name='CreditCardRepo']/constructor[@name='CreditCardRepo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.utils.CBCEncryptor']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/utils/CBCEncryptor;)V", "")]
		public unsafe CreditCardRepo (global::Com.Payment.Paymentsdk.Sharedclasses.Utils.CBCEncryptor encryptor) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/sharedclasses/utils/CBCEncryptor;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((encryptor == null) ? IntPtr.Zero : ((global::Java.Lang.Object) encryptor).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (encryptor);
			}
		}

	}
}
