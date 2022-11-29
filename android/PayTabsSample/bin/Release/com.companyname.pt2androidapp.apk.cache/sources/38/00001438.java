package f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lf/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "holderName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "cardNumber", "a", "expiryDate", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f196b;

    /* renamed from: c  reason: collision with root package name */
    private final String f197c;

    public a(String str, String cardNumber, String str2) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f195a = str;
        this.f196b = cardNumber;
        this.f197c = str2;
    }

    public final String a() {
        return this.f196b;
    }

    public final String b() {
        return this.f197c;
    }

    public final String c() {
        return this.f195a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f195a, aVar.f195a) && Intrinsics.areEqual(this.f196b, aVar.f196b) && Intrinsics.areEqual(this.f197c, aVar.f197c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f195a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f196b.hashCode()) * 31;
        String str2 = this.f197c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f195a + "  his card number is " + this.f196b + " and expires in " + this.f197c;
    }
}