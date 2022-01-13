using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/GeneralExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class GeneralExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/GeneralExtensionsKt", typeof (GeneralExtensionsKt));

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

		internal GeneralExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']/method[@name='delayExecutionFor80Sec' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("delayExecutionFor80Sec", "(Lkotlin/jvm/functions/Function0;)V", "")]
		public static unsafe void DelayExecutionFor80Sec (global::Kotlin.Jvm.Functions.IFunction0 func)
		{
			const string __id = "delayExecutionFor80Sec.(Lkotlin/jvm/functions/Function0;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((func == null) ? IntPtr.Zero : ((global::Java.Lang.Object) func).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (func);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']/method[@name='forEach' and count(parameter)=2 and parameter[1][@type='android.view.ViewGroup'] and parameter[2][@type='kotlin.jvm.functions.Function1&lt;? super android.view.View, kotlin.Unit&gt;']]"
		[Register ("forEach", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "")]
		public static unsafe void ForEach (global::Android.Views.ViewGroup obj, global::Kotlin.Jvm.Functions.IFunction1 action)
		{
			const string __id = "forEach.(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((action == null) ? IntPtr.Zero : ((global::Java.Lang.Object) action).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (action);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']/method[@name='isZeroOrNull' and count(parameter)=1 and parameter[1][@type='java.lang.Integer']]"
		[Register ("isZeroOrNull", "(Ljava/lang/Integer;)Z", "")]
		public static unsafe bool IsZeroOrNull (global::Java.Lang.Integer obj)
		{
			const string __id = "isZeroOrNull.(Ljava/lang/Integer;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']/method[@name='roundToTwoDecimals' and count(parameter)=1 and parameter[1][@type='float']]"
		[Register ("roundToTwoDecimals", "(F)F", "")]
		public static unsafe float RoundToTwoDecimals (float obj)
		{
			const string __id = "roundToTwoDecimals.(F)F";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (obj);
				var __rm = _members.StaticMethods.InvokeSingleMethod (__id, __args);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='GeneralExtensionsKt']/method[@name='toJson' and count(parameter)=1 and parameter[1][@type='java.lang.Object']]"
		[Register ("toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "")]
		public static unsafe string ToJson (global::Java.Lang.Object obj)
		{
			const string __id = "toJson.(Ljava/lang/Object;)Ljava/lang/String;";
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
