using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Base {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/base/BasePaymentFragment", DoNotGenerateAcw=true)]
	public partial class BasePaymentFragment : global::AndroidX.Fragment.App.Fragment {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/base/BasePaymentFragment", typeof (BasePaymentFragment));

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

		protected BasePaymentFragment (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/constructor[@name='BasePaymentFragment' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe BasePaymentFragment () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "()V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), null);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, null);
			} finally {
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Utilities.DeviceInfoProvider DeviceInfoProvider {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/method[@name='getDeviceInfoProvider' and count(parameter)=0]"
			[Register ("getDeviceInfoProvider", "()Lcom/payment/paymentsdk/helper/utilities/DeviceInfoProvider;", "")]
			get {
				const string __id = "getDeviceInfoProvider.()Lcom/payment/paymentsdk/helper/utilities/DeviceInfoProvider;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Utilities.DeviceInfoProvider> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/method[@name='onPaymentCancelled' and count(parameter)=0]"
		[Register ("onPaymentCancelled", "()V", "")]
		public unsafe void OnPaymentCancelled ()
		{
			const string __id = "onPaymentCancelled.()V";
			try {
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/method[@name='onPaymentError' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody']]"
		[Register ("onPaymentError", "(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V", "")]
		public unsafe void OnPaymentError (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.ErrorResponseBody errorResp)
		{
			const string __id = "onPaymentError.(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((errorResp == null) ? IntPtr.Zero : ((global::Java.Lang.Object) errorResp).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (errorResp);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/method[@name='onPaymentFinished' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody']]"
		[Register ("onPaymentFinished", "(Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;)V", "")]
		public unsafe void OnPaymentFinished (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.TransactionResponseBody response)
		{
			const string __id = "onPaymentFinished.(Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((response == null) ? IntPtr.Zero : ((global::Java.Lang.Object) response).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (response);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BasePaymentFragment']/method[@name='onValidationError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("onValidationError", "(Ljava/lang/String;)V", "")]
		public unsafe void OnValidationError (string validationMsg)
		{
			const string __id = "onValidationError.(Ljava/lang/String;)V";
			IntPtr native_validationMsg = JNIEnv.NewString (validationMsg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_validationMsg);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_validationMsg);
			}
		}

	}
}
