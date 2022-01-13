using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Interfaces {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityCommunicationInterface']"
	[Register ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityCommunicationInterface", "", "Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityCommunicationInterfaceInvoker")]
	public partial interface IActivityCommunicationInterface : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.interfaces']/interface[@name='ActivityCommunicationInterface']/method[@name='onMissingDataFinished' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register ("onMissingDataFinished", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "GetOnMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_Handler:Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityCommunicationInterfaceInvoker, PaymentSDK.Binding")]
		void OnMissingDataFinished (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityCommunicationInterface", DoNotGenerateAcw=true)]
	internal partial class IActivityCommunicationInterfaceInvoker : global::Java.Lang.Object, IActivityCommunicationInterface {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/interfaces/ActivityCommunicationInterface", typeof (IActivityCommunicationInterfaceInvoker));

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

		public static IActivityCommunicationInterface GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IActivityCommunicationInterface> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.sharedclasses.interfaces.ActivityCommunicationInterface'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IActivityCommunicationInterfaceInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_;
#pragma warning disable 0169
		static Delegate GetOnMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_Handler ()
		{
			if (cb_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_ == null)
				cb_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_);
			return cb_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_;
		}

		static void n_OnMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_ (IntPtr jnienv, IntPtr native__this, IntPtr native_ptConfigData)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityCommunicationInterface> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var ptConfigData = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails> (native_ptConfigData, JniHandleOwnership.DoNotTransfer);
			__this.OnMissingDataFinished (ptConfigData);
		}
#pragma warning restore 0169

		IntPtr id_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_;
		public unsafe void OnMissingDataFinished (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData)
		{
			if (id_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_ == IntPtr.Zero)
				id_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_ = JNIEnv.GetMethodID (class_ref, "onMissingDataFinished", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onMissingDataFinished_Lcom_payment_paymentsdk_integrationmodels_PaymentSdkConfigurationDetails_, __args);
		}

	}
}
