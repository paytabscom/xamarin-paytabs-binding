using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/DateUtils", DoNotGenerateAcw=true)]
	public partial class DateUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/DateUtils", typeof (DateUtils));

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

		protected DateUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']/constructor[@name='DateUtils' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe DateUtils () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']/method[@name='dateToLocalDate' and count(parameter)=1 and parameter[1][@type='java.util.Date']]"
		[Register ("dateToLocalDate", "(Ljava/util/Date;)Ljava/util/Date;", "")]
		public static unsafe global::Java.Util.Date DateToLocalDate (global::Java.Util.Date date)
		{
			const string __id = "dateToLocalDate.(Ljava/util/Date;)Ljava/util/Date;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((date == null) ? IntPtr.Zero : ((global::Java.Lang.Object) date).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return global::Java.Lang.Object.GetObject<global::Java.Util.Date> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (date);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']/method[@name='getTimeAgo' and count(parameter)=1 and parameter[1][@type='java.util.Date']]"
		[Register ("getTimeAgo", "(Ljava/util/Date;)Ljava/lang/String;", "")]
		public static unsafe string GetTimeAgo (global::Java.Util.Date date)
		{
			const string __id = "getTimeAgo.(Ljava/util/Date;)Ljava/lang/String;";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((date == null) ? IntPtr.Zero : ((global::Java.Lang.Object) date).Handle);
				var __rm = _members.StaticMethods.InvokeObjectMethod (__id, __args);
				return JNIEnv.GetString (__rm.Handle, JniHandleOwnership.TransferLocalRef);
			} finally {
				global::System.GC.KeepAlive (date);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']/method[@name='isDateIsBiggerThanCurrentDate' and count(parameter)=1 and parameter[1][@type='long']]"
		[Register ("isDateIsBiggerThanCurrentDate", "(J)Z", "")]
		public static unsafe bool IsDateIsBiggerThanCurrentDate (long timeInMillis)
		{
			const string __id = "isDateIsBiggerThanCurrentDate.(J)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue (timeInMillis);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='DateUtils']/method[@name='isInTheSameDate' and count(parameter)=2 and parameter[1][@type='java.util.Date'] and parameter[2][@type='java.util.Date']]"
		[Register ("isInTheSameDate", "(Ljava/util/Date;Ljava/util/Date;)Z", "")]
		public static unsafe bool IsInTheSameDate (global::Java.Util.Date firstDate, global::Java.Util.Date secondDate)
		{
			const string __id = "isInTheSameDate.(Ljava/util/Date;Ljava/util/Date;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((firstDate == null) ? IntPtr.Zero : ((global::Java.Lang.Object) firstDate).Handle);
				__args [1] = new JniArgumentValue ((secondDate == null) ? IntPtr.Zero : ((global::Java.Lang.Object) secondDate).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (firstDate);
				global::System.GC.KeepAlive (secondDate);
			}
		}

	}
}
