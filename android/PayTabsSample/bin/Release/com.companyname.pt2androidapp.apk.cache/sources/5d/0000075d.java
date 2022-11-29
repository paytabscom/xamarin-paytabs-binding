package androidx.fragment.app;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"commit", "", "Landroidx/fragment/app/FragmentManager;", "allowStateLoss", "", "body", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "commitNow", "transaction", "now", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class FragmentManagerKt {
    public static /* synthetic */ void commit$default(FragmentManager commit, boolean z2, Function1 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(commit, "$this$commit");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = commit.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void commit(FragmentManager commit, boolean z2, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(commit, "$this$commit");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = commit.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager commitNow, boolean z2, Function1 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(commitNow, "$this$commitNow");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = commitNow.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static final void commitNow(FragmentManager commitNow, boolean z2, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(commitNow, "$this$commitNow");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = commitNow.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager transaction, boolean z2, boolean z3, Function1 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = transaction.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            if (z3) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z3) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(FragmentManager transaction, boolean z2, boolean z3, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction beginTransaction = transaction.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z2) {
            if (z3) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z3) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}