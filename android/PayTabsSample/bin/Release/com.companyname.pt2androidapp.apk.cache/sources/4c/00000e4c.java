package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RecognitionResult implements Parcelable {
    private final Bitmap cardImage;
    private final String date;
    private final boolean isFinal;
    private final boolean isFirst;
    private final String name;
    private final String nameRaw;
    private final String number;
    private final Rect numberImageRect;
    private static final RecognitionResult sEmpty = new Builder().setIsFirst(true).build();
    public static final Parcelable.Creator<RecognitionResult> CREATOR = new Parcelable.Creator<RecognitionResult>() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionResult createFromParcel(Parcel parcel) {
            return new RecognitionResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionResult[] newArray(int i2) {
            return new RecognitionResult[i2];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static RecognitionResult empty() {
        return sEmpty;
    }

    public RecognitionResult(String str, String str2, String str3, Rect rect, String str4, Bitmap bitmap, boolean z2, boolean z3) {
        this.number = str;
        this.name = str2;
        this.date = str3;
        this.nameRaw = str4;
        this.cardImage = bitmap;
        this.numberImageRect = rect;
        this.isFirst = z2;
        this.isFinal = z3;
    }

    private RecognitionResult(Builder builder) {
        this.cardImage = builder.cardImage;
        this.number = builder.number;
        this.date = builder.date;
        this.name = builder.name;
        this.nameRaw = builder.nameRaw;
        this.numberImageRect = builder.numberImageRect;
        this.isFirst = builder.isFirst;
        this.isFinal = builder.isFinal;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public String getNumber() {
        return this.number;
    }

    public String getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public String getNameRaw() {
        return this.nameRaw;
    }

    public Bitmap getCardImage() {
        return this.cardImage;
    }

    public Rect getNumberImageRect() {
        return this.numberImageRect;
    }

    public boolean isFirst() {
        return this.isFirst;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    public int getCardImageWidth() {
        if (getCardImage() == null) {
            return 0;
        }
        return getCardImage().getWidth();
    }

    public int getCardImageHeight() {
        if (getCardImage() == null) {
            return 0;
        }
        return getCardImage().getHeight();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecognitionResult recognitionResult = (RecognitionResult) obj;
        if (this.isFirst == recognitionResult.isFirst && this.isFinal == recognitionResult.isFinal) {
            String str = this.number;
            if (str == null ? recognitionResult.number == null : str.equals(recognitionResult.number)) {
                String str2 = this.date;
                if (str2 == null ? recognitionResult.date == null : str2.equals(recognitionResult.date)) {
                    String str3 = this.name;
                    if (str3 == null ? recognitionResult.name == null : str3.equals(recognitionResult.name)) {
                        String str4 = this.nameRaw;
                        if (str4 == null ? recognitionResult.nameRaw == null : str4.equals(recognitionResult.nameRaw)) {
                            Rect rect = this.numberImageRect;
                            if (rect == null ? recognitionResult.numberImageRect == null : rect.equals(recognitionResult.numberImageRect)) {
                                Bitmap bitmap = this.cardImage;
                                Bitmap bitmap2 = recognitionResult.cardImage;
                                return bitmap != null ? bitmap.equals(bitmap2) : bitmap2 == null;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.number;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.date;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.nameRaw;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Rect rect = this.numberImageRect;
        int hashCode5 = (hashCode4 + (rect != null ? rect.hashCode() : 0)) * 31;
        Bitmap bitmap = this.cardImage;
        return ((((hashCode5 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + (this.isFirst ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.isFirst ? 1 : 0);
        parcel.writeInt(this.isFinal ? 1 : 0);
        parcel.writeString(this.number);
        parcel.writeString(this.date);
        parcel.writeString(this.name);
        parcel.writeString(this.nameRaw);
        parcel.writeParcelable(this.numberImageRect, 0);
        parcel.writeParcelable(this.cardImage, 0);
    }

    protected RecognitionResult(Parcel parcel) {
        this.isFirst = parcel.readInt() != 0;
        this.isFinal = parcel.readInt() != 0;
        this.number = parcel.readString();
        this.date = parcel.readString();
        this.name = parcel.readString();
        this.nameRaw = parcel.readString();
        this.numberImageRect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.cardImage = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private Bitmap cardImage;
        private String date;
        private boolean isFinal;
        private boolean isFirst;
        private String name;
        private String nameRaw;
        private String number;
        private Rect numberImageRect;

        public Builder() {
            this.isFirst = true;
            this.isFinal = true;
        }

        public Builder(RecognitionResult recognitionResult) {
            this.isFirst = true;
            this.isFinal = true;
            this.isFirst = recognitionResult.isFirst;
            this.isFinal = recognitionResult.isFinal;
            this.cardImage = recognitionResult.cardImage;
            this.number = recognitionResult.number;
            this.date = recognitionResult.date;
            this.name = recognitionResult.name;
            this.nameRaw = recognitionResult.nameRaw;
            this.numberImageRect = recognitionResult.numberImageRect;
        }

        public Builder setCardImage(Bitmap bitmap) {
            this.cardImage = bitmap;
            return this;
        }

        public Builder setNumber(String str) {
            this.number = str;
            return this;
        }

        public Builder setDate(String str) {
            this.date = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setNameRaw(String str) {
            this.nameRaw = str;
            return this;
        }

        public Builder setNumberImageRect(Rect rect) {
            this.numberImageRect = rect;
            return this;
        }

        public Builder setIsFinal(boolean z2) {
            this.isFinal = z2;
            return this;
        }

        public Builder setIsFirst(boolean z2) {
            this.isFirst = z2;
            return this;
        }

        public RecognitionResult build() {
            return new RecognitionResult(this);
        }
    }
}