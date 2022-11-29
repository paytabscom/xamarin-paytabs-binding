package com.google.crypto.tink.tinkkey;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class KeyHandle {
    private final TinkKey key;

    public static KeyHandle createFromKey(TinkKey key, KeyAccess access) throws GeneralSecurityException {
        KeyHandle keyHandle = new KeyHandle(key);
        keyHandle.checkAccess(access);
        return keyHandle;
    }

    public static KeyHandle createFromKey(KeyData keyData, KeyTemplate.OutputPrefixType opt) {
        return new KeyHandle(new ProtoKey(keyData, opt));
    }

    private KeyHandle(TinkKey key) {
        this.key = key;
    }

    public boolean hasSecret() {
        return this.key.hasSecret();
    }

    public TinkKey getKey(KeyAccess access) throws GeneralSecurityException {
        checkAccess(access);
        return this.key;
    }

    private void checkAccess(KeyAccess access) throws GeneralSecurityException {
        if (hasSecret() && !access.canAccessSecret()) {
            throw new GeneralSecurityException("No access");
        }
    }
}