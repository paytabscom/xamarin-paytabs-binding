using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='DefaultValuesKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/DefaultValuesKt", DoNotGenerateAcw=true)]
	public sealed partial class DefaultValuesKt : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='DefaultValuesKt']/field[@name='REDIRECT_URL']"
		[Register ("REDIRECT_URL")]
		public const string RedirectUrl = (string) "none";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='DefaultValuesKt']/field[@name='SERVER_IP']"
		[Register ("SERVER_IP")]
		public const string ServerIp = (string) "255.255.255.255";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/DefaultValuesKt", typeof (DefaultValuesKt));

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

		internal DefaultValuesKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		public static unsafe string RETURN_URL {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses']/class[@name='DefaultValuesKt']/method[@name='getRETURN_URL' and count(parameter)=0]"
			[Register ("getRETURN_URL", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getRETURN_URL.()Ljava/lang/String;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

	}
}
