using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Interfaces {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='CallbackPaymentInterface']"
	[Register ("com/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface", "", "Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker")]
	public partial interface ICallbackPaymentInterface : global::Java.IO.ISerializable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='CallbackPaymentInterface']/method[@name='onError' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkError']]"
		[Register ("onError", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V", "GetOnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding")]
		void OnError (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError error);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='CallbackPaymentInterface']/method[@name='onPaymentCancel' and count(parameter)=0]"
		[Register ("onPaymentCancel", "()V", "GetOnPaymentCancelHandler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding")]
		void OnPaymentCancel ();

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='CallbackPaymentInterface']/method[@name='onPaymentFinish' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails']]"
		[Register ("onPaymentFinish", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V", "GetOnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterfaceInvoker, PaymentSDK.Binding")]
		void OnPaymentFinish (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails paymentSdkTransactionDetails);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface", DoNotGenerateAcw=true)]
	internal partial class ICallbackPaymentInterfaceInvoker : global::Java.Lang.Object, ICallbackPaymentInterface {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface", typeof (ICallbackPaymentInterfaceInvoker));

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

		public static ICallbackPaymentInterface GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<ICallbackPaymentInterface> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public ICallbackPaymentInterfaceInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
#pragma warning disable 0169
		static Delegate GetOnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_Handler ()
		{
			if (cb_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ == null)
				cb_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_);
			return cb_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
		}

		static void n_OnError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ (IntPtr jnienv, IntPtr native__this, IntPtr native_error)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var error = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError> (native_error, JniHandleOwnership.DoNotTransfer);
			__this.OnError (error);
		}
#pragma warning restore 0169

		IntPtr id_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_;
		public unsafe void OnError (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError error)
		{
			if (id_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ == IntPtr.Zero)
				id_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_ = JNIEnv.GetMethodID (class_ref, "onError", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((error == null) ? IntPtr.Zero : ((global::Java.Lang.Object) error).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onError_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkError_, __args);
		}

		static Delegate cb_onPaymentCancel;
#pragma warning disable 0169
		static Delegate GetOnPaymentCancelHandler ()
		{
			if (cb_onPaymentCancel == null)
				cb_onPaymentCancel = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_OnPaymentCancel);
			return cb_onPaymentCancel;
		}

		static void n_OnPaymentCancel (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.OnPaymentCancel ();
		}
#pragma warning restore 0169

		IntPtr id_onPaymentCancel;
		public unsafe void OnPaymentCancel ()
		{
			if (id_onPaymentCancel == IntPtr.Zero)
				id_onPaymentCancel = JNIEnv.GetMethodID (class_ref, "onPaymentCancel", "()V");
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onPaymentCancel);
		}

		static Delegate cb_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
#pragma warning disable 0169
		static Delegate GetOnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_Handler ()
		{
			if (cb_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ == null)
				cb_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_);
			return cb_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
		}

		static void n_OnPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ (IntPtr jnienv, IntPtr native__this, IntPtr native_paymentSdkTransactionDetails)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var paymentSdkTransactionDetails = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails> (native_paymentSdkTransactionDetails, JniHandleOwnership.DoNotTransfer);
			__this.OnPaymentFinish (paymentSdkTransactionDetails);
		}
#pragma warning restore 0169

		IntPtr id_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_;
		public unsafe void OnPaymentFinish (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails paymentSdkTransactionDetails)
		{
			if (id_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ == IntPtr.Zero)
				id_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_ = JNIEnv.GetMethodID (class_ref, "onPaymentFinish", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((paymentSdkTransactionDetails == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paymentSdkTransactionDetails).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onPaymentFinish_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkTransactionDetails_, __args);
		}

	}
}
