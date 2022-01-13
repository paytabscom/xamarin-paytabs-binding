using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/view/D3sFragment", DoNotGenerateAcw=true)]
	public sealed partial class D3sFragment : global::Com.Payment.Paymentsdk.Sharedclasses.Base.BasePaymentFragment, global::Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListener {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/view/D3sFragment$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/view/D3sFragment$Companion", typeof (Companion));

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

			internal Companion (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment.Companion']/constructor[@name='D3sFragment.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
			[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
			public unsafe Companion (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((_constructor_marker == null) ? IntPtr.Zero : ((global::Java.Lang.Object) _constructor_marker).Handle);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (_constructor_marker);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment.Companion']/method[@name='newInstance' and count(parameter)=5 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='boolean']]"
			[Register ("newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/payment/paymentsdk/d3s/view/D3sFragment;", "")]
			public unsafe global::Com.Payment.Paymentsdk.D3s.View.D3sFragment NewInstance (string profileId, string redirectUrl, string returnUrl, string transactionReference, bool isApm)
			{
				const string __id = "newInstance.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/payment/paymentsdk/d3s/view/D3sFragment;";
				IntPtr native_profileId = JNIEnv.NewString (profileId);
				IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
				IntPtr native_returnUrl = JNIEnv.NewString (returnUrl);
				IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [5];
					__args [0] = new JniArgumentValue (native_profileId);
					__args [1] = new JniArgumentValue (native_redirectUrl);
					__args [2] = new JniArgumentValue (native_returnUrl);
					__args [3] = new JniArgumentValue (native_transactionReference);
					__args [4] = new JniArgumentValue (isApm);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.View.D3sFragment> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					JNIEnv.DeleteLocalRef (native_profileId);
					JNIEnv.DeleteLocalRef (native_redirectUrl);
					JNIEnv.DeleteLocalRef (native_returnUrl);
					JNIEnv.DeleteLocalRef (native_transactionReference);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/view/D3sFragment", typeof (D3sFragment));

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

		internal D3sFragment (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment']/constructor[@name='D3sFragment' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe D3sFragment () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment']/method[@name='newInstance' and count(parameter)=5 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='boolean']]"
		[Register ("newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/payment/paymentsdk/d3s/view/D3sFragment;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.D3s.View.D3sFragment NewInstance (string profileId, string redirectUrl, string returnUrl, string transactionReference, bool isApm)
		{
			const string __id = "newInstance.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/payment/paymentsdk/d3s/view/D3sFragment;";
			IntPtr native_profileId = JNIEnv.NewString (profileId);
			IntPtr native_redirectUrl = JNIEnv.NewString (redirectUrl);
			IntPtr native_returnUrl = JNIEnv.NewString (returnUrl);
			IntPtr native_transactionReference = JNIEnv.NewString (transactionReference);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue (native_profileId);
				__args [1] = new JniArgumentValue (native_redirectUrl);
				__args [2] = new JniArgumentValue (native_returnUrl);
				__args [3] = new JniArgumentValue (native_transactionReference);
				__args [4] = new JniArgumentValue (isApm);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.View.D3sFragment> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_profileId);
				JNIEnv.DeleteLocalRef (native_redirectUrl);
				JNIEnv.DeleteLocalRef (native_returnUrl);
				JNIEnv.DeleteLocalRef (native_transactionReference);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment']/method[@name='onAuthorizationCompleted' and count(parameter)=0]"
		[Register ("onAuthorizationCompleted", "()V", "")]
		public unsafe void OnAuthorizationCompleted ()
		{
			const string __id = "onAuthorizationCompleted.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3sFragment']/method[@name='onAuthorizationWebPageLoadingProgressChanged' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("onAuthorizationWebPageLoadingProgressChanged", "(I)V", "")]
		public unsafe void OnAuthorizationWebPageLoadingProgressChanged (int progress)
		{
			const string __id = "onAuthorizationWebPageLoadingProgressChanged.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (progress);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

	}
}
