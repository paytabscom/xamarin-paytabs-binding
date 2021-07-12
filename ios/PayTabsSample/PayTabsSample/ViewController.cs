using System;
using UIKit;
using PaymentSDKBinding;
using Foundation;

namespace PayTabsSample
{
    public partial class ViewController : UIViewController
    {
        private PaymentSDKProxy _proxy;

        public ViewController(IntPtr handle)
            : base(handle)
        {

        }

        public override void ViewDidLoad()
        {
            base.ViewDidLoad();
            btnPaywithCard.AddTarget(btnPayWithCard_Tap, UIControlEvent.TouchUpInside);
            btnPaywithApplePay.AddTarget(btnPayWithApplePay_Tap, UIControlEvent.TouchUpInside);
            btnPaywithAPMs.AddTarget(btnPayWithAPMs_Tap, UIControlEvent.TouchUpInside);
            _proxy = new PaymentSDKProxy();

        }

        PaymentBillingDetails billingDetails = new PaymentBillingDetails
        {
            Name = "John Smith",
            Email = "email@domain.com",
            Phone = "+971111111111",
            AddressLine = "Address line",
            City = "Dubai",
            State = "Dubai",
            CountryCode = "AE",
            Zip = "12345"
        };

        PaymentShippingDetails shippingDetails = new PaymentShippingDetails
        {
            Name = "John Smith",
            Email = "email@domain.com",
            Phone = "+971111111111",
            AddressLine = "Address line",
            City = "Dubai",
            State = "Dubai",
            CountryCode = "AE",
            Zip = "12345"
        };

        PaymentConfiguration configuration = new PaymentConfiguration
        {
            ProfileID = "*Profile Id*",
            ServerKey = "*Server key*",
            ClientKey = "*Client Key*",
            MerchantCountryCode = "AE",
            Currency = "USD",
            Amount = 130,
            CartID = "123456",
            CartDescription = "Buy 2 Flowers",
            MerchantName = "Flowers Store",
            ScreenTitle = "Pay with Card",
            //ShowBillingInfo = true
        };

        private void btnPayWithCard_Tap(object sender, EventArgs e)
        {
            PaymentConfiguration paymentRequestConfiguration = configuration;

            //configuration.Theme = theme;
            configuration.BillingDetails = billingDetails;
            _proxy.StartCardPaymentWithConfiguration(paymentRequestConfiguration, this);
        }

        private void btnPayWithApplePay_Tap(object sender, EventArgs e)
        {
            PaymentConfiguration paymentRequestConfiguration = configuration;
            configuration.BillingDetails = billingDetails;
            configuration.MerchantApplePayIdentifier = "merchant.com.bundleid";
            _proxy.StartApplePayPaymentWithConfiguration(paymentRequestConfiguration, this);
        }

        private void btnPayWithAPMs_Tap(object sender, EventArgs e)
        {
            PaymentConfiguration paymentRequestConfiguration = configuration;
            configuration.Currency = "EGP";
            configuration.BillingDetails = billingDetails;
            configuration.AlternativePaymentMethods = new string[] { AlternativePaymentMethod.Valu, AlternativePaymentMethod.Fawry };
            _proxy.StartAlternativePaymentMehtodWithConfiguration(paymentRequestConfiguration, this);
        }

    }

    public partial class ViewController : IPaymentCallback
    {
        [Export("paymentManagerWithDidFinishTransaction:error:")]
        public void PaymentManagerWithDidFinishTransaction(PaymentTransactionDetails transactionDetails, NSError error)
        {
            if (error == null)
            {
                string result = "Transaction Details:";
                result += "\nResponseCode: " + transactionDetails.PaymentResult.ResponseCode;
                result += "\nResponseMessage: " + transactionDetails.PaymentResult.ResponseMessage;
                result += "\nTransactionReference: " + transactionDetails.TransactionReference;
                if (transactionDetails.Token != null)
                {
                    result += "\nToken: " + transactionDetails.Token;
                }
                Console.WriteLine(result);
                showAlert(result);
            }
            else
            {
                showAlert(error.LocalizedDescription);
            }
        }

        [Export("paymentManagerWithDidCancelPayment:")]
        public void PaymentManagerWithDidCancelPayment(NSError error)
        {
            //showAlert("Cancel Handler");
        }

        [Export("paymentManagerWithDidStartPaymentTransaction:")]
        public void PaymentManagerWithDidStartPaymentTransaction(UIViewController rootViewController)
        {

        }

        private void showAlert(string message)
        {

            UIAlertController alertController = UIAlertController.Create("Sample App", message, UIAlertControllerStyle.Alert);
            alertController.AddAction(UIAlertAction.Create("Ok", UIAlertActionStyle.Default, null));
            PresentViewController(alertController, true, null);
        }
    }
}


