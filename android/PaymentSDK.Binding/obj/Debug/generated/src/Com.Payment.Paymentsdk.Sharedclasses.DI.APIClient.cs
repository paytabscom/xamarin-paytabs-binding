using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.DI {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.di']/class[@name='APIClient']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/di/APIClient", DoNotGenerateAcw=true)]
	public sealed partial class APIClient : global::Java.Lang.Object {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.di']/class[@name='APIClient']/field[@name='INSTANCE']"
		[Register ("INSTANCE")]
		public static global::Com.Payment.Paymentsdk.Sharedclasses.DI.APIClient Instance {
			get {
				const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/di/APIClient;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.DI.APIClient> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.di']/class[@name='APIClient.WhenMappings']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/di/APIClient$WhenMappings", DoNotGenerateAcw=true)]
		public sealed partial class WhenMappings : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/di/APIClient$WhenMappings", typeof (WhenMappings));

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

			internal WhenMappings (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/di/APIClient", typeof (APIClient));

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

		internal APIClient (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
