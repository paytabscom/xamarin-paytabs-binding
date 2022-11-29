package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IterableByteBufferInputStream(Iterable<ByteBuffer> data) {
        this.iterator = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (this.iterator.hasNext()) {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.currentByteBufferPos = next.position();
            if (this.currentByteBuffer.hasArray()) {
                this.hasArray = true;
                this.currentArray = this.currentByteBuffer.array();
                this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
            } else {
                this.hasArray = false;
                this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
                this.currentArray = null;
            }
            return true;
        }
        return false;
    }

    private void updateCurrentByteBufferPos(int numberOfBytesRead) {
        int i2 = this.currentByteBufferPos + numberOfBytesRead;
        this.currentByteBufferPos = i2;
        if (i2 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i2 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & UByte.MAX_VALUE;
            updateCurrentByteBufferPos(1);
            return i2;
        }
        int i3 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & UByte.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return i3;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i2 = this.currentByteBufferPos;
        int i3 = limit - i2;
        if (length > i3) {
            length = i3;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i2 + this.currentArrayOffset, output, offset, length);
            updateCurrentByteBufferPos(length);
        } else {
            int position = this.currentByteBuffer.position();
            this.currentByteBuffer.position(this.currentByteBufferPos);
            this.currentByteBuffer.get(output, offset, length);
            this.currentByteBuffer.position(position);
            updateCurrentByteBufferPos(length);
        }
        return length;
    }
}