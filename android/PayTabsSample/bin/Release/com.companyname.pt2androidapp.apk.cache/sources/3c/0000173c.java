package q0;

import com.payment.paymentsdk.integrationmodels.PaymentSdkRegion;
import d0.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lq0/a;", "", "", "a", "Lretrofit2/Retrofit;", "b", "()Lretrofit2/Retrofit;", "client", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f377a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static Retrofit f378b;

    /* renamed from: c  reason: collision with root package name */
    private static PaymentSdkRegion f379c;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0026a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f380a;

        static {
            int[] iArr = new int[PaymentSdkRegion.values().length];
            iArr[PaymentSdkRegion.EGYPT.ordinal()] = 1;
            iArr[PaymentSdkRegion.JORDAN.ordinal()] = 2;
            iArr[PaymentSdkRegion.OMAN.ordinal()] = 3;
            iArr[PaymentSdkRegion.KSA.ordinal()] = 4;
            iArr[PaymentSdkRegion.GLOBAL.ordinal()] = 5;
            iArr[PaymentSdkRegion.DEMO.ordinal()] = 6;
            iArr[PaymentSdkRegion.IRAQ.ordinal()] = 7;
            iArr[PaymentSdkRegion.UAE.ordinal()] = 8;
            f380a = iArr;
        }
    }

    private a() {
    }

    private final String a() {
        String str;
        String str2;
        String str3;
        f379c = o0.a.a();
        switch (C0026a.f380a[o0.a.a().ordinal()]) {
            case 1:
                str = "secure-egypt";
                str2 = str;
                str3 = "secure";
                break;
            case 2:
                str = "secure-jordan";
                str2 = str;
                str3 = "secure";
                break;
            case 3:
                str = "secure-oman";
                str2 = str;
                str3 = "secure";
                break;
            case 4:
                str2 = "sa";
                str3 = "com";
                break;
            case 5:
                str = "secure-global";
                str2 = str;
                str3 = "secure";
                break;
            case 6:
                str = "secure-demo";
                str2 = str;
                str3 = "secure";
                break;
            case 7:
                str = "secure-iraq";
                str2 = str;
                str3 = "secure";
                break;
            default:
                str3 = "";
                str2 = str3;
                break;
        }
        return StringsKt.replace$default("https://secure.paytabs.com", str3, str2, false, 4, (Object) null);
    }

    public final Retrofit b() {
        Retrofit build;
        if (f378b == null || f379c != o0.a.a()) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new b());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.callTimeout(120L, timeUnit);
            builder.readTimeout(120L, timeUnit);
            builder.connectTimeout(120L, timeUnit);
            builder.writeTimeout(120L, timeUnit);
            build = new Retrofit.Builder().baseUrl(a()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build();
            f378b = build;
        } else {
            build = f378b;
        }
        Intrinsics.checkNotNull(build);
        return build;
    }
}