package e0;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0017\u001a\u00020\u0016¨\u0006\u001c"}, d2 = {"Le0/c;", "", "", "k", "", "p", "", "m", "l", "c", "o", "n", "f", "e", "b", "Landroid/content/pm/PackageInfo;", "j", "Landroid/util/DisplayMetrics;", "g", "a", "i", "d", "Lt0/b;", "h", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f194a;

    public c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f194a = activity;
    }

    private final String b() {
        PackageInfo j2 = j();
        if (j2 != null) {
            return j2.versionName;
        }
        return null;
    }

    private final String c() {
        String packageName = this.f194a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "activity.packageName");
        return packageName;
    }

    private final String e() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    private final String f() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    private final DisplayMetrics g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = this.f194a.getDisplay();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
        } else {
            this.f194a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private final PackageInfo j() {
        PackageManager packageManager = this.f194a.getPackageManager();
        if (packageManager != null) {
            return packageManager.getPackageInfo(this.f194a.getPackageName(), 0);
        }
        return null;
    }

    private final String k() {
        return "Android";
    }

    private final int l() {
        return g().heightPixels;
    }

    private final int m() {
        return g().widthPixels;
    }

    private final String n() {
        return "6.3.3";
    }

    private final String o() {
        String language;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            str = "Resources.getSystem().co…ation.locales[0].language";
        } else {
            language = Resources.getSystem().getConfiguration().locale.getLanguage();
            str = "getSystem().configuration.locale.language";
        }
        Intrinsics.checkNotNullExpressionValue(language, str);
        return language;
    }

    private final long p() {
        return new Date().getTime();
    }

    public final String a() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    public final String d() {
        return a.b(this.f194a) ? "wifi" : "lte";
    }

    public final t0.b h() {
        return new t0.b("", c(), k(), e(), f(), "", i(), i(), b(), n(), String.valueOf(p()), String.valueOf(m()), String.valueOf(l()), a(), o(), d());
    }

    public final String i() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }
}