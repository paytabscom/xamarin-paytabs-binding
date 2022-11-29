package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v0.a;
import v0.c;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\t\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0001¨\u0006\r"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkBillingDetails;", "", "ip", "nameOnCard", "Lv0/a;", "customerDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkShippingDetails;", "Lv0/c;", "toShippingDetails", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkApms;", "getName", "name", "createPaymentSdkApms", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class UtilsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSdkApms.values().length];
            iArr[PaymentSdkApms.UNION_PAY.ordinal()] = 1;
            iArr[PaymentSdkApms.STC_PAY.ordinal()] = 2;
            iArr[PaymentSdkApms.VALU.ordinal()] = 3;
            iArr[PaymentSdkApms.MEEZA_QR.ordinal()] = 4;
            iArr[PaymentSdkApms.OMAN_NET.ordinal()] = 5;
            iArr[PaymentSdkApms.KNET_CREDIT.ordinal()] = 6;
            iArr[PaymentSdkApms.FAWRY.ordinal()] = 7;
            iArr[PaymentSdkApms.KNET_DEBIT.ordinal()] = 8;
            iArr[PaymentSdkApms.URPAY.ordinal()] = 9;
            iArr[PaymentSdkApms.AMAN.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PaymentSdkApms createPaymentSdkApms(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        switch (name.hashCode()) {
            case -1352761550:
                if (name.equals("omannet")) {
                    return PaymentSdkApms.OMAN_NET;
                }
                break;
            case -892426426:
                if (name.equals("stcpay")) {
                    return PaymentSdkApms.STC_PAY;
                }
                break;
            case -296504455:
                if (name.equals("unionpay")) {
                    return PaymentSdkApms.UNION_PAY;
                }
                break;
            case 2997593:
                if (name.equals("aman")) {
                    return PaymentSdkApms.AMAN;
                }
                break;
            case 3612020:
                if (name.equals("valu")) {
                    return PaymentSdkApms.VALU;
                }
                break;
            case 97206883:
                if (name.equals("fawry")) {
                    return PaymentSdkApms.FAWRY;
                }
                break;
            case 111558891:
                if (name.equals("urpay")) {
                    return PaymentSdkApms.URPAY;
                }
                break;
            case 942204629:
                if (name.equals("meezaqr")) {
                    return PaymentSdkApms.MEEZA_QR;
                }
                break;
            case 1171507930:
                if (name.equals("knetdebit")) {
                    return PaymentSdkApms.KNET_DEBIT;
                }
                break;
            case 1940468427:
                if (name.equals("knetcredit")) {
                    return PaymentSdkApms.KNET_CREDIT;
                }
                break;
        }
        return null;
    }

    public static final a customerDetails(PaymentSdkBillingDetails paymentSdkBillingDetails, String str, String str2) {
        Intrinsics.checkNotNullParameter(paymentSdkBillingDetails, "<this>");
        return new a(paymentSdkBillingDetails.getCity(), paymentSdkBillingDetails.getCountryCode(), paymentSdkBillingDetails.getEmail(), str, str2, paymentSdkBillingDetails.getPhone(), paymentSdkBillingDetails.getState(), paymentSdkBillingDetails.getAddressLine(), paymentSdkBillingDetails.getZip());
    }

    public static /* synthetic */ a customerDetails$default(PaymentSdkBillingDetails paymentSdkBillingDetails, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = paymentSdkBillingDetails.getName();
        }
        return customerDetails(paymentSdkBillingDetails, str, str2);
    }

    public static final String getName(PaymentSdkApms paymentSdkApms) {
        Intrinsics.checkNotNullParameter(paymentSdkApms, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentSdkApms.ordinal()]) {
            case 1:
                return "unionpay";
            case 2:
                return "stcpay";
            case 3:
                return "valu";
            case 4:
                return "meezaqr";
            case 5:
                return "omannet";
            case 6:
                return "knetcredit";
            case 7:
                return "fawry";
            case 8:
                return "knetdebit";
            case 9:
                return "urpay";
            case 10:
                return "aman";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final c toShippingDetails(PaymentSdkShippingDetails paymentSdkShippingDetails) {
        Intrinsics.checkNotNullParameter(paymentSdkShippingDetails, "<this>");
        return new c(paymentSdkShippingDetails.getCity(), paymentSdkShippingDetails.getCountryCode(), paymentSdkShippingDetails.getEmail(), "", paymentSdkShippingDetails.getName(), paymentSdkShippingDetails.getPhone(), paymentSdkShippingDetails.getState(), paymentSdkShippingDetails.getAddressLine(), paymentSdkShippingDetails.getZip());
    }
}