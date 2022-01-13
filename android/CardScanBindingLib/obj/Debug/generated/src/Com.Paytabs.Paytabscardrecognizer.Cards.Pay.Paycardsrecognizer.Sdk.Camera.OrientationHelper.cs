using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='OrientationHelper']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/OrientationHelper", DoNotGenerateAcw=true)]
	public sealed partial class OrientationHelper : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/OrientationHelper", typeof (OrientationHelper));

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

		internal OrientationHelper (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='OrientationHelper']/method[@name='getCameraRotationToNatural' and count(parameter)=3 and parameter[1][@type='int'] and parameter[2][@type='int'] and parameter[3][@type='boolean']]"
		[Register ("getCameraRotationToNatural", "(IIZ)I", "")]
		public static unsafe int GetCameraRotationToNatural (int displayRotation, int cameraOrientation, bool compensateMirror)
		{
			const string __id = "getCameraRotationToNatural.(IIZ)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (displayRotation);
				__args [1] = new JniArgumentValue (cameraOrientation);
				__args [2] = new JniArgumentValue (compensateMirror);
				var __rm = _members.StaticMethods.InvokeInt32Method (__id, __args);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='OrientationHelper']/method[@name='getDisplayRotationDegrees' and count(parameter)=1 and parameter[1][@type='android.view.Display']]"
		[Register ("getDisplayRotationDegrees", "(Landroid/view/Display;)I", "")]
		public static unsafe int GetDisplayRotationDegrees (global::Android.Views.Display display)
		{
			const string __id = "getDisplayRotationDegrees.(Landroid/view/Display;)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((display == null) ? IntPtr.Zero : ((global::Java.Lang.Object) display).Handle);
				var __rm = _members.StaticMethods.InvokeInt32Method (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (display);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='OrientationHelper']/method[@name='getDisplayRotationDegrees' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("getDisplayRotationDegrees", "(I)I", "")]
		public static unsafe int GetDisplayRotationDegrees (int surfaceRotationVal)
		{
			const string __id = "getDisplayRotationDegrees.(I)I";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (surfaceRotationVal);
				var __rm = _members.StaticMethods.InvokeInt32Method (__id, __args);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='OrientationHelper']/method[@name='rotateRect' and count(parameter)=5 and parameter[1][@type='android.graphics.Rect'] and parameter[2][@type='int'] and parameter[3][@type='int'] and parameter[4][@type='int'] and parameter[5][@type='android.graphics.Rect']]"
		[Register ("rotateRect", "(Landroid/graphics/Rect;IIILandroid/graphics/Rect;)Landroid/graphics/Rect;", "")]
		public static unsafe global::Android.Graphics.Rect RotateRect (global::Android.Graphics.Rect src, int width, int height, int degrees, global::Android.Graphics.Rect dst)
		{
			const string __id = "rotateRect.(Landroid/graphics/Rect;IIILandroid/graphics/Rect;)Landroid/graphics/Rect;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue ((src == null) ? IntPtr.Zero : ((global::Java.Lang.Object) src).Handle);
				__args [1] = new JniArgumentValue (width);
				__args [2] = new JniArgumentValue (height);
				__args [3] = new JniArgumentValue (degrees);
				__args [4] = new JniArgumentValue ((dst == null) ? IntPtr.Zero : ((global::Java.Lang.Object) dst).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Android.Graphics.Rect> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (src);
				global::System.GC.KeepAlive (dst);
			}
		}

	}
}
