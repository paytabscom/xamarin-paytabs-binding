using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='DisplayConfiguration']"
	[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfiguration", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfigurationInvoker")]
	public partial interface IDisplayConfiguration : IJavaObject, IJavaPeerable {
		int NativeDisplayRotation {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='DisplayConfiguration']/method[@name='getNativeDisplayRotation' and count(parameter)=0]"
			[Register ("getNativeDisplayRotation", "()I", "GetGetNativeDisplayRotationHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfigurationInvoker, CardScanBindingLib")]
			get; 
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk']/interface[@name='DisplayConfiguration']/method[@name='getPreprocessFrameRotation' and count(parameter)=2 and parameter[1][@type='int'] and parameter[2][@type='int']]"
		[Register ("getPreprocessFrameRotation", "(II)I", "GetGetPreprocessFrameRotation_IIHandler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfigurationInvoker, CardScanBindingLib")]
		int GetPreprocessFrameRotation (int p0, int p1);

	}

	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfiguration", DoNotGenerateAcw=true)]
	internal partial class IDisplayConfigurationInvoker : global::Java.Lang.Object, IDisplayConfiguration {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/DisplayConfiguration", typeof (IDisplayConfigurationInvoker));

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

		public static IDisplayConfiguration GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<IDisplayConfiguration> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.DisplayConfiguration'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public IDisplayConfigurationInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.NativeDisplayRotation;
		}
#pragma warning restore 0169

		IntPtr id_getNativeDisplayRotation;
		public unsafe int NativeDisplayRotation {
			get {
				if (id_getNativeDisplayRotation == IntPtr.Zero)
					id_getNativeDisplayRotation = JNIEnv.GetMethodID (class_ref, "getNativeDisplayRotation", "()I");
				return JNIEnv.CallIntMethod (((global::Java.Lang.Object) this).Handle, id_getNativeDisplayRotation);
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

		static int n_GetPreprocessFrameRotation_II (IntPtr jnienv, IntPtr native__this, int p0, int p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IDisplayConfiguration> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.GetPreprocessFrameRotation (p0, p1);
		}
#pragma warning restore 0169

		IntPtr id_getPreprocessFrameRotation_II;
		public unsafe int GetPreprocessFrameRotation (int p0, int p1)
		{
			if (id_getPreprocessFrameRotation_II == IntPtr.Zero)
				id_getPreprocessFrameRotation_II = JNIEnv.GetMethodID (class_ref, "getPreprocessFrameRotation", "(II)I");
			JValue* __args = stackalloc JValue [2];
			__args [0] = new JValue (p0);
			__args [1] = new JValue (p1);
			return JNIEnv.CallIntMethod (((global::Java.Lang.Object) this).Handle, id_getPreprocessFrameRotation_II, __args);
		}

	}
}
