
# xamarin-paytabs-binding

![Version](https://img.shields.io/badge/Xamarin%20PayTabs%20Binding%20Library-v1.0.0_beta-green)

Xamarin PayTabs binding library is a wrapper for the native PayTabs Android and iOS SDKs, It helps you integrate your Xamarin project with PayTabs.

Library Support:

* [x] iOS
* [x] Android

## Features

* The libaray offers a ready-made card payment screen.
* **Card Scanner** for quick & easy entry of card details (iOS 13.0+). 
* Handle the missing required billing and shipping details.
* Logo, colors, and fonts become easy to be customized.
* **Apple Pay** and **SamsunPay** are supported.
* Support dark mode.
* Alternative payment methods supported.
* Support tokenisation.

## Installation
We created a binding for each platform (iOS & Android)

### iOS
 Install-Package Paytabs.Xamarin.Ios -Version 1.1.0
	
### Android
 1. Install-Package Paytabs.Xamarin.Android -Version 1.0.5
 2. Install-Package Xamarin.Android.Device.YearClass
 3. donwload [CardScanBindingLib.dll](android/CardScanBindingLib.dll) and add it as a reference in your project
![Example](https://user-images.githubusercontent.com/95287975/160606885-1976507d-cc3f-4459-95e3-22edd220e527.png)



## Usage (iOS)
in your project info.plist add <strong>Privacy - Photo Library Usage Description</strong> key .. we use camera to enable camera card scanning

### Pay with Card

1. Configure the billing & shipping info, the shipping info is optional

```cs
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
```

2. Create an object of `PaymentConfiguration ` and fill it with your credentials and payment details.

```cs
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
        };
```
* Setting the billing info

```cs
configuration.BillingDetails = billingDetails;
```

* Options to show billing and shipping ifno

```cs
configuration.ShowBillingInfo = true;
configuration.ShowShippingInfo = true;
```

3. Implement the **IPaymentCallback** interface to handle the payment details & events callback.
 
```cs
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
        }
        else
        {
            Console.WriteLine(error.LocalizedDescription);
        }
    }

    [Export("paymentManagerWithDidCancelPayment:")]
    public void PaymentManagerWithDidCancelPayment(NSError error)
    {
        Console.WriteLine("Cancel Event Handled");
    }

    [Export("paymentManagerWithDidStartPaymentTransaction:")]
    public void PaymentManagerWithDidStartPaymentTransaction(UIViewController rootViewController)
    {
			Console.WriteLine("Payment Proccess Started");
    }
}
```
 
4. Call **StartCardPayment** method

* Define a variable of type **PaymentSDKProxy**

```cs
private PaymentSDKProxy _proxy;
```

* Call the **StartCardPayment** method

```cs
 _proxy.StartCardPaymentWithConfiguration(configuration, this);
```

### Pay with Apple Pay

1. Follow the guide [Steps to configure Apple Pay][applepayguide] to learn how to configure ApplePay with PayTabs.

2. Do the steps 1, 2, and 3 from **Pay with Card**, although you can ignore Billing & Shipping details and Apple Pay will handle it, you must add the **merchant name** and **merchant Apple Pay indentifier** to the configuration.

```cs
    configuration.MerchantName = "Flowers Store";
    configuration.MerchantApplePayIdentifier = "merchant.com.bundleID";
```

3. To simplify ApplePay validation on all user's billing info, pass **SimplifyApplePayValidation** parameter in the configuration with **true**.

```cs
configuration.SimplifyApplePayValidation = true;
```

4. Call `StartApplePayPayment` to start the payment.

```cs
_proxy.StartApplePayPaymentWithConfiguration(configuration, this);
```

### Pay with Alternative Payment Methods

It becomes easy to integrate with other payment methods in your region like STCPay, OmanNet, KNet, Valu, Fawry, UnionPay, and Meeza, to serve a large sector of customers.

1. Do the steps 1, 2, and 3 from **Pay with Card**.

2. Choose one or more of the payment methods you want to support.

```cs
configuration.AlternativePaymentMethods = new string[] { AlternativePaymentMethod.StcPay, ... };
```

3. Start payment by calling `StartAlternativePaymentMehtodWithConfiguration` method and handle the transaction details 

```cs
_proxy.StartAlternativePaymentMehtodWithConfiguration(configuration, this);     
```

### Tokenisation
Follow the below instructions to enable the tokenisation.

1. Request token

```cs
configuration.TokeniseType = TokeniseType.UserOptional; // read more about the tokeniseType in the constants section 
configuration.TokenFormat = TokeniseFromat.Hex32Format; // read more about the tokenFormat in the constants section  

```
After passing the above parameters, you will receive token and transaction reference in the callback, save them for future usage.

2. Pass the token & transaction reference

```cs
configuration.Token = token
configuration.TransactionReference = transactionreference
```

#### Show/Hide Card Scanner

```cs
configuration.HideCardScanner = true;
```

#### Theme Customization

![UI guide](https://user-images.githubusercontent.com/13621658/109432213-d7981380-7a12-11eb-9224-c8fc12b0024d.jpg)

Create an instance from the class `PaymentTheme` and configure its fonts and colors.

```cs
PaymentTheme theme = new PaymentTheme
    {
        BackgroundColor= "4853b8", // color hex value
        PrimaryColor = "956596"
    };
    
configuration.Theme = theme;
```

### Constants

The following constants will help you in customizing your configuration.

* Tokenise types

 The default type is none

```cs
TokeniseType {
    None, 
    MerchantMandatory,
    UserMandatory,
    UserOptional;
}
```

```cs
configuration.TokeniseType = TokeniseType.UserOptional;
```

* Transaction classes

 The default class is ecom

```cs
TransactionClass {
    Ecom, 
    Recurring;
}
```

```cs
configuration.TransactionClass = TransactionClass.Recurring;
```

* Token formats

The default format is hex32

```cas
TokeniseFromat {
    None, 
    Hex32, 
    AlphaNum20, 
    Digit22, 
    Digit16, 
    AlphaNum32;
}
```

```cs
configuration.TokenFormat = TokeniseFromat.Hex32;
```

* Transaction types

The default type is sale

```cs
TransactionType {
    Sale, 
    Authorize;
}
```

```cs
configuration.TransactionType = TransactionType.Sale;
```

* Alternative payment methods

```cs
AlternativePaymentMethod {
    UnionPay, 
    StcPay, 
    Valu, 
    MeezaQR, 
    Omannet, 
    KnetCredit, 
    KnetDebit, 
    Fawry;
}
```

```cs
configuration.alternativePaymentMethods = new string[] { AlternativePaymentMethod.StcPay, ...};
```

--------------------------------------
## Usage (Android)
### Pay with Card

1. Configure the billing & shipping info, the shipping info is optional

```cs
PaymentBillingDetails billingDetails = new PaymentSdkBillingDetails("Dubai",
	"AE",
	"email@domain.com",
	"John Smith", 
	"+971111111111", 
	"Dubai","Address line",
	"12345");

PaymentSdkShippingDetails shippingDetails = new PaymentSdkShippingDetails("Dubai",
	"AE",
	"email@domain.com",
	"John Smith", 
	"+971111111111", 
	"Dubai","Address line",
	"12345");
           
```

2. Create an object of `PaymentConfiguration ` and fill it with your credentials and payment details.

```cs
PaymentSdkConfigurationDetails configuration = new PaymentSdkConfigBuilder("*Profile ID*", 
"*Server Key*", "*Client Key*", 44.0, "USD")
                .SetCartId("123")
                .SetCartDescription("yyif")
                .SetMerchantCountryCode("AE")
                .SetBillingData(billDetails)
                .SetShippingData(shippingDetails)
                .Build();
```

* Setting the billing info

```cs
configuration.BillingDetails = billingDetails;
```

* Options to show billing and shipping info

```cs
configuration.ShowBillingInfo = true;
configuration.ShowShippingInfo = true;
```

3. Implement the **ICallbackPaymentInterface** interface to handle the payment details & events callback.
 
```cs
public void OnError(PaymentSdkError error)
{
    Console.WriteLine(error.Msg);
}

public void OnPaymentCancel()
{
    Console.WriteLine("OnPaymentCancel");
}

public void OnPaymentFinish(PaymentSdkTransactionDetails paymentSdkTransactionDetails)
{
    Console.WriteLine(paymentSdkTransactionDetails);
}
```
 
4. Call the **StartCardPayment** method

```cs
 PaymentSdkActivity.StartCardPayment(this,configuration, this);
```

### Pay with Alternative Payment Methods

1. Do the steps 1, 2, and 3 from **Pay with Card**.

2. Choose one or more of the payment methods you want to support.

```cs
IList<PaymentSdkApms> apms = new List<PaymentSdkApms>();
apms.Add(PaymentSdkApms.StcPay);
            
configuration.AlternativePaymentMethods = apms;
```

3. Start payment by calling `StartAlternativePaymentMethods` method and handle the transaction details 

```cs
PaymentSdkActivity.StartAlternativePaymentMethods(this, configuration, this);     
```

### Constants

The following constants will help you in customizing your configuration.

* Tokenise types

 The default type is none

```cs
PaymentSdkTokenise {
    None, 
    MerchantMandatory,
    UserMandatory,
    UserOptional;
}
```

```cs
configuration.TokeniseType = TokeniseType.UserOptinoal;
```

* Transaction classes

 The default class is ecom

```cs
PaymentSdkTransactionClass {
    Ecom, 
    Recurring;
}
```

```cs
configuration.TransactionClass = TransactionClass.Recurring;
```

* Token formats

The default format is hex32

```cas
PaymentSdkTokenFormat {
    None, 
    Hex32, 
    AlphaNum20, 
    Digit22, 
    Digit16, 
    AlphaNum32;
}
```

```cs
configuration.TokenFormat = TokeniseFromat.Hex32;
```

* Transaction types

The default type is sale

```cs
PaymentSdkTransactionType {
    Sale, 
    Auth;
}
```

```cs
configuration.TransactionType = TransactionType.Sale;
```

* Alternative payment methods

```cs
AlternativePaymentMethod {
    UnionPay, 
    StcPay, 
    Valu, 
    MeezaQr, 
    OmanNet, 
    KnetCredit, 
    KnetDebit, 
    Fawry;
}
```

```cs
configuration.alternativePaymentMethods = new string[] { AlternativePaymentMethod.StcPay, ...};
```
### Tokenisation
Follow the below instructions to enable the tokenisation.

1. Request token

```cs
configuration.TokeniseType = PaymentSdkTokenise.UserOptional // read more about the tokeniseType in the constants section 
configuration.TokenFormat = PaymentSdkTokenFormat.Hex32Format // read more about the tokenFormat in the constants section  

```
After passing the above parameters, you will receive token and transaction reference in the callback, save them for future usage.

2. Pass the token & transaction reference

```cs
configuration.Token = token
configuration.TransactionReference = transactionreference
```

#### Show/Hide Card Scanner

```cs
configuration.HideCardScanner = true;
```

### Theme Customization

````xml
<resourse>
  // to override colors
     <color name="payment_sdk_primary_color">#5C13DF</color>
     <color name="payment_sdk_secondary_color">#FFC107</color>
     <color name="payment_sdk_primary_font_color">#111112</color>
     <color name="payment_sdk_secondary_font_color">#6D6C70</color>
     <color name="payment_sdk_separators_color">#FFC107</color>
     <color name="payment_sdk_stroke_color">#673AB7</color>
     <color name="payment_sdk_button_text_color">#FFF</color>
     <color name="payment_sdk_title_text_color">#FFF</color>
     <color name="payment_sdk_button_background_color">#3F51B5</color>
     <color name="payment_sdk_background_color">#F9FAFD</color>
     <color name="payment_sdk_card_background_color">#F9FAFD</color> 
   
  // to override dimens
     <dimen name="payment_sdk_primary_font_size">17sp</dimen>
     <dimen name="payment_sdk_secondary_font_size">15sp</dimen>
     <dimen name="payment_sdk_separator_thickness">1dp</dimen>
     <dimen name="payment_sdk_stroke_thickness">.5dp</dimen>
     <dimen name="payment_sdk_input_corner_radius">8dp</dimen>
     <dimen name="payment_sdk_button_corner_radius">8dp</dimen>
     
</resourse>
````

- Override strings:
To override string you can find the keys with the default values here
[English][english], [Arabic][arabic].

## Demo application

Download our sample apps from here [iOS Sample][iossample], [Android Sample][androidsample].

<img src="https://user-images.githubusercontent.com/13621658/109432386-905e5280-7a13-11eb-847c-63f2c554e2d1.png" width="370">

## License

See [LICENSE][license].

## Paytabs

[Support][1] | [Terms of Use][2] | [Privacy Policy][3]

 [1]: https://www.paytabs.com/en/support/
 [2]: https://www.paytabs.com/en/terms-of-use/
 [3]: https://www.paytabs.com/en/privacy-policy/
 [license]: https://github.com/paytabscom/xamarin-paytabs-binding/blob/main/LICENSE
 [applepayguide]: https://github.com/paytabscom/xamarin-paytabs-binding/blob/main/ApplePayConfiguration.md
 [iosbindinglibrary]: https://github.com/paytabscom/xamarin-paytabs-binding/tree/main/ios/PaymentSDK.Binding
 [androidbindinglibrary]: https://github.com/paytabscom/xamarin-paytabs-binding/tree/main/android/PaymentSDK.Binding
 [cardscanbindinglibrary]: https://github.com/paytabscom/xamarin-paytabs-binding/tree/main/android/CardScanBindingLib

[iossample]: https://github.com/paytabscom/xamarin-paytabs-binding/tree/main/ios/PayTabsSample
[androidsample]: https://github.com/paytabscom/xamarin-paytabs-binding/tree/main/android/PayTabsSample

 [english]: https://github.com/paytabscom/paytabs-android-library-sample/blob/master/res/strings.xml
 [arabic]: https://github.com/paytabscom/paytabs-android-library-sample/blob/master/res/strings-ar.xml

