using Android.App;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;

using Com.Payment.Paymentsdk.Integrationmodels;
using Com.Payment.Paymentsdk;
using Com.Payment.Paymentsdk.Sharedclasses.Interfaces;
using Com.Payment.Paymentsdk.Save_cards.Entities;
using System;
using System.Collections.Generic;

namespace Pt2AndroidApp
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme", MainLauncher = true)]
    public class MainActivity : AppCompatActivity,ICallbackPaymentInterface, View.IOnClickListener

    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.activity_main);
           Button card= FindViewById<Button>(Resource.Id.cc_btn);
           Button pay_cvv_btn = FindViewById<Button>(Resource.Id.cc_cvv_btn);
           Button apms= FindViewById<Button>(Resource.Id.apms_btn);
            card.SetOnClickListener(this);
            apms.SetOnClickListener(this);
            pay_cvv_btn.SetOnClickListener(this);
        }

        public PaymentSdkConfigurationDetails GetConfigurationDetails()
        {
        
            IList<PaymentSdkApms> apms = new List<PaymentSdkApms>();
            apms.Add(PaymentSdkApms.StcPay);
            return new PaymentSdkConfigBuilder("63904", "STJNNNTDKB-JBKWMD9Z9R-LKLNZBJLG2", "CHKMMD-6MQ962-KVNDP9-NVRM92", 44.0, "EGP")
                .SetCartId("123")
                .SetCartDescription("yyif")
                .SetMerchantCountryCode("EG")
                .SetAlternativePaymentMethods(apms)
                //.SetBillingData(PaymentSdkBillingDetails)
                .SetBillingData(new PaymentSdkBillingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                .SetShippingData(new PaymentSdkShippingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                .Build();

        }

        public PaymentSdkConfigurationDetails GetConfigurationDetailsForSavedCards()
        {

            IList<PaymentSdkApms> apms = new List<PaymentSdkApms>();
            apms.Add(PaymentSdkApms.StcPay);
            return new PaymentSdkConfigBuilder("63904", "STJNNNTDKB-JBKWMD9Z9R-LKLNZBJLG2", "CHKMMD-6MQ962-KVNDP9-NVRM92", 44.0, "EGP")
                .SetCartId("123")
                .SetCartDescription("yyif")
                .SetMerchantCountryCode("EG")
                .SetAlternativePaymentMethods(apms)
                .SetTokenise(PaymentSdkTokenise.MerchantMandatory, new PaymentSdkTokenFormat.Hex32Format())
                //.SetBillingData(PaymentSdkBillingDetails)
                .SetBillingData(new PaymentSdkBillingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                .SetShippingData(new PaymentSdkShippingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                .Build();

        }

        public PaymentSDKSavedCardInfo GetSavecardInfo()
        {
            //Sample: PaymentSDKSavedCardInfo("4111 11## #### 1111","visa");
            return new PaymentSDKSavedCardInfo("**Masked Card Number**", "**Schema name**");
        }

        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }

        public void OnError(PaymentSdkError error)
        {
            Toast.MakeText(Application.Context, error.Msg, ToastLength.Long).Show();
        }

        public void OnPaymentCancel()
        {
            Toast.MakeText(Application.Context, "OnPaymentCancel", ToastLength.Long).Show();
        }

        public void OnPaymentFinish(PaymentSdkTransactionDetails paymentSdkTransactionDetails)
        {
            Console.WriteLine(paymentSdkTransactionDetails);
        }

        public void OnClick(View v)
        {
            if (v.Id == Resource.Id.cc_btn)
                PaymentSdkActivity.StartCardPayment(this, GetConfigurationDetails(), this);
            else if (v.Id == Resource.Id.cc_cvv_btn)
                PaymentSdkActivity.Start3DSecureTokenizedCardPayment(this, GetConfigurationDetails(), GetSavecardInfo(), "**Token String***", this);
            else if (v.Id == Resource.Id.apms_btn)
                PaymentSdkActivity.StartAlternativePaymentMethods(this, GetConfigurationDetails(), this);
        }
    }
}