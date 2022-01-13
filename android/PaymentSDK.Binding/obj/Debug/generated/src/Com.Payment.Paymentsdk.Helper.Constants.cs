using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/Constants", DoNotGenerateAcw=true)]
	public sealed partial class Constants : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/field[@name='DEFAULT_POLICY_REMINDER_VALUE']"
		[Register ("DEFAULT_POLICY_REMINDER_VALUE")]
		public const string DefaultPolicyReminderValue = (string) "15";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/field[@name='LANGUAGE_CODE_AR']"
		[Register ("LANGUAGE_CODE_AR")]
		public const string LanguageCodeAr = (string) "ar";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/field[@name='LANGUAGE_CODE_DEFAULT']"
		[Register ("LANGUAGE_CODE_DEFAULT")]
		public const string LanguageCodeDefault = (string) "ar";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/field[@name='LANGUAGE_CODE_EN']"
		[Register ("LANGUAGE_CODE_EN")]
		public const string LanguageCodeEn = (string) "en";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/field[@name='TAG']"
		[Register ("TAG")]
		public const string Tag = (string) "pt2Tags";

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/Constants$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/Constants$Companion", typeof (Companion));

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

			internal Companion (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']/constructor[@name='Constants.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
			[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
			public unsafe Companion (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((_constructor_marker == null) ? IntPtr.Zero : ((global::Java.Lang.Object) _constructor_marker).Handle);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (_constructor_marker);
				}
			}

			public unsafe string CLIENT_KEY {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']/method[@name='getCLIENT_KEY' and count(parameter)=0]"
				[Register ("getCLIENT_KEY", "()Ljava/lang/String;", "")]
				get {
					const string __id = "getCLIENT_KEY.()Ljava/lang/String;";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
						return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
					} finally {
					}
				}
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']/method[@name='setCLIENT_KEY' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
				[Register ("setCLIENT_KEY", "(Ljava/lang/String;)V", "")]
				set {
					const string __id = "setCLIENT_KEY.(Ljava/lang/String;)V";
					IntPtr native_value = JNIEnv.NewString (value);
					try {
						JniArgumentValue* __args = stackalloc JniArgumentValue [1];
						__args [0] = new JniArgumentValue (native_value);
						_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
					} finally {
						JNIEnv.DeleteLocalRef (native_value);
					}
				}
			}

			public unsafe string SECRET_KEY {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']/method[@name='getSECRET_KEY' and count(parameter)=0]"
				[Register ("getSECRET_KEY", "()Ljava/lang/String;", "")]
				get {
					const string __id = "getSECRET_KEY.()Ljava/lang/String;";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
						return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
					} finally {
					}
				}
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants.Companion']/method[@name='setSECRET_KEY' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
				[Register ("setSECRET_KEY", "(Ljava/lang/String;)V", "")]
				set {
					const string __id = "setSECRET_KEY.(Ljava/lang/String;)V";
					IntPtr native_value = JNIEnv.NewString (value);
					try {
						JniArgumentValue* __args = stackalloc JniArgumentValue [1];
						__args [0] = new JniArgumentValue (native_value);
						_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
					} finally {
						JNIEnv.DeleteLocalRef (native_value);
					}
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/Constants", typeof (Constants));

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

		internal Constants (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper']/class[@name='Constants']/constructor[@name='Constants' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe Constants () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	}
}
