using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/Card", DoNotGenerateAcw=true)]
	public partial class Card : global::Java.Lang.Object, global::Android.OS.IParcelable, global::Java.IO.ISerializable {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/field[@name='CREATOR']"
		[Register ("CREATOR")]
		public static global::Android.OS.IParcelableCreator Creator {
			get {
				const string __id = "CREATOR.Landroid/os/Parcelable$Creator;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Android.OS.IParcelableCreator> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/Card", typeof (Card));

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

		protected Card (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/constructor[@name='Card' and count(parameter)=1 and parameter[1][@type='android.os.Parcel']]"
		[Register (".ctor", "(Landroid/os/Parcel;)V", "")]
		protected unsafe Card (global::Android.OS.Parcel @in) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/os/Parcel;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((@in == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @in).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (@in);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/constructor[@name='Card' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "")]
		public unsafe Card (string number, string holder, string expirationDate) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_number = JNIEnv.NewString (number);
			IntPtr native_holder = JNIEnv.NewString (holder);
			IntPtr native_expirationDate = JNIEnv.NewString (expirationDate);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_number);
				__args [1] = new JniArgumentValue (native_holder);
				__args [2] = new JniArgumentValue (native_expirationDate);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_number);
				JNIEnv.DeleteLocalRef (native_holder);
				JNIEnv.DeleteLocalRef (native_expirationDate);
			}
		}

		static Delegate cb_getCardHolderName;
#pragma warning disable 0169
		static Delegate GetGetCardHolderNameHandler ()
		{
			if (cb_getCardHolderName == null)
				cb_getCardHolderName = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardHolderName);
			return cb_getCardHolderName;
		}

		static IntPtr n_GetCardHolderName (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CardHolderName);
		}
#pragma warning restore 0169

		public virtual unsafe string CardHolderName {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='getCardHolderName' and count(parameter)=0]"
			[Register ("getCardHolderName", "()Ljava/lang/String;", "GetGetCardHolderNameHandler")]
			get {
				const string __id = "getCardHolderName.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCardNumber;
#pragma warning disable 0169
		static Delegate GetGetCardNumberHandler ()
		{
			if (cb_getCardNumber == null)
				cb_getCardNumber = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardNumber);
			return cb_getCardNumber;
		}

		static IntPtr n_GetCardNumber (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CardNumber);
		}
#pragma warning restore 0169

		public virtual unsafe string CardNumber {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='getCardNumber' and count(parameter)=0]"
			[Register ("getCardNumber", "()Ljava/lang/String;", "GetGetCardNumberHandler")]
			get {
				const string __id = "getCardNumber.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getCardNumberRedacted;
#pragma warning disable 0169
		static Delegate GetGetCardNumberRedactedHandler ()
		{
			if (cb_getCardNumberRedacted == null)
				cb_getCardNumberRedacted = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetCardNumberRedacted);
			return cb_getCardNumberRedacted;
		}

		static IntPtr n_GetCardNumberRedacted (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.CardNumberRedacted);
		}
#pragma warning restore 0169

		public virtual unsafe string CardNumberRedacted {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='getCardNumberRedacted' and count(parameter)=0]"
			[Register ("getCardNumberRedacted", "()Ljava/lang/String;", "GetGetCardNumberRedactedHandler")]
			get {
				const string __id = "getCardNumberRedacted.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		static Delegate cb_getExpirationDate;
#pragma warning disable 0169
		static Delegate GetGetExpirationDateHandler ()
		{
			if (cb_getExpirationDate == null)
				cb_getExpirationDate = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_GetExpirationDate);
			return cb_getExpirationDate;
		}

		static IntPtr n_GetExpirationDate (IntPtr jnienv, IntPtr native__this)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return JNIEnv.NewString (__this.ExpirationDate);
		}
#pragma warning restore 0169

		public virtual unsafe string ExpirationDate {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='getExpirationDate' and count(parameter)=0]"
			[Register ("getExpirationDate", "()Ljava/lang/String;", "GetGetExpirationDateHandler")]
			get {
				const string __id = "getExpirationDate.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeVirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
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
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			return __this.DescribeContents ();
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='describeContents' and count(parameter)=0]"
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

		static void n_WriteToParcel_Landroid_os_Parcel_I (IntPtr jnienv, IntPtr native__this, IntPtr native_dest, int native_flags)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Card> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var dest = global::Java.Lang.Object.GetObject<global::Android.OS.Parcel> (native_dest, JniHandleOwnership.DoNotTransfer);
			var flags = (global::Android.OS.ParcelableWriteFlags) native_flags;
			__this.WriteToParcel (dest, flags);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='Card']/method[@name='writeToParcel' and count(parameter)=2 and parameter[1][@type='android.os.Parcel'] and parameter[2][@type='int']]"
		[Register ("writeToParcel", "(Landroid/os/Parcel;I)V", "GetWriteToParcel_Landroid_os_Parcel_IHandler")]
		public virtual unsafe void WriteToParcel (global::Android.OS.Parcel dest, [global::Android.Runtime.GeneratedEnum] global::Android.OS.ParcelableWriteFlags flags)
		{
			const string __id = "writeToParcel.(Landroid/os/Parcel;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((dest == null) ? IntPtr.Zero : ((global::Java.Lang.Object) dest).Handle);
				__args [1] = new JniArgumentValue ((int) flags);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (dest);
			}
		}

	}
}
