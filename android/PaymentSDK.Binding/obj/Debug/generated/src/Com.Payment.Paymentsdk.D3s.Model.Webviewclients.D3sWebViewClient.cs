using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.Model.Webviewclients {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.webviewclients']/class[@name='D3sWebViewClient']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/webviewclients/D3sWebViewClient", DoNotGenerateAcw=true)]
	public sealed partial class D3sWebViewClient : global::Android.Webkit.WebViewClient {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/webviewclients/D3sWebViewClient", typeof (D3sWebViewClient));

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

		internal D3sWebViewClient (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.webviewclients']/class[@name='D3sWebViewClient']/constructor[@name='D3sWebViewClient' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='com.payment.paymentsdk.d3s.model.interfaces.D3SSViewAuthorizationListener']]"
		[Register (".ctor", "(Ljava/lang/String;Lcom/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener;)V", "")]
		public unsafe D3sWebViewClient (string returnUrl, global::Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListener authorizationListener) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Lcom/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_returnUrl = JNIEnv.NewString (returnUrl);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_returnUrl);
				__args [1] = new JniArgumentValue ((authorizationListener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) authorizationListener).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_returnUrl);
				global::System.GC.KeepAlive (authorizationListener);
			}
		}

	}
}
