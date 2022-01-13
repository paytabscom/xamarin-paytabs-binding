using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Base {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseTransactionRepo']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/base/BaseTransactionRepo", DoNotGenerateAcw=true)]
	public partial class BaseTransactionRepo : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/base/BaseTransactionRepo", typeof (BaseTransactionRepo));

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

		protected BaseTransactionRepo (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseTransactionRepo']/constructor[@name='BaseTransactionRepo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.utils.CBCEncryptor']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/utils/CBCEncryptor;)V", "")]
		public unsafe BaseTransactionRepo (global::Com.Payment.Paymentsdk.Sharedclasses.Utils.CBCEncryptor encryptor) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_doTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_;
#pragma warning disable 0169
		static Delegate GetDoTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_Handler ()
		{
			if (cb_doTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_ == null)
				cb_doTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_L) n_DoTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_);
			return cb_doTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_;
		}

		static IntPtr n_DoTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, IntPtr native_p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseTransactionRepo> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (native_p0, JniHandleOwnership.DoNotTransfer);
			var p1 = (global::Kotlin.Coroutines.IContinuation)global::Java.Lang.Object.GetObject<global::Kotlin.Coroutines.IContinuation> (native_p1, JniHandleOwnership.DoNotTransfer);
			IntPtr __ret = JNIEnv.ToLocalJniHandle (__this.DoTransaction (p0, p1));
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseTransactionRepo']/method[@name='doTransaction' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.TransactionRequestBody'] and parameter[2][@type='kotlin.coroutines.Continuation&lt;? super com.payment.paymentsdk.sharedclasses.model.TransactionResponseWrapper&gt;']]"
		[Register ("doTransaction", "(Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetDoTransaction_Lcom_payment_paymentsdk_sharedclasses_model_request_TransactionRequestBody_Lkotlin_coroutines_Continuation_Handler")]
		public virtual unsafe global::Java.Lang.Object DoTransaction (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody p0, global::Kotlin.Coroutines.IContinuation p1)
		{
			const string __id = "doTransaction.(Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
			}
		}

	}
}
