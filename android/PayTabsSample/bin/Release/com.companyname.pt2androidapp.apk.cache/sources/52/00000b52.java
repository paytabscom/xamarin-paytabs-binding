package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    protected abstract void closeField();

    protected abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    protected abstract boolean readBoolean();

    protected abstract Bundle readBundle();

    protected abstract byte[] readByteArray();

    protected abstract CharSequence readCharSequence();

    protected abstract double readDouble();

    protected abstract boolean readField(int i2);

    protected abstract float readFloat();

    protected abstract int readInt();

    protected abstract long readLong();

    protected abstract <T extends Parcelable> T readParcelable();

    protected abstract String readString();

    protected abstract IBinder readStrongBinder();

    protected abstract void setOutputField(int i2);

    public void setSerializationFlags(boolean z2, boolean z3) {
    }

    protected abstract void writeBoolean(boolean z2);

    protected abstract void writeBundle(Bundle bundle);

    protected abstract void writeByteArray(byte[] bArr);

    protected abstract void writeByteArray(byte[] bArr, int i2, int i3);

    protected abstract void writeCharSequence(CharSequence charSequence);

    protected abstract void writeDouble(double d2);

    protected abstract void writeFloat(float f2);

    protected abstract void writeInt(int i2);

    protected abstract void writeLong(long j2);

    protected abstract void writeParcelable(Parcelable parcelable);

    protected abstract void writeString(String str);

    protected abstract void writeStrongBinder(IBinder iBinder);

    protected abstract void writeStrongInterface(IInterface iInterface);

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    public void writeStrongInterface(IInterface iInterface, int i2) {
        setOutputField(i2);
        writeStrongInterface(iInterface);
    }

    public void writeBundle(Bundle bundle, int i2) {
        setOutputField(i2);
        writeBundle(bundle);
    }

    public void writeBoolean(boolean z2, int i2) {
        setOutputField(i2);
        writeBoolean(z2);
    }

    public void writeByteArray(byte[] bArr, int i2) {
        setOutputField(i2);
        writeByteArray(bArr);
    }

    public void writeByteArray(byte[] bArr, int i2, int i3, int i4) {
        setOutputField(i4);
        writeByteArray(bArr, i2, i3);
    }

    public void writeCharSequence(CharSequence charSequence, int i2) {
        setOutputField(i2);
        writeCharSequence(charSequence);
    }

    public void writeInt(int i2, int i3) {
        setOutputField(i3);
        writeInt(i2);
    }

    public void writeLong(long j2, int i2) {
        setOutputField(i2);
        writeLong(j2);
    }

    public void writeFloat(float f2, int i2) {
        setOutputField(i2);
        writeFloat(f2);
    }

    public void writeDouble(double d2, int i2) {
        setOutputField(i2);
        writeDouble(d2);
    }

    public void writeString(String str, int i2) {
        setOutputField(i2);
        writeString(str);
    }

    public void writeStrongBinder(IBinder iBinder, int i2) {
        setOutputField(i2);
        writeStrongBinder(iBinder);
    }

    public void writeParcelable(Parcelable parcelable, int i2) {
        setOutputField(i2);
        writeParcelable(parcelable);
    }

    public boolean readBoolean(boolean z2, int i2) {
        return !readField(i2) ? z2 : readBoolean();
    }

    public int readInt(int i2, int i3) {
        return !readField(i3) ? i2 : readInt();
    }

    public long readLong(long j2, int i2) {
        return !readField(i2) ? j2 : readLong();
    }

    public float readFloat(float f2, int i2) {
        return !readField(i2) ? f2 : readFloat();
    }

    public double readDouble(double d2, int i2) {
        return !readField(i2) ? d2 : readDouble();
    }

    public String readString(String str, int i2) {
        return !readField(i2) ? str : readString();
    }

    public IBinder readStrongBinder(IBinder iBinder, int i2) {
        return !readField(i2) ? iBinder : readStrongBinder();
    }

    public byte[] readByteArray(byte[] bArr, int i2) {
        return !readField(i2) ? bArr : readByteArray();
    }

    public <T extends Parcelable> T readParcelable(T t2, int i2) {
        return !readField(i2) ? t2 : (T) readParcelable();
    }

    public Bundle readBundle(Bundle bundle, int i2) {
        return !readField(i2) ? bundle : readBundle();
    }

    public void writeByte(byte b2, int i2) {
        setOutputField(i2);
        writeInt(b2);
    }

    public void writeSize(Size size, int i2) {
        setOutputField(i2);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    public void writeSizeF(SizeF sizeF, int i2) {
        setOutputField(i2);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
        setOutputField(i2);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            writeInt(sparseBooleanArray.keyAt(i3));
            writeBoolean(sparseBooleanArray.valueAt(i3));
        }
    }

    public void writeBooleanArray(boolean[] zArr, int i2) {
        setOutputField(i2);
        writeBooleanArray(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z2 : zArr) {
                writeInt(z2 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i2) {
        return !readField(i2) ? zArr : readBooleanArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean[] readBooleanArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            zArr[i2] = readInt() != 0;
        }
        return zArr;
    }

    public void writeCharArray(char[] cArr, int i2) {
        setOutputField(i2);
        if (cArr != null) {
            writeInt(cArr.length);
            for (char c2 : cArr) {
                writeInt(c2);
            }
            return;
        }
        writeInt(-1);
    }

    public CharSequence readCharSequence(CharSequence charSequence, int i2) {
        return !readField(i2) ? charSequence : readCharSequence();
    }

    public char[] readCharArray(char[] cArr, int i2) {
        if (readField(i2)) {
            int readInt = readInt();
            if (readInt < 0) {
                return null;
            }
            char[] cArr2 = new char[readInt];
            for (int i3 = 0; i3 < readInt; i3++) {
                cArr2[i3] = (char) readInt();
            }
            return cArr2;
        }
        return cArr;
    }

    public void writeIntArray(int[] iArr, int i2) {
        setOutputField(i2);
        writeIntArray(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i2 : iArr) {
                writeInt(i2);
            }
            return;
        }
        writeInt(-1);
    }

    public int[] readIntArray(int[] iArr, int i2) {
        return !readField(i2) ? iArr : readIntArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] readIntArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public void writeLongArray(long[] jArr, int i2) {
        setOutputField(i2);
        writeLongArray(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j2 : jArr) {
                writeLong(j2);
            }
            return;
        }
        writeInt(-1);
    }

    public long[] readLongArray(long[] jArr, int i2) {
        return !readField(i2) ? jArr : readLongArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long[] readLongArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        long[] jArr = new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public void writeFloatArray(float[] fArr, int i2) {
        setOutputField(i2);
        writeFloatArray(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f2 : fArr) {
                writeFloat(f2);
            }
            return;
        }
        writeInt(-1);
    }

    public float[] readFloatArray(float[] fArr, int i2) {
        return !readField(i2) ? fArr : readFloatArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float[] readFloatArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public void writeDoubleArray(double[] dArr, int i2) {
        setOutputField(i2);
        writeDoubleArray(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d2 : dArr) {
                writeDouble(d2);
            }
            return;
        }
        writeInt(-1);
    }

    public double[] readDoubleArray(double[] dArr, int i2) {
        return !readField(i2) ? dArr : readDoubleArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double[] readDoubleArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        double[] dArr = new double[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }

    public <T> void writeSet(Set<T> set, int i2) {
        writeCollection(set, i2);
    }

    public <T> void writeList(List<T> list, int i2) {
        writeCollection(list, i2);
    }

    public <K, V> void writeMap(Map<K, V> map, int i2) {
        setOutputField(i2);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    private <T> void writeCollection(Collection<T> collection, int i2) {
        setOutputField(i2);
        writeCollection(collection);
    }

    private <T> void writeCollection(Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
            return;
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    for (T t2 : collection) {
                        writeVersionedParcelable(t2);
                    }
                    return;
                case 2:
                    for (T t3 : collection) {
                        writeParcelable(t3);
                    }
                    return;
                case 3:
                    for (T t4 : collection) {
                        writeSerializable(t4);
                    }
                    return;
                case 4:
                    for (T t5 : collection) {
                        writeString(t5);
                    }
                    return;
                case 5:
                    for (T t6 : collection) {
                        writeStrongBinder(t6);
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    for (T t7 : collection) {
                        writeInt(t7.intValue());
                    }
                    return;
                case 8:
                    for (T t8 : collection) {
                        writeFloat(t8.floatValue());
                    }
                    return;
            }
        }
    }

    public <T> void writeArray(T[] tArr, int i2) {
        setOutputField(i2);
        writeArray(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> void writeArray(T[] tArr) {
        if (tArr == null) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i2 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i2 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i2]);
                    i2++;
                }
            } else if (type == 2) {
                while (i2 < length) {
                    writeParcelable((Parcelable) tArr[i2]);
                    i2++;
                }
            } else if (type == 3) {
                while (i2 < length) {
                    writeSerializable((Serializable) tArr[i2]);
                    i2++;
                }
            } else if (type == 4) {
                while (i2 < length) {
                    writeString((String) tArr[i2]);
                    i2++;
                }
            } else if (type != 5) {
            } else {
                while (i2 < length) {
                    writeStrongBinder((IBinder) tArr[i2]);
                    i2++;
                }
            }
        }
    }

    private <T> int getType(T t2) {
        if (t2 instanceof String) {
            return 4;
        }
        if (t2 instanceof Parcelable) {
            return 2;
        }
        if (t2 instanceof VersionedParcelable) {
            return 1;
        }
        if (t2 instanceof Serializable) {
            return 3;
        }
        if (t2 instanceof IBinder) {
            return 5;
        }
        if (t2 instanceof Integer) {
            return 7;
        }
        if (t2 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t2.getClass().getName() + " cannot be VersionedParcelled");
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i2) {
        setOutputField(i2);
        writeVersionedParcelable(versionedParcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        VersionedParcel createSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, createSubParcel);
        createSubParcel.closeField();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public void writeSerializable(Serializable serializable, int i2) {
        setOutputField(i2);
        writeSerializable(serializable);
    }

    private void writeSerializable(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e2);
        }
    }

    public void writeException(Exception exc, int i2) {
        setOutputField(i2);
        if (exc == null) {
            writeNoException();
            return;
        }
        int i3 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i3 = EX_PARCELABLE;
        } else if (exc instanceof SecurityException) {
            i3 = -1;
        } else if (exc instanceof BadParcelableException) {
            i3 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i3 = -3;
        } else if (exc instanceof NullPointerException) {
            i3 = -4;
        } else if (exc instanceof IllegalStateException) {
            i3 = EX_ILLEGAL_STATE;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i3 = EX_NETWORK_MAIN_THREAD;
        } else if (exc instanceof UnsupportedOperationException) {
            i3 = EX_UNSUPPORTED_OPERATION;
        }
        writeInt(i3);
        if (i3 == 0) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(exc);
        }
        writeString(exc.getMessage());
        if (i3 != EX_PARCELABLE) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    protected void writeNoException() {
        writeInt(0);
    }

    public Exception readException(Exception exc, int i2) {
        int readExceptionCode;
        return (readField(i2) && (readExceptionCode = readExceptionCode()) != 0) ? readException(readExceptionCode, readString()) : exc;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private Exception readException(int i2, String str) {
        return createException(i2, str);
    }

    protected static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private Exception createException(int i2, String str) {
        switch (i2) {
            case EX_PARCELABLE /* -9 */:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i2 + " msg " + str);
            case EX_UNSUPPORTED_OPERATION /* -7 */:
                return new UnsupportedOperationException(str);
            case EX_NETWORK_MAIN_THREAD /* -6 */:
                return new NetworkOnMainThreadException();
            case EX_ILLEGAL_STATE /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public byte readByte(byte b2, int i2) {
        return !readField(i2) ? b2 : (byte) (readInt() & 255);
    }

    public Size readSize(Size size, int i2) {
        if (readField(i2)) {
            if (readBoolean()) {
                return new Size(readInt(), readInt());
            }
            return null;
        }
        return size;
    }

    public SizeF readSizeF(SizeF sizeF, int i2) {
        if (readField(i2)) {
            if (readBoolean()) {
                return new SizeF(readFloat(), readFloat());
            }
            return null;
        }
        return sizeF;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
        if (readField(i2)) {
            int readInt = readInt();
            if (readInt < 0) {
                return null;
            }
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(readInt);
            for (int i3 = 0; i3 < readInt; i3++) {
                sparseBooleanArray2.put(readInt(), readBoolean());
            }
            return sparseBooleanArray2;
        }
        return sparseBooleanArray;
    }

    public <T> Set<T> readSet(Set<T> set, int i2) {
        return !readField(i2) ? set : (Set) readCollection(new ArraySet());
    }

    public <T> List<T> readList(List<T> list, int i2) {
        return !readField(i2) ? list : (List) readCollection(new ArrayList());
    }

    private <T, S extends Collection<T>> S readCollection(S s2) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    s2.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    s2.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    s2.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    s2.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    s2.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i2) {
        if (readField(i2)) {
            int readInt = readInt();
            if (readInt < 0) {
                return null;
            }
            ArrayMap arrayMap = new ArrayMap();
            if (readInt == 0) {
                return arrayMap;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            readCollection(arrayList);
            readCollection(arrayList2);
            for (int i3 = 0; i3 < readInt; i3++) {
                arrayMap.put(arrayList.get(i3), arrayList2.get(i3));
            }
            return arrayMap;
        }
        return map;
    }

    public <T> T[] readArray(T[] tArr, int i2) {
        return !readField(i2) ? tArr : (T[]) readArray(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T[] readArray(T[] tArr) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readInt);
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    arrayList.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    arrayList.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    arrayList.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    arrayList.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    arrayList.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t2, int i2) {
        return !readField(i2) ? t2 : (T) readVersionedParcelable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends VersionedParcelable> T readVersionedParcelable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        return (T) readFromParcel(readString, createSubParcel());
    }

    protected Serializable readSerializable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + readString + ")", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + readString + ")", e3);
        }
    }

    protected <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    protected <T extends VersionedParcelable> void writeToParcel(T t2, VersionedParcel versionedParcel) {
        try {
            getWriteMethod(t2.getClass()).invoke(null, t2, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mReadCache.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.mReadCache.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mWriteCache.get(cls.getName());
        if (method == null) {
            Class findParcelClass = findParcelClass(cls);
            System.currentTimeMillis();
            Method declaredMethod = findParcelClass.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.mWriteCache.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.mParcelizerCache.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }
}