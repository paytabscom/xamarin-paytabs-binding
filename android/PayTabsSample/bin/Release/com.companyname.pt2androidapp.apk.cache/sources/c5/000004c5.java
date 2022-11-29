package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {
    private final boolean mIsInPictureInPictureMode;
    private final Configuration mNewConfig;

    public PictureInPictureModeChangedInfo(boolean z2) {
        this.mIsInPictureInPictureMode = z2;
        this.mNewConfig = null;
    }

    public PictureInPictureModeChangedInfo(boolean z2, Configuration configuration) {
        this.mIsInPictureInPictureMode = z2;
        this.mNewConfig = configuration;
    }

    public boolean isInPictureInPictureMode() {
        return this.mIsInPictureInPictureMode;
    }

    public Configuration getNewConfig() {
        Configuration configuration = this.mNewConfig;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }
}