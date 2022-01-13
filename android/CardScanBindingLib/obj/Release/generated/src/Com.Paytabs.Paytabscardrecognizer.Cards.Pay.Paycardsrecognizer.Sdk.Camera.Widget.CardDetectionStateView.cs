using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CardDetectionStateView", DoNotGenerateAcw=true)]
	public partial class CardDetectionStateView : global::Android.Views.View {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CardDetectionStateView", typeof (CardDetectionStateView));

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

		protected CardDetectionStateView (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']/constructor[@name='CardDetectionStateView' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe CardDetectionStateView (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']/constructor[@name='CardDetectionStateView' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe CardDetectionStateView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']/constructor[@name='CardDetectionStateView' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe CardDetectionStateView (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyleAttr) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_setDetectionState_I;
#pragma warning disable 0169
		static Delegate GetSetDetectionState_IHandler ()
		{
			if (cb_setDetectionState_I == null)
				cb_setDetectionState_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_V) n_SetDetectionState_I);
			return cb_setDetectionState_I;
		}

		static void n_SetDetectionState_I (IntPtr jnienv, IntPtr native__this, int detectionState)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.CardDetectionStateView> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetDetectionState (detectionState);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']/method[@name='setDetectionState' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("setDetectionState", "(I)V", "GetSetDetectionState_IHandler")]
		public virtual unsafe void SetDetectionState (int detectionState)
		{
			const string __id = "setDetectionState.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (detectionState);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

		static Delegate cb_setRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_;
#pragma warning disable 0169
		static Delegate GetSetRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler ()
		{
			if (cb_setRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ == null)
				cb_setRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_);
			return cb_setRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_;
		}

		static void n_SetRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ (IntPtr jnienv, IntPtr native__this, IntPtr native_result)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.CardDetectionStateView> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var result = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult> (native_result, JniHandleOwnership.DoNotTransfer);
			__this.SetRecognitionResult (result);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget']/class[@name='CardDetectionStateView']/method[@name='setRecognitionResult' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult']]"
		[Register ("setRecognitionResult", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V", "GetSetRecognitionResult_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler")]
		public virtual unsafe void SetRecognitionResult (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult result)
		{
			const string __id = "setRecognitionResult.(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((result == null) ? IntPtr.Zero : ((global::Java.Lang.Object) result).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (result);
			}
		}

	}
}
