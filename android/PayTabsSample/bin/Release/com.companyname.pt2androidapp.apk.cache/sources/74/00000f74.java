package com.google.crypto.tink.config;

/* compiled from: TinkFipsDisabled.java */
/* loaded from: classes.dex */
final class TinkFipsStatus {
    public static boolean fipsModuleAvailable() {
        return false;
    }

    public static boolean useOnlyFips() {
        return false;
    }

    private TinkFipsStatus() {
    }
}