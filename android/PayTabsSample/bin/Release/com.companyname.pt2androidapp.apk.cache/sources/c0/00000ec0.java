package k0;

import android.app.Application;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u0017"}, d2 = {"Lk0/a;", "", "Ll0/a;", "card", "", "a", "", "b", "", "d", "", "sharedPrefFileName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lc0/b;", "sharedPref", "Lc0/b;", "()Lc0/b;", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0016a f280e = new C0016a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Application f281a;

    /* renamed from: b  reason: collision with root package name */
    private final String f282b;

    /* renamed from: c  reason: collision with root package name */
    private final c0.c f283c;

    /* renamed from: d  reason: collision with root package name */
    private final c0.b f284d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk0/a$a;", "", "", "CARDS_KEY", "Ljava/lang/String;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016a {
        private C0016a() {
        }

        public /* synthetic */ C0016a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"k0/a$b", "Lcom/google/gson/reflect/TypeToken;", "", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends TypeToken<List<? extends l0.a>> {
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"com/payment/paymentsdk/helper/pref/EncryptedSharedPrefWithModelCapabilities$getModels$1", "Lcom/google/gson/reflect/TypeToken;", "", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends TypeToken<List<? extends l0.a>> {
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"k0/a$d", "Lcom/google/gson/reflect/TypeToken;", "", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends TypeToken<List<? extends l0.a>> {
    }

    public a(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.f281a = app;
        this.f282b = "paytabs_skd_enc_pref";
        c0.a aVar = new c0.a(app, c());
        this.f283c = aVar;
        this.f284d = new c0.b(aVar);
    }

    public List<l0.a> a() {
        c0.b b2 = b();
        String string = b2.getString("cards_key", null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullExpressionValue(string, "getString(key, null) ?: return emptyList()");
        Object fromJson = b2.c().fromJson(string, new b().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(modelStrin…n<List<MODEL>>() {}.type)");
        return (List) fromJson;
    }

    public void a(l0.a card) {
        List list;
        Intrinsics.checkNotNullParameter(card, "card");
        c0.b b2 = b();
        String string = b2.getString("cards_key", null);
        if (string == null) {
            list = CollectionsKt.emptyList();
        } else {
            Intrinsics.checkNotNullExpressionValue(string, "getString(key, null) ?: return emptyList()");
            Object fromJson = b2.c().fromJson(string, new c().getType());
            Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(modelStrin…n<List<MODEL>>() {}.type)");
            list = (List) fromJson;
        }
        b2.putString("cards_key", b2.c().toJson(CollectionsKt.plus((Collection<? extends l0.a>) list, card))).commit();
    }

    public c0.b b() {
        return this.f284d;
    }

    public void b(l0.a card) {
        Intrinsics.checkNotNullParameter(card, "card");
        c0.b b2 = b();
        String string = b2.getString("cards_key", null);
        if (string == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(string, "getString(key, null) ?: return");
        Object fromJson = b2.c().fromJson(string, new d().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(modelStrin…n<List<MODEL>>() {}.type)");
        List mutableList = CollectionsKt.toMutableList((Collection) ((List) fromJson));
        mutableList.remove(card);
        b2.putString("cards_key", b2.c().toJson(mutableList)).commit();
    }

    public String c() {
        return this.f282b;
    }

    public boolean d() {
        return !a().isEmpty();
    }
}