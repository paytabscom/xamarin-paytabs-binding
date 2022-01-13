using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Utils {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']"
	[global::Android.Runtime.Register ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/Constants", DoNotGenerateAcw=true)]
	public partial class Constants : global::Java.Lang.Object {
		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']/field[@name='ASSETS_DIR']"
		[Register ("ASSETS_DIR")]
		public const string AssetsDir = (string) "cardrecognizer";


		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']/field[@name='DEBUG']"
		[Register ("DEBUG")]
		public static bool Debug {
			get {
				const string __id = "DEBUG.Z";

				var __v = _members.StaticFields.GetBooleanValue (__id);
				return __v;
			}
		}

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']/field[@name='MODEL_DIR']"
		[Register ("MODEL_DIR")]
		public const string ModelDir = (string) "cardrecognizer/model";

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']/field[@name='NEURO_DATA_VERSION']"
		[Register ("NEURO_DATA_VERSION")]
		public const int NeuroDataVersion = (int) 9;

		// Metadata.xml XPath field reference: path="/api/package[@name='com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils']/class[@name='Constants']/field[@name='PAYCARDS_URL']"
		[Register ("PAYCARDS_URL")]
		public const string PaycardsUrl = (string) "https://pay.cards";

		static readonly JniPeerMembers _members = new XAPeerMembers ("com/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/utils/Constants", typeof (Constants));

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

		protected Constants (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

	}
}
