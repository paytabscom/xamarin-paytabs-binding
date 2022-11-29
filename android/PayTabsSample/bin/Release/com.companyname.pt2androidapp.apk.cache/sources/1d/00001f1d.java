package w;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.payment.paymentsdk.R;

/* loaded from: classes2.dex */
public final class a implements ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f517a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageButton f518b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f519c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f520d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f521e;

    private a(CardView cardView, AppCompatImageButton appCompatImageButton, ImageView imageView, TextView textView, TextView textView2) {
        this.f517a = cardView;
        this.f518b = appCompatImageButton;
        this.f519c = imageView;
        this.f520d = textView;
        this.f521e = textView2;
    }

    public static a a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_saved_card, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static a a(View view) {
        int i2 = R.id.delete;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i2);
        if (appCompatImageButton != null) {
            i2 = R.id.img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = R.id.noMasked;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.scheme;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        return new a((CardView) view, appCompatImageButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    /* renamed from: a */
    public CardView getRoot() {
        return this.f517a;
    }
}