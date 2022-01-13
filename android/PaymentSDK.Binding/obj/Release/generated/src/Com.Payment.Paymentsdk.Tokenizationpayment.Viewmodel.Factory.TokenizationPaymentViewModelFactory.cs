using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Tokenizationpayment.Viewmodel.Factory {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel.factory']/class[@name='TokenizationPaymentViewModelFactory']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/viewmodel/factory/TokenizationPaymentViewModelFactory", DoNotGenerateAcw=true)]
	public sealed partial class TokenizationPaymentViewModelFactory : global::Java.Lang.Object, global::AndroidX.Lifecycle.ViewModelProvider.IFactory {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/viewmodel/factory/TokenizationPaymentViewModelFactory", typeof (TokenizationPaymentViewModelFactory));

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

		internal TokenizationPaymentViewModelFactory (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel.factory']/class[@name='TokenizationPaymentViewModelFactory']/constructor[@name='TokenizationPaymentViewModelFactory' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.tokenizationpayment.model.repo.TokenizationPaymentRepo']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/tokenizationpayment/model/repo/TokenizationPaymentRepo;)V", "")]
		public unsafe TokenizationPaymentViewModelFactory (global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.Repo.TokenizationPaymentRepo repo) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/tokenizationpayment/model/repo/TokenizationPaymentRepo;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((repo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) repo).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (repo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel.factory']/class[@name='TokenizationPaymentViewModelFactory']/method[@name='create' and count(parameter)=1 and parameter[1][@type='java.lang.Class&lt;T&gt;']]"
		[Register ("create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "")]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T extends androidx.lifecycle.ViewModel"})]
		public unsafe global::Java.Lang.Object Create (global::Java.Lang.Class modelClass)
		{
			const string __id = "create.(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((modelClass == null) ? IntPtr.Zero : ((global::Java.Lang.Object) modelClass).Handle);
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
				return (global::Java.Lang.Object) global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (modelClass);
			}
		}

	}
}
