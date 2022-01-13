using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='EditTextExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/EditTextExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class EditTextExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/EditTextExtensionsKt", typeof (EditTextExtensionsKt));

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

		internal EditTextExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='EditTextExtensionsKt']/method[@name='avoidPastingToIt' and count(parameter)=1 and parameter[1][@type='android.widget.EditText']]"
		[Register ("avoidPastingToIt", "(Landroid/widget/EditText;)V", "")]
		public static unsafe void AvoidPastingToIt (global::Android.Widget.EditText obj)
		{
			const string __id = "avoidPastingToIt.(Landroid/widget/EditText;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='EditTextExtensionsKt']/method[@name='removeErrorWhenEditing' and count(parameter)=2 and parameter[1][@type='android.widget.EditText'] and parameter[2][@type='com.google.android.material.textfield.TextInputLayout']]"
		[Register ("removeErrorWhenEditing", "(Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;)V", "")]
		public static unsafe void RemoveErrorWhenEditing (global::Android.Widget.EditText obj, global::Google.Android.Material.TextField.TextInputLayout til)
		{
			const string __id = "removeErrorWhenEditing.(Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;)V";
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='EditTextExtensionsKt']/method[@name='removeWhiteSpaceAndGetStringValue' and count(parameter)=1 and parameter[1][@type='android.widget.EditText']]"
		[Register ("removeWhiteSpaceAndGetStringValue", "(Landroid/widget/EditText;)Ljava/lang/String;", "")]
		public static unsafe string RemoveWhiteSpaceAndGetStringValue (global::Android.Widget.EditText obj)
		{
			const string __id = "removeWhiteSpaceAndGetStringValue.(Landroid/widget/EditText;)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
