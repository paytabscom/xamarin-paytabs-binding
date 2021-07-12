using System;
using Foundation;
using ObjCRuntime;
using UIKit;

namespace PaymentSDKBinding
{
	// @interface AlternativePaymentMethod : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy24AlternativePaymentMethod")]
	interface AlternativePaymentMethod
	{
		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull unionPay;
		[Static]
		[Export("unionPay")]
		string UnionPay { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull stcPay;
		[Static]
		[Export("stcPay")]
		string StcPay { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull valu;
		[Static]
		[Export("valu")]
		string Valu { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull meezaQR;
		[Static]
		[Export("meezaQR")]
		string MeezaQR { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull omannet;
		[Static]
		[Export("omannet")]
		string Omannet { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull knetCredit;
		[Static]
		[Export("knetCredit")]
		string KnetCredit { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull knetDebit;
		[Static]
		[Export("knetDebit")]
		string KnetDebit { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull fawry;
		[Static]
		[Export("fawry")]
		string Fawry { get; }
	}

	// @interface PaymentBillingDetails : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy21PaymentBillingDetails")]
	interface PaymentBillingDetails
	{
		// @property (copy, nonatomic) NSString * _Nullable name;
		[NullAllowed, Export("name")]
		string Name { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable email;
		[NullAllowed, Export("email")]
		string Email { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable phone;
		[NullAllowed, Export("phone")]
		string Phone { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable addressLine;
		[NullAllowed, Export("addressLine")]
		string AddressLine { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable city;
		[NullAllowed, Export("city")]
		string City { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable state;
		[NullAllowed, Export("state")]
		string State { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable countryCode;
		[NullAllowed, Export("countryCode")]
		string CountryCode { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable zip;
		[NullAllowed, Export("zip")]
		string Zip { get; set; }
	}

	// @protocol PaymentCallback
	/*
  Check whether adding [Model] to this declaration is appropriate.
  [Model] is used to generate a C# class that implements this protocol,
  and might be useful for protocols that consumers are supposed to implement,
  since consumers can subclass the generated class instead of implementing
  the generated interface. If consumers are not supposed to implement this
  protocol, then [Model] is redundant and will generate code that will never
  be used.
*/
	[Protocol(Name = "_TtP15PaymentSDKProxy15PaymentCallback_")]
	interface PaymentCallback
	{
		// @required -(void)paymentManagerWithDidFinishTransaction:(PaymentTransactionDetails * _Nullable)transactionDetails error:(NSError * _Nullable)error;
		[Abstract]
		[Export("paymentManagerWithDidFinishTransaction:error:")]
		void PaymentManagerWithDidFinishTransaction([NullAllowed] PaymentTransactionDetails transactionDetails, [NullAllowed] NSError error);

		// @required -(void)paymentManagerWithDidCancelPayment:(NSError * _Nullable)error;
		[Abstract]
		[Export("paymentManagerWithDidCancelPayment:")]
		void PaymentManagerWithDidCancelPayment([NullAllowed] NSError error);

		// @required -(void)paymentManagerWithDidStartPaymentTransaction:(UIViewController * _Nonnull)rootViewController;
		[Abstract]
		[Export("paymentManagerWithDidStartPaymentTransaction:")]
		void PaymentManagerWithDidStartPaymentTransaction(UIViewController rootViewController);
	}

	// @interface PaymentConfiguration : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy20PaymentConfiguration")]
	interface PaymentConfiguration
	{
		// @property (copy, nonatomic) NSString * _Nonnull profileID;
		[Export("profileID")]
		string ProfileID { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull serverKey;
		[Export("serverKey")]
		string ServerKey { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull clientKey;
		[Export("clientKey")]
		string ClientKey { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionType;
		[NullAllowed, Export("transactionType")]
		string TransactionType { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionClass;
		[NullAllowed, Export("transactionClass")]
		string TransactionClass { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull cartID;
		[Export("cartID")]
		string CartID { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull currency;
		[Export("currency")]
		string Currency { get; set; }

		// @property (nonatomic) double amount;
		[Export("amount")]
		double Amount { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull cartDescription;
		[Export("cartDescription")]
		string CartDescription { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable languageCode;
		[NullAllowed, Export("languageCode")]
		string LanguageCode { get; set; }

		// @property (nonatomic, strong) PaymentTheme * _Nullable theme;
		[NullAllowed, Export("theme", ArgumentSemantic.Strong)]
		PaymentTheme Theme { get; set; }

		// @property (nonatomic) BOOL forceShippingInfo;
		[Export("forceShippingInfo")]
		bool ForceShippingInfo { get; set; }

		// @property (nonatomic) BOOL showBillingInfo;
		[Export("showBillingInfo")]
		bool ShowBillingInfo { get; set; }

		// @property (nonatomic) BOOL showShippingInfo;
		[Export("showShippingInfo")]
		bool ShowShippingInfo { get; set; }

		// @property (nonatomic, strong) PaymentBillingDetails * _Nullable billingDetails;
		[NullAllowed, Export("billingDetails", ArgumentSemantic.Strong)]
		PaymentBillingDetails BillingDetails { get; set; }

		// @property (nonatomic, strong) PaymentShippingDetails * _Nullable shippingDetails;
		[NullAllowed, Export("shippingDetails", ArgumentSemantic.Strong)]
		PaymentShippingDetails ShippingDetails { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable merchantApplePayIdentifier;
		[NullAllowed, Export("merchantApplePayIdentifier")]
		string MerchantApplePayIdentifier { get; set; }

		// @property (copy, nonatomic) NSArray<NSString *> * _Nullable paymentNetworks;
		[NullAllowed, Export("paymentNetworks", ArgumentSemantic.Copy)]
		string[] PaymentNetworks { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull merchantCountryCode;
		[Export("merchantCountryCode")]
		string MerchantCountryCode { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable serverIP;
		[NullAllowed, Export("serverIP")]
		string ServerIP { get; set; }

		// @property (nonatomic) NSInteger tokeniseType;
		[Export("tokeniseType")]
		nint TokeniseType { get; set; }

		// @property (copy, nonatomic) NSString * _Nonnull tokenFormat;
		[Export("tokenFormat")]
		string TokenFormat { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable token;
		[NullAllowed, Export("token")]
		string Token { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionReference;
		[NullAllowed, Export("transactionReference")]
		string TransactionReference { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable screenTitle;
		[NullAllowed, Export("screenTitle")]
		string ScreenTitle { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable merchantName;
		[NullAllowed, Export("merchantName")]
		string MerchantName { get; set; }

		// @property (nonatomic) BOOL hideCardScanner;
		[Export("hideCardScanner")]
		bool HideCardScanner { get; set; }

		// @property (nonatomic) BOOL simplifyApplePayValidation;
		[Export("simplifyApplePayValidation")]
		bool SimplifyApplePayValidation { get; set; }

		// @property (copy, nonatomic) NSArray<NSString *> * _Nullable alternativePaymentMethods;
		[NullAllowed, Export("alternativePaymentMethods", ArgumentSemantic.Copy)]
		string[] AlternativePaymentMethods { get; set; }
	}

	// @interface PaymentInfoViewModel : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy20PaymentInfoViewModel")]
	[DisableDefaultCtor]
	interface PaymentInfoViewModel
	{
		// @property (copy, nonatomic) NSString * _Nullable cardType;
		[NullAllowed, Export("cardType")]
		string CardType { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable cardScheme;
		[NullAllowed, Export("cardScheme")]
		string CardScheme { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable paymentDescription;
		[NullAllowed, Export("paymentDescription")]
		string PaymentDescription { get; set; }
	}

	// @interface PaymentResultViewModel : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy22PaymentResultViewModel")]
	[DisableDefaultCtor]
	interface PaymentResultViewModel
	{
		// @property (copy, nonatomic) NSString * _Nullable responseStatus;
		[NullAllowed, Export("responseStatus")]
		string ResponseStatus { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable responseCode;
		[NullAllowed, Export("responseCode")]
		string ResponseCode { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable responseMessage;
		[NullAllowed, Export("responseMessage")]
		string ResponseMessage { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionTime;
		[NullAllowed, Export("transactionTime")]
		string TransactionTime { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable acquirerMessage;
		[NullAllowed, Export("acquirerMessage")]
		string AcquirerMessage { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable acquirerRRN;
		[NullAllowed, Export("acquirerRRN")]
		string AcquirerRRN { get; set; }
	}

	// @interface PaymentSDKProxy : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy15PaymentSDKProxy")]
	interface PaymentSDKProxy
	{
		// -(void)startCardPaymentWithConfiguration:(PaymentConfiguration * _Nonnull)configuration deleagte:(id<PaymentCallback> _Nonnull)deleagte;
		[Export("startCardPaymentWithConfiguration:deleagte:")]
		void StartCardPaymentWithConfiguration(PaymentConfiguration configuration, IPaymentCallback deleagte);

		// -(void)startApplePayPaymentWithConfiguration:(PaymentConfiguration * _Nonnull)configuration deleagte:(id<PaymentCallback> _Nonnull)deleagte;
		[Export("startApplePayPaymentWithConfiguration:deleagte:")]
		void StartApplePayPaymentWithConfiguration(PaymentConfiguration configuration, IPaymentCallback deleagte);

		// -(void)startAlternativePaymentMehtodWithConfiguration:(PaymentConfiguration * _Nonnull)configuration deleagte:(id<PaymentCallback> _Nonnull)deleagte;
		[Export("startAlternativePaymentMehtodWithConfiguration:deleagte:")]
		void StartAlternativePaymentMehtodWithConfiguration(PaymentConfiguration configuration, IPaymentCallback deleagte);
	}

	interface IPaymentCallback
	{
	}
	// @interface PaymentShippingDetails : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy22PaymentShippingDetails")]
	interface PaymentShippingDetails
	{
		// @property (copy, nonatomic) NSString * _Nullable name;
		[NullAllowed, Export("name")]
		string Name { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable email;
		[NullAllowed, Export("email")]
		string Email { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable phone;
		[NullAllowed, Export("phone")]
		string Phone { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable addressLine;
		[NullAllowed, Export("addressLine")]
		string AddressLine { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable city;
		[NullAllowed, Export("city")]
		string City { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable state;
		[NullAllowed, Export("state")]
		string State { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable countryCode;
		[NullAllowed, Export("countryCode")]
		string CountryCode { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable zip;
		[NullAllowed, Export("zip")]
		string Zip { get; set; }
	}

	// @interface PaymentTheme : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy12PaymentTheme")]
	interface PaymentTheme
	{
		// @property (nonatomic, strong) UIImage * _Nullable logoImage;
		[NullAllowed, Export("logoImage", ArgumentSemantic.Strong)]
		UIImage LogoImage { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable primaryColor;
		[NullAllowed, Export("primaryColor", ArgumentSemantic.Strong)]
		UIColor PrimaryColor { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable primaryFontColor;
		[NullAllowed, Export("primaryFontColor", ArgumentSemantic.Strong)]
		UIColor PrimaryFontColor { get; set; }

		// @property (nonatomic, strong) UIFont * _Nullable primaryFont;
		[NullAllowed, Export("primaryFont", ArgumentSemantic.Strong)]
		UIFont PrimaryFont { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable secondaryColor;
		[NullAllowed, Export("secondaryColor", ArgumentSemantic.Strong)]
		UIColor SecondaryColor { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable secondaryFontColor;
		[NullAllowed, Export("secondaryFontColor", ArgumentSemantic.Strong)]
		UIColor SecondaryFontColor { get; set; }

		// @property (nonatomic, strong) UIFont * _Nullable secondaryFont;
		[NullAllowed, Export("secondaryFont", ArgumentSemantic.Strong)]
		UIFont SecondaryFont { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable strokeColor;
		[NullAllowed, Export("strokeColor", ArgumentSemantic.Strong)]
		UIColor StrokeColor { get; set; }

		// @property (nonatomic, strong) NSNumber * _Nullable strokeThinckness;
		[NullAllowed, Export("strokeThinckness", ArgumentSemantic.Strong)]
		NSNumber StrokeThinckness { get; set; }

		// @property (nonatomic, strong) NSNumber * _Nullable inputsCornerRadius;
		[NullAllowed, Export("inputsCornerRadius", ArgumentSemantic.Strong)]
		NSNumber InputsCornerRadius { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable buttonColor;
		[NullAllowed, Export("buttonColor", ArgumentSemantic.Strong)]
		UIColor ButtonColor { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable buttonFontColor;
		[NullAllowed, Export("buttonFontColor", ArgumentSemantic.Strong)]
		UIColor ButtonFontColor { get; set; }

		// @property (nonatomic, strong) UIFont * _Nullable buttonFont;
		[NullAllowed, Export("buttonFont", ArgumentSemantic.Strong)]
		UIFont ButtonFont { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable titleFontColor;
		[NullAllowed, Export("titleFontColor", ArgumentSemantic.Strong)]
		UIColor TitleFontColor { get; set; }

		// @property (nonatomic, strong) UIFont * _Nullable titleFont;
		[NullAllowed, Export("titleFont", ArgumentSemantic.Strong)]
		UIFont TitleFont { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable backgroundColor;
		[NullAllowed, Export("backgroundColor", ArgumentSemantic.Strong)]
		UIColor BackgroundColor { get; set; }

		// @property (nonatomic, strong) UIColor * _Nullable placeholderColor;
		[NullAllowed, Export("placeholderColor", ArgumentSemantic.Strong)]
		UIColor PlaceholderColor { get; set; }
	}

	// @interface PaymentTransactionDetails : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy25PaymentTransactionDetails")]
	[DisableDefaultCtor]
	interface PaymentTransactionDetails
	{
		// @property (copy, nonatomic) NSString * _Nullable token;
		[NullAllowed, Export("token")]
		string Token { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionReference;
		[NullAllowed, Export("transactionReference")]
		string TransactionReference { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable transactionType;
		[NullAllowed, Export("transactionType")]
		string TransactionType { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable cartID;
		[NullAllowed, Export("cartID")]
		string CartID { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable cartDescription;
		[NullAllowed, Export("cartDescription")]
		string CartDescription { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable cartCurrency;
		[NullAllowed, Export("cartCurrency")]
		string CartCurrency { get; set; }

		// @property (copy, nonatomic) NSString * _Nullable cartAmount;
		[NullAllowed, Export("cartAmount")]
		string CartAmount { get; set; }

		// @property (nonatomic, strong) PaymentResultViewModel * _Nullable paymentResult;
		[NullAllowed, Export("paymentResult", ArgumentSemantic.Strong)]
		PaymentResultViewModel PaymentResult { get; set; }

		// @property (nonatomic, strong) PaymentInfoViewModel * _Nullable paymentInfo;
		[NullAllowed, Export("paymentInfo", ArgumentSemantic.Strong)]
		PaymentInfoViewModel PaymentInfo { get; set; }

		// @property (nonatomic, strong) PaymentBillingDetails * _Nullable billingDetails;
		[NullAllowed, Export("billingDetails", ArgumentSemantic.Strong)]
		PaymentBillingDetails BillingDetails { get; set; }

		// @property (nonatomic, strong) PaymentShippingDetails * _Nullable shippingDetails;
		[NullAllowed, Export("shippingDetails", ArgumentSemantic.Strong)]
		PaymentShippingDetails ShippingDetails { get; set; }
	}

	// @interface TokenFormat : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy11TokenFormat")]
	interface TokenFormat
	{
		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull none;
		[Static]
		[Export("none")]
		string None { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull hex32;
		[Static]
		[Export("hex32")]
		string Hex32 { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull alphaNum20;
		[Static]
		[Export("alphaNum20")]
		string AlphaNum20 { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull digit22;
		[Static]
		[Export("digit22")]
		string Digit22 { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull digit16;
		[Static]
		[Export("digit16")]
		string Digit16 { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull alphaNum32;
		[Static]
		[Export("alphaNum32")]
		string AlphaNum32 { get; }
	}

	// @interface TokeniseType : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy12TokeniseType")]
	interface TokeniseType
	{
		// @property (readonly, nonatomic, class) NSInteger none;
		[Static]
		[Export("none")]
		nint None { get; }

		// @property (readonly, nonatomic, class) NSInteger merchantMandatory;
		[Static]
		[Export("merchantMandatory")]
		nint MerchantMandatory { get; }

		// @property (readonly, nonatomic, class) NSInteger userMandatory;
		[Static]
		[Export("userMandatory")]
		nint UserMandatory { get; }

		// @property (readonly, nonatomic, class) NSInteger userOptinoal;
		[Static]
		[Export("userOptinoal")]
		nint UserOptinoal { get; }
	}

	// @interface TransactionClass : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy16TransactionClass")]
	interface TransactionClass
	{
		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull ecom;
		[Static]
		[Export("ecom")]
		string Ecom { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull recur;
		[Static]
		[Export("recur")]
		string Recur { get; }
	}

	// @interface TransactionType : NSObject
	[BaseType(typeof(NSObject), Name = "_TtC15PaymentSDKProxy15TransactionType")]
	interface TransactionType
	{
		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull sale;
		[Static]
		[Export("sale")]
		string Sale { get; }

		// @property (readonly, copy, nonatomic, class) NSString * _Nonnull authorize;
		[Static]
		[Export("authorize")]
		string Authorize { get; }
	}
}
