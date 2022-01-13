using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.Viewmodel {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.viewmodel']/class[@name='D3sViewModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/viewmodel/D3sViewModel", DoNotGenerateAcw=true)]
	public sealed partial class D3sViewModel : global::Com.Payment.Paymentsdk.Helper.Base.BaseViewModel {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/viewmodel/D3sViewModel", typeof (D3sViewModel));

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

		internal D3sViewModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.viewmodel']/class[@name='D3sViewModel']/constructor[@name='D3sViewModel' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.d3s.model.repo.D3sRepo']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/d3s/model/repo/D3sRepo;)V", "")]
		public unsafe D3sViewModel (global::Com.Payment.Paymentsdk.D3s.Model.Repo.D3sRepo repo) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/d3s/model/repo/D3sRepo;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((repo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) repo).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (repo);
			}
		}

		public unsafe global::AndroidX.Lifecycle.MutableLiveData PaymentSucceed {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.viewmodel']/class[@name='D3sViewModel']/method[@name='getPaymentSucceed' and count(parameter)=0]"
			[Register ("getPaymentSucceed", "()Landroidx/lifecycle/MutableLiveData;", "")]
			get {
				const string __id = "getPaymentSucceed.()Landroidx/lifecycle/MutableLiveData;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.MutableLiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.viewmodel']/class[@name='D3sViewModel']/method[@name='queryTransaction' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String']]"
		[Register ("queryTransaction", "(Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe void QueryTransaction (string transReference, string profileId)
		{
			const string __id = "queryTransaction.(Ljava/lang/String;Ljava/lang/String;)V";
			IntPtr native_transReference = JNIEnv.NewString (transReference);
			IntPtr native_profileId = JNIEnv.NewString (profileId);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_transReference);
				__args [1] = new JniArgumentValue (native_profileId);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_transReference);
				JNIEnv.DeleteLocalRef (native_profileId);
			}
		}

	}
}
