using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']"
	[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionCoreImpl", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker")]
	public partial interface IRecognitionCoreImpl : IJavaObject, IJavaPeerable {
		global::Android.Graphics.Rect CardFrameRect {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='getCardFrameRect' and count(parameter)=0]"
			[Register ("getCardFrameRect", "()Landroid/graphics/Rect;", "GetGetCardFrameRectHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
			get; 
		}

		bool Idle {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='isIdle' and count(parameter)=0]"
			[Register ("isIdle", "()Z", "GetIsIdleHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
			get; 

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setIdle' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setIdle", "(Z)V", "GetSetIdle_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
			set; 
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='processFrameYV12' and count(parameter)=3 and parameter[1][@type='int'] and parameter[2][@type='int'] and parameter[3][@type='byte[]']]"
		[Register ("processFrameYV12", "(II[B)I", "GetProcessFrameYV12_IIarrayBHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		int ProcessFrameYV12 (int p0, int p1, byte[] p2);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='resetResult' and count(parameter)=0]"
		[Register ("resetResult", "()V", "GetResetResultHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void ResetResult ();

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setDisplayConfiguration' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.DisplayConfiguration']]"
		[Register ("setDisplayConfiguration", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfiguration;)V", "GetSetDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void SetDisplayConfiguration (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration p0);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setRecognitionMode' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("setRecognitionMode", "(I)V", "GetSetRecognitionMode_IHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void SetRecognitionMode (int p0);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setStatusListener' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener']]"
		[Register ("setStatusListener", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListener;)V", "GetSetStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void SetStatusListener (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener p0);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setTorchListener' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.TorchStatusListener']]"
		[Register ("setTorchListener", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListener;)V", "GetSetTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void SetTorchListener (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListener p0);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='RecognitionCoreImpl']/method[@name='setTorchStatus' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setTorchStatus", "(Z)V", "GetSetTorchStatus_ZHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImplInvoker, CardScanBindingLib")]
		void SetTorchStatus (bool p0);

	}

	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionCoreImpl", DoNotGenerateAcw=true)]
	internal partial class IRecognitionCoreImplInvoker : global::Java.Lang.Object, IRecognitionCoreImpl {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionCoreImpl", typeof (IRecognitionCoreImplInvoker));

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

		public static IRecognitionCoreImpl GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IRecognitionCoreImpl> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionCoreImpl'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IRecognitionCoreImplInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_getCardFrameRect;
#pragma warning disable 0169
		static Delegate GetGetCardFrameRectHandler ()
		{
			if (cb_getCardFrameRect == null)
				cb_getCardFrameRect = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardFrameRect);
			return cb_getCardFrameRect;
		}

		static IntPtr n_GetCardFrameRect (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.CardFrameRect);
		}
#pragma warning restore 0169

		IntPtr id_getCardFrameRect;
		public unsafe global::Android.Graphics.Rect CardFrameRect {
			get {
				if (id_getCardFrameRect == IntPtr.Zero)
					id_getCardFrameRect = JNIEnv.GetMethodID (class_ref, "getCardFrameRect", "()Landroid/graphics/Rect;");
				return global::Java.Lang.Object.GetObject<global::Android.Graphics.Rect> (JNIEnv.CallObjectMethod (((global::Java.Lang.Object) this).Handle, id_getCardFrameRect), JniHandleOwnership.TransferLocalRef);
			}
		}

		static Delegate cb_isIdle;
#pragma warning disable 0169
		static Delegate GetIsIdleHandler ()
		{
			if (cb_isIdle == null)
				cb_isIdle = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsIdle);
			return cb_isIdle;
		}

		static bool n_IsIdle (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.Idle;
		}
#pragma warning restore 0169

		static Delegate cb_setIdle_Z;
#pragma warning disable 0169
		static Delegate GetSetIdle_ZHandler ()
		{
			if (cb_setIdle_Z == null)
				cb_setIdle_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetIdle_Z);
			return cb_setIdle_Z;
		}

		static void n_SetIdle_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Idle = p0;
		}
#pragma warning restore 0169

		IntPtr id_isIdle;
		IntPtr id_setIdle_Z;
		public unsafe bool Idle {
			get {
				if (id_isIdle == IntPtr.Zero)
					id_isIdle = JNIEnv.GetMethodID (class_ref, "isIdle", "()Z");
				return JNIEnv.CallBooleanMethod (((global::Java.Lang.Object) this).Handle, id_isIdle);
			}
			set {
				if (id_setIdle_Z == IntPtr.Zero)
					id_setIdle_Z = JNIEnv.GetMethodID (class_ref, "setIdle", "(Z)V");
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue (value);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setIdle_Z, __args);
			}
		}

		static Delegate cb_processFrameYV12_IIarrayB;
#pragma warning disable 0169
		static Delegate GetProcessFrameYV12_IIarrayBHandler ()
		{
			if (cb_processFrameYV12_IIarrayB == null)
				cb_processFrameYV12_IIarrayB = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPIIL_I) n_ProcessFrameYV12_IIarrayB);
			return cb_processFrameYV12_IIarrayB;
		}

		static int n_ProcessFrameYV12_IIarrayB (IntPtr jnienv, IntPtr native__this, int p0, int p1, IntPtr native_p2)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p2 = (byte[]) JNIEnv.GetArray (native_p2, JniHandleOwnership.DoNotTransfer, typeof (byte));
			int __ret = __this.ProcessFrameYV12 (p0, p1, p2);
			if (p2 != null)
				JNIEnv.CopyArray (p2, native_p2);
			return __ret;
		}
#pragma warning restore 0169

		IntPtr id_processFrameYV12_IIarrayB;
		public unsafe int ProcessFrameYV12 (int p0, int p1, byte[] p2)
		{
			if (id_processFrameYV12_IIarrayB == IntPtr.Zero)
				id_processFrameYV12_IIarrayB = JNIEnv.GetMethodID (class_ref, "processFrameYV12", "(II[B)I");
			IntPtr native_p2 = JNIEnv.NewArray (p2);
			JValue* __args = stackalloc JValue [3];
			__args [0] = new JValue (p0);
			__args [1] = new JValue (p1);
			__args [2] = new JValue (native_p2);
			var __ret = JNIEnv.CallIntMethod (((global::Java.Lang.Object) this).Handle, id_processFrameYV12_IIarrayB, __args);
			if (p2 != null) {
				JNIEnv.CopyArray (native_p2, p2);
				JNIEnv.DeleteLocalRef (native_p2);
			}
			return __ret;
		}

		static Delegate cb_resetResult;
#pragma warning disable 0169
		static Delegate GetResetResultHandler ()
		{
			if (cb_resetResult == null)
				cb_resetResult = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_ResetResult);
			return cb_resetResult;
		}

		static void n_ResetResult (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.ResetResult ();
		}
#pragma warning restore 0169

		IntPtr id_resetResult;
		public unsafe void ResetResult ()
		{
			if (id_resetResult == IntPtr.Zero)
				id_resetResult = JNIEnv.GetMethodID (class_ref, "resetResult", "()V");
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_resetResult);
		}

		static Delegate cb_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_;
#pragma warning disable 0169
		static Delegate GetSetDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_Handler ()
		{
			if (cb_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_ == null)
				cb_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_);
			return cb_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_;
		}

		static void n_SetDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration)global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetDisplayConfiguration (p0);
		}
#pragma warning restore 0169

		IntPtr id_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_;
		public unsafe void SetDisplayConfiguration (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration p0)
		{
			if (id_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_ == IntPtr.Zero)
				id_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_ = JNIEnv.GetMethodID (class_ref, "setDisplayConfiguration", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfiguration;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setDisplayConfiguration_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_DisplayConfiguration_, __args);
		}

		static Delegate cb_setRecognitionMode_I;
#pragma warning disable 0169
		static Delegate GetSetRecognitionMode_IHandler ()
		{
			if (cb_setRecognitionMode_I == null)
				cb_setRecognitionMode_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_V) n_SetRecognitionMode_I);
			return cb_setRecognitionMode_I;
		}

		static void n_SetRecognitionMode_I (IntPtr jnienv, IntPtr native__this, int p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetRecognitionMode (p0);
		}
#pragma warning restore 0169

		IntPtr id_setRecognitionMode_I;
		public unsafe void SetRecognitionMode (int p0)
		{
			if (id_setRecognitionMode_I == IntPtr.Zero)
				id_setRecognitionMode_I = JNIEnv.GetMethodID (class_ref, "setRecognitionMode", "(I)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (p0);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setRecognitionMode_I, __args);
		}

		static Delegate cb_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_;
#pragma warning disable 0169
		static Delegate GetSetStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_Handler ()
		{
			if (cb_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_ == null)
				cb_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_);
			return cb_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_;
		}

		static void n_SetStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener)global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetStatusListener (p0);
		}
#pragma warning restore 0169

		IntPtr id_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_;
		public unsafe void SetStatusListener (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListener p0)
		{
			if (id_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_ == IntPtr.Zero)
				id_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_ = JNIEnv.GetMethodID (class_ref, "setStatusListener", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionStatusListener;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setStatusListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionStatusListener_, __args);
		}

		static Delegate cb_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_;
#pragma warning disable 0169
		static Delegate GetSetTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_Handler ()
		{
			if (cb_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_ == null)
				cb_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_);
			return cb_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_;
		}

		static void n_SetTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListener)global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListener> (native_p0, JniHandleOwnership.DoNotTransfer);
			__this.SetTorchListener (p0);
		}
#pragma warning restore 0169

		IntPtr id_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_;
		public unsafe void SetTorchListener (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.ITorchStatusListener p0)
		{
			if (id_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_ == IntPtr.Zero)
				id_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_ = JNIEnv.GetMethodID (class_ref, "setTorchListener", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/TorchStatusListener;)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setTorchListener_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_TorchStatusListener_, __args);
		}

		static Delegate cb_setTorchStatus_Z;
#pragma warning disable 0169
		static Delegate GetSetTorchStatus_ZHandler ()
		{
			if (cb_setTorchStatus_Z == null)
				cb_setTorchStatus_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetTorchStatus_Z);
			return cb_setTorchStatus_Z;
		}

		static void n_SetTorchStatus_Z (IntPtr jnienv, IntPtr native__this, bool p0)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionCoreImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetTorchStatus (p0);
		}
#pragma warning restore 0169

		IntPtr id_setTorchStatus_Z;
		public unsafe void SetTorchStatus (bool p0)
		{
			if (id_setTorchStatus_Z == IntPtr.Zero)
				id_setTorchStatus_Z = JNIEnv.GetMethodID (class_ref, "setTorchStatus", "(Z)V");
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (p0);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_setTorchStatus_Z, __args);
		}

	}
}
