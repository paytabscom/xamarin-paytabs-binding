using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkLanguageCode : global::Java.Lang.Enum, global::Android.OS.IParcelable {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/field[@name='AR']"
		[Register ("AR")]
		public static global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode Ar {
			get {
				const string __id = "AR.Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}


		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/field[@name='DEFAULT']"
		[Register ("DEFAULT")]
		public static global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode Default {
			get {
				const string __id = "DEFAULT.Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}


		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/field[@name='EN']"
		[Register ("EN")]
		public static global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode En {
			get {
				const string __id = "EN.Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode.Creator']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode$Creator", DoNotGenerateAcw=true)]
		public sealed partial class Creator : global::Java.Lang.Object, global::Android.OS.IParcelableCreator {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode$Creator", typeof (Creator));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode.Creator']/constructor[@name='PaymentSdkLanguageCode.Creator' and count(parameter)=0]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode.Creator']/method[@name='createFromParcel' and count(parameter)=1 and parameter[1][@type='android.os.Parcel']]"
			[Register ("createFromParcel", "(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
			public unsafe global::Java.Lang.Object CreateFromParcel (global::Android.OS.Parcel @in)
			{
				const string __id = "createFromParcel.(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((@in == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @in).Handle);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					global::System.GC.KeepAlive (@in);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode.Creator']/method[@name='newArray' and count(parameter)=1 and parameter[1][@type='int']]"
			[Register ("newArray", "(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
			public unsafe global::Java.Lang.Object[] NewArray (int size)
			{
				const string __id = "newArray.(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (size);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode));
				} finally {
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode", typeof (PaymentSdkLanguageCode));

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

		internal PaymentSdkLanguageCode (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/method[@name='describeContents' and count(parameter)=0]"
		[Register ("describeContents", "()I", "")]
		public unsafe int DescribeContents ()
		{
			const string __id = "describeContents.()I";
			try {
				var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/method[@name='valueOf' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("valueOf", "(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode ValueOf (string p0)
		{
			const string __id = "valueOf.(Ljava/lang/String;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_p0);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/method[@name='values' and count(parameter)=0]"
		[Register ("values", "()[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode[] Values ()
		{
			const string __id = "values.()[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode));
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkLanguageCode']/method[@name='writeToParcel' and count(parameter)=2 and parameter[1][@type='android.os.Parcel'] and parameter[2][@type='int']]"
		[Register ("writeToParcel", "(Landroid/os/Parcel;I)V", "")]
		public unsafe void WriteToParcel (global::Android.OS.Parcel parcel, [global::Android.Runtime.GeneratedEnum] global::Android.OS.ParcelableWriteFlags flags)
		{
			const string __id = "writeToParcel.(Landroid/os/Parcel;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((parcel == null) ? IntPtr.Zero : ((global::Java.Lang.Object) parcel).Handle);
				__args [1] = new JniArgumentValue ((int) flags);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (parcel);
			}
		}

	}
}
