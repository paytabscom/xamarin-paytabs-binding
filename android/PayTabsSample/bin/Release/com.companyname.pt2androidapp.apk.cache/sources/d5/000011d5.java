package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    static {
        long arrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (7 & arrayBaseOffset);
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T allocateInstance(Class<T> clazz) {
        try {
            return (T) UNSAFE.allocateInstance(clazz);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long objectFieldOffset(Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    private static int arrayBaseOffset(Class<?> clazz) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> clazz) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(clazz);
        }
        return -1;
    }

    static byte getByte(Object target, long offset) {
        return MEMORY_ACCESSOR.getByte(target, offset);
    }

    static void putByte(Object target, long offset, byte value) {
        MEMORY_ACCESSOR.putByte(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(Object target, long offset) {
        return MEMORY_ACCESSOR.getInt(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putInt(Object target, long offset, int value) {
        MEMORY_ACCESSOR.putInt(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(Object target, long offset) {
        return MEMORY_ACCESSOR.getLong(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putLong(Object target, long offset, long value) {
        MEMORY_ACCESSOR.putLong(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getBoolean(Object target, long offset) {
        return MEMORY_ACCESSOR.getBoolean(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putBoolean(Object target, long offset, boolean value) {
        MEMORY_ACCESSOR.putBoolean(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getFloat(Object target, long offset) {
        return MEMORY_ACCESSOR.getFloat(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putFloat(Object target, long offset, float value) {
        MEMORY_ACCESSOR.putFloat(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double getDouble(Object target, long offset) {
        return MEMORY_ACCESSOR.getDouble(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putDouble(Object target, long offset, double value) {
        MEMORY_ACCESSOR.putDouble(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getObject(Object target, long offset) {
        return MEMORY_ACCESSOR.getObject(target, offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putObject(Object target, long offset, Object value) {
        MEMORY_ACCESSOR.putObject(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] target, long index) {
        return MEMORY_ACCESSOR.getByte(target, BYTE_ARRAY_BASE_OFFSET + index);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(byte[] target, long index, byte value) {
        MEMORY_ACCESSOR.putByte(target, BYTE_ARRAY_BASE_OFFSET + index, value);
    }

    static int getInt(int[] target, long index) {
        return MEMORY_ACCESSOR.getInt(target, INT_ARRAY_BASE_OFFSET + (index * INT_ARRAY_INDEX_SCALE));
    }

    static void putInt(int[] target, long index, int value) {
        MEMORY_ACCESSOR.putInt(target, INT_ARRAY_BASE_OFFSET + (index * INT_ARRAY_INDEX_SCALE), value);
    }

    static long getLong(long[] target, long index) {
        return MEMORY_ACCESSOR.getLong(target, LONG_ARRAY_BASE_OFFSET + (index * LONG_ARRAY_INDEX_SCALE));
    }

    static void putLong(long[] target, long index, long value) {
        MEMORY_ACCESSOR.putLong(target, LONG_ARRAY_BASE_OFFSET + (index * LONG_ARRAY_INDEX_SCALE), value);
    }

    static boolean getBoolean(boolean[] target, long index) {
        return MEMORY_ACCESSOR.getBoolean(target, BOOLEAN_ARRAY_BASE_OFFSET + (index * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    static void putBoolean(boolean[] target, long index, boolean value) {
        MEMORY_ACCESSOR.putBoolean(target, BOOLEAN_ARRAY_BASE_OFFSET + (index * BOOLEAN_ARRAY_INDEX_SCALE), value);
    }

    static float getFloat(float[] target, long index) {
        return MEMORY_ACCESSOR.getFloat(target, FLOAT_ARRAY_BASE_OFFSET + (index * FLOAT_ARRAY_INDEX_SCALE));
    }

    static void putFloat(float[] target, long index, float value) {
        MEMORY_ACCESSOR.putFloat(target, FLOAT_ARRAY_BASE_OFFSET + (index * FLOAT_ARRAY_INDEX_SCALE), value);
    }

    static double getDouble(double[] target, long index) {
        return MEMORY_ACCESSOR.getDouble(target, DOUBLE_ARRAY_BASE_OFFSET + (index * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static void putDouble(double[] target, long index, double value) {
        MEMORY_ACCESSOR.putDouble(target, DOUBLE_ARRAY_BASE_OFFSET + (index * DOUBLE_ARRAY_INDEX_SCALE), value);
    }

    static Object getObject(Object[] target, long index) {
        return MEMORY_ACCESSOR.getObject(target, OBJECT_ARRAY_BASE_OFFSET + (index * OBJECT_ARRAY_INDEX_SCALE));
    }

    static void putObject(Object[] target, long index, Object value) {
        MEMORY_ACCESSOR.putObject(target, OBJECT_ARRAY_BASE_OFFSET + (index * OBJECT_ARRAY_INDEX_SCALE), value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
        MEMORY_ACCESSOR.copyMemory(src, srcIndex, targetOffset, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
        MEMORY_ACCESSOR.copyMemory(srcOffset, target, targetIndex, length);
    }

    static void copyMemory(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(long address) {
        return MEMORY_ACCESSOR.getByte(address);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(long address, byte value) {
        MEMORY_ACCESSOR.putByte(address, value);
    }

    static int getInt(long address) {
        return MEMORY_ACCESSOR.getInt(address);
    }

    static void putInt(long address, int value) {
        MEMORY_ACCESSOR.putInt(address, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long address) {
        return MEMORY_ACCESSOR.getLong(address);
    }

    static void putLong(long address, long value) {
        MEMORY_ACCESSOR.putLong(address, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long addressOffset(ByteBuffer buffer) {
        return MEMORY_ACCESSOR.getLong(buffer, BUFFER_ADDRESS_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getStaticObject(Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.crypto.tink.shaded.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    Field[] declaredFields;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (Android.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new Android64MemoryAccessor(unsafe);
            }
            if (IS_ANDROID_32) {
                return new Android32MemoryAccessor(unsafe);
            }
            return null;
        }
        return new JvmMemoryAccessor(unsafe);
    }

    private static boolean supportsUnsafeArrayOperations() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (Android.isOnAndroidDevice()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (bufferAddressField() == null) {
                return false;
            }
            if (Android.isOnAndroidDevice()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean determineAndroidSupportByAddressSize(Class<?> addressClass) {
        if (Android.isOnAndroidDevice()) {
            try {
                Class<?> cls = MEMORY_CLASS;
                cls.getMethod("peekLong", addressClass, Boolean.TYPE);
                cls.getMethod("pokeLong", addressClass, Long.TYPE, Boolean.TYPE);
                cls.getMethod("pokeInt", addressClass, Integer.TYPE, Boolean.TYPE);
                cls.getMethod("peekInt", addressClass, Boolean.TYPE);
                cls.getMethod("pokeByte", addressClass, Byte.TYPE);
                cls.getMethod("peekByte", addressClass);
                cls.getMethod("pokeByteArray", addressClass, byte[].class, Integer.TYPE, Integer.TYPE);
                cls.getMethod("peekByteArray", addressClass, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field bufferAddressField() {
        Field field;
        if (!Android.isOnAndroidDevice() || (field = field(Buffer.class, "effectiveDirectAddress")) == null) {
            Field field2 = field(Buffer.class, "address");
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    private static int firstDifferingByteIndexNativeEndian(long left, long right) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(left ^ right);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(left ^ right);
        }
        return numberOfTrailingZeros >> 3;
    }

    static int mismatch(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i3 = (BYTE_ARRAY_ALIGNMENT + leftOff) & 7; i2 < length && (i3 & 7) != 0; i3++) {
                if (left[leftOff + i2] != right[rightOff + i2]) {
                    return i2;
                }
                i2++;
            }
            int i4 = ((length - i2) & (-8)) + i2;
            while (i2 < i4) {
                long j2 = BYTE_ARRAY_BASE_OFFSET;
                long j3 = i2;
                long j4 = getLong((Object) left, leftOff + j2 + j3);
                long j5 = getLong((Object) right, j2 + rightOff + j3);
                if (j4 != j5) {
                    return i2 + firstDifferingByteIndexNativeEndian(j4, j5);
                }
                i2 += 8;
            }
        }
        while (i2 < length) {
            if (left[leftOff + i2] != right[rightOff + i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static long fieldOffset(Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return memoryAccessor.objectFieldOffset(field);
    }

    private static Field field(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class MemoryAccessor {
        Unsafe unsafe;

        public abstract void copyMemory(long srcOffset, byte[] target, long targetIndex, long length);

        public abstract void copyMemory(byte[] src, long srcIndex, long targetOffset, long length);

        public abstract boolean getBoolean(Object target, long offset);

        public abstract byte getByte(long address);

        public abstract byte getByte(Object target, long offset);

        public abstract double getDouble(Object target, long offset);

        public abstract float getFloat(Object target, long offset);

        public abstract int getInt(long address);

        public abstract long getLong(long address);

        public abstract Object getStaticObject(Field field);

        public abstract void putBoolean(Object target, long offset, boolean value);

        public abstract void putByte(long address, byte value);

        public abstract void putByte(Object target, long offset, byte value);

        public abstract void putDouble(Object target, long offset, double value);

        public abstract void putFloat(Object target, long offset, float value);

        public abstract void putInt(long address, int value);

        public abstract void putLong(long address, long value);

        MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final long objectFieldOffset(Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public final int getInt(Object target, long offset) {
            return this.unsafe.getInt(target, offset);
        }

        public final void putInt(Object target, long offset, int value) {
            this.unsafe.putInt(target, offset, value);
        }

        public final long getLong(Object target, long offset) {
            return this.unsafe.getLong(target, offset);
        }

        public final void putLong(Object target, long offset, long value) {
            this.unsafe.putLong(target, offset, value);
        }

        public final Object getObject(Object target, long offset) {
            return this.unsafe.getObject(target, offset);
        }

        public final void putObject(Object target, long offset, Object value) {
            this.unsafe.putObject(target, offset, value);
        }

        public final int arrayBaseOffset(Class<?> clazz) {
            return this.unsafe.arrayBaseOffset(clazz);
        }

        public final int arrayIndexScale(Class<?> clazz) {
            return this.unsafe.arrayIndexScale(clazz);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            return this.unsafe.getByte(address);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            this.unsafe.putByte(address, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            return this.unsafe.getInt(address);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            this.unsafe.putInt(address, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            return this.unsafe.getLong(address);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            this.unsafe.putLong(address, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object target, long offset) {
            return this.unsafe.getByte(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object target, long offset, byte value) {
            this.unsafe.putByte(target, offset, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object target, long offset) {
            return this.unsafe.getBoolean(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object target, long offset, boolean value) {
            this.unsafe.putBoolean(target, offset, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object target, long offset) {
            return this.unsafe.getFloat(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object target, long offset, float value) {
            this.unsafe.putFloat(target, offset, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object target, long offset) {
            return this.unsafe.getDouble(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object target, long offset, double value) {
            this.unsafe.putDouble(target, offset, value);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            this.unsafe.copyMemory((Object) null, srcOffset, target, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + targetIndex, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            this.unsafe.copyMemory(src, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object target, long offset) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(target, offset) : UnsafeUtil.getByteLittleEndian(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object target, long offset, byte value) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(target, offset, value);
            } else {
                UnsafeUtil.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object target, long offset) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(target, offset) : UnsafeUtil.getBooleanLittleEndian(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object target, long offset, boolean value) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(target, offset, value);
            } else {
                UnsafeUtil.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        private static int smallAddress(long address) {
            return (int) (address & (-1));
        }

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object target, long offset) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(target, offset) : UnsafeUtil.getByteLittleEndian(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object target, long offset, byte value) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(target, offset, value);
            } else {
                UnsafeUtil.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object target, long offset) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(target, offset) : UnsafeUtil.getBooleanLittleEndian(target, offset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object target, long offset, boolean value) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(target, offset, value);
            } else {
                UnsafeUtil.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object target, long offset) {
        return (byte) ((getInt(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object target, long offset) {
        return (byte) ((getInt(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object target, long offset, byte value) {
        long j2 = (-4) & offset;
        int i2 = getInt(target, j2);
        int i3 = ((~((int) offset)) & 3) << 3;
        putInt(target, j2, ((255 & value) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object target, long offset, byte value) {
        long j2 = (-4) & offset;
        int i2 = (((int) offset) & 3) << 3;
        putInt(target, j2, ((255 & value) << i2) | (getInt(target, j2) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object target, long offset) {
        return getByteBigEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object target, long offset) {
        return getByteLittleEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object target, long offset, boolean value) {
        putByteBigEndian(target, offset, value ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object target, long offset, boolean value) {
        putByteLittleEndian(target, offset, value ? (byte) 1 : (byte) 0);
    }
}