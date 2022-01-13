using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Texture2dProgram", DoNotGenerateAcw=true)]
	public partial class Texture2dProgram : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/field[@name='KERNEL_SIZE']"
		[Register ("KERNEL_SIZE")]
		public const int KernelSize = (int) 9;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Texture2dProgram", typeof (Texture2dProgram));

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

		protected Texture2dProgram (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/constructor[@name='Texture2dProgram' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe Texture2dProgram () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_createTextureObject;
#pragma warning disable 0169
		static Delegate GetCreateTextureObjectHandler ()
		{
			if (cb_createTextureObject == null)
				cb_createTextureObject = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_I) n_CreateTextureObject);
			return cb_createTextureObject;
		}

		static int n_CreateTextureObject (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Texture2dProgram> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.CreateTextureObject ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/method[@name='createTextureObject' and count(parameter)=0]"
		[Register ("createTextureObject", "()I", "GetCreateTextureObjectHandler")]
		public virtual unsafe int CreateTextureObject ()
		{
			const string __id = "createTextureObject.()I";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualInt32Method (__id, this, null);
				return __rm;
			} finally {
			}
		}

		static Delegate cb_draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II;
#pragma warning disable 0169
		static Delegate GetDraw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_IIHandler ()
		{
			if (cb_draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II == null)
				cb_draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLLIIIILLII_V) n_Draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II);
			return cb_draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II;
		}

		static void n_Draw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_II (IntPtr jnienv, IntPtr native__this, IntPtr native_mvpMatrix, IntPtr native_vertexBuffer, int firstVertex, int vertexCount, int coordsPerVertex, int vertexStride, IntPtr native_texMatrix, IntPtr native_texBuffer, int textureId, int texStride)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Texture2dProgram> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var mvpMatrix = (float[]) JNIEnv.GetArray (native_mvpMatrix, JniHandleOwnership.DoNotTransfer, typeof (float));
			var vertexBuffer = global::Java.Lang.Object.GetObject<global::Java.Nio.FloatBuffer> (native_vertexBuffer, JniHandleOwnership.DoNotTransfer);
			var texMatrix = (float[]) JNIEnv.GetArray (native_texMatrix, JniHandleOwnership.DoNotTransfer, typeof (float));
			var texBuffer = global::Java.Lang.Object.GetObject<global::Java.Nio.FloatBuffer> (native_texBuffer, JniHandleOwnership.DoNotTransfer);
			__this.Draw (mvpMatrix, vertexBuffer, firstVertex, vertexCount, coordsPerVertex, vertexStride, texMatrix, texBuffer, textureId, texStride);
			if (mvpMatrix != null)
				JNIEnv.CopyArray (mvpMatrix, native_mvpMatrix);
			if (texMatrix != null)
				JNIEnv.CopyArray (texMatrix, native_texMatrix);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/method[@name='draw' and count(parameter)=10 and parameter[1][@type='float[]'] and parameter[2][@type='java.nio.FloatBuffer'] and parameter[3][@type='int'] and parameter[4][@type='int'] and parameter[5][@type='int'] and parameter[6][@type='int'] and parameter[7][@type='float[]'] and parameter[8][@type='java.nio.FloatBuffer'] and parameter[9][@type='int'] and parameter[10][@type='int']]"
		[Register ("draw", "([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;II)V", "GetDraw_arrayFLjava_nio_FloatBuffer_IIIIarrayFLjava_nio_FloatBuffer_IIHandler")]
		public virtual unsafe void Draw (float[] mvpMatrix, global::Java.Nio.FloatBuffer vertexBuffer, int firstVertex, int vertexCount, int coordsPerVertex, int vertexStride, float[] texMatrix, global::Java.Nio.FloatBuffer texBuffer, int textureId, int texStride)
		{
			const string __id = "draw.([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;II)V";
			IntPtr native_mvpMatrix = JNIEnv.NewArray (mvpMatrix);
			IntPtr native_texMatrix = JNIEnv.NewArray (texMatrix);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [10];
				__args [0] = new JniArgumentValue (native_mvpMatrix);
				__args [1] = new JniArgumentValue ((vertexBuffer == null) ? IntPtr.Zero : ((global::Java.Lang.Object) vertexBuffer).Handle);
				__args [2] = new JniArgumentValue (firstVertex);
				__args [3] = new JniArgumentValue (vertexCount);
				__args [4] = new JniArgumentValue (coordsPerVertex);
				__args [5] = new JniArgumentValue (vertexStride);
				__args [6] = new JniArgumentValue (native_texMatrix);
				__args [7] = new JniArgumentValue ((texBuffer == null) ? IntPtr.Zero : ((global::Java.Lang.Object) texBuffer).Handle);
				__args [8] = new JniArgumentValue (textureId);
				__args [9] = new JniArgumentValue (texStride);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				if (mvpMatrix != null) {
					JNIEnv.CopyArray (native_mvpMatrix, mvpMatrix);
					JNIEnv.DeleteLocalRef (native_mvpMatrix);
				}
				if (texMatrix != null) {
					JNIEnv.CopyArray (native_texMatrix, texMatrix);
					JNIEnv.DeleteLocalRef (native_texMatrix);
				}
				global::System.GC.KeepAlive (mvpMatrix);
				global::System.GC.KeepAlive (vertexBuffer);
				global::System.GC.KeepAlive (texMatrix);
				global::System.GC.KeepAlive (texBuffer);
			}
		}

		static Delegate cb_release;
#pragma warning disable 0169
		static Delegate GetReleaseHandler ()
		{
			if (cb_release == null)
				cb_release = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_V) n_Release);
			return cb_release;
		}

		static void n_Release (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Texture2dProgram> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.Release ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/method[@name='release' and count(parameter)=0]"
		[Register ("release", "()V", "GetReleaseHandler")]
		public virtual unsafe void Release ()
		{
			const string __id = "release.()V";
			try {
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		static Delegate cb_setTexSize_II;
#pragma warning disable 0169
		static Delegate GetSetTexSize_IIHandler ()
		{
			if (cb_setTexSize_II == null)
				cb_setTexSize_II = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPII_V) n_SetTexSize_II);
			return cb_setTexSize_II;
		}

		static void n_SetTexSize_II (IntPtr jnienv, IntPtr native__this, int width, int height)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Texture2dProgram> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			__this.SetTexSize (width, height);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Texture2dProgram']/method[@name='setTexSize' and count(parameter)=2 and parameter[1][@type='int'] and parameter[2][@type='int']]"
		[Register ("setTexSize", "(II)V", "GetSetTexSize_IIHandler")]
		public virtual unsafe void SetTexSize (int width, int height)
		{
			const string __id = "setTexSize.(II)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (width);
				__args [1] = new JniArgumentValue (height);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
			}
		}

	}
}
