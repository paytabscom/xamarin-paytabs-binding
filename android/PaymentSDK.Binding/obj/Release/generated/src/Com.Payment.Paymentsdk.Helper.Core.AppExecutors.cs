using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Core {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='AppExecutors']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/core/AppExecutors", DoNotGenerateAcw=true)]
	public partial class AppExecutors : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/core/AppExecutors", typeof (AppExecutors));

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

		protected AppExecutors (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='AppExecutors']/constructor[@name='AppExecutors' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe AppExecutors () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_diskIO;
#pragma warning disable 0169
		static Delegate GetDiskIOHandler ()
		{
			if (cb_diskIO == null)
				cb_diskIO = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_DiskIO);
			return cb_diskIO;
		}

		static IntPtr n_DiskIO (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Core.AppExecutors> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.DiskIO ());
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='AppExecutors']/method[@name='diskIO' and count(parameter)=0]"
		[Register ("diskIO", "()Ljava/util/concurrent/Executor;", "GetDiskIOHandler")]
		public virtual unsafe global::Java.Util.Concurrent.IExecutor DiskIO ()
		{
			const string __id = "diskIO.()Ljava/util/concurrent/Executor;";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Util.Concurrent.IExecutor> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_mainThread;
#pragma warning disable 0169
		static Delegate GetMainThreadHandler ()
		{
			if (cb_mainThread == null)
				cb_mainThread = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_MainThread);
			return cb_mainThread;
		}

		static IntPtr n_MainThread (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Core.AppExecutors> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.MainThread ());
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='AppExecutors']/method[@name='mainThread' and count(parameter)=0]"
		[Register ("mainThread", "()Ljava/util/concurrent/Executor;", "GetMainThreadHandler")]
		public virtual unsafe global::Java.Util.Concurrent.IExecutor MainThread ()
		{
			const string __id = "mainThread.()Ljava/util/concurrent/Executor;";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Util.Concurrent.IExecutor> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		static Delegate cb_networkIO;
#pragma warning disable 0169
		static Delegate GetNetworkIOHandler ()
		{
			if (cb_networkIO == null)
				cb_networkIO = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_NetworkIO);
			return cb_networkIO;
		}

		static IntPtr n_NetworkIO (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Core.AppExecutors> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.ToLocalJniHandle (__this.NetworkIO ());
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.core']/class[@name='AppExecutors']/method[@name='networkIO' and count(parameter)=0]"
		[Register ("networkIO", "()Ljava/util/concurrent/Executor;", "GetNetworkIOHandler")]
		public virtual unsafe global::Java.Util.Concurrent.IExecutor NetworkIO ()
		{
			const string __id = "networkIO.()Ljava/util/concurrent/Executor;";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Util.Concurrent.IExecutor> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
