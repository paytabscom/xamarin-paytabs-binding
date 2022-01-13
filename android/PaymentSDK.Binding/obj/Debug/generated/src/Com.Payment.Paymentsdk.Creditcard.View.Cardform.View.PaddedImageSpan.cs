using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='PaddedImageSpan']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/view/PaddedImageSpan", DoNotGenerateAcw=true)]
	public partial class PaddedImageSpan : global::Android.Text.Style.ImageSpan {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/view/PaddedImageSpan", typeof (PaddedImageSpan));

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

		protected PaddedImageSpan (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='PaddedImageSpan']/constructor[@name='PaddedImageSpan' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;I)V", "")]
		public unsafe PaddedImageSpan (global::Android.Content.Context context, int resourceId) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue (resourceId);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		static Delegate cb_setDisabled_Z;
#pragma warning disable 0169
		static Delegate GetSetDisabled_ZHandler ()
		{
			if (cb_setDisabled_Z == null)
				cb_setDisabled_Z = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZ_V) n_SetDisabled_Z);
			return cb_setDisabled_Z;
		}

		static void n_SetDisabled_Z (IntPtr jnienv, IntPtr native__this, bool disabled)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.View.PaddedImageSpan> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetDisabled (disabled);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.view']/class[@name='PaddedImageSpan']/method[@name='setDisabled' and count(parameter)=1 and parameter[1][@type='boolean']]"
		[Register ("setDisabled", "(Z)V", "GetSetDisabled_ZHandler")]
		public virtual unsafe void SetDisabled (bool disabled)
		{
			const string __id = "setDisabled.(Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (disabled);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

	}
}
