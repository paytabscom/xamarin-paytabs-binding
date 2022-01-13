using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager", DoNotGenerateAcw=true)]
	public sealed partial class ScanManager : global::Java.Lang.Object {
		// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']"
		[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker")]
		public partial interface ICallbacks : IJavaObject, IJavaPeerable {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onAutoFocusComplete' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='java.lang.String']]"
			[Register ("onAutoFocusComplete", "(ZLjava/lang/String;)V", "GetOnAutoFocusComplete_ZLjava_lang_String_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnAutoFocusComplete (bool p0, string p1);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onAutoFocusMoving' and count(parameter)=2 and parameter[1][@type='boolean'] and parameter[2][@type='java.lang.String']]"
			[Register ("onAutoFocusMoving", "(ZLjava/lang/String;)V", "GetOnAutoFocusMoving_ZLjava_lang_String_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnAutoFocusMoving (bool p0, string p1);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onCameraOpened' and count(parameter)=1 and parameter[1][@type='android.hardware.Camera.Parameters']]"
			[Register ("onCameraOpened", "(Landroid/hardware/Camera$Parameters;)V", "GetOnCameraOpened_Landroid_hardware_Camera_Parameters_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnCameraOpened (global::Android.Hardware.Camera.Parameters p0);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onCardImageReceived' and count(parameter)=1 and parameter[1][@type='android.graphics.Bitmap']]"
			[Register ("onCardImageReceived", "(Landroid/graphics/Bitmap;)V", "GetOnCardImageReceived_Landroid_graphics_Bitmap_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnCardImageReceived (global::Android.Graphics.Bitmap p0);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onFpsReport' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("onFpsReport", "(Ljava/lang/String;)V", "GetOnFpsReport_Ljava_lang_String_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnFpsReport (string p0);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onOpenCameraError' and count(parameter)=1 and parameter[1][@type='java.lang.Exception']]"
			[Register ("onOpenCameraError", "(Ljava/lang/Exception;)V", "GetOnOpenCameraError_Ljava_lang_Exception_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnOpenCameraError (global::Java.Lang.Exception p0);

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/interface[@name='ScanManager.Callbacks']/method[@name='onRecognitionComplete' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult']]"
			[Register ("onRecognitionComplete", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V", "GetOnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager/ICallbacksInvoker, CardScanBindingLib")]
			void OnRecognitionComplete (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.RecognitionResult p0);

		}

		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks", DoNotGenerateAcw=true)]
		internal partial class ICallbacksInvoker : global::Java.Lang.Object, ICallbacks {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks", typeof (ICallbacksInvoker));

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

			public static ICallbacks GetObject (IntPtr handle, JniHandleOwnership transfer)
			{
				return global::Java.Lang.Object.GetObject<ICallbacks> (handle, transfer);
			}

			static IntPtr Validate (IntPtr handle)
			{
				if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
					throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks'.");
				return handle;
			}

			protected override void Dispose (bool disposing)
			{
				if (this.class_ref != IntPtr.Zero)
					JNIEnv.DeleteGlobalRef (this.class_ref);
				this.class_ref = IntPtr.Zero;
				base.Dispose (disposing);
			}

			public ICallbacksInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
			{
				IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
				this.class_ref = JNIEnv.NewGlobalRef (local_ref);
				JNIEnv.DeleteLocalRef (local_ref);
			}

			static Delegate cb_onAutoFocusComplete_ZLjava_lang_String_;
#pragma warning disable 0169
			static Delegate GetOnAutoFocusComplete_ZLjava_lang_String_Handler ()
			{
				if (cb_onAutoFocusComplete_ZLjava_lang_String_ == null)
					cb_onAutoFocusComplete_ZLjava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZL_V) n_OnAutoFocusComplete_ZLjava_lang_String_);
				return cb_onAutoFocusComplete_ZLjava_lang_String_;
			}

			static void n_OnAutoFocusComplete_ZLjava_lang_String_ (IntPtr jnienv, IntPtr native__this, bool p0, IntPtr native_p1)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p1 = JNIEnv.GetString (native_p1, JniHandleOwnership.DoNotTransfer);
				__this.OnAutoFocusComplete (p0, p1);
			}
#pragma warning restore 0169

			IntPtr id_onAutoFocusComplete_ZLjava_lang_String_;
			public unsafe void OnAutoFocusComplete (bool p0, string p1)
			{
				if (id_onAutoFocusComplete_ZLjava_lang_String_ == IntPtr.Zero)
					id_onAutoFocusComplete_ZLjava_lang_String_ = JNIEnv.GetMethodID (class_ref, "onAutoFocusComplete", "(ZLjava/lang/String;)V");
				IntPtr native_p1 = JNIEnv.NewString (p1);
				JValue* __args = stackalloc JValue [2];
				__args [0] = new JValue (p0);
				__args [1] = new JValue (native_p1);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAutoFocusComplete_ZLjava_lang_String_, __args);
				JNIEnv.DeleteLocalRef (native_p1);
			}

			static Delegate cb_onAutoFocusMoving_ZLjava_lang_String_;
#pragma warning disable 0169
			static Delegate GetOnAutoFocusMoving_ZLjava_lang_String_Handler ()
			{
				if (cb_onAutoFocusMoving_ZLjava_lang_String_ == null)
					cb_onAutoFocusMoving_ZLjava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZL_V) n_OnAutoFocusMoving_ZLjava_lang_String_);
				return cb_onAutoFocusMoving_ZLjava_lang_String_;
			}

			static void n_OnAutoFocusMoving_ZLjava_lang_String_ (IntPtr jnienv, IntPtr native__this, bool p0, IntPtr native_p1)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p1 = JNIEnv.GetString (native_p1, JniHandleOwnership.DoNotTransfer);
				__this.OnAutoFocusMoving (p0, p1);
			}
#pragma warning restore 0169

			IntPtr id_onAutoFocusMoving_ZLjava_lang_String_;
			public unsafe void OnAutoFocusMoving (bool p0, string p1)
			{
				if (id_onAutoFocusMoving_ZLjava_lang_String_ == IntPtr.Zero)
					id_onAutoFocusMoving_ZLjava_lang_String_ = JNIEnv.GetMethodID (class_ref, "onAutoFocusMoving", "(ZLjava/lang/String;)V");
				IntPtr native_p1 = JNIEnv.NewString (p1);
				JValue* __args = stackalloc JValue [2];
				__args [0] = new JValue (p0);
				__args [1] = new JValue (native_p1);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onAutoFocusMoving_ZLjava_lang_String_, __args);
				JNIEnv.DeleteLocalRef (native_p1);
			}

			static Delegate cb_onCameraOpened_Landroid_hardware_Camera_Parameters_;
#pragma warning disable 0169
			static Delegate GetOnCameraOpened_Landroid_hardware_Camera_Parameters_Handler ()
			{
				if (cb_onCameraOpened_Landroid_hardware_Camera_Parameters_ == null)
					cb_onCameraOpened_Landroid_hardware_Camera_Parameters_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnCameraOpened_Landroid_hardware_Camera_Parameters_);
				return cb_onCameraOpened_Landroid_hardware_Camera_Parameters_;
			}

			static void n_OnCameraOpened_Landroid_hardware_Camera_Parameters_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p0 = global::Java.Lang.Object.GetObject<global::Android.Hardware.Camera.Parameters> (native_p0, JniHandleOwnership.DoNotTransfer);
				__this.OnCameraOpened (p0);
			}
#pragma warning restore 0169

			IntPtr id_onCameraOpened_Landroid_hardware_Camera_Parameters_;
			public unsafe void OnCameraOpened (global::Android.Hardware.Camera.Parameters p0)
			{
				if (id_onCameraOpened_Landroid_hardware_Camera_Parameters_ == IntPtr.Zero)
					id_onCameraOpened_Landroid_hardware_Camera_Parameters_ = JNIEnv.GetMethodID (class_ref, "onCameraOpened", "(Landroid/hardware/Camera$Parameters;)V");
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onCameraOpened_Landroid_hardware_Camera_Parameters_, __args);
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
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
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

			static Delegate cb_onFpsReport_Ljava_lang_String_;
#pragma warning disable 0169
			static Delegate GetOnFpsReport_Ljava_lang_String_Handler ()
			{
				if (cb_onFpsReport_Ljava_lang_String_ == null)
					cb_onFpsReport_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnFpsReport_Ljava_lang_String_);
				return cb_onFpsReport_Ljava_lang_String_;
			}

			static void n_OnFpsReport_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p0 = JNIEnv.GetString (native_p0, JniHandleOwnership.DoNotTransfer);
				__this.OnFpsReport (p0);
			}
#pragma warning restore 0169

			IntPtr id_onFpsReport_Ljava_lang_String_;
			public unsafe void OnFpsReport (string p0)
			{
				if (id_onFpsReport_Ljava_lang_String_ == IntPtr.Zero)
					id_onFpsReport_Ljava_lang_String_ = JNIEnv.GetMethodID (class_ref, "onFpsReport", "(Ljava/lang/String;)V");
				IntPtr native_p0 = JNIEnv.NewString (p0);
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue (native_p0);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onFpsReport_Ljava_lang_String_, __args);
				JNIEnv.DeleteLocalRef (native_p0);
			}

			static Delegate cb_onOpenCameraError_Ljava_lang_Exception_;
#pragma warning disable 0169
			static Delegate GetOnOpenCameraError_Ljava_lang_Exception_Handler ()
			{
				if (cb_onOpenCameraError_Ljava_lang_Exception_ == null)
					cb_onOpenCameraError_Ljava_lang_Exception_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnOpenCameraError_Ljava_lang_Exception_);
				return cb_onOpenCameraError_Ljava_lang_Exception_;
			}

			static void n_OnOpenCameraError_Ljava_lang_Exception_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var p0 = global::Java.Lang.Object.GetObject<global::Java.Lang.Exception> (native_p0, JniHandleOwnership.DoNotTransfer);
				__this.OnOpenCameraError (p0);
			}
#pragma warning restore 0169

			IntPtr id_onOpenCameraError_Ljava_lang_Exception_;
			public unsafe void OnOpenCameraError (global::Java.Lang.Exception p0)
			{
				if (id_onOpenCameraError_Ljava_lang_Exception_ == IntPtr.Zero)
					id_onOpenCameraError_Ljava_lang_Exception_ = JNIEnv.GetMethodID (class_ref, "onOpenCameraError", "(Ljava/lang/Exception;)V");
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Throwable) p0).Handle);
				JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onOpenCameraError_Ljava_lang_Exception_, __args);
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
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
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

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager", typeof (ScanManager));

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

		internal ScanManager (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/constructor[@name='ScanManager' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout'] and parameter[3][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks']]"
		[Register (".ctor", "(Landroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CameraPreviewLayout;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks;)V", "")]
		public unsafe ScanManager (global::Android.Content.Context context, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.CameraPreviewLayout previewLayout, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks callbacks) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CameraPreviewLayout;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((previewLayout == null) ? IntPtr.Zero : ((global::Java.Lang.Object) previewLayout).Handle);
				__args [2] = new JniArgumentValue ((callbacks == null) ? IntPtr.Zero : ((global::Java.Lang.Object) callbacks).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (previewLayout);
				global::System.GC.KeepAlive (callbacks);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/constructor[@name='ScanManager' and count(parameter)=4 and parameter[1][@type='int'] and parameter[2][@type='android.content.Context'] and parameter[3][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget.CameraPreviewLayout'] and parameter[4][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManager.Callbacks']]"
		[Register (".ctor", "(ILandroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CameraPreviewLayout;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks;)V", "")]
		public unsafe ScanManager (int recognitionMode, global::Android.Content.Context context, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget.CameraPreviewLayout previewLayout, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManager.ICallbacks callbacks) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(ILandroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/widget/CameraPreviewLayout;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManager$Callbacks;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (recognitionMode);
				__args [1] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [2] = new JniArgumentValue ((previewLayout == null) ? IntPtr.Zero : ((global::Java.Lang.Object) previewLayout).Handle);
				__args [3] = new JniArgumentValue ((callbacks == null) ? IntPtr.Zero : ((global::Java.Lang.Object) callbacks).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (previewLayout);
				global::System.GC.KeepAlive (callbacks);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='freezeCameraPreview' and count(parameter)=0]"
		[Register ("freezeCameraPreview", "()V", "")]
		public unsafe void FreezeCameraPreview ()
		{
			const string __id = "freezeCameraPreview.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='onPause' and count(parameter)=0]"
		[Register ("onPause", "()V", "")]
		public unsafe void OnPause ()
		{
			const string __id = "onPause.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='onResume' and count(parameter)=0]"
		[Register ("onResume", "()V", "")]
		public unsafe void OnResume ()
		{
			const string __id = "onResume.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='resetResult' and count(parameter)=0]"
		[Register ("resetResult", "()V", "")]
		public unsafe void ResetResult ()
		{
			const string __id = "resetResult.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='resumeScan' and count(parameter)=0]"
		[Register ("resumeScan", "()V", "")]
		public unsafe void ResumeScan ()
		{
			const string __id = "resumeScan.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='setRecognitionCoreIdle' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setRecognitionCoreIdle", "(Z)V", "")]
		public unsafe void SetRecognitionCoreIdle (bool idle)
		{
			const string __id = "setRecognitionCoreIdle.(Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (idle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='toggleFlash' and count(parameter)=0]"
		[Register ("toggleFlash", "()V", "")]
		public unsafe void ToggleFlash ()
		{
			const string __id = "toggleFlash.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='ScanManager']/method[@name='unfreezeCameraPreview' and count(parameter)=0]"
		[Register ("unfreezeCameraPreview", "()V", "")]
		public unsafe void UnfreezeCameraPreview ()
		{
			const string __id = "unfreezeCameraPreview.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
