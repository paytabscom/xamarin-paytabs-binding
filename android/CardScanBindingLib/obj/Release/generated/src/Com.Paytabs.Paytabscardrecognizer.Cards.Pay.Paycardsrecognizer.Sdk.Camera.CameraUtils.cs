using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils", DoNotGenerateAcw=true)]
	public sealed partial class CameraUtils : global::Java.Lang.Object {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/field[@name='CAMERA_RESOLUTION']"
		[Register ("CAMERA_RESOLUTION")]
		public static global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize CameraResolution {
			get {
				const string __id = "CAMERA_RESOLUTION.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']"
		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize", DoNotGenerateAcw=true)]
		public sealed partial class NativeSupportedSize : global::Java.Lang.Enum {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']/field[@name='RESOLUTION_1280_X_720']"
			[Register ("RESOLUTION_1280_X_720")]
			public static global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize Resolution1280X720 {
				get {
					const string __id = "RESOLUTION_1280_X_720.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']/field[@name='RESOLUTION_NO_CAMERA']"
			[Register ("RESOLUTION_NO_CAMERA")]
			public static global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize ResolutionNoCamera {
				get {
					const string __id = "RESOLUTION_NO_CAMERA.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']/field[@name='size']"
			[Register ("size")]
			public global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Utils.Size Size {
				get {
					const string __id = "size.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/Size;";

					var __v = _members.InstanceFields.GetObjectValue (__id, this);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Utils.Size> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
				set {
					const string __id = "size.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/Size;";

					IntPtr native_value = global::Android.Runtime.JNIEnv.ToLocalJniHandle (value);
					try {
						_members.InstanceFields.SetValue (__id, this, new JniObjectReference (native_value));
					} finally {
						global::Android.Runtime.JNIEnv.DeleteLocalRef (native_value);
					}
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize", typeof (NativeSupportedSize));

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

			internal NativeSupportedSize (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']/method[@name='valueOf' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("valueOf", "(Ljava/lang/String;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;", "")]
			public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize ValueOf (string name)
			{
				const string __id = "valueOf.(Ljava/lang/String;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";
				IntPtr native_name = JNIEnv.NewString (name);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_name);
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					JNIEnv.DeleteLocalRef (native_name);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils.NativeSupportedSize']/method[@name='values' and count(parameter)=0]"
			[Register ("values", "()[Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;", "")]
			public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize[] Values ()
			{
				const string __id = "values.()[Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize));
				} finally {
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils", typeof (CameraUtils));

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

		internal CameraUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/constructor[@name='CameraUtils' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe CameraUtils () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		public static unsafe global::Android.Hardware.Camera.CameraInfo BackCameraInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='getBackCameraInfo' and count(parameter)=0]"
			[Register ("getBackCameraInfo", "()Landroid/hardware/Camera$CameraInfo;", "")]
			get {
				const string __id = "getBackCameraInfo.()Landroid/hardware/Camera$CameraInfo;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Java.Lang.Object.GetObject<global::Android.Hardware.Camera.CameraInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public static unsafe int BackCameraSensorOrientation {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='getBackCameraSensorOrientation' and count(parameter)=0]"
			[Register ("getBackCameraSensorOrientation", "()I", "")]
			get {
				const string __id = "getBackCameraSensorOrientation.()I";
				try {
					var __rm = _members.StaticMethods.InvokeInt32Method (__id, null);
					return __rm;
				} finally {
				}
			}
		}

		public static unsafe bool IsCameraSupported {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='isCameraSupported' and count(parameter)=0]"
			[Register ("isCameraSupported", "()Z", "")]
			get {
				const string __id = "isCameraSupported.()Z";
				try {
					var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, null);
					return __rm;
				} finally {
				}
			}
		}

		public static unsafe bool IsCameraSupportedBlocking {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='isCameraSupportedBlocking' and count(parameter)=0]"
			[Register ("isCameraSupportedBlocking", "()Z", "")]
			get {
				const string __id = "isCameraSupportedBlocking.()Z";
				try {
					var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='findBestCameraSupportedSize' and count(parameter)=1 and parameter[1][@type='java.lang.Iterable&lt;android.hardware.Camera.Size&gt;']]"
		[Register ("findBestCameraSupportedSize", "(Ljava/lang/Iterable;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;", "")]
		public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize FindBestCameraSupportedSize (global::Java.Lang.IIterable previewSizes)
		{
			const string __id = "findBestCameraSupportedSize.(Ljava/lang/Iterable;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/CameraUtils$NativeSupportedSize;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((previewSizes == null) ? IntPtr.Zero : ((global::Java.Lang.Object) previewSizes).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.CameraUtils.NativeSupportedSize> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (previewSizes);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='generateBestCameraPreviewSize' and count(parameter)=0]"
		[Register ("generateBestCameraPreviewSize", "()V", "")]
		public static unsafe void GenerateBestCameraPreviewSize ()
		{
			const string __id = "generateBestCameraPreviewSize.()V";
			try {
				_members.StaticMethods.InvokeVoidMethod (__id, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='getBackCameraDataRotation' and count(parameter)=1 and parameter[1][@type='android.view.Display']]"
		[Register ("getBackCameraDataRotation", "(Landroid/view/Display;)I", "")]
		public static unsafe int GetBackCameraDataRotation (global::Android.Views.Display display)
		{
			const string __id = "getBackCameraDataRotation.(Landroid/view/Display;)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((display == null) ? IntPtr.Zero : ((global::Java.Lang.Object) display).Handle);
				var __rm = _members.StaticMethods.InvokeInt32Method (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (display);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='CameraUtils']/method[@name='getSupportedSizesDescription' and count(parameter)=1 and parameter[1][@type='java.util.List&lt;android.hardware.Camera.Size&gt;']]"
		[Register ("getSupportedSizesDescription", "(Ljava/util/List;)Ljava/lang/String;", "")]
		public static unsafe string GetSupportedSizesDescription (global::System.Collections.Generic.IList<global::Android.Hardware.Camera.Size> sizes)
		{
			const string __id = "getSupportedSizesDescription.(Ljava/util/List;)Ljava/lang/String;";
			IntPtr native_sizes = global::Android.Runtime.JavaList<global::Android.Hardware.Camera.Size>.ToLocalJniHandle (sizes);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_sizes);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_sizes);
				global::System.GC.KeepAlive (sizes);
			}
		}

	}
}
