package e0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a3\u0010\u0003\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u00000\u0007\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "country", "", "b", "", "kotlin.jvm.PlatformType", "()[Ljava/lang/String;", "", "a", "countryDisplayName", "countriesNoZipCode", "Ljava/util/List;", "d", "()Ljava/util/List;", "countriesOptionalZipCode", "e", "", "countriesFixedZipCode", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f179a = CollectionsKt.listOf((Object[]) new String[]{"AE", "AO", "AQ", "AG", "AW", "BS", "BZ", "BJ", "BO", "BQ", "BW", "BV", "BF", "BI", "CM", "CF", "TD", "KM", "CG", "CD", "CK", "CI", "CW", "DJ", "DM", "GQ", "ER", "FJ", "TF", "GA", "GM", "GH", "GD", "GY", "HM", "HK", "JM", "KI", "KP", "LY", "MO", "MW", "ML", "MR", "NA", "NR", "NU", "OM", "PS", "QA", "RW", "KN", "ST", "SC", "SL", "SX", "SB", "SS", "SR", "SY", "TL", "TG", "TK", "TO", "TV", "UG", "UM", "VU", "EH", "YE", "ZW"});

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f180b = CollectionsKt.listOf((Object[]) new String[]{"SA", "EG", "JO", "BH"});

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f181c = MapsKt.mapOf(TuplesKt.to("AI", "AI-2640"), TuplesKt.to("IO", "BBND 1ZZ"), TuplesKt.to("FK", "FIQQ 1ZZ"), TuplesKt.to("GI", "GX11 1AA"), TuplesKt.to("PN", "PCRN 1ZZ"), TuplesKt.to("BL", "97133"), TuplesKt.to("MF", "97150"), TuplesKt.to("PM", "97500"), TuplesKt.to("GS", "SIQQ 1ZZ"), TuplesKt.to("TC", "TKCA 1ZZ"), TuplesKt.to("VA", "00120"));

    public static final String a(String str) {
        Locale locale;
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
        int length = availableLocales.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                locale = null;
                break;
            }
            locale = availableLocales[i2];
            if (Intrinsics.areEqual(locale.getDisplayCountry(), str)) {
                break;
            }
            i2++;
        }
        if (locale != null) {
            return locale.getCountry();
        }
        return null;
    }

    public static final List<String> a() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
        ArrayList arrayList = new ArrayList(availableLocales.length);
        for (Locale locale : availableLocales) {
            arrayList.add(locale.getDisplayCountry());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String it = (String) obj;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r7 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(java.lang.String r7) {
        /*
            java.lang.String[] r0 = b()
            java.lang.String r1 = "countriesIso"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L11:
            if (r4 >= r2) goto L2b
            r5 = r0[r4]
            java.lang.String r6 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r6 = r5.length()
            if (r6 <= 0) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            if (r6 == 0) goto L28
            r1.add(r5)
        L28:
            int r4 = r4 + 1
            goto L11
        L2b:
            if (r7 == 0) goto L38
            java.lang.String r7 = r7.toUpperCase()
            java.lang.String r0 = "this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            if (r7 != 0) goto L3a
        L38:
            java.lang.String r7 = ""
        L3a:
            boolean r7 = r1.contains(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.b.b(java.lang.String):boolean");
    }

    public static final String[] b() {
        return Locale.getISOCountries();
    }

    public static final Map<String, String> c() {
        return f181c;
    }

    public static final List<String> d() {
        return f179a;
    }

    public static final List<String> e() {
        return f180b;
    }
}