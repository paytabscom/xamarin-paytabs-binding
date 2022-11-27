using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkActivity", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkActivity : global::AndroidX.AppCompat.App.AppCompatActivity {
		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkActivity$Companion", DoNotGenerateAcw=true)]
		public sealed partial class Companion : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/PaymentSdkActivity$Companion", typeof (Companion));

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

			internal Companion (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/constructor[@name='PaymentSdkActivity.Companion' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.internal.DefaultConstructorMarker']]"
			[Register (".ctor", "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "")]
			public unsafe Companion (global::Kotlin.Jvm.Internal.DefaultConstructorMarker p0) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
			{
				const string __id = "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V";

				if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
					return;

				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
					var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
					SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
					_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (p0);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='start3DSecureTokenizedCardPayment' and count(parameter)=5 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("start3DSecureTokenizedCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void Start3DSecureTokenizedCardPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, global::Com.Payment.Paymentsdk.Save_cards.Entities.PaymentSDKSavedCardInfo savedCardInfo, string token, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "start3DSecureTokenizedCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				IntPtr native_token = JNIEnv.NewString (token);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [5];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue ((savedCardInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) savedCardInfo).Handle);
					__args [3] = new JniArgumentValue (native_token);
					__args [4] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_token);
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (savedCardInfo);
					global::System.GC.KeepAlive (@callback);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='startAlternativePaymentMethods' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("startAlternativePaymentMethods", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void StartAlternativePaymentMethods (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "startAlternativePaymentMethods.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [3];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (@callback);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='startCardPayment' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("startCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void StartCardPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "startCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [3];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (@callback);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='startPaymentWithSavedCards' and count(parameter)=4 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='boolean'] and parameter[4][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("startPaymentWithSavedCards", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;ZLcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void StartPaymentWithSavedCards (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, bool support3DS, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "startPaymentWithSavedCards.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;ZLcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [4];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue (support3DS);
					__args [3] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (@callback);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='startSamsungPayment' and count(parameter)=4 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("startSamsungPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void StartSamsungPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, string samsungPayToken, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "startSamsungPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				IntPtr native_samsungPayToken = JNIEnv.NewString (samsungPayToken);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [4];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue (native_samsungPayToken);
					__args [3] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_samsungPayToken);
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (@callback);
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.Companion']/method[@name='startTokenizedCardPayment' and count(parameter)=5 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
			[Register ("startTokenizedCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
			public unsafe void StartTokenizedCardPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, string token, string transactionRef, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
			{
				const string __id = "startTokenizedCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
				IntPtr native_token = JNIEnv.NewString (token);
				IntPtr native_transactionRef = JNIEnv.NewString (transactionRef);
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [5];
					__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
					__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
					__args [2] = new JniArgumentValue (native_token);
					__args [3] = new JniArgumentValue (native_transactionRef);
					__args [4] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
					_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
				} finally {
					JNIEnv.DeleteLocalRef (native_token);
					JNIEnv.DeleteLocalRef (native_transactionRef);
					global::System.GC.KeepAlive (context);
					global::System.GC.KeepAlive (ptConfigData);
					global::System.GC.KeepAlive (@callback);
				}
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/PaymentSdkActivity", typeof (PaymentSdkActivity));

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

		internal PaymentSdkActivity (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/constructor[@name='PaymentSdkActivity' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe PaymentSdkActivity () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='onMissingDataFinished' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails']]"
		[Register ("onMissingDataFinished", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "")]
		public unsafe void OnMissingDataFinished (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p0)
		{
			const string __id = "onMissingDataFinished.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='returnCancelToTheCaller' and count(parameter)=0]"
		[Register ("returnCancelToTheCaller", "()V", "")]
		public unsafe void ReturnCancelToTheCaller ()
		{
			const string __id = "returnCancelToTheCaller.()V";
			try {
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='returnErrorToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkError']]"
		[Register ("returnErrorToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V", "")]
		public unsafe void ReturnErrorToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError p0)
		{
			const string __id = "returnErrorToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='returnPaymentFinishedToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails']]"
		[Register ("returnPaymentFinishedToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V", "")]
		public unsafe void ReturnPaymentFinishedToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails p0)
		{
			const string __id = "returnPaymentFinishedToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='start3DSecureTokenizedCardPayment' and count(parameter)=5 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.save_cards.entities.PaymentSDKSavedCardInfo'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("start3DSecureTokenizedCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void Start3DSecureTokenizedCardPayment (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, global::Com.Payment.Paymentsdk.Save_cards.Entities.PaymentSDKSavedCardInfo p2, string p3, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p4)
		{
			const string __id = "start3DSecureTokenizedCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			IntPtr native_p3 = JNIEnv.NewString (p3);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue ((p2 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p2).Handle);
				__args [3] = new JniArgumentValue (native_p3);
				__args [4] = new JniArgumentValue ((p4 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p4).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p3);
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p2);
				global::System.GC.KeepAlive (p4);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startAlternativePaymentMethods' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startAlternativePaymentMethods", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartAlternativePaymentMethods (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p2)
		{
			const string __id = "startAlternativePaymentMethods.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue ((p2 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p2).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p2);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startCardPayment' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartCardPayment (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p2)
		{
			const string __id = "startCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue ((p2 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p2).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p2);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startPaymentWithSavedCards' and count(parameter)=4 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='boolean'] and parameter[4][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startPaymentWithSavedCards", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;ZLcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartPaymentWithSavedCards (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, bool p2, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p3)
		{
			const string __id = "startPaymentWithSavedCards.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;ZLcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue (p2);
				__args [3] = new JniArgumentValue ((p3 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p3).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p3);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startSamsungPayment' and count(parameter)=4 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startSamsungPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartSamsungPayment (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, string p2, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p3)
		{
			const string __id = "startSamsungPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			IntPtr native_p2 = JNIEnv.NewString (p2);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue ((p3 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p3).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p2);
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p3);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startTokenizedCardPayment' and count(parameter)=5 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='java.lang.String'] and parameter[5][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startTokenizedCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartTokenizedCardPayment (global::Android.App.Activity p0, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails p1, string p2, string p3, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface p4)
		{
			const string __id = "startTokenizedCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			IntPtr native_p2 = JNIEnv.NewString (p2);
			IntPtr native_p3 = JNIEnv.NewString (p3);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [5];
				__args [0] = new JniArgumentValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
				__args [1] = new JniArgumentValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
				__args [2] = new JniArgumentValue (native_p2);
				__args [3] = new JniArgumentValue (native_p3);
				__args [4] = new JniArgumentValue ((p4 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p4).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_p2);
				JNIEnv.DeleteLocalRef (native_p3);
				global::System.GC.KeepAlive (p0);
				global::System.GC.KeepAlive (p1);
				global::System.GC.KeepAlive (p4);
			}
		}

	}
}
