using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfigurationImpl", DoNotGenerateAcw=true)]
	public partial class DisplayConfigurationImpl : global::Java.Lang.Object, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfigurationImpl", typeof (DisplayConfigurationImpl));

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

		protected DisplayConfigurationImpl (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']/constructor[@name='DisplayConfigurationImpl' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe DisplayConfigurationImpl () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "()V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), null);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, null);
			} finally {
			}
		}

		static Delegate cb_getNativeDisplayRotation;
#pragma warning disable 0169
		static Delegate GetGetNativeDisplayRotationHandler ()
		{
			if (cb_getNativeDisplayRotation == null)
				cb_getNativeDisplayRotation = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_I) n_GetNativeDisplayRotation);
			return cb_getNativeDisplayRotation;
		}

		static int n_GetNativeDisplayRotation (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.DisplayConfigurationImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.NativeDisplayRotation;
		}
#pragma warning restore 0169

		public virtual unsafe int NativeDisplayRotation {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']/method[@name='getNativeDisplayRotation' and count(parameter)=0]"
			[Register ("getNativeDisplayRotation", "()I", "GetGetNativeDisplayRotationHandler")]
			get {
				const string __id = "getNativeDisplayRotation.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		static Delegate cb_getPreprocessFrameRotation_II;
#pragma warning disable 0169
		static Delegate GetGetPreprocessFrameRotation_IIHandler ()
		{
			if (cb_getPreprocessFrameRotation_II == null)
				cb_getPreprocessFrameRotation_II = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPII_I) n_GetPreprocessFrameRotation_II);
			return cb_getPreprocessFrameRotation_II;
		}

		static int n_GetPreprocessFrameRotation_II (IntPtr jnienv, IntPtr native__this, int frameWidth, int frameHeight)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.DisplayConfigurationImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.GetPreprocessFrameRotation (frameWidth, frameHeight);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']/method[@name='getPreprocessFrameRotation' and count(parameter)=2 and parameter[1][@type='int'] and parameter[2][@type='int']]"
		[Register ("getPreprocessFrameRotation", "(II)I", "GetGetPreprocessFrameRotation_IIHandler")]
		public virtual unsafe int GetPreprocessFrameRotation (int frameWidth, int frameHeight)
		{
			const string __id = "getPreprocessFrameRotation.(II)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (frameWidth);
				__args [1] = new JniArgumentValue (frameHeight);
				var __rm = _members.InstanceMethods.InvokeVirtualInt32Method (__id, this, __args);
				return __rm;
			} finally {
			}
		}

		static Delegate cb_setCameraParameters_I;
#pragma warning disable 0169
		static Delegate GetSetCameraParameters_IHandler ()
		{
			if (cb_setCameraParameters_I == null)
				cb_setCameraParameters_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPI_V) n_SetCameraParameters_I);
			return cb_setCameraParameters_I;
		}

		static void n_SetCameraParameters_I (IntPtr jnienv, IntPtr native__this, int sensorRotation)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.DisplayConfigurationImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetCameraParameters (sensorRotation);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']/method[@name='setCameraParameters' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("setCameraParameters", "(I)V", "GetSetCameraParameters_IHandler")]
		public virtual unsafe void SetCameraParameters (int sensorRotation)
		{
			const string __id = "setCameraParameters.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (sensorRotation);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

		static Delegate cb_setDisplayParameters_Landroid_view_Display_;
#pragma warning disable 0169
		static Delegate GetSetDisplayParameters_Landroid_view_Display_Handler ()
		{
			if (cb_setDisplayParameters_Landroid_view_Display_ == null)
				cb_setDisplayParameters_Landroid_view_Display_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetDisplayParameters_Landroid_view_Display_);
			return cb_setDisplayParameters_Landroid_view_Display_;
		}

		static void n_SetDisplayParameters_Landroid_view_Display_ (IntPtr jnienv, IntPtr native__this, IntPtr native_display)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.DisplayConfigurationImpl> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var display = global::Java.Lang.Object.GetObject<global::Android.Views.Display> (native_display, JniHandleOwnership.DoNotTransfer);
			__this.SetDisplayParameters (display);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/class[@name='DisplayConfigurationImpl']/method[@name='setDisplayParameters' and count(parameter)=1 and parameter[1][@type='android.view.Display']]"
		[Register ("setDisplayParameters", "(Landroid/view/Display;)V", "GetSetDisplayParameters_Landroid_view_Display_Handler")]
		public virtual unsafe void SetDisplayParameters (global::Android.Views.Display display)
		{
			const string __id = "setDisplayParameters.(Landroid/view/Display;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((display == null) ? IntPtr.Zero : ((global::Java.Lang.Object) display).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (display);
			}
		}

	}
}
