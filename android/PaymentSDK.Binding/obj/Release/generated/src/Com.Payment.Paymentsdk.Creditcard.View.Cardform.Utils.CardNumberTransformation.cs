using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='CardNumberTransformation']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/utils/CardNumberTransformation", DoNotGenerateAcw=true)]
	public partial class CardNumberTransformation : global::Java.Lang.Object, global::Android.Text.Method.ITransformationMethod {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/utils/CardNumberTransformation", typeof (CardNumberTransformation));

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

		protected CardNumberTransformation (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='CardNumberTransformation']/constructor[@name='CardNumberTransformation' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe CardNumberTransformation () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_getTransformation_Ljava_lang_CharSequence_Landroid_view_View_;
#pragma warning disable 0169
		static Delegate GetGetTransformation_Ljava_lang_CharSequence_Landroid_view_View_Handler ()
		{
			if (cb_getTransformation_Ljava_lang_CharSequence_Landroid_view_View_ == null)
				cb_getTransformation_Ljava_lang_CharSequence_Landroid_view_View_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_L) n_GetTransformation_Ljava_lang_CharSequence_Landroid_view_View_);
			return cb_getTransformation_Ljava_lang_CharSequence_Landroid_view_View_;
		}

		static IntPtr n_GetTransformation_Ljava_lang_CharSequence_Landroid_view_View_ (IntPtr jnienv, IntPtr native__this, IntPtr native_source, IntPtr native_view)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardNumberTransformation> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var source = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_source, JniHandleOwnership.DoNotTransfer);
			var view = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_view, JniHandleOwnership.DoNotTransfer);
			IntPtr __ret = CharSequence.ToLocalJniHandle (__this.GetTransformationFormatted (source, view));
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='CardNumberTransformation']/method[@name='getTransformation' and count(parameter)=2 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='android.view.View']]"
		[Register ("getTransformation", "(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;", "GetGetTransformation_Ljava_lang_CharSequence_Landroid_view_View_Handler")]
		public virtual unsafe global::Java.Lang.ICharSequence GetTransformationFormatted (global::Java.Lang.ICharSequence source, global::Android.Views.View view)
		{
			const string __id = "getTransformation.(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;";
			IntPtr native_source = CharSequence.ToLocalJniHandle (source);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_source);
				__args [1] = new JniArgumentValue ((view == null) ? IntPtr.Zero : ((global::Java.Lang.Object) view).Handle);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<Java.Lang.ICharSequence> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_source);
				global::System.GC.KeepAlive (source);
				global::System.GC.KeepAlive (view);
			}
		}

		public string GetTransformation (string source, global::Android.Views.View view)
		{
			var jls_source = source == null ? null : new global::Java.Lang.String (source);
			global::Java.Lang.ICharSequence __result = GetTransformationFormatted (jls_source, view);
			var __rsval = __result?.ToString ();
			jls_source?.Dispose ();
			return __rsval;
		}

		static Delegate cb_onFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_;
#pragma warning disable 0169
		static Delegate GetOnFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_Handler ()
		{
			if (cb_onFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_ == null)
				cb_onFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLLZIL_V) n_OnFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_);
			return cb_onFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_;
		}

		static void n_OnFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_ (IntPtr jnienv, IntPtr native__this, IntPtr native_view, IntPtr native_sourceText, bool focused, int native_direction, IntPtr native_previouslyFocusedRect)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardNumberTransformation> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var view = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_view, JniHandleOwnership.DoNotTransfer);
			var sourceText = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_sourceText, JniHandleOwnership.DoNotTransfer);
			var direction = (global::Android.Views.FocusSearchDirection) native_direction;
			var previouslyFocusedRect = global::Java.Lang.Object.GetObject<global::Android.Graphics.Rect> (native_previouslyFocusedRect, JniHandleOwnership.DoNotTransfer);
			__this.OnFocusChanged (view, sourceText, focused, direction, previouslyFocusedRect);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='CardNumberTransformation']/method[@name='onFocusChanged' and count(parameter)=5 and parameter[1][@type='android.view.View'] and parameter[2][@type='java.lang.CharSequence'] and parameter[3][@type='boolean'] and parameter[4][@type='int'] and parameter[5][@type='android.graphics.Rect']]"
		[Register ("onFocusChanged", "(Landroid/view/View;Ljava/lang/CharSequence;ZILandroid/graphics/Rect;)V", "GetOnFocusChanged_Landroid_view_View_Ljava_lang_CharSequence_ZILandroid_graphics_Rect_Handler")]
		public virtual unsafe void OnFocusChanged (global::Android.Views.View view, global::Java.Lang.ICharSequence sourceText, bool focused, [global::Android.Runtime.GeneratedEnum] global::Android.Views.FocusSearchDirection direction, global::Android.Graphics.Rect previouslyFocusedRect)
		{
			const string __id = "onFocusChanged.(Landroid/view/View;Ljava/lang/CharSequence;ZILandroid/graphics/Rect;)V";
			IntPtr native_sourceText = CharSequence.ToLocalJniHandle (sourceText);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue ((view == null) ? IntPtr.Zero : ((global::Java.Lang.Object) view).Handle);
				__args [1] = new JniArgumentValue (native_sourceText);
				__args [2] = new JniArgumentValue (focused);
				__args [3] = new JniArgumentValue ((int) direction);
				__args [4] = new JniArgumentValue ((previouslyFocusedRect == null) ? IntPtr.Zero : ((global::Java.Lang.Object) previouslyFocusedRect).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_sourceText);
				global::System.GC.KeepAlive (view);
				global::System.GC.KeepAlive (sourceText);
				global::System.GC.KeepAlive (previouslyFocusedRect);
			}
		}

		public void OnFocusChanged (global::Android.Views.View view, string sourceText, bool focused, [global::Android.Runtime.GeneratedEnum] global::Android.Views.FocusSearchDirection direction, global::Android.Graphics.Rect previouslyFocusedRect)
		{
			var jls_sourceText = sourceText == null ? null : new global::Java.Lang.String (sourceText);
			OnFocusChanged (view, jls_sourceText, focused, direction, previouslyFocusedRect);
			jls_sourceText?.Dispose ();
		}

	}
}
