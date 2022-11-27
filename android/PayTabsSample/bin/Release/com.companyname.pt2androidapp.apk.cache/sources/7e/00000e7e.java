package f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.payment.paymentsdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import z.c;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB'\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lf/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lf/b$a;", "", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "a", "holder", "position", "", "", "", "list", "La0/a;", "listener", "<init>", "(Ljava/util/List;La0/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f186a;

    /* renamed from: b  reason: collision with root package name */
    private final a0.a<String> f187b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf/b$a;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "v", "<init>", "(Landroid/view/View;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View v2) {
            super(v2);
            Intrinsics.checkNotNullParameter(v2, "v");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011b extends Lambda implements Function0<Unit> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0011b(int i2) {
            super(0);
            this.f189b = i2;
        }

        public final void a() {
            a0.a aVar = b.this.f187b;
            List list = b.this.f186a;
            aVar.a(list != null ? (String) list.get(this.f189b) : null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public b(List<String> list, a0.a<String> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f186a = list;
        this.f187b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public a onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.support_simple_spinner_dropdown_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        return new a(v2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(a holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        TextView textView = (TextView) c.a(view, 16908308);
        List<String> list = this.f186a;
        textView.setText(list != null ? list.get(i2) : null);
        View view2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
        c.a(view2, new C0011b(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f186a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}