package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
class StreamingAeadUtil {
    StreamingAeadUtil() {
    }

    /* renamed from: com.google.crypto.tink.streamingaead.StreamingAeadUtil$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String toHmacAlgo(HashType hash) throws NoSuchAlgorithmException {
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "HmacSha512";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hash);
                    }
                    return "HmacSha384";
                }
                return "HmacSha256";
            }
            return "HmacSha224";
        }
        return "HmacSha1";
    }
}