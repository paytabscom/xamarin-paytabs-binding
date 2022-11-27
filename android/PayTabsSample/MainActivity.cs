using Android.App;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using AndroidX.AppCompat.App;
using Com.Payment.Paymentsdk.Integrationmodels;
using Com.Payment.Paymentsdk;
using Com.Payment.Paymentsdk.Sharedclasses.Interfaces;
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
           Button apms= FindViewById<Button>(Resource.Id.apms_btn);
            card.SetOnClickListener(this);
            apms.SetOnClickListener(this);
           
        }
        public PaymentSdkConfigurationDetails GetConfigurationDetails()
        {
            //PaymentSdkBillingDetails



            IList<PaymentSdkApms> apms = new List<PaymentSdkApms>();
            apms.Add(PaymentSdkApms.StcPay);
            return new PaymentSdkConfigBuilder("*Profile ID*", "*Server Key*", "*Client Key*", 44.0, "USD")
                .SetCartId("123")
                .SetCartDescription("yyif")
                .SetMerchantCountryCode("AE")
                .SetAlternativePaymentMethods(apms)
                //.SetBillingData(new PaymentSdkBillingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                //.SetShippingData(new PaymentSdkShippingDetails("Dubai", "AE", "email@domain.com", "John Smith", "+971111111111", "Dubai", "Address line", "12345"))
                .Build();

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
            if(v.Id == Resource.Id.cc_btn)
            PaymentSdkActivity.StartCardPayment(this,GetConfigurationDetails(), this);
            else if(v.Id == Resource.Id.apms_btn)
            PaymentSdkActivity.StartAlternativePaymentMethods(this, GetConfigurationDetails(), this);
            PaymentSdkActivity.Start3DSecureTokenizedCardPayment(); 
        }
    }
}