using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkBillingDetails : global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails, global::Android.OS.IParcelable {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails.Creator']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails$Creator", DoNotGenerateAcw=true)]
		public new sealed partial class Creator : global::Java.Lang.Object, global::Android.OS.IParcelableCreator {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails$Creator", typeof (Creator));

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

			internal Creator (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails.Creator']/constructor[@name='PaymentSdkBillingDetails.Creator' and count(parameter)=0]"
			[Register (".ctor", "()V", "")]
			public unsafe Creator () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails.Creator']/method[@name='createFromParcel' and count(parameter)=1 and parameter[1][@type='android.os.Parcel']]"
			[Register ("createFromParcel", "(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
			public unsafe global::Java.Lang.Object CreateFromParcel (global::Android.OS.Parcel @in)
			{
				const string __id = "createFromParcel.(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((@in == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @in).Handle);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					global::System.GC.KeepAlive (@in);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails.Creator']/method[@name='newArray' and count(parameter)=1 and parameter[1][@type='int']]"
			[Register ("newArray", "(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
			public unsafe global::Java.Lang.Object[] NewArray (int size)
			{
				const string __id = "newArray.(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (size);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails));
				} finally {
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails", typeof (PaymentSdkBillingDetails));

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

		internal PaymentSdkBillingDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/constructor[@name='PaymentSdkBillingDetails' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe PaymentSdkBillingDetails () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/constructor[@name='PaymentSdkBillingDetails' and count(parameter)=8 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe PaymentSdkBillingDetails (string city, string countryCode, string email, string name, string phone, string state, string addressLine, string zip) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_city = JNIEnv.NewString (city);
			IntPtr native_countryCode = JNIEnv.NewString (countryCode);
			IntPtr native_email = JNIEnv.NewString (email);
			IntPtr native_name = JNIEnv.NewString (name);
			IntPtr native_phone = JNIEnv.NewString (phone);
			IntPtr native_state = JNIEnv.NewString (state);
			IntPtr native_addressLine = JNIEnv.NewString (addressLine);
			IntPtr native_zip = JNIEnv.NewString (zip);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [8];
				__args [0] = new JniArgumentValue (native_city);
				__args [1] = new JniArgumentValue (native_countryCode);
				__args [2] = new JniArgumentValue (native_email);
				__args [3] = new JniArgumentValue (native_name);
				__args [4] = new JniArgumentValue (native_phone);
				__args [5] = new JniArgumentValue (native_state);
				__args [6] = new JniArgumentValue (native_addressLine);
				__args [7] = new JniArgumentValue (native_zip);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_city);
				JNIEnv.DeleteLocalRef (native_countryCode);
				JNIEnv.DeleteLocalRef (native_email);
				JNIEnv.DeleteLocalRef (native_name);
				JNIEnv.DeleteLocalRef (native_phone);
				JNIEnv.DeleteLocalRef (native_state);
				JNIEnv.DeleteLocalRef (native_addressLine);
				JNIEnv.DeleteLocalRef (native_zip);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component1' and count(parameter)=0]"
		[Register ("component1", "()Ljava/lang/String;", "")]
		public unsafe string Component1 ()
		{
			const string __id = "component1.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component2' and count(parameter)=0]"
		[Register ("component2", "()Ljava/lang/String;", "")]
		public unsafe string Component2 ()
		{
			const string __id = "component2.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component3' and count(parameter)=0]"
		[Register ("component3", "()Ljava/lang/String;", "")]
		public unsafe string Component3 ()
		{
			const string __id = "component3.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Ljava/lang/String;", "")]
		public unsafe string Component4 ()
		{
			const string __id = "component4.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component5' and count(parameter)=0]"
		[Register ("component5", "()Ljava/lang/String;", "")]
		public unsafe string Component5 ()
		{
			const string __id = "component5.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component6' and count(parameter)=0]"
		[Register ("component6", "()Ljava/lang/String;", "")]
		public unsafe string Component6 ()
		{
			const string __id = "component6.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component7' and count(parameter)=0]"
		[Register ("component7", "()Ljava/lang/String;", "")]
		public unsafe string Component7 ()
		{
			const string __id = "component7.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='component8' and count(parameter)=0]"
		[Register ("component8", "()Ljava/lang/String;", "")]
		public unsafe string Component8 ()
		{
			const string __id = "component8.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkBillingDetails']/method[@name='copy' and count(parameter)=8 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails Copy (string city, string countryCode, string email, string name, string phone, string state, string addressLine, string zip)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
			IntPtr native_city = JNIEnv.NewString (city);
			IntPtr native_countryCode = JNIEnv.NewString (countryCode);
			IntPtr native_email = JNIEnv.NewString (email);
			IntPtr native_name = JNIEnv.NewString (name);
			IntPtr native_phone = JNIEnv.NewString (phone);
			IntPtr native_state = JNIEnv.NewString (state);
			IntPtr native_addressLine = JNIEnv.NewString (addressLine);
			IntPtr native_zip = JNIEnv.NewString (zip);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [8];
				__args [0] = new JniArgumentValue (native_city);
				__args [1] = new JniArgumentValue (native_countryCode);
				__args [2] = new JniArgumentValue (native_email);
				__args [3] = new JniArgumentValue (native_name);
				__args [4] = new JniArgumentValue (native_phone);
				__args [5] = new JniArgumentValue (native_state);
				__args [6] = new JniArgumentValue (native_addressLine);
				__args [7] = new JniArgumentValue (native_zip);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_city);
				JNIEnv.DeleteLocalRef (native_countryCode);
				JNIEnv.DeleteLocalRef (native_email);
				JNIEnv.DeleteLocalRef (native_name);
				JNIEnv.DeleteLocalRef (native_phone);
				JNIEnv.DeleteLocalRef (native_state);
				JNIEnv.DeleteLocalRef (native_addressLine);
				JNIEnv.DeleteLocalRef (native_zip);
			}
		}

	}
}
