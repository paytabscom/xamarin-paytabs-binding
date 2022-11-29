package k;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements TransformationMethod {
    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence.length() >= 9) {
            StringBuilder sb = new StringBuilder();
            sb.append("••••");
            sb.append(" ");
            sb.append(charSequence.subSequence(charSequence.length() - 4, charSequence.length()));
            char[] cArr = new char[charSequence.length() - sb.length()];
            Arrays.fill(cArr, (char) 0);
            sb.insert(0, cArr);
            return sb.toString();
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
    }
}