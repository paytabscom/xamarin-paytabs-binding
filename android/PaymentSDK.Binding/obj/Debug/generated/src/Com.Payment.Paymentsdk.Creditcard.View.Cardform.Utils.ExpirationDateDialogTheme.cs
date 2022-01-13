using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme", DoNotGenerateAcw=true)]
	public sealed partial class ExpirationDateDialogTheme : global::Java.Lang.Enum {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/field[@name='DARK']"
		[Register ("DARK")]
		public static global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme Dark {
			get {
				const string __id = "DARK.Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}


		// Metadata.xml XPath field reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/field[@name='LIGHT']"
		[Register ("LIGHT")]
		public static global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme Light {
			get {
				const string __id = "LIGHT.Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme", typeof (ExpirationDateDialogTheme));

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

		internal ExpirationDateDialogTheme (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		public unsafe int ItemDisabledTextColor {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='getItemDisabledTextColor' and count(parameter)=0]"
			[Register ("getItemDisabledTextColor", "()I", "")]
			get {
				const string __id = "getItemDisabledTextColor.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe int ItemInvertedTextColor {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='getItemInvertedTextColor' and count(parameter)=0]"
			[Register ("getItemInvertedTextColor", "()I", "")]
			get {
				const string __id = "getItemInvertedTextColor.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe int ItemTextColor {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='getItemTextColor' and count(parameter)=0]"
			[Register ("getItemTextColor", "()I", "")]
			get {
				const string __id = "getItemTextColor.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe int SelectedItemBackground {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='getSelectedItemBackground' and count(parameter)=0]"
			[Register ("getSelectedItemBackground", "()I", "")]
			get {
				const string __id = "getSelectedItemBackground.()I";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='detectTheme' and count(parameter)=1 and parameter[1][@type='android.app.Activity']]"
		[Register ("detectTheme", "(Landroid/app/Activity;)Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme DetectTheme (global::Android.App.Activity activity)
		{
			const string __id = "detectTheme.(Landroid/app/Activity;)Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='valueOf' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("valueOf", "(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme ValueOf (string name)
		{
			const string __id = "valueOf.(Ljava/lang/String;)Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;";
			IntPtr native_name = JNIEnv.NewString (name);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_name);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				JNIEnv.DeleteLocalRef (native_name);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.cardform.utils']/class[@name='ExpirationDateDialogTheme']/method[@name='values' and count(parameter)=0]"
		[Register ("values", "()[Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;", "")]
		public static unsafe global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme[] Values ()
		{
			const string __id = "values.()[Lcom/payment/paymentsdk/creditcard/view/cardform/utils/ExpirationDateDialogTheme;";
			try {
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
				return (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme[]) JNIEnv.GetArray (__rm.Handle, JniHandleOwnership.TransferLocalRef, typeof (global::Com.Payment.Paymentsdk.Creditcard.View.Cardform.Utils.ExpirationDateDialogTheme));
			} finally {
			}
		}

	}
}
