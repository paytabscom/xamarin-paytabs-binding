package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes.dex */
public interface AesGcmHkdfStreamingKeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getKeySize();

    AesGcmHkdfStreamingParams getParams();

    int getVersion();

    boolean hasParams();
}