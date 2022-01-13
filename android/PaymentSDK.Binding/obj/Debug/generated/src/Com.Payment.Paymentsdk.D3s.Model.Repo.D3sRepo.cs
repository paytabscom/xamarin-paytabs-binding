using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.Model.Repo {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.repo']/class[@name='D3sRepo']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/repo/D3sRepo", DoNotGenerateAcw=true)]
	public sealed partial class D3sRepo : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/repo/D3sRepo", typeof (D3sRepo));

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

		internal D3sRepo (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.repo']/class[@name='D3sRepo']/constructor[@name='D3sRepo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.utils.CBCEncryptor']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/utils/CBCEncryptor;)V", "")]
		public unsafe D3sRepo (global::Com.Payment.Paymentsdk.Sharedclasses.Utils.CBCEncryptor encryptor) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/sharedclasses/utils/CBCEncryptor;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((encryptor == null) ? IntPtr.Zero : ((global::Java.Lang.Object) encryptor).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (encryptor);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.repo']/class[@name='D3sRepo']/method[@name='queryTransaction' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='kotlin.coroutines.Continuation&lt;? super com.payment.paymentsdk.d3s.model.responsewrappers.D3sResponseWrapper&gt;']]"
		[Register ("queryTransaction", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "")]
		public unsafe global::Java.Lang.Object QueryTransaction (string p0, string p1, global::Kotlin.Coroutines.IContinuation p2)
		{
			const string __id = "queryTransaction.(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			IntPtr native_p1 = JNIEnv.NewString (p1);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (native_p1);
				__args [2] = new JniArgumentValue ((p2 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p2).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				JNIEnv.DeleteLocalRef (native_p1);
				global::System.GC.KeepAlive (p2);
			}
		}

	}
}
