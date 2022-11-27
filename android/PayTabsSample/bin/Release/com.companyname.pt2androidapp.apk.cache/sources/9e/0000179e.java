package y0;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import w0.a;
import w0.b;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\f\u001a\u00020\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\u0017¨\u0006\u001d"}, d2 = {"Ly0/b;", "", "", "transactionType", "", "c", "zip", "countryCode", "a", "transactionClass", "d", "name", "isSamsungPay", "Street", "f", "State", "e", "City", "country", "b", "Landroidx/lifecycle/MutableLiveData;", "Lw0/b;", "missingInfoSealedLD", "Lw0/a;", "Lp0/a;", "details", "isShipping", "<init>", "(Lp0/a;Z)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f560a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f561b;

    /* renamed from: c  reason: collision with root package name */
    private w0.a f562c;

    public b(p0.a aVar, boolean z2) {
        this.f560a = aVar;
        this.f561b = z2;
    }

    private final boolean a(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean a(String str, String str2) {
        if (CollectionsKt.contains(e0.b.e(), str2) || CollectionsKt.contains(e0.b.d(), str2)) {
            return false;
        }
        return e0.b.c().containsKey(str2) ? !Intrinsics.areEqual(str, e0.b.c().get(str2)) : str == null || str.length() == 0;
    }

    private final boolean a(String str, boolean z2) {
        if (this.f561b || z2) {
            return str == null || str.length() == 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean a(b bVar, MutableLiveData mutableLiveData, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                mutableLiveData = new MutableLiveData();
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            return bVar.a(mutableLiveData, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isValid");
    }

    private final boolean b(String str) {
        return !e0.b.b(str);
    }

    private final boolean c(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean d(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean e(String str) {
        return str == null || str.length() == 0;
    }

    private final boolean f(String str) {
        return str == null || str.length() == 0;
    }

    public final w0.a a() {
        return this.f562c;
    }

    public final boolean a(MutableLiveData<w0.b> missingInfoSealedLD, boolean z2) {
        boolean z3;
        w0.a eVar;
        w0.a hVar;
        w0.a fVar;
        w0.a kVar;
        w0.a jVar;
        w0.a iVar;
        w0.a cVar;
        w0.a dVar;
        Intrinsics.checkNotNullParameter(missingInfoSealedLD, "missingInfoSealedLD");
        this.f562c = null;
        p0.a aVar = this.f560a;
        if (aVar == null) {
            this.f562c = this.f561b ? a.b0.f504a : a.g.f513a;
            missingInfoSealedLD.setValue(b.f.f538a);
            return false;
        }
        boolean z4 = true;
        if (b(aVar.getCountryCode())) {
            if (this.f561b) {
                String countryCode = this.f560a.getCountryCode();
                dVar = new a.y(countryCode == null || countryCode.length() == 0);
            } else {
                String countryCode2 = this.f560a.getCountryCode();
                dVar = new a.d(countryCode2 == null || countryCode2.length() == 0);
            }
            this.f562c = dVar;
            String countryCode3 = this.f560a.getCountryCode();
            missingInfoSealedLD.setValue(new b.c(countryCode3 == null || countryCode3.length() == 0));
            z3 = false;
        } else {
            z3 = true;
        }
        if (a(this.f560a.getCity())) {
            if (this.f561b) {
                String city = this.f560a.getCity();
                cVar = new a.x(city == null || city.length() == 0);
            } else {
                String city2 = this.f560a.getCity();
                cVar = new a.c(city2 == null || city2.length() == 0);
            }
            this.f562c = cVar;
            String city3 = this.f560a.getCity();
            missingInfoSealedLD.setValue(new b.C0032b(city3 == null || city3.length() == 0));
            z3 = false;
        }
        if (e(this.f560a.getState())) {
            if (this.f561b) {
                String state = this.f560a.getState();
                iVar = new a.d0(state == null || state.length() == 0);
            } else {
                String state2 = this.f560a.getState();
                iVar = new a.i(state2 == null || state2.length() == 0);
            }
            this.f562c = iVar;
            String state3 = this.f560a.getState();
            missingInfoSealedLD.setValue(new b.h(state3 == null || state3.length() == 0));
            z3 = false;
        }
        if (f(this.f560a.getAddressLine())) {
            if (this.f561b) {
                String addressLine = this.f560a.getAddressLine();
                jVar = new a.e0(addressLine == null || addressLine.length() == 0);
            } else {
                String addressLine2 = this.f560a.getAddressLine();
                jVar = new a.j(addressLine2 == null || addressLine2.length() == 0);
            }
            this.f562c = jVar;
            String addressLine3 = this.f560a.getAddressLine();
            missingInfoSealedLD.setValue(new b.i(addressLine3 == null || addressLine3.length() == 0));
            z3 = false;
        }
        if (a(this.f560a.getZip(), this.f560a.getCountryCode())) {
            if (this.f561b) {
                String zip = this.f560a.getZip();
                kVar = new a.f0(zip == null || zip.length() == 0);
            } else {
                String zip2 = this.f560a.getZip();
                kVar = new a.k(zip2 == null || zip2.length() == 0);
            }
            this.f562c = kVar;
            String zip3 = this.f560a.getZip();
            missingInfoSealedLD.setValue(new b.j(zip3 == null || zip3.length() == 0));
            z3 = false;
        }
        if (a(this.f560a.getName(), z2)) {
            if (this.f561b) {
                String name = this.f560a.getName();
                fVar = new a.a0(name == null || name.length() == 0);
            } else {
                String name2 = this.f560a.getName();
                fVar = new a.f(name2 == null || name2.length() == 0);
            }
            this.f562c = fVar;
            String name3 = this.f560a.getName();
            missingInfoSealedLD.setValue(new b.e(name3 == null || name3.length() == 0));
            z3 = false;
        }
        if (d(this.f560a.getPhone())) {
            if (this.f561b) {
                String phone = this.f560a.getPhone();
                hVar = new a.c0(phone == null || phone.length() == 0);
            } else {
                String phone2 = this.f560a.getPhone();
                hVar = new a.h(phone2 == null || phone2.length() == 0);
            }
            this.f562c = hVar;
            String phone3 = this.f560a.getPhone();
            missingInfoSealedLD.setValue(new b.g(phone3 == null || phone3.length() == 0));
            z3 = false;
        }
        if (c(this.f560a.getEmail())) {
            if (this.f561b) {
                String email = this.f560a.getEmail();
                eVar = new a.z(email == null || email.length() == 0);
            } else {
                String email2 = this.f560a.getEmail();
                eVar = new a.e(email2 == null || email2.length() == 0);
            }
            this.f562c = eVar;
            String email3 = this.f560a.getEmail();
            if (email3 != null && email3.length() != 0) {
                z4 = false;
            }
            missingInfoSealedLD.setValue(new b.d(z4));
            return false;
        }
        return z3;
    }
}