using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/ExpirationDateEditText", DoNotGenerateAcw=true)]
	public partial class ExpirationDateEditText : global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText, global::Android.Text.ITextWatcher, global::Android.Views.View.IOnClickListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/ExpirationDateEditText", typeof (ExpirationDateEditText));

		internal static new IntPtr class_ref {
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

		protected ExpirationDateEditText (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/constructor[@name='ExpirationDateEditText' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe ExpirationDateEditText (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/constructor[@name='ExpirationDateEditText' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe ExpirationDateEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/constructor[@name='ExpirationDateEditText' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe ExpirationDateEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyle) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				__args [2] = new JniArgumentValue (defStyle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		static Delegate cb_getMonth;
#pragma warning disable 0169
		static Delegate GetGetMonthHandler ()
		{
			if (cb_getMonth == null)
				cb_getMonth = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetMonth);
			return cb_getMonth;
		}

		static IntPtr n_GetMonth (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Month);
		}
#pragma warning restore 0169

		public virtual unsafe string Month {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/method[@name='getMonth' and count(parameter)=0]"
			[Register ("getMonth", "()Ljava/lang/String;", "GetGetMonthHandler")]
			get {
				const string __id = "getMonth.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getYear;
#pragma warning disable 0169
		static Delegate GetGetYearHandler ()
		{
			if (cb_getYear == null)
				cb_getYear = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetYear);
			return cb_getYear;
		}

		static IntPtr n_GetYear (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Year);
		}
#pragma warning restore 0169

		public virtual unsafe string Year {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/method[@name='getYear' and count(parameter)=0]"
			[Register ("getYear", "()Ljava/lang/String;", "GetGetYearHandler")]
			get {
				const string __id = "getYear.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_afterTextChanged_Landroid_text_Editable_;
#pragma warning disable 0169
		static Delegate GetAfterTextChanged_Landroid_text_Editable_Handler ()
		{
			if (cb_afterTextChanged_Landroid_text_Editable_ == null)
				cb_afterTextChanged_Landroid_text_Editable_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_AfterTextChanged_Landroid_text_Editable_);
			return cb_afterTextChanged_Landroid_text_Editable_;
		}

		static void n_AfterTextChanged_Landroid_text_Editable_ (IntPtr jnienv, IntPtr native__this, IntPtr native_editable)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var editable = (global::Android.Text.IEditable)global::Java.Lang.Object.GetObject<global::Android.Text.IEditable> (native_editable, JniHandleOwnership.DoNotTransfer);
			__this.AfterTextChanged (editable);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/method[@name='afterTextChanged' and count(parameter)=1 and parameter[1][@type='android.text.Editable']]"
		[Register ("afterTextChanged", "(Landroid/text/Editable;)V", "GetAfterTextChanged_Landroid_text_Editable_Handler")]
		public virtual unsafe void AfterTextChanged (global::Android.Text.IEditable editable)
		{
			const string __id = "afterTextChanged.(Landroid/text/Editable;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((editable == null) ? IntPtr.Zero : ((global::Java.Lang.Object) editable).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (editable);
			}
		}

		static Delegate cb_beforeTextChanged_Ljava_lang_CharSequence_III;
#pragma warning disable 0169
		static Delegate GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler ()
		{
			if (cb_beforeTextChanged_Ljava_lang_CharSequence_III == null)
				cb_beforeTextChanged_Ljava_lang_CharSequence_III = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLIII_V) n_BeforeTextChanged_Ljava_lang_CharSequence_III);
			return cb_beforeTextChanged_Ljava_lang_CharSequence_III;
		}

		static void n_BeforeTextChanged_Ljava_lang_CharSequence_III (IntPtr jnienv, IntPtr native__this, IntPtr native_s, int start, int count, int after)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var s = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_s, JniHandleOwnership.DoNotTransfer);
			__this.BeforeTextChanged (s, start, count, after);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/method[@name='beforeTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register ("beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler")]
		public virtual unsafe void BeforeTextChanged (global::Java.Lang.ICharSequence s, int start, int count, int after)
		{
			const string __id = "beforeTextChanged.(Ljava/lang/CharSequence;III)V";
			IntPtr native_s = CharSequence.ToLocalJniHandle (s);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_s);
				__args [1] = new JniArgumentValue (start);
				__args [2] = new JniArgumentValue (count);
				__args [3] = new JniArgumentValue (after);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_s);
				global::System.GC.KeepAlive (s);
			}
		}

		public void BeforeTextChanged (string s, int start, int count, int after)
		{
			var jls_s = s == null ? null : new global::Java.Lang.String (s);
			BeforeTextChanged (jls_s, start, count, after);
			jls_s?.Dispose ();
		}

		static Delegate cb_onClick_Landroid_view_View_;
#pragma warning disable 0169
		static Delegate GetOnClick_Landroid_view_View_Handler ()
		{
			if (cb_onClick_Landroid_view_View_ == null)
				cb_onClick_Landroid_view_View_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnClick_Landroid_view_View_);
			return cb_onClick_Landroid_view_View_;
		}

		static void n_OnClick_Landroid_view_View_ (IntPtr jnienv, IntPtr native__this, IntPtr native_v)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var v = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_v, JniHandleOwnership.DoNotTransfer);
			__this.OnClick (v);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ExpirationDateEditText']/method[@name='onClick' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("onClick", "(Landroid/view/View;)V", "GetOnClick_Landroid_view_View_Handler")]
		public virtual unsafe void OnClick (global::Android.Views.View v)
		{
			const string __id = "onClick.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((v == null) ? IntPtr.Zero : ((global::Java.Lang.Object) v).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (v);
			}
		}

	}
}
