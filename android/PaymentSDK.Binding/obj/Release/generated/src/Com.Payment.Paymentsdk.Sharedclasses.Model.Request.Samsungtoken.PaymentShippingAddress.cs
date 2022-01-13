using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress", DoNotGenerateAcw=true)]
	public sealed partial class PaymentShippingAddress : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress", typeof (PaymentShippingAddress));

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

		internal PaymentShippingAddress (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/constructor[@name='PaymentShippingAddress' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.Shipping']]"
		[Register (".ctor", "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;)V", "")]
		public unsafe PaymentShippingAddress (string email, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping shipping) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_email = JNIEnv.NewString (email);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_email);
				__args [1] = new JniArgumentValue ((shipping == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shipping).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_email);
				global::System.GC.KeepAlive (shipping);
			}
		}

		public unsafe string Email {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/method[@name='getEmail' and count(parameter)=0]"
			[Register ("getEmail", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getEmail.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping Shipping {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/method[@name='getShipping' and count(parameter)=0]"
			[Register ("getShipping", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;", "")]
			get {
				const string __id = "getShipping.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping Component2 ()
		{
			const string __id = "component2.()Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken']/class[@name='PaymentShippingAddress']/method[@name='copy' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.sharedclasses.model.request.samsungtoken.Shipping']]"
		[Register ("copy", "(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;)Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress Copy (string email, global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.Shipping shipping)
		{
			const string __id = "copy.(Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/Shipping;)Lcom/payment/paymentsdk/sharedclasses/model/request/samsungtoken/PaymentShippingAddress;";
			IntPtr native_email = JNIEnv.NewString (email);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_email);
				__args [1] = new JniArgumentValue ((shipping == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shipping).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.Samsungtoken.PaymentShippingAddress> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_email);
				global::System.GC.KeepAlive (shipping);
			}
		}

	}
}
