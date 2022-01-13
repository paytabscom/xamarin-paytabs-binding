using System;

[assembly:global::Android.Runtime.NamespaceMapping (Java = "cards.pay.paycardsrecognizer.sdk", Managed="Cards.Pay.Paycardsrecognizer.Sdk")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Gles")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Camera.Widget")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.UI")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.views", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.UI.Views")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils", Managed="Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Utils")]

delegate int _JniMarshal_PP_I (IntPtr jnienv, IntPtr klass);
delegate IntPtr _JniMarshal_PP_L (IntPtr jnienv, IntPtr klass);
delegate void _JniMarshal_PP_V (IntPtr jnienv, IntPtr klass);
delegate bool _JniMarshal_PP_Z (IntPtr jnienv, IntPtr klass);
delegate void _JniMarshal_PPI_V (IntPtr jnienv, IntPtr klass, int p0);
delegate int _JniMarshal_PPII_I (IntPtr jnienv, IntPtr klass, int p0, int p1);
delegate void _JniMarshal_PPII_V (IntPtr jnienv, IntPtr klass, int p0, int p1);
delegate int _JniMarshal_PPIIL_I (IntPtr jnienv, IntPtr klass, int p0, int p1, IntPtr p2);
delegate void _JniMarshal_PPL_V (IntPtr jnienv, IntPtr klass, IntPtr p0);
delegate bool _JniMarshal_PPL_Z (IntPtr jnienv, IntPtr klass, IntPtr p0);
delegate void _JniMarshal_PPLI_V (IntPtr jnienv, IntPtr klass, IntPtr p0, int p1);
delegate void _JniMarshal_PPLLIIIILLII_V (IntPtr jnienv, IntPtr klass, IntPtr p0, IntPtr p1, int p2, int p3, int p4, int p5, IntPtr p6, IntPtr p7, int p8, int p9);
delegate void _JniMarshal_PPLZ_V (IntPtr jnienv, IntPtr klass, IntPtr p0, bool p1);
delegate void _JniMarshal_PPZ_V (IntPtr jnienv, IntPtr klass, bool p0);
delegate void _JniMarshal_PPZL_V (IntPtr jnienv, IntPtr klass, bool p0, IntPtr p1);
#if !NET
namespace System.Runtime.Versioning {
    [System.Diagnostics.Conditional("NEVER")]
    [AttributeUsage(AttributeTargets.Assembly | AttributeTargets.Class | AttributeTargets.Constructor | AttributeTargets.Event | AttributeTargets.Method | AttributeTargets.Module | AttributeTargets.Property | AttributeTargets.Struct, AllowMultiple = true, Inherited = false)]
    internal sealed class SupportedOSPlatformAttribute : Attribute {
        public SupportedOSPlatformAttribute (string platformName) { }
    }
}
#endif

