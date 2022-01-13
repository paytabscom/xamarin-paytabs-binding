using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RenderThread']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RenderThread", DoNotGenerateAcw=true)]
	public sealed partial class RenderThread : global::Java.Lang.Thread {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RenderThread", typeof (RenderThread));

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

		internal RenderThread (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RenderThread']/constructor[@name='RenderThread' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.ScanManagerHandler']]"
		[Register (".ctor", "(Landroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManagerHandler;)V", "")]
		public unsafe RenderThread (global::Android.Content.Context context, global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.ScanManagerHandler mainHandler) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/ScanManagerHandler;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((mainHandler == null) ? IntPtr.Zero : ((global::Java.Lang.Object) mainHandler).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (mainHandler);
			}
		}

		public unsafe global::Android.OS.Handler Handler {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RenderThread']/method[@name='getHandler' and count(parameter)=0]"
			[Register ("getHandler", "()Landroid/os/Handler;", "")]
			get {
				const string __id = "getHandler.()Landroid/os/Handler;";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Android.OS.Handler> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RenderThread']/method[@name='waitUntilReady' and count(parameter)=0]"
		[Register ("waitUntilReady", "()V", "")]
		public unsafe void WaitUntilReady ()
		{
			const string __id = "waitUntilReady.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
