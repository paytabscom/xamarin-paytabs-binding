package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils;

/* loaded from: classes.dex */
public class Size implements Comparable<Size> {
    public final int height;
    public final int width;

    public Size(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @Override // java.lang.Comparable
    public int compareTo(Size size) {
        if (Math.max(this.width, this.height) <= Math.max(size.width, size.height) || Math.min(this.width, this.height) <= Math.min(size.width, size.height)) {
            return (Math.max(this.width, this.height) >= Math.max(size.width, size.height) || Math.min(this.width, this.height) >= Math.min(size.width, size.height)) ? 0 : 1;
        }
        return -1;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}