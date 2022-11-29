using System;

[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk", Managed="Com.Payment.Paymentsdk")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.creditcard.view.cardform.view", Managed="Com.Payment.Paymentsdk.Creditcard.View.Cardform.View")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.creditcard.view.customs", Managed="Com.Payment.Paymentsdk.Creditcard.View.Customs")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.d3s.view", Managed="Com.Payment.Paymentsdk.D3s.View")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.helper.ui", Managed="Com.Payment.Paymentsdk.Helper.UI")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.integrationmodels", Managed="Com.Payment.Paymentsdk.Integrationmodels")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.save_cards.entities", Managed="Com.Payment.Paymentsdk.Save_cards.Entities")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.save_cards.presentation.ui", Managed="Com.Payment.Paymentsdk.Save_cards.Presentation.UI")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.sharedclasses.interfaces", Managed="Com.Payment.Paymentsdk.Sharedclasses.Interfaces")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.sharedclasses.model.response", Managed="Com.Payment.Paymentsdk.Sharedclasses.Model.Response")]
[assembly:global::Android.Runtime.NamespaceMapping (Java = "com.payment.paymentsdk.sharedclasses.remote", Managed="Com.Payment.Paymentsdk.Sharedclasses.Remote")]

delegate int _JniMarshal_PP_I (IntPtr jnienv, IntPtr klass);
delegate IntPtr _JniMarshal_PP_L (IntPtr jnienv, IntPtr klass);
delegate void _JniMarshal_PP_V (IntPtr jnienv, IntPtr klass);
delegate bool _JniMarshal_PP_Z (IntPtr jnienv, IntPtr klass);
delegate IntPtr _JniMarshal_PPI_L (IntPtr jnienv, IntPtr klass, int p0);
delegate void _JniMarshal_PPL_V (IntPtr jnienv, IntPtr klass, IntPtr p0);
delegate void _JniMarshal_PPLI_V (IntPtr jnienv, IntPtr klass, IntPtr p0, int p1);
delegate void _JniMarshal_PPLIII_V (IntPtr jnienv, IntPtr klass, IntPtr p0, int p1, int p2, int p3);
delegate bool _JniMarshal_PPLIL_Z (IntPtr jnienv, IntPtr klass, IntPtr p0, int p1, IntPtr p2);
delegate IntPtr _JniMarshal_PPLL_L (IntPtr jnienv, IntPtr klass, IntPtr p0, IntPtr p1);
delegate void _JniMarshal_PPLZ_V (IntPtr jnienv, IntPtr klass, IntPtr p0, bool p1);
delegate IntPtr _JniMarshal_PPZ_L (IntPtr jnienv, IntPtr klass, bool p0);
#if !NET
namespace System.Runtime.Versioning {
    [System.Diagnostics.Conditional("NEVER")]
    [AttributeUsage(AttributeTargets.Assembly | AttributeTargets.Class | AttributeTargets.Constructor | AttributeTargets.Event | AttributeTargets.Method | AttributeTargets.Module | AttributeTargets.Property | AttributeTargets.Struct, AllowMultiple = true, Inherited = false)]
    internal sealed class SupportedOSPlatformAttribute : Attribute {
        public SupportedOSPlatformAttribute (string platformName) { }
    }
}
#endif

