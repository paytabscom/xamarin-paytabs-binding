using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Interfaces {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityReturnResult']"
	[Register ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityReturnResult", "", "Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResultInvoker")]
	public partial interface IActivityReturnResult : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityReturnResult']/method[@name='returnCancelToTheCaller' and count(parameter)=0]"
		[Register ("returnCancelToTheCaller", "()V", "GetReturnCancelToTheCallerHandler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResultInvoker, PaymentSDK.Binding")]
		void ReturnCancelToTheCaller ();

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityReturnResult']/method[@name='returnErrorToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkError']]"
		[Register ("returnErrorToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V", "GetReturnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResultInvoker, PaymentSDK.Binding")]
		void ReturnErrorToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError result);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityReturnResult']/method[@name='returnPaymentFinishedToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails']]"
		[Register ("returnPaymentFinishedToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V", "GetReturnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResultInvoker, PaymentSDK.Binding")]
		void ReturnPaymentFinishedToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails result);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityReturnResult", DoNotGenerateAcw=true)]
	internal partial class IActivityReturnResultInvoker : global::Java.Lang.Object, IActivityReturnResult {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityReturnResult", typeof (IActivityReturnResultInvoker));

		static IntPtr java_class_ref {
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
			get { return class_ref; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

		IntPtr class_ref;

		public static IActivityReturnResult GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IActivityReturnResult> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.sharedclasses.interfaces.ActivityReturnResult'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IActivityReturnResultInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_returnCancelToTheCaller;
#pragma warning disable 0169
		static Delegate GetReturnCancelToTheCallerHandler ()
		{
			if (cb_returnCancelToTheCaller == null)
				cb_returnCancelToTheCaller = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_ReturnCancelToTheCaller);
			return cb_returnCancelToTheCaller;
		}

		static void n_ReturnCancelToTheCaller (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResult> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.ReturnCancelToTheCaller ();
		}
#pragma warning restore 0169

		IntPtr id_returnCancelToTheCaller;
		public unsafe void ReturnCancelToTheCaller ()
		{
			if (id_returnCancelToTheCaller == IntPtr.Zero)
				id_returnCancelToTheCaller = JNIEnv.GetMethodID (class_ref, "returnCancelToTheCaller", "()V");
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_returnCancelToTheCaller);
		}

		static Delegate cb_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
#pragma warning disable 0169
		static Delegate GetReturnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler ()
		{
			if (cb_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ == null)
				cb_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_ReturnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_);
			return cb_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
		}

		static void n_ReturnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ (IntPtr jnienv, IntPtr native__this, IntPtr native_result)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResult> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var result = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError> (native_result, JniHandleOwnership.DoNotTransfer);
			__this.ReturnErrorToTheCaller (result);
		}
#pragma warning restore 0169

		IntPtr id_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
		public unsafe void ReturnErrorToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError result)
		{
			if (id_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ == IntPtr.Zero)
				id_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ = JNIEnv.GetMethodID (class_ref, "returnErrorToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((result == null) ? IntPtr.Zero : ((global::Java.Lang.Object) result).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_returnErrorToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_, __args);
		}

		static Delegate cb_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
#pragma warning disable 0169
		static Delegate GetReturnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler ()
		{
			if (cb_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ == null)
				cb_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_ReturnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_);
			return cb_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
		}

		static void n_ReturnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ (IntPtr jnienv, IntPtr native__this, IntPtr native_result)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResult> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var result = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails> (native_result, JniHandleOwnership.DoNotTransfer);
			__this.ReturnPaymentFinishedToTheCaller (result);
		}
#pragma warning restore 0169

		IntPtr id_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
		public unsafe void ReturnPaymentFinishedToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails result)
		{
			if (id_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ == IntPtr.Zero)
				id_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ = JNIEnv.GetMethodID (class_ref, "returnPaymentFinishedToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((result == null) ? IntPtr.Zero : ((global::Java.Lang.Object) result).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_returnPaymentFinishedToTheCaller_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_, __args);
		}

	}
}
