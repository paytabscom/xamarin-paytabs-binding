package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.gles;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class GlUtil {
    public static final boolean DBG = Constants.DEBUG;
    public static final float[] IDENTITY_MATRIX;
    private static final int SIZEOF_FLOAT = 4;
    public static final String TAG = "gles";

    static {
        float[] fArr = new float[16];
        IDENTITY_MATRIX = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    private GlUtil() {
    }

    public static int createProgram(String str, String str2) {
        int loadShader;
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (glCreateProgram == 0 && DBG) {
            Log.e(TAG, "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            boolean z2 = DBG;
            if (z2) {
                Log.e(TAG, "Could not link program: ");
            }
            if (z2) {
                Log.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
            }
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    public static int loadShader(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        checkGlError("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            boolean z2 = DBG;
            if (z2) {
                Log.e(TAG, "Could not compile shader " + i2 + ":");
            }
            if (z2) {
                Log.e(TAG, " " + GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void checkGlError(String str) {
        int glGetError;
        if (GLES20.glGetError() != 0) {
            String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
            if (DBG) {
                Log.e(TAG, str2);
            }
            throw new RuntimeException(str2);
        }
    }

    public static void checkLocation(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void logVersionInfo() {
        boolean z2 = DBG;
        if (z2) {
            Log.i(TAG, "vendor  : " + GLES20.glGetString(7936));
        }
        if (z2) {
            Log.i(TAG, "renderer: " + GLES20.glGetString(7937));
        }
        if (z2) {
            Log.i(TAG, "version : " + GLES20.glGetString(7938));
        }
    }
}