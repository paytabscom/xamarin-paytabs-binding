using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Validator {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='MissingInfoValidator']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/validator/MissingInfoValidator", DoNotGenerateAcw=true)]
	public partial class MissingInfoValidator : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/validator/MissingInfoValidator", typeof (MissingInfoValidator));

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

		protected MissingInfoValidator (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='MissingInfoValidator']/constructor[@name='MissingInfoValidator' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.base.BaseBillingShippingDetails'] and parameter[2][@type='boolean']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;Z)V", "")]
		public unsafe MissingInfoValidator (global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails details, bool isShipping) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;Z)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((details == null) ? IntPtr.Zero : ((global::Java.Lang.Object) details).Handle);
				__args [1] = new JniArgumentValue (isShipping);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (details);
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.ConfigDataValidatorSealed SealedValue {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='MissingInfoValidator']/method[@name='getSealedValue' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.validator']/class[@name='MissingInfoValidator']/method[@name='isValid' and count(parameter)=2 and parameter[1][@type='androidx.lifecycle.MutableLiveData&lt;com.payment.paymentsdk.sharedclasses.sealed.MissingInfoValidatorSealed&gt;'] and parameter[2][@type='boolean']]"
		[Register ("isValid", "(Landroidx/lifecycle/MutableLiveData;Z)Z", "")]
		public unsafe bool IsValid (global::AndroidX.Lifecycle.MutableLiveData missingInfoSealedLD, bool isSamsungPay)
		{
			const string __id = "isValid.(Landroidx/lifecycle/MutableLiveData;Z)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((missingInfoSealedLD == null) ? IntPtr.Zero : ((global::Java.Lang.Object) missingInfoSealedLD).Handle);
				__args [1] = new JniArgumentValue (isSamsungPay);
				var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (missingInfoSealedLD);
			}
		}

	}
}
