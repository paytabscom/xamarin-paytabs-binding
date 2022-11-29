package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public final class Sprite2d {
    private float mAngle;
    private float[] mColor;
    private Drawable2d mDrawable;
    private boolean mMatrixReady;
    private float[] mModelViewMatrix;
    private float mPosX;
    private float mPosY;
    private float mScaleX;
    private float mScaleY;
    private float[] mScratchMatrix = new float[16];
    private int mTextureId;

    public Sprite2d(Drawable2d drawable2d) {
        this.mDrawable = drawable2d;
        float[] fArr = new float[4];
        this.mColor = fArr;
        fArr[3] = 1.0f;
        this.mTextureId = -1;
        this.mModelViewMatrix = new float[16];
        this.mMatrixReady = false;
    }

    private void recomputeMatrix() {
        float[] fArr = this.mModelViewMatrix;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.mPosX, this.mPosY, 0.0f);
        float f2 = this.mAngle;
        if (f2 != 0.0f) {
            Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        }
        Matrix.scaleM(fArr, 0, this.mScaleX, this.mScaleY, 1.0f);
        this.mMatrixReady = true;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public void setScale(float f2, float f3) {
        this.mScaleX = f2;
        this.mScaleY = f3;
        this.mMatrixReady = false;
    }

    public float getRotation() {
        return this.mAngle;
    }

    public void setRotation(float f2) {
        while (f2 >= 360.0f) {
            f2 -= 360.0f;
        }
        while (f2 <= -360.0f) {
            f2 += 360.0f;
        }
        this.mAngle = f2;
        this.mMatrixReady = false;
    }

    public float getPositionX() {
        return this.mPosX;
    }

    public float getPositionY() {
        return this.mPosY;
    }

    public void setPosition(float f2, float f3) {
        this.mPosX = f2;
        this.mPosY = f3;
        this.mMatrixReady = false;
    }

    public float[] getModelViewMatrix() {
        if (!this.mMatrixReady) {
            recomputeMatrix();
        }
        return this.mModelViewMatrix;
    }

    public void setColor(float f2, float f3, float f4) {
        float[] fArr = this.mColor;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
    }

    public void setTexture(int i2) {
        this.mTextureId = i2;
    }

    public float[] getColor() {
        return this.mColor;
    }

    public void draw(Texture2dProgram texture2dProgram, float[] fArr) {
        Matrix.multiplyMM(this.mScratchMatrix, 0, fArr, 0, getModelViewMatrix(), 0);
        texture2dProgram.draw(this.mScratchMatrix, this.mDrawable.getVertexArray(), 0, this.mDrawable.getVertexCount(), this.mDrawable.getCoordsPerVertex(), this.mDrawable.getVertexStride(), GlUtil.IDENTITY_MATRIX, this.mDrawable.getTexCoordArray(), this.mTextureId, this.mDrawable.getTexCoordStride());
    }

    public String toString() {
        return "[Sprite2d pos=" + this.mPosX + "," + this.mPosY + " scale=" + this.mScaleX + "," + this.mScaleY + " angle=" + this.mAngle + " color={" + this.mColor[0] + "," + this.mColor[1] + "," + this.mColor[2] + "} drawable=" + this.mDrawable + "]";
    }
}