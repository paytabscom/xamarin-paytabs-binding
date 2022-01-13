using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='FragmentExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/FragmentExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class FragmentExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/FragmentExtensionsKt", typeof (FragmentExtensionsKt));

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

		internal FragmentExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='FragmentExtensionsKt']/method[@name='isNetworkAvailable' and count(parameter)=1 and parameter[1][@type='androidx.fragment.app.Fragment']]"
		[Register ("isNetworkAvailable", "(Landroidx/fragment/app/Fragment;)Z", "")]
		public static unsafe bool IsNetworkAvailable (global::AndroidX.Fragment.App.Fragment obj)
		{
			const string __id = "isNetworkAvailable.(Landroidx/fragment/app/Fragment;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='FragmentExtensionsKt']/method[@name='listenToRequestKeyBundle' and count(parameter)=3 and parameter[1][@type='androidx.fragment.app.Fragment'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='kotlin.jvm.functions.Function1&lt;? super android.os.Bundle, kotlin.Unit&gt;']]"
		[Register ("listenToRequestKeyBundle", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "")]
		public static unsafe void ListenToRequestKeyBundle (global::AndroidX.Fragment.App.Fragment obj, string reqKey, global::Kotlin.Jvm.Functions.IFunction1 @callback)
		{
			const string __id = "listenToRequestKeyBundle.(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V";
			IntPtr native_reqKey = JNIEnv.NewString (reqKey);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_reqKey);
				__args [2] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_reqKey);
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (@callback);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='FragmentExtensionsKt']/method[@name='showAlertDialog' and count(parameter)=4 and parameter[1][@type='androidx.fragment.app.Fragment'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("showAlertDialog", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "")]
		public static unsafe void ShowAlertDialog (global::AndroidX.Fragment.App.Fragment obj, string title, string msg, global::Kotlin.Jvm.Functions.IFunction0 onPositiveClicked)
		{
			const string __id = "showAlertDialog.(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V";
			IntPtr native_title = JNIEnv.NewString (title);
			IntPtr native_msg = JNIEnv.NewString (msg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_title);
				__args [2] = new JniArgumentValue (native_msg);
				__args [3] = new JniArgumentValue ((onPositiveClicked == null) ? IntPtr.Zero : ((global::Java.Lang.Object) onPositiveClicked).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_title);
				JNIEnv.DeleteLocalRef (native_msg);
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (onPositiveClicked);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='FragmentExtensionsKt']/method[@name='showToast' and count(parameter)=2 and parameter[1][@type='androidx.fragment.app.Fragment'] and parameter[2][@type='java.lang.String']]"
		[Register ("showToast", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "")]
		public static unsafe void ShowToast (global::AndroidX.Fragment.App.Fragment obj, string msg)
		{
			const string __id = "showToast.(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V";
			IntPtr native_msg = JNIEnv.NewString (msg);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_msg);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_msg);
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
