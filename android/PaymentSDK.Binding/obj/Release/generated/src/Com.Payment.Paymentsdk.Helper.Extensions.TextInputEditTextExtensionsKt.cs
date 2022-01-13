using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextInputEditTextExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/TextInputEditTextExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class TextInputEditTextExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/TextInputEditTextExtensionsKt", typeof (TextInputEditTextExtensionsKt));

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

		internal TextInputEditTextExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextInputEditTextExtensionsKt']/method[@name='getStringValue' and count(parameter)=1 and parameter[1][@type='com.google.android.material.textfield.TextInputEditText']]"
		[Register ("getStringValue", "(Lcom/google/android/material/textfield/TextInputEditText;)Ljava/lang/String;", "")]
		public static unsafe string GetStringValue (global::Google.Android.Material.TextField.TextInputEditText obj)
		{
			const string __id = "getStringValue.(Lcom/google/android/material/textfield/TextInputEditText;)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextInputEditTextExtensionsKt']/method[@name='removeErrorWhenEditing' and count(parameter)=2 and parameter[1][@type='com.google.android.material.textfield.TextInputEditText'] and parameter[2][@type='com.google.android.material.textfield.TextInputLayout']]"
		[Register ("removeErrorWhenEditing", "(Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;)V", "")]
		public static unsafe void RemoveErrorWhenEditing (global::Google.Android.Material.TextField.TextInputEditText obj, global::Google.Android.Material.TextField.TextInputLayout til)
		{
			const string __id = "removeErrorWhenEditing.(Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((til == null) ? IntPtr.Zero : ((global::Java.Lang.Object) til).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (til);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextInputEditTextExtensionsKt']/method[@name='removeWhiteSpaceAndGetStringValue' and count(parameter)=1 and parameter[1][@type='com.google.android.material.textfield.TextInputEditText']]"
		[Register ("removeWhiteSpaceAndGetStringValue", "(Lcom/google/android/material/textfield/TextInputEditText;)Ljava/lang/String;", "")]
		public static unsafe string RemoveWhiteSpaceAndGetStringValue (global::Google.Android.Material.TextField.TextInputEditText obj)
		{
			const string __id = "removeWhiteSpaceAndGetStringValue.(Lcom/google/android/material/textfield/TextInputEditText;)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextInputEditTextExtensionsKt']/method[@name='setLayoutAndTextDirections' and count(parameter)=2 and parameter[1][@type='com.google.android.material.textfield.TextInputEditText'] and parameter[2][@type='boolean']]"
		[Register ("setLayoutAndTextDirections", "(Lcom/google/android/material/textfield/TextInputEditText;Z)V", "")]
		public static unsafe void SetLayoutAndTextDirections (global::Google.Android.Material.TextField.TextInputEditText obj, bool isRtlLang)
		{
			const string __id = "setLayoutAndTextDirections.(Lcom/google/android/material/textfield/TextInputEditText;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (isRtlLang);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
