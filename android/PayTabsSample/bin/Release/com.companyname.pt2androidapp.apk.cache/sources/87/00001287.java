package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes.dex */
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf prfStreamer) {
        this.prfStreamer = prfStreamer;
    }

    public static PrfImpl wrap(StreamingPrf prfStreamer) {
        return new PrfImpl(prfStreamer);
    }

    private static byte[] readBytesFromStream(InputStream stream, int outputLength) throws GeneralSecurityException {
        try {
            byte[] bArr = new byte[outputLength];
            int i2 = 0;
            while (i2 < outputLength) {
                int read = stream.read(bArr, i2, outputLength - i2);
                if (read <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i2 += read;
            }
            return bArr;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException {
        if (input != null) {
            if (outputLength <= 0) {
                throw new GeneralSecurityException("Invalid outputLength specified.");
            }
            return readBytesFromStream(this.prfStreamer.computePrf(input), outputLength);
        }
        throw new GeneralSecurityException("Invalid input provided.");
    }
}