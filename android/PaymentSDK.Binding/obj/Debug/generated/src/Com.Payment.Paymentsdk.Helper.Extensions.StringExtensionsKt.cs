using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/StringExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class StringExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/StringExtensionsKt", typeof (StringExtensionsKt));

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

		internal StringExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']/method[@name='convertArabicDecimalToEnglish' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("convertArabicDecimalToEnglish", "(Ljava/lang/String;)Ljava/lang/String;", "")]
		public static unsafe string ConvertArabicDecimalToEnglish (string obj)
		{
			const string __id = "convertArabicDecimalToEnglish.(Ljava/lang/String;)Ljava/lang/String;";
			IntPtr native_obj = JNIEnv.NewString (obj);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_obj);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']/method[@name='isEmptyOrNull' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("isEmptyOrNull", "(Ljava/lang/String;)Z", "")]
		public static unsafe bool IsEmptyOrNull (string obj)
		{
			const string __id = "isEmptyOrNull.(Ljava/lang/String;)Z";
			IntPtr native_obj = JNIEnv.NewString (obj);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_obj);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']/method[@name='isLengthLessThan' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='int']]"
		[Register ("isLengthLessThan", "(Ljava/lang/String;I)Z", "")]
		public static unsafe bool IsLengthLessThan (string obj, int minLength)
		{
			const string __id = "isLengthLessThan.(Ljava/lang/String;I)Z";
			IntPtr native_obj = JNIEnv.NewString (obj);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_obj);
				__args [1] = new JniArgumentValue (minLength);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']/method[@name='isLessThan' and count(parameter)=2 and parameter[1][@type='java.lang.String'] and parameter[2][@type='int']]"
		[Register ("isLessThan", "(Ljava/lang/String;I)Z", "")]
		public static unsafe bool IsLessThan (string obj, int value)
		{
			const string __id = "isLessThan.(Ljava/lang/String;I)Z";
			IntPtr native_obj = JNIEnv.NewString (obj);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_obj);
				__args [1] = new JniArgumentValue (value);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='StringExtensionsKt']/method[@name='spanDrawable' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='char'] and parameter[3][@type='android.graphics.drawable.Drawable']]"
		[Register ("spanDrawable", "(Ljava/lang/String;CLandroid/graphics/drawable/Drawable;)Landroid/text/SpannableString;", "")]
		public static unsafe global::Android.Text.SpannableString SpanDrawable (string obj, char replacedChar, global::Android.Graphics.Drawables.Drawable drawable)
		{
			const string __id = "spanDrawable.(Ljava/lang/String;CLandroid/graphics/drawable/Drawable;)Landroid/text/SpannableString;";
			IntPtr native_obj = JNIEnv.NewString (obj);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_obj);
				__args [1] = new JniArgumentValue (replacedChar);
				__args [2] = new JniArgumentValue ((drawable == null) ? IntPtr.Zero : ((global::Java.Lang.Object) drawable).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Android.Text.SpannableString> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_obj);
				global::System.GC.KeepAlive (drawable);
			}
		}

	}
}
