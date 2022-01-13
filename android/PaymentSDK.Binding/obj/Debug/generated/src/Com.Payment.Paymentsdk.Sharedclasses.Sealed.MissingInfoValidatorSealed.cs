using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Sealed {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed", DoNotGenerateAcw=true)]
	public abstract partial class MissingInfoValidatorSealed : global::Java.Lang.Object {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.AllValid']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$AllValid", DoNotGenerateAcw=true)]
		public sealed partial class AllValid : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.AllValid']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed.AllValid Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$AllValid;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed.AllValid> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$AllValid", typeof (AllValid));

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

			internal AllValid (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.City']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$City", DoNotGenerateAcw=true)]
		public sealed partial class City : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$City", typeof (City));

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

			internal City (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.City']/constructor[@name='MissingInfoValidatorSealed.City' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe City (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.City']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Country']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Country", DoNotGenerateAcw=true)]
		public sealed partial class Country : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Country", typeof (Country));

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

			internal Country (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Country']/constructor[@name='MissingInfoValidatorSealed.Country' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Country (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Country']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Email']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Email", DoNotGenerateAcw=true)]
		public sealed partial class Email : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Email", typeof (Email));

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

			internal Email (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Email']/constructor[@name='MissingInfoValidatorSealed.Email' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Email (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Email']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Name']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Name", DoNotGenerateAcw=true)]
		public sealed partial class Name : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Name", typeof (Name));

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

			internal Name (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Name']/constructor[@name='MissingInfoValidatorSealed.Name' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Name (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Name']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.ObjectNull']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$ObjectNull", DoNotGenerateAcw=true)]
		public sealed partial class ObjectNull : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {

			// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.ObjectNull']/field[@name='INSTANCE']"
			[Register ("INSTANCE")]
			public static global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed.ObjectNull Instance {
				get {
					const string __id = "INSTANCE.Lcom/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$ObjectNull;";

					var __v = _members.StaticFields.GetObjectValue (__id);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed.ObjectNull> (__v.Handle, JniHandleOwnership.TransferLocalRef);
				}
			}

			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$ObjectNull", typeof (ObjectNull));

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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Phone']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Phone", DoNotGenerateAcw=true)]
		public sealed partial class Phone : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Phone", typeof (Phone));

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

			internal Phone (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Phone']/constructor[@name='MissingInfoValidatorSealed.Phone' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Phone (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Phone']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.State']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$State", DoNotGenerateAcw=true)]
		public sealed partial class State : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$State", typeof (State));

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

			internal State (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.State']/constructor[@name='MissingInfoValidatorSealed.State' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe State (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.State']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Street']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Street", DoNotGenerateAcw=true)]
		public sealed partial class Street : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Street", typeof (Street));

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

			internal Street (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Street']/constructor[@name='MissingInfoValidatorSealed.Street' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Street (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Street']/method[@name='isEmpty' and count(parameter)=0]"
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

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Zip']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Zip", DoNotGenerateAcw=true)]
		public sealed partial class Zip : global::Com.Payment.Paymentsdk.Sharedclasses.Sealed.MissingInfoValidatorSealed {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed$Zip", typeof (Zip));

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

			internal Zip (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Zip']/constructor[@name='MissingInfoValidatorSealed.Zip' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register (".ctor", "(Z)V", "")]
			public unsafe Zip (bool isEmpty) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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
				// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed.Zip']/method[@name='isEmpty' and count(parameter)=0]"
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

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed", typeof (MissingInfoValidatorSealed));

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

		protected MissingInfoValidatorSealed (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.sealed']/class[@name='MissingInfoValidatorSealed']/constructor[@name='MissingInfoValidatorSealed' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
		[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
		public unsafe MissingInfoValidatorSealed (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed", DoNotGenerateAcw=true)]
	internal partial class MissingInfoValidatorSealedInvoker : MissingInfoValidatorSealed {
		public MissingInfoValidatorSealedInvoker (IntPtr handle, JniHandleOwnership transfer) : base (handle, transfer)
		{
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/sealed/MissingInfoValidatorSealed", typeof (MissingInfoValidatorSealedInvoker));

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
