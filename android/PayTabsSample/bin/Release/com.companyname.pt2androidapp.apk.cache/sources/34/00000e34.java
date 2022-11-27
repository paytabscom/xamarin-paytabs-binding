package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class Drawable2d {
    private static final FloatBuffer RECTANGLE_BUF;
    private static final float[] RECTANGLE_COORDS;
    private static final FloatBuffer RECTANGLE_TEX_BUF;
    private static final float[] RECTANGLE_TEX_COORDS;
    private static final int SIZEOF_FLOAT = 4;
    private FloatBuffer mVertexArray = RECTANGLE_BUF;
    private FloatBuffer mTexCoordArray = RECTANGLE_TEX_BUF;
    private int mCoordsPerVertex = 2;
    private int mVertexStride = 2 * 4;
    private int mVertexCount = RECTANGLE_COORDS.length / 2;
    private int mTexCoordStride = 8;

    public String toString() {
        return "[Drawable2d: Rectangle]";
    }

    static {
        float[] fArr = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        RECTANGLE_COORDS = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        RECTANGLE_TEX_COORDS = fArr2;
        RECTANGLE_BUF = GlUtil.createFloatBuffer(fArr);
        RECTANGLE_TEX_BUF = GlUtil.createFloatBuffer(fArr2);
    }

    public FloatBuffer getVertexArray() {
        return this.mVertexArray;
    }

    public FloatBuffer getTexCoordArray() {
        return this.mTexCoordArray;
    }

    public int getVertexCount() {
        return this.mVertexCount;
    }

    public int getVertexStride() {
        return this.mVertexStride;
    }

    public int getTexCoordStride() {
        return this.mTexCoordStride;
    }

    public int getCoordsPerVertex() {
        return this.mCoordsPerVertex;
    }
}