package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class KeyTemplates {
    public static KeyTemplate get(String name) throws GeneralSecurityException {
        if (!Registry.keyTemplateMap().containsKey(name)) {
            throw new GeneralSecurityException("cannot find key template: " + name);
        }
        return Registry.keyTemplateMap().get(name);
    }

    private KeyTemplates() {
    }
}