using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Base {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails", DoNotGenerateAcw=true)]
	public partial class BaseBillingShippingDetails : global::Java.Lang.Object, global::Android.OS.IParcelable {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails.Creator']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails$Creator", DoNotGenerateAcw=true)]
		public sealed partial class Creator : global::Java.Lang.Object, global::Android.OS.IParcelableCreator {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails$Creator", typeof (Creator));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails.Creator']/constructor[@name='BaseBillingShippingDetails.Creator' and count(parameter)=0]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails.Creator']/method[@name='createFromParcel' and count(parameter)=1 and parameter[1][@type='android.os.Parcel']]"
			[Register ("createFromParcel", "(Landroid/os/Parcel;)Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;", "")]
			public unsafe global::Java.Lang.Object CreateFromParcel (global::Android.OS.Parcel @in)
			{
				const string __id = "createFromParcel.(Landroid/os/Parcel;)Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((@in == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @in).Handle);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					global::System.GC.KeepAlive (@in);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails.Creator']/method[@name='newArray' and count(parameter)=1 and parameter[1][@type='int']]"
			[Register ("newArray", "(I)[Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;", "")]
			public unsafe global::Java.Lang.Object[] NewArray (int size)
			{
				const string __id = "newArray.(I)[Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (size);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return (global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails));
				} finally {
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails", typeof (BaseBillingShippingDetails));

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

		protected BaseBillingShippingDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/constructor[@name='BaseBillingShippingDetails' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe BaseBillingShippingDetails () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/constructor[@name='BaseBillingShippingDetails' and count(parameter)=8 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='java.lang.String'] and parameter[6][@type='java.lang.String'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe BaseBillingShippingDetails (string city, string countryCode, string email, string name, string phone, string state, string addressLine, string zip) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_getAddressLine;
#pragma warning disable 0169
		static Delegate GetGetAddressLineHandler ()
		{
			if (cb_getAddressLine == null)
				cb_getAddressLine = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetAddressLine);
			return cb_getAddressLine;
		}

		static IntPtr n_GetAddressLine (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.AddressLine);
		}
#pragma warning restore 0169

		static Delegate cb_setAddressLine_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetAddressLine_Ljava_lang_String_Handler ()
		{
			if (cb_setAddressLine_Ljava_lang_String_ == null)
				cb_setAddressLine_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetAddressLine_Ljava_lang_String_);
			return cb_setAddressLine_Ljava_lang_String_;
		}

		static void n_SetAddressLine_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.AddressLine = value;
		}
#pragma warning restore 0169

		public virtual unsafe string AddressLine {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getAddressLine' and count(parameter)=0]"
			[Register ("getAddressLine", "()Ljava/lang/String;", "GetGetAddressLineHandler")]
			get {
				const string __id = "getAddressLine.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setAddressLine' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setAddressLine", "(Ljava/lang/String;)V", "GetSetAddressLine_Ljava_lang_String_Handler")]
			set {
				const string __id = "setAddressLine.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getCity;
#pragma warning disable 0169
		static Delegate GetGetCityHandler ()
		{
			if (cb_getCity == null)
				cb_getCity = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCity);
			return cb_getCity;
		}

		static IntPtr n_GetCity (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.City);
		}
#pragma warning restore 0169

		static Delegate cb_setCity_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCity_Ljava_lang_String_Handler ()
		{
			if (cb_setCity_Ljava_lang_String_ == null)
				cb_setCity_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCity_Ljava_lang_String_);
			return cb_setCity_Ljava_lang_String_;
		}

		static void n_SetCity_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.City = value;
		}
#pragma warning restore 0169

		public virtual unsafe string City {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getCity' and count(parameter)=0]"
			[Register ("getCity", "()Ljava/lang/String;", "GetGetCityHandler")]
			get {
				const string __id = "getCity.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setCity' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setCity", "(Ljava/lang/String;)V", "GetSetCity_Ljava_lang_String_Handler")]
			set {
				const string __id = "setCity.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getCountryCode;
#pragma warning disable 0169
		static Delegate GetGetCountryCodeHandler ()
		{
			if (cb_getCountryCode == null)
				cb_getCountryCode = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCountryCode);
			return cb_getCountryCode;
		}

		static IntPtr n_GetCountryCode (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CountryCode);
		}
#pragma warning restore 0169

		static Delegate cb_setCountryCode_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetCountryCode_Ljava_lang_String_Handler ()
		{
			if (cb_setCountryCode_Ljava_lang_String_ == null)
				cb_setCountryCode_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetCountryCode_Ljava_lang_String_);
			return cb_setCountryCode_Ljava_lang_String_;
		}

		static void n_SetCountryCode_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.CountryCode = value;
		}
#pragma warning restore 0169

		public virtual unsafe string CountryCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getCountryCode' and count(parameter)=0]"
			[Register ("getCountryCode", "()Ljava/lang/String;", "GetGetCountryCodeHandler")]
			get {
				const string __id = "getCountryCode.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setCountryCode' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setCountryCode", "(Ljava/lang/String;)V", "GetSetCountryCode_Ljava_lang_String_Handler")]
			set {
				const string __id = "setCountryCode.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getEmail;
#pragma warning disable 0169
		static Delegate GetGetEmailHandler ()
		{
			if (cb_getEmail == null)
				cb_getEmail = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetEmail);
			return cb_getEmail;
		}

		static IntPtr n_GetEmail (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Email);
		}
#pragma warning restore 0169

		static Delegate cb_setEmail_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetEmail_Ljava_lang_String_Handler ()
		{
			if (cb_setEmail_Ljava_lang_String_ == null)
				cb_setEmail_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetEmail_Ljava_lang_String_);
			return cb_setEmail_Ljava_lang_String_;
		}

		static void n_SetEmail_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.Email = value;
		}
#pragma warning restore 0169

		public virtual unsafe string Email {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getEmail' and count(parameter)=0]"
			[Register ("getEmail", "()Ljava/lang/String;", "GetGetEmailHandler")]
			get {
				const string __id = "getEmail.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setEmail' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setEmail", "(Ljava/lang/String;)V", "GetSetEmail_Ljava_lang_String_Handler")]
			set {
				const string __id = "setEmail.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getName;
#pragma warning disable 0169
		static Delegate GetGetNameHandler ()
		{
			if (cb_getName == null)
				cb_getName = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetName);
			return cb_getName;
		}

		static IntPtr n_GetName (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Name);
		}
#pragma warning restore 0169

		static Delegate cb_setName_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetName_Ljava_lang_String_Handler ()
		{
			if (cb_setName_Ljava_lang_String_ == null)
				cb_setName_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetName_Ljava_lang_String_);
			return cb_setName_Ljava_lang_String_;
		}

		static void n_SetName_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.Name = value;
		}
#pragma warning restore 0169

		public virtual unsafe string Name {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getName' and count(parameter)=0]"
			[Register ("getName", "()Ljava/lang/String;", "GetGetNameHandler")]
			get {
				const string __id = "getName.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setName' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setName", "(Ljava/lang/String;)V", "GetSetName_Ljava_lang_String_Handler")]
			set {
				const string __id = "setName.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getPhone;
#pragma warning disable 0169
		static Delegate GetGetPhoneHandler ()
		{
			if (cb_getPhone == null)
				cb_getPhone = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetPhone);
			return cb_getPhone;
		}

		static IntPtr n_GetPhone (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Phone);
		}
#pragma warning restore 0169

		static Delegate cb_setPhone_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetPhone_Ljava_lang_String_Handler ()
		{
			if (cb_setPhone_Ljava_lang_String_ == null)
				cb_setPhone_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetPhone_Ljava_lang_String_);
			return cb_setPhone_Ljava_lang_String_;
		}

		static void n_SetPhone_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.Phone = value;
		}
#pragma warning restore 0169

		public virtual unsafe string Phone {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getPhone' and count(parameter)=0]"
			[Register ("getPhone", "()Ljava/lang/String;", "GetGetPhoneHandler")]
			get {
				const string __id = "getPhone.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setPhone' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setPhone", "(Ljava/lang/String;)V", "GetSetPhone_Ljava_lang_String_Handler")]
			set {
				const string __id = "setPhone.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getState;
#pragma warning disable 0169
		static Delegate GetGetStateHandler ()
		{
			if (cb_getState == null)
				cb_getState = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetState);
			return cb_getState;
		}

		static IntPtr n_GetState (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.State);
		}
#pragma warning restore 0169

		static Delegate cb_setState_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetState_Ljava_lang_String_Handler ()
		{
			if (cb_setState_Ljava_lang_String_ == null)
				cb_setState_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetState_Ljava_lang_String_);
			return cb_setState_Ljava_lang_String_;
		}

		static void n_SetState_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.State = value;
		}
#pragma warning restore 0169

		public virtual unsafe string State {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getState' and count(parameter)=0]"
			[Register ("getState", "()Ljava/lang/String;", "GetGetStateHandler")]
			get {
				const string __id = "getState.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setState' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setState", "(Ljava/lang/String;)V", "GetSetState_Ljava_lang_String_Handler")]
			set {
				const string __id = "setState.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_getZip;
#pragma warning disable 0169
		static Delegate GetGetZipHandler ()
		{
			if (cb_getZip == null)
				cb_getZip = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetZip);
			return cb_getZip;
		}

		static IntPtr n_GetZip (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.Zip);
		}
#pragma warning restore 0169

		static Delegate cb_setZip_Ljava_lang_String_;
#pragma warning disable 0169
		static Delegate GetSetZip_Ljava_lang_String_Handler ()
		{
			if (cb_setZip_Ljava_lang_String_ == null)
				cb_setZip_Ljava_lang_String_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_V) n_SetZip_Ljava_lang_String_);
			return cb_setZip_Ljava_lang_String_;
		}

		static void n_SetZip_Ljava_lang_String_ (IntPtr jnienv, IntPtr native__this, IntPtr native_value)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var value = JNIEnv.GetString (native_value, JniHandleOwnership.DoNotTransfer);
			__this.Zip = value;
		}
#pragma warning restore 0169

		public virtual unsafe string Zip {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='getZip' and count(parameter)=0]"
			[Register ("getZip", "()Ljava/lang/String;", "GetGetZipHandler")]
			get {
				const string __id = "getZip.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='setZip' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setZip", "(Ljava/lang/String;)V", "GetSetZip_Ljava_lang_String_Handler")]
			set {
				const string __id = "setZip.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		static Delegate cb_describeContents;
#pragma warning disable 0169
		static Delegate GetDescribeContentsHandler ()
		{
			if (cb_describeContents == null)
				cb_describeContents = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_I) n_DescribeContents);
			return cb_describeContents;
		}

		static int n_DescribeContents (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.DescribeContents ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='describeContents' and count(parameter)=0]"
		[Register ("describeContents", "()I", "GetDescribeContentsHandler")]
		public virtual unsafe int DescribeContents ()
		{
			const string __id = "describeContents.()I";
			try {
				var __rm = _members.InstanceMethods.InvokeVirtualInt32Method (__id, this, null);
				return __rm;
			} finally {
			}
		}

		static Delegate cb_writeToParcel_Landroid_os_Parcel_I;
#pragma warning disable 0169
		static Delegate GetWriteToParcel_Landroid_os_Parcel_IHandler ()
		{
			if (cb_writeToParcel_Landroid_os_Parcel_I == null)
				cb_writeToParcel_Landroid_os_Parcel_I = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLI_V) n_WriteToParcel_Landroid_os_Parcel_I);
			return cb_writeToParcel_Landroid_os_Parcel_I;
		}

		static void n_WriteToParcel_Landroid_os_Parcel_I (IntPtr jnienv, IntPtr native__this, IntPtr native_parcel, int native_flags)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var parcel = global::Java.Lang.Object.GetObject<global::Android.OS.Parcel> (native_parcel, JniHandleOwnership.DoNotTransfer);
			var flags = (global::Android.OS.ParcelableWriteFlags) native_flags;
			__this.WriteToParcel (parcel, flags);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.base']/class[@name='BaseBillingShippingDetails']/method[@name='writeToParcel' and count(parameter)=2 and parameter[1][@type='android.os.Parcel'] and parameter[2][@type='int']]"
		[Register ("writeToParcel", "(Landroid/os/Parcel;I)V", "GetWriteToParcel_Landroid_os_Parcel_IHandler")]
		public virtual unsafe void WriteToParcel (global::Android.OS.Parcel parcel, [global::Android.Runtime.GeneratedEnum] global::Android.OS.ParcelableWriteFlags flags)
		{
			const string __id = "writeToParcel.(Landroid/os/Parcel;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((parcel == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parcel).Handle);
				__args [1] = new JniArgumentValue ((int) flags);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (parcel);
			}
		}

	}
}
