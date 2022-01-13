using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Livedata {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='SingleLiveEvent']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/livedata/SingleLiveEvent", DoNotGenerateAcw=true)]
	[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
	public partial class SingleLiveEvent : global::AndroidX.Lifecycle.MutableLiveData {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/livedata/SingleLiveEvent", typeof (SingleLiveEvent));

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

		protected SingleLiveEvent (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='SingleLiveEvent']/constructor[@name='SingleLiveEvent' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe SingleLiveEvent () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_call;
#pragma warning disable 0169
		static Delegate GetCallHandler ()
		{
			if (cb_call == null)
				cb_call = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_Call);
			return cb_call;
		}

		static void n_Call (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Call ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='SingleLiveEvent']/method[@name='call' and count(parameter)=0]"
		[Register ("call", "()V", "GetCallHandler")]
		public virtual unsafe void Call ()
		{
			const string __id = "call.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		static Delegate cb_observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_;
#pragma warning disable 0169
		static Delegate GetObserve_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_Handler ()
		{
			if (cb_observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_ == null)
				cb_observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_V) n_Observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_);
			return cb_observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_;
		}

		static void n_Observe_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_ (IntPtr jnienv, IntPtr native__this, IntPtr native_owner, IntPtr native_observer)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var owner = (global::AndroidX.Lifecycle.ILifecycleOwner)global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.ILifecycleOwner> (native_owner, JniHandleOwnership.DoNotTransfer);
			var observer = (global::AndroidX.Lifecycle.IObserver)global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.IObserver> (native_observer, JniHandleOwnership.DoNotTransfer);
			__this.Observe (owner, observer);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='SingleLiveEvent']/method[@name='observe' and count(parameter)=2 and parameter[1][@type='androidx.lifecycle.LifecycleOwner'] and parameter[2][@type='androidx.lifecycle.Observer&lt;? super T&gt;']]"
		[Register ("observe", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "GetObserve_Landroidx_lifecycle_LifecycleOwner_Landroidx_lifecycle_Observer_Handler")]
		public override unsafe void Observe (global::AndroidX.Lifecycle.ILifecycleOwner owner, global::AndroidX.Lifecycle.IObserver observer)
		{
			const string __id = "observe.(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((owner == null) ? IntPtr.Zero : ((global::Java.Lang.Object) owner).Handle);
				__args [1] = new JniArgumentValue ((observer == null) ? IntPtr.Zero : ((global::Java.Lang.Object) observer).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (owner);
				global::System.GC.KeepAlive (observer);
			}
		}

		static Delegate cb_setValue_Ljava_lang_Object_;
#pragma warning disable 0169
		static Delegate GetSetValue_Ljava_lang_Object_Handler ()
		{
			if (cb_setValue_Ljava_lang_Object_ == null)
				cb_setValue_Ljava_lang_Object_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetValue_Ljava_lang_Object_);
			return cb_setValue_Ljava_lang_Object_;
		}

		static void n_SetValue_Ljava_lang_Object_ (IntPtr jnienv, IntPtr native__this, IntPtr native_t)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var t = global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (native_t, JniHandleOwnership.DoNotTransfer);
			__this.SetValue (t);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.livedata']/class[@name='SingleLiveEvent']/method[@name='setValue' and count(parameter)=1 and parameter[1][@type='T']]"
		[Register ("setValue", "(Ljava/lang/Object;)V", "GetSetValue_Ljava_lang_Object_Handler")]
		public override unsafe void SetValue (global::Java.Lang.Object t)
		{
			const string __id = "setValue.(Ljava/lang/Object;)V";
			IntPtr native_t = JNIEnv.ToLocalJniHandle (t);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_t);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_t);
				global::System.GC.KeepAlive (t);
			}
		}

	}
}
