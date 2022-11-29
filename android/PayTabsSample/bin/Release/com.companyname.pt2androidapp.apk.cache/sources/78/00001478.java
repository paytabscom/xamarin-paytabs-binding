package k;

import android.text.TextUtils;
import java.util.Calendar;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final c f290b = new c(Calendar.getInstance());

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f291a;

    protected c(Calendar calendar) {
        this.f291a = calendar;
    }

    private int a() {
        return this.f291a.get(2) + 1;
    }

    public static boolean a(String str, String str2) {
        return f290b.b(str, str2);
    }

    private int b() {
        return this.f291a.get(1) % 100;
    }

    protected boolean b(String str, String str2) {
        int parseInt;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2) && (parseInt = Integer.parseInt(str)) >= 1 && parseInt <= 12) {
            int b2 = b();
            int length = str2.length();
            if (length != 2) {
                if (length == 4) {
                    str2 = str2.substring(2);
                }
            }
            int parseInt2 = Integer.parseInt(str2);
            if (parseInt2 != b2 || parseInt >= a()) {
                return (parseInt2 >= b2 || (parseInt2 + 100) - b2 <= 20) && parseInt2 <= b2 + 20;
            }
            return false;
        }
        return false;
    }
}