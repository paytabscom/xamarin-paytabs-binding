using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/BuildConfig", DoNotGenerateAcw=true)]
	public sealed partial class BuildConfig : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='APPLICATION_ID']"
		[Register ("APPLICATION_ID")]
		[Obsolete ("deprecated")]
		public const string ApplicationId = (string) "com.payment.paymentsdk";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='BASE_URL']"
		[Register ("BASE_URL")]
		public const string BaseUrl = (string) "https://secure.paytabs.com";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='BUILD_TYPE']"
		[Register ("BUILD_TYPE")]
		public const string BuildType = (string) "debug";


		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='DEBUG']"
		[Register ("DEBUG")]
		public static bool Debug {
			get {
				const string __id = "DEBUG.Z";

				var __v = _members.StaticFields.GetBooleanValue (__id);
				return __v;
			}
		}

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='FLAVOR']"
		[Register ("FLAVOR")]
		public const string Flavor = (string) "";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='LIBRARY_PACKAGE_NAME']"
		[Register ("LIBRARY_PACKAGE_NAME")]
		public const string LibraryPackageName = (string) "com.payment.paymentsdk";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='VERSION_CODE']"
		[Register ("VERSION_CODE")]
		public const int VersionCode = (int) 1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='VERSION_NAME']"
		[Register ("VERSION_NAME")]
		public const string VersionName = (string) "6.1.5";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/field[@name='VERSION_NUMBER']"
		[Register ("VERSION_NUMBER")]
		public const string VersionNumber = (string) "6.1.2";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/BuildConfig", typeof (BuildConfig));

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

		internal BuildConfig (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='BuildConfig']/constructor[@name='BuildConfig' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe BuildConfig () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	}
}
