using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/CardForm", DoNotGenerateAcw=true)]
	public partial class CardForm : global::Android.Widget.LinearLayout, global::Android.Text.ITextWatcher, global::Android.Views.View.IOnClickListener, global::Android.Views.View.IOnFocusChangeListener, global::Android.Widget.TextView.IOnEditorActionListener {
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
		public unsafe CardForm (global::Android.Content.Context p0) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe CardForm (global::Android.Content.Context p0, global::Android.Util.IAttributeSet p1) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe CardForm (global::Android.Content.Context p0, global::Android.Util.IAttributeSet p1, int p2) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue (p2);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/constructor[@name='CardForm' and count(parameter)=4 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "")]
		public unsafe CardForm (global::Android.Content.Context p0, global::Android.Util.IAttributeSet p1, int p2, int p3) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;II)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue (p2);
				__args [3] = new JniArgumentValue (p3);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
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

		static Delegate cb_a_Z;
#pragma warning disable 0169
		static Delegate GetA_ZHandler ()
		{
			if (cb_a_Z == null)
				cb_a_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_A_Z);
			return cb_a_Z;
		}

		static IntPtr n_A_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.A (p0));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='a' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("a", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetA_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm A (bool p0)
		{
			const string __id = "a.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (p0);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_a_I;
#pragma warning disable 0169
		static Delegate GetA_IHandler ()
		{
			if (cb_a_I == null)
				cb_a_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_L) n_A_I);
			return cb_a_I;
		}

		static IntPtr n_A_I (IntPtr jnienv, IntPtr native__this, int p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.A (p0));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='a' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("a", "(I)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetA_IHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm A (int p0)
		{
			const string __id = "a.(I)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (p0);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
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

		static void n_AfterTextChanged_Landroid_text_Editable_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = (global::Android.Text.IEditable)global::Java.Lang.Object.GetObject<global::Android.Text.IEditable> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.AfterTextChanged (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='afterTextChanged' and count(parameter)=1 and parameter[1][@type='android.text.Editable']]"
		[Register ("afterTextChanged", "(Landroid/text/Editable;)V", "GetAfterTextChanged_Landroid_text_Editable_Handler")]
		public virtual unsafe void AfterTextChanged (global::Android.Text.IEditable p0)
		{
			const string __id = "afterTextChanged.(Landroid/text/Editable;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		static Delegate cb_b;
#pragma warning disable 0169
		static Delegate GetBHandler ()
		{
			if (cb_b == null)
				cb_b = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_B);
			return cb_b;
		}

		static bool n_B (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.B ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='b' and count(parameter)=0]"
		[Register ("b", "()Z", "GetBHandler")]
		public virtual unsafe bool B ()
		{
			const string __id = "b.()Z";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
				return __rm;
			} finally {
			}
		}

		static Delegate cb_b_Z;
#pragma warning disable 0169
		static Delegate GetB_ZHandler ()
		{
			if (cb_b_Z == null)
				cb_b_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_B_Z);
			return cb_b_Z;
		}

		static IntPtr n_B_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.B (p0));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='b' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("b", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetB_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm B (bool p0)
		{
			const string __id = "b.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (p0);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
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

		static void n_BeforeTextChanged_Ljava_lang_CharSequence_III (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, int p1, int p2, int p3)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.BeforeTextChanged (p0, p1, p2, p3);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='beforeTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register ("beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler")]
		public virtual unsafe void BeforeTextChanged (global::Java.Lang.ICharSequence p0, int p1, int p2, int p3)
		{
			const string __id = "beforeTextChanged.(Ljava/lang/CharSequence;III)V";
			IntPtr native_p0 = CharSequence.ToLocalJniHandle (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (p1);
				__args [2] = new JniArgumentValue (p2);
				__args [3] = new JniArgumentValue (p3);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				global::System.GC.KeepAlive (p0);
			}
		}

		public void BeforeTextChanged (string p0, int p1, int p2, int p3)
		{
			var jls_p0 = p0 == null ? null : new global::Java.Lang.String (p0);
			BeforeTextChanged (jls_p0, p1, p2, p3);
			jls_p0?.Dispose ();
		}

		static Delegate cb_c_Z;
#pragma warning disable 0169
		static Delegate GetC_ZHandler ()
		{
			if (cb_c_Z == null)
				cb_c_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_C_Z);
			return cb_c_Z;
		}

		static IntPtr n_C_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.C (p0));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='c' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("c", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetC_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm C (bool p0)
		{
			const string __id = "c.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (p0);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_d_Z;
#pragma warning disable 0169
		static Delegate GetD_ZHandler ()
		{
			if (cb_d_Z == null)
				cb_d_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_L) n_D_Z);
			return cb_d_Z;
		}

		static IntPtr n_D_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.D (p0));
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='d' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("d", "(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;", "GetD_ZHandler")]
		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm D (bool p0)
		{
			const string __id = "d.(Z)Lcom/payment/paymentsdk/creditcard/view/cardform/view/CardForm;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (p0);
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
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

		static void n_OnClick_Landroid_view_View_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnClick (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onClick' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
		[Register ("onClick", "(Landroid/view/View;)V", "GetOnClick_Landroid_view_View_Handler")]
		public virtual unsafe void OnClick (global::Android.Views.View p0)
		{
			const string __id = "onClick.(Landroid/view/View;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
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

		static bool n_OnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, int native_p1, IntPtr native_p2)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Widget.TextView> (native_p0, JniHandleOwnership.DoNotTransfer);
			var p1 = (global::Android.Views.InputMethods.ImeAction) native_p1;
			var p2 = global::Java.Lang.Object.GetObject<global::Android.Views.KeyEvent> (native_p2, JniHandleOwnership.DoNotTransfer);
			bool __ret = __this.OnEditorAction (p0, p1, p2);
			return __ret;
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onEditorAction' and count(parameter)=3 and parameter[1][@type='android.widget.TextView'] and parameter[2][@type='int'] and parameter[3][@type='android.view.KeyEvent']]"
		[Register ("onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "GetOnEditorAction_Landroid_widget_TextView_ILandroid_view_KeyEvent_Handler")]
		public virtual unsafe bool OnEditorAction (global::Android.Widget.TextView p0, [global::Android.Runtime.GeneratedEnum] global::Android.Views.InputMethods.ImeAction p1, global::Android.Views.KeyEvent p2)
		{
			const string __id = "onEditorAction.(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((int) p1);
				__args [2] = new JniArgumentValue ((p2 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p2).Handle);
				var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p2);
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

		static void n_OnFocusChange_Landroid_view_View_Z (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, bool p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Views.View> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnFocusChange (p0, p1);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onFocusChange' and count(parameter)=2 and parameter[1][@type='android.view.View'] and parameter[2][@type='boolean']]"
		[Register ("onFocusChange", "(Landroid/view/View;Z)V", "GetOnFocusChange_Landroid_view_View_ZHandler")]
		public virtual unsafe void OnFocusChange (global::Android.Views.View p0, bool p1)
		{
			const string __id = "onFocusChange.(Landroid/view/View;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue (p1);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
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

		static void n_OnTextChanged_Ljava_lang_CharSequence_III (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, int p1, int p2, int p3)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnTextChanged (p0, p1, p2, p3);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='onTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register ("onTextChanged", "(Ljava/lang/CharSequence;III)V", "GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler")]
		public virtual unsafe void OnTextChanged (global::Java.Lang.ICharSequence p0, int p1, int p2, int p3)
		{
			const string __id = "onTextChanged.(Ljava/lang/CharSequence;III)V";
			IntPtr native_p0 = CharSequence.ToLocalJniHandle (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (p1);
				__args [2] = new JniArgumentValue (p2);
				__args [3] = new JniArgumentValue (p3);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				global::System.GC.KeepAlive (p0);
			}
		}

		public void OnTextChanged (string p0, int p1, int p2, int p3)
		{
			var jls_p0 = p0 == null ? null : new global::Java.Lang.String (p0);
			OnTextChanged (jls_p0, p1, p2, p3);
			jls_p0?.Dispose ();
		}

		static Delegate cb_setCardNumberError_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCardNumberError_Ljava_lang_String_Handler ()
		{
			if (cb_setCardNumberError_Ljava_lang_String_ == null)
				cb_setCardNumberError_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCardNumberError_Ljava_lang_String_);
			return cb_setCardNumberError_Ljava_lang_String_;
		}

		static void n_SetCardNumberError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = JNIEnv.GetString (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetCardNumberError (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCardNumberError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCardNumberError", "(Ljava/lang/String;)V", "GetSetCardNumberError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCardNumberError (string p0)
		{
			const string __id = "setCardNumberError.(Ljava/lang/String;)V";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
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

		static void n_SetCardholderNameError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = JNIEnv.GetString (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetCardholderNameError (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCardholderNameError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCardholderNameError", "(Ljava/lang/String;)V", "GetSetCardholderNameError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCardholderNameError (string p0)
		{
			const string __id = "setCardholderNameError.(Ljava/lang/String;)V";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
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

		static void n_SetCvvError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = JNIEnv.GetString (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetCvvError (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setCvvError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCvvError", "(Ljava/lang/String;)V", "GetSetCvvError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetCvvError (string p0)
		{
			const string __id = "setCvvError.(Ljava/lang/String;)V";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
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

		static void n_SetExpirationError_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = JNIEnv.GetString (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetExpirationError (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setExpirationError' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setExpirationError", "(Ljava/lang/String;)V", "GetSetExpirationError_Ljava_lang_String_Handler")]
		public virtual unsafe void SetExpirationError (string p0)
		{
			const string __id = "setExpirationError.(Ljava/lang/String;)V";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
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

		static void n_Setup_Landroidx_fragment_app_FragmentActivity_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardForm> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::AndroidX.Fragment.App.FragmentActivity> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.Setup (p0);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardForm']/method[@name='setup' and count(parameter)=1 and parameter[1][@type='androidx.fragment.app.FragmentActivity']]"
		[Register ("setup", "(Landroidx/fragment/app/FragmentActivity;)V", "GetSetup_Landroidx_fragment_app_FragmentActivity_Handler")]
		public virtual unsafe void Setup (global::AndroidX.Fragment.App.FragmentActivity p0)
		{
			const string __id = "setup.(Landroidx/fragment/app/FragmentActivity;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

	}
}
