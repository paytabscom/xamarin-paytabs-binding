using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SlashSpan']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/SlashSpan", DoNotGenerateAcw=true)]
	public partial class SlashSpan : global::Android.Text.Style.ReplacementSpan {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/SlashSpan", typeof (SlashSpan));

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

		protected SlashSpan (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SlashSpan']/constructor[@name='SlashSpan' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe SlashSpan () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_;
#pragma warning disable 0169
		static Delegate GetDraw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_Handler ()
		{
			if (cb_draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_ == null)
				cb_draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLLIIFIIIL_V) n_Draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_);
			return cb_draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_;
		}

		static void n_Draw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_ (IntPtr jnienv, IntPtr native__this, IntPtr native_canvas, IntPtr native_text, int start, int end, float x, int top, int y, int bottom, IntPtr native_paint)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.SlashSpan> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var canvas = global::Java.Lang.Object.GetObject<global::Android.Graphics.Canvas> (native_canvas, JniHandleOwnership.DoNotTransfer);
			var text = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_text, JniHandleOwnership.DoNotTransfer);
			var paint = global::Java.Lang.Object.GetObject<global::Android.Graphics.Paint> (native_paint, JniHandleOwnership.DoNotTransfer);
			__this.Draw (canvas, text, start, end, x, top, y, bottom, paint);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SlashSpan']/method[@name='draw' and count(parameter)=9 and parameter[1][@type='android.graphics.Canvas'] and parameter[2][@type='java.lang.CharSequence'] and parameter[3][@type='int'] and parameter[4][@type='int'] and parameter[5][@type='float'] and parameter[6][@type='int'] and parameter[7][@type='int'] and parameter[8][@type='int'] and parameter[9][@type='android.graphics.Paint']]"
		[Register ("draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "GetDraw_Landroid_graphics_Canvas_Ljava_lang_CharSequence_IIFIIILandroid_graphics_Paint_Handler")]
		public override unsafe void Draw (global::Android.Graphics.Canvas canvas, global::Java.Lang.ICharSequence text, int start, int end, float x, int top, int y, int bottom, global::Android.Graphics.Paint paint)
		{
			const string __id = "draw.(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V";
			IntPtr native_text = CharSequence.ToLocalJniHandle (text);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [9];
				__args [0] = new JniArgumentValue ((canvas == null) ? IntPtr.Zero : ((global::Java.Lang.Object) canvas).Handle);
				__args [1] = new JniArgumentValue (native_text);
				__args [2] = new JniArgumentValue (start);
				__args [3] = new JniArgumentValue (end);
				__args [4] = new JniArgumentValue (x);
				__args [5] = new JniArgumentValue (top);
				__args [6] = new JniArgumentValue (y);
				__args [7] = new JniArgumentValue (bottom);
				__args [8] = new JniArgumentValue ((paint == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paint).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_text);
				global::System.GC.KeepAlive (canvas);
				global::System.GC.KeepAlive (text);
				global::System.GC.KeepAlive (paint);
			}
		}

		static Delegate cb_getSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_;
#pragma warning disable 0169
		static Delegate GetGetSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_Handler ()
		{
			if (cb_getSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_ == null)
				cb_getSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLLIIL_I) n_GetSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_);
			return cb_getSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_;
		}

		static int n_GetSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_ (IntPtr jnienv, IntPtr native__this, IntPtr native_paint, IntPtr native_text, int start, int end, IntPtr native_fm)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.SlashSpan> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var paint = global::Java.Lang.Object.GetObject<global::Android.Graphics.Paint> (native_paint, JniHandleOwnership.DoNotTransfer);
			var text = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_text, JniHandleOwnership.DoNotTransfer);
			var fm = global::Java.Lang.Object.GetObject<global::Android.Graphics.Paint.FontMetricsInt> (native_fm, JniHandleOwnership.DoNotTransfer);
			int __ret = __this.GetSize (paint, text, start, end, fm);
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SlashSpan']/method[@name='getSize' and count(parameter)=5 and parameter[1][@type='android.graphics.Paint'] and parameter[2][@type='java.lang.CharSequence'] and parameter[3][@type='int'] and parameter[4][@type='int'] and parameter[5][@type='android.graphics.Paint.FontMetricsInt']]"
		[Register ("getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "GetGetSize_Landroid_graphics_Paint_Ljava_lang_CharSequence_IILandroid_graphics_Paint_FontMetricsInt_Handler")]
		public override unsafe int GetSize (global::Android.Graphics.Paint paint, global::Java.Lang.ICharSequence text, int start, int end, global::Android.Graphics.Paint.FontMetricsInt fm)
		{
			const string __id = "getSize.(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I";
			IntPtr native_text = CharSequence.ToLocalJniHandle (text);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue ((paint == null) ? IntPtr.Zero : ((global::Java.Lang.Object) paint).Handle);
				__args [1] = new JniArgumentValue (native_text);
				__args [2] = new JniArgumentValue (start);
				__args [3] = new JniArgumentValue (end);
				__args [4] = new JniArgumentValue ((fm == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fm).Handle);
				var __rm = _members.InstanceMethods.InvokeVirtualInt32Method (__id, this, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_text);
				global::System.GC.KeepAlive (paint);
				global::System.GC.KeepAlive (text);
				global::System.GC.KeepAlive (fm);
			}
		}

	}
}
