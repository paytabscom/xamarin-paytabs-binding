using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker", DoNotGenerateAcw=true)]
	public sealed partial class RecognitionAvailabilityChecker : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/field[@name='TAG']"
		[Register ("TAG")]
		public const string Tag = (string) "CameraChecker";

		// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']"
		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result", DoNotGenerateAcw=true)]
		public partial class Result : global::Java.Lang.Object {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='hasCamera']"
			[Register ("hasCamera")]
			public int HasCamera {
				get {
					const string __id = "hasCamera.I";

					var __v = _members.InstanceFields.GetInt32Value (__id, this);
					return __v;
				}
				set {
					const string __id = "hasCamera.I";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='hasCameraPermission']"
			[Register ("hasCameraPermission")]
			public int HasCameraPermission {
				get {
					const string __id = "hasCameraPermission.I";

					var __v = _members.InstanceFields.GetInt32Value (__id, this);
					return __v;
				}
				set {
					const string __id = "hasCameraPermission.I";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='isBlockingCheck']"
			[Register ("isBlockingCheck")]
			public bool IsBlockingCheck {
				get {
					const string __id = "isBlockingCheck.Z";

					var __v = _members.InstanceFields.GetBooleanValue (__id, this);
					return __v;
				}
				set {
					const string __id = "isBlockingCheck.Z";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='isCameraSupported']"
			[Register ("isCameraSupported")]
			public int IsCameraSupported {
				get {
					const string __id = "isCameraSupported.I";

					var __v = _members.InstanceFields.GetInt32Value (__id, this);
					return __v;
				}
				set {
					const string __id = "isCameraSupported.I";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='isDeviceNewEnough']"
			[Register ("isDeviceNewEnough")]
			public int IsDeviceNewEnough {
				get {
					const string __id = "isDeviceNewEnough.I";

					var __v = _members.InstanceFields.GetInt32Value (__id, this);
					return __v;
				}
				set {
					const string __id = "isDeviceNewEnough.I";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}


			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='recognitionCoreSupported']"
			[Register ("recognitionCoreSupported")]
			public int RecognitionCoreSupported {
				get {
					const string __id = "recognitionCoreSupported.I";

					var __v = _members.InstanceFields.GetInt32Value (__id, this);
					return __v;
				}
				set {
					const string __id = "recognitionCoreSupported.I";

					try {
						_members.InstanceFields.SetValue (__id, this, value);
					} finally {
					}
				}
			}

			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='STATUS_FAILED']"
			[Register ("STATUS_FAILED")]
			public const int StatusFailed = (int) -1;

			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='STATUS_NOT_CHECKED']"
			[Register ("STATUS_NOT_CHECKED")]
			public const int StatusNotChecked = (int) 0;

			// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/field[@name='STATUS_PASSED']"
			[Register ("STATUS_PASSED")]
			public const int StatusPassed = (int) 1;

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result", typeof (Result));

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

			protected Result (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			static Delegate cb_isAdditionalCheckRequired;
#pragma warning disable 0169
			static Delegate GetIsAdditionalCheckRequiredHandler ()
			{
				if (cb_isAdditionalCheckRequired == null)
					cb_isAdditionalCheckRequired = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsAdditionalCheckRequired);
				return cb_isAdditionalCheckRequired;
			}

			static bool n_IsAdditionalCheckRequired (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return __this.IsAdditionalCheckRequired;
			}
#pragma warning restore 0169

			public virtual unsafe bool IsAdditionalCheckRequired {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/method[@name='isAdditionalCheckRequired' and count(parameter)=0]"
				[Register ("isAdditionalCheckRequired", "()Z", "GetIsAdditionalCheckRequiredHandler")]
				get {
					const string __id = "isAdditionalCheckRequired.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

			static Delegate cb_isFailed;
#pragma warning disable 0169
			static Delegate GetIsFailedHandler ()
			{
				if (cb_isFailed == null)
					cb_isFailed = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsFailed);
				return cb_isFailed;
			}

			static bool n_IsFailed (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return __this.IsFailed;
			}
#pragma warning restore 0169

			public virtual unsafe bool IsFailed {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/method[@name='isFailed' and count(parameter)=0]"
				[Register ("isFailed", "()Z", "GetIsFailedHandler")]
				get {
					const string __id = "isFailed.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

			static Delegate cb_isFailedOnCameraPermission;
#pragma warning disable 0169
			static Delegate GetIsFailedOnCameraPermissionHandler ()
			{
				if (cb_isFailedOnCameraPermission == null)
					cb_isFailedOnCameraPermission = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsFailedOnCameraPermission);
				return cb_isFailedOnCameraPermission;
			}

			static bool n_IsFailedOnCameraPermission (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return __this.IsFailedOnCameraPermission;
			}
#pragma warning restore 0169

			public virtual unsafe bool IsFailedOnCameraPermission {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/method[@name='isFailedOnCameraPermission' and count(parameter)=0]"
				[Register ("isFailedOnCameraPermission", "()Z", "GetIsFailedOnCameraPermissionHandler")]
				get {
					const string __id = "isFailedOnCameraPermission.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

			static Delegate cb_isPassed;
#pragma warning disable 0169
			static Delegate GetIsPassedHandler ()
			{
				if (cb_isPassed == null)
					cb_isPassed = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_Z) n_IsPassed);
				return cb_isPassed;
			}

			static bool n_IsPassed (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return __this.IsPassed;
			}
#pragma warning restore 0169

			public virtual unsafe bool IsPassed {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/method[@name='isPassed' and count(parameter)=0]"
				[Register ("isPassed", "()Z", "GetIsPassedHandler")]
				get {
					const string __id = "isPassed.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeVirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

			static Delegate cb_getMessage;
#pragma warning disable 0169
			static Delegate GetGetMessageHandler ()
			{
				if (cb_getMessage == null)
					cb_getMessage = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetMessage);
				return cb_getMessage;
			}

			static IntPtr n_GetMessage (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return JNIEnv.NewString (__this.Message);
			}
#pragma warning restore 0169

			public virtual unsafe string Message {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker.Result']/method[@name='getMessage' and count(parameter)=0]"
				[Register ("getMessage", "()Ljava/lang/String;", "GetGetMessageHandler")]
				get {
					const string __id = "getMessage.()Ljava/lang/String;";
					try {
						var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
						return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
					} finally {
					}
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker", typeof (RecognitionAvailabilityChecker));

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

		internal RecognitionAvailabilityChecker (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/constructor[@name='RecognitionAvailabilityChecker' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe RecognitionAvailabilityChecker () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/method[@name='doCheck' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("doCheck", "(Landroid/content/Context;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result;", "")]
		public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result DoCheck (global::Android.Content.Context context)
		{
			const string __id = "doCheck.(Landroid/content/Context;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/method[@name='doCheckBlocking' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("doCheckBlocking", "(Landroid/content/Context;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result;", "")]
		public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result DoCheckBlocking (global::Android.Content.Context context)
		{
			const string __id = "doCheckBlocking.(Landroid/content/Context;)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionAvailabilityChecker$Result;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.RecognitionAvailabilityChecker.Result> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/method[@name='isDeviceHasCamera' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isDeviceHasCamera", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsDeviceHasCamera (global::Android.Content.Context context)
		{
			const string __id = "isDeviceHasCamera.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionAvailabilityChecker']/method[@name='isDeviceNewEnough' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isDeviceNewEnough", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsDeviceNewEnough (global::Android.Content.Context context)
		{
			const string __id = "isDeviceNewEnough.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

	}
}
