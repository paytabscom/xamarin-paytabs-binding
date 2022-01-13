using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/Connectivity", DoNotGenerateAcw=true)]
	public partial class Connectivity : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/Connectivity", typeof (Connectivity));

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

		protected Connectivity (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/constructor[@name='Connectivity' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe Connectivity () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='getNetworkInfo' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("getNetworkInfo", "(Landroid/content/Context;)Landroid/net/NetworkInfo;", "")]
		public static unsafe global::Android.Net.NetworkInfo GetNetworkInfo (global::Android.Content.Context context)
		{
			const string __id = "getNetworkInfo.(Landroid/content/Context;)Landroid/net/NetworkInfo;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Android.Net.NetworkInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='isConnected' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isConnected", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsConnected (global::Android.Content.Context context)
		{
			const string __id = "isConnected.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='isConnectedFast' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isConnectedFast", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsConnectedFast (global::Android.Content.Context context)
		{
			const string __id = "isConnectedFast.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='isConnectedMobile' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isConnectedMobile", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsConnectedMobile (global::Android.Content.Context context)
		{
			const string __id = "isConnectedMobile.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='isConnectedWifi' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isConnectedWifi", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsConnectedWifi (global::Android.Content.Context context)
		{
			const string __id = "isConnectedWifi.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='Connectivity']/method[@name='isConnectionFast' and count(parameter)=2 and parameter[1][@type='int'] and parameter[2][@type='int']]"
		[Register ("isConnectionFast", "(II)Z", "")]
		public static unsafe bool IsConnectionFast (int type, int subType)
		{
			const string __id = "isConnectionFast.(II)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (type);
				__args [1] = new JniArgumentValue (subType);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
			}
		}

	}
}
