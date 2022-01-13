using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Sprite2d", DoNotGenerateAcw=true)]
	public sealed partial class Sprite2d : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Sprite2d", typeof (Sprite2d));

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

		internal Sprite2d (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/constructor[@name='Sprite2d' and count(parameter)=1 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.Drawable2d']]"
		[Register (".ctor", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Drawable2d;)V", "")]
		public unsafe Sprite2d (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Drawable2d drawable) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Drawable2d;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((drawable == null) ? IntPtr.Zero : ((global::Java.Lang.Object) drawable).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (drawable);
			}
		}

		public unsafe float PositionX {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getPositionX' and count(parameter)=0]"
			[Register ("getPositionX", "()F", "")]
			get {
				const string __id = "getPositionX.()F";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractSingleMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe float PositionY {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getPositionY' and count(parameter)=0]"
			[Register ("getPositionY", "()F", "")]
			get {
				const string __id = "getPositionY.()F";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractSingleMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe float Rotation {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getRotation' and count(parameter)=0]"
			[Register ("getRotation", "()F", "")]
			get {
				const string __id = "getRotation.()F";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractSingleMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='setRotation' and count(parameter)=1 and parameter[1][@type='float']]"
			[Register ("setRotation", "(F)V", "")]
			set {
				const string __id = "setRotation.(F)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (value);
					_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
				} finally {
				}
			}
		}

		public unsafe float ScaleX {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getScaleX' and count(parameter)=0]"
			[Register ("getScaleX", "()F", "")]
			get {
				const string __id = "getScaleX.()F";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractSingleMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe float ScaleY {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getScaleY' and count(parameter)=0]"
			[Register ("getScaleY", "()F", "")]
			get {
				const string __id = "getScaleY.()F";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractSingleMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='draw' and count(parameter)=2 and parameter[1][@type='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles.Texture2dProgram'] and parameter[2][@type='float[]']]"
		[Register ("draw", "(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Texture2dProgram;[F)V", "")]
		public unsafe void Draw (global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles.Texture2dProgram program, float[] projectionMatrix)
		{
			const string __id = "draw.(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/gles/Texture2dProgram;[F)V";
			IntPtr native_projectionMatrix = JNIEnv.NewArray (projectionMatrix);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((program == null) ? IntPtr.Zero : ((global::Java.Lang.Object) program).Handle);
				__args [1] = new JniArgumentValue (native_projectionMatrix);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				if (projectionMatrix != null) {
					JNIEnv.CopyArray (native_projectionMatrix, projectionMatrix);
					JNIEnv.DeleteLocalRef (native_projectionMatrix);
				}
				global::System.GC.KeepAlive (program);
				global::System.GC.KeepAlive (projectionMatrix);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getColor' and count(parameter)=0]"
		[Register ("getColor", "()[F", "")]
		public unsafe float[] GetColor ()
		{
			const string __id = "getColor.()[F";
			try {
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, null);
				return (float[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (float));
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='getModelViewMatrix' and count(parameter)=0]"
		[Register ("getModelViewMatrix", "()[F", "")]
		public unsafe float[] GetModelViewMatrix ()
		{
			const string __id = "getModelViewMatrix.()[F";
			try {
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, null);
				return (float[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (float));
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='setColor' and count(parameter)=3 and parameter[1][@type='float'] and parameter[2][@type='float'] and parameter[3][@type='float']]"
		[Register ("setColor", "(FFF)V", "")]
		public unsafe void SetColor (float red, float green, float blue)
		{
			const string __id = "setColor.(FFF)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (red);
				__args [1] = new JniArgumentValue (green);
				__args [2] = new JniArgumentValue (blue);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='setPosition' and count(parameter)=2 and parameter[1][@type='float'] and parameter[2][@type='float']]"
		[Register ("setPosition", "(FF)V", "")]
		public unsafe void SetPosition (float posX, float posY)
		{
			const string __id = "setPosition.(FF)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (posX);
				__args [1] = new JniArgumentValue (posY);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='setScale' and count(parameter)=2 and parameter[1][@type='float'] and parameter[2][@type='float']]"
		[Register ("setScale", "(FF)V", "")]
		public unsafe void SetScale (float scaleX, float scaleY)
		{
			const string __id = "setScale.(FF)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (scaleX);
				__args [1] = new JniArgumentValue (scaleY);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles']/class[@name='Sprite2d']/method[@name='setTexture' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("setTexture", "(I)V", "")]
		public unsafe void SetTexture (int textureId)
		{
			const string __id = "setTexture.(I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (textureId);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
			}
		}

	}
}
