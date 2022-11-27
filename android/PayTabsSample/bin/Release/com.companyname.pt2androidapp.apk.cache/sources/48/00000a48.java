package c0;

import android.app.Application;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lc0/a;", "Lc0/c;", "", "sharedPrefFileName", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "d", "()Landroid/security/keystore/KeyGenParameterSpec;", "alias", "c", "Landroid/content/SharedPreferences;", "sharedPref", "Landroid/content/SharedPreferences;", "a", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "b", "()Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Application f43a;

    /* renamed from: b  reason: collision with root package name */
    private final String f44b;

    /* renamed from: c  reason: collision with root package name */
    private final KeyGenParameterSpec f45c;

    /* renamed from: d  reason: collision with root package name */
    private final String f46d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f47e;

    public a(Application app, String sharedPrefFileName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(sharedPrefFileName, "sharedPrefFileName");
        this.f43a = app;
        this.f44b = sharedPrefFileName;
        KeyGenParameterSpec AES256_GCM_SPEC = MasterKeys.AES256_GCM_SPEC;
        Intrinsics.checkNotNullExpressionValue(AES256_GCM_SPEC, "AES256_GCM_SPEC");
        this.f45c = AES256_GCM_SPEC;
        String orCreate = MasterKeys.getOrCreate(d());
        Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(keyGenParameterSpec)");
        this.f46d = orCreate;
        SharedPreferences create = EncryptedSharedPreferences.create(e(), c(), app, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(create, "create(\n        sharedPr…onScheme.AES256_GCM\n    )");
        this.f47e = create;
    }

    @Override // c0.d
    public SharedPreferences a() {
        return this.f47e;
    }

    @Override // c0.d
    public SharedPreferences.Editor b() {
        SharedPreferences.Editor edit = a().edit();
        Intrinsics.checkNotNullExpressionValue(edit, "sharedPref.edit()");
        return edit;
    }

    public String c() {
        return this.f46d;
    }

    public KeyGenParameterSpec d() {
        return this.f45c;
    }

    public String e() {
        return this.f44b;
    }
}