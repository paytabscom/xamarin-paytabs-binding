package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class NeuroDataHelper {
    private static final boolean DBG = BuildConfig.DEBUG;
    private static final String TAG = "RecognitionCore";
    private final AssetManager mAssetManager;
    private final File mDataBasePath;

    public NeuroDataHelper(Context context) {
        this.mAssetManager = context.getApplicationContext().getAssets();
        File cacheDir = context.getCacheDir();
        this.mDataBasePath = new File(cacheDir, "cardrecognizer/model/" + String.valueOf(9));
    }

    public void unpackAssets() throws IOException {
        unpackFileOrDir("");
    }

    private void unpackFileOrDir(String str) throws IOException {
        AssetManager assetManager = this.mAssetManager;
        String[] list = assetManager.list(Constants.MODEL_DIR + str);
        if (list.length == 0) {
            copyAssetToCacheDir(str);
            return;
        }
        File dstPath = getDstPath(str);
        if (!dstPath.exists()) {
            if (DBG) {
                Log.v(TAG, "Create cache dir " + dstPath.getAbsolutePath());
            }
            dstPath.mkdirs();
        }
        for (int i2 = 0; i2 < list.length; i2++) {
            unpackFileOrDir(str + "/" + list[i2]);
        }
    }

    private String copyAssetToCacheDir(String str) throws IOException {
        FileOutputStream fileOutputStream;
        File dstPath = getDstPath(str);
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            InputStream open = this.mAssetManager.open(Constants.MODEL_DIR + str);
            try {
                if (dstPath.length() != open.available()) {
                    if (DBG) {
                        Log.d(TAG, "copyAssetToCacheDir() rewrite file " + str);
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(dstPath, false);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, read);
                        }
                        fileOutputStream2 = fileOutputStream3;
                    } catch (Throwable th) {
                        inputStream = open;
                        fileOutputStream = fileOutputStream3;
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                if (open != null) {
                    try {
                        open.close();
                    } catch (IOException unused3) {
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                return dstPath.getPath();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                inputStream = open;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public File getDataBasePath() {
        return this.mDataBasePath;
    }

    private File getDstPath(String str) {
        return new File(this.mDataBasePath, str);
    }
}