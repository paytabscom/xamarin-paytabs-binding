using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Samsungpay.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.view']/class[@name='SamsungPayFragment']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/samsungpay/view/SamsungPayFragment", DoNotGenerateAcw=true)]
	public sealed partial class SamsungPayFragment : global::Com.Payment.Paymentsdk.Sharedclasses.Base.BasePaymentFragment {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.view']/class[@name='SamsungPayFragment.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/samsungpay/view/SamsungPayFragment$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/samsungpay/view/SamsungPayFragment$Companion", typeof (Companion));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.view']/class[@name='SamsungPayFragment.Companion']/constructor[@name='SamsungPayFragment.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.view']/class[@name='SamsungPayFragment.Companion']/method[@name='newInstance' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[2][@type='java.lang.String']]"
			[Register ("newInstance", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;)Lcom/payment/paymentsdk/samsungpay/view/SamsungPayFragment;", "")]
			public unsafe global::Com.Payment.Paymentsdk.Samsungpay.View.SamsungPayFragment NewInstance (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfig, string samPayToken)
			{
				const string __id = "newInstance.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;)Lcom/payment/paymentsdk/samsungpay/view/SamsungPayFragment;";
				IntPtr native_samPayToken = JNIEnv.NewString (samPayToken);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [2];
					__args [0] = new JniArgumentValue ((ptConfig == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfig).Handle);
					__args [1] = new JniArgumentValue (native_samPayToken);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Samsungpay.View.SamsungPayFragment> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					JNIEnv.DeleteLocalRef (native_samPayToken);
					global::System.GC.KeepAlive (ptConfig);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/samsungpay/view/SamsungPayFragment", typeof (SamsungPayFragment));

		internal static new IntPtr class_ref {
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

		internal SamsungPayFragment (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.samsungpay.view']/class[@name='SamsungPayFragment']/constructor[@name='SamsungPayFragment' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe SamsungPayFragment () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
