package x0;

import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lx0/a;", "", "", "plaintext", "Lokhttp3/RequestBody;", "a", "key", "<init>", "(Ljava/lang/String;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f546a;

    public a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f546a = key;
    }

    public final RequestBody a(String str) {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(iv, 0)");
        String substring = encodeToString.substring(0, 16);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String str2 = substring + str;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bytes = this.f546a.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = substring.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] bytes3 = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        byte[] doFinal = cipher.doFinal(bytes3);
        if (doFinal != null) {
            return RequestBody.Companion.create(doFinal, MediaType.Companion.get("application/octet-stream"), 0, doFinal.length);
        }
        return null;
    }
}