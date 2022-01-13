using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/CardDetails", DoNotGenerateAcw=true)]
	public sealed partial class CardDetails : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/CardDetails", typeof (CardDetails));

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

		internal CardDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/constructor[@name='CardDetails' and count(parameter)=4 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.Integer'] and parameter[3][@type='java.lang.Integer'] and parameter[4][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "")]
		public unsafe CardDetails (string cvv, global::Java.Lang.Integer expiryMonth, global::Java.Lang.Integer expiryYear, string pan) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_cvv = JNIEnv.NewString (cvv);
			IntPtr native_pan = JNIEnv.NewString (pan);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_cvv);
				__args [1] = new JniArgumentValue ((expiryMonth == null) ? IntPtr.Zero : ((global::Java.Lang.Object) expiryMonth).Handle);
				__args [2] = new JniArgumentValue ((expiryYear == null) ? IntPtr.Zero : ((global::Java.Lang.Object) expiryYear).Handle);
				__args [3] = new JniArgumentValue (native_pan);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_cvv);
				JNIEnv.DeleteLocalRef (native_pan);
				global::System.GC.KeepAlive (expiryMonth);
				global::System.GC.KeepAlive (expiryYear);
			}
		}

		public unsafe string Cvv {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='getCvv' and count(parameter)=0]"
			[Register ("getCvv", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCvv.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Integer ExpiryMonth {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='getExpiryMonth' and count(parameter)=0]"
			[Register ("getExpiryMonth", "()Ljava/lang/Integer;", "")]
			get {
				const string __id = "getExpiryMonth.()Ljava/lang/Integer;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Integer ExpiryYear {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='getExpiryYear' and count(parameter)=0]"
			[Register ("getExpiryYear", "()Ljava/lang/Integer;", "")]
			get {
				const string __id = "getExpiryYear.()Ljava/lang/Integer;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Pan {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='getPan' and count(parameter)=0]"
			[Register ("getPan", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPan.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Ljava/lang/Integer;", "")]
		public unsafe global::Java.Lang.Integer Component2 ()
		{
			const string __id = "component2.()Ljava/lang/Integer;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/lang/Integer;", "")]
		public unsafe global::Java.Lang.Integer Component3 ()
		{
			const string __id = "component3.()Ljava/lang/Integer;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Integer> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Ljava/lang/String;", "")]
		public unsafe string Component4 ()
		{
			const string __id = "component4.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='CardDetails']/method[@name='copy' and count(parameter)=4 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.Integer'] and parameter[3][@type='java.lang.Integer'] and parameter[4][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails Copy (string cvv, global::Java.Lang.Integer expiryMonth, global::Java.Lang.Integer expiryYear, string pan)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/CardDetails;";
			IntPtr native_cvv = JNIEnv.NewString (cvv);
			IntPtr native_pan = JNIEnv.NewString (pan);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_cvv);
				__args [1] = new JniArgumentValue ((expiryMonth == null) ? IntPtr.Zero : ((global::Java.Lang.Object) expiryMonth).Handle);
				__args [2] = new JniArgumentValue ((expiryYear == null) ? IntPtr.Zero : ((global::Java.Lang.Object) expiryYear).Handle);
				__args [3] = new JniArgumentValue (native_pan);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.CardDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_cvv);
				JNIEnv.DeleteLocalRef (native_pan);
				global::System.GC.KeepAlive (expiryMonth);
				global::System.GC.KeepAlive (expiryYear);
			}
		}

	}
}
