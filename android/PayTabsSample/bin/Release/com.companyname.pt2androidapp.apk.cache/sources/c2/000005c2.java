package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    final ClipData mClip;
    final Bundle mExtras;
    final int mFlags;
    final Uri mLinkUri;
    final int mSource;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Source {
    }

    static String sourceToString(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    static String flagsToString(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    ContentInfoCompat(Builder builder) {
        this.mClip = (ClipData) Preconditions.checkNotNull(builder.mClip);
        this.mSource = Preconditions.checkArgumentInRange(builder.mSource, 0, 3, "source");
        this.mFlags = Preconditions.checkFlagsArgument(builder.mFlags, 1);
        this.mLinkUri = builder.mLinkUri;
        this.mExtras = builder.mExtras;
    }

    public String toString() {
        return "ContentInfoCompat{clip=" + this.mClip + ", source=" + sourceToString(this.mSource) + ", flags=" + flagsToString(this.mFlags) + ", linkUri=" + this.mLinkUri + ", extras=" + this.mExtras + "}";
    }

    public ClipData getClip() {
        return this.mClip;
    }

    public int getSource() {
        return this.mSource;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public Uri getLinkUri() {
        return this.mLinkUri;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Pair<ContentInfoCompat, ContentInfoCompat> partition(Predicate<ClipData.Item> predicate) {
        if (this.mClip.getItemCount() == 1) {
            boolean test = predicate.test(this.mClip.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.mClip.getItemCount(); i2++) {
            ClipData.Item itemAt = this.mClip.getItemAt(i2);
            if (predicate.test(itemAt)) {
                arrayList.add(itemAt);
            } else {
                arrayList2.add(itemAt);
            }
        }
        if (arrayList.isEmpty()) {
            return Pair.create(null, this);
        }
        if (arrayList2.isEmpty()) {
            return Pair.create(this, null);
        }
        return Pair.create(new Builder(this).setClip(buildClipData(this.mClip.getDescription(), arrayList)).build(), new Builder(this).setClip(buildClipData(this.mClip.getDescription(), arrayList2)).build());
    }

    private static ClipData buildClipData(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            clipData.addItem(list.get(i2));
        }
        return clipData;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        ClipData mClip;
        Bundle mExtras;
        int mFlags;
        Uri mLinkUri;
        int mSource;

        public Builder(ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.mClip;
            this.mSource = contentInfoCompat.mSource;
            this.mFlags = contentInfoCompat.mFlags;
            this.mLinkUri = contentInfoCompat.mLinkUri;
            this.mExtras = contentInfoCompat.mExtras;
        }

        public Builder(ClipData clipData, int i2) {
            this.mClip = clipData;
            this.mSource = i2;
        }

        public Builder setClip(ClipData clipData) {
            this.mClip = clipData;
            return this;
        }

        public Builder setSource(int i2) {
            this.mSource = i2;
            return this;
        }

        public Builder setFlags(int i2) {
            this.mFlags = i2;
            return this;
        }

        public Builder setLinkUri(Uri uri) {
            this.mLinkUri = uri;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public ContentInfoCompat build() {
            return new ContentInfoCompat(this);
        }
    }
}