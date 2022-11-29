package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* loaded from: classes.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int number);
    }

    /* loaded from: classes.dex */
    public interface EnumVerifier {
        boolean isInRange(int number);
    }

    /* loaded from: classes.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int capacity);
    }

    public static int hashBoolean(boolean b2) {
        return b2 ? 1231 : 1237;
    }

    public static int hashLong(long n2) {
        return (int) (n2 ^ (n2 >>> 32));
    }

    private Internal() {
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T obj, String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }

    public static String stringDefaultValue(String bytes) {
        return new String(bytes.getBytes(ISO_8859_1), UTF_8);
    }

    public static ByteString bytesDefaultValue(String bytes) {
        return ByteString.copyFrom(bytes.getBytes(ISO_8859_1));
    }

    public static byte[] byteArrayDefaultValue(String bytes) {
        return bytes.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String bytes) {
        return ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer source) {
        ByteBuffer duplicate = source.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return Utf8.isValidUtf8(byteArray);
    }

    public static byte[] toByteArray(String value) {
        return value.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bytes) {
        return new String(bytes, UTF_8);
    }

    public static int hashEnum(EnumLite e2) {
        return e2.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        int i2 = 1;
        for (EnumLite enumLite : list) {
            i2 = (i2 * 31) + hashEnum(enumLite);
        }
        return i2;
    }

    public static boolean equals(List<byte[]> a2, List<byte[]> b2) {
        if (a2.size() != b2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (!Arrays.equals(a2.get(i2), b2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(List<byte[]> list) {
        int i2 = 1;
        for (byte[] bArr : list) {
            i2 = (i2 * 31) + hashCode(bArr);
        }
        return i2;
    }

    public static int hashCode(byte[] bytes) {
        return hashCode(bytes, 0, bytes.length);
    }

    static int hashCode(byte[] bytes, int offset, int length) {
        int partialHash = partialHash(length, bytes, offset, length);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialHash(int h2, byte[] bytes, int offset, int length) {
        for (int i2 = offset; i2 < offset + length; i2++) {
            h2 = (h2 * 31) + bytes[i2];
        }
        return h2;
    }

    public static boolean equalsByteBuffer(ByteBuffer a2, ByteBuffer b2) {
        if (a2.capacity() != b2.capacity()) {
            return false;
        }
        return a2.duplicate().clear().equals(b2.duplicate().clear());
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> a2, List<ByteBuffer> b2) {
        if (a2.size() != b2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (!equalsByteBuffer(a2.get(i2), b2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        int i2 = 1;
        for (ByteBuffer byteBuffer : list) {
            i2 = (i2 * 31) + hashCodeByteBuffer(byteBuffer);
        }
        return i2;
    }

    public static int hashCodeByteBuffer(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int partialHash = partialHash(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = bytes.duplicate();
        duplicate.clear();
        int capacity2 = bytes.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> clazz) {
        try {
            Method method = clazz.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object mergeMessage(Object destination, Object source) {
        return ((MessageLite) destination).toBuilder().mergeFrom((MessageLite) source).buildPartial();
    }

    /* loaded from: classes.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* loaded from: classes.dex */
        public interface Converter<F, T> {
            T convert(F from);
        }

        public ListAdapter(List<F> fromList, Converter<F, T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.converter.convert(this.fromList.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: classes.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* loaded from: classes.dex */
        public interface Converter<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumMap, final T unrecognizedValue) {
            return (Converter<Integer, T>) new Converter<Integer, T>() { // from class: com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter
                public EnumLite doForward(Integer value) {
                    EnumLite findValueByNumber = EnumLiteMap.this.findValueByNumber(value.intValue());
                    return findValueByNumber == null ? unrecognizedValue : findValueByNumber;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter
                public Integer doBackward(EnumLite value) {
                    return Integer.valueOf(value.getNumber());
                }
            };
        }

        public MapAdapter(Map<K, RealValue> realMap, Converter<RealValue, V> valueConverter) {
            this.realMap = realMap;
            this.valueConverter = valueConverter;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.realMap.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K key, V value) {
            RealValue put = this.realMap.put(key, this.valueConverter.doBackward(value));
            if (put == null) {
                return null;
            }
            return this.valueConverter.doForward(put);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        /* loaded from: classes.dex */
        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Map.Entry<K, RealValue>> realSet) {
                this.realSet = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        /* loaded from: classes.dex */
        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.realIterator = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.realIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(Map.Entry<K, RealValue> realEntry) {
                this.realEntry = realEntry;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V value) {
                Object value2 = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(value));
                if (value2 == null) {
                    return null;
                }
                return (V) MapAdapter.this.valueConverter.doForward(value2);
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o2) {
                if (o2 == this) {
                    return true;
                }
                if (o2 instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) o2).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        ProtobufList<Integer> mutableCopyWithCapacity(int capacity);

        int setInt(int index, int element);

        /* renamed from: com.google.crypto.tink.shaded.protobuf.Internal$IntList$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
        }
    }

    /* loaded from: classes.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // 
        ProtobufList<Boolean> mutableCopyWithCapacity(int capacity);

        boolean setBoolean(int index, boolean element);

        /* renamed from: com.google.crypto.tink.shaded.protobuf.Internal$BooleanList$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
        }
    }

    /* loaded from: classes.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        ProtobufList<Long> mutableCopyWithCapacity(int capacity);

        long setLong(int index, long element);

        /* renamed from: com.google.crypto.tink.shaded.protobuf.Internal$LongList$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
        }
    }

    /* loaded from: classes.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        ProtobufList<Double> mutableCopyWithCapacity(int capacity);

        double setDouble(int index, double element);

        /* renamed from: com.google.crypto.tink.shaded.protobuf.Internal$DoubleList$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
        }
    }

    /* loaded from: classes.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        ProtobufList<Float> mutableCopyWithCapacity(int capacity);

        float setFloat(int index, float element);

        /* renamed from: com.google.crypto.tink.shaded.protobuf.Internal$FloatList$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
        }
    }
}