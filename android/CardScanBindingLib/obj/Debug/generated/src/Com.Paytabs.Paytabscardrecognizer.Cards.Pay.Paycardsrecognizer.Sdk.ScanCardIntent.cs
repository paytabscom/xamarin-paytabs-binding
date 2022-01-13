using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent", DoNotGenerateAcw=true)]
	public sealed partial class ScanCardIntent : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='ADD_MANUALLY_PRESSED']"
		[Register ("ADD_MANUALLY_PRESSED")]
		public const int AddManuallyPressed = (int) 2;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='BACK_PRESSED']"
		[Register ("BACK_PRESSED")]
		public const int BackPressed = (int) 1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='KEY_SCAN_CARD_REQUEST']"
		[Register ("KEY_SCAN_CARD_REQUEST")]
		public const string KeyScanCardRequest = (string) "cards.pay.paycardsrecognizer.sdk.ui.ScanCardActivity.SCAN_CARD_REQUEST";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='RESULT_CANCEL_REASON']"
		[Register ("RESULT_CANCEL_REASON")]
		public const string ResultCancelReason = (string) "RESULT_CANCEL_REASON";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='RESULT_CARD_IMAGE']"
		[Register ("RESULT_CARD_IMAGE")]
		public const string ResultCardImage = (string) "RESULT_CARD_IMAGE";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='RESULT_CODE_ERROR']"
		[Register ("RESULT_CODE_ERROR")]
		public const int ResultCodeError = (int) 1;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent']/field[@name='RESULT_PAYCARDS_CARD']"
		[Register ("RESULT_PAYCARDS_CARD")]
		public const string ResultPaycardsCard = (string) "RESULT_PAYCARDS_CARD";

		// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']"
		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder", DoNotGenerateAcw=true)]
		public sealed partial class Builder : global::Java.Lang.Object {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder", typeof (Builder));

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

			internal Builder (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
			{
			}

			// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/constructor[@name='ScanCardIntent.Builder' and count(parameter)=1 and parameter[1][@type='android.content.Context']]"
			[Register (".ctor", "(Landroid/content/Context;)V", "")]
			public unsafe Builder (global::Android.Content.Context context) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/method[@name='build' and count(parameter)=0]"
			[Register ("build", "()Landroid/content/Intent;", "")]
			public unsafe global::Android.Content.Intent Build ()
			{
				const string __id = "build.()Landroid/content/Intent;";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, null);
					return global::Java.Lang.Object.GetObject<global::Android.Content.Intent> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/method[@name='setSaveCard' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setSaveCard", "(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;", "")]
			public unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder SetSaveCard (bool enable)
			{
				const string __id = "setSaveCard.(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (enable);
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/method[@name='setScanCardHolder' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setScanCardHolder", "(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;", "")]
			public unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder SetScanCardHolder (bool scanCardHolder)
			{
				const string __id = "setScanCardHolder.(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (scanCardHolder);
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/method[@name='setScanExpirationDate' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setScanExpirationDate", "(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;", "")]
			public unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder SetScanExpirationDate (bool scanExpirationDate)
			{
				const string __id = "setScanExpirationDate.(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (scanExpirationDate);
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}

			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/class[@name='ScanCardIntent.Builder']/method[@name='setSoundEnabled' and count(parameter)=1 and parameter[1][@type='boolean']]"
			[Register ("setSoundEnabled", "(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;", "")]
			public unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder SetSoundEnabled (bool enableSound)
			{
				const string __id = "setSoundEnabled.(Z)Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$Builder;";
				try {
					JniArgumentValue* __args = stackalloc JniArgumentValue [1];
					__args [0] = new JniArgumentValue (enableSound);
					var __rm = _members.InstanceMethods.InvokeAbstractObjectMethod (__id, this, __args);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.Builder> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}

		}

		// Metadata.xml XPath interface reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk']/interface[@name='ScanCardIntent.CancelReason']"
		[Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$CancelReason", "", "Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent/ICancelReasonInvoker")]
		public partial interface ICancelReason : global::Java.Lang.Annotation.IAnnotation {
		}

		[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$CancelReason", DoNotGenerateAcw=true)]
		internal partial class ICancelReasonInvoker : global::Java.Lang.Object, ICancelReason {
			static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent$CancelReason", typeof (ICancelReasonInvoker));

			static IntPtr java_class_ref {
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
				get { return class_ref; }
			}

			[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
			[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
			protected override global::System.Type ThresholdType {
				get { return _members.ManagedPeerType; }
			}

			IntPtr class_ref;

			public static ICancelReason GetObject (IntPtr handle, JniHandleOwnership transfer)
			{
				return global::Java.Lang.Object.GetObject<ICancelReason> (handle, transfer);
			}

			static IntPtr Validate (IntPtr handle)
			{
				if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
					throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ScanCardIntent.CancelReason'.");
				return handle;
			}

			protected override void Dispose (bool disposing)
			{
				if (this.class_ref != IntPtr.Zero)
					JNIEnv.DeleteGlobalRef (this.class_ref);
				this.class_ref = IntPtr.Zero;
				base.Dispose (disposing);
			}

			public ICancelReasonInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
			{
				IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
				this.class_ref = JNIEnv.NewGlobalRef (local_ref);
				JNIEnv.DeleteLocalRef (local_ref);
			}

			static Delegate cb_annotationType;
#pragma warning disable 0169
			static Delegate GetAnnotationTypeHandler ()
			{
				if (cb_annotationType == null)
					cb_annotationType = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_AnnotationType);
				return cb_annotationType;
			}

			static IntPtr n_AnnotationType (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.ICancelReason> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return JNIEnv.ToLocalJniHandle (__this.AnnotationType ());
			}
#pragma warning restore 0169

			IntPtr id_annotationType;
			public unsafe global::Java.Lang.Class AnnotationType ()
			{
				if (id_annotationType == IntPtr.Zero)
					id_annotationType = JNIEnv.GetMethodID (class_ref, "annotationType", "()Ljava/lang/Class;");
				return global::Java.Lang.Object.GetObject<global::Java.Lang.Class> (JNIEnv.CallObjectMethod (((global::Java.Lang.Object) this).Handle, id_annotationType), JniHandleOwnership.TransferLocalRef);
			}

			static Delegate cb_equals_Ljava_lang_Object_;
#pragma warning disable 0169
			static Delegate GetEquals_Ljava_lang_Object_Handler ()
			{
				if (cb_equals_Ljava_lang_Object_ == null)
					cb_equals_Ljava_lang_Object_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPL_Z) n_Equals_Ljava_lang_Object_);
				return cb_equals_Ljava_lang_Object_;
			}

			static bool n_Equals_Ljava_lang_Object_ (IntPtr jnienv, IntPtr native__this, IntPtr native_obj)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.ICancelReason> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				var obj = global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (native_obj, JniHandleOwnership.DoNotTransfer);
				bool __ret = __this.Equals (obj);
				return __ret;
			}
#pragma warning restore 0169

			IntPtr id_equals_Ljava_lang_Object_;
			public unsafe global::System.Boolean Equals (global::Java.Lang.Object obj)
			{
				if (id_equals_Ljava_lang_Object_ == IntPtr.Zero)
					id_equals_Ljava_lang_Object_ = JNIEnv.GetMethodID (class_ref, "equals", "(Ljava/lang/Object;)Z");
				JValue* __args = stackalloc JValue [1];
				__args [0] = new JValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				var __ret = JNIEnv.CallBooleanMethod (((global::Java.Lang.Object) this).Handle, id_equals_Ljava_lang_Object_, __args);
				return __ret;
			}

			static Delegate cb_hashCode;
#pragma warning disable 0169
			static Delegate GetGetHashCodeHandler ()
			{
				if (cb_hashCode == null)
					cb_hashCode = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_I) n_GetHashCode);
				return cb_hashCode;
			}

			static int n_GetHashCode (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.ICancelReason> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return __this.GetHashCode ();
			}
#pragma warning restore 0169

			IntPtr id_hashCode;
			public unsafe global::System.Int32 GetHashCode ()
			{
				if (id_hashCode == IntPtr.Zero)
					id_hashCode = JNIEnv.GetMethodID (class_ref, "hashCode", "()I");
				return JNIEnv.CallIntMethod (((global::Java.Lang.Object) this).Handle, id_hashCode);
			}

			static Delegate cb_toString;
#pragma warning disable 0169
			static Delegate GetToStringHandler ()
			{
				if (cb_toString == null)
					cb_toString = JNINativeWrapper.CreateDelegate ((_JniMarshal_PP_L) n_ToString);
				return cb_toString;
			}

			static IntPtr n_ToString (IntPtr jnienv, IntPtr native__this)
			{
				var __this = global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.ScanCardIntent.ICancelReason> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
				return JNIEnv.NewString (__this.ToString ());
			}
#pragma warning restore 0169

			IntPtr id_toString;
			public unsafe global::System.String ToString ()
			{
				if (id_toString == IntPtr.Zero)
					id_toString = JNIEnv.GetMethodID (class_ref, "toString", "()Ljava/lang/String;");
				return JNIEnv.GetString (JNIEnv.CallObjectMethod (((global::Java.Lang.Object) this).Handle, id_toString), JniHandleOwnership.TransferLocalRef);
			}

		}

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ScanCardIntent", typeof (ScanCardIntent));

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

		internal ScanCardIntent (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
