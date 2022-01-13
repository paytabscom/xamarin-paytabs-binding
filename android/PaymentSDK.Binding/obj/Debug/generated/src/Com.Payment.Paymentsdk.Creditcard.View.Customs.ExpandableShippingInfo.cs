using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Creditcard.View.Customs {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/creditcard/view/customs/ExpandableShippingInfo", DoNotGenerateAcw=true)]
	public sealed partial class ExpandableShippingInfo : global::AndroidX.ConstraintLayout.Widget.ConstraintLayout {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/creditcard/view/customs/ExpandableShippingInfo", typeof (ExpandableShippingInfo));

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

		internal ExpandableShippingInfo (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/constructor[@name='ExpandableShippingInfo' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
		[Register (".ctor", "(Landroid/content/Context;)V", "")]
		public unsafe ExpandableShippingInfo (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/constructor[@name='ExpandableShippingInfo' and count(parameter)=2 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "")]
		public unsafe ExpandableShippingInfo (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/constructor[@name='ExpandableShippingInfo' and count(parameter)=3 and parameter[1][@type='android.content.Context'] and parameter[2][@type='android.util.AttributeSet'] and parameter[3][@type='int']]"
		[Register (".ctor", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "")]
		public unsafe ExpandableShippingInfo (global::Android.Content.Context context, global::Android.Util.IAttributeSet attrs, int defStyle) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(Landroid/content/Context;Landroid/util/AttributeSet;I)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((context == null) ? IntPtr.Zero : ((global::Java.Lang.Object) context).Handle);
				__args [1] = new JniArgumentValue ((attrs == null) ? IntPtr.Zero : ((global::Java.Lang.Object) attrs).Handle);
				__args [2] = new JniArgumentValue (defStyle);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (context);
				global::System.GC.KeepAlive (attrs);
			}
		}

		public unsafe bool IsValid {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/method[@name='isValid' and count(parameter)=0]"
			[Register ("isValid", "()Z", "")]
			get {
				const string __id = "isValid.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeNonvirtualBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/method[@name='setCountry' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("setCountry", "(Ljava/lang/String;)V", "")]
		public unsafe void SetCountry (string countryIso)
		{
			const string __id = "setCountry.(Ljava/lang/String;)V";
			IntPtr native_countryIso = JNIEnv.NewString (countryIso);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_countryIso);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_countryIso);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/method[@name='setData' and count(parameter)=4 and parameter[1][@type='com.payment.paymentsdk.sharedclasses.base.BaseBillingShippingDetails'] and parameter[2][@type='androidx.lifecycle.LifecycleOwner'] and parameter[3][@type='java.lang.Boolean'] and parameter[4][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("setData", "(Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V", "")]
		public unsafe void SetData (global::Com.Payment.Paymentsdk.Sharedclasses.Base.BaseBillingShippingDetails data, global::AndroidX.Lifecycle.ILifecycleOwner lifecycleOwner, global::Java.Lang.Boolean shouldValidate, global::Kotlin.Jvm.Functions.IFunction0 onCountryClicked)
		{
			const string __id = "setData.(Lcom/payment/paymentsdk/sharedclasses/base/BaseBillingShippingDetails;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((data == null) ? IntPtr.Zero : ((global::Java.Lang.Object) data).Handle);
				__args [1] = new JniArgumentValue ((lifecycleOwner == null) ? IntPtr.Zero : ((global::Java.Lang.Object) lifecycleOwner).Handle);
				__args [2] = new JniArgumentValue ((shouldValidate == null) ? IntPtr.Zero : ((global::Java.Lang.Object) shouldValidate).Handle);
				__args [3] = new JniArgumentValue ((onCountryClicked == null) ? IntPtr.Zero : ((global::Java.Lang.Object) onCountryClicked).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (data);
				global::System.GC.KeepAlive (lifecycleOwner);
				global::System.GC.KeepAlive (shouldValidate);
				global::System.GC.KeepAlive (onCountryClicked);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.creditcard.view.customs']/class[@name='ExpandableShippingInfo']/method[@name='validate' and count(parameter)=0]"
		[Register ("validate", "()V", "")]
		public unsafe void Validate ()
		{
			const string __id = "validate.()V";
			try {
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

	}
}
