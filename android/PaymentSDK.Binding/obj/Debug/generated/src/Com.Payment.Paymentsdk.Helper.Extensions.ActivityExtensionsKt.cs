using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ActivityExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/ActivityExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class ActivityExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/ActivityExtensionsKt", typeof (ActivityExtensionsKt));

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

		internal ActivityExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ActivityExtensionsKt']/method[@name='showErrorDialog' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register ("showErrorDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public static unsafe void ShowErrorDialog (global::Android.App.Activity obj, string label, string msg)
		{
			const string __id = "showErrorDialog.(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V";
			IntPtr native_label = JNIEnv.NewString (label);
			IntPtr native_msg = JNIEnv.NewString (msg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_label);
				__args [2] = new JniArgumentValue (native_msg);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_label);
				JNIEnv.DeleteLocalRef (native_msg);
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
