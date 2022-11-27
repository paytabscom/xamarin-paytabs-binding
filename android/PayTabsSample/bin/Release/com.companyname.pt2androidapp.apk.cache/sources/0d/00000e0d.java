package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import java.io.IOException;

/* loaded from: classes.dex */
public final class BlockingOperationException extends IOException {
    public BlockingOperationException() {
    }

    public BlockingOperationException(Throwable th) {
        super(th);
    }

    public BlockingOperationException(String str) {
        super(str);
    }

    public BlockingOperationException(String str, Throwable th) {
        super(str, th);
    }
}