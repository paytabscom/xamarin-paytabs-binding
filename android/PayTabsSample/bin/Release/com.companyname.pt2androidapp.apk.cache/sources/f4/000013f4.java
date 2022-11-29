package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import android.opengl.GLES20;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class Texture2dProgram {
    private static final boolean DBG = Constants.DEBUG;
    private static final String FRAGMENT_SHADER_EXT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    public static final int KERNEL_SIZE = 9;
    private static final String TAG = "gles";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    private float mColorAdjust;
    private float[] mTexOffset;
    private int maPositionLoc;
    private int maTextureCoordLoc;
    private int muColorAdjustLoc;
    private int muKernelLoc;
    private int muMVPMatrixLoc;
    private int muTexMatrixLoc;
    private int muTexOffsetLoc;
    private float[] mKernel = new float[9];
    private int mTextureTarget = 36197;
    private int mProgramHandle = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT);

    public Texture2dProgram() {
        if (DBG) {
            Log.d("gles", "Created program " + this.mProgramHandle + " (TEXTURE_EXT)");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
        this.maPositionLoc = glGetAttribLocation;
        GlUtil.checkLocation(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
        this.maTextureCoordLoc = glGetAttribLocation2;
        GlUtil.checkLocation(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        this.muMVPMatrixLoc = glGetUniformLocation;
        GlUtil.checkLocation(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
        this.muTexMatrixLoc = glGetUniformLocation2;
        GlUtil.checkLocation(glGetUniformLocation2, "uTexMatrix");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "uKernel");
        this.muKernelLoc = glGetUniformLocation3;
        if (glGetUniformLocation3 < 0) {
            this.muKernelLoc = -1;
            this.muTexOffsetLoc = -1;
            this.muColorAdjustLoc = -1;
            return;
        }
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexOffset");
        this.muTexOffsetLoc = glGetUniformLocation4;
        GlUtil.checkLocation(glGetUniformLocation4, "uTexOffset");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.mProgramHandle, "uColorAdjust");
        this.muColorAdjustLoc = glGetUniformLocation5;
        GlUtil.checkLocation(glGetUniformLocation5, "uColorAdjust");
        setKernel(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0.0f);
        setTexSize(256, 256);
    }

    public void release() {
        if (DBG) {
            Log.d("gles", "deleting program " + this.mProgramHandle);
        }
        GLES20.glDeleteProgram(this.mProgramHandle);
        this.mProgramHandle = -1;
    }

    public int createTextureObject() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.checkGlError("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(this.mTextureTarget, i2);
        GlUtil.checkGlError("glBindTexture " + i2);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GlUtil.checkGlError("glTexParameter");
        return i2;
    }

    private void setKernel(float[] fArr, float f2) {
        if (fArr.length != 9) {
            throw new IllegalArgumentException("Kernel size is " + fArr.length + " vs. 9");
        }
        System.arraycopy(fArr, 0, this.mKernel, 0, 9);
        this.mColorAdjust = f2;
    }

    public void setTexSize(int i2, int i3) {
        float f2 = 1.0f / i2;
        float f3 = 1.0f / i3;
        float f4 = -f2;
        float f5 = -f3;
        this.mTexOffset = new float[]{f4, f5, 0.0f, f5, f2, f5, f4, 0.0f, 0.0f, 0.0f, f2, 0.0f, f4, f3, 0.0f, f3, f2, f3};
    }

    public void draw(float[] fArr, FloatBuffer floatBuffer, int i2, int i3, int i4, int i5, float[] fArr2, FloatBuffer floatBuffer2, int i6, int i7) {
        GlUtil.checkGlError("draw start");
        GLES20.glUseProgram(this.mProgramHandle);
        GlUtil.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.mTextureTarget, i6);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr2, 0);
        GlUtil.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, i4, 5126, false, i5, (Buffer) floatBuffer);
        GlUtil.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        GlUtil.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, i7, (Buffer) floatBuffer2);
        GlUtil.checkGlError("glVertexAttribPointer");
        int i8 = this.muKernelLoc;
        if (i8 >= 0) {
            GLES20.glUniform1fv(i8, 9, this.mKernel, 0);
            GLES20.glUniform2fv(this.muTexOffsetLoc, 9, this.mTexOffset, 0);
            GLES20.glUniform1f(this.muColorAdjustLoc, this.mColorAdjust);
        }
        GLES20.glDrawArrays(5, i2, i3);
        GlUtil.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(this.mTextureTarget, 0);
        GLES20.glUseProgram(0);
    }
}