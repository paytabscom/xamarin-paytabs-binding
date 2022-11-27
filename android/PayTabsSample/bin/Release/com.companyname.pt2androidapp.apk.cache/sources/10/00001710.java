package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.payment.paymentsdk.integrationmodels.PaymentSdkConfigurationDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lo/a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lh/a;", "repo", "Ly0/a;", "configDataValidator", "Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;", "ptConfigData", "<init>", "(Lh/a;Ly0/a;Lcom/payment/paymentsdk/integrationmodels/PaymentSdkConfigurationDetails;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    private final h.a f360a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a f361b;

    /* renamed from: c  reason: collision with root package name */
    private final PaymentSdkConfigurationDetails f362c;

    public a(h.a repo, y0.a configDataValidator, PaymentSdkConfigurationDetails paymentSdkConfigurationDetails) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(configDataValidator, "configDataValidator");
        this.f360a = repo;
        this.f361b = configDataValidator;
        this.f362c = paymentSdkConfigurationDetails;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(n.a.class)) {
            return new n.a(this.f360a, this.f362c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}