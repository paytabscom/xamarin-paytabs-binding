package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ScanCardRequest implements Parcelable {
    public static final boolean DEFAULT_ENABLE_SOUND = true;
    public static final boolean DEFAULT_GRAB_CARD_IMAGE = false;
    public static final boolean DEFAULT_SCAN_CARD_HOLDER = true;
    public static final boolean DEFAULT_SCAN_EXPIRATION_DATE = true;
    private final boolean mEnableSound;
    private final boolean mGrabCardImage;
    private final boolean mScanCardHolder;
    private final boolean mScanExpirationDate;
    private static final ScanCardRequest sDefaultInstance = new ScanCardRequest(true, true, true, false);
    public static final Parcelable.Creator<ScanCardRequest> CREATOR = new Parcelable.Creator<ScanCardRequest>() { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ui.ScanCardRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanCardRequest createFromParcel(Parcel parcel) {
            return new ScanCardRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanCardRequest[] newArray(int i2) {
            return new ScanCardRequest[i2];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static ScanCardRequest getDefault() {
        return sDefaultInstance;
    }

    public ScanCardRequest(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.mEnableSound = z2;
        this.mScanExpirationDate = z3;
        this.mScanCardHolder = z4;
        this.mGrabCardImage = z5;
    }

    public boolean isSoundEnabled() {
        return this.mEnableSound;
    }

    public boolean isScanExpirationDateEnabled() {
        return this.mScanExpirationDate;
    }

    public boolean isScanCardHolderEnabled() {
        return this.mScanCardHolder;
    }

    public boolean isGrabCardImageEnabled() {
        return this.mGrabCardImage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanCardRequest scanCardRequest = (ScanCardRequest) obj;
        return this.mEnableSound == scanCardRequest.mEnableSound && this.mScanExpirationDate == scanCardRequest.mScanExpirationDate && this.mScanCardHolder == scanCardRequest.mScanCardHolder && this.mGrabCardImage == scanCardRequest.mGrabCardImage;
    }

    public int hashCode() {
        return ((((((this.mEnableSound ? 1 : 0) * 31) + (this.mScanExpirationDate ? 1 : 0)) * 31) + (this.mScanCardHolder ? 1 : 0)) * 31) + (this.mGrabCardImage ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.mEnableSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mScanExpirationDate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mScanCardHolder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mGrabCardImage ? (byte) 1 : (byte) 0);
    }

    protected ScanCardRequest(Parcel parcel) {
        this.mEnableSound = parcel.readByte() != 0;
        this.mScanExpirationDate = parcel.readByte() != 0;
        this.mScanCardHolder = parcel.readByte() != 0;
        this.mGrabCardImage = parcel.readByte() != 0;
    }
}