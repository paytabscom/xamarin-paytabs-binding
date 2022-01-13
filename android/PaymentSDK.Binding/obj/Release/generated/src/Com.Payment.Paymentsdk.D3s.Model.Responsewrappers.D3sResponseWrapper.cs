using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.D3s.Model.Responsewrappers {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper", DoNotGenerateAcw=true)]
	public abstract partial class D3sResponseWrapper : global::Java.Lang.Object {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.BadRequest']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$BadRequest", DoNotGenerateAcw=true)]
		public sealed partial class BadRequest : global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$BadRequest", typeof (BadRequest));

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

			internal BadRequest (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.BadRequest']/constructor[@name='D3sResponseWrapper.BadRequest' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody']]"
			[Register (".ctor", "(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V", "")]
			public unsafe BadRequest (global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.ErrorResponseBody errorResponseBody) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((errorResponseBody == null) ? IntPtr.Zero : ((global::Java.Lang.Object) errorResponseBody).Handle);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (errorResponseBody);
				}
			}

			public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.ErrorResponseBody ErrorResponseBody {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.BadRequest']/method[@name='getErrorResponseBody' and count(parameter)=0]"
				[Register ("getErrorResponseBody", "()Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;", "")]
				get {
					const string __id = "getErrorResponseBody.()Lcom/payment/paymentsdk/sharedclasses/model/response/ErrorResponseBody;";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
						return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Response.ErrorResponseBody> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.IOError']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$IOError", DoNotGenerateAcw=true)]
		public sealed partial class IOError : global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.IOError']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper.IOError Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$IOError;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper.IOError> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$IOError", typeof (IOError));

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

			internal IOError (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.ServerError']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$ServerError", DoNotGenerateAcw=true)]
		public sealed partial class ServerError : global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.ServerError']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper.ServerError Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$ServerError;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper.ServerError> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$ServerError", typeof (ServerError));

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

			internal ServerError (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.Success']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$Success", DoNotGenerateAcw=true)]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
		public sealed partial class Success : global::Com.Payment.Paymentsdk.D3s.Model.Responsewrappers.D3sResponseWrapper {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper$Success", typeof (Success));

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

			internal Success (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.Success']/constructor[@name='D3sResponseWrapper.Success' and count(parameter)=1 and parameter[1][@type='T']]"
			[Register (".ctor", "(Ljava/lang/Object;)V", "")]
			public unsafe Success (global::Java.Lang.Object data) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Ljava/lang/Object;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				IntPtr native_data = JNIEnv.ToLocalJniHandle (data);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_data);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_data);
					global::System.GC.KeepAlive (data);
				}
			}

			public unsafe global::Java.Lang.Object Data {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper.Success']/method[@name='getData' and count(parameter)=0]"
				[Register ("getData", "()Ljava/lang/Object;", "")]
				get {
					const string __id = "getData.()Ljava/lang/Object;";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
						return (global::Java.Lang.Object) global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
					} finally {
					}
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper", typeof (D3sResponseWrapper));

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

		protected D3sResponseWrapper (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.d3s.model.responsewrappers']/class[@name='D3sResponseWrapper']/constructor[@name='D3sResponseWrapper' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
		[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
		public unsafe D3sResponseWrapper (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper", DoNotGenerateAcw=true)]
	internal partial class D3sResponseWrapperInvoker : D3sResponseWrapper {
		public D3sResponseWrapperInvoker (IntPtr handle, JniHandleOwnership transfer) : base (handle, transfer)
		{
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/d3s/model/responsewrappers/D3sResponseWrapper", typeof (D3sResponseWrapperInvoker));

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		public override global::Java.Interop.JniPeerMembers JniPeerMembers {
			get { return _members; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

	}
}
