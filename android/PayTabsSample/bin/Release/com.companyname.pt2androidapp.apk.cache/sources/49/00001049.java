package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: IOStreams.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ByteStreamsKt {
    public static final ByteIterator iterator(final BufferedInputStream iterator) {
        Intrinsics.checkNotNullParameter(iterator, "$this$iterator");
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt$iterator$1
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            public final int getNextByte() {
                return this.nextByte;
            }

            public final void setNextByte(int i2) {
                this.nextByte = i2;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            public final void setNextPrepared(boolean z2) {
                this.nextPrepared = z2;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final void setFinished(boolean z2) {
                this.finished = z2;
            }

            private final void prepareNext() {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int read = iterator.read();
                this.nextByte = read;
                this.nextPrepared = true;
                this.finished = read == -1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                prepareNext();
                return !this.finished;
            }

            @Override // kotlin.collections.ByteIterator
            public byte nextByte() {
                prepareNext();
                if (this.finished) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                byte b2 = (byte) this.nextByte;
                this.nextPrepared = false;
                return b2;
            }
        };
    }

    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr, int i2, int i3) {
        return new ByteArrayInputStream(bArr, i2, i3);
    }

    private static final BufferedInputStream buffered(InputStream inputStream, int i2) {
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }

    static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }

    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new InputStreamReader(inputStream, charset);
    }

    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    private static final BufferedOutputStream buffered(OutputStream outputStream, int i2) {
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return new OutputStreamWriter(outputStream, charset);
    }

    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return copyTo(inputStream, outputStream, i2);
    }

    public static final long copyTo(InputStream copyTo, OutputStream out, int i2) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i2];
        int read = copyTo.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j2 += read;
            read = copyTo.read(bArr);
        }
        return j2;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        return readBytes(inputStream, i2);
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] readBytes(InputStream readBytes, int i2) {
        Intrinsics.checkNotNullParameter(readBytes, "$this$readBytes");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i2, readBytes.available()));
        copyTo$default(readBytes, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static final byte[] readBytes(InputStream readBytes) {
        Intrinsics.checkNotNullParameter(readBytes, "$this$readBytes");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, readBytes.available()));
        copyTo$default(readBytes, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}