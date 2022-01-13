using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Base {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/base/BaseViewModel", DoNotGenerateAcw=true)]
	public partial class BaseViewModel : global::AndroidX.Lifecycle.ViewModel {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/base/BaseViewModel", typeof (BaseViewModel));

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

		protected BaseViewModel (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/constructor[@name='BaseViewModel' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe BaseViewModel () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		public unsafe global::AndroidX.Lifecycle.MutableLiveData DataLoading {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getDataLoading' and count(parameter)=0]"
			[Register ("getDataLoading", "()Landroidx/lifecycle/MutableLiveData;", "")]
			get {
				const string __id = "getDataLoading.()Landroidx/lifecycle/MutableLiveData;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::AndroidX.Lifecycle.MutableLiveData> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo DeviceInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getDeviceInfo' and count(parameter)=0]"
			[Register ("getDeviceInfo", "()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;", "")]
			get {
				const string __id = "getDeviceInfo.()Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Request.PtDeviceInfo> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='setDeviceInfo' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.request.PtDeviceInfo']]"
			[Register ("setDeviceInfo", "(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)V", "")]
			set {
				const string __id = "setDeviceInfo.(Lcom/payment/paymentsdk/sharedclasses/model/request/PtDeviceInfo;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent ErrorMessageEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getErrorMessageEvent' and count(parameter)=0]"
			[Register ("getErrorMessageEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getErrorMessageEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='setErrorMessageEvent' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.helper.livedata.SingleLiveEvent&lt;com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody&gt;']]"
			[Register ("setErrorMessageEvent", "(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V", "")]
			set {
				const string __id = "setErrorMessageEvent.(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent ErrorResourceMessageEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getErrorResourceMessageEvent' and count(parameter)=0]"
			[Register ("getErrorResourceMessageEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getErrorResourceMessageEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='setErrorResourceMessageEvent' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.helper.livedata.SingleLiveEvent&lt;java.lang.Integer&gt;']]"
			[Register ("setErrorResourceMessageEvent", "(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V", "")]
			set {
				const string __id = "setErrorResourceMessageEvent.(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Java.Util.Concurrent.IExecutor Executor {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getExecutor' and count(parameter)=0]"
			[Register ("getExecutor", "()Ljava/util/concurrent/Executor;", "")]
			get {
				const string __id = "getExecutor.()Ljava/util/concurrent/Executor;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Util.Concurrent.IExecutor> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='setExecutor' and count(parameter)=1 and parameter[1][@type='java.util.concurrent.Executor']]"
			[Register ("setExecutor", "(Ljava/util/concurrent/Executor;)V", "")]
			set {
				const string __id = "setExecutor.(Ljava/util/concurrent/Executor;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent ShowNoListScreenEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getShowNoListScreenEvent' and count(parameter)=0]"
			[Register ("getShowNoListScreenEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getShowNoListScreenEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent ShowNoNetworkScreenEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getShowNoNetworkScreenEvent' and count(parameter)=0]"
			[Register ("getShowNoNetworkScreenEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getShowNoNetworkScreenEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent ShowServerIssueEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getShowServerIssueEvent' and count(parameter)=0]"
			[Register ("getShowServerIssueEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getShowServerIssueEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent SuccessMessageEvent {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='getSuccessMessageEvent' and count(parameter)=0]"
			[Register ("getSuccessMessageEvent", "()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;", "")]
			get {
				const string __id = "getSuccessMessageEvent.()Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Livedata.SingleLiveEvent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.base']/class[@name='BaseViewModel']/method[@name='setSuccessMessageEvent' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.helper.livedata.SingleLiveEvent&lt;java.lang.String&gt;']]"
			[Register ("setSuccessMessageEvent", "(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V", "")]
			set {
				const string __id = "setSuccessMessageEvent.(Lcom/payment/paymentsdk/helper/livedata/SingleLiveEvent;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

	}
}
