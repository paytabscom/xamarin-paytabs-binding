using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Sharedclasses.Remote {

	// Metadata.xml XPath interface reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.remote']/interface[@name='TransactionWebService']"
	[Register ("com/payment/paymentsdk/sharedclasses/remote/TransactionWebService", "", "Com.Payment.Paymentsdk.Sharedclasses.Remote.ITransactionWebServiceInvoker")]
	public partial interface ITransactionWebService : IJavaObject, IJavaPeerable {
		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.remote']/interface[@name='TransactionWebService']/method[@name='doTransaction' and count(parameter)=2 and parameter[1][@type='okhttp3.RequestBody'] and parameter[2][@type='kotlin.coroutines.Continuation&lt;? super com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody&gt;']]"
		[Register ("doTransaction", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetDoTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_Handler:Com.Payment.Paymentsdk.Sharedclasses.Remote.ITransactionWebServiceInvoker, Payment.Binding")]
		global::Java.Lang.Object DoTransaction (global::Square.OkHttp3.RequestBody p0, global::Kotlin.Coroutines.IContinuation p1);

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.sharedclasses.remote']/interface[@name='TransactionWebService']/method[@name='queryTransaction' and count(parameter)=2 and parameter[1][@type='okhttp3.RequestBody'] and parameter[2][@type='kotlin.coroutines.Continuation&lt;? super com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody&gt;']]"
		[Register ("queryTransaction", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetQueryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_Handler:Com.Payment.Paymentsdk.Sharedclasses.Remote.ITransactionWebServiceInvoker, Payment.Binding")]
		global::Java.Lang.Object QueryTransaction (global::Square.OkHttp3.RequestBody p0, global::Kotlin.Coroutines.IContinuation p1);

	}

	[global::Android.Runtime.Register ("com/payment/paymentsdk/sharedclasses/remote/TransactionWebService", DoNotGenerateAcw=true)]
	internal partial class ITransactionWebServiceInvoker : global::Java.Lang.Object, ITransactionWebService {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/sharedclasses/remote/TransactionWebService", typeof (ITransactionWebServiceInvoker));

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

		public static ITransactionWebService GetObject (IntPtr handle, JniHandleOwnership transfer)
		{
			return global::Java.Lang.Object.GetObject<ITransactionWebService> (handle, transfer);
		}

		static IntPtr Validate (IntPtr handle)
		{
			if (!JNIEnv.IsInstanceOf (handle, java_class_ref))
				throw new InvalidCastException ($"Unable to convert instance of type '{JNIEnv.GetClassNameFromInstance (handle)}' to type 'com.payment.paymentsdk.sharedclasses.remote.TransactionWebService'.");
			return handle;
		}

		protected override void Dispose (bool disposing)
		{
			if (this.class_ref != IntPtr.Zero)
				JNIEnv.DeleteGlobalRef (this.class_ref);
			this.class_ref = IntPtr.Zero;
			base.Dispose (disposing);
		}

		public ITransactionWebServiceInvoker (IntPtr handle, JniHandleOwnership transfer) : base (Validate (handle), transfer)
		{
			IntPtr local_ref = JNIEnv.GetObjectClass (((global::Java.Lang.Object) this).Handle);
			this.class_ref = JNIEnv.NewGlobalRef (local_ref);
			JNIEnv.DeleteLocalRef (local_ref);
		}

		static Delegate cb_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
#pragma warning disable 0169
		static Delegate GetDoTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_Handler ()
		{
			if (cb_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ == null)
				cb_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_L) n_DoTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_);
			return cb_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
		}

		static IntPtr n_DoTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, IntPtr native_p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Remote.ITransactionWebService> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Square.OkHttp3.RequestBody> (native_p0, JniHandleOwnership.DoNotTransfer);
			var p1 = (global::Kotlin.Coroutines.IContinuation)global::Java.Lang.Object.GetObject<global::Kotlin.Coroutines.IContinuation> (native_p1, JniHandleOwnership.DoNotTransfer);
			IntPtr __ret = JNIEnv.ToLocalJniHandle (__this.DoTransaction (p0, p1));
			return __ret;
		}
#pragma warning restore 0169

		IntPtr id_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
		public unsafe global::Java.Lang.Object DoTransaction (global::Square.OkHttp3.RequestBody p0, global::Kotlin.Coroutines.IContinuation p1)
		{
			if (id_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ == IntPtr.Zero)
				id_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ = JNIEnv.GetMethodID (class_ref, "doTransaction", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
			JValue* __args = stackalloc JValue [2];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			__args [1] = new JValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
			var __ret = global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (JNIEnv.CallObjectMethod (((global::Java.Lang.Object) this).Handle, id_doTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_, __args), JniHandleOwnership.TransferLocalRef);
			return __ret;
		}

		static Delegate cb_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
#pragma warning disable 0169
		static Delegate GetQueryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_Handler ()
		{
			if (cb_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ == null)
				cb_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPLL_L) n_QueryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_);
			return cb_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
		}

		static IntPtr n_QueryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ (IntPtr jnienv, IntPtr native__this, IntPtr native_p0, IntPtr native_p1)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Sharedclasses.Remote.ITransactionWebService> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var p0 = global::Java.Lang.Object.GetObject<global::Square.OkHttp3.RequestBody> (native_p0, JniHandleOwnership.DoNotTransfer);
			var p1 = (global::Kotlin.Coroutines.IContinuation)global::Java.Lang.Object.GetObject<global::Kotlin.Coroutines.IContinuation> (native_p1, JniHandleOwnership.DoNotTransfer);
			IntPtr __ret = JNIEnv.ToLocalJniHandle (__this.QueryTransaction (p0, p1));
			return __ret;
		}
#pragma warning restore 0169

		IntPtr id_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_;
		public unsafe global::Java.Lang.Object QueryTransaction (global::Square.OkHttp3.RequestBody p0, global::Kotlin.Coroutines.IContinuation p1)
		{
			if (id_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ == IntPtr.Zero)
				id_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_ = JNIEnv.GetMethodID (class_ref, "queryTransaction", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
			JValue* __args = stackalloc JValue [2];
			__args [0] = new JValue ((p0 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p0).Handle);
			__args [1] = new JValue ((p1 == null) ? IntPtr.Zero : ((global::Java.Lang.Object) p1).Handle);
			var __ret = global::Java.Lang.Object.GetObject<global::Java.Lang.Object> (JNIEnv.CallObjectMethod (((global::Java.Lang.Object) this).Handle, id_queryTransaction_Lokhttp3_RequestBody_Lkotlin_coroutines_Continuation_, __args), JniHandleOwnership.TransferLocalRef);
			return __ret;
		}

	}
}
