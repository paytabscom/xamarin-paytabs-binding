package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Console.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ConsoleKt {
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    private static final void print(int i2) {
        System.out.print(i2);
    }

    private static final void print(long j2) {
        System.out.print(j2);
    }

    private static final void print(byte b2) {
        System.out.print(Byte.valueOf(b2));
    }

    private static final void print(short s2) {
        System.out.print(Short.valueOf(s2));
    }

    private static final void print(char c2) {
        System.out.print(c2);
    }

    private static final void print(boolean z2) {
        System.out.print(z2);
    }

    private static final void print(float f2) {
        System.out.print(f2);
    }

    private static final void print(double d2) {
        System.out.print(d2);
    }

    private static final void print(char[] cArr) {
        System.out.print(cArr);
    }

    private static final void println(Object obj) {
        System.out.println(obj);
    }

    private static final void println(int i2) {
        System.out.println(i2);
    }

    private static final void println(long j2) {
        System.out.println(j2);
    }

    private static final void println(byte b2) {
        System.out.println(Byte.valueOf(b2));
    }

    private static final void println(short s2) {
        System.out.println(Short.valueOf(s2));
    }

    private static final void println(char c2) {
        System.out.println(c2);
    }

    private static final void println(boolean z2) {
        System.out.println(z2);
    }

    private static final void println(float f2) {
        System.out.println(f2);
    }

    private static final void println(double d2) {
        System.out.println(d2);
    }

    private static final void println(char[] cArr) {
        System.out.println(cArr);
    }

    private static final void println() {
        System.out.println();
    }

    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream inputStream = System.in;
        Intrinsics.checkNotNullExpressionValue(inputStream, "System.`in`");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "Charset.defaultCharset()");
        return lineReader.readLine(inputStream, defaultCharset);
    }
}