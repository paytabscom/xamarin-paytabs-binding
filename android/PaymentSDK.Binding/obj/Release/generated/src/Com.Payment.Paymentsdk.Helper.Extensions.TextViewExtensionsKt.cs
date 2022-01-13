using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextViewExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/TextViewExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class TextViewExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/TextViewExtensionsKt", typeof (TextViewExtensionsKt));

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

		internal TextViewExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextViewExtensionsKt']/method[@name='replaceHshWithValue' and count(parameter)=3 and parameter[1][@type='android.widget.TextView'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register ("replaceHshWithValue", "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public static unsafe void ReplaceHshWithValue (global::Android.Widget.TextView obj, string originalString, string value)
		{
			const string __id = "replaceHshWithValue.(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V";
			IntPtr native_originalString = JNIEnv.NewString (originalString);
			IntPtr native_value = JNIEnv.NewString (value);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_originalString);
				__args [2] = new JniArgumentValue (native_value);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_originalString);
				JNIEnv.DeleteLocalRef (native_value);
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextViewExtensionsKt']/method[@name='setColor' and count(parameter)=2 and parameter[1][@type='android.widget.TextView'] and parameter[2][@type='int']]"
		[Register ("setColor", "(Landroid/widget/TextView;I)V", "")]
		public static unsafe void SetColor (global::Android.Widget.TextView obj, int colorId)
		{
			const string __id = "setColor.(Landroid/widget/TextView;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (colorId);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='TextViewExtensionsKt']/method[@name='setTextWithValue' and count(parameter)=4 and parameter[1][@type='android.widget.TextView'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String']]"
		[Register ("setTextWithValue", "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public static unsafe void SetTextWithValue (global::Android.Widget.TextView obj, string originalString, string strToReplace, string value)
		{
			const string __id = "setTextWithValue.(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";
			IntPtr native_originalString = JNIEnv.NewString (originalString);
			IntPtr native_strToReplace = JNIEnv.NewString (strToReplace);
			IntPtr native_value = JNIEnv.NewString (value);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (native_originalString);
				__args [2] = new JniArgumentValue (native_strToReplace);
				__args [3] = new JniArgumentValue (native_value);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_originalString);
				JNIEnv.DeleteLocalRef (native_strToReplace);
				JNIEnv.DeleteLocalRef (native_value);
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
