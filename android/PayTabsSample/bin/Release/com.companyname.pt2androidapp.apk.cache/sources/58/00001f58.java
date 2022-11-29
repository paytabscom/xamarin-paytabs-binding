package z;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u001a#\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0003*\u00020\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0011"}, d2 = {"Landroid/view/View;", "", "millis", "", "a", "Lkotlin/Function0;", "func", "T", "", "id", "(Landroid/view/View;I)Landroid/view/View;", "e", "d", "", "show", "(Landroid/view/View;Ljava/lang/Boolean;)V", "c", "paymentsdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c {

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"z/c$a", "Landroid/view/animation/Animation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "", "applyTransformation", "", "willChangeBounds", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class a extends Animation {

        /* renamed from: a */
        final /* synthetic */ View f584a;

        /* renamed from: b */
        final /* synthetic */ int f585b;

        a(View view, int i2) {
            this.f584a = view;
            this.f585b = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f2, Transformation transformation) {
            if (f2 == 1.0f) {
                c.d(this.f584a);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f584a.getLayoutParams();
            int i2 = this.f585b;
            layoutParams.height = i2 - ((int) (i2 * f2));
            this.f584a.requestLayout();
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"z/c$b", "Landroid/view/animation/Animation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "", "applyTransformation", "", "willChangeBounds", "paymentsdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class b extends Animation {

        /* renamed from: a */
        final /* synthetic */ View f586a;

        /* renamed from: b */
        final /* synthetic */ int f587b;

        b(View view, int i2) {
            this.f586a = view;
            this.f587b = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f2, Transformation transformation) {
            this.f586a.getLayoutParams().height = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) == 0 ? -2 : (int) (this.f587b * f2);
            this.f586a.requestLayout();
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    public static final <T extends View> T a(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        T t2 = (T) view.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(t2, "findViewById<T>(id)");
        return t2;
    }

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        a aVar = new a(view, view.getMeasuredHeight());
        aVar.setDuration(100L);
        view.startAnimation(aVar);
    }

    public static final void a(final View view, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(false);
        new Handler().postDelayed(new Runnable() { // from class: z.-$$Lambda$c$BnBeWVFR6FfFgpUf8RAQPIu-lRc
            @Override // java.lang.Runnable
            public final void run() {
                c.m1650lambda$BnBeWVFR6FfFgpUf8RAQPIulRc(view);
            }
        }, j2);
    }

    public static final void a(View view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility((bool == null || !Intrinsics.areEqual(bool, Boolean.TRUE)) ? 8 : 0);
    }

    public static final void a(View view, final Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        view.setOnClickListener(new View.OnClickListener() { // from class: z.-$$Lambda$c$YNTj3Axd2DrLYwDRkaXY414SZiM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.lambda$YNTj3Axd2DrLYwDRkaXY414SZiM(Function0.this, view2);
            }
        });
    }

    public static final void a(Function0 func, View view) {
        Intrinsics.checkNotNullParameter(func, "$func");
        func.invoke();
    }

    public static final void b(View this_disableFor) {
        Intrinsics.checkNotNullParameter(this_disableFor, "$this_disableFor");
        this_disableFor.setEnabled(true);
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 1;
        e(view);
        b bVar = new b(view, measuredHeight);
        bVar.setDuration(100L);
        view.startAnimation(bVar);
    }

    public static final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: lambda$BnBeWVFR6FfFgpUf8RAQPIu-lRc */
    public static /* synthetic */ void m1650lambda$BnBeWVFR6FfFgpUf8RAQPIulRc(View view) {
        b(view);
    }

    public static /* synthetic */ void lambda$YNTj3Axd2DrLYwDRkaXY414SZiM(Function0 function0, View view) {
        a(function0, view);
    }
}