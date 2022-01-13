using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Tokenizationpayment.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragment']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment", DoNotGenerateAcw=true)]
	public sealed partial class TokenizationPaymentFragment : global::Com.Payment.Paymentsdk.Sharedclasses.Base.BasePaymentFragment {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragment.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment$Companion", typeof (Companion));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragment.Companion']/constructor[@name='TokenizationPaymentFragment.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragment.Companion']/method[@name='newInstance' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
			[Register ("newInstance", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment;", "")]
			public unsafe global::Com.Payment.Paymentsdk.Tokenizationpayment.View.TokenizationPaymentFragment NewInstance (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfig)
			{
				const string __id = "newInstance.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)Lcom/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((ptConfig == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfig).Handle);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Tokenizationpayment.View.TokenizationPaymentFragment> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					global::System.GC.KeepAlive (ptConfig);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/tokenizationpayment/view/TokenizationPaymentFragment", typeof (TokenizationPaymentFragment));

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

		internal TokenizationPaymentFragment (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.tokenizationpayment.view']/class[@name='TokenizationPaymentFragment']/constructor[@name='TokenizationPaymentFragment' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe TokenizationPaymentFragment () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
