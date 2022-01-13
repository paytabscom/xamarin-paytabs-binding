using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/PermissionUtils", DoNotGenerateAcw=true)]
	public partial class PermissionUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/PermissionUtils", typeof (PermissionUtils));

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

		protected PermissionUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/constructor[@name='PermissionUtils' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe PermissionUtils () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='goToAppSettings' and count(parameter)=1 and parameter[1][@type='android.app.Activity']]"
		[Register ("goToAppSettings", "(Landroid/app/Activity;)V", "")]
		public static unsafe void GoToAppSettings (global::Android.App.Activity activity)
		{
			const string __id = "goToAppSettings.(Landroid/app/Activity;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='hasAskedForPermission' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
		[Register ("hasAskedForPermission", "(Landroid/app/Activity;Ljava/lang/String;)Z", "")]
		public static unsafe bool HasAskedForPermission (global::Android.App.Activity activity, string permission)
		{
			const string __id = "hasAskedForPermission.(Landroid/app/Activity;Ljava/lang/String;)Z";
			IntPtr native_permission = JNIEnv.NewString (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_permission);
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='hasPermission' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
		[Register ("hasPermission", "(Landroid/app/Activity;Ljava/lang/String;)Z", "")]
		public static unsafe bool HasPermission (global::Android.App.Activity activity, string permission)
		{
			const string __id = "hasPermission.(Landroid/app/Activity;Ljava/lang/String;)Z";
			IntPtr native_permission = JNIEnv.NewString (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_permission);
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='markedPermissionAsAsked' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
		[Register ("markedPermissionAsAsked", "(Landroid/app/Activity;Ljava/lang/String;)V", "")]
		public static unsafe void MarkedPermissionAsAsked (global::Android.App.Activity activity, string permission)
		{
			const string __id = "markedPermissionAsAsked.(Landroid/app/Activity;Ljava/lang/String;)V";
			IntPtr native_permission = JNIEnv.NewString (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_permission);
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='requestPermissions' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String[]'] and parameter[3][@type='int']]"
		[Register ("requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "")]
		public static unsafe void RequestPermissions (global::Android.App.Activity activity, string[] permission, int requestCode)
		{
			const string __id = "requestPermissions.(Landroid/app/Activity;[Ljava/lang/String;I)V";
			IntPtr native_permission = JNIEnv.NewArray (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				__args [2] = new JniArgumentValue (requestCode);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				if (permission != null) {
					JNIEnv.CopyArray (native_permission, permission);
					JNIEnv.DeleteLocalRef (native_permission);
				}
				global::System.GC.KeepAlive (activity);
				global::System.GC.KeepAlive (permission);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='requestPermissions' and count(parameter)=3 and parameter[1][@type='androidx.fragment.app.Fragment'] and parameter[2][@type='java.lang.String[]'] and parameter[3][@type='int']]"
		[Register ("requestPermissions", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "")]
		public static unsafe void RequestPermissions (global::AndroidX.Fragment.App.Fragment fragment, string[] permission, int requestCode)
		{
			const string __id = "requestPermissions.(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V";
			IntPtr native_permission = JNIEnv.NewArray (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((fragment == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragment).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				__args [2] = new JniArgumentValue (requestCode);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				if (permission != null) {
					JNIEnv.CopyArray (native_permission, permission);
					JNIEnv.DeleteLocalRef (native_permission);
				}
				global::System.GC.KeepAlive (fragment);
				global::System.GC.KeepAlive (permission);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='shouldAskForPermission' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
		[Register ("shouldAskForPermission", "(Landroid/app/Activity;Ljava/lang/String;)Z", "")]
		public static unsafe bool ShouldAskForPermission (global::Android.App.Activity activity, string permission)
		{
			const string __id = "shouldAskForPermission.(Landroid/app/Activity;Ljava/lang/String;)Z";
			IntPtr native_permission = JNIEnv.NewString (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_permission);
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='shouldShowRational' and count(parameter)=2 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.String']]"
		[Register ("shouldShowRational", "(Landroid/app/Activity;Ljava/lang/String;)Z", "")]
		public static unsafe bool ShouldShowRational (global::Android.App.Activity activity, string permission)
		{
			const string __id = "shouldShowRational.(Landroid/app/Activity;Ljava/lang/String;)Z";
			IntPtr native_permission = JNIEnv.NewString (permission);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue (native_permission);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_permission);
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='PermissionUtils']/method[@name='useRunTimePermissions' and count(parameter)=0]"
		[Register ("useRunTimePermissions", "()Z", "")]
		public static unsafe bool UseRunTimePermissions ()
		{
			const string __id = "useRunTimePermissions.()Z";
			try {
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, null);
				return __rm;
			} finally {
			}
		}

	}
}
