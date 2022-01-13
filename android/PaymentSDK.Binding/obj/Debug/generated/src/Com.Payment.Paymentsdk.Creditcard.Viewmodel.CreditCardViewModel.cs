using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.Viewmodel {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/viewmodel/CreditCardViewModel", DoNotGenerateAcw=true)]
	public sealed partial class CreditCardViewModel : global::Com.Payment.Paymentsdk.Helper.Base.BaseViewModel {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/viewmodel/CreditCardViewModel", typeof (CreditCardViewModel));

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

		internal CreditCardViewModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']/constructor[@name='CreditCardViewModel' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.creditcard.model.repo.CreditCardRepo'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/creditcard/model/repo/CreditCardRepo;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe CreditCardViewModel (global::Com.Payment.Paymentsdk.Creditcard.Model.Repo.CreditCardRepo repo, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/creditcard/model/repo/CreditCardRepo;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";

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

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent PaymentSucceed3dsLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']/method[@name='getPaymentSucceed3dsLD' and count(parameter)=0]"
			[Register ("getPaymentSucceed3dsLD", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getPaymentSucceed3dsLD.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent PaymentSucceedWithout3dsLD {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']/method[@name='getPaymentSucceedWithout3dsLD' and count(parameter)=0]"
			[Register ("getPaymentSucceedWithout3dsLD", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getPaymentSucceedWithout3dsLD.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']/method[@name='buildRequestBody' and count(parameter)=7 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[7][@type='boolean']]"
		[Register ("buildRequestBody", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Z)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody BuildRequestBody (string cardNumber, string expYear, string expMonth, string holderName, string cvv, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, bool shouldTokenise)
		{
			const string __id = "buildRequestBody.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Z)Lcom/payment/paymentsdk/sharedclasses/model/request/TransactionRequestBody;";
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			IntPtr native_expYear = JNIEnv.NewString (expYear);
			IntPtr native_expMonth = JNIEnv.NewString (expMonth);
			IntPtr native_holderName = JNIEnv.NewString (holderName);
			IntPtr native_cvv = JNIEnv.NewString (cvv);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [7];
				__args [0] = new JniArgumentValue (native_cardNumber);
				__args [1] = new JniArgumentValue (native_expYear);
				__args [2] = new JniArgumentValue (native_expMonth);
				__args [3] = new JniArgumentValue (native_holderName);
				__args [4] = new JniArgumentValue (native_cvv);
				__args [5] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				__args [6] = new JniArgumentValue (shouldTokenise);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.TransactionRequestBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cardNumber);
				JNIEnv.DeleteLocalRef (native_expYear);
				JNIEnv.DeleteLocalRef (native_expMonth);
				JNIEnv.DeleteLocalRef (native_holderName);
				JNIEnv.DeleteLocalRef (native_cvv);
				global::System.GC.KeepAlive (ptConfigData);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.viewmodel']/class[@name='CreditCardViewModel']/method[@name='doTransaction' and count(parameter)=6 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='boolean']]"
		[Register ("doTransaction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "")]
		public unsafe void DoTransaction (string cardNumber, string expYear, string expMonth, string holderName, string cvv, bool shouldTokenise)
		{
			const string __id = "doTransaction.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V";
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			IntPtr native_expYear = JNIEnv.NewString (expYear);
			IntPtr native_expMonth = JNIEnv.NewString (expMonth);
			IntPtr native_holderName = JNIEnv.NewString (holderName);
			IntPtr native_cvv = JNIEnv.NewString (cvv);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [6];
				__args [0] = new JniArgumentValue (native_cardNumber);
				__args [1] = new JniArgumentValue (native_expYear);
				__args [2] = new JniArgumentValue (native_expMonth);
				__args [3] = new JniArgumentValue (native_holderName);
				__args [4] = new JniArgumentValue (native_cvv);
				__args [5] = new JniArgumentValue (shouldTokenise);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_cardNumber);
				JNIEnv.DeleteLocalRef (native_expYear);
				JNIEnv.DeleteLocalRef (native_expMonth);
				JNIEnv.DeleteLocalRef (native_holderName);
				JNIEnv.DeleteLocalRef (native_cvv);
			}
		}

	}
}
