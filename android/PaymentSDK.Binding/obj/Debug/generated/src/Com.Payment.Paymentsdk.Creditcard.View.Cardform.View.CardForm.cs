using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/CardForm", DoNotGenerateAcw=true)]
	public partial class CardForm : global::Android.Widget.LinearLayout, global::Android.Text.ITextWatcher, global::Android.Views.View.IOnClickListener, global::Android.Views.View.IOnFocusChangeListener, global::Android.Widget.TextView.IOnEditorActionListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/field[@name='FIELD_DISABLED']"
		[Register ("FIELD_DISABLED")]
		public const int FieldDisabled = (int) 0;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/field[@name='FIELD_OPTIONAL']"
		[Register ("FIELD_OPTIONAL")]
		public const int FieldOptional = (int) 1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/field[@name='FIELD_REQUIRED']"
		[Register ("FIELD_REQUIRED")]
		public const int FieldRequired = (int) 2;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/CardForm", typeof (CardForm));

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

		protected CardForm (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe CardForm (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe CardForm (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe CardForm (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyleAttr) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				__args [2] = new JniArgumentValue (defStyleAttr);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=4 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "")]
		public unsafe CardForm (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyleAttr, int defStyleRes) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;II)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				__args [2] = new JniArgumentValue (defStyleAttr);
				__args [3] = new JniArgumentValue (defStyleRes);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		static Delegate cb_getCardEditText;
#pragma warning disable 0169
		static Delegate GetGetCardEditTextHandler ()
		{
			if (cb_getCardEditText == null)
				cb_getCardEditText = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardEditText);
			return cb_getCardEditText;
		}

		static IntPtr n_GetCardEditText (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CardEditText);
		}
#pragma warning restore 0169

		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText CardEditText {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCardEditText' and count(parameter)=0]"
			[Register ("getCardEditText", "()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardEditText;", "GetGetCardEditTextHandler")]
			get {
				const string __id = "getCardEditText.()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardEditText;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCardNumber;
#pragma warning disable 0169
		static Delegate GetGetCardNumberHandler ()
		{
			if (cb_getCardNumber == null)
				cb_getCardNumber = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardNumber);
			return cb_getCardNumber;
		}

		static IntPtr n_GetCardNumber (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CardNumber);
		}
#pragma warning restore 0169

		public virtual unsafe string CardNumber {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCardNumber' and count(parameter)=0]"
			[Register ("getCardNumber", "()Ljava/lang/String;", "GetGetCardNumberHandler")]
			get {
				const string __id = "getCardNumber.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCardholderName;
#pragma warning disable 0169
		static Delegate GetGetCardholderNameHandler ()
		{
			if (cb_getCardholderName == null)
				cb_getCardholderName = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardholderName);
			return cb_getCardholderName;
		}

		static IntPtr n_GetCardholderName (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CardholderName);
		}
#pragma warning restore 0169

		public virtual unsafe string CardholderName {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCardholderName' and count(parameter)=0]"
			[Register ("getCardholderName", "()Ljava/lang/String;", "GetGetCardholderNameHandler")]
			get {
				const string __id = "getCardholderName.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCardholderNameEditText;
#pragma warning disable 0169
		static Delegate GetGetCardholderNameEditTextHandler ()
		{
			if (cb_getCardholderNameEditText == null)
				cb_getCardholderNameEditText = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardholderNameEditText);
			return cb_getCardholderNameEditText;
		}

		static IntPtr n_GetCardholderNameEditText (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CardholderNameEditText);
		}
#pragma warning restore 0169

		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardholderNameEditText CardholderNameEditText {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCardholderNameEditText' and count(parameter)=0]"
			[Register ("getCardholderNameEditText", "()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardholderNameEditText;", "GetGetCardholderNameEditTextHandler")]
			get {
				const string __id = "getCardholderNameEditText.()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardholderNameEditText;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardholderNameEditText> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCvv;
#pragma warning disable 0169
		static Delegate GetGetCvvHandler ()
		{
			if (cb_getCvv == null)
				cb_getCvv = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCvv);
			return cb_getCvv;
		}

		static IntPtr n_GetCvv (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Cvv);
		}
#pragma warning restore 0169

		public virtual unsafe string Cvv {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCvv' and count(parameter)=0]"
			[Register ("getCvv", "()Ljava/lang/String;", "GetGetCvvHandler")]
			get {
				const string __id = "getCvv.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCvvEditText;
#pragma warning disable 0169
		static Delegate GetGetCvvEditTextHandler ()
		{
			if (cb_getCvvEditText == null)
				cb_getCvvEditText = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCvvEditText);
			return cb_getCvvEditText;
		}

		static IntPtr n_GetCvvEditText (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CvvEditText);
		}
#pragma warning restore 0169

		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CvvEditText CvvEditText {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getCvvEditText' and count(parameter)=0]"
			[Register ("getCvvEditText", "()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CvvEditText;", "GetGetCvvEditTextHandler")]
			get {
				const string __id = "getCvvEditText.()Lcom/payment/paymentsdk/creditcard/view/cardform/view/CvvEditText;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CvvEditText> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getExpirationDateEditText;
#pragma warning disable 0169
		static Delegate GetGetExpirationDateEditTextHandler ()
		{
			if (cb_getExpirationDateEditText == null)
				cb_getExpirationDateEditText = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetExpirationDateEditText);
			return cb_getExpirationDateEditText;
		}

		static IntPtr n_GetExpirationDateEditText (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.ExpirationDateEditText);
		}
#pragma warning restore 0169

		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText ExpirationDateEditText {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getExpirationDateEditText' and count(parameter)=0]"
			[Register ("getExpirationDateEditText", "()Lcom/payment/paymentsdk/creditcard/view/cardform/view/ExpirationDateEditText;", "GetGetExpirationDateEditTextHandler")]
			get {
				const string __id = "getExpirationDateEditText.()Lcom/payment/paymentsdk/creditcard/view/cardform/view/ExpirationDateEditText;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ExpirationDateEditText> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getExpirationMonth;
#pragma warning disable 0169
		static Delegate GetGetExpirationMonthHandler ()
		{
			if (cb_getExpirationMonth == null)
				cb_getExpirationMonth = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetExpirationMonth);
			return cb_getExpirationMonth;
		}

		static IntPtr n_GetExpirationMonth (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.ExpirationMonth);
		}
#pragma warning restore 0169

		public virtual unsafe string ExpirationMonth {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getExpirationMonth' and count(parameter)=0]"
			[Register ("getExpirationMonth", "()Ljava/lang/String;", "GetGetExpirationMonthHandler")]
			get {
				const string __id = "getExpirationMonth.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getExpirationYear;
#pragma warning disable 0169
		static Delegate GetGetExpirationYearHandler ()
		{
			if (cb_getExpirationYear == null)
				cb_getExpirationYear = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetExpirationYear);
			return cb_getExpirationYear;
		}

		static IntPtr n_GetExpirationYear (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.ExpirationYear);
		}
#pragma warning restore 0169

		public virtual unsafe string ExpirationYear {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='getExpirationYear' and count(parameter)=0]"
			[Register ("getExpirationYear", "()Ljava/lang/String;", "GetGetExpirationYearHandler")]
			get {
				const string __id = "getExpirationYear.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.IsValid;
		}
#pragma warning restore 0169

		public virtual unsafe bool IsValid {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='isValid' and count(parameter)=0]"
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

		static Delegate cb_afterTextChanged_Landroid_text_Editable_;
#pragma warning disable 0169
		static Delegate GetAfterTextChanged_Landroid_text_Editable_Handler ()
		{
			if (cb_afterTextChanged_Landroid_text_Editable_ == null)
				cb_afterTextChanged_Landroid_text_Editable_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_AfterTextChanged_Landroid_text_Editable_);
			return cb_afterTextChanged_Landroid_text_Editable_;
		}

		static void n_AfterTextChanged_Landroid_text_Editable_ (IntPtr jnienv, IntPtr native__this, IntPtr native_s)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var s = (global::Android.Text.IEditable)global::Java.Lang.Object.GetObject<global::Android.Text.IEditable> (native_s, JniHandleOwnership.DoNotTransfer);
			__this.AfterTextChanged (s);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='afterTextChanged' and count(parameter)=1 and parameter[1][@type='android.text.Editable']]"
		[Register ("afterTextChanged", "(Landroid/text/Editable;)V", "GetAfterTextChanged_Landroid_text_Editable_Handler")]
		public virtual unsafe void AfterTextChanged (global::Android.Text.IEditable s)
		{
			const string __id = "afterTextChanged.(Landroid/text/Editable;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((s == null) ? IntPtr.Zero : ((global::Java.Lang.Object) s).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (s);
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var s = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_s, JniHandleOwnership.DoNotTransfer);
			__this.BeforeTextChanged (s, start, count, after);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='beforeTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
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

		static Delegate cb_cardRequired_Z;
#pragma warning disable 0169
		static Delegate GetCardRequired_ZHandler ()
		{
			if (cb_cardRequired_Z == null)
				cb_cardRequired_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_CardRequired_Z);
			return cb_cardRequired_Z;
		}

		static IntPtr n_CardRequired_Z (IntPtr jnienv, IntPtr native__this, bool required)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CardRequired (required));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='cardRequired' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("cardRequired", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetCardRequired_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm CardRequired (bool required)
		{
			const string __id = "cardRequired.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (required);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_cardholderName_I;
#pragma warning disable 0169
		static Delegate GetInvokeCardholderName_IHandler ()
		{
			if (cb_cardholderName_I == null)
				cb_cardholderName_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_L) n_InvokeCardholderName_I);
			return cb_cardholderName_I;
		}

		static IntPtr n_InvokeCardholderName_I (IntPtr jnienv, IntPtr native__this, int cardHolderNameStatus)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.InvokeCardholderName (cardHolderNameStatus));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='cardholderName' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("cardholderName", "(I)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetInvokeCardholderName_IHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm InvokeCardholderName (int cardHolderNameStatus)
		{
			const string __id = "cardholderName.(I)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (cardHolderNameStatus);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.CloseSoftKeyboard ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='closeSoftKeyboard' and count(parameter)=0]"
		[Register ("closeSoftKeyboard", "()V", "GetCloseSoftKeyboardHandler")]
		public virtual unsafe void CloseSoftKeyboard ()
		{
			const string __id = "closeSoftKeyboard.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		static Delegate cb_cvvRequired_Z;
#pragma warning disable 0169
		static Delegate GetCvvRequired_ZHandler ()
		{
			if (cb_cvvRequired_Z == null)
				cb_cvvRequired_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_CvvRequired_Z);
			return cb_cvvRequired_Z;
		}

		static IntPtr n_CvvRequired_Z (IntPtr jnienv, IntPtr native__this, bool required)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CvvRequired (required));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='cvvRequired' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("cvvRequired", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetCvvRequired_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm CvvRequired (bool required)
		{
			const string __id = "cvvRequired.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (required);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_expirationRequired_Z;
#pragma warning disable 0169
		static Delegate GetExpirationRequired_ZHandler ()
		{
			if (cb_expirationRequired_Z == null)
				cb_expirationRequired_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_ExpirationRequired_Z);
			return cb_expirationRequired_Z;
		}

		static IntPtr n_ExpirationRequired_Z (IntPtr jnienv, IntPtr native__this, bool required)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.ExpirationRequired (required));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='expirationRequired' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("expirationRequired", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetExpirationRequired_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm ExpirationRequired (bool required)
		{
			const string __id = "expirationRequired.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (required);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_maskCardNumber_Z;
#pragma warning disable 0169
		static Delegate GetMaskCardNumber_ZHandler ()
		{
			if (cb_maskCardNumber_Z == null)
				cb_maskCardNumber_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_MaskCardNumber_Z);
			return cb_maskCardNumber_Z;
		}

		static IntPtr n_MaskCardNumber_Z (IntPtr jnienv, IntPtr native__this, bool mask)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.MaskCardNumber (mask));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='maskCardNumber' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("maskCardNumber", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetMaskCardNumber_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm MaskCardNumber (bool mask)
		{
			const string __id = "maskCardNumber.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (mask);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_maskCvv_Z;
#pragma warning disable 0169
		static Delegate GetMaskCvv_ZHandler ()
		{
			if (cb_maskCvv_Z == null)
				cb_maskCvv_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_MaskCvv_Z);
			return cb_maskCvv_Z;
		}

		static IntPtr n_MaskCvv_Z (IntPtr jnienv, IntPtr native__this, bool mask)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.MaskCvv (mask));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='maskCvv' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("maskCvv", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetMaskCvv_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm MaskCvv (bool mask)
		{
			const string __id = "maskCvv.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (mask);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
#pragma warning disable 0169
		static Delegate GetOnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler ()
		{
			if (cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ == null)
				cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_);
			return cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
		}

		static void n_OnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ (IntPtr jnienv, IntPtr native__this, IntPtr native_cardType)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var cardType = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType> (native_cardType, JniHandleOwnership.DoNotTransfer);
			__this.OnCardTypeChanged (cardType);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onCardTypeChanged' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.utils.CardType']]"
		[Register ("onCardTypeChanged", "(Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V", "GetOnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler")]
		public virtual unsafe void OnCardTypeChanged (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType cardType)
		{
			const string __id = "onCardTypeChanged.(Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((cardType == null) ? IntPtr.Zero : ((global::Java.Lang.Object) cardType).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (cardType);
			}
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var v = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_v, JniHandleOwnership.DoNotTransfer);
			__this.OnClick (v);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onClick' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
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

		static Delegate cb_onEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_;
#pragma warning disable 0169
		static Delegate GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler ()
		{
			if (cb_onEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_ == null)
				cb_onEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLIL_Z) n_OnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_);
			return cb_onEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_;
		}

		static bool n_OnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_ (IntPtr jnienv, IntPtr native__this, IntPtr native_v, int native_actionId, IntPtr native_e)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var v = global::Java.Lang.Object.GetObject<global::Android.Widget.TextView> (native_v, JniHandleOwnership.DoNotTransfer);
			var actionId = (global::Android.Views.InputMethods.ImeAction) native_actionId;
			var e = global::Java.Lang.Object.GetObject<global::Android.Views.KeyEvent> (native_e, JniHandleOwnership.DoNotTransfer);
			bool __ret = __this.OnEditorAction (v, actionId, e);
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onEditorAction' and count(parameter)=3 and parameter[1][@type='android.widget.TextView'] and parameter[2][@type='int'] and parameter[3][@type='android.view.KeyEvent']]"
		[Register ("onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler")]
		public virtual unsafe bool OnEditorAction (global::Android.Widget.TextView v, [global::Android.Runtime.GeneratedEnum] global::Android.Views.InputMethods.ImeAction actionId, global::Android.Views.KeyEvent e)
		{
			const string __id = "onEditorAction.(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((v == null) ? IntPtr.Zero : ((global::Java.Lang.Object) v).Handle);
				__args [1] = new JniArgumentValue ((int) actionId);
				__args [2] = new JniArgumentValue ((e == null) ? IntPtr.Zero : ((global::Java.Lang.Object) e).Handle);
				var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (v);
				global::System.GC.KeepAlive (e);
			}
		}

		static Delegate cb_onFocusChange_Landroid_view_View_Z;
#pragma warning disable 0169
		static Delegate GetOnFocusChange_Landroid_view_View_ZHandler ()
		{
			if (cb_onFocusChange_Landroid_view_View_Z == null)
				cb_onFocusChange_Landroid_view_View_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLZ_V) n_OnFocusChange_Landroid_view_View_Z);
			return cb_onFocusChange_Landroid_view_View_Z;
		}

		static void n_OnFocusChange_Landroid_view_View_Z (IntPtr jnienv, IntPtr native__this, IntPtr native_v, bool hasFocus)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var v = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_v, JniHandleOwnership.DoNotTransfer);
			__this.OnFocusChange (v, hasFocus);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onFocusChange' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='boolean']]"
		[Register ("onFocusChange", "(Landroid/view/View;Z)V", "GetOnFocusChange_Landroid_view_View_ZHandler")]
		public virtual unsafe void OnFocusChange (global::Android.Views.View v, bool hasFocus)
		{
			const string __id = "onFocusChange.(Landroid/view/View;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((v == null) ? IntPtr.Zero : ((global::Java.Lang.Object) v).Handle);
				__args [1] = new JniArgumentValue (hasFocus);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (v);
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

		static void n_OnTextChanged_Ljava_lang_CharSequence_III (IntPtr jnienv, IntPtr native__this, IntPtr native_s, int start, int before, int count)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var s = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_s, JniHandleOwnership.DoNotTransfer);
			__this.OnTextChanged (s, start, before, count);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register ("onTextChanged", "(Ljava/lang/CharSequence;III)V", "GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler")]
		public virtual unsafe void OnTextChanged (global::Java.Lang.ICharSequence s, int start, int before, int count)
		{
			const string __id = "onTextChanged.(Ljava/lang/CharSequence;III)V";
			IntPtr native_s = CharSequence.ToLocalJniHandle (s);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_s);
				__args [1] = new JniArgumentValue (start);
				__args [2] = new JniArgumentValue (before);
				__args [3] = new JniArgumentValue (count);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_s);
				global::System.GC.KeepAlive (s);
			}
		}

		public void OnTextChanged (string s, int start, int before, int count)
		{
			var jls_s = s == null ? null : new global::Java.Lang.String (s);
			OnTextChanged (jls_s, start, before, count);
			jls_s?.Dispose ();
		}

		static Delegate cb_setCardNumberError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCardNumberError_Ljava_lang_String_Handler ()
		{
			if (cb_setCardNumberError_Ljava_lang_String_ == null)
				cb_setCardNumberError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCardNumberError_Ljava_lang_String_);
			return cb_setCardNumberError_Ljava_lang_String_;
		}

		static void n_SetCardNumberError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_errorMessage)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var errorMessage = JNIEnv.GetString (native_errorMessage, JniHandleOwnership.DoNotTransfer);
			__this.SetCardNumberError (errorMessage);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCardNumberError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCardNumberError", "(Ljava/lang/String;)V", "GetSetCardNumberError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCardNumberError (string errorMessage)
		{
			const string __id = "setCardNumberError.(Ljava/lang/String;)V";
			IntPtr native_errorMessage = JNIEnv.NewString (errorMessage);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_errorMessage);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_errorMessage);
			}
		}

		static Delegate cb_setCardholderNameError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCardholderNameError_Ljava_lang_String_Handler ()
		{
			if (cb_setCardholderNameError_Ljava_lang_String_ == null)
				cb_setCardholderNameError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCardholderNameError_Ljava_lang_String_);
			return cb_setCardholderNameError_Ljava_lang_String_;
		}

		static void n_SetCardholderNameError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_errorMessage)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var errorMessage = JNIEnv.GetString (native_errorMessage, JniHandleOwnership.DoNotTransfer);
			__this.SetCardholderNameError (errorMessage);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCardholderNameError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCardholderNameError", "(Ljava/lang/String;)V", "GetSetCardholderNameError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCardholderNameError (string errorMessage)
		{
			const string __id = "setCardholderNameError.(Ljava/lang/String;)V";
			IntPtr native_errorMessage = JNIEnv.NewString (errorMessage);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_errorMessage);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_errorMessage);
			}
		}

		static Delegate cb_setCvvError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCvvError_Ljava_lang_String_Handler ()
		{
			if (cb_setCvvError_Ljava_lang_String_ == null)
				cb_setCvvError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCvvError_Ljava_lang_String_);
			return cb_setCvvError_Ljava_lang_String_;
		}

		static void n_SetCvvError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_errorMessage)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var errorMessage = JNIEnv.GetString (native_errorMessage, JniHandleOwnership.DoNotTransfer);
			__this.SetCvvError (errorMessage);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCvvError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCvvError", "(Ljava/lang/String;)V", "GetSetCvvError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCvvError (string errorMessage)
		{
			const string __id = "setCvvError.(Ljava/lang/String;)V";
			IntPtr native_errorMessage = JNIEnv.NewString (errorMessage);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_errorMessage);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_errorMessage);
			}
		}

		static Delegate cb_setExpirationError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetExpirationError_Ljava_lang_String_Handler ()
		{
			if (cb_setExpirationError_Ljava_lang_String_ == null)
				cb_setExpirationError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetExpirationError_Ljava_lang_String_);
			return cb_setExpirationError_Ljava_lang_String_;
		}

		static void n_SetExpirationError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_errorMessage)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var errorMessage = JNIEnv.GetString (native_errorMessage, JniHandleOwnership.DoNotTransfer);
			__this.SetExpirationError (errorMessage);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setExpirationError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setExpirationError", "(Ljava/lang/String;)V", "GetSetExpirationError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetExpirationError (string errorMessage)
		{
			const string __id = "setExpirationError.(Ljava/lang/String;)V";
			IntPtr native_errorMessage = JNIEnv.NewString (errorMessage);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_errorMessage);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_errorMessage);
			}
		}

		static Delegate cb_setHideScanDrawable_Z;
#pragma warning disable 0169
		static Delegate GetSetHideScanDrawable_ZHandler ()
		{
			if (cb_setHideScanDrawable_Z == null)
				cb_setHideScanDrawable_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_SetHideScanDrawable_Z);
			return cb_setHideScanDrawable_Z;
		}

		static IntPtr n_SetHideScanDrawable_Z (IntPtr jnienv, IntPtr native__this, bool hideScanDrawable)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.SetHideScanDrawable (hideScanDrawable));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setHideScanDrawable' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setHideScanDrawable", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetSetHideScanDrawable_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm SetHideScanDrawable (bool hideScanDrawable)
		{
			const string __id = "setHideScanDrawable.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (hideScanDrawable);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_setOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_;
#pragma warning disable 0169
		static Delegate GetSetOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_Handler ()
		{
			if (cb_setOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_ == null)
				cb_setOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_);
			return cb_setOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_;
		}

		static void n_SetOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_listener)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var listener = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener)global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener> (native_listener, JniHandleOwnership.DoNotTransfer);
			__this.SetOnCardFormSubmitListener (listener);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setOnCardFormSubmitListener' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.OnCardFormSubmitListener']]"
		[Register ("setOnCardFormSubmitListener", "(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListener;)V", "GetSetOnCardFormSubmitListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormSubmitListener_Handler")]
		public virtual unsafe void SetOnCardFormSubmitListener (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener listener)
		{
			const string __id = "setOnCardFormSubmitListener.(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormSubmitListener;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (listener);
			}
		}

		static Delegate cb_setOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_;
#pragma warning disable 0169
		static Delegate GetSetOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_Handler ()
		{
			if (cb_setOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_ == null)
				cb_setOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_);
			return cb_setOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_;
		}

		static void n_SetOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_listener)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var listener = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener)global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener> (native_listener, JniHandleOwnership.DoNotTransfer);
			__this.SetOnCardFormValidListener (listener);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setOnCardFormValidListener' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.OnCardFormValidListener']]"
		[Register ("setOnCardFormValidListener", "(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListener;)V", "GetSetOnCardFormValidListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormValidListener_Handler")]
		public virtual unsafe void SetOnCardFormValidListener (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener listener)
		{
			const string __id = "setOnCardFormValidListener.(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormValidListener;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (listener);
			}
		}

		static Delegate cb_setOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_;
#pragma warning disable 0169
		static Delegate GetSetOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_Handler ()
		{
			if (cb_setOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_ == null)
				cb_setOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_);
			return cb_setOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_;
		}

		static void n_SetOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_listener)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var listener = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener)global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener> (native_listener, JniHandleOwnership.DoNotTransfer);
			__this.SetOnCardTypeChangedListener (listener);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setOnCardTypeChangedListener' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.OnCardTypeChangedListener']]"
		[Register ("setOnCardTypeChangedListener", "(Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardEditText$OnCardTypeChangedListener;)V", "GetSetOnCardTypeChangedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_view_CardEditText_OnCardTypeChangedListener_Handler")]
		public virtual unsafe void SetOnCardTypeChangedListener (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener listener)
		{
			const string __id = "setOnCardTypeChangedListener.(Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardEditText$OnCardTypeChangedListener;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (listener);
			}
		}

		static Delegate cb_setOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_;
#pragma warning disable 0169
		static Delegate GetSetOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_Handler ()
		{
			if (cb_setOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_ == null)
				cb_setOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_);
			return cb_setOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_;
		}

		static void n_SetOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_listener)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var listener = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener)global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener> (native_listener, JniHandleOwnership.DoNotTransfer);
			__this.SetOnFormFieldFocusedListener (listener);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setOnFormFieldFocusedListener' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.OnCardFormFieldFocusedListener']]"
		[Register ("setOnFormFieldFocusedListener", "(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListener;)V", "GetSetOnFormFieldFocusedListener_Lcom_payment_paymentsdk_creditcard_view_cardform_OnCardFormFieldFocusedListener_Handler")]
		public virtual unsafe void SetOnFormFieldFocusedListener (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener listener)
		{
			const string __id = "setOnFormFieldFocusedListener.(Lcom/payment/paymentsdk/creditcard/view/cardform/OnCardFormFieldFocusedListener;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (listener);
			}
		}

		static Delegate cb_setup_Landroidx_fragment_app_FragmentActivity_;
#pragma warning disable 0169
		static Delegate GetSetup_Landroidx_fragment_app_FragmentActivity_Handler ()
		{
			if (cb_setup_Landroidx_fragment_app_FragmentActivity_ == null)
				cb_setup_Landroidx_fragment_app_FragmentActivity_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_Setup_Landroidx_fragment_app_FragmentActivity_);
			return cb_setup_Landroidx_fragment_app_FragmentActivity_;
		}

		static void n_Setup_Landroidx_fragment_app_FragmentActivity_ (IntPtr jnienv, IntPtr native__this, IntPtr native_activity)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var activity = global::Java.Lang.Object.GetObject<global::AndroidX.Fragment.App.FragmentActivity> (native_activity, JniHandleOwnership.DoNotTransfer);
			__this.Setup (activity);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setup' and count(parameter)=1 and parameter[1][@type='androidx.fragment.app.FragmentActivity']]"
		[Register ("setup", "(Landroidx/fragment/app/FragmentActivity;)V", "GetSetup_Landroidx_fragment_app_FragmentActivity_Handler")]
		public virtual unsafe void Setup (global::AndroidX.Fragment.App.FragmentActivity activity)
		{
			const string __id = "setup.(Landroidx/fragment/app/FragmentActivity;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Validate ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='validate' and count(parameter)=0]"
		[Register ("validate", "()V", "GetValidateHandler")]
		public virtual unsafe void Validate ()
		{
			const string __id = "validate.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		#region "Event implementation for Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener"

		public event EventHandler CardFormSubmit {
			add {
				global::Java.Interop.EventHelper.AddEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor>(
				ref weak_implementor_SetOnCardFormSubmitListener,
				__CreateIOnCardFormSubmitListenerImplementor,
				SetOnCardFormSubmitListener,
				__h => __h.Handler += value);
			}
			remove {
				global::Java.Interop.EventHelper.RemoveEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor>(
				ref weak_implementor_SetOnCardFormSubmitListener,
				global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor.__IsEmpty,
				__v => SetOnCardFormSubmitListener (null),
				__h => __h.Handler -= value);
			}
		}

		WeakReference weak_implementor_SetOnCardFormSubmitListener;

		global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor __CreateIOnCardFormSubmitListenerImplementor ()
		{
			return new global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormSubmitListenerImplementor (this);
		}

		#endregion

		#region "Event implementation for Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener"

		public event EventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.CardFormValidEventArgs> CardFormValid {
			add {
				global::Java.Interop.EventHelper.AddEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor>(
				ref weak_implementor_SetOnCardFormValidListener,
				__CreateIOnCardFormValidListenerImplementor,
				SetOnCardFormValidListener,
				__h => __h.Handler += value);
			}
			remove {
				global::Java.Interop.EventHelper.RemoveEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor>(
				ref weak_implementor_SetOnCardFormValidListener,
				global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor.__IsEmpty,
				__v => SetOnCardFormValidListener (null),
				__h => __h.Handler -= value);
			}
		}

		WeakReference weak_implementor_SetOnCardFormValidListener;

		global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor __CreateIOnCardFormValidListenerImplementor ()
		{
			return new global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormValidListenerImplementor (this);
		}

		#endregion

		#region "Event implementation for Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener"

		public event EventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.CardTypeChangedEventArgs> CardTypeChanged {
			add {
				global::Java.Interop.EventHelper.AddEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListenerImplementor>(
				ref weak_implementor_SetOnCardTypeChangedListener,
				__CreateIOnCardTypeChangedListenerImplementor,
				SetOnCardTypeChangedListener,
				__h => __h.Handler += value);
			}
			remove {
				global::Java.Interop.EventHelper.RemoveEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListenerImplementor>(
				ref weak_implementor_SetOnCardTypeChangedListener,
				global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListenerImplementor.__IsEmpty,
				__v => SetOnCardTypeChangedListener (null),
				__h => __h.Handler -= value);
			}
		}

		WeakReference weak_implementor_SetOnCardTypeChangedListener;

		global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListenerImplementor __CreateIOnCardTypeChangedListenerImplementor ()
		{
			return new global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListenerImplementor (this);
		}

		#endregion

		#region "Event implementation for Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener"

		public event EventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.CardFormFieldFocusedEventArgs> FormFieldFocused {
			add {
				global::Java.Interop.EventHelper.AddEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor>(
				ref weak_implementor_SetOnFormFieldFocusedListener,
				__CreateIOnCardFormFieldFocusedListenerImplementor,
				SetOnFormFieldFocusedListener,
				__h => __h.Handler += value);
			}
			remove {
				global::Java.Interop.EventHelper.RemoveEventHandler<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListener, global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor>(
				ref weak_implementor_SetOnFormFieldFocusedListener,
				global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor.__IsEmpty,
				__v => SetOnFormFieldFocusedListener (null),
				__h => __h.Handler -= value);
			}
		}

		WeakReference weak_implementor_SetOnFormFieldFocusedListener;

		global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor __CreateIOnCardFormFieldFocusedListenerImplementor ()
		{
			return new global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.IOnCardFormFieldFocusedListenerImplementor (this);
		}

		#endregion

	}
}
