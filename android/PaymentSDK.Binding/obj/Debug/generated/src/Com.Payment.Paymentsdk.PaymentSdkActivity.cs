using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkActivity", DoNotGenerateAcw=true)]
	public sealed partial class PaymentSdkActivity : global::AndroidX.AppCompat.App.AppCompatActivity, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityCommunicationInterface, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.IActivityReturnResult {
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
			public unsafe Companion (global::Kotlin.Jvm.Internal.DefaultConstructorMarker _constructor_marker) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		}

		// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity.WhenMappings']"
		[global::Android.Runtime.Register ("com/payment/paymentsdk/PaymentSdkActivity$WhenMappings", DoNotGenerateAcw=true)]
		public sealed partial class WhenMappings : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/PaymentSdkActivity$WhenMappings", typeof (WhenMappings));

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

			internal WhenMappings (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
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
		public unsafe void OnMissingDataFinished (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData)
		{
			const string __id = "onMissingDataFinished.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (ptConfigData);
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
		public unsafe void ReturnErrorToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkError result)
		{
			const string __id = "returnErrorToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkError;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((result == null) ? IntPtr.Zero : ((global::Java.Lang.Object) result).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (result);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='returnPaymentFinishedToTheCaller' and count(parameter)=1 and parameter[1][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkTransactionDetails']]"
		[Register ("returnPaymentFinishedToTheCaller", "(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V", "")]
		public unsafe void ReturnPaymentFinishedToTheCaller (global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkTransactionDetails result)
		{
			const string __id = "returnPaymentFinishedToTheCaller.(Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTransactionDetails;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((result == null) ? IntPtr.Zero : ((global::Java.Lang.Object) result).Handle);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (result);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startAlternativePaymentMethods' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startAlternativePaymentMethods", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartAlternativePaymentMethods (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
		{
			const string __id = "startAlternativePaymentMethods.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				__args [2] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (ptConfigData);
				global::System.GC.KeepAlive (@callback);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startCardPayment' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startCardPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartCardPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
		{
			const string __id = "startCardPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				__args [2] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (ptConfigData);
				global::System.GC.KeepAlive (@callback);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk']/class[@name='PaymentSdkActivity']/method[@name='startSamsungPayment' and count(parameter)=4 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails'] and parameter[3][@type='java.lang.String'] and parameter[4][@type='com.payment.paymentsdk.sharedclasses.interfaces.CallbackPaymentInterface']]"
		[Register ("startSamsungPayment", "(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V", "")]
		public static unsafe void StartSamsungPayment (global::Android.App.Activity context, global::Com.Payment.Paymentsdk.Integrationmodels.PaymentSdkConfigurationDetails ptConfigData, string samsungPayToken, global::Com.Payment.Paymentsdk.Sharedclasses.Interfaces.ICallbackPaymentInterface @callback)
		{
			const string __id = "startSamsungPayment.(Landroid/app/Activity;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;Ljava/lang/String;Lcom/payment/paymentsdk/sharedclasses/interfaces/CallbackPaymentInterface;)V";
			IntPtr native_samsungPayToken = JNIEnv.NewString (samsungPayToken);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((ptConfigData == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ptConfigData).Handle);
				__args [2] = new JniArgumentValue (native_samsungPayToken);
				__args [3] = new JniArgumentValue ((@callback == null) ? IntPtr.Zero : ((global::Java.Lang.Object) @callback).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_samsungPayToken);
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (ptConfigData);
				global::System.GC.KeepAlive (@callback);
			}
		}

	}
}
