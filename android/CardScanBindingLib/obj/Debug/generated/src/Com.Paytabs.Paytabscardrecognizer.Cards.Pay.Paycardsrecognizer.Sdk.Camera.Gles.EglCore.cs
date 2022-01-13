using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore", DoNotGenerateAcw=true)]
	public sealed partial class EglCore : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/field[@name='FLAG_RECORDABLE']"
		[Register ("FLAG_RECORDABLE")]
		public const int FlagRecordable = (int) 1;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/EglCore", typeof (EglCore));

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

		internal EglCore (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/constructor[@name='EglCore' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe EglCore () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/constructor[@name='EglCore' and count(parameter)=2 and parameter[1][@type='javax.microedition.khronos.egl.EGLContext'] and parameter[2][@type='int']]"
		[Register (".ctor", "(Ljavax/microedition/khronos/egl/EGLContext;I)V", "")]
		public unsafe EglCore (global::Javax.Microedition.Khronos.Egl.EGLContext sharedContext, int flags) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljavax/microedition/khronos/egl/EGLContext;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((sharedContext == null) ? IntPtr.Zero : ((global::Java.Lang.Object) sharedContext).Handle);
				__args [1] = new JniArgumentValue (flags);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (sharedContext);
			}
		}

		public unsafe int GlVersion {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='getGlVersion' and count(parameter)=0]"
			[Register ("getGlVersion", "()I", "")]
			get {
				const string __id = "getGlVersion.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='createOffscreenSurface' and count(parameter)=2 and parameter[1][@type='int'] and parameter[2][@type='int']]"
		[Register ("createOffscreenSurface", "(II)Ljavax/microedition/khronos/egl/EGLSurface;", "")]
		public unsafe global::Javax.Microedition.Khronos.Egl.EGLSurface CreateOffscreenSurface (int width, int height)
		{
			const string __id = "createOffscreenSurface.(II)Ljavax/microedition/khronos/egl/EGLSurface;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (width);
				__args [1] = new JniArgumentValue (height);
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Javax.Microedition.Khronos.Egl.EGLSurface> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='createWindowSurface' and count(parameter)=1 and parameter[1][@type='java.lang.Object']]"
		[Register ("createWindowSurface", "(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLSurface;", "")]
		public unsafe global::Javax.Microedition.Khronos.Egl.EGLSurface CreateWindowSurface (global::Java.Lang.Object surface)
		{
			const string __id = "createWindowSurface.(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLSurface;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((surface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) surface).Handle);
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Javax.Microedition.Khronos.Egl.EGLSurface> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (surface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='isCurrent' and count(parameter)=1 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface']]"
		[Register ("isCurrent", "(Ljavax/microedition/khronos/egl/EGLSurface;)Z", "")]
		public unsafe bool IsCurrent (global::Javax.Microedition.Khronos.Egl.EGLSurface eglSurface)
		{
			const string __id = "isCurrent.(Ljavax/microedition/khronos/egl/EGLSurface;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((eglSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglSurface).Handle);
				var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (eglSurface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='makeCurrent' and count(parameter)=1 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface']]"
		[Register ("makeCurrent", "(Ljavax/microedition/khronos/egl/EGLSurface;)V", "")]
		public unsafe void MakeCurrent (global::Javax.Microedition.Khronos.Egl.EGLSurface eglSurface)
		{
			const string __id = "makeCurrent.(Ljavax/microedition/khronos/egl/EGLSurface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((eglSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglSurface).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (eglSurface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='makeCurrent' and count(parameter)=2 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface'] and parameter[2][@type='javax.microedition.khronos.egl.EGLSurface']]"
		[Register ("makeCurrent", "(Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;)V", "")]
		public unsafe void MakeCurrent (global::Javax.Microedition.Khronos.Egl.EGLSurface drawSurface, global::Javax.Microedition.Khronos.Egl.EGLSurface readSurface)
		{
			const string __id = "makeCurrent.(Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((drawSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) drawSurface).Handle);
				__args [1] = new JniArgumentValue ((readSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) readSurface).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (drawSurface);
				global::System.GC.KeepAlive (readSurface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='makeNothingCurrent' and count(parameter)=0]"
		[Register ("makeNothingCurrent", "()V", "")]
		public unsafe void MakeNothingCurrent ()
		{
			const string __id = "makeNothingCurrent.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='queryString' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("queryString", "(I)Ljava/lang/String;", "")]
		public unsafe string QueryString (int what)
		{
			const string __id = "queryString.(I)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (what);
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='querySurface' and count(parameter)=2 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface'] and parameter[2][@type='int']]"
		[Register ("querySurface", "(Ljavax/microedition/khronos/egl/EGLSurface;I)I", "")]
		public unsafe int QuerySurface (global::Javax.Microedition.Khronos.Egl.EGLSurface eglSurface, int what)
		{
			const string __id = "querySurface.(Ljavax/microedition/khronos/egl/EGLSurface;I)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((eglSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglSurface).Handle);
				__args [1] = new JniArgumentValue (what);
				var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (eglSurface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='release' and count(parameter)=0]"
		[Register ("release", "()V", "")]
		public unsafe void Release ()
		{
			const string __id = "release.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='releaseSurface' and count(parameter)=1 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface']]"
		[Register ("releaseSurface", "(Ljavax/microedition/khronos/egl/EGLSurface;)V", "")]
		public unsafe void ReleaseSurface (global::Javax.Microedition.Khronos.Egl.EGLSurface eglSurface)
		{
			const string __id = "releaseSurface.(Ljavax/microedition/khronos/egl/EGLSurface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((eglSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglSurface).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (eglSurface);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='EglCore']/method[@name='swapBuffers' and count(parameter)=1 and parameter[1][@type='javax.microedition.khronos.egl.EGLSurface']]"
		[Register ("swapBuffers", "(Ljavax/microedition/khronos/egl/EGLSurface;)Z", "")]
		public unsafe bool SwapBuffers (global::Javax.Microedition.Khronos.Egl.EGLSurface eglSurface)
		{
			const string __id = "swapBuffers.(Ljavax/microedition/khronos/egl/EGLSurface;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((eglSurface == null) ? IntPtr.Zero : ((global::Java.Lang.Object) eglSurface).Handle);
				var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (eglSurface);
			}
		}

	}
}
