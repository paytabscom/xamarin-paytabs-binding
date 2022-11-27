package com.payment.paymentsdk.integrationmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "AlphaNum20Format", "AlphaNum32Format", "Digit16Format", "Digit22Format", "Hex32Format", "NoneFormat", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$AlphaNum20Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$AlphaNum32Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Digit16Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Digit22Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Hex32Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$NoneFormat;", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class PaymentSdkTokenFormat {
    private String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$AlphaNum20Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AlphaNum20Format extends PaymentSdkTokenFormat {
        public AlphaNum20Format() {
            super("3", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$AlphaNum32Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AlphaNum32Format extends PaymentSdkTokenFormat {
        public AlphaNum32Format() {
            super("6", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Digit16Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Digit16Format extends PaymentSdkTokenFormat {
        public Digit16Format() {
            super("5", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Digit22Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Digit22Format extends PaymentSdkTokenFormat {
        public Digit22Format() {
            super("4", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$Hex32Format;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Hex32Format extends PaymentSdkTokenFormat {
        public Hex32Format() {
            super("2", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat$NoneFormat;", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkTokenFormat;", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NoneFormat extends PaymentSdkTokenFormat {
        public NoneFormat() {
            super("1", null);
        }
    }

    private PaymentSdkTokenFormat(String str) {
        this.value = str;
    }

    public /* synthetic */ PaymentSdkTokenFormat(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }
}