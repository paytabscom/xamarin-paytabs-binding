package z;

import android.os.Handler;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0006"}, d2 = {"", "", "a", "Lkotlin/Function0;", "", "func", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final String a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new Gson().toJson(obj);
    }

    public static final void a(final Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        new Handler().postDelayed(new Runnable() { // from class: z.-$$Lambda$b$vgZaQdAyj2hRkhy0hfDzpdmZY0I
            @Override // java.lang.Runnable
            public final void run() {
                b.lambda$vgZaQdAyj2hRkhy0hfDzpdmZY0I(Function0.this);
            }
        }, 80L);
    }

    public static final void b(Function0 func) {
        Intrinsics.checkNotNullParameter(func, "$func");
        func.invoke();
    }

    public static /* synthetic */ void lambda$vgZaQdAyj2hRkhy0hfDzpdmZY0I(Function0 function0) {
        b(function0);
    }
}