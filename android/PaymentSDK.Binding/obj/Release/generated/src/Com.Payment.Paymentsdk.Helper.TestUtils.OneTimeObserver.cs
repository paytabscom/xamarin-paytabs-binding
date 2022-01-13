using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.TestUtils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='OneTimeObserver']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/testUtils/OneTimeObserver", DoNotGenerateAcw=true)]
	[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
	public sealed partial class OneTimeObserver : global::Java.Lang.Object, global::AndroidX.Lifecycle.ILifecycleOwner, global::AndroidX.Lifecycle.IObserver {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/testUtils/OneTimeObserver", typeof (OneTimeObserver));

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

		internal OneTimeObserver (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='OneTimeObserver']/constructor[@name='OneTimeObserver' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.functions.Function1&lt;? super T, kotlin.Unit&gt;']]"
		[Register (".ctor", "(Lkotlin/jvm/functions/Function1;)V", "")]
		public unsafe OneTimeObserver (global::Kotlin.Jvm.Functions.IFunction1 handler) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lkotlin/jvm/functions/Function1;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((handler == null) ? IntPtr.Zero : ((global::Java.Lang.Object) handler).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (handler);
			}
		}

		public unsafe global::AndroidX.Lifecycle.Lifecycle Lifecycle {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='OneTimeObserver']/method[@name='getLifecycle' and count(parameter)=0]"
			[Register ("getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "")]
			get {
				const string __id = "getLifecycle.()Landroidx/lifecycle/Lifecycle;";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.Lifecycle> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='OneTimeObserver']/method[@name='onChanged' and count(parameter)=1 and parameter[1][@type='T']]"
		[Register ("onChanged", "(Ljava/lang/Object;)V", "")]
		public unsafe void OnChanged (global::Java.Lang.Object t)
		{
			const string __id = "onChanged.(Ljava/lang/Object;)V";
			IntPtr native_t = JNIEnv.ToLocalJniHandle (t);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_t);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_t);
				global::System.GC.KeepAlive (t);
			}
		}

	}
}
