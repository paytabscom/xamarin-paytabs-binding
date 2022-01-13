using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Sealed {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed", DoNotGenerateAcw=true)]
	public abstract partial class BillingDataValidatorSealed : global::Java.Lang.Object {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCity']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingCity", DoNotGenerateAcw=true)]
		public sealed partial class BillingCity : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingCity", typeof (BillingCity));

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

			internal BillingCity (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCity']/constructor[@name='BillingDataValidatorSealed.BillingCity' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingCity (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCity']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCountry']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingCountry", DoNotGenerateAcw=true)]
		public sealed partial class BillingCountry : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingCountry", typeof (BillingCountry));

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

			internal BillingCountry (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCountry']/constructor[@name='BillingDataValidatorSealed.BillingCountry' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingCountry (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingCountry']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingEmail']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingEmail", DoNotGenerateAcw=true)]
		public sealed partial class BillingEmail : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingEmail", typeof (BillingEmail));

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

			internal BillingEmail (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingEmail']/constructor[@name='BillingDataValidatorSealed.BillingEmail' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingEmail (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingEmail']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingIp']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingIp", DoNotGenerateAcw=true)]
		public sealed partial class BillingIp : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingIp", typeof (BillingIp));

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

			internal BillingIp (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingIp']/constructor[@name='BillingDataValidatorSealed.BillingIp' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingIp (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingIp']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingName']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingName", DoNotGenerateAcw=true)]
		public sealed partial class BillingName : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingName", typeof (BillingName));

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

			internal BillingName (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingName']/constructor[@name='BillingDataValidatorSealed.BillingName' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingName (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingName']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingPhone']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingPhone", DoNotGenerateAcw=true)]
		public sealed partial class BillingPhone : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingPhone", typeof (BillingPhone));

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

			internal BillingPhone (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingPhone']/constructor[@name='BillingDataValidatorSealed.BillingPhone' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingPhone (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingPhone']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingState']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingState", DoNotGenerateAcw=true)]
		public sealed partial class BillingState : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingState", typeof (BillingState));

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

			internal BillingState (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingState']/constructor[@name='BillingDataValidatorSealed.BillingState' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingState (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingState']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingStreet']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingStreet", DoNotGenerateAcw=true)]
		public sealed partial class BillingStreet : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingStreet", typeof (BillingStreet));

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

			internal BillingStreet (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingStreet']/constructor[@name='BillingDataValidatorSealed.BillingStreet' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingStreet (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingStreet']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingZip']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingZip", DoNotGenerateAcw=true)]
		public sealed partial class BillingZip : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$BillingZip", typeof (BillingZip));

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

			internal BillingZip (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingZip']/constructor[@name='BillingDataValidatorSealed.BillingZip' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe BillingZip (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Z)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (isEmpty);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
				}
			}

			public unsafe bool IsEmpty {
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.BillingZip']/method[@name='isEmpty' and count(parameter)=0]"
				[Register ("isEmpty", "()Z", "")]
				get {
					const string __id = "isEmpty.()Z";
					try {
						var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
						return __rm;
					} finally {
					}
				}
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.ObjectNull']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$ObjectNull", DoNotGenerateAcw=true)]
		public sealed partial class ObjectNull : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed.ObjectNull']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed.ObjectNull Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$ObjectNull;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.BillingDataValidatorSealed.ObjectNull> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed$ObjectNull", typeof (ObjectNull));

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

			internal ObjectNull (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed", typeof (BillingDataValidatorSealed));

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

		protected BillingDataValidatorSealed (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='BillingDataValidatorSealed']/constructor[@name='BillingDataValidatorSealed' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
		[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
		public unsafe BillingDataValidatorSealed (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed", DoNotGenerateAcw=true)]
	internal partial class BillingDataValidatorSealedInvoker : BillingDataValidatorSealed {
		public BillingDataValidatorSealedInvoker (IntPtr handle, JniHandleOwnership transfer) : base (handle, transfer)
		{
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/BillingDataValidatorSealed", typeof (BillingDataValidatorSealedInvoker));

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
