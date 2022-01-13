using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ATCHtmlTagHandler']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/ATCHtmlTagHandler", DoNotGenerateAcw=true)]
	public partial class ATCHtmlTagHandler : global::Java.Lang.Object, global::Android.Text.Html.ITagHandler {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/ATCHtmlTagHandler", typeof (ATCHtmlTagHandler));

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

		protected ATCHtmlTagHandler (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ATCHtmlTagHandler']/constructor[@name='ATCHtmlTagHandler' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe ATCHtmlTagHandler () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
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

		static Delegate cb_handleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_;
#pragma warning disable 0169
		static Delegate GetHandleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_Handler ()
		{
			if (cb_handleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_ == null)
				cb_handleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_ = JNINativeWrapper.CreateDelegate ((_JniMarshal_PPZLLL_V) n_HandleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_);
			return cb_handleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_;
		}

		static void n_HandleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_ (IntPtr jnienv, IntPtr native__this, bool opening, IntPtr native_tag, IntPtr native_output, IntPtr native_xmlReader)
		{
			var __this = global::Java.Lang.Object.GetObject<global::Com.Payment.Paymentsdk.Helper.Utilities.ATCHtmlTagHandler> (jnienv, native__this, JniHandleOwnership.DoNotTransfer);
			var tag = JNIEnv.GetString (native_tag, JniHandleOwnership.DoNotTransfer);
			var output = (global::Android.Text.IEditable)global::Java.Lang.Object.GetObject<global::Android.Text.IEditable> (native_output, JniHandleOwnership.DoNotTransfer);
			var xmlReader = (global::Org.Xml.Sax.IXMLReader)global::Java.Lang.Object.GetObject<global::Org.Xml.Sax.IXMLReader> (native_xmlReader, JniHandleOwnership.DoNotTransfer);
			__this.HandleTag (opening, tag, output, xmlReader);
		}
#pragma warning restore 0169

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ATCHtmlTagHandler']/method[@name='handleTag' and count(parameter)=4 and parameter[1][@type='boolean'] and parameter[2][@type='java.lang.String'] and parameter[3][@type='android.text.Editable'] and parameter[4][@type='org.xml.sax.XMLReader']]"
		[Register ("handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "GetHandleTag_ZLjava_lang_String_Landroid_text_Editable_Lorg_xml_sax_XMLReader_Handler")]
		public virtual unsafe void HandleTag (bool opening, string tag, global::Android.Text.IEditable output, global::Org.Xml.Sax.IXMLReader xmlReader)
		{
			const string __id = "handleTag.(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V";
			IntPtr native_tag = JNIEnv.NewString (tag);
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue (opening);
				__args [1] = new JniArgumentValue (native_tag);
				__args [2] = new JniArgumentValue ((output == null) ? IntPtr.Zero : ((global::Java.Lang.Object) output).Handle);
				__args [3] = new JniArgumentValue ((xmlReader == null) ? IntPtr.Zero : ((global::Java.Lang.Object) xmlReader).Handle);
				_members.InstanceMethods.InvokeVirtualVoidMethod (__id, this, __args);
			} finally {
				JNIEnv.DeleteLocalRef (native_tag);
				global::System.GC.KeepAlive (output);
				global::System.GC.KeepAlive (xmlReader);
			}
		}

	}
}
