package com.google.crypto.tink.subtle;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StreamingAeadEncryptingStream extends FilterOutputStream {
    ByteBuffer ctBuffer;
    private StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(NonceBasedStreamingAead streamAead, OutputStream ciphertextChannel, byte[] associatedData) throws GeneralSecurityException, IOException {
        super(ciphertextChannel);
        this.encrypter = streamAead.newStreamSegmentEncrypter(associatedData);
        int plaintextSegmentSize = streamAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.ptBuffer = ByteBuffer.allocate(plaintextSegmentSize);
        this.ctBuffer = ByteBuffer.allocate(streamAead.getCiphertextSegmentSize());
        this.ptBuffer.limit(this.plaintextSegmentSize - streamAead.getCiphertextOffset());
        ByteBuffer header = this.encrypter.getHeader();
        byte[] bArr = new byte[header.remaining()];
        header.get(bArr);
        this.out.write(bArr);
        this.open = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b2) throws IOException {
        write(new byte[]{(byte) b2});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b2) throws IOException {
        write(b2, 0, b2.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] pt, int offset, int length) throws IOException {
        if (!this.open) {
            throw new IOException("Trying to write to closed stream");
        }
        while (length > this.ptBuffer.remaining()) {
            int remaining = this.ptBuffer.remaining();
            ByteBuffer wrap = ByteBuffer.wrap(pt, offset, remaining);
            offset += remaining;
            length -= remaining;
            try {
                this.ptBuffer.flip();
                this.ctBuffer.clear();
                this.encrypter.encryptSegment(this.ptBuffer, wrap, false, this.ctBuffer);
                this.ctBuffer.flip();
                this.out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                this.ptBuffer.clear();
                this.ptBuffer.limit(this.plaintextSegmentSize);
            } catch (GeneralSecurityException e2) {
                throw new IOException(e2);
            }
        }
        this.ptBuffer.put(pt, offset, length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.open) {
            try {
                this.ptBuffer.flip();
                this.ctBuffer.clear();
                this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);
                this.ctBuffer.flip();
                this.out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                this.open = false;
                super.close();
            } catch (GeneralSecurityException e2) {
                throw new IOException("ptBuffer.remaining():" + this.ptBuffer.remaining() + " ctBuffer.remaining():" + this.ctBuffer.remaining(), e2);
            }
        }
    }
}