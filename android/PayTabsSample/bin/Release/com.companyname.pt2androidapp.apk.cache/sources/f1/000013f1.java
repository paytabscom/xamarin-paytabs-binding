package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class EglCore {
    private static final boolean DBG = GlUtil.DBG;
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    private static final String TAG = "gles";
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private EGL10 mEgl;
    private int mGlVersion;

    public EglCore() {
        this(null, 0);
    }

    public EglCore(EGLContext eGLContext, int i2) throws RuntimeException {
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
        this.mGlVersion = -1;
        if (this.mEGLDisplay != EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("EGL already set up");
        }
        if (eGLContext == null) {
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEgl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEGLDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        if (!this.mEgl.eglInitialize(this.mEGLDisplay, new int[2])) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig config = getConfig(i2);
        if (config == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        EGLContext eglCreateContext = this.mEgl.eglCreateContext(this.mEGLDisplay, config, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        checkEglError("eglCreateContext");
        this.mEGLConfig = config;
        this.mEGLContext = eglCreateContext;
        this.mGlVersion = 2;
        int[] iArr = new int[1];
        this.mEgl.eglQueryContext(this.mEGLDisplay, eglCreateContext, EGL_CONTEXT_CLIENT_VERSION, iArr);
        if (DBG) {
            Log.d("gles", "EGLContext created, client version " + iArr[0]);
        }
    }

    private EGLConfig getConfig(int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
        if ((i2 & 1) != 0) {
            iArr[10] = EGL_RECORDABLE_ANDROID;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.mEgl.eglChooseConfig(this.mEGLDisplay, iArr, eGLConfigArr, 1, new int[1])) {
            if (DBG) {
                Log.w("gles", "unable to find RGB8888 / 2 EGLConfig");
                return null;
            }
            return null;
        }
        return eGLConfigArr[0];
    }

    public void release() {
        if (this.mEGLDisplay != EGL10.EGL_NO_DISPLAY) {
            this.mEgl.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.mEgl.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            this.mEgl.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.mEGLDisplay != EGL10.EGL_NO_DISPLAY) {
                if (DBG) {
                    Log.w("gles", "WARNING: EglCore was not explicitly released -- state may be leaked");
                }
                release();
            }
        } finally {
            super.finalize();
        }
    }

    public void releaseSurface(EGLSurface eGLSurface) {
        this.mEgl.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public EGLSurface createWindowSurface(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw new RuntimeException("invalid surface: " + obj);
        }
        EGLSurface eglCreateWindowSurface = this.mEgl.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, new int[]{12344});
        checkEglError("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public EGLSurface createOffscreenSurface(int i2, int i3) {
        EGLSurface eglCreatePbufferSurface = this.mEgl.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, i2, 12374, i3, 12344});
        checkEglError("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public void makeCurrent(EGLSurface eGLSurface) {
        if (this.mEGLDisplay == EGL10.EGL_NO_DISPLAY && DBG) {
            Log.d("gles", "NOTE: makeCurrent w/o display");
        }
        if (!this.mEgl.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void makeCurrent(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (this.mEGLDisplay == EGL10.EGL_NO_DISPLAY && DBG) {
            Log.d("gles", "NOTE: makeCurrent w/o display");
        }
        if (!this.mEgl.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface2, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent(draw,read) failed");
        }
    }

    public void makeNothingCurrent() {
        if (!this.mEgl.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public boolean swapBuffers(EGLSurface eGLSurface) {
        return this.mEgl.eglSwapBuffers(this.mEGLDisplay, eGLSurface);
    }

    public boolean isCurrent(EGLSurface eGLSurface) {
        return this.mEGLContext.equals(this.mEgl.eglGetCurrentContext()) && eGLSurface.equals(this.mEgl.eglGetCurrentSurface(12377));
    }

    public int querySurface(EGLSurface eGLSurface, int i2) {
        int[] iArr = new int[1];
        this.mEgl.eglQuerySurface(this.mEGLDisplay, eGLSurface, i2, iArr);
        return iArr[0];
    }

    public String queryString(int i2) {
        return this.mEgl.eglQueryString(this.mEGLDisplay, i2);
    }

    public int getGlVersion() {
        return this.mGlVersion;
    }

    private void checkEglError(String str) {
        int eglGetError = this.mEgl.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }
}