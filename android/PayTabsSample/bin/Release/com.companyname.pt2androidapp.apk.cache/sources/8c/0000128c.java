package com.google.crypto.tink.tinkkey;

import com.google.crypto.tink.KeyTemplate;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes.dex */
public interface TinkKey {
    KeyTemplate getKeyTemplate();

    boolean hasSecret();
}