using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Model.Shared {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails", DoNotGenerateAcw=true)]
	public sealed partial class CustomerDetails : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails", typeof (CustomerDetails));

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

		internal CustomerDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/constructor[@name='CustomerDetails' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe CustomerDetails () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/constructor[@name='CustomerDetails' and count(parameter)=9 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe CustomerDetails (string city, string country, string email, string ip, string name, string phone, string state, string street1, string zip) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_city = JNIEnv.NewString (city);
			IntPtr native_country = JNIEnv.NewString (country);
			IntPtr native_email = JNIEnv.NewString (email);
			IntPtr native_ip = JNIEnv.NewString (ip);
			IntPtr native_name = JNIEnv.NewString (name);
			IntPtr native_phone = JNIEnv.NewString (phone);
			IntPtr native_state = JNIEnv.NewString (state);
			IntPtr native_street1 = JNIEnv.NewString (street1);
			IntPtr native_zip = JNIEnv.NewString (zip);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [9];
				__args [0] = new JniArgumentValue (native_city);
				__args [1] = new JniArgumentValue (native_country);
				__args [2] = new JniArgumentValue (native_email);
				__args [3] = new JniArgumentValue (native_ip);
				__args [4] = new JniArgumentValue (native_name);
				__args [5] = new JniArgumentValue (native_phone);
				__args [6] = new JniArgumentValue (native_state);
				__args [7] = new JniArgumentValue (native_street1);
				__args [8] = new JniArgumentValue (native_zip);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_city);
				JNIEnv.DeleteLocalRef (native_country);
				JNIEnv.DeleteLocalRef (native_email);
				JNIEnv.DeleteLocalRef (native_ip);
				JNIEnv.DeleteLocalRef (native_name);
				JNIEnv.DeleteLocalRef (native_phone);
				JNIEnv.DeleteLocalRef (native_state);
				JNIEnv.DeleteLocalRef (native_street1);
				JNIEnv.DeleteLocalRef (native_zip);
			}
		}

		public unsafe string City {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getCity' and count(parameter)=0]"
			[Register ("getCity", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCity.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Country {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getCountry' and count(parameter)=0]"
			[Register ("getCountry", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCountry.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Email {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getEmail' and count(parameter)=0]"
			[Register ("getEmail", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getEmail.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Ip {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getIp' and count(parameter)=0]"
			[Register ("getIp", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getIp.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Name {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getName' and count(parameter)=0]"
			[Register ("getName", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getName.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Phone {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getPhone' and count(parameter)=0]"
			[Register ("getPhone", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getPhone.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string State {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getState' and count(parameter)=0]"
			[Register ("getState", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getState.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Street1 {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getStreet1' and count(parameter)=0]"
			[Register ("getStreet1", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getStreet1.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Zip {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='getZip' and count(parameter)=0]"
			[Register ("getZip", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getZip.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component3' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component4' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component5' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component6' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component7' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component8' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='component9' and count(parameter)=0]"
		[Register ("component9", "()Ljava/lang/String;", "")]
		public unsafe string Component9 ()
		{
			const string __id = "component9.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.model.shared']/class[@name='CustomerDetails']/method[@name='copy' and count(parameter)=9 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails Copy (string city, string country, string email, string ip, string name, string phone, string state, string street1, string zip)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payment/paymentsdk/sharedclasses/model/shared/CustomerDetails;";
			IntPtr native_city = JNIEnv.NewString (city);
			IntPtr native_country = JNIEnv.NewString (country);
			IntPtr native_email = JNIEnv.NewString (email);
			IntPtr native_ip = JNIEnv.NewString (ip);
			IntPtr native_name = JNIEnv.NewString (name);
			IntPtr native_phone = JNIEnv.NewString (phone);
			IntPtr native_state = JNIEnv.NewString (state);
			IntPtr native_street1 = JNIEnv.NewString (street1);
			IntPtr native_zip = JNIEnv.NewString (zip);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [9];
				__args [0] = new JniArgumentValue (native_city);
				__args [1] = new JniArgumentValue (native_country);
				__args [2] = new JniArgumentValue (native_email);
				__args [3] = new JniArgumentValue (native_ip);
				__args [4] = new JniArgumentValue (native_name);
				__args [5] = new JniArgumentValue (native_phone);
				__args [6] = new JniArgumentValue (native_state);
				__args [7] = new JniArgumentValue (native_street1);
				__args [8] = new JniArgumentValue (native_zip);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Model.Shared.CustomerDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_city);
				JNIEnv.DeleteLocalRef (native_country);
				JNIEnv.DeleteLocalRef (native_email);
				JNIEnv.DeleteLocalRef (native_ip);
				JNIEnv.DeleteLocalRef (native_name);
				JNIEnv.DeleteLocalRef (native_phone);
				JNIEnv.DeleteLocalRef (native_state);
				JNIEnv.DeleteLocalRef (native_street1);
				JNIEnv.DeleteLocalRef (native_zip);
			}
		}

	}
}
