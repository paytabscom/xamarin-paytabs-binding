using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Request {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo", DoNotGenerateAcw=true)]
	public sealed partial class PtDeviceInfo : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo", typeof (PtDeviceInfo));

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

		internal PtDeviceInfo (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/constructor[@name='PtDeviceInfo' and count(parameter)=16 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='java.lang.String'] and parameter[16][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe PtDeviceInfo (string deviceId, string appId, string platform, string brand, string model, string carrier, string os, string version, string app_version, string sdk_version, string timestamp, string screenWidth, string screenHeight, string appLanguage, string deviceLanguage, string connection) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_deviceId = JNIEnv.NewString (deviceId);
			IntPtr native_appId = JNIEnv.NewString (appId);
			IntPtr native_platform = JNIEnv.NewString (platform);
			IntPtr native_brand = JNIEnv.NewString (brand);
			IntPtr native_model = JNIEnv.NewString (model);
			IntPtr native_carrier = JNIEnv.NewString (carrier);
			IntPtr native_os = JNIEnv.NewString (os);
			IntPtr native_version = JNIEnv.NewString (version);
			IntPtr native_app_version = JNIEnv.NewString (app_version);
			IntPtr native_sdk_version = JNIEnv.NewString (sdk_version);
			IntPtr native_timestamp = JNIEnv.NewString (timestamp);
			IntPtr native_screenWidth = JNIEnv.NewString (screenWidth);
			IntPtr native_screenHeight = JNIEnv.NewString (screenHeight);
			IntPtr native_appLanguage = JNIEnv.NewString (appLanguage);
			IntPtr native_deviceLanguage = JNIEnv.NewString (deviceLanguage);
			IntPtr native_connection = JNIEnv.NewString (connection);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [16];
				__args [0] = new JniArgumentValue (native_deviceId);
				__args [1] = new JniArgumentValue (native_appId);
				__args [2] = new JniArgumentValue (native_platform);
				__args [3] = new JniArgumentValue (native_brand);
				__args [4] = new JniArgumentValue (native_model);
				__args [5] = new JniArgumentValue (native_carrier);
				__args [6] = new JniArgumentValue (native_os);
				__args [7] = new JniArgumentValue (native_version);
				__args [8] = new JniArgumentValue (native_app_version);
				__args [9] = new JniArgumentValue (native_sdk_version);
				__args [10] = new JniArgumentValue (native_timestamp);
				__args [11] = new JniArgumentValue (native_screenWidth);
				__args [12] = new JniArgumentValue (native_screenHeight);
				__args [13] = new JniArgumentValue (native_appLanguage);
				__args [14] = new JniArgumentValue (native_deviceLanguage);
				__args [15] = new JniArgumentValue (native_connection);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_deviceId);
				JNIEnv.DeleteLocalRef (native_appId);
				JNIEnv.DeleteLocalRef (native_platform);
				JNIEnv.DeleteLocalRef (native_brand);
				JNIEnv.DeleteLocalRef (native_model);
				JNIEnv.DeleteLocalRef (native_carrier);
				JNIEnv.DeleteLocalRef (native_os);
				JNIEnv.DeleteLocalRef (native_version);
				JNIEnv.DeleteLocalRef (native_app_version);
				JNIEnv.DeleteLocalRef (native_sdk_version);
				JNIEnv.DeleteLocalRef (native_timestamp);
				JNIEnv.DeleteLocalRef (native_screenWidth);
				JNIEnv.DeleteLocalRef (native_screenHeight);
				JNIEnv.DeleteLocalRef (native_appLanguage);
				JNIEnv.DeleteLocalRef (native_deviceLanguage);
				JNIEnv.DeleteLocalRef (native_connection);
			}
		}

		public unsafe string AppId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getAppId' and count(parameter)=0]"
			[Register ("getAppId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getAppId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string AppLanguage {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getAppLanguage' and count(parameter)=0]"
			[Register ("getAppLanguage", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getAppLanguage.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string App_version {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getApp_version' and count(parameter)=0]"
			[Register ("getApp_version", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getApp_version.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Brand {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getBrand' and count(parameter)=0]"
			[Register ("getBrand", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getBrand.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Carrier {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getCarrier' and count(parameter)=0]"
			[Register ("getCarrier", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCarrier.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Connection {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getConnection' and count(parameter)=0]"
			[Register ("getConnection", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getConnection.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string DeviceId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getDeviceId' and count(parameter)=0]"
			[Register ("getDeviceId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getDeviceId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string DeviceLanguage {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getDeviceLanguage' and count(parameter)=0]"
			[Register ("getDeviceLanguage", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getDeviceLanguage.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Model {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getModel' and count(parameter)=0]"
			[Register ("getModel", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getModel.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Os {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getOs' and count(parameter)=0]"
			[Register ("getOs", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getOs.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Platform {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getPlatform' and count(parameter)=0]"
			[Register ("getPlatform", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPlatform.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ScreenHeight {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getScreenHeight' and count(parameter)=0]"
			[Register ("getScreenHeight", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getScreenHeight.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ScreenWidth {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getScreenWidth' and count(parameter)=0]"
			[Register ("getScreenWidth", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getScreenWidth.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Sdk_version {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getSdk_version' and count(parameter)=0]"
			[Register ("getSdk_version", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getSdk_version.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Timestamp {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getTimestamp' and count(parameter)=0]"
			[Register ("getTimestamp", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTimestamp.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Version {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='getVersion' and count(parameter)=0]"
			[Register ("getVersion", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getVersion.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Ljava/lang/String;", "")]
		public unsafe string Component1 ()
		{
			const string __id = "component1.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component10' and count(parameter)=0]"
		[Register ("component10", "()Ljava/lang/String;", "")]
		public unsafe string Component10 ()
		{
			const string __id = "component10.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component11' and count(parameter)=0]"
		[Register ("component11", "()Ljava/lang/String;", "")]
		public unsafe string Component11 ()
		{
			const string __id = "component11.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component12' and count(parameter)=0]"
		[Register ("component12", "()Ljava/lang/String;", "")]
		public unsafe string Component12 ()
		{
			const string __id = "component12.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component13' and count(parameter)=0]"
		[Register ("component13", "()Ljava/lang/String;", "")]
		public unsafe string Component13 ()
		{
			const string __id = "component13.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component14' and count(parameter)=0]"
		[Register ("component14", "()Ljava/lang/String;", "")]
		public unsafe string Component14 ()
		{
			const string __id = "component14.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component15' and count(parameter)=0]"
		[Register ("component15", "()Ljava/lang/String;", "")]
		public unsafe string Component15 ()
		{
			const string __id = "component15.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component16' and count(parameter)=0]"
		[Register ("component16", "()Ljava/lang/String;", "")]
		public unsafe string Component16 ()
		{
			const string __id = "component16.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Ljava/lang/String;", "")]
		public unsafe string Component2 ()
		{
			const string __id = "component2.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/lang/String;", "")]
		public unsafe string Component3 ()
		{
			const string __id = "component3.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Ljava/lang/String;", "")]
		public unsafe string Component4 ()
		{
			const string __id = "component4.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component5' and count(parameter)=0]"
		[Register ("component5", "()Ljava/lang/String;", "")]
		public unsafe string Component5 ()
		{
			const string __id = "component5.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component6' and count(parameter)=0]"
		[Register ("component6", "()Ljava/lang/String;", "")]
		public unsafe string Component6 ()
		{
			const string __id = "component6.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component7' and count(parameter)=0]"
		[Register ("component7", "()Ljava/lang/String;", "")]
		public unsafe string Component7 ()
		{
			const string __id = "component7.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Ljava/lang/String;", "")]
		public unsafe string Component8 ()
		{
			const string __id = "component8.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Ljava/lang/String;", "")]
		public unsafe string Component9 ()
		{
			const string __id = "component9.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.request']/class[@name='PtDeviceInfo']/method[@name='copy' and count(parameter)=16 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.String'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='java.lang.String'] and parameter[16][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo Copy (string deviceId, string appId, string platform, string brand, string model, string carrier, string os, string version, string app_version, string sdk_version, string timestamp, string screenWidth, string screenHeight, string appLanguage, string deviceLanguage, string connection)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;";
			IntPtr native_deviceId = JNIEnv.NewString (deviceId);
			IntPtr native_appId = JNIEnv.NewString (appId);
			IntPtr native_platform = JNIEnv.NewString (platform);
			IntPtr native_brand = JNIEnv.NewString (brand);
			IntPtr native_model = JNIEnv.NewString (model);
			IntPtr native_carrier = JNIEnv.NewString (carrier);
			IntPtr native_os = JNIEnv.NewString (os);
			IntPtr native_version = JNIEnv.NewString (version);
			IntPtr native_app_version = JNIEnv.NewString (app_version);
			IntPtr native_sdk_version = JNIEnv.NewString (sdk_version);
			IntPtr native_timestamp = JNIEnv.NewString (timestamp);
			IntPtr native_screenWidth = JNIEnv.NewString (screenWidth);
			IntPtr native_screenHeight = JNIEnv.NewString (screenHeight);
			IntPtr native_appLanguage = JNIEnv.NewString (appLanguage);
			IntPtr native_deviceLanguage = JNIEnv.NewString (deviceLanguage);
			IntPtr native_connection = JNIEnv.NewString (connection);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [16];
				__args [0] = new JniArgumentValue (native_deviceId);
				__args [1] = new JniArgumentValue (native_appId);
				__args [2] = new JniArgumentValue (native_platform);
				__args [3] = new JniArgumentValue (native_brand);
				__args [4] = new JniArgumentValue (native_model);
				__args [5] = new JniArgumentValue (native_carrier);
				__args [6] = new JniArgumentValue (native_os);
				__args [7] = new JniArgumentValue (native_version);
				__args [8] = new JniArgumentValue (native_app_version);
				__args [9] = new JniArgumentValue (native_sdk_version);
				__args [10] = new JniArgumentValue (native_timestamp);
				__args [11] = new JniArgumentValue (native_screenWidth);
				__args [12] = new JniArgumentValue (native_screenHeight);
				__args [13] = new JniArgumentValue (native_appLanguage);
				__args [14] = new JniArgumentValue (native_deviceLanguage);
				__args [15] = new JniArgumentValue (native_connection);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_deviceId);
				JNIEnv.DeleteLocalRef (native_appId);
				JNIEnv.DeleteLocalRef (native_platform);
				JNIEnv.DeleteLocalRef (native_brand);
				JNIEnv.DeleteLocalRef (native_model);
				JNIEnv.DeleteLocalRef (native_carrier);
				JNIEnv.DeleteLocalRef (native_os);
				JNIEnv.DeleteLocalRef (native_version);
				JNIEnv.DeleteLocalRef (native_app_version);
				JNIEnv.DeleteLocalRef (native_sdk_version);
				JNIEnv.DeleteLocalRef (native_timestamp);
				JNIEnv.DeleteLocalRef (native_screenWidth);
				JNIEnv.DeleteLocalRef (native_screenHeight);
				JNIEnv.DeleteLocalRef (native_appLanguage);
				JNIEnv.DeleteLocalRef (native_deviceLanguage);
				JNIEnv.DeleteLocalRef (native_connection);
			}
		}

	}
}
