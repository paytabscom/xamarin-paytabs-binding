using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Extensions {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/extensions/ViewExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class ViewExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/extensions/ViewExtensionsKt", typeof (ViewExtensionsKt));

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

		internal ViewExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='collapse' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("collapse", "(Landroid/view/View;)V", "")]
		public static unsafe void Collapse (global::Android.Views.View obj)
		{
			const string __id = "collapse.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='disableFor' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='long']]"
		[Register ("disableFor", "(Landroid/view/View;J)V", "")]
		public static unsafe void DisableFor (global::Android.Views.View obj, long millis)
		{
			const string __id = "disableFor.(Landroid/view/View;J)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (millis);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='expand' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("expand", "(Landroid/view/View;)V", "")]
		public static unsafe void Expand (global::Android.Views.View obj)
		{
			const string __id = "expand.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='fadeIn' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='long']]"
		[Register ("fadeIn", "(Landroid/view/View;J)V", "")]
		public static unsafe void FadeIn (global::Android.Views.View obj, long time)
		{
			const string __id = "fadeIn.(Landroid/view/View;J)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (time);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='fadeOut' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("fadeOut", "(Landroid/view/View;)V", "")]
		public static unsafe void FadeOut (global::Android.Views.View obj)
		{
			const string __id = "fadeOut.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='find' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='int']]"
		[Register ("find", "(Landroid/view/View;I)Landroid/view/View;", "")]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T extends android.view.View"})]
		public static unsafe global::Java.Lang.Object Find (global::Android.Views.View obj, int id)
		{
			const string __id = "find.(Landroid/view/View;I)Landroid/view/View;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (id);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return (global::Java.Lang.Object) global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='hide' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("hide", "(Landroid/view/View;)V", "")]
		public static unsafe void Hide (global::Android.Views.View obj)
		{
			const string __id = "hide.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='makeVisibleWhen' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='boolean']]"
		[Register ("makeVisibleWhen", "(Landroid/view/View;Z)V", "")]
		public static unsafe void MakeVisibleWhen (global::Android.Views.View obj, bool b)
		{
			const string __id = "makeVisibleWhen.(Landroid/view/View;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (b);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='onClick' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("onClick", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "")]
		public static unsafe void OnClick (global::Android.Views.View obj, global::Kotlin.Jvm.Functions.IFunction0 func)
		{
			const string __id = "onClick.(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((func == null) ? IntPtr.Zero : ((global::Java.Lang.Object) func).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (func);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='onTouchDown' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("onTouchDown", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "")]
		public static unsafe void OnTouchDown (global::Android.Views.View obj, global::Kotlin.Jvm.Functions.IFunction0 func)
		{
			const string __id = "onTouchDown.(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((func == null) ? IntPtr.Zero : ((global::Java.Lang.Object) func).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (func);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='shouldShow' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='java.lang.Boolean']]"
		[Register ("shouldShow", "(Landroid/view/View;Ljava/lang/Boolean;)V", "")]
		public static unsafe void ShouldShow (global::Android.Views.View obj, global::Java.Lang.Boolean show)
		{
			const string __id = "shouldShow.(Landroid/view/View;Ljava/lang/Boolean;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((show == null) ? IntPtr.Zero : ((global::Java.Lang.Object) show).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (show);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='shouldShowWithFading' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='boolean']]"
		[Register ("shouldShowWithFading", "(Landroid/view/View;Z)V", "")]
		public static unsafe void ShouldShowWithFading (global::Android.Views.View obj, bool show)
		{
			const string __id = "shouldShowWithFading.(Landroid/view/View;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue (show);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.extensions']/class[@name='ViewExtensionsKt']/method[@name='show' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("show", "(Landroid/view/View;)V", "")]
		public static unsafe void Show (global::Android.Views.View obj)
		{
			const string __id = "show.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
			}
		}

	}
}
