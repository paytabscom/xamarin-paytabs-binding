package com.google.crypto.tink.shaded.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c2);

    boolean addAllByteString(Collection<? extends ByteString> c2);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    ByteString getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList other);

    void set(int index, ByteString element);

    void set(int index, byte[] element);
}