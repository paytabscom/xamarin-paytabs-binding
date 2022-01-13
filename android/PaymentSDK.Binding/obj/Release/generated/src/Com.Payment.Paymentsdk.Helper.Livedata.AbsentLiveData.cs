using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Livedata {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='AbsentLiveData']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/livedata/AbsentLiveData", DoNotGenerateAcw=true)]
	public partial class AbsentLiveData : global::AndroidX.Lifecycle.LiveData {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/livedata/AbsentLiveData", typeof (AbsentLiveData));

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

		protected AbsentLiveData (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='AbsentLiveData']/method[@name='create' and count(parameter)=0]"
		[Register ("create", "()Landroidx/lifecycle/LiveData;", "")]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
		public static unsafe global::AndroidX.Lifecycle.LiveData Create ()
		{
			const string __id = "create.()Landroidx/lifecycle/LiveData;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.LiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
