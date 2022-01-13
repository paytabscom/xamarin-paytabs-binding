using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3SView']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/view/D3SView", DoNotGenerateAcw=true)]
	public sealed partial class D3SView : global::Android.Webkit.WebView {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/view/D3SView", typeof (D3SView));

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

		internal D3SView (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3SView']/constructor[@name='D3SView' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe D3SView (global::Android.Content.Context activity) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3SView']/constructor[@name='D3SView' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe D3SView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3SView']/constructor[@name='D3SView' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe D3SView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyle) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				__args [2] = new JniArgumentValue (defStyle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.view']/class[@name='D3SView']/method[@name='authorize' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='com.payment.paymentsdk.d3s.model.interfaces.D3SSViewAuthorizationListener']]"
		[Register ("authorize", "(Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener;)V", "")]
		public unsafe void Authorize (string redirectURL, string returnUrl, global::Com.Payment.Paymentsdk.D3s.Model.Interfaces.ID3SSViewAuthorizationListener listener)
		{
			const string __id = "authorize.(Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/d3s/model/interfaces/D3SSViewAuthorizationListener;)V";
			IntPtr native_redirectURL = JNIEnv.NewString (redirectURL);
			IntPtr native_returnUrl = JNIEnv.NewString (returnUrl);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_redirectURL);
				__args [1] = new JniArgumentValue (native_returnUrl);
				__args [2] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_redirectURL);
				JNIEnv.DeleteLocalRef (native_returnUrl);
				global::System.GC.KeepAlive (listener);
			}
		}

	}
}
