using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Tokenizationpayment.Viewmodel {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/viewmodel/TokenizationPaymentViewModel", DoNotGenerateAcw=true)]
	public sealed partial class TokenizationPaymentViewModel : global::Com.Payment.Paymentsdk.Helper.Base.BaseViewModel {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/viewmodel/TokenizationPaymentViewModel", typeof (TokenizationPaymentViewModel));

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

		internal TokenizationPaymentViewModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']/constructor[@name='TokenizationPaymentViewModel' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.tokenizationpayment.model.repo.TokenizationPaymentRepo']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/tokenizationpayment/model/repo/TokenizationPaymentRepo;)V", "")]
		public unsafe TokenizationPaymentViewModel (global::Com.Payment.Paymentsdk.Tokenizationpayment.Model.Repo.TokenizationPaymentRepo repo) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		public unsafe global::AndroidX.Lifecycle.MutableLiveData PaymentSucceed3dsLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']/method[@name='getPaymentSucceed3dsLD' and count(parameter)=0]"
			[Register ("getPaymentSucceed3dsLD", "()Landroidx/lifecycle/MutableLiveData;", "")]
			get {
				const string __id = "getPaymentSucceed3dsLD.()Landroidx/lifecycle/MutableLiveData;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.MutableLiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::AndroidX.Lifecycle.MutableLiveData PaymentSucceedWithout3dsLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']/method[@name='getPaymentSucceedWithout3dsLD' and count(parameter)=0]"
			[Register ("getPaymentSucceedWithout3dsLD", "()Landroidx/lifecycle/MutableLiveData;", "")]
			get {
				const string __id = "getPaymentSucceedWithout3dsLD.()Landroidx/lifecycle/MutableLiveData;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.MutableLiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']/method[@name='buildRequestBody' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register ("buildRequestBody", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody BuildRequestBody (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData)
		{
			const string __id = "buildRequestBody.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.viewmodel']/class[@name='TokenizationPaymentViewModel']/method[@name='doTransaction' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.TransactionRequestBody']]"
		[Register ("doTransaction", "(Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;)V", "")]
		public unsafe void DoTransaction (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody body)
		{
			const string __id = "doTransaction.(Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((body == null) ? IntPtr.Zero : ((global::Java.Lang.Object) body).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (body);
			}
		}

	}
}
