using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/DeviceInfoProvider", DoNotGenerateAcw=true)]
	public sealed partial class DeviceInfoProvider : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/DeviceInfoProvider", typeof (DeviceInfoProvider));

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

		internal DeviceInfoProvider (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/constructor[@name='DeviceInfoProvider' and count(parameter)=1 and parameter[1][@type='android.app.Activity']]"
		[Register (".ctor", "(Landroid/app/Activity;)V", "")]
		public unsafe DeviceInfoProvider (global::Android.App.Activity activity) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/app/Activity;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo DeviceInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='getDeviceInfo' and count(parameter)=0]"
			[Register ("getDeviceInfo", "()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;", "")]
			get {
				const string __id = "getDeviceInfo.()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string LocalIpAddress {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='getLocalIpAddress' and count(parameter)=0]"
			[Register ("getLocalIpAddress", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getLocalIpAddress.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='appLanguage' and count(parameter)=0]"
		[Register ("appLanguage", "()Ljava/lang/String;", "")]
		public unsafe string AppLanguage ()
		{
			const string __id = "appLanguage.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='appVersionCode' and count(parameter)=0]"
		[Register ("appVersionCode", "()Ljava/lang/Long;", "")]
		public unsafe global::Java.Lang.Long AppVersionCode ()
		{
			const string __id = "appVersionCode.()Ljava/lang/Long;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Long> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='carrierNames' and count(parameter)=0]"
		[Register ("carrierNames", "()Ljava/lang/String;", "")]
		public unsafe string CarrierNames ()
		{
			const string __id = "carrierNames.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='connectionType' and count(parameter)=0]"
		[Register ("connectionType", "()Ljava/lang/String;", "")]
		public unsafe string ConnectionType ()
		{
			const string __id = "connectionType.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='deviceId' and count(parameter)=0]"
		[Register ("deviceId", "()Ljava/lang/String;", "")]
		public unsafe string DeviceId ()
		{
			const string __id = "deviceId.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DeviceInfoProvider']/method[@name='os' and count(parameter)=0]"
		[Register ("os", "()Ljava/lang/String;", "")]
		public unsafe string Os ()
		{
			const string __id = "os.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
