using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Apms.Model {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.apms.model']/class[@name='ApmsBodyBuilder']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/apms/model/ApmsBodyBuilder", DoNotGenerateAcw=true)]
	public sealed partial class ApmsBodyBuilder : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/apms/model/ApmsBodyBuilder", typeof (ApmsBodyBuilder));

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

		internal ApmsBodyBuilder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.apms.model']/class[@name='ApmsBodyBuilder']/constructor[@name='ApmsBodyBuilder' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe ApmsBodyBuilder (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.apms.model']/class[@name='ApmsBodyBuilder']/method[@name='build' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.apms.model']/class[@name='ApmsBodyBuilder']/method[@name='setApms' and count(parameter)=1 and parameter[1][@type='java.util.List&lt;? extends com.payment.paymentsdk.integrationmodels.PaymentSdkApms&gt;']]"
		[Register ("setApms", "(Ljava/util/List;)Lcom/payment/paymentsdk/apms/model/ApmsBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Apms.Model.ApmsBodyBuilder SetApms (global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> apms)
		{
			const string __id = "setApms.(Ljava/util/List;)Lcom/payment/paymentsdk/apms/model/ApmsBodyBuilder;";
			IntPtr native_apms = global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.ToLocalJniHandle (apms);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_apms);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Apms.Model.ApmsBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_apms);
				global::System.GC.KeepAlive (apms);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.apms.model']/class[@name='ApmsBodyBuilder']/method[@name='setDeviceInfo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
		[Register ("setDeviceInfo", "(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/apms/model/ApmsBodyBuilder;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Apms.Model.ApmsBodyBuilder SetDeviceInfo (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo deviceInfo)
		{
			const string __id = "setDeviceInfo.(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)Lcom/payment/paymentsdk/apms/model/ApmsBodyBuilder;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((deviceInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) deviceInfo).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Apms.Model.ApmsBodyBuilder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (deviceInfo);
			}
		}

	}
}
