package m0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0007BI\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0007\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0007\u0010\u0011¨\u0006\u001a"}, d2 = {"Lm0/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lm0/a$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "a", "holder", "position", "", "getItemCount", "", "value", "editMode", "Z", "()Z", "(Z)V", "", "Ll0/a;", "values", "Lkotlin/Function2;", "onCardDeleted", "onSelectCard", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends RecyclerView.Adapter<C0021a> {

    /* renamed from: a */
    private final List<l0.a> f330a;

    /* renamed from: b */
    private final Function2<l0.a, Integer, Unit> f331b;

    /* renamed from: c */
    private final Function2<l0.a, Integer, Unit> f332c;

    /* renamed from: d */
    private boolean f333d;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lm0/a$a;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "img", "Landroid/widget/ImageView;", "b", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "scheme", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "noMasked", "c", "Landroidx/appcompat/widget/AppCompatImageButton;", "delete", "Landroidx/appcompat/widget/AppCompatImageButton;", "a", "()Landroidx/appcompat/widget/AppCompatImageButton;", "Lw/a;", "binding", "<init>", "(Lm0/a;Lw/a;)V", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: m0.a$a */
    /* loaded from: classes.dex */
    public final class C0021a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f334a;

        /* renamed from: b */
        private final TextView f335b;

        /* renamed from: c */
        private final TextView f336c;

        /* renamed from: d */
        private final AppCompatImageButton f337d;

        /* renamed from: e */
        final /* synthetic */ a f338e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0021a(a aVar, w.a binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f338e = aVar;
            ImageView imageView = binding.f498c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.img");
            this.f334a = imageView;
            TextView textView = binding.f500e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.scheme");
            this.f335b = textView;
            TextView textView2 = binding.f499d;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.noMasked");
            this.f336c = textView2;
            AppCompatImageButton appCompatImageButton = binding.f497b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "binding.delete");
            this.f337d = appCompatImageButton;
        }

        public final AppCompatImageButton a() {
            return this.f337d;
        }

        public final ImageView b() {
            return this.f334a;
        }

        public final TextView c() {
            return this.f336c;
        }

        public final TextView d() {
            return this.f335b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<l0.a> values, Function2<? super l0.a, ? super Integer, Unit> onCardDeleted, Function2<? super l0.a, ? super Integer, Unit> onSelectCard) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onCardDeleted, "onCardDeleted");
        Intrinsics.checkNotNullParameter(onSelectCard, "onSelectCard");
        this.f330a = values;
        this.f331b = onCardDeleted;
        this.f332c = onSelectCard;
    }

    public static final void a(a this$0, l0.a card, int i2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(card, "$card");
        this$0.f331b.invoke(card, Integer.valueOf(i2));
        this$0.f330a.remove(card);
        this$0.notifyItemRemoved(i2);
    }

    public static final void b(a this$0, l0.a card, int i2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(card, "$card");
        this$0.f332c.invoke(card, Integer.valueOf(i2));
    }

    public static /* synthetic */ void lambda$StvPyVeK_mJdQYkmz9Zqh1Tplgs(a aVar, l0.a aVar2, int i2, View view) {
        a(aVar, aVar2, i2, view);
    }

    /* renamed from: lambda$w9hyFKogLkAYyew-zvYEVrR2Q90 */
    public static /* synthetic */ void m1451lambda$w9hyFKogLkAYyewzvYEVrR2Q90(a aVar, l0.a aVar2, int i2, View view) {
        b(aVar, aVar2, i2, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public C0021a onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        w.a a2 = w.a.a(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(a2, "inflate(LayoutInflater.f….context), parent, false)");
        return new C0021a(this, a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(C0021a holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final l0.a aVar = this.f330a.get(i2);
        ImageView b2 = holder.b();
        String b3 = aVar.b();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = b3.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        b2.setImageResource(k.b.valueOf(upperCase).a());
        holder.d().setText(aVar.b());
        holder.c().setText(aVar.a());
        holder.a().setVisibility(this.f333d ? 0 : 8);
        holder.a().setOnClickListener(new View.OnClickListener() { // from class: m0.-$$Lambda$a$StvPyVeK_mJdQYkmz9Zqh1Tplgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.lambda$StvPyVeK_mJdQYkmz9Zqh1Tplgs(a.this, aVar, i2, view);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: m0.-$$Lambda$a$w9hyFKogLkAYyew-zvYEVrR2Q90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.m1451lambda$w9hyFKogLkAYyewzvYEVrR2Q90(a.this, aVar, i2, view);
            }
        });
    }

    public final void a(boolean z2) {
        this.f333d = z2;
        notifyItemRangeChanged(0, this.f330a.size());
    }

    public final boolean a() {
        return this.f333d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f330a.size();
    }
}