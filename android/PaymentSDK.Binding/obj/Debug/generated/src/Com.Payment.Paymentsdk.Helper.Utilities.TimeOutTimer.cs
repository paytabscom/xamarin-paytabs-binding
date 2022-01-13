using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/TimeOutTimer", DoNotGenerateAcw=true)]
	public sealed partial class TimeOutTimer : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/TimeOutTimer", typeof (TimeOutTimer));

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

		internal TimeOutTimer (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']/constructor[@name='TimeOutTimer' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe TimeOutTimer () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']/method[@name='getMillisFromString' and count(parameter)=1 and parameter[1][@type='java.lang.String']]"
		[Register ("getMillisFromString", "(Ljava/lang/String;)J", "")]
		public unsafe long GetMillisFromString (string time)
		{
			const string __id = "getMillisFromString.(Ljava/lang/String;)J";
			IntPtr native_time = JNIEnv.NewString (time);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (native_time);
				var __rm = _members.InstanceMethods.InvokeNonvirtualInt64Method (__id, this, __args);
				return __rm;
			} finally {
				JNIEnv.DeleteLocalRef (native_time);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']/method[@name='startTimer' and count(parameter)=3 and parameter[1][@type='java.lang.String'] and parameter[2][@type='kotlin.jvm.functions.Function1&lt;? super java.lang.String, kotlin.Unit&gt;'] and parameter[3][@type='kotlin.jvm.functions.Function0&lt;kotlin.Unit&gt;']]"
		[Register ("startTimer", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "")]
		public unsafe void StartTimer (string time, global::Kotlin.Jvm.Functions.IFunction1 updateTimer, global::Kotlin.Jvm.Functions.IFunction0 onTimerFinished)
		{
			const string __id = "startTimer.(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V";
			IntPtr native_time = JNIEnv.NewString (time);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue (native_time);
				__args [1] = new JniArgumentValue ((updateTimer == null) ? IntPtr.Zero : ((global::Java.Lang.Object) updateTimer).Handle);
				__args [2] = new JniArgumentValue ((onTimerFinished == null) ? IntPtr.Zero : ((global::Java.Lang.Object) onTimerFinished).Handle);
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_time);
				global::System.GC.KeepAlive (updateTimer);
				global::System.GC.KeepAlive (onTimerFinished);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']/method[@name='stopTimer' and count(parameter)=0]"
		[Register ("stopTimer", "()V", "")]
		public unsafe void StopTimer ()
		{
			const string __id = "stopTimer.()V";
			try {
				_members.InstanceMethods.InvokeNonvirtualVoidMethod (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='TimeOutTimer']/method[@name='transformSecToString' and count(parameter)=1 and parameter[1][@type='int']]"
		[Register ("transformSecToString", "(I)Ljava/lang/String;", "")]
		public unsafe string TransformSecToString (int longVal)
		{
			const string __id = "transformSecToString.(I)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (longVal);
				var __rm = _members.InstanceMethods.InvokeNonvirtualObjectMethod (__id, this, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
			}
		}

	}
}
