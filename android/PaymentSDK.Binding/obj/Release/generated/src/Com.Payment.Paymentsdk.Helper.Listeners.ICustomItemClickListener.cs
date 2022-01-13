using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Listeners {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.helper.listeners']/interface[@name='CustomItemClickListener']"
	[Register ("com/payment/paymentsdk/helper/listeners/CustomItemClickListener", "", "Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListenerInvoker")]
	[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
	public partial interface ICustomItemClickListener : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.listeners']/interface[@name='CustomItemClickListener']/method[@name='onClick' and count(parameter)=1 and parameter[1][@type='T']]"
		[Register ("onClick", "(Ljava/lang/Object;)V", "GetOnClick_Ljava_lang_Object_Handler:Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListenerInvoker, PaymentSDK.Binding")]
		void OnClick (global::Java.Lang.Object t);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/listeners/CustomItemClickListener", DoNotGenerateAcw=true)]
	internal partial class ICustomItemClickListenerInvoker : global::Java.Lang.Object, ICustomItemClickListener {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/listeners/CustomItemClickListener", typeof (ICustomItemClickListenerInvoker));

		static IntPtr java_class_ref {
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
			get { return class_ref; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

		IntPtr class_ref;

		public static ICustomItemClickListener GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<ICustomItemClickListener> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.helper.listeners.CustomItemClickListener'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public ICustomItemClickListenerInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_onClick_Ljava_lang_Object_;
#pragma warning disable 0169
		static Delegate GetOnClick_Ljava_lang_Object_Handler ()
		{
			if (cb_onClick_Ljava_lang_Object_ == null)
				cb_onClick_Ljava_lang_Object_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_OnClick_Ljava_lang_Object_);
			return cb_onClick_Ljava_lang_Object_;
		}

		static void n_OnClick_Ljava_lang_Object_ (IntPtr jnienv, IntPtr native__this, IntPtr native_t)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListener> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var t = global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (native_t, JniHandleOwnership.DoNotTransfer);
			__this.OnClick (t);
		}
#pragma warning restore 0169

		IntPtr id_onClick_Ljava_lang_Object_;
		public unsafe void OnClick (global::Java.Lang.Object t)
		{
			if (id_onClick_Ljava_lang_Object_ == IntPtr.Zero)
				id_onClick_Ljava_lang_Object_ = JNIEnv.GetMethodID (class_ref, "onClick", "(Ljava/lang/Object;)V");
			IntPtr native_t = JNIEnv.ToLocalJniHandle (t);
			JValue* __args = stackalloc JValue [1];
			__args [0] = new JValue (native_t);
			JNIEnv.CallVoidMethod (((global::Java.Lang.Object) this).Handle, id_onClick_Ljava_lang_Object_, __args);
			JNIEnv.DeleteLocalRef (native_t);
		}

	}

	// event args for com.payment.paymentsdk.helper.listeners.CustomItemClickListener.onClick
	public partial class CustomItemClickEventArgs : global::System.EventArgs {
		public CustomItemClickEventArgs (global::Java.Lang.Object t)
		{
			this.t = t;
		}

		global::Java.Lang.Object t;

		public global::Java.Lang.Object T {
			get { return t; }
		}

	}

	[global::Android.Runtime.Register ("mono/com/payment/paymentsdk/helper/listeners/CustomItemClickListenerImplementor")]
	internal sealed partial class ICustomItemClickListenerImplementor : global::Java.Lang.Object, ICustomItemClickListener {

		object sender;

		public ICustomItemClickListenerImplementor (object sender) : base (global::Android.Runtime.JNIEnv.StartCreateInstance ("mono/com/payment/paymentsdk/helper/listeners/CustomItemClickListenerImplementor", "()V"), JniHandleOwnership.TransferLocalRef)
		{
			global::Android.Runtime.JNIEnv.FinishCreateInstance (((global::Java.Lang.Object) this).Handle, "()V");
			this.sender = sender;
		}

		#pragma warning disable 0649
		public EventHandler<CustomItemClickEventArgs> Handler;
		#pragma warning restore 0649

		public void OnClick (global::Java.Lang.Object t)
		{
			var __h = Handler;
			if (__h != null)
				__h (sender, new CustomItemClickEventArgs (t));
		}

		internal static bool __IsEmpty (ICustomItemClickListenerImplementor value)
		{
			return value.Handler == null;
		}

	}
}
