using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Integrationmodels {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkConfigurationDetails : global::Java.Lang.Object, global::Android.OS.IParcelable {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails.Creator']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails$Creator", DoNotGenerateAcw=true)]
		public sealed partial class Creator : global::Java.Lang.Object, global::Android.OS.IParcelableCreator {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails$Creator", typeof (Creator));

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

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails.Creator']/constructor[@name='PaymentSdkConfigurationDetails.Creator' and count(parameter)=0]"
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails.Creator']/method[@name='createFromParcel' and count(parameter)=1 and parameter[1][@type='android.os.Parcel']]"
			[Register ("createFromParcel", "(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "")]
			public unsafe global::Java.Lang.Object CreateFromParcel (global::Android.OS.Parcel p0)
			{
				const string __id = "createFromParcel.(Landroid/os/Parcel;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
					global::System.GC.KeepAlive (p0);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails.Creator']/method[@name='newArray' and count(parameter)=1 and parameter[1][@type='int']]"
			[Register ("newArray", "(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "")]
			public unsafe global::Java.Lang.Object[] NewArray (int p0)
			{
				const string __id = "newArray.(I)[Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (p0);
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
					return (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails));
				} finally {
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails", typeof (PaymentSdkConfigurationDetails));

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

		internal PaymentSdkConfigurationDetails (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/constructor[@name='PaymentSdkConfigurationDetails' and count(parameter)=31 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[5][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails'] and parameter[6][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkLanguageCode'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.Double'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTokenise'] and parameter[16][@type='java.lang.String'] and parameter[17][@type='java.lang.String'] and parameter[18][@type='java.lang.String'] and parameter[19][@type='android.graphics.Bitmap'] and parameter[20][@type='java.lang.String'] and parameter[21][@type='java.lang.Boolean'] and parameter[22][@type='java.lang.Boolean'] and parameter[23][@type='java.lang.Boolean'] and parameter[24][@type='java.lang.String'] and parameter[25][@type='boolean'] and parameter[26][@type='java.util.List&lt;? extends com.payment.paymentsdk.integrationmodels.PaymentSdkApms&gt;'] and parameter[27][@type='java.lang.Boolean'] and parameter[28][@type='java.lang.String'] and parameter[29][@type='boolean'] and parameter[30][@type='boolean'] and parameter[31][@type='com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo']]"
		[Register (".ctor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)V", "")]
		public unsafe PaymentSdkConfigurationDetails (string p0, string p1, string p2, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails p3, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails p4, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode p5, string p6, string p7, string p8, string p9, string p10, global::Java.Lang.Double p11, string p12, string p13, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise p14, string p15, string p16, string p17, global::Android.Graphics.Bitmap p18, string p19, global::Java.Lang.Boolean p20, global::Java.Lang.Boolean p21, global::Java.Lang.Boolean p22, string p23, bool p24, global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> p25, global::Java.Lang.Boolean p26, string p27, bool p28, bool p29, global::Com.Payment.Paymentsdk.Save_cards.Entities.PaymentSDKSavedCardInfo p30) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_p0 = JNIEnv.NewString (p0);
			IntPtr native_p1 = JNIEnv.NewString (p1);
			IntPtr native_p2 = JNIEnv.NewString (p2);
			IntPtr native_p6 = JNIEnv.NewString (p6);
			IntPtr native_p7 = JNIEnv.NewString (p7);
			IntPtr native_p8 = JNIEnv.NewString (p8);
			IntPtr native_p9 = JNIEnv.NewString (p9);
			IntPtr native_p10 = JNIEnv.NewString (p10);
			IntPtr native_p12 = JNIEnv.NewString (p12);
			IntPtr native_p13 = JNIEnv.NewString (p13);
			IntPtr native_p15 = JNIEnv.NewString (p15);
			IntPtr native_p16 = JNIEnv.NewString (p16);
			IntPtr native_p17 = JNIEnv.NewString (p17);
			IntPtr native_p19 = JNIEnv.NewString (p19);
			IntPtr native_p23 = JNIEnv.NewString (p23);
			IntPtr native_p25 = global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.ToLocalJniHandle (p25);
			IntPtr native_p27 = JNIEnv.NewString (p27);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [31];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (native_p1);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue ((p3 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p3).Handle);
				__args [4] = new JniArgumentValue ((p4 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p4).Handle);
				__args [5] = new JniArgumentValue ((p5 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p5).Handle);
				__args [6] = new JniArgumentValue (native_p6);
				__args [7] = new JniArgumentValue (native_p7);
				__args [8] = new JniArgumentValue (native_p8);
				__args [9] = new JniArgumentValue (native_p9);
				__args [10] = new JniArgumentValue (native_p10);
				__args [11] = new JniArgumentValue ((p11 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p11).Handle);
				__args [12] = new JniArgumentValue (native_p12);
				__args [13] = new JniArgumentValue (native_p13);
				__args [14] = new JniArgumentValue ((p14 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p14).Handle);
				__args [15] = new JniArgumentValue (native_p15);
				__args [16] = new JniArgumentValue (native_p16);
				__args [17] = new JniArgumentValue (native_p17);
				__args [18] = new JniArgumentValue ((p18 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p18).Handle);
				__args [19] = new JniArgumentValue (native_p19);
				__args [20] = new JniArgumentValue ((p20 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p20).Handle);
				__args [21] = new JniArgumentValue ((p21 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p21).Handle);
				__args [22] = new JniArgumentValue ((p22 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p22).Handle);
				__args [23] = new JniArgumentValue (native_p23);
				__args [24] = new JniArgumentValue (p24);
				__args [25] = new JniArgumentValue (native_p25);
				__args [26] = new JniArgumentValue ((p26 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p26).Handle);
				__args [27] = new JniArgumentValue (native_p27);
				__args [28] = new JniArgumentValue (p28);
				__args [29] = new JniArgumentValue (p29);
				__args [30] = new JniArgumentValue ((p30 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p30).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				JNIEnv.DeleteLocalRef (native_p1);
				JNIEnv.DeleteLocalRef (native_p2);
				JNIEnv.DeleteLocalRef (native_p6);
				JNIEnv.DeleteLocalRef (native_p7);
				JNIEnv.DeleteLocalRef (native_p8);
				JNIEnv.DeleteLocalRef (native_p9);
				JNIEnv.DeleteLocalRef (native_p10);
				JNIEnv.DeleteLocalRef (native_p12);
				JNIEnv.DeleteLocalRef (native_p13);
				JNIEnv.DeleteLocalRef (native_p15);
				JNIEnv.DeleteLocalRef (native_p16);
				JNIEnv.DeleteLocalRef (native_p17);
				JNIEnv.DeleteLocalRef (native_p19);
				JNIEnv.DeleteLocalRef (native_p23);
				JNIEnv.DeleteLocalRef (native_p25);
				JNIEnv.DeleteLocalRef (native_p27);
				global::System.GC.KeepAlive (p3);
				global::System.GC.KeepAlive (p4);
				global::System.GC.KeepAlive (p5);
				global::System.GC.KeepAlive (p11);
				global::System.GC.KeepAlive (p14);
				global::System.GC.KeepAlive (p18);
				global::System.GC.KeepAlive (p20);
				global::System.GC.KeepAlive (p21);
				global::System.GC.KeepAlive (p22);
				global::System.GC.KeepAlive (p25);
				global::System.GC.KeepAlive (p26);
				global::System.GC.KeepAlive (p30);
			}
		}

		public unsafe global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> AlternativePaymentMethods {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getAlternativePaymentMethods' and count(parameter)=0]"
			[Register ("getAlternativePaymentMethods", "()Ljava/util/List;", "")]
			get {
				const string __id = "getAlternativePaymentMethods.()Ljava/util/List;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Double Amount {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getAmount' and count(parameter)=0]"
			[Register ("getAmount", "()Ljava/lang/Double;", "")]
			get {
				const string __id = "getAmount.()Ljava/lang/Double;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Double> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails BillingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getBillingDetails' and count(parameter)=0]"
			[Register ("getBillingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
			get {
				const string __id = "getBillingDetails.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string Callback {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getCallback' and count(parameter)=0]"
			[Register ("getCallback", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCallback.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='setCallback' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
			[Register ("setCallback", "(Ljava/lang/String;)V", "")]
			set {
				const string __id = "setCallback.(Ljava/lang/String;)V";
				IntPtr native_value = JNIEnv.NewString (value);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (native_value);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_value);
				}
			}
		}

		public unsafe string CartDescription {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getCartDescription' and count(parameter)=0]"
			[Register ("getCartDescription", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartDescription.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CartId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getCartId' and count(parameter)=0]"
			[Register ("getCartId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCartId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ClientKey {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getClientKey' and count(parameter)=0]"
			[Register ("getClientKey", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getClientKey.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CurrencyCode {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getCurrencyCode' and count(parameter)=0]"
			[Register ("getCurrencyCode", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCurrencyCode.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string CustomerIp {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getCustomerIp' and count(parameter)=0]"
			[Register ("getCustomerIp", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getCustomerIp.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Boolean ForceShippingInfoValidation {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getForceShippingInfoValidation' and count(parameter)=0]"
			[Register ("getForceShippingInfoValidation", "()Ljava/lang/Boolean;", "")]
			get {
				const string __id = "getForceShippingInfoValidation.()Ljava/lang/Boolean;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe bool HideCardScanner {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getHideCardScanner' and count(parameter)=0]"
			[Register ("getHideCardScanner", "()Z", "")]
			get {
				const string __id = "getHideCardScanner.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Boolean LinkBillingNameWithCardHolderName {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getLinkBillingNameWithCardHolderName' and count(parameter)=0]"
			[Register ("getLinkBillingNameWithCardHolderName", "()Ljava/lang/Boolean;", "")]
			get {
				const string __id = "getLinkBillingNameWithCardHolderName.()Ljava/lang/Boolean;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='setLinkBillingNameWithCardHolderName' and count(parameter)=1 and parameter[1][@type='java.lang.Boolean']]"
			[Register ("setLinkBillingNameWithCardHolderName", "(Ljava/lang/Boolean;)V", "")]
			set {
				const string __id = "setLinkBillingNameWithCardHolderName.(Ljava/lang/Boolean;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode Locale {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getLocale' and count(parameter)=0]"
			[Register ("getLocale", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
			get {
				const string __id = "getLocale.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Android.Graphics.Bitmap LogoBitmap {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getLogoBitmap' and count(parameter)=0]"
			[Register ("getLogoBitmap", "()Landroid/graphics/Bitmap;", "")]
			get {
				const string __id = "getLogoBitmap.()Landroid/graphics/Bitmap;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Android.Graphics.Bitmap> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string LogoUrl {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getLogoUrl' and count(parameter)=0]"
			[Register ("getLogoUrl", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getLogoUrl.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string MerchantCountry {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getMerchantCountry' and count(parameter)=0]"
			[Register ("getMerchantCountry", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getMerchantCountry.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ProfileId {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getProfileId' and count(parameter)=0]"
			[Register ("getProfileId", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getProfileId.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ScreenTitle {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getScreenTitle' and count(parameter)=0]"
			[Register ("getScreenTitle", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getScreenTitle.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string ServerKey {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getServerKey' and count(parameter)=0]"
			[Register ("getServerKey", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getServerKey.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails ShippingDetails {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getShippingDetails' and count(parameter)=0]"
			[Register ("getShippingDetails", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "")]
			get {
				const string __id = "getShippingDetails.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Java.Lang.Boolean ShowBillingInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getShowBillingInfo' and count(parameter)=0]"
			[Register ("getShowBillingInfo", "()Ljava/lang/Boolean;", "")]
			get {
				const string __id = "getShowBillingInfo.()Ljava/lang/Boolean;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='setShowBillingInfo' and count(parameter)=1 and parameter[1][@type='java.lang.Boolean']]"
			[Register ("setShowBillingInfo", "(Ljava/lang/Boolean;)V", "")]
			set {
				const string __id = "setShowBillingInfo.(Ljava/lang/Boolean;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe global::Java.Lang.Boolean ShowShippingInfo {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getShowShippingInfo' and count(parameter)=0]"
			[Register ("getShowShippingInfo", "()Ljava/lang/Boolean;", "")]
			get {
				const string __id = "getShowShippingInfo.()Ljava/lang/Boolean;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='setShowShippingInfo' and count(parameter)=1 and parameter[1][@type='java.lang.Boolean']]"
			[Register ("setShowShippingInfo", "(Ljava/lang/Boolean;)V", "")]
			set {
				const string __id = "setShowShippingInfo.(Ljava/lang/Boolean;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((value == null) ? IntPtr.Zero : ((global::Java.Lang.Object) value).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (value);
				}
			}
		}

		public unsafe string Token {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getToken' and count(parameter)=0]"
			[Register ("getToken", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getToken.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TokenFormat {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getTokenFormat' and count(parameter)=0]"
			[Register ("getTokenFormat", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTokenFormat.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise TokeniseType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getTokeniseType' and count(parameter)=0]"
			[Register ("getTokeniseType", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "")]
			get {
				const string __id = "getTokeniseType.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionClass {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getTransactionClass' and count(parameter)=0]"
			[Register ("getTransactionClass", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionClass.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionReference {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getTransactionReference' and count(parameter)=0]"
			[Register ("getTransactionReference", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionReference.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe string TransactionType {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='getTransactionType' and count(parameter)=0]"
			[Register ("getTransactionType", "()Ljava/lang/String;", "")]
			get {
				const string __id = "getTransactionType.()Ljava/lang/String;";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
					return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component1' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component10' and count(parameter)=0]"
		[Register ("component10", "()Ljava/lang/String;", "")]
		public unsafe string Component10 ()
		{
			const string __id = "component10.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component11' and count(parameter)=0]"
		[Register ("component11", "()Ljava/lang/String;", "")]
		public unsafe string Component11 ()
		{
			const string __id = "component11.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component12' and count(parameter)=0]"
		[Register ("component12", "()Ljava/lang/Double;", "")]
		public unsafe global::Java.Lang.Double Component12 ()
		{
			const string __id = "component12.()Ljava/lang/Double;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Double> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component13' and count(parameter)=0]"
		[Register ("component13", "()Ljava/lang/String;", "")]
		public unsafe string Component13 ()
		{
			const string __id = "component13.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component14' and count(parameter)=0]"
		[Register ("component14", "()Ljava/lang/String;", "")]
		public unsafe string Component14 ()
		{
			const string __id = "component14.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component15' and count(parameter)=0]"
		[Register ("component15", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise Component15 ()
		{
			const string __id = "component15.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component16' and count(parameter)=0]"
		[Register ("component16", "()Ljava/lang/String;", "")]
		public unsafe string Component16 ()
		{
			const string __id = "component16.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component17' and count(parameter)=0]"
		[Register ("component17", "()Ljava/lang/String;", "")]
		public unsafe string Component17 ()
		{
			const string __id = "component17.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component18' and count(parameter)=0]"
		[Register ("component18", "()Ljava/lang/String;", "")]
		public unsafe string Component18 ()
		{
			const string __id = "component18.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component19' and count(parameter)=0]"
		[Register ("component19", "()Landroid/graphics/Bitmap;", "")]
		public unsafe global::Android.Graphics.Bitmap Component19 ()
		{
			const string __id = "component19.()Landroid/graphics/Bitmap;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Android.Graphics.Bitmap> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component2' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component20' and count(parameter)=0]"
		[Register ("component20", "()Ljava/lang/String;", "")]
		public unsafe string Component20 ()
		{
			const string __id = "component20.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component21' and count(parameter)=0]"
		[Register ("component21", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component21 ()
		{
			const string __id = "component21.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component22' and count(parameter)=0]"
		[Register ("component22", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component22 ()
		{
			const string __id = "component22.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component23' and count(parameter)=0]"
		[Register ("component23", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component23 ()
		{
			const string __id = "component23.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component24' and count(parameter)=0]"
		[Register ("component24", "()Ljava/lang/String;", "")]
		public unsafe string Component24 ()
		{
			const string __id = "component24.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component25' and count(parameter)=0]"
		[Register ("component25", "()Z", "")]
		public unsafe bool Component25 ()
		{
			const string __id = "component25.()Z";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component26' and count(parameter)=0]"
		[Register ("component26", "()Ljava/util/List;", "")]
		public unsafe global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> Component26 ()
		{
			const string __id = "component26.()Ljava/util/List;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.FromJniHandle (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component27' and count(parameter)=0]"
		[Register ("component27", "()Ljava/lang/Boolean;", "")]
		public unsafe global::Java.Lang.Boolean Component27 ()
		{
			const string __id = "component27.()Ljava/lang/Boolean;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Boolean> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component28' and count(parameter)=0]"
		[Register ("component28", "()Ljava/lang/String;", "")]
		public unsafe string Component28 ()
		{
			const string __id = "component28.()Ljava/lang/String;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component3' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component4' and count(parameter)=0]"
		[Register ("component4", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails Component4 ()
		{
			const string __id = "component4.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component5' and count(parameter)=0]"
		[Register ("component5", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails Component5 ()
		{
			const string __id = "component5.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component6' and count(parameter)=0]"
		[Register ("component6", "()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode Component6 ()
		{
			const string __id = "component6.()Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;";
			try {
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, null);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component7' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component8' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='component9' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='copy' and count(parameter)=31 and parameter[1][@type='java.lang.String'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails'] and parameter[5][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkShippingDetails'] and parameter[6][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkLanguageCode'] and parameter[7][@type='java.lang.String'] and parameter[8][@type='java.lang.String'] and parameter[9][@type='java.lang.String'] and parameter[10][@type='java.lang.String'] and parameter[11][@type='java.lang.String'] and parameter[12][@type='java.lang.Double'] and parameter[13][@type='java.lang.String'] and parameter[14][@type='java.lang.String'] and parameter[15][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTokenise'] and parameter[16][@type='java.lang.String'] and parameter[17][@type='java.lang.String'] and parameter[18][@type='java.lang.String'] and parameter[19][@type='android.graphics.Bitmap'] and parameter[20][@type='java.lang.String'] and parameter[21][@type='java.lang.Boolean'] and parameter[22][@type='java.lang.Boolean'] and parameter[23][@type='java.lang.Boolean'] and parameter[24][@type='java.lang.String'] and parameter[25][@type='boolean'] and parameter[26][@type='java.util.List&lt;? extends com.payment.paymentsdk.integrationmodels.PaymentSdkApms&gt;'] and parameter[27][@type='java.lang.Boolean'] and parameter[28][@type='java.lang.String'] and parameter[29][@type='boolean'] and parameter[30][@type='boolean'] and parameter[31][@type='com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo']]"
		[Register ("copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "")]
		public unsafe global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails Copy (string p0, string p1, string p2, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkBillingDetails p3, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkShippingDetails p4, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkLanguageCode p5, string p6, string p7, string p8, string p9, string p10, global::Java.Lang.Double p11, string p12, string p13, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTokenise p14, string p15, string p16, string p17, global::Android.Graphics.Bitmap p18, string p19, global::Java.Lang.Boolean p20, global::Java.Lang.Boolean p21, global::Java.Lang.Boolean p22, string p23, bool p24, global::System.Collections.Generic.IList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms> p25, global::Java.Lang.Boolean p26, string p27, bool p28, bool p29, global::Com.Payment.Paymentsdk.Save_cards.Entities.PaymentSDKSavedCardInfo p30)
		{
			const string __id = "copy.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkLanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;)Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;";
			IntPtr native_p0 = JNIEnv.NewString (p0);
			IntPtr native_p1 = JNIEnv.NewString (p1);
			IntPtr native_p2 = JNIEnv.NewString (p2);
			IntPtr native_p6 = JNIEnv.NewString (p6);
			IntPtr native_p7 = JNIEnv.NewString (p7);
			IntPtr native_p8 = JNIEnv.NewString (p8);
			IntPtr native_p9 = JNIEnv.NewString (p9);
			IntPtr native_p10 = JNIEnv.NewString (p10);
			IntPtr native_p12 = JNIEnv.NewString (p12);
			IntPtr native_p13 = JNIEnv.NewString (p13);
			IntPtr native_p15 = JNIEnv.NewString (p15);
			IntPtr native_p16 = JNIEnv.NewString (p16);
			IntPtr native_p17 = JNIEnv.NewString (p17);
			IntPtr native_p19 = JNIEnv.NewString (p19);
			IntPtr native_p23 = JNIEnv.NewString (p23);
			IntPtr native_p25 = global::Android.Runtime.JavaList<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkApms>.ToLocalJniHandle (p25);
			IntPtr native_p27 = JNIEnv.NewString (p27);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [31];
				__args [0] = new JniArgumentValue (native_p0);
				__args [1] = new JniArgumentValue (native_p1);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue ((p3 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p3).Handle);
				__args [4] = new JniArgumentValue ((p4 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p4).Handle);
				__args [5] = new JniArgumentValue ((p5 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p5).Handle);
				__args [6] = new JniArgumentValue (native_p6);
				__args [7] = new JniArgumentValue (native_p7);
				__args [8] = new JniArgumentValue (native_p8);
				__args [9] = new JniArgumentValue (native_p9);
				__args [10] = new JniArgumentValue (native_p10);
				__args [11] = new JniArgumentValue ((p11 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p11).Handle);
				__args [12] = new JniArgumentValue (native_p12);
				__args [13] = new JniArgumentValue (native_p13);
				__args [14] = new JniArgumentValue ((p14 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p14).Handle);
				__args [15] = new JniArgumentValue (native_p15);
				__args [16] = new JniArgumentValue (native_p16);
				__args [17] = new JniArgumentValue (native_p17);
				__args [18] = new JniArgumentValue ((p18 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p18).Handle);
				__args [19] = new JniArgumentValue (native_p19);
				__args [20] = new JniArgumentValue ((p20 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p20).Handle);
				__args [21] = new JniArgumentValue ((p21 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p21).Handle);
				__args [22] = new JniArgumentValue ((p22 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p22).Handle);
				__args [23] = new JniArgumentValue (native_p23);
				__args [24] = new JniArgumentValue (p24);
				__args [25] = new JniArgumentValue (native_p25);
				__args [26] = new JniArgumentValue ((p26 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p26).Handle);
				__args [27] = new JniArgumentValue (native_p27);
				__args [28] = new JniArgumentValue (p28);
				__args [29] = new JniArgumentValue (p29);
				__args [30] = new JniArgumentValue ((p30 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p30).Handle);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_p0);
				JNIEnv.DeleteLocalRef (native_p1);
				JNIEnv.DeleteLocalRef (native_p2);
				JNIEnv.DeleteLocalRef (native_p6);
				JNIEnv.DeleteLocalRef (native_p7);
				JNIEnv.DeleteLocalRef (native_p8);
				JNIEnv.DeleteLocalRef (native_p9);
				JNIEnv.DeleteLocalRef (native_p10);
				JNIEnv.DeleteLocalRef (native_p12);
				JNIEnv.DeleteLocalRef (native_p13);
				JNIEnv.DeleteLocalRef (native_p15);
				JNIEnv.DeleteLocalRef (native_p16);
				JNIEnv.DeleteLocalRef (native_p17);
				JNIEnv.DeleteLocalRef (native_p19);
				JNIEnv.DeleteLocalRef (native_p23);
				JNIEnv.DeleteLocalRef (native_p25);
				JNIEnv.DeleteLocalRef (native_p27);
				global::System.GC.KeepAlive (p3);
				global::System.GC.KeepAlive (p4);
				global::System.GC.KeepAlive (p5);
				global::System.GC.KeepAlive (p11);
				global::System.GC.KeepAlive (p14);
				global::System.GC.KeepAlive (p18);
				global::System.GC.KeepAlive (p20);
				global::System.GC.KeepAlive (p21);
				global::System.GC.KeepAlive (p22);
				global::System.GC.KeepAlive (p25);
				global::System.GC.KeepAlive (p26);
				global::System.GC.KeepAlive (p30);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='describeContents' and count(parameter)=0]"
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.integrationmodels']/class[@name='PaymentSdkConfigurationDetails']/method[@name='writeToParcel' and count(parameter)=2 and parameter[1][@type='android.os.Parcel'] and parameter[2][@type='int']]"
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
