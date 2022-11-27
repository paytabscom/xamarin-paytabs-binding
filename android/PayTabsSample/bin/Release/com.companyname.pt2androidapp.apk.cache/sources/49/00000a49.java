package c0;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u00102\u001a\u00020\u0001¢\u0006\u0004\b3\u00104J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001J\t\u0010\t\u001a\u00020\bH\u0096\u0001J)\u0010\r\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\bH\u0096\u0001J)\u0010\u000f\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u000eH\u0096\u0001J)\u0010\u0011\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u0010H\u0096\u0001J)\u0010\u0013\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u0012H\u0096\u0001J-\u0010\u0014\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH\u0096\u0001JQ\u0010\u0017\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2.\b\u0001\u0010\f\u001a(\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u0001 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00160\u0015H\u0096\u0001J!\u0010\u0018\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\nH\u0096\u0001J\u0019\u0010\u0019\u001a\u00020\b2\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\nH\u0096\u0003J\u0011\u0010\u001a\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001J5\u0010\u001d\u001a.\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0012\u0002\b\u0003 \u0006*\u0016\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0012\u0002\b\u0003\u0018\u00010\u001c0\u001bH\u0096\u0001J!\u0010\u001e\u001a\u00020\b2\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\bH\u0096\u0001J!\u0010\u001f\u001a\u00020\u000e2\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u000eH\u0096\u0001J!\u0010 \u001a\u00020\u00102\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u0010H\u0096\u0001J!\u0010!\u001a\u00020\u00122\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\u0012H\u0096\u0001J'\u0010\"\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH\u0097\u0001Jo\u0010#\u001a(\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u0001 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00160\u00152\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\n0\n2.\b\u0001\u0010\f\u001a(\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u0001 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00160\u0015H\u0097\u0001J\u0019\u0010%\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010$0$H\u0096\u0001J\u0019\u0010&\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010$0$H\u0096\u0001R\u0014\u0010)\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lc0/b;", "Lc0/c;", "Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences;", "", "apply", "kotlin.jvm.PlatformType", "clear", "", "commit", "", "p0", "p1", "putBoolean", "", "putFloat", "", "putInt", "", "putLong", "putString", "", "", "putStringSet", "remove", "contains", "edit", "", "", "getAll", "getBoolean", "getFloat", "getInt", "getLong", "getString", "getStringSet", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "registerOnSharedPreferenceChangeListener", "unregisterOnSharedPreferenceChangeListener", "b", "()Landroid/content/SharedPreferences$Editor;", "editor", "a", "()Landroid/content/SharedPreferences;", "sharedPref", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "c", "()Lcom/google/gson/Gson;", "encryptedSharedPref", "<init>", "(Lc0/c;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b implements c, SharedPreferences.Editor, SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    private final c f48a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences.Editor f49b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f50c;

    /* renamed from: d  reason: collision with root package name */
    private final Gson f51d;

    public b(c encryptedSharedPref) {
        Intrinsics.checkNotNullParameter(encryptedSharedPref, "encryptedSharedPref");
        this.f48a = encryptedSharedPref;
        this.f49b = encryptedSharedPref.b();
        this.f50c = encryptedSharedPref.a();
        this.f51d = new Gson();
    }

    @Override // c0.d
    public SharedPreferences a() {
        return this.f48a.a();
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.f49b.apply();
    }

    @Override // c0.d
    public SharedPreferences.Editor b() {
        return this.f48a.b();
    }

    public final Gson c() {
        return this.f51d;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        return this.f49b.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return this.f49b.commit();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f50c.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f50c.edit();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f50c.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z2) {
        return this.f50c.getBoolean(str, z2);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        return this.f50c.getFloat(str, f2);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        return this.f50c.getInt(str, i2);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        return this.f50c.getLong(str, j2);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return this.f50c.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return this.f50c.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z2) {
        return this.f49b.putBoolean(str, z2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f2) {
        return this.f49b.putFloat(str, f2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i2) {
        return this.f49b.putInt(str, i2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j2) {
        return this.f49b.putLong(str, j2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
        return this.f49b.putString(str, str2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        return this.f49b.putStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f50c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        return this.f49b.remove(str);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f50c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}