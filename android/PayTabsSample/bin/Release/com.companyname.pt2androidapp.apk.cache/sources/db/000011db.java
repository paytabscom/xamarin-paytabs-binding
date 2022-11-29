package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    static {
        Processor safeProcessor;
        if (UnsafeProcessor.isAvailable() && !Android.isOnAndroidDevice()) {
            safeProcessor = new UnsafeProcessor();
        } else {
            safeProcessor = new SafeProcessor();
        }
        processor = safeProcessor;
    }

    public static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    public static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    public static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b2 = bytes[index - 1];
        int i2 = limit - index;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return incompleteStateFor(b2, bytes[index], bytes[index + 1]);
                }
                throw new AssertionError();
            }
            return incompleteStateFor(b2, bytes[index]);
        }
        return incompleteStateFor(b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining != 0) {
            if (remaining != 1) {
                if (remaining == 2) {
                    return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
                }
                throw new AssertionError();
            }
            return incompleteStateFor(byte1, buffer.get(index));
        }
        return incompleteStateFor(byte1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(CharSequence sequence) {
        int length = sequence.length();
        int i2 = 0;
        while (i2 < length && sequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = sequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += encodedLengthGeneral(sequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int length = sequence.length();
        int i2 = 0;
        while (start < length) {
            char charAt = sequence.charAt(start);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(sequence, start) < 65536) {
                        throw new UnpairedSurrogateException(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encode(CharSequence in, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in, out, offset, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialIsValidUtf8(int state, ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encodeUtf8(CharSequence in, ByteBuffer out) {
        processor.encodeUtf8(in, out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i2 = limit - 7;
        int i3 = index;
        while (i3 < i2 && (buffer.getLong(i3) & ASCII_MASK_LONG) == 0) {
            i3 += 8;
        }
        return i3 - index;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class Processor {
        abstract String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException;

        abstract String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence in, byte[] out, int offset, int length);

        abstract void encodeUtf8Direct(CharSequence in, ByteBuffer out);

        abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

        abstract int partialIsValidUtf8Direct(final int state, final ByteBuffer buffer, int index, final int limit);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        final boolean isValidUtf8(ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        final int partialIsValidUtf8(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (buffer.hasArray()) {
                int arrayOffset = buffer.arrayOffset();
                return partialIsValidUtf8(state, buffer.array(), index + arrayOffset, arrayOffset + limit);
            } else if (buffer.isDirect()) {
                return partialIsValidUtf8Direct(state, buffer, index, limit);
            } else {
                return partialIsValidUtf8Default(state, buffer, index, limit);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
            if (r8.get(r9) > (-65)) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int partialIsValidUtf8Default(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int estimateConsecutiveAscii = index + Utf8.estimateConsecutiveAscii(buffer, index, limit);
            while (estimateConsecutiveAscii < limit) {
                int i2 = estimateConsecutiveAscii + 1;
                byte b2 = buffer.get(estimateConsecutiveAscii);
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i2 >= limit) {
                            return b2;
                        }
                        if (b2 < -62 || buffer.get(i2) > -65) {
                            return -1;
                        }
                        i2++;
                    } else if (b2 >= -16) {
                        if (i2 >= limit - 2) {
                            return Utf8.incompleteStateFor(buffer, b2, i2, limit - i2);
                        }
                        int i3 = i2 + 1;
                        byte b3 = buffer.get(i2);
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i4 = i3 + 1;
                            if (buffer.get(i3) <= -65) {
                                i2 = i4 + 1;
                                if (buffer.get(i4) > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i2 >= limit - 1) {
                        return Utf8.incompleteStateFor(buffer, b2, i2, limit - i2);
                    } else {
                        int i5 = i2 + 1;
                        byte b4 = buffer.get(i2);
                        if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || buffer.get(i5) > -65))) {
                            return -1;
                        }
                        estimateConsecutiveAscii = i5 + 1;
                    }
                }
                estimateConsecutiveAscii = i2;
            }
            return 0;
        }

        final String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            } else if (buffer.isDirect()) {
                return decodeUtf8Direct(buffer, index, size);
            } else {
                return decodeUtf8Default(buffer, index, size);
            }
        }

        final String decodeUtf8Default(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i2 = index + size;
            char[] cArr = new char[size];
            int i3 = 0;
            while (index < i2) {
                byte b2 = buffer.get(index);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (index < i2) {
                int i5 = index + 1;
                byte b3 = buffer.get(index);
                if (DecodeUtil.isOneByte(b3)) {
                    int i6 = i4 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i4);
                    while (i5 < i2) {
                        byte b4 = buffer.get(i5);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i5++;
                        DecodeUtil.handleOneByte(b4, cArr, i6);
                        i6++;
                    }
                    index = i5;
                    i4 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i5 >= i2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleTwoBytes(b3, buffer.get(i5), cArr, i4);
                    index = i5 + 1;
                    i4++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i5 >= i2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i7 = i5 + 1;
                    DecodeUtil.handleThreeBytes(b3, buffer.get(i5), buffer.get(i7), cArr, i4);
                    index = i7 + 1;
                    i4++;
                } else if (i5 >= i2 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                } else {
                    int i8 = i5 + 1;
                    byte b5 = buffer.get(i5);
                    int i9 = i8 + 1;
                    DecodeUtil.handleFourBytes(b3, b5, buffer.get(i8), buffer.get(i9), cArr, i4);
                    index = i9 + 1;
                    i4 = i4 + 1 + 1;
                }
            }
            return new String(cArr, 0, i4);
        }

        final void encodeUtf8(CharSequence in, ByteBuffer out) {
            if (out.hasArray()) {
                int arrayOffset = out.arrayOffset();
                out.position(Utf8.encode(in, out.array(), out.position() + arrayOffset, out.remaining()) - arrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in, out);
            } else {
                encodeUtf8Default(in, out);
            }
        }

        final void encodeUtf8Default(CharSequence in, ByteBuffer out) {
            int length = in.length();
            int position = out.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char charAt = in.charAt(i2);
                    if (charAt >= 128) {
                        break;
                    }
                    out.put(position + i2, (byte) charAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i2) + " at index " + (out.position() + Math.max(i2, (position - out.position()) + 1)));
                }
            }
            if (i2 == length) {
                out.position(position + i2);
                return;
            }
            position += i2;
            while (i2 < length) {
                char charAt2 = in.charAt(i2);
                if (charAt2 < 128) {
                    out.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i3 = position + 1;
                    try {
                        out.put(position, (byte) ((charAt2 >>> 6) | 192));
                        out.put(i3, (byte) ((charAt2 & '?') | 128));
                        position = i3;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i3;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i2) + " at index " + (out.position() + Math.max(i2, (position - out.position()) + 1)));
                    }
                } else if (charAt2 < 55296 || 57343 < charAt2) {
                    int i4 = position + 1;
                    out.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position = i4 + 1;
                    out.put(i4, (byte) (((charAt2 >>> 6) & 63) | 128));
                    out.put(position, (byte) ((charAt2 & '?') | 128));
                } else {
                    int i5 = i2 + 1;
                    if (i5 != length) {
                        try {
                            char charAt3 = in.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i6 = position + 1;
                                try {
                                    out.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i7 = i6 + 1;
                                    out.put(i6, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i8 = i7 + 1;
                                    out.put(i7, (byte) (((codePoint >>> 6) & 63) | 128));
                                    out.put(i8, (byte) ((codePoint & 63) | 128));
                                    position = i8;
                                    i2 = i5;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i6;
                                    i2 = i5;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i2) + " at index " + (out.position() + Math.max(i2, (position - out.position()) + 1)));
                                }
                            } else {
                                i2 = i5;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new UnpairedSurrogateException(i2, length);
                }
                i2++;
                position++;
            }
            out.position(position);
        }
    }

    /* loaded from: classes.dex */
    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int state, ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i2 = index + size;
            char[] cArr = new char[size];
            int i3 = 0;
            while (index < i2) {
                byte b2 = bytes[index];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (index < i2) {
                int i5 = index + 1;
                byte b3 = bytes[index];
                if (DecodeUtil.isOneByte(b3)) {
                    int i6 = i4 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i4);
                    while (i5 < i2) {
                        byte b4 = bytes[i5];
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i5++;
                        DecodeUtil.handleOneByte(b4, cArr, i6);
                        i6++;
                    }
                    index = i5;
                    i4 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i5 >= i2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleTwoBytes(b3, bytes[i5], cArr, i4);
                    index = i5 + 1;
                    i4++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i5 >= i2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i7 = i5 + 1;
                    DecodeUtil.handleThreeBytes(b3, bytes[i5], bytes[i7], cArr, i4);
                    index = i7 + 1;
                    i4++;
                } else if (i5 >= i2 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                } else {
                    int i8 = i5 + 1;
                    byte b5 = bytes[i5];
                    int i9 = i8 + 1;
                    DecodeUtil.handleFourBytes(b3, b5, bytes[i8], bytes[i9], cArr, i4);
                    index = i9 + 1;
                    i4 = i4 + 1 + 1;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.SafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            encodeUtf8Default(in, out);
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i2 = index + 1;
                byte b2 = bytes[index];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i2 >= limit) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            index = i2 + 1;
                            if (bytes[i2] > -65) {
                            }
                        }
                        return -1;
                    } else if (b2 >= -16) {
                        if (i2 >= limit - 2) {
                            return Utf8.incompleteStateFor(bytes, i2, limit);
                        }
                        int i3 = i2 + 1;
                        byte b3 = bytes[i2];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i4 = i3 + 1;
                            if (bytes[i3] <= -65) {
                                i2 = i4 + 1;
                                if (bytes[i4] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i2 >= limit - 1) {
                        return Utf8.incompleteStateFor(bytes, i2, limit);
                    } else {
                        int i5 = i2 + 1;
                        byte b4 = bytes[i2];
                        if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                            index = i5 + 1;
                            if (bytes[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                index = i2;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r12, byte[] r13, final int r14, final int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L56;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8Direct(final int r11, java.nio.ByteBuffer r12, final int r13, final int r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i2 = index + size;
            char[] cArr = new char[size];
            int i3 = 0;
            while (index < i2) {
                byte b2 = UnsafeUtil.getByte(bytes, index);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (index < i2) {
                int i5 = index + 1;
                byte b3 = UnsafeUtil.getByte(bytes, index);
                if (DecodeUtil.isOneByte(b3)) {
                    int i6 = i4 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i4);
                    while (i5 < i2) {
                        byte b4 = UnsafeUtil.getByte(bytes, i5);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i5++;
                        DecodeUtil.handleOneByte(b4, cArr, i6);
                        i6++;
                    }
                    index = i5;
                    i4 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i5 >= i2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(bytes, i5), cArr, i4);
                    index = i5 + 1;
                    i4++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i5 >= i2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i7 = i5 + 1;
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(bytes, i5), UnsafeUtil.getByte(bytes, i7), cArr, i4);
                    index = i7 + 1;
                    i4++;
                } else if (i5 >= i2 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                } else {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    DecodeUtil.handleFourBytes(b3, UnsafeUtil.getByte(bytes, i5), UnsafeUtil.getByte(bytes, i8), UnsafeUtil.getByte(bytes, i9), cArr, i4);
                    index = i9 + 1;
                    i4 = i4 + 1 + 1;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long addressOffset = UnsafeUtil.addressOffset(buffer) + index;
            long j2 = size + addressOffset;
            char[] cArr = new char[size];
            int i2 = 0;
            while (addressOffset < j2) {
                byte b2 = UnsafeUtil.getByte(addressOffset);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                addressOffset++;
                DecodeUtil.handleOneByte(b2, cArr, i2);
                i2++;
            }
            while (true) {
                int i3 = i2;
                while (addressOffset < j2) {
                    long j3 = addressOffset + 1;
                    byte b3 = UnsafeUtil.getByte(addressOffset);
                    if (DecodeUtil.isOneByte(b3)) {
                        int i4 = i3 + 1;
                        DecodeUtil.handleOneByte(b3, cArr, i3);
                        while (j3 < j2) {
                            byte b4 = UnsafeUtil.getByte(j3);
                            if (!DecodeUtil.isOneByte(b4)) {
                                break;
                            }
                            j3++;
                            DecodeUtil.handleOneByte(b4, cArr, i4);
                            i4++;
                        }
                        i3 = i4;
                        addressOffset = j3;
                    } else if (DecodeUtil.isTwoBytes(b3)) {
                        if (j3 >= j2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        addressOffset = j3 + 1;
                        DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j3), cArr, i3);
                        i3++;
                    } else if (DecodeUtil.isThreeBytes(b3)) {
                        if (j3 >= j2 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j4 = j3 + 1;
                        DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(j4), cArr, i3);
                        i3++;
                        addressOffset = j4 + 1;
                    } else if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        long j5 = j3 + 1;
                        byte b5 = UnsafeUtil.getByte(j3);
                        long j6 = j5 + 1;
                        byte b6 = UnsafeUtil.getByte(j5);
                        addressOffset = j6 + 1;
                        DecodeUtil.handleFourBytes(b3, b5, b6, UnsafeUtil.getByte(j6), cArr, i3);
                        i2 = i3 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(final CharSequence in, final byte[] out, final int offset, final int length) {
            char c2;
            long j2;
            long j3;
            long j4;
            char c3;
            int i2;
            char charAt;
            long j5 = offset;
            long j6 = length + j5;
            int length2 = in.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i3 = 0;
            while (true) {
                c2 = 128;
                j2 = 1;
                if (i3 >= length2 || (charAt = in.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(out, j5, (byte) charAt);
                i3++;
                j5 = 1 + j5;
            }
            if (i3 == length2) {
                return (int) j5;
            }
            while (i3 < length2) {
                char charAt2 = in.charAt(i3);
                if (charAt2 < c2 && j5 < j6) {
                    long j7 = j5 + j2;
                    UnsafeUtil.putByte(out, j5, (byte) charAt2);
                    j4 = j2;
                    j3 = j7;
                    c3 = c2;
                } else if (charAt2 < 2048 && j5 <= j6 - 2) {
                    long j8 = j5 + j2;
                    UnsafeUtil.putByte(out, j5, (byte) ((charAt2 >>> 6) | 960));
                    long j9 = j8 + j2;
                    UnsafeUtil.putByte(out, j8, (byte) ((charAt2 & '?') | 128));
                    long j10 = j2;
                    c3 = 128;
                    j3 = j9;
                    j4 = j10;
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j5 > j6 - 3) {
                    if (j5 <= j6 - 4) {
                        int i4 = i3 + 1;
                        if (i4 != length2) {
                            char charAt3 = in.charAt(i4);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j11 = j5 + 1;
                                UnsafeUtil.putByte(out, j5, (byte) ((codePoint >>> 18) | 240));
                                long j12 = j11 + 1;
                                c3 = 128;
                                UnsafeUtil.putByte(out, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j13 = j12 + 1;
                                UnsafeUtil.putByte(out, j12, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j13 + 1;
                                UnsafeUtil.putByte(out, j13, (byte) ((codePoint & 63) | 128));
                                i3 = i4;
                            } else {
                                i3 = i4;
                            }
                        }
                        throw new UnpairedSurrogateException(i3 - 1, length2);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i2 = i3 + 1) == length2 || !Character.isSurrogatePair(charAt2, in.charAt(i2)))) {
                        throw new UnpairedSurrogateException(i3, length2);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j5);
                    }
                } else {
                    long j14 = j5 + j2;
                    UnsafeUtil.putByte(out, j5, (byte) ((charAt2 >>> '\f') | 480));
                    long j15 = j14 + j2;
                    UnsafeUtil.putByte(out, j14, (byte) (((charAt2 >>> 6) & 63) | 128));
                    UnsafeUtil.putByte(out, j15, (byte) ((charAt2 & '?') | 128));
                    j3 = j15 + 1;
                    j4 = 1;
                    c3 = 128;
                }
                i3++;
                c2 = c3;
                long j16 = j4;
                j5 = j3;
                j2 = j16;
            }
            return (int) j5;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            char c2;
            long j2;
            int i2;
            int i3;
            long j3;
            char c3;
            char charAt;
            long addressOffset = UnsafeUtil.addressOffset(out);
            long position = out.position() + addressOffset;
            long limit = out.limit() + addressOffset;
            int length = in.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i4 = 0;
            while (true) {
                c2 = 128;
                if (i4 >= length || (charAt = in.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(position, (byte) charAt);
                i4++;
                position++;
            }
            if (i4 == length) {
                out.position((int) (position - addressOffset));
                return;
            }
            while (i4 < length) {
                char charAt2 = in.charAt(i4);
                if (charAt2 >= c2 || position >= limit) {
                    if (charAt2 >= 2048 || position > limit - 2) {
                        j2 = addressOffset;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            if (position <= limit - 4) {
                                i3 = i4 + 1;
                                if (i3 != length) {
                                    char charAt3 = in.charAt(i3);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j3 = limit;
                                        long j4 = position + 1;
                                        UnsafeUtil.putByte(position, (byte) ((codePoint >>> 18) | 240));
                                        long j5 = j4 + 1;
                                        c3 = 128;
                                        UnsafeUtil.putByte(j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = j5 + 1;
                                        UnsafeUtil.putByte(j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        UnsafeUtil.putByte(j6, (byte) ((codePoint & 63) | 128));
                                        position = j6 + 1;
                                    } else {
                                        i4 = i3;
                                    }
                                }
                                throw new UnpairedSurrogateException(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i2 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, in.charAt(i2)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                        }
                        long j7 = position + 1;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j8 = j7 + 1;
                        UnsafeUtil.putByte(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                        UnsafeUtil.putByte(j8, (byte) ((charAt2 & '?') | 128));
                        position = j8 + 1;
                    } else {
                        j2 = addressOffset;
                        long j9 = position + 1;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                        UnsafeUtil.putByte(j9, (byte) ((charAt2 & '?') | 128));
                        position = j9 + 1;
                    }
                    j3 = limit;
                    i3 = i4;
                    c3 = 128;
                } else {
                    UnsafeUtil.putByte(position, (byte) charAt2);
                    j3 = limit;
                    i3 = i4;
                    c3 = c2;
                    position++;
                    j2 = addressOffset;
                }
                c2 = c3;
                addressOffset = j2;
                limit = j3;
                i4 = i3 + 1;
            }
            out.position((int) (position - addressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i2 = 0;
            if (maxChars < 16) {
                return 0;
            }
            while (i2 < maxChars) {
                long j2 = 1 + offset;
                if (UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i2;
                }
                i2++;
                offset = j2;
            }
            return maxChars;
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i2 = 8 - (((int) address) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + address;
                if (UnsafeUtil.getByte(address) < 0) {
                    return i2 - i3;
                }
                i3--;
                address = j2;
            }
            int i4 = maxChars - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(address) & Utf8.ASCII_MASK_LONG) == 0) {
                address += 8;
                i4 -= 8;
            }
            return maxChars - i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(final byte[] r8, long r9, int r11) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r8, int r10) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = unsafeIncompleteStateFor(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining != 0) {
                if (remaining != 1) {
                    if (remaining == 2) {
                        return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset), UnsafeUtil.getByte(bytes, offset + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset));
            }
            return Utf8.incompleteStateFor(byte1);
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining != 0) {
                if (remaining != 1) {
                    if (remaining == 2) {
                        return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address), UnsafeUtil.getByte(address + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address));
            }
            return Utf8.incompleteStateFor(byte1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DecodeUtil {
        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & okio.Utf8.REPLACEMENT_BYTE;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 15) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || (((byte1 << 28) + (byte2 + 112)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(trailingByteValue);
            resultArr[resultPos + 1] = lowSurrogate(trailingByteValue);
        }
    }

    private Utf8() {
    }
}