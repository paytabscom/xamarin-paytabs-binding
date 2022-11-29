package com.google.crypto.tink.config;

/* loaded from: classes.dex */
public final class TinkFips {

    /* loaded from: classes.dex */
    public enum AlgorithmFipsCompatibility {
        ALGORITHM_NOT_FIPS { // from class: com.google.crypto.tink.config.TinkFips.AlgorithmFipsCompatibility.1
            @Override // com.google.crypto.tink.config.TinkFips.AlgorithmFipsCompatibility
            public boolean isCompatible() {
                return !TinkFipsStatus.useOnlyFips();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO { // from class: com.google.crypto.tink.config.TinkFips.AlgorithmFipsCompatibility.2
            @Override // com.google.crypto.tink.config.TinkFips.AlgorithmFipsCompatibility
            public boolean isCompatible() {
                return !TinkFipsStatus.useOnlyFips() || TinkFipsStatus.fipsModuleAvailable();
            }
        };

        public abstract boolean isCompatible();
    }

    public static boolean useOnlyFips() {
        return TinkFipsStatus.useOnlyFips();
    }

    public static boolean fipsModuleAvailable() {
        return TinkFipsStatus.fipsModuleAvailable();
    }

    private TinkFips() {
    }
}