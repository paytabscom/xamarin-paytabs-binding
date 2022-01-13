using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Samsungpay.Viewmodel {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/samsungpay/viewmodel/SamsungPayViewModel", DoNotGenerateAcw=true)]
	public sealed partial class SamsungPayViewModel : global::Com.Payment.Paymentsdk.Helper.Base.BaseViewModel {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/samsungpay/viewmodel/SamsungPayViewModel", typeof (SamsungPayViewModel));

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

		internal SamsungPayViewModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/constructor[@name='SamsungPayViewModel' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.samsungpay.model.repo.SamsungPayRepo'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/samsungpay/model/repo/SamsungPayRepo;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe SamsungPayViewModel (global::Com.Payment.Paymentsdk.Samsungpay.Model.Repo.SamsungPayRepo repo, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/samsungpay/model/repo/SamsungPayRepo;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((repo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) repo).Handle);
				__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (repo);
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		public unsafe global::AndroidX.Lifecycle.MutableLiveData InvalidConfigDataLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/method[@name='getInvalidConfigDataLD' and count(parameter)=0]"
			[Register ("getInvalidConfigDataLD", "()Landroidx/lifecycle/MutableLiveData;", "")]
			get {
				const string __id = "getInvalidConfigDataLD.()Landroidx/lifecycle/MutableLiveData;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.MutableLiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::AndroidX.Lifecycle.MutableLiveData PaymentSucceed3dsLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/method[@name='getPaymentSucceed3dsLD' and count(parameter)=0]"
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
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/method[@name='getPaymentSucceedWithout3dsLD' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/method[@name='buildRequestBody' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register ("buildRequestBody", "(Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody BuildRequestBody (string samsungPayToken, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData)
		{
			const string __id = "buildRequestBody.(Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			IntPtr native_samsungPayToken = JNIEnv.NewString (samsungPayToken);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_samsungPayToken);
				__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_samsungPayToken);
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.viewmodel']/class[@name='SamsungPayViewModel']/method[@name='doTransaction' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("doTransaction", "(Ljava/lang/String;)V", "")]
		public unsafe void DoTransaction (string samsungPayToken)
		{
			const string __id = "doTransaction.(Ljava/lang/String;)V";
			IntPtr native_samsungPayToken = JNIEnv.NewString (samsungPayToken);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_samsungPayToken);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_samsungPayToken);
			}
		}

	}
}
