package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

/* loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    private static final String LOG_TAG = "ReceiveContent";

    @Override // androidx.core.view.OnReceiveContentListener
    public ContentInfoCompat onReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable(LOG_TAG, 3)) {
            Log.d(LOG_TAG, "onReceive: " + contentInfoCompat);
        }
        int source = contentInfoCompat.getSource();
        if (source == 2) {
            return contentInfoCompat;
        }
        if (source == 3) {
            onReceiveForDragAndDrop((TextView) view, contentInfoCompat);
            return null;
        }
        ClipData clip = contentInfoCompat.getClip();
        int flags = contentInfoCompat.getFlags();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clip.getItemCount(); i2++) {
            CharSequence coerceToText = coerceToText(context, clip.getItemAt(i2), flags);
            if (coerceToText != null) {
                if (!z2) {
                    replaceSelection(editable, coerceToText);
                    z2 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToText);
                }
            }
        }
        return null;
    }

    private static void onReceiveForDragAndDrop(TextView textView, ContentInfoCompat contentInfoCompat) {
        replaceSelection((Editable) textView.getText(), coerceToText(contentInfoCompat.getClip(), textView.getContext(), contentInfoCompat.getFlags()));
    }

    private static CharSequence coerceToText(ClipData clipData, Context context, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
            CharSequence coerceToText = coerceToText(context, clipData.getItemAt(i3), i2);
            if (coerceToText != null) {
                spannableStringBuilder.append(coerceToText);
            }
        }
        return spannableStringBuilder;
    }

    private static CharSequence coerceToText(Context context, ClipData.Item item, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return Api16Impl.coerce(context, item, i2);
        }
        return ApiImpl.coerce(context, item, i2);
    }

    private static void replaceSelection(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Api16Impl {
        private Api16Impl() {
        }

        static CharSequence coerce(Context context, ClipData.Item item, int i2) {
            if ((i2 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ApiImpl {
        private ApiImpl() {
        }

        static CharSequence coerce(Context context, ClipData.Item item, int i2) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i2 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }
}