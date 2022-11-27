package d0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lretrofit2/HttpException;", "", "a", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final String a(HttpException httpException) {
        ResponseBody errorBody;
        Intrinsics.checkNotNullParameter(httpException, "<this>");
        Response response = httpException.response();
        if (response == null || (errorBody = response.errorBody()) == null) {
            return null;
        }
        return errorBody.string();
    }
}