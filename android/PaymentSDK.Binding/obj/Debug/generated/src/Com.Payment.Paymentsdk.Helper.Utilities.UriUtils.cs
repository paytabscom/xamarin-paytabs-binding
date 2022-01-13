using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/UriUtils", DoNotGenerateAcw=true)]
	public partial class UriUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/UriUtils", typeof (UriUtils));

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

		protected UriUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/constructor[@name='UriUtils' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe UriUtils () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='getDataColumn' and count(parameter)=4 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.net.Uri'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String[]']]"
		[Register ("getDataColumn", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "")]
		public static unsafe string GetDataColumn (global::Android.Content.Context context, global::Android.Net.Uri uri, string selection, string[] selectionArgs)
		{
			const string __id = "getDataColumn.(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;";
			IntPtr native_selection = JNIEnv.NewString (selection);
			IntPtr native_selectionArgs = JNIEnv.NewArray (selectionArgs);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				__args [2] = new JniArgumentValue (native_selection);
				__args [3] = new JniArgumentValue (native_selectionArgs);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_selection);
				if (selectionArgs != null) {
					JNIEnv.CopyArray (native_selectionArgs, selectionArgs);
					JNIEnv.DeleteLocalRef (native_selectionArgs);
				}
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (uri);
				global::System.GC.KeepAlive (selectionArgs);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='getPath' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.net.Uri']]"
		[Register ("getPath", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "")]
		public static unsafe string GetPath (global::Android.Content.Context context, global::Android.Net.Uri uri)
		{
			const string __id = "getPath.(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (uri);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='isDownloadsDocument' and count(parameter)=1 and parameter[1][@type='android.net.Uri']]"
		[Register ("isDownloadsDocument", "(Landroid/net/Uri;)Z", "")]
		public static unsafe bool IsDownloadsDocument (global::Android.Net.Uri uri)
		{
			const string __id = "isDownloadsDocument.(Landroid/net/Uri;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (uri);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='isExternalStorageDocument' and count(parameter)=1 and parameter[1][@type='android.net.Uri']]"
		[Register ("isExternalStorageDocument", "(Landroid/net/Uri;)Z", "")]
		public static unsafe bool IsExternalStorageDocument (global::Android.Net.Uri uri)
		{
			const string __id = "isExternalStorageDocument.(Landroid/net/Uri;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (uri);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='isGooglePhotosUri' and count(parameter)=1 and parameter[1][@type='android.net.Uri']]"
		[Register ("isGooglePhotosUri", "(Landroid/net/Uri;)Z", "")]
		public static unsafe bool IsGooglePhotosUri (global::Android.Net.Uri uri)
		{
			const string __id = "isGooglePhotosUri.(Landroid/net/Uri;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (uri);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='UriUtils']/method[@name='isMediaDocument' and count(parameter)=1 and parameter[1][@type='android.net.Uri']]"
		[Register ("isMediaDocument", "(Landroid/net/Uri;)Z", "")]
		public static unsafe bool IsMediaDocument (global::Android.Net.Uri uri)
		{
			const string __id = "isMediaDocument.(Landroid/net/Uri;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((uri == null) ? IntPtr.Zero : ((global::Java.Lang.Object) uri).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (uri);
			}
		}

	}
}
