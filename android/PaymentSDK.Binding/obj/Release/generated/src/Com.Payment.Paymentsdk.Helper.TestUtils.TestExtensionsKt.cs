using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.TestUtils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='TestExtensionsKt']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/testUtils/TestExtensionsKt", DoNotGenerateAcw=true)]
	public sealed partial class TestExtensionsKt : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/testUtils/TestExtensionsKt", typeof (TestExtensionsKt));

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

		internal TestExtensionsKt (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.testUtils']/class[@name='TestExtensionsKt']/method[@name='observeOnce' and count(parameter)=2 and parameter[1][@type='androidx.lifecycle.LiveData&lt;T&gt;'] and parameter[2][@type='kotlin.jvm.functions.Function1&lt;? super T, kotlin.Unit&gt;']]"
		[Register ("observeOnce", "(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V", "")]
		[global::Java.Interop.JavaTypeParameters (new string [] {"T"})]
		public static unsafe void ObserveOnce (global::AndroidX.Lifecycle.LiveData obj, global::Kotlin.Jvm.Functions.IFunction1 onChangeHandler)
		{
			const string __id = "observeOnce.(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((obj == null) ? IntPtr.Zero : ((global::Java.Lang.Object) obj).Handle);
				__args [1] = new JniArgumentValue ((onChangeHandler == null) ? IntPtr.Zero : ((global::Java.Lang.Object) onChangeHandler).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (obj);
				global::System.GC.KeepAlive (onChangeHandler);
			}
		}

	}
}
