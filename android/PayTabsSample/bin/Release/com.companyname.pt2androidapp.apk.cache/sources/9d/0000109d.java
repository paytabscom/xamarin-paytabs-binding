package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes.dex */
public interface HmacPrfKeyOrBuilder extends MessageLiteOrBuilder {
    ByteString getKeyValue();

    HmacPrfParams getParams();

    int getVersion();

    boolean hasParams();
}