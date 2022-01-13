using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText", DoNotGenerateAcw=true)]
	public partial class CardEditText : global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.ErrorEditText, global::Android.Text.ITextWatcher {
		// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/interface[@name='CardEditText.OnCardTypeChangedListener']"
		[Register ("com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText$OnCardTypeChangedListener", "", "Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText/IOnCardTypeChangedListenerInvoker")]
		public partial interface IOnCardTypeChangedListener : IJavaObject, IJavaPeerable {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/interface[@name='CardEditText.OnCardTypeChangedListener']/method[@name='onCardTypeChanged' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.utils.CardType']]"
			[Register ("onCardTypeChanged", "(Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V", "GetOnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler:Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText/IOnCardTypeChangedListenerInvoker, PaymentSDK.Binding")]
			void OnCardTypeChanged (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType p0);

		}

		[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText$OnCardTypeChangedListener", DoNotGenerateAcw=true)]
		internal partial class IOnCardTypeChangedListenerInvoker : global::Java.Lang.Object, IOnCardTypeChangedListener {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText$OnCardTypeChangedListener", typeof (IOnCardTypeChangedListenerInvoker));

			static IntPtr java_class_ref {
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
				get { return class_ref; }
			}

			[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
			[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
			protected override global::System.Type ThresholdType {
				get { return _members.ManagedPeerType; }
			}

			IntPtr class_ref;

			public static IOnCardTypeChangedListener GetObject (IntPtr handle, JniHandleOwnership transfer)
			{
				return global::Java.Lang.Object.GetObject<IOnCardTypeChangedListener> (handle, transfer);
			}

			static IntPtr Validate (IntPtr handle)
			{
				if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
					throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.OnCardTypeChangedListener'.");
				return handle;
			}

			protected override void Dispose (bool disposing)
			{
				if (this.class_ref != IntPtr.Zero)
					JNIEnv.DeleteGlobalRef (this.class_ref);
				this.class_ref = IntPtr.Zero;
				base.Dispose (disposing);
			}

			public IOnCardTypeChangedListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
			{
				IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
				this.class_ref = JNIEnv.NewGlobalRef (local_ref);
				JNIEnv.DeleteLocalRef (local_ref);
			}

			static Delegate cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
#pragma warning disable 0169
			static Delegate GetOnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler ()
			{
				if (cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ == null)
					cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_);
				return cb_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
			}

			static void n_OnCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p0 = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType> (native_p0, JniHandleOwnership.DoNotTransfer);
				__this.OnCardTypeChanged (p0);
			}
#pragma warning restore 0169

			IntPtr id_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
			public unsafe void OnCardTypeChanged (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType p0)
			{
				if (id_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ == IntPtr.Zero)
					id_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ = JNIEnv.GetMethodID (class_ref, "onCardTypeChanged", "(Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V");
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCardTypeChanged_Lcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_, __args);
			}

		}

		// event args for com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.OnCardTypeChangedListener.onCardTypeChanged
		public partial class CardTypeChangedEventArgs : global::System.EventArgs {
			public CardTypeChangedEventArgs (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType p0)
			{
				this.p0 = p0;
			}

			global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType p0;

			public global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType P0 {
				get { return p0; }
			}

		}

		[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText_OnCardTypeChangedListenerImplementor")]
		internal sealed partial class IOnCardTypeChangedListenerImplementor : global::Java.Lang.Object, IOnCardTypeChangedListener {

			object sender;

			public IOnCardTypeChangedListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText_OnCardTypeChangedListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
			{
				global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
				this.sender = sender;
			}

			#pragma warning disable 0649
			public EventHandler<CardTypeChangedEventArgs> Handler;
			#pragma warning restore 0649

			public void OnCardTypeChanged (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType p0)
			{
				var __h = Handler;
				if (__h != null)
					__h (sender, new CardTypeChangedEventArgs (p0));
			}

			internal static bool __IsEmpty (IOnCardTypeChangedListenerImplementor value)
			{
				return value.Handler == null;
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/CardEditText", typeof (CardEditText));

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

		protected CardEditText (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/constructor[@name='CardEditText' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe CardEditText (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/constructor[@name='CardEditText' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe CardEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/constructor[@name='CardEditText' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe CardEditText (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyle) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_getCardType;
#pragma warning disable 0169
		static Delegate GetGetCardTypeHandler ()
		{
			if (cb_getCardType == null)
				cb_getCardType = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardType);
			return cb_getCardType;
		}

		static IntPtr n_GetCardType (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CardType);
		}
#pragma warning restore 0169

		public virtual unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType CardType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='getCardType' and count(parameter)=0]"
			[Register ("getCardType", "()Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;", "GetGetCardTypeHandler")]
			get {
				const string __id = "getCardType.()Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var editable = (global::Android.Text.IEditable)global::Java.Lang.Object.GetObject<global::Android.Text.IEditable> (native_editable, JniHandleOwnership.DoNotTransfer);
			__this.AfterTextChanged (editable);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='afterTextChanged' and count(parameter)=1 and parameter[1][@type='android.text.Editable']]"
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var s = global::Java.Lang.Object.GetObject<global::Java.Lang.ICharSequence> (native_s, JniHandleOwnership.DoNotTransfer);
			__this.BeforeTextChanged (s, start, count, after);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='beforeTextChanged' and count(parameter)=4 and parameter[1][@type='java.lang.CharSequence'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
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

		static Delegate cb_displayCardTypeIcon_Z;
#pragma warning disable 0169
		static Delegate GetDisplayCardTypeIcon_ZHandler ()
		{
			if (cb_displayCardTypeIcon_Z == null)
				cb_displayCardTypeIcon_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_DisplayCardTypeIcon_Z);
			return cb_displayCardTypeIcon_Z;
		}

		static void n_DisplayCardTypeIcon_Z (IntPtr jnienv, IntPtr native__this, bool display)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.DisplayCardTypeIcon (display);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='displayCardTypeIcon' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("displayCardTypeIcon", "(Z)V", "GetDisplayCardTypeIcon_ZHandler")]
		public virtual unsafe void DisplayCardTypeIcon (bool display)
		{
			const string __id = "displayCardTypeIcon.(Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (display);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

		static Delegate cb_setHideScanDrawable_Z;
#pragma warning disable 0169
		static Delegate GetSetHideScanDrawable_ZHandler ()
		{
			if (cb_setHideScanDrawable_Z == null)
				cb_setHideScanDrawable_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetHideScanDrawable_Z);
			return cb_setHideScanDrawable_Z;
		}

		static void n_SetHideScanDrawable_Z (IntPtr jnienv, IntPtr native__this, bool hideScanDrawable)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetHideScanDrawable (hideScanDrawable);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='setHideScanDrawable' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setHideScanDrawable", "(Z)V", "GetSetHideScanDrawable_ZHandler")]
		public virtual unsafe void SetHideScanDrawable (bool hideScanDrawable)
		{
			const string __id = "setHideScanDrawable.(Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (hideScanDrawable);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

		static Delegate cb_setMask_Z;
#pragma warning disable 0169
		static Delegate GetSetMask_ZHandler ()
		{
			if (cb_setMask_Z == null)
				cb_setMask_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetMask_Z);
			return cb_setMask_Z;
		}

		static void n_SetMask_Z (IntPtr jnienv, IntPtr native__this, bool mask)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetMask (mask);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='setMask' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setMask", "(Z)V", "GetSetMask_ZHandler")]
		public virtual unsafe void SetMask (bool mask)
		{
			const string __id = "setMask.(Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (mask);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var listener = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener)global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.CardEditText.IOnCardTypeChangedListener> (native_listener, JniHandleOwnership.DoNotTransfer);
			__this.SetOnCardTypeChangedListener (listener);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='CardEditText']/method[@name='setOnCardTypeChangedListener' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.view.CardEditText.OnCardTypeChangedListener']]"
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

	}
}
