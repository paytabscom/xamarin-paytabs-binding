package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class TokenContents {
    private final byte[] mContents;
    private List<byte[]> mFingerprints;
    private String mPackageName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TokenContents deserialize(byte[] serialized) {
        return new TokenContents(serialized);
    }

    private TokenContents(byte[] contents) {
        this.mContents = contents;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TokenContents create(String packageName, List<byte[]> fingerprints) throws IOException {
        return new TokenContents(createToken(packageName, fingerprints), packageName, fingerprints);
    }

    private TokenContents(byte[] contents, String packageName, List<byte[]> fingerprints) {
        this.mContents = contents;
        this.mPackageName = packageName;
        this.mFingerprints = new ArrayList(fingerprints.size());
        for (byte[] bArr : fingerprints) {
            this.mFingerprints.add(Arrays.copyOf(bArr, bArr.length));
        }
    }

    public String getPackageName() throws IOException {
        parseIfNeeded();
        String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int getFingerprintCount() throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new IllegalStateException();
        }
        return list.size();
    }

    public byte[] getFingerprint(int i2) throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new IllegalStateException();
        }
        return Arrays.copyOf(list.get(i2), this.mFingerprints.get(i2).length);
    }

    public byte[] serialize() {
        byte[] bArr = this.mContents;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        return Arrays.equals(this.mContents, ((TokenContents) o2).mContents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mContents);
    }

    private static byte[] createToken(String packageName, List<byte[]> fingerprints) throws IOException {
        Collections.sort(fingerprints, $$Lambda$TokenContents$Q7kOl2yBde7CmQs5Ktpiz56Nr70.INSTANCE);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(packageName);
        dataOutputStream.writeInt(fingerprints.size());
        for (byte[] bArr : fingerprints) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] a2, byte[] b2) {
        int length;
        int length2;
        if (a2 == b2) {
            return 0;
        }
        if (a2 == null) {
            return -1;
        }
        if (b2 == null) {
            return 1;
        }
        int i2 = 0;
        while (true) {
            if (i2 < Math.min(a2.length, b2.length)) {
                if (a2[i2] != b2[i2]) {
                    length = a2[i2];
                    length2 = b2[i2];
                    break;
                }
                i2++;
            } else if (a2.length == b2.length) {
                return 0;
            } else {
                length = a2.length;
                length2 = b2.length;
            }
        }
        return length - length2;
    }

    private void parseIfNeeded() throws IOException {
        if (this.mPackageName != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.mFingerprints = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) != readInt2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.mFingerprints.add(bArr);
        }
    }
}