package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0005"}, d2 = {"createPaymentSdkApms", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkApms;", "name", "", "getName", "paymentsdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentSdkApmsKt {

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
}