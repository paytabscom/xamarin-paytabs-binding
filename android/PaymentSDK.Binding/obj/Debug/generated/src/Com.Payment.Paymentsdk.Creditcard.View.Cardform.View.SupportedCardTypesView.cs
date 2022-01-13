using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/SupportedCardTypesView", DoNotGenerateAcw=true)]
	public partial class SupportedCardTypesView : global::Android.Widget.TextView {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/SupportedCardTypesView", typeof (SupportedCardTypesView));

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

		protected SupportedCardTypesView (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/constructor[@name='SupportedCardTypesView' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe SupportedCardTypesView (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/constructor[@name='SupportedCardTypesView' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe SupportedCardTypesView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/constructor[@name='SupportedCardTypesView' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe SupportedCardTypesView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyleAttr) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/constructor[@name='SupportedCardTypesView' and count(parameter)=4 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int'] and parameter[4][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "")]
		public unsafe SupportedCardTypesView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyleAttr, int defStyleRes) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_setSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
#pragma warning disable 0169
		static Delegate GetSetSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler ()
		{
			if (cb_setSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ == null)
				cb_setSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_);
			return cb_setSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
		}

		static void n_SetSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ (IntPtr jnienv, IntPtr native__this, IntPtr native_cardTypes)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.SupportedCardTypesView> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var cardTypes = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType[]) JNIEnv.GetArray (native_cardTypes, JniHandleOwnership.DoNotTransfer, typeof (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType));
			__this.SetSelected (cardTypes);
			if (cardTypes != null)
				JNIEnv.CopyArray (cardTypes, native_cardTypes);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/method[@name='setSelected' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.utils.CardType...']]"
		[Register ("setSelected", "([Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V", "GetSetSelected_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler")]
		public virtual unsafe void SetSelected (params global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType[] cardTypes)
		{
			const string __id = "setSelected.([Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V";
			IntPtr native_cardTypes = JNIEnv.NewArray (cardTypes);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cardTypes);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				if (cardTypes != null) {
					JNIEnv.CopyArray (native_cardTypes, cardTypes);
					JNIEnv.DeleteLocalRef (native_cardTypes);
				}
				global::System.GC.KeepAlive (cardTypes);
			}
		}

		static Delegate cb_setSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
#pragma warning disable 0169
		static Delegate GetSetSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler ()
		{
			if (cb_setSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ == null)
				cb_setSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_);
			return cb_setSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_;
		}

		static void n_SetSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_ (IntPtr jnienv, IntPtr native__this, IntPtr native_cardTypes)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.SupportedCardTypesView> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var cardTypes = (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType[]) JNIEnv.GetArray (native_cardTypes, JniHandleOwnership.DoNotTransfer, typeof (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType));
			__this.SetSupportedCardTypes (cardTypes);
			if (cardTypes != null)
				JNIEnv.CopyArray (cardTypes, native_cardTypes);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='SupportedCardTypesView']/method[@name='setSupportedCardTypes' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.cardform.utils.CardType...']]"
		[Register ("setSupportedCardTypes", "([Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V", "GetSetSupportedCardTypes_arrayLcom_payment_paymentsdk_creditcard_view_cardform_utils_CardType_Handler")]
		public virtual unsafe void SetSupportedCardTypes (params global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.CardType[] cardTypes)
		{
			const string __id = "setSupportedCardTypes.([Lcom/payment/paymentsdk/creditcard/view/cardform/utils/CardType;)V";
			IntPtr native_cardTypes = JNIEnv.NewArray (cardTypes);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_cardTypes);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				if (cardTypes != null) {
					JNIEnv.CopyArray (native_cardTypes, cardTypes);
					JNIEnv.DeleteLocalRef (native_cardTypes);
				}
				global::System.GC.KeepAlive (cardTypes);
			}
		}

	}
}
