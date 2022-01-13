using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionCoreUtils']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionCoreUtils", DoNotGenerateAcw=true)]
	public sealed partial class RecognitionCoreUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/camera/RecognitionCoreUtils", typeof (RecognitionCoreUtils));

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

		internal RecognitionCoreUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionCoreUtils']/method[@name='deployRecognitionCoreSync' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("deployRecognitionCoreSync", "(Landroid/content/Context;)V", "")]
		public static unsafe void DeployRecognitionCoreSync (global::Android.Content.Context context)
		{
			const string __id = "deployRecognitionCoreSync.(Landroid/content/Context;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionCoreUtils']/method[@name='isRecognitionCoreDeployRequired' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isRecognitionCoreDeployRequired", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsRecognitionCoreDeployRequired (global::Android.Content.Context context)
		{
			const string __id = "isRecognitionCoreDeployRequired.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionCoreUtils']/method[@name='isScanCardSupported' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("isScanCardSupported", "(Landroid/content/Context;)Z", "")]
		public static unsafe bool IsScanCardSupported (global::Android.Content.Context context)
		{
			const string __id = "isScanCardSupported.(Landroid/content/Context;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera']/class[@name='RecognitionCoreUtils']/method[@name='startDeployRecognitionCore' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register ("startDeployRecognitionCore", "(Landroid/content/Context;)V", "")]
		public static unsafe void StartDeployRecognitionCore (global::Android.Content.Context context)
		{
			const string __id = "startDeployRecognitionCore.(Landroid/content/Context;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

	}
}
