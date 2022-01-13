using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Apms.Viewmodel.Factory {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.apms.viewmodel.factory']/class[@name='ApmViewModelFactory']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/apms/viewmodel/factory/ApmViewModelFactory", DoNotGenerateAcw=true)]
	public sealed partial class ApmViewModelFactory : global::Java.Lang.Object, global::AndroidX.Lifecycle.ViewModelProvider.IFactory {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/apms/viewmodel/factory/ApmViewModelFactory", typeof (ApmViewModelFactory));

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

		internal ApmViewModelFactory (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.apms.viewmodel.factory']/class[@name='ApmViewModelFactory']/constructor[@name='ApmViewModelFactory' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.apms.model.repo.ApmRepo']]"
		[Register (".ctor", "(Lcom/payment/paymentsdk/apms/model/repo/ApmRepo;)V", "")]
		public unsafe ApmViewModelFactory (global::Com.Payment.Paymentsdk.Apms.Model.Repo.ApmRepo repo) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Lcom/payment/paymentsdk/apms/model/repo/ApmRepo;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((repo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) repo).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (repo);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.apms.viewmodel.factory']/class[@name='ApmViewModelFactory']/method[@name='create' and count(parameter)=1 and parameter[1][@type='java.lang.Class&lt;T&gt;']]"
		[Register ("create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "")]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T extends androidx.lifecycle.ViewModel"})]
		public unsafe global::Java.Lang.Object Create (global::Java.Lang.Class modelClass)
		{
			const string __id = "create.(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((modelClass == null) ? IntPtr.Zero : ((global::Java.Lang.Object) modelClass).Handle);
				var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
				return (global::Java.Lang.Object) global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (modelClass);
			}
		}

	}
}
