package d0;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\r"}, d2 = {"Ld0/b;", "Lokhttp3/Interceptor;", "", "a", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/RequestBody;", "request", "", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private Request.Builder f176a;

    private final void a() {
        Request.Builder builder = this.f176a;
        if (builder != null) {
            builder.addHeader("Authorization", x.a.f543a.b());
        }
    }

    public final String a(RequestBody requestBody) {
        try {
            Buffer buffer = new Buffer();
            if (requestBody != null) {
                requestBody.writeTo(buffer);
                return buffer.readUtf8();
            }
            return "";
        } catch (IOException unused) {
            return "did not work";
        }
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        this.f176a = newBuilder;
        if (newBuilder != null) {
            newBuilder.addHeader("Content-Type", "application/octet-stream");
        }
        a();
        Request.Builder builder = this.f176a;
        Request build = builder != null ? builder.build() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("intercept: ");
        sb.append(a(build != null ? build.body() : null));
        Log.d("TAG_PAYTABS", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("intercept: ");
        byte[] bytes = a(build != null ? build.body() : null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        sb2.append(Base64.encodeToString(bytes, 0));
        Log.d("TAG_PAYTABS", sb2.toString());
        Intrinsics.checkNotNull(build);
        return chain.proceed(build);
    }
}