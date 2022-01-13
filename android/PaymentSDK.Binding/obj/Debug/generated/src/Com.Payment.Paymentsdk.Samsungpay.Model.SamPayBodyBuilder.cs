using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Samsungpay.Model {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.model']/class[@name='SamPayBodyBuilder']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder", DoNotGenerateAcw=true)]
	public sealed partial class SamPayBodyBuilder : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder", typeof (SamPayBodyBuilder));

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

		internal SamPayBodyBuilder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.model']/class[@name='SamPayBodyBuilder']/constructor[@name='SamPayBodyBuilder' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe SamPayBodyBuilder (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.model']/class[@name='SamPayBodyBuilder']/method[@name='build' and count(parameter)=0]"
		[Register ("build", "()Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody Build ()
		{
			const string __id = "build.()Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.model']/class[@name='SamPayBodyBuilder']/method[@name='setDeviceInfo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register ("setDeviceInfo", "(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Samsungpay.Model.SamPayBodyBuilder SetDeviceInfo (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo)
		{
			const string __id = "setDeviceInfo.(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Samsungpay.Model.SamPayBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.model']/class[@name='SamPayBodyBuilder']/method[@name='setSamPayToken' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setSamPayToken", "(Ljava/lang/String;)Lcom/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Samsungpay.Model.SamPayBodyBuilder SetSamPayToken (string samPayToken)
		{
			const string __id = "setSamPayToken.(Ljava/lang/String;)Lcom/payment/paymentsdk/samsungpay/model/SamPayBodyBuilder;";
			IntPtr native_samPayToken = JNIEnv.NewString (samPayToken);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_samPayToken);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Samsungpay.Model.SamPayBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_samPayToken);
			}
		}

	}
}
