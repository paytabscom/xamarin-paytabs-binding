package com.google.crypto.tink.tinkkey;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class KeyAccess {
    private final boolean canAccessSecret;

    private KeyAccess(boolean canAccessSecret) {
        this.canAccessSecret = canAccessSecret;
    }

    public static KeyAccess publicAccess() {
        return new KeyAccess(false);
    }

    static KeyAccess secretAccess() {
        return new KeyAccess(true);
    }

    public boolean canAccessSecret() {
        return this.canAccessSecret;
    }
}