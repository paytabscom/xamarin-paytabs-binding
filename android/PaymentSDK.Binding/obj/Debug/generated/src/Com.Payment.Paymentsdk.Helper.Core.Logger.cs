using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Core {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/core/Logger", DoNotGenerateAcw=true)]
	public partial class Logger : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/core/Logger", typeof (Logger));

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

		protected Logger (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']/constructor[@name='Logger' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe Logger () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']/method[@name='d' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("d", "(Ljava/lang/String;)V", "")]
		public static unsafe void D (string str)
		{
			const string __id = "d.(Ljava/lang/String;)V";
			IntPtr native_str = JNIEnv.NewString (str);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_str);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_str);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']/method[@name='e' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.Throwable']]"
		[Register ("e", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "")]
		public static unsafe void E (string str, global::Java.Lang.Throwable e)
		{
			const string __id = "e.(Ljava/lang/String;Ljava/lang/Throwable;)V";
			IntPtr native_str = JNIEnv.NewString (str);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_str);
				__args [1] = new JniArgumentValue ((e == null) ? IntPtr.Zero : ((global::Java.Lang.Throwable) e).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_str);
				global::System.GC.KeepAlive (e);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']/method[@name='i' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("i", "(Ljava/lang/String;)V", "")]
		public static unsafe void I (string str)
		{
			const string __id = "i.(Ljava/lang/String;)V";
			IntPtr native_str = JNIEnv.NewString (str);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_str);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_str);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='Logger']/method[@name='v' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("v", "(Ljava/lang/String;)V", "")]
		public static unsafe void V (string str)
		{
			const string __id = "v.(Ljava/lang/String;)V";
			IntPtr native_str = JNIEnv.NewString (str);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_str);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_str);
			}
		}

	}
}
