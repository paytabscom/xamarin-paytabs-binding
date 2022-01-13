using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionStatusListener']"
	[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListener", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker")]
	public partial interface IRecognitionStatusListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionStatusListener']/method[@name='onCardImageReceived' and count(parameter)=1 and parameter[1][@type='android.graphics.Bitmap']]"
		[Register ("onCardImageReceived", "(Landroid/graphics/Bitmap;)V", "GetOnCardImageReceived_Landroid_graphics_Bitmap_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib")]
		void OnCardImageReceived (global::Android.Graphics.Bitmap p0);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionStatusListener']/method[@name='onRecognitionComplete' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult']]"
		[Register ("onRecognitionComplete", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V", "GetOnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib")]
		void OnRecognitionComplete (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0);

	}

	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListener", DoNotGenerateAcw=true)]
	internal partial class IRecognitionStatusListenerInvoker : global::Java.Lang.Object, IRecognitionStatusListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListener", typeof (IRecognitionStatusListenerInvoker));

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

		public static IRecognitionStatusListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IRecognitionStatusListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IRecognitionStatusListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onCardImageReceived_Landroid_graphics_Bitmap_;
#pragma warning disable 0169
		static Delegate GetOnCardImageReceived_Landroid_graphics_Bitmap_Handler ()
		{
			if (cb_onCardImageReceived_Landroid_graphics_Bitmap_ == null)
				cb_onCardImageReceived_Landroid_graphics_Bitmap_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnCardImageReceived_Landroid_graphics_Bitmap_);
			return cb_onCardImageReceived_Landroid_graphics_Bitmap_;
		}

		static void n_OnCardImageReceived_Landroid_graphics_Bitmap_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Android.Graphics.Bitmap> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnCardImageReceived (p0);
		}
#pragma warning restore 0169

		IntPtr id_onCardImageReceived_Landroid_graphics_Bitmap_;
		public unsafe void OnCardImageReceived (global::Android.Graphics.Bitmap p0)
		{
			if (id_onCardImageReceived_Landroid_graphics_Bitmap_ == IntPtr.Zero)
				id_onCardImageReceived_Landroid_graphics_Bitmap_ = JNIEnv.GetMethodID (class_ref, "onCardImageReceived", "(Landroid/graphics/Bitmap;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCardImageReceived_Landroid_graphics_Bitmap_, __args);
		}

		static Delegate cb_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_;
#pragma warning disable 0169
		static Delegate GetOnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler ()
		{
			if (cb_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ == null)
				cb_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_);
			return cb_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_;
		}

		static void n_OnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.OnRecognitionComplete (p0);
		}
#pragma warning restore 0169

		IntPtr id_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_;
		public unsafe void OnRecognitionComplete (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0)
		{
			if (id_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ == IntPtr.Zero)
				id_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_ = JNIEnv.GetMethodID (class_ref, "onRecognitionComplete", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_, __args);
		}

	}

	// event args for com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener.onCardImageReceived
	public partial class CardImageReceivedEventArgs : global::System.EventArgs {
		public CardImageReceivedEventArgs (global::Android.Graphics.Bitmap p0)
		{
			this.p0 = p0;
		}

		global::Android.Graphics.Bitmap p0;

		public global::Android.Graphics.Bitmap P0 {
			get { return p0; }
		}

	}

	// event args for com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener.onRecognitionComplete
	public partial class RecognitionCompleteEventArgs : global::System.EventArgs {
		public RecognitionCompleteEventArgs (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0)
		{
			this.p0 = p0;
		}

		global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0;

		public global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult P0 {
			get { return p0; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListenerImplementor")]
	internal sealed partial class IRecognitionStatusListenerImplementor : global::Java.Lang.Object, IRecognitionStatusListener {

		object sender;

		public IRecognitionStatusListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<CardImageReceivedEventArgs> OnCardImageReceivedHandler;
		#pragma warning restore 0649

		public void OnCardImageReceived (global::Android.Graphics.Bitmap p0)
		{
			var __h = OnCardImageReceivedHandler;
			if (__h != null)
				__h (sender, new CardImageReceivedEventArgs (p0));
		}

		#pragma warning disable 0649
		public EventHandler<RecognitionCompleteEventArgs> OnRecognitionCompleteHandler;
		#pragma warning restore 0649

		public void OnRecognitionComplete (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0)
		{
			var __h = OnRecognitionCompleteHandler;
			if (__h != null)
				__h (sender, new RecognitionCompleteEventArgs (p0));
		}

		internal static bool __IsEmpty (IRecognitionStatusListenerImplementor value)
		{
			return value.OnCardImageReceivedHandler == null && value.OnRecognitionCompleteHandler == null;
		}

	}
}
