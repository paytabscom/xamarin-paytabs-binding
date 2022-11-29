package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}