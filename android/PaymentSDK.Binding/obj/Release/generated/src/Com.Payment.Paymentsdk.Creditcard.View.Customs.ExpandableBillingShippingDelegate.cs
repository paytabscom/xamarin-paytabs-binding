using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Customs {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/customs/ExpandableBillingShippingDelegate", DoNotGenerateAcw=true)]
	public sealed partial class ExpandableBillingShippingDelegate : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/customs/ExpandableBillingShippingDelegate", typeof (ExpandableBillingShippingDelegate));

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

		internal ExpandableBillingShippingDelegate (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/constructor[@name='ExpandableBillingShippingDelegate' and count(parameter)=6 and parameter[1][@type='android.content.Context'] and parameter[2][@type='androidx.constraintlayout.widget.ConstraintLayout'] and parameter[3][@type='android.widget.LinearLayout'] and parameter[4][@type='android.widget.TextView'] and parameter[5][@type='android.widget.ImageView'] and parameter[6][@type='java.util.Map&lt;com.payment.paymentsdk.creditcard.view.customs.EditTextsEnum, com.payment.paymentsdk.creditcard.view.customs.PaytabsEditText&gt;']]"
		[Register (".ctor", "(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Ljava/util/Map;)V", "")]
		public unsafe ExpandableBillingShippingDelegate (global::Android.Content.Context context, global::AndroidX.ConstraintLayout.Widget.ConstraintLayout mainLayout, global::Android.Widget.LinearLayout infoLayout, global::Android.Widget.TextView tvInfo, global::Android.Widget.ImageView ivArrow, global::System.Collections.Generic.IDictionary<global::Com.Payment.Paymentsdk.Creditcard.View.Customs.EditTextsEnum, global::Com.Payment.Paymentsdk.Creditcard.View.Customs.PaytabsEditText> paymentSdkEditTextsMap) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Ljava/util/Map;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			IntPtr native_paymentSdkEditTextsMap = global::Android.Runtime.JavaDictionary<global::Com.Payment.Paymentsdk.Creditcard.View.Customs.EditTextsEnum, global::Com.Payment.Paymentsdk.Creditcard.View.Customs.PaytabsEditText>.ToLocalJniHandle (paymentSdkEditTextsMap);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [6];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((mainLayout == null) ? IntPtr.Zero : ((global::Java.Lang.Object) mainLayout).Handle);
				__args [2] = new JniArgumentValue ((infoLayout == null) ? IntPtr.Zero : ((global::Java.Lang.Object) infoLayout).Handle);
				__args [3] = new JniArgumentValue ((tvInfo == null) ? IntPtr.Zero : ((global::Java.Lang.Object) tvInfo).Handle);
				__args [4] = new JniArgumentValue ((ivArrow == null) ? IntPtr.Zero : ((global::Java.Lang.Object) ivArrow).Handle);
				__args [5] = new JniArgumentValue (native_paymentSdkEditTextsMap);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_paymentSdkEditTextsMap);
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (mainLayout);
				global::System.GC.KeepAlive (infoLayout);
				global::System.GC.KeepAlive (tvInfo);
				global::System.GC.KeepAlive (ivArrow);
				global::System.GC.KeepAlive (paymentSdkEditTextsMap);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/method[@name='collapse' and count(parameter)=0]"
		[Register ("collapse", "()V", "")]
		public unsafe void Collapse ()
		{
			const string __id = "collapse.()V";
			try {
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/method[@name='expand' and count(parameter)=0]"
		[Register ("expand", "()V", "")]
		public unsafe void Expand ()
		{
			const string __id = "expand.()V";
			try {
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/method[@name='setCountryClickAction' and count(parameter)=1 and parameter[1][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("setCountryClickAction", "(Lkotlin/jvm/functions/Function0;)V", "")]
		public unsafe void SetCountryClickAction (global::Kotlin.Jvm.Functions.IFunction0 onCountryClicked)
		{
			const string __id = "setCountryClickAction.(Lkotlin/jvm/functions/Function0;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((onCountryClicked == null) ? IntPtr.Zero : ((global::Java.Lang.Object) onCountryClicked).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (onCountryClicked);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/method[@name='setCountryIso' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCountryIso", "(Ljava/lang/String;)V", "")]
		public unsafe void SetCountryIso (string countryIso)
		{
			const string __id = "setCountryIso.(Ljava/lang/String;)V";
			IntPtr native_countryIso = JNIEnv.NewString (countryIso);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_countryIso);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_countryIso);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableBillingShippingDelegate']/method[@name='showErrorMsg' and count(parameter)=2 and parameter[1][@type='com.payment.paymentsdk.creditcard.view.customs.EditTextsEnum'] and parameter[2][@type='int']]"
		[Register ("showErrorMsg", "(Lcom/payment/paymentsdk/creditcard/view/customs/EditTextsEnum;I)V", "")]
		public unsafe void ShowErrorMsg (global::Com.Payment.Paymentsdk.Creditcard.View.Customs.EditTextsEnum viewResourceKey, int stringId)
		{
			const string __id = "showErrorMsg.(Lcom/payment/paymentsdk/creditcard/view/customs/EditTextsEnum;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((viewResourceKey == null) ? IntPtr.Zero : ((global::Java.Lang.Object) viewResourceKey).Handle);
				__args [1] = new JniArgumentValue (stringId);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (viewResourceKey);
			}
		}

	}
}
