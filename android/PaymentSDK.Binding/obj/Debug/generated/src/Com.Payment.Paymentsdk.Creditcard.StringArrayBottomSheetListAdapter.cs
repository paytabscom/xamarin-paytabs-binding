using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='StringArrayBottomSheetListAdapter']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/StringArrayBottomSheetListAdapter", DoNotGenerateAcw=true)]
	public sealed partial class StringArrayBottomSheetListAdapter : global::AndroidX.RecyclerView.Widget.RecyclerView.Adapter {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='StringArrayBottomSheetListAdapter.VH']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/StringArrayBottomSheetListAdapter$VH", DoNotGenerateAcw=true)]
		public sealed partial class VH : global::AndroidX.RecyclerView.Widget.RecyclerView.ViewHolder {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/StringArrayBottomSheetListAdapter$VH", typeof (VH));

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

			internal VH (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='StringArrayBottomSheetListAdapter.VH']/constructor[@name='StringArrayBottomSheetListAdapter.VH' and count(parameter)=1 and parameter[1][@type='android.view.View']]"
			[Register (".ctor", "(Landroid/view/View;)V", "")]
			public unsafe VH (global::Android.Views.View v) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Landroid/view/View;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((v == null) ? IntPtr.Zero : ((global::Java.Lang.Object) v).Handle);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (v);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/StringArrayBottomSheetListAdapter", typeof (StringArrayBottomSheetListAdapter));

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

		internal StringArrayBottomSheetListAdapter (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='StringArrayBottomSheetListAdapter']/constructor[@name='StringArrayBottomSheetListAdapter' and count(parameter)=2 and parameter[1][@type='java.util.List&lt;java.lang.String&gt;'] and parameter[2][@type='com.payment.paymentsdk.helper.listeners.CustomItemClickListener&lt;java.lang.String&gt;']]"
		[Register (".ctor", "(Ljava/util/List;Lcom/payment/paymentsdk/helper/listeners/CustomItemClickListener;)V", "")]
		public unsafe StringArrayBottomSheetListAdapter (global::System.Collections.Generic.IList<string> list, global::Com.Payment.Paymentsdk.Helper.Listeners.ICustomItemClickListener listener) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/util/List;Lcom/payment/paymentsdk/helper/listeners/CustomItemClickListener;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_list = global::Android.Runtime.JavaList<string>.ToLocalJniHandle (list);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue (native_list);
				__args [1] = new JniArgumentValue ((listener == null) ? IntPtr.Zero : ((global::Java.Lang.Object) listener).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_list);
				global::System.GC.KeepAlive (list);
				global::System.GC.KeepAlive (listener);
			}
		}

		public override unsafe int ItemCount {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard']/class[@name='StringArrayBottomSheetListAdapter']/method[@name='getItemCount' and count(parameter)=0]"
			[Register ("getItemCount", "()I", "")]
			get {
				const string __id = "getItemCount.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

	}
}
