package com.payment.paymentsdk.d3s.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014B%\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0002J\"\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/payment/paymentsdk/d3s/view/D3SView;", "Landroid/webkit/WebView;", "", "a", "", "returnUrl", "Lp/a;", "listener", "authorizationListener", "setWebChrome", "redirectURL", "Ljava/lang/String;", "javaScriptNameSpace", "Landroid/content/Context;", "activity", "<init>", "(Landroid/content/Context;)V", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class D3SView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private final String f161a;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/payment/paymentsdk/d3s/view/D3SView$a", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "view", "", "newProgress", "", "onProgressChanged", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3SView(Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
        this.f161a = "JavaScriptNS";
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3SView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
        this.f161a = "JavaScriptNS";
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3SView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNull(context);
        this.f161a = "JavaScriptNS";
        a();
    }

    private final void a() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDomStorageEnabled(true);
    }

    private final void a(String str, p.a aVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setWebViewClient(new s.a(str, aVar, context));
    }

    private final void setWebChrome(p.a aVar) {
        setWebChromeClient(new a());
    }

    public final void a(String str, String str2, p.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setWebChrome(listener);
        if (str2 == null) {
            str2 = "";
        }
        a(str2, listener);
        Intrinsics.checkNotNull(str);
        loadUrl(str);
    }
}