using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

// Metadata.xml XPath class reference: path="/api/package[@name='']/class[@name='DialogsKt']"
[global::Android.Runtime.Register ("DialogsKt", DoNotGenerateAcw=true)]
public sealed partial class DialogsKt : global::Java.Lang.Object {
	static readonly JniPeerMembers _members = new XAPeerMembers ("DialogsKt", typeof (DialogsKt));

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

	internal DialogsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
	{
	}

	// Metadata.xml XPath method reference: path="/api/package[@name='']/class[@name='DialogsKt']/method[@name='showValidationErrorDialog' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
	[Register ("showValidationErrorDialog", "(Landroid/app/Activity;Ljava/lang/String;)V", "")]
	public static unsafe void ShowValidationErrorDialog (global::Android.App.Activity activity, string msg)
	{
		const string __id = "showValidationErrorDialog.(Landroid/app/Activity;Ljava/lang/String;)V";
		IntPtr native_msg = JNIEnv.NewString (msg);
		try {
			JniArgumentValue* __args = stackalloc JniArgumentValue [2];
			__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
			__args [1] = new JniArgumentValue (native_msg);
			_members.StaticMethods.InvokeVoidMethod (__id, __args);
		} finally {
			JNIEnv.DeleteLocalRef (native_msg);
			global::System.GC.KeepAlive (activity);
		}
	}

}
