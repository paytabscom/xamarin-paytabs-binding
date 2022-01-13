using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/CountryListFragment", DoNotGenerateAcw=true)]
	public sealed partial class CountryListFragment : global::Google.Android.Material.BottomSheet.BottomSheetDialogFragment, global::Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListener {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/CountryListFragment$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/CountryListFragment$Companion", typeof (Companion));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment.Companion']/constructor[@name='CountryListFragment.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment.Companion']/method[@name='newInstance' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("newInstance", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/view/CountryListFragment;", "")]
			public unsafe global::Com.Payment.Paymentsdk.Creditcard.View.CountryListFragment NewInstance (string keyToListen)
			{
				const string __id = "newInstance.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/view/CountryListFragment;";
				IntPtr native_keyToListen = JNIEnv.NewString (keyToListen);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_keyToListen);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.CountryListFragment> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					JNIEnv.DeleteLocalRef (native_keyToListen);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/CountryListFragment", typeof (CountryListFragment));

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

		internal CountryListFragment (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment']/constructor[@name='CountryListFragment' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe CountryListFragment () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view']/class[@name='CountryListFragment']/method[@name='onClick' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("onClick", "(Ljava/lang/String;)V", "")]
		public unsafe void OnClick (string t)
		{
			const string __id = "onClick.(Ljava/lang/String;)V";
			IntPtr native_t = JNIEnv.NewString (t);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_t);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_t);
			}
		}

		// This method is explicitly implemented as a member of an instantiated Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListener
		void global::Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListener.OnClick (global::Java.Lang.Object t)
		{
			OnClick (t.ToString ());
		}

	}
}
