using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/ErrorEditText", DoNotGenerateAcw=true)]
	public partial class ErrorEditText : global::Google.Android.Material.TextField.TextInputEditText {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/ErrorEditText", typeof (ErrorEditText));

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

		protected ErrorEditText (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/constructor[@name='ErrorEditText' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe ErrorEditText (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/constructor[@name='ErrorEditText' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe ErrorEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/constructor[@name='ErrorEditText' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe ErrorEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyle) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_getErrorMessage;
#pragma warning disable 0169
		static Delegate GetGetErrorMessageHandler ()
		{
			if (cb_getErrorMessage == null)
				cb_getErrorMessage = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetErrorMessage);
			return cb_getErrorMessage;
		}

		static IntPtr n_GetErrorMessage (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.ErrorMessage);
		}
#pragma warning restore 0169

		public virtual unsafe string ErrorMessage {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='getErrorMessage' and count(parameter)=0]"
			[Register ("getErrorMessage", "()Ljava/lang/String;", "GetGetErrorMessageHandler")]
			get {
				const string __id = "getErrorMessage.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_isError;
#pragma warning disable 0169
		static Delegate GetIsErrorHandler ()
		{
			if (cb_isError == null)
				cb_isError = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsError);
			return cb_isError;
		}

		static bool n_IsError (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.IsError;
		}
#pragma warning restore 0169

		public virtual unsafe bool IsError {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='isError' and count(parameter)=0]"
			[Register ("isError", "()Z", "GetIsErrorHandler")]
			get {
				const string __id = "isError.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		static Delegate cb_isValid;
#pragma warning disable 0169
		static Delegate GetIsValidHandler ()
		{
			if (cb_isValid == null)
				cb_isValid = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsValid);
			return cb_isValid;
		}

		static bool n_IsValid (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.IsValid;
		}
#pragma warning restore 0169

		public virtual unsafe bool IsValid {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='isValid' and count(parameter)=0]"
			[Register ("isValid", "()Z", "GetIsValidHandler")]
			get {
				const string __id = "isValid.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		static Delegate cb_isOptional;
#pragma warning disable 0169
		static Delegate GetIsOptionalHandler ()
		{
			if (cb_isOptional == null)
				cb_isOptional = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsOptional);
			return cb_isOptional;
		}

		static bool n_IsOptional (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.Optional;
		}
#pragma warning restore 0169

		static Delegate cb_setOptional_Z;
#pragma warning disable 0169
		static Delegate GetSetOptional_ZHandler ()
		{
			if (cb_setOptional_Z == null)
				cb_setOptional_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetOptional_Z);
			return cb_setOptional_Z;
		}

		static void n_SetOptional_Z (IntPtr jnienv, IntPtr native__this, bool optional)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Optional = optional;
		}
#pragma warning restore 0169

		public virtual unsafe bool Optional {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='isOptional' and count(parameter)=0]"
			[Register ("isOptional", "()Z", "GetIsOptionalHandler")]
			get {
				const string __id = "isOptional.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='setOptional' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setOptional", "(Z)V", "GetSetOptional_ZHandler")]
			set {
				const string __id = "setOptional.(Z)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
				}
			}
		}

		static Delegate cb_getTextInputLayoutParent;
#pragma warning disable 0169
		static Delegate GetGetTextInputLayoutParentHandler ()
		{
			if (cb_getTextInputLayoutParent == null)
				cb_getTextInputLayoutParent = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetTextInputLayoutParent);
			return cb_getTextInputLayoutParent;
		}

		static IntPtr n_GetTextInputLayoutParent (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.TextInputLayoutParent);
		}
#pragma warning restore 0169

		public virtual unsafe global::Google.Android.Material.TextField.TextInputLayout TextInputLayoutParent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='getTextInputLayoutParent' and count(parameter)=0]"
			[Register ("getTextInputLayoutParent", "()Lcom/google/android/material/textfield/TextInputLayout;", "GetGetTextInputLayoutParentHandler")]
			get {
				const string __id = "getTextInputLayoutParent.()Lcom/google/android/material/textfield/TextInputLayout;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Google.Android.Material.TextField.TextInputLayout> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_closeSoftKeyboard;
#pragma warning disable 0169
		static Delegate GetCloseSoftKeyboardHandler ()
		{
			if (cb_closeSoftKeyboard == null)
				cb_closeSoftKeyboard = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_CloseSoftKeyboard);
			return cb_closeSoftKeyboard;
		}

		static void n_CloseSoftKeyboard (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.CloseSoftKeyboard ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='closeSoftKeyboard' and count(parameter)=0]"
		[Register ("closeSoftKeyboard", "()V", "GetCloseSoftKeyboardHandler")]
		public virtual unsafe void CloseSoftKeyboard ()
		{
			const string __id = "closeSoftKeyboard.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		static Delegate cb_focusNextView;
#pragma warning disable 0169
		static Delegate GetFocusNextViewHandler ()
		{
			if (cb_focusNextView == null)
				cb_focusNextView = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_FocusNextView);
			return cb_focusNextView;
		}

		static IntPtr n_FocusNextView (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.FocusNextView ());
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='focusNextView' and count(parameter)=0]"
		[Register ("focusNextView", "()Landroid/view/View;", "GetFocusNextViewHandler")]
		public virtual unsafe global::Android.Views.View FocusNextView ()
		{
			const string __id = "focusNextView.()Landroid/view/View;";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Android.Views.View> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_onTextChanged_Ljava_lang_CharSequence_III;
#pragma warning disable 0169
		static Delegate GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler ()
		{
			if (cb_onTextChanged_Ljava_lang_CharSequence_III == null)
				cb_onTextChanged_Ljava_lang_CharSequence_III = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLIII_V) n_OnTextChanged_Ljava_lang_CharSequence_III);
			return cb_onTextChanged_Ljava_lang_CharSequence_III;
		}

		static void n_OnTextChanged_Ljava_lang_CharSequence_III (IntPtr jnienv, IntPtr native__this, IntPtr native_text, int start, int lengthBefore, int lengthAfter)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var text = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_text, JniHandleOwnership.DoNotTransfer);
			__this.OnTextChanged (text, start, lengthBefore, lengthAfter);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='onTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register ("onTextChanged", "(Ljava/lang/CharSequence;III)V", "GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler")]
		public virtual unsafe void OnTextChanged (global::Java.Lang.ICharSequence text, int start, int lengthBefore, int lengthAfter)
		{
			const string __id = "onTextChanged.(Ljava/lang/CharSequence;III)V";
			IntPtr native_text = CharSequence.ToLocalJniHandle (text);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_text);
				__args [1] = new JniArgumentValue (start);
				__args [2] = new JniArgumentValue (lengthBefore);
				__args [3] = new JniArgumentValue (lengthAfter);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_text);
				global::System.GC.KeepAlive (text);
			}
		}

		public void OnTextChanged (string text, int start, int lengthBefore, int lengthAfter)
		{
			var jls_text = text == null ? null : new global::Java.Lang.String (text);
			OnTextChanged (jls_text, start, lengthBefore, lengthAfter);
			jls_text?.Dispose ();
		}

		static Delegate cb_setError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetError_Ljava_lang_String_Handler ()
		{
			if (cb_setError_Ljava_lang_String_ == null)
				cb_setError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetError_Ljava_lang_String_);
			return cb_setError_Ljava_lang_String_;
		}

		static void n_SetError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_errorMessage)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var errorMessage = JNIEnv.GetString (native_errorMessage, JniHandleOwnership.DoNotTransfer);
			__this.SetError (errorMessage);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='setError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setError", "(Ljava/lang/String;)V", "GetSetError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetError (string errorMessage)
		{
			const string __id = "setError.(Ljava/lang/String;)V";
			IntPtr native_errorMessage = JNIEnv.NewString (errorMessage);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_errorMessage);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_errorMessage);
			}
		}

		static Delegate cb_setFieldHint_I;
#pragma warning disable 0169
		static Delegate GetSetFieldHint_IHandler ()
		{
			if (cb_setFieldHint_I == null)
				cb_setFieldHint_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_V) n_SetFieldHint_I);
			return cb_setFieldHint_I;
		}

		static void n_SetFieldHint_I (IntPtr jnienv, IntPtr native__this, int hint)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetFieldHint (hint);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='setFieldHint' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("setFieldHint", "(I)V", "GetSetFieldHint_IHandler")]
		public virtual unsafe void SetFieldHint (int hint)
		{
			const string __id = "setFieldHint.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (hint);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

		static Delegate cb_setFieldHint_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetFieldHint_Ljava_lang_String_Handler ()
		{
			if (cb_setFieldHint_Ljava_lang_String_ == null)
				cb_setFieldHint_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetFieldHint_Ljava_lang_String_);
			return cb_setFieldHint_Ljava_lang_String_;
		}

		static void n_SetFieldHint_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_hint)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var hint = JNIEnv.GetString (native_hint, JniHandleOwnership.DoNotTransfer);
			__this.SetFieldHint (hint);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='setFieldHint' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setFieldHint", "(Ljava/lang/String;)V", "GetSetFieldHint_Ljava_lang_String_Handler")]
		public virtual unsafe void SetFieldHint (string hint)
		{
			const string __id = "setFieldHint.(Ljava/lang/String;)V";
			IntPtr native_hint = JNIEnv.NewString (hint);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_hint);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_hint);
			}
		}

		static Delegate cb_validate;
#pragma warning disable 0169
		static Delegate GetValidateHandler ()
		{
			if (cb_validate == null)
				cb_validate = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_Validate);
			return cb_validate;
		}

		static void n_Validate (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Validate ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='ErrorEditText']/method[@name='validate' and count(parameter)=0]"
		[Register ("validate", "()V", "GetValidateHandler")]
		public virtual unsafe void Validate ()
		{
			const string __id = "validate.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
