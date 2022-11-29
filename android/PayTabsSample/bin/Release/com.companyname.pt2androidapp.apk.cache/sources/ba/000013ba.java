package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.CardUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class Card implements Serializable, Parcelable {
    public static final Parcelable.Creator<Card> CREATOR = new Parcelable.Creator<Card>() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.Card.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Card[] newArray(int i2) {
            return new Card[i2];
        }
    };
    private static final long serialVersionUID = 1;
    private final String mCardHolder;
    private final String mCardNumber;
    private final String mExpirationDate;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Card(String str, String str2, String str3) {
        this.mCardNumber = str;
        this.mCardHolder = str2;
        this.mExpirationDate = str3;
    }

    public String getCardNumber() {
        return this.mCardNumber;
    }

    public String getCardNumberRedacted() {
        return CardUtils.getCardNumberRedacted(this.mCardNumber);
    }

    public String getCardHolderName() {
        return this.mCardHolder;
    }

    public String getExpirationDate() {
        return this.mExpirationDate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        String str = this.mCardNumber;
        if (str == null ? card.mCardNumber == null : str.equals(card.mCardNumber)) {
            String str2 = this.mCardHolder;
            if (str2 == null ? card.mCardHolder == null : str2.equals(card.mCardHolder)) {
                String str3 = this.mExpirationDate;
                String str4 = card.mExpirationDate;
                return str3 != null ? str3.equals(str4) : str4 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.mCardNumber;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mCardHolder;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mExpirationDate;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Card{mCardNumber='" + getCardNumberRedacted() + "', mCardHolder='" + this.mCardHolder + "', mExpirationDate='" + this.mExpirationDate + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.mCardNumber);
        parcel.writeString(this.mCardHolder);
        parcel.writeString(this.mExpirationDate);
    }

    protected Card(Parcel parcel) {
        this.mCardNumber = parcel.readString();
        this.mCardHolder = parcel.readString();
        this.mExpirationDate = parcel.readString();
    }
}