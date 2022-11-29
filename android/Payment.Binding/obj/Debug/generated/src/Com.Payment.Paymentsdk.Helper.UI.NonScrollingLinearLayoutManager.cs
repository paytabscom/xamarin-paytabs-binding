using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.UI {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.ui']/class[@name='NonScrollingLinearLayoutManager']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/ui/NonScrollingLinearLayoutManager", DoNotGenerateAcw=true)]
	public sealed partial class NonScrollingLinearLayoutManager : global::AndroidX.RecyclerView.Widget.LinearLayoutManager {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/ui/NonScrollingLinearLayoutManager", typeof (NonScrollingLinearLayoutManager));

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

		internal NonScrollingLinearLayoutManager (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
