package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class WindowSurface {
    private static final boolean DBG = GlUtil.DBG;
    protected static final String TAG = "gles";
    protected EglCore mEglCore;
    private boolean mReleaseSurface;
    private Surface mSurface;
    private EGLSurface mEGLSurface = null;
    private int mWidth = -1;
    private int mHeight = -1;

    public WindowSurface(EglCore eglCore, SurfaceHolder surfaceHolder, boolean z2) {
        this.mEglCore = eglCore;
        createWindowSurface(surfaceHolder);
        this.mSurface = surfaceHolder.getSurface();
        this.mReleaseSurface = z2;
    }

    public void release() {
        releaseEglSurface();
        Surface surface = this.mSurface;
        if (surface != null) {
            if (this.mReleaseSurface) {
                surface.release();
            }
            this.mSurface = null;
        }
    }

    public void createWindowSurface(Object obj) {
        if (this.mEGLSurface != null) {
            throw new IllegalStateException("surface already created");
        }
        this.mEGLSurface = this.mEglCore.createWindowSurface(obj);
    }

    public int getWidth() {
        int i2 = this.mWidth;
        return i2 < 0 ? this.mEglCore.querySurface(this.mEGLSurface, 12375) : i2;
    }

    public int getHeight() {
        int i2 = this.mHeight;
        return i2 < 0 ? this.mEglCore.querySurface(this.mEGLSurface, 12374) : i2;
    }

    public void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = null;
        this.mHeight = -1;
        this.mWidth = -1;
    }

    public void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public boolean swapBuffers() {
        boolean swapBuffers = this.mEglCore.swapBuffers(this.mEGLSurface);
        if (!swapBuffers) {
            Log.d("gles", "WARNING: swapBuffers() failed");
        }
        return swapBuffers;
    }

    public void saveFrame(File file) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        if (!this.mEglCore.isCurrent(this.mEGLSurface)) {
            throw new RuntimeException("Expected EGL context/surface is not current");
        }
        String file2 = file.toString();
        int width = getWidth();
        int height = getHeight();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(width * height * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, width, height, 6408, 5121, allocateDirect);
        GlUtil.checkGlError("glReadPixels");
        allocateDirect.rewind();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 90, bufferedOutputStream);
            createBitmap.recycle();
            bufferedOutputStream.close();
            if (DBG) {
                Log.d("gles", "Saved " + width + "x" + height + " frame as '" + file2 + "'");
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }
}