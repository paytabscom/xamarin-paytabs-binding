package g;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.Card;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ScanCardIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lg/b;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Lf/a;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "", "resultCode", "intent", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends ActivityResultContract<String, f.a> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a */
    public Intent createIntent(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent build = new ScanCardIntent.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(context).build()");
        return build;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a */
    public f.a parseResult(int i2, Intent intent) {
        if (i2 != -1) {
            return null;
        }
        Card card = intent != null ? (Card) intent.getParcelableExtra(ScanCardIntent.RESULT_PAYCARDS_CARD) : null;
        return new f.a(String.valueOf(card != null ? card.getCardHolderName() : null), String.valueOf(card != null ? card.getCardNumber() : null), card != null ? card.getExpirationDate() : null);
    }
}