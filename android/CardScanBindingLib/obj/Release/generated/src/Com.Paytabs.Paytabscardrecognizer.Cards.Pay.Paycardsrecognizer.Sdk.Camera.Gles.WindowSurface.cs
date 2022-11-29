using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/WindowSurface", DoNotGenerateAcw=true)]
	public sealed partial class WindowSurface : global::Java.Lang.Object {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/field[@name='mEglCore']"
		[Register ("mEglCore")]
		private global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.EglCore MEglCore {
			get {
				const string __id = "mEglCore.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore;";

				var __v = _members.InstanceFields.GetObjectValue (__id, this);
				return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.EglCore> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
			set {
				const string __id = "mEglCore.Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore;";

				IntPtr native_value = global::Android.Runtime.JNIEnv.ToLocalJniHandle (value);
				try {
					_members.InstanceFields.SetValue (__id, this, new JniObjectReference (native_value));
				} finally {
					global::Android.Runtime.JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/field[@name='TAG']"
		[Register ("TAG")]
		private const string Tag = (string) "gles";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/WindowSurface", typeof (WindowSurface));

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

		internal WindowSurface (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/constructor[@name='WindowSurface' and count(parameter)=3 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.EglCore'] and parameter[2][@type='android.view.SurfaceHolder'] and parameter[3][@type='boolean']]"
		[Register (".ctor", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore;Landroid/view/SurfaceHolder;Z)V", "")]
		public unsafe WindowSurface (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.EglCore eglCore, global::Android.Views.ISurfaceHolder surfaceHolder, bool releaseSurface) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore;Landroid/view/SurfaceHolder;Z)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((eglCore == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglCore).Handle);
				__args [1] = new JniArgumentValue ((surfaceHolder == null) ? IntPtr.Zero : ((global::Java.Lang.Object) surfaceHolder).Handle);
				__args [2] = new JniArgumentValue (releaseSurface);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (eglCore);
				global::System.GC.KeepAlive (surfaceHolder);
			}
		}

		public unsafe int Height {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='getHeight' and count(parameter)=0]"
			[Register ("getHeight", "()I", "")]
			get {
				const string __id = "getHeight.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe int Width {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='getWidth' and count(parameter)=0]"
			[Register ("getWidth", "()I", "")]
			get {
				const string __id = "getWidth.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='createWindowSurface' and count(parameter)=1 and parameter[1][@type='java.lang.Object']]"
		[Register ("createWindowSurface", "(Ljava/lang/Object;)V", "")]
		public unsafe void CreateWindowSurface (global::Java.Lang.Object surface)
		{
			const string __id = "createWindowSurface.(Ljava/lang/Object;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((surface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) surface).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (surface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='makeCurrent' and count(parameter)=0]"
		[Register ("makeCurrent", "()V", "")]
		public unsafe void MakeCurrent ()
		{
			const string __id = "makeCurrent.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='release' and count(parameter)=0]"
		[Register ("release", "()V", "")]
		public unsafe void Release ()
		{
			const string __id = "release.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='releaseEglSurface' and count(parameter)=0]"
		[Register ("releaseEglSurface", "()V", "")]
		public unsafe void ReleaseEglSurface ()
		{
			const string __id = "releaseEglSurface.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='saveFrame' and count(parameter)=1 and parameter[1][@type='java.io.File']]"
		[Register ("saveFrame", "(Ljava/io/File;)V", "")]
		public unsafe void SaveFrame (global::Java.IO.File file)
		{
			const string __id = "saveFrame.(Ljava/io/File;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((file == null) ? IntPtr.Zero : ((global::Java.Lang.Object) file).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (file);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='WindowSurface']/method[@name='swapBuffers' and count(parameter)=0]"
		[Register ("swapBuffers", "()Z", "")]
		public unsafe bool SwapBuffers ()
		{
			const string __id = "swapBuffers.()Z";
			try {
				var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
				return __rm;
			} finally {
			}
		}

	}
}
