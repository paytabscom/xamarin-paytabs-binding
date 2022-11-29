package s;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;
import com.payment.paymentsdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0013\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u001b"}, d2 = {"Ls/a;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageCommitVisible", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "returnUrl", "Lp/a;", "authorizationListener", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Lp/a;Landroid/content/Context;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final String f406a;

    /* renamed from: b  reason: collision with root package name */
    private final p.a f407b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f408c;

    public a(String returnUrl, p.a authorizationListener, Context context) {
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(authorizationListener, "authorizationListener");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f406a = returnUrl;
        this.f407b = authorizationListener;
        this.f408c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.f408c;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.f407b.a(100);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        boolean z2 = false;
        this.f407b.a(0);
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) this.f406a, false, 2, (Object) null)) {
            z2 = true;
        }
        if (z2) {
            this.f407b.a();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError sslError) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        handler.cancel();
        Integer valueOf = sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null;
        String str = (valueOf != null && valueOf.intValue() == 3) ? "The certificate authority is not trusted." : (valueOf != null && valueOf.intValue() == 1) ? "The certificate has expired." : (valueOf != null && valueOf.intValue() == 2) ? "The certificate Hostname mismatch." : (valueOf != null && valueOf.intValue() == 0) ? "The certificate is not yet valid." : "SSL Certificate error.";
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f408c);
        builder.setTitle(R.string.payment_sdk_ssl_error);
        builder.setMessage(str);
        builder.setCancelable(false);
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: s.-$$Lambda$a$rx8WecBP9aRo0B7T1OvaMmLVIFY
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.a(a.this, dialogInterface, i2);
            }
        });
        builder.create().show();
    }
}