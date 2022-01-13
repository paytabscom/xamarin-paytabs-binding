using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Validator {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='ConfigDataValidator']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/validator/ConfigDataValidator", DoNotGenerateAcw=true)]
	public sealed partial class ConfigDataValidator : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/validator/ConfigDataValidator", typeof (ConfigDataValidator));

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

		internal ConfigDataValidator (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='ConfigDataValidator']/constructor[@name='ConfigDataValidator' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe ConfigDataValidator (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails configData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((configData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) configData).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (configData);
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.ConfigDataValidatorSealed SealedValue {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='ConfigDataValidator']/method[@name='getSealedValue' and count(parameter)=0]"
			[Register ("getSealedValue", "()Lcom/payment/paymentsdk/sharedclasses/sealed/ConfigDataValidatorSealed;", "")]
			get {
				const string __id = "getSealedValue.()Lcom/payment/paymentsdk/sharedclasses/sealed/ConfigDataValidatorSealed;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.ConfigDataValidatorSealed> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='ConfigDataValidator']/method[@name='validate' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='boolean']]"
		[Register ("validate", "(ZZ)V", "")]
		public unsafe void Validate (bool isSamsungPay, bool isApms)
		{
			const string __id = "validate.(ZZ)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (isSamsungPay);
				__args [1] = new JniArgumentValue (isApms);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

	}
}
