package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.internal.ByteStringKt;

/* compiled from: ByteString.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b&J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0010¢\u0006\u0002\b)J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0000H\u0010¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\r\u00103\u001a\u00020\u0004H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\tH\u0010¢\u0006\u0002\b7J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\u0006\u00109\u001a\u00020\u0000J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\u0000J\u0006\u0010C\u001a\u00020\u0000J\u0006\u0010D\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0000J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016J\u001c\u0010K\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\tH\u0017J\b\u0010N\u001a\u00020\u0000H\u0016J\b\u0010O\u001a\u00020\u0000H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0016J%\u0010R\u001a\u00020?2\u0006\u0010U\u001a\u00020V2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0010¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u00020?2\u0006\u0010S\u001a\u00020YH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006["}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$okio", "()[B", "hashCode", "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "digest", "algorithm", "digest$okio", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", "key", "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "offset", "otherOffset", "byteCount", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    @JvmStatic
    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    @JvmStatic
    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    @JvmStatic
    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @JvmStatic
    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return byteString.indexOf(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return byteString.indexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @JvmStatic
    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @JvmStatic
    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    @JvmStatic
    public static final ByteString of(byte[] bArr, int i2, int i3) {
        return Companion.of(bArr, i2, i3);
    }

    @JvmStatic
    public static final ByteString read(InputStream inputStream, int i2) throws IOException {
        return Companion.read(inputStream, i2);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = byteString.size();
            }
            return byteString.substring(i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public final int indexOf(ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public final ByteString substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    public ByteString(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public final void setHashCode$okio(int i2) {
        this.hashCode = i2;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public String string(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public ByteString digest$okio(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    public ByteString hmacSha1(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public ByteString hmac$okio(String algorithm, ByteString key) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            Intrinsics.checkNotNullExpressionValue(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final byte getByte(int i2) {
        return internalGet$okio(i2);
    }

    public final int size() {
        return getSize$okio();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public void write(OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.write(this.data);
    }

    public void write$okio(Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteStringKt.commonWrite(this, buffer, i2, i3);
    }

    public final int indexOf(ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return indexOf(other.internalArray$okio(), i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField("data");
        Intrinsics.checkNotNullExpressionValue(field, "field");
        field.setAccessible(true);
        field.set(this, read.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m1631deprecated_getByte(int i2) {
        return getByte(i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m1632deprecated_size() {
        return size();
    }

    /* compiled from: ByteString.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return companion.of(bArr, i2, i3);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ByteString of(ByteBuffer toByteString) {
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            byte[] bArr = new byte[toByteString.remaining()];
            toByteString.get(bArr);
            return new ByteString(bArr);
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        @JvmStatic
        public final ByteString encodeString(String encode, Charset charset) {
            Intrinsics.checkNotNullParameter(encode, "$this$encode");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @JvmStatic
        public final ByteString read(InputStream readByteString, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(readByteString, "$this$readByteString");
            int i3 = 0;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
            }
            byte[] bArr = new byte[i2];
            while (i3 < i2) {
                int read = readByteString.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    throw new EOFException();
                }
                i3 += read;
            }
            return new ByteString(bArr);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        /* renamed from: -deprecated_decodeBase64  reason: not valid java name */
        public final ByteString m1633deprecated_decodeBase64(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return decodeBase64(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        /* renamed from: -deprecated_decodeHex  reason: not valid java name */
        public final ByteString m1634deprecated_decodeHex(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return decodeHex(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        /* renamed from: -deprecated_encodeString  reason: not valid java name */
        public final ByteString m1635deprecated_encodeString(String string, Charset charset) {
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            return encodeString(string, charset);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        /* renamed from: -deprecated_encodeUtf8  reason: not valid java name */
        public final ByteString m1636deprecated_encodeUtf8(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return encodeUtf8(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m1637deprecated_of(ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return of(buffer);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m1638deprecated_of(byte[] array, int i2, int i3) {
            Intrinsics.checkNotNullParameter(array, "array");
            return of(array, i2, i3);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        /* renamed from: -deprecated_read  reason: not valid java name */
        public final ByteString m1639deprecated_read(InputStream inputstream, int i2) {
            Intrinsics.checkNotNullParameter(inputstream, "inputstream");
            return read(inputstream, i2);
        }

        @JvmStatic
        public final ByteString of(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        @JvmStatic
        public final ByteString of(byte[] toByteString, int i2, int i3) {
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            Util.checkOffsetAndCount(toByteString.length, i2, i3);
            return new ByteString(ArraysKt.copyOfRange(toByteString, i2, i3 + i2));
        }

        @JvmStatic
        public final ByteString encodeUtf8(String encodeUtf8) {
            Intrinsics.checkNotNullParameter(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(encodeUtf8));
            byteString.setUtf8$okio(encodeUtf8);
            return byteString;
        }

        @JvmStatic
        public final ByteString decodeBase64(String decodeBase64) {
            Intrinsics.checkNotNullParameter(decodeBase64, "$this$decodeBase64");
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(decodeBase64);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @JvmStatic
        public final ByteString decodeHex(String decodeHex) {
            Intrinsics.checkNotNullParameter(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((ByteStringKt.access$decodeHexDigit(decodeHex.charAt(i3)) << 4) + ByteStringKt.access$decodeHexDigit(decodeHex.charAt(i3 + 1)));
            }
            return new ByteString(bArr);
        }
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(internalArray$okio());
            setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public String hex() {
        byte[] data$okio;
        char[] cArr = new char[getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = ByteStringKt.getHEX_DIGIT_CHARS()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = ByteStringKt.getHEX_DIGIT_CHARS()[b2 & 15];
        }
        return new String(cArr);
    }

    public ByteString toAsciiLowercase() {
        byte b2;
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b3 = getData$okio()[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b5 = copyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b2;
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b3 = getData$okio()[i2];
            byte b4 = (byte) 97;
            if (b3 >= b4 && b3 <= (b2 = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b3 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b5 = copyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i3] = (byte) (b5 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString substring(int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i3 <= getData$okio().length) {
            if (i3 - i2 >= 0) {
                return (i2 == 0 && i3 == getData$okio().length) ? this : new ByteString(ArraysKt.copyOfRange(getData$okio(), i2, i3));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    public byte internalGet$okio(int i2) {
        return getData$okio()[i2];
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public boolean rangeEquals(int i2, ByteString other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i3, getData$okio(), i2, i4);
    }

    public boolean rangeEquals(int i2, byte[] other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i2 >= 0 && i2 <= getData$okio().length - i4 && i3 >= 0 && i3 <= other.length - i4 && Util.arrayRangeEquals(getData$okio(), i2, other, i3, i4);
    }

    public final boolean startsWith(ByteString prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(byte[] prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final boolean endsWith(ByteString suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(byte[] suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public int indexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public final int lastIndexOf(ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf(other.internalArray$okio(), i2);
    }

    public int lastIndexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(i2, getData$okio().length - other.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = ByteStringKt.access$codePointIndexToCharIndex(getData$okio(), 64);
        if (access$codePointIndexToCharIndex == -1) {
            if (getData$okio().length <= 64) {
                return "[hex=" + hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (64 <= getData$okio().length) {
                sb.append((64 == getData$okio().length ? this : new ByteString(ArraysKt.copyOfRange(getData$okio(), 0, 64))).hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        String utf8 = utf8();
        Objects.requireNonNull(utf8, "null cannot be cast to non-null type java.lang.String");
        String substring = utf8.substring(0, access$codePointIndexToCharIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (access$codePointIndexToCharIndex < utf8.length()) {
            return "[size=" + getData$okio().length + " text=" + replace$default + "…]";
        }
        return "[text=" + replace$default + ']';
    }
}