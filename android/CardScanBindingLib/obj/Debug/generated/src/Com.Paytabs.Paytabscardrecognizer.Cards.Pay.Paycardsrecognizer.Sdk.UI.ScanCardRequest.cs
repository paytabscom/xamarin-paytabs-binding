using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.UI {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ui/ScanCardRequest", DoNotGenerateAcw=true)]
	public sealed partial class ScanCardRequest : global::Java.Lang.Object, global::Android.OS.IParcelable {

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/field[@name='CREATOR']"
		[Register ("CREATOR")]
		public static global::Android.OS.IParcelableCreator Creator {
			get {
				const string __id = "CREATOR.Landroid/os/Parcelable$Creator;";

				var __v = _members.StaticFields.GetObjectValue (__id);
				return global::Java.Lang.Object.GetObject<global::Android.OS.IParcelableCreator> (__v.Handle, JniHandleOwnership.TransferLocalRef);
			}
		}

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/field[@name='DEFAULT_ENABLE_SOUND']"
		[Register ("DEFAULT_ENABLE_SOUND")]
		public const bool DefaultEnableSound = (bool) true;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/field[@name='DEFAULT_GRAB_CARD_IMAGE']"
		[Register ("DEFAULT_GRAB_CARD_IMAGE")]
		public const bool DefaultGrabCardImage = (bool) false;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/field[@name='DEFAULT_SCAN_CARD_HOLDER']"
		[Register ("DEFAULT_SCAN_CARD_HOLDER")]
		public const bool DefaultScanCardHolder = (bool) true;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/field[@name='DEFAULT_SCAN_EXPIRATION_DATE']"
		[Register ("DEFAULT_SCAN_EXPIRATION_DATE")]
		public const bool DefaultScanExpirationDate = (bool) true;

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ui/ScanCardRequest", typeof (ScanCardRequest));

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

		internal ScanCardRequest (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/constructor[@name='ScanCardRequest' and count(parameter)=4 and parameter[1][@type='boolean'] and parameter[2][@type='boolean'] and parameter[3][@type='boolean'] and parameter[4][@type='boolean']]"
		[Register (".ctor", "(ZZZZ)V", "")]
		public unsafe ScanCardRequest (bool enableSound, bool scanExpirationDate, bool scanCardHolder, bool grabCardImage) : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "(ZZZZ)V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (enableSound);
				__args [1] = new JniArgumentValue (scanExpirationDate);
				__args [2] = new JniArgumentValue (scanCardHolder);
				__args [3] = new JniArgumentValue (grabCardImage);
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), __args);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, __args);
			} finally {
			}
		}

		public static unsafe global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.UI.ScanCardRequest Default {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='getDefault' and count(parameter)=0]"
			[Register ("getDefault", "()Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ui/ScanCardRequest;", "")]
			get {
				const string __id = "getDefault.()Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ui/ScanCardRequest;";
				try {
					var __rm = _members.StaticMethods.InvokeObjectMethod (__id, null);
					return global::Java.Lang.Object.GetObject<global::Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.UI.ScanCardRequest> (__rm.Handle, JniHandleOwnership.TransferLocalRef);
				} finally {
				}
			}
		}

		public unsafe bool IsGrabCardImageEnabled {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='isGrabCardImageEnabled' and count(parameter)=0]"
			[Register ("isGrabCardImageEnabled", "()Z", "")]
			get {
				const string __id = "isGrabCardImageEnabled.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe bool IsScanCardHolderEnabled {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='isScanCardHolderEnabled' and count(parameter)=0]"
			[Register ("isScanCardHolderEnabled", "()Z", "")]
			get {
				const string __id = "isScanCardHolderEnabled.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe bool IsScanExpirationDateEnabled {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='isScanExpirationDateEnabled' and count(parameter)=0]"
			[Register ("isScanExpirationDateEnabled", "()Z", "")]
			get {
				const string __id = "isScanExpirationDateEnabled.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		public unsafe bool IsSoundEnabled {
			// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='isSoundEnabled' and count(parameter)=0]"
			[Register ("isSoundEnabled", "()Z", "")]
			get {
				const string __id = "isSoundEnabled.()Z";
				try {
					var __rm = _members.InstanceMethods.InvokeAbstractBooleanMethod (__id, this, null);
					return __rm;
				} finally {
				}
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='describeContents' and count(parameter)=0]"
		[Register ("describeContents", "()I", "")]
		public unsafe int DescribeContents ()
		{
			const string __id = "describeContents.()I";
			try {
				var __rm = _members.InstanceMethods.InvokeAbstractInt32Method (__id, this, null);
				return __rm;
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui']/class[@name='ScanCardRequest']/method[@name='writeToParcel' and count(parameter)=2 and parameter[1][@type='android.os.Parcel'] and parameter[2][@type='int']]"
		[Register ("writeToParcel", "(Landroid/os/Parcel;I)V", "")]
		public unsafe void WriteToParcel (global::Android.OS.Parcel dest, [global::Android.Runtime.GeneratedEnum] global::Android.OS.ParcelableWriteFlags flags)
		{
			const string __id = "writeToParcel.(Landroid/os/Parcel;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((dest == null) ? IntPtr.Zero : ((global::Java.Lang.Object) dest).Handle);
				__args [1] = new JniArgumentValue ((int) flags);
				_members.InstanceMethods.InvokeAbstractVoidMethod (__id, this, __args);
			} finally {
				global::System.GC.KeepAlive (dest);
			}
		}

	}
}
