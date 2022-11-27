package k;

import android.text.TextUtils;
import com.payment.paymentsdk.R;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public enum b {
    MADA("(588845|440647|440795|446404|457865|968208|457997|474491|636120|417633|468540|468541|468542|468543|968201|446393|409201|458456|484783|968205|462220|455708|410621|588848|455036|968203|486094|486095|486096|504300|440533|489318|489319|445564|968211|410685|406996|432328|428671|428672|428673|968206|446672|543357|434107|407197|407395|412565|431361|604906|521076|588850|968202|529415|535825|543085|524130|554180|549760|968209|524514|529741|537767|535989|536023|513213|520058|558563|585265|588983|588982|589005|508160|531095|530906|532013|605141|968204|422817|422818|422819|428331|483010|483011|483012|589206|968207|419593|439954|530060|531196|420132)\\d*$", R.drawable.ic_svg_mada, 16, 18, 3, R.string.payment_sdk_card_cvv, null),
    VISA("^4\\d*", R.drawable.payment_sdk_ic_visa, 16, 16, 3, R.string.payment_sdk_card_cvv, null),
    MASTERCARD("^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[0-1]|2720)\\d*", R.drawable.payment_sdk_ic_mastercard, 16, 16, 3, R.string.payment_sdk_card_cvc, null),
    DISCOVER("^(6011|65|64[4-9]|622)\\d*", R.drawable.payment_sdk_ic_discover, 16, 16, 3, R.string.payment_sdk_card_cid, null),
    AMEX("^3[47]\\d*", R.drawable.payment_sdk_ic_amex, 15, 15, 4, R.string.payment_sdk_card_cid, null),
    DINERS_CLUB("^(36|38|30[0-5])\\d*", R.drawable.payment_sdk_ic_diners_club, 14, 14, 3, R.string.payment_sdk_card_cvv, null),
    JCB("^35\\d*", R.drawable.payment_sdk_ic_jcb, 16, 16, 3, R.string.payment_sdk_card_cvv, null),
    MAESTRO("^(5018|5020|5038|5[6-9]|6020|6304|6703|6759|676[1-3])\\d*", R.drawable.payment_sdk_ic_maestro, 12, 19, 3, R.string.payment_sdk_card_cvc, "^6\\d*"),
    UNIONPAY("^62\\d*", R.drawable.payment_sdk_ic_unionpay, 16, 19, 3, R.string.payment_sdk_card_cvn, null),
    HIPER("^637(095|568|599|609|612)\\d*", R.drawable.payment_sdk_ic_hiper, 16, 16, 3, R.string.payment_sdk_card_cvc, null),
    HIPERCARD("^606282\\d*", R.drawable.payment_sdk_ic_hipercard, 16, 16, 3, R.string.payment_sdk_card_cvc, null),
    UNKNOWN("\\d+", R.drawable.payment_sdk_ic_unknown, 12, 19, 3, R.string.payment_sdk_card_cvv, null),
    EMPTY("^$", R.drawable.payment_sdk_ic_unknown, 12, 19, 3, R.string.payment_sdk_card_cvv, null);
    

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f268u = {4, 10};

    /* renamed from: v  reason: collision with root package name */
    private static final int[] f269v = {4, 8, 12};

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f271a;

    /* renamed from: b  reason: collision with root package name */
    private final Pattern f272b;

    /* renamed from: c  reason: collision with root package name */
    private final int f273c;

    /* renamed from: d  reason: collision with root package name */
    private final int f274d;

    /* renamed from: e  reason: collision with root package name */
    private final int f275e;

    /* renamed from: f  reason: collision with root package name */
    private final int f276f;

    /* renamed from: g  reason: collision with root package name */
    private final int f277g;

    b(String str, int i2, int i3, int i4, int i5, int i6, String str2) {
        this.f271a = Pattern.compile(str);
        this.f272b = str2 == null ? null : Pattern.compile(str2);
        this.f273c = i2;
        this.f274d = i3;
        this.f275e = i4;
        this.f276f = i5;
        this.f277g = i6;
    }

    public static b a(String str) {
        b b2 = b(str);
        b bVar = EMPTY;
        if (b2 == bVar || b2 == UNKNOWN) {
            b c2 = c(str);
            return (c2 == bVar || c2 == UNKNOWN) ? !str.isEmpty() ? UNKNOWN : bVar : c2;
        }
        return b2;
    }

    private static b b(String str) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.c().matcher(str).matches()) {
                return bVar;
            }
        }
        return EMPTY;
    }

    private static b c(String str) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.d() != null && bVar.d().matcher(str).matches()) {
                return bVar;
            }
        }
        return EMPTY;
    }

    public static boolean d(String str) {
        String stringBuffer = new StringBuffer(str).reverse().toString();
        int length = stringBuffer.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = stringBuffer.charAt(i4);
            if (!Character.isDigit(charAt)) {
                throw new IllegalArgumentException(String.format("Not a digit: '%s'", Character.valueOf(charAt)));
            }
            int digit = Character.digit(charAt, 10);
            if (i4 % 2 == 0) {
                i2 += digit;
            } else {
                i3 += (digit / 5) + ((digit * 2) % 10);
            }
        }
        return (i2 + i3) % 10 == 0;
    }

    public int a() {
        return this.f273c;
    }

    public int b() {
        return this.f275e;
    }

    public Pattern c() {
        return this.f271a;
    }

    public Pattern d() {
        return this.f272b;
    }

    public int e() {
        return this.f276f;
    }

    public boolean e(String str) {
        int length;
        Pattern pattern;
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str) && (length = str.length()) >= this.f274d && length <= this.f275e) {
            if (this.f271a.matcher(str).matches() || (pattern = this.f272b) == null || pattern.matcher(str).matches()) {
                return d(str);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f277g;
    }

    public int[] g() {
        return this == AMEX ? f268u : f269v;
    }
}