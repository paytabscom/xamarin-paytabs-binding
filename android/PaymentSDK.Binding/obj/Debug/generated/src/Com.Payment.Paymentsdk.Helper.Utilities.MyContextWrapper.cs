using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='MyContextWrapper']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/MyContextWrapper", DoNotGenerateAcw=true)]
	public sealed partial class MyContextWrapper : global::Android.Content.ContextWrapper {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/MyContextWrapper", typeof (MyContextWrapper));

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

		internal MyContextWrapper (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='MyContextWrapper']/constructor[@name='MyContextWrapper' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='java.lang.String']]"
		[Register (".ctor", "(Landroid/content/Context;Ljava/lang/String;)V", "")]
		public unsafe MyContextWrapper (global::Android.Content.Context @base, string language) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_language = JNIEnv.NewString (language);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((@base == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @base).Handle);
				__args [1] = new JniArgumentValue (native_language);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_language);
				global::System.GC.KeepAlive (@base);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='MyContextWrapper']/method[@name='getSystemLocale' and count(parameter)=1 and parameter[1][@type='android.content.res.Configuration']]"
		[Register ("getSystemLocale", "(Landroid/content/res/Configuration;)Ljava/util/Locale;", "")]
		public unsafe global::Java.Util.Locale GetSystemLocale (global::Android.Content.Res.Configuration config)
		{
			const string __id = "getSystemLocale.(Landroid/content/res/Configuration;)Ljava/util/Locale;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((config == null) ? IntPtr.Zero : ((global::Java.Lang.Object) config).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Java.Util.Locale> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (config);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='MyContextWrapper']/method[@name='setSystemLocale' and count(parameter)=2 and parameter[1][@type='android.content.res.Configuration'] and parameter[2][@type='java.util.Locale']]"
		[Register ("setSystemLocale", "(Landroid/content/res/Configuration;Ljava/util/Locale;)V", "")]
		public unsafe void SetSystemLocale (global::Android.Content.Res.Configuration config, global::Java.Util.Locale locale)
		{
			const string __id = "setSystemLocale.(Landroid/content/res/Configuration;Ljava/util/Locale;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((config == null) ? IntPtr.Zero : ((global::Java.Lang.Object) config).Handle);
				__args [1] = new JniArgumentValue ((locale == null) ? IntPtr.Zero : ((global::Java.Lang.Object) locale).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (config);
				global::System.GC.KeepAlive (locale);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='MyContextWrapper']/method[@name='wrap' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("wrap", "(Landroid/content/Context;)Landroid/content/ContextWrapper;", "")]
		public unsafe global::Android.Content.ContextWrapper Wrap (global::Android.Content.Context c)
		{
			const string __id = "wrap.(Landroid/content/Context;)Landroid/content/ContextWrapper;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((c == null) ? IntPtr.Zero : ((global::Java.Lang.Object) c).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Android.Content.ContextWrapper> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (c);
			}
		}

	}
}
