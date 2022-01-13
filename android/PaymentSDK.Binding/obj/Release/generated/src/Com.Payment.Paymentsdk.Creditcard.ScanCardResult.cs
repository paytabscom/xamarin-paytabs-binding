using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/ScanCardResult", DoNotGenerateAcw=true)]
	public sealed partial class ScanCardResult : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/ScanCardResult", typeof (ScanCardResult));

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

		internal ScanCardResult (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/constructor[@name='ScanCardResult' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe ScanCardResult (string holderName, string cardNumber, string expiryDate) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_holderName = JNIEnv.NewString (holderName);
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			IntPtr native_expiryDate = JNIEnv.NewString (expiryDate);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_holderName);
				__args [1] = new JniArgumentValue (native_cardNumber);
				__args [2] = new JniArgumentValue (native_expiryDate);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_holderName);
				JNIEnv.DeleteLocalRef (native_cardNumber);
				JNIEnv.DeleteLocalRef (native_expiryDate);
			}
		}

		public unsafe string CardNumber {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='getCardNumber' and count(parameter)=0]"
			[Register ("getCardNumber", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCardNumber.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ExpiryDate {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='getExpiryDate' and count(parameter)=0]"
			[Register ("getExpiryDate", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getExpiryDate.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string HolderName {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='getHolderName' and count(parameter)=0]"
			[Register ("getHolderName", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getHolderName.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Ljava/lang/String;", "")]
		public unsafe string Component1 ()
		{
			const string __id = "component1.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Ljava/lang/String;", "")]
		public unsafe string Component2 ()
		{
			const string __id = "component2.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/lang/String;", "")]
		public unsafe string Component3 ()
		{
			const string __id = "component3.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='ScanCardResult']/method[@name='copy' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/ScanCardResult;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Creditcard.ScanCardResult Copy (string holderName, string cardNumber, string expiryDate)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/ScanCardResult;";
			IntPtr native_holderName = JNIEnv.NewString (holderName);
			IntPtr native_cardNumber = JNIEnv.NewString (cardNumber);
			IntPtr native_expiryDate = JNIEnv.NewString (expiryDate);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_holderName);
				__args [1] = new JniArgumentValue (native_cardNumber);
				__args [2] = new JniArgumentValue (native_expiryDate);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.ScanCardResult> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_holderName);
				JNIEnv.DeleteLocalRef (native_cardNumber);
				JNIEnv.DeleteLocalRef (native_expiryDate);
			}
		}

	}
}
