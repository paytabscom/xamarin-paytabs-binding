using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper", DoNotGenerateAcw=true)]
	public abstract partial class TransactionResponseWrapper : global::Java.Lang.Object {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.BadRequest']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$BadRequest", DoNotGenerateAcw=true)]
		public sealed partial class BadRequest : global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$BadRequest", typeof (BadRequest));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.BadRequest']/constructor[@name='TransactionResponseWrapper.BadRequest' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.model.response.ErrorResponseBody']]"
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.BadRequest']/method[@name='getErrorResponseBody' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.IOError']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$IOError", DoNotGenerateAcw=true)]
		public sealed partial class IOError : global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.IOError']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper.IOError Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$IOError;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper.IOError> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$IOError", typeof (IOError));

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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.ServerError']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$ServerError", DoNotGenerateAcw=true)]
		public sealed partial class ServerError : global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.ServerError']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper.ServerError Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$ServerError;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper.ServerError> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$ServerError", typeof (ServerError));

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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.Success3ds']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$Success3ds", DoNotGenerateAcw=true)]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
		public sealed partial class Success3ds : global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$Success3ds", typeof (Success3ds));

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

			internal Success3ds (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.Success3ds']/constructor[@name='TransactionResponseWrapper.Success3ds' and count(parameter)=1 and parameter[1][@type='T']]"
			[Register (".ctor", "(Ljava/lang/Object;)V", "")]
			public unsafe Success3ds (global::Java.Lang.Object data) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.Success3ds']/method[@name='getData' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.SuccessWithout3ds']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$SuccessWithout3ds", DoNotGenerateAcw=true)]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
		public sealed partial class SuccessWithout3ds : global::Com.Payment.Paymentsdk.Sharedclasses.Model.TransactionResponseWrapper {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper$SuccessWithout3ds", typeof (SuccessWithout3ds));

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

			internal SuccessWithout3ds (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.SuccessWithout3ds']/constructor[@name='TransactionResponseWrapper.SuccessWithout3ds' and count(parameter)=1 and parameter[1][@type='T']]"
			[Register (".ctor", "(Ljava/lang/Object;)V", "")]
			public unsafe SuccessWithout3ds (global::Java.Lang.Object data) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper.SuccessWithout3ds']/method[@name='getData' and count(parameter)=0]"
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

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper", typeof (TransactionResponseWrapper));

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

		protected TransactionResponseWrapper (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model']/class[@name='TransactionResponseWrapper']/constructor[@name='TransactionResponseWrapper' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
		[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
		public unsafe TransactionResponseWrapper (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper", DoNotGenerateAcw=true)]
	internal partial class TransactionResponseWrapperInvoker : TransactionResponseWrapper {
		public TransactionResponseWrapperInvoker (IntPtr handle, JniHandleOwnership transfer) : base (handle, transfer)
		{
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/TransactionResponseWrapper", typeof (TransactionResponseWrapperInvoker));

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
