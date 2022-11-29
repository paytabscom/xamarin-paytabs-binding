package com.payment.paymentsdk.save_cards.entities;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/payment/paymentsdk/save_cards/entities/PaymentSDKSavedCardInfo;", "Landroid/os/Parcelable;", "", "component1", "component2", "maskedCard", "cardType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "a", "Ljava/lang/String;", "getMaskedCard", "()Ljava/lang/String;", "b", "getCardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaymentSDKSavedCardInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentSDKSavedCardInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f174a;

    /* renamed from: b  reason: collision with root package name */
    private final String f175b;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<PaymentSDKSavedCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PaymentSDKSavedCardInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentSDKSavedCardInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PaymentSDKSavedCardInfo[] newArray(int i2) {
            return new PaymentSDKSavedCardInfo[i2];
        }
    }

    public PaymentSDKSavedCardInfo(String maskedCard, String cardType) {
        Intrinsics.checkNotNullParameter(maskedCard, "maskedCard");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f174a = maskedCard;
        this.f175b = cardType;
    }

    public static /* synthetic */ PaymentSDKSavedCardInfo copy$default(PaymentSDKSavedCardInfo paymentSDKSavedCardInfo, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentSDKSavedCardInfo.f174a;
        }
        if ((i2 & 2) != 0) {
            str2 = paymentSDKSavedCardInfo.f175b;
        }
        return paymentSDKSavedCardInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f174a;
    }

    public final String component2() {
        return this.f175b;
    }

    public final PaymentSDKSavedCardInfo copy(String maskedCard, String cardType) {
        Intrinsics.checkNotNullParameter(maskedCard, "maskedCard");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        return new PaymentSDKSavedCardInfo(maskedCard, cardType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSDKSavedCardInfo) {
            PaymentSDKSavedCardInfo paymentSDKSavedCardInfo = (PaymentSDKSavedCardInfo) obj;
            return Intrinsics.areEqual(this.f174a, paymentSDKSavedCardInfo.f174a) && Intrinsics.areEqual(this.f175b, paymentSDKSavedCardInfo.f175b);
        }
        return false;
    }

    public final String getCardType() {
        return this.f175b;
    }

    public final String getMaskedCard() {
        return this.f174a;
    }

    public int hashCode() {
        return (this.f174a.hashCode() * 31) + this.f175b.hashCode();
    }

    public String toString() {
        return "PaymentSDKSavedCardInfo(maskedCard=" + this.f174a + ", cardType=" + this.f175b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i2) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f174a);
        out.writeString(this.f175b);
    }
}