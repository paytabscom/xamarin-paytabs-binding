package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import cards.pay.paycardsrecognizer.sdk.BuildConfig;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.OrientationHelper;

/* loaded from: classes.dex */
class CardRectCoordsMapper {
    private static final int DEFAULT_CAMERA_ROTATION = 90;
    private static final float DEFAULT_CARD_DATE_FONT_SIZE = 27.0f;
    private static final float DEFAULT_CARD_HOLDER_FONT_SIZE = 27.0f;
    private static final float DEFAULT_CARD_NUMBER_FONT_SIZE = 40.0f;
    private static final String TAG = "CardRectCoordsMapper";
    private final int[] mCameraPreviewSize;
    private boolean mCameraRectInitialized;
    private int mCameraRotation;
    private final Rect mCardCameraRect;
    private final Rect mCardCameraRectRaw;
    private final PointF mCardDatePos;
    private final PointF mCardHolderPos;
    private final PointF mCardNumberPos;
    private final Rect mCardRect;
    private float mScale;
    private int mTranslateX;
    private int mTranslateY;
    private int mViewHeight;
    private int mViewWidth;
    private static final int[] DEFAULT_CAMERA_RESOLUTION = {1280, 720};
    private static final Rect DEFAULT_CAMERA_RECT = new Rect(432, 30, 848, 690);
    private static final Rect DEFAULT_CAMERA_RECT_LANDSCAPE = new Rect(310, 152, 970, 568);
    private static final PointF DEFAULT_CARD_NUMBER_POS = new PointF(60.0f, 268.0f);
    private static final PointF DEFAULT_CARD_DATE_POS = new PointF(289.0f, 321.0f);
    private static final PointF DEFAULT_CARD_HOLDER_POS = new PointF(33.0f, 364.0f);
    private static final boolean DBG = BuildConfig.DEBUG;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CardRectCoordsMapper() {
        Rect rect = new Rect();
        this.mCardCameraRectRaw = rect;
        int[] iArr = DEFAULT_CAMERA_RESOLUTION;
        this.mCameraPreviewSize = new int[]{iArr[0], iArr[1]};
        this.mCameraRotation = 90;
        this.mCardRect = new Rect();
        this.mCardCameraRect = new Rect();
        this.mCardNumberPos = new PointF();
        this.mCardDatePos = new PointF();
        this.mCardHolderPos = new PointF();
        this.mViewWidth = 1280;
        this.mViewHeight = 720;
        this.mTranslateX = 0;
        this.mTranslateY = 0;
        this.mScale = 1.0f;
        rect.set(DEFAULT_CAMERA_RECT);
    }

    public Rect getCardRect() {
        return this.mCardRect;
    }

    public PointF getCardNumberPos() {
        return this.mCardNumberPos;
    }

    public float getCardNumberFontSize() {
        return this.mScale * DEFAULT_CARD_NUMBER_FONT_SIZE;
    }

    public PointF getCardDatePos() {
        return this.mCardDatePos;
    }

    public float getCardDateFontSize() {
        return this.mScale * 27.0f;
    }

    public PointF getCardHolderPos() {
        return this.mCardHolderPos;
    }

    public float getCardHolderFontSize() {
        return this.mScale * 27.0f;
    }

    public boolean setViewSize(int i2, int i3) {
        if (i2 == 0 || i3 == 0 || this.mViewWidth == i2 || this.mViewHeight == i3) {
            return false;
        }
        this.mViewWidth = i2;
        this.mViewHeight = i3;
        if (!this.mCameraRectInitialized) {
            refreshCameraDefaults();
        }
        sync();
        return true;
    }

    private void refreshCameraDefaults() {
        if (this.mViewHeight > this.mViewWidth) {
            this.mCameraRotation = 90;
            int[] iArr = this.mCameraPreviewSize;
            int[] iArr2 = DEFAULT_CAMERA_RESOLUTION;
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
            this.mCardCameraRectRaw.set(DEFAULT_CAMERA_RECT);
            return;
        }
        this.mCameraRotation = 0;
        int[] iArr3 = this.mCameraPreviewSize;
        int[] iArr4 = DEFAULT_CAMERA_RESOLUTION;
        iArr3[0] = iArr4[0];
        iArr3[1] = iArr4[1];
        this.mCardCameraRectRaw.set(DEFAULT_CAMERA_RECT_LANDSCAPE);
    }

    public boolean setCameraParameters(int i2, int i3, int i4, Rect rect) {
        int[] iArr = this.mCameraPreviewSize;
        boolean z2 = i2 == iArr[0] && i3 == iArr[1];
        boolean z3 = this.mCameraRotation == i4;
        boolean equals = this.mCardCameraRectRaw.equals(rect);
        if (z2 && z3 && equals && this.mCameraRectInitialized) {
            return false;
        }
        int[] iArr2 = this.mCameraPreviewSize;
        iArr2[0] = i2;
        iArr2[1] = i3;
        this.mCameraRotation = i4;
        this.mCardCameraRectRaw.set(rect);
        this.mCameraRectInitialized = true;
        sync();
        return true;
    }

    private void sync() {
        refreshTransform();
        refreshCardRect();
        refreshCardTextPositions();
    }

    private void refreshTransform() {
        float f2;
        int i2;
        int i3;
        float cameraHeightRotated = getCameraHeightRotated();
        float cameraWidthRotated = getCameraWidthRotated();
        int i4 = this.mViewHeight;
        int i5 = this.mViewWidth;
        if (i4 * cameraWidthRotated > i5 * cameraHeightRotated) {
            f2 = i4 / cameraHeightRotated;
            i3 = (int) ((i5 - (cameraWidthRotated * f2)) / 2.0f);
            i2 = 0;
        } else {
            float f3 = i5 / cameraWidthRotated;
            int i6 = (int) ((i4 - (cameraHeightRotated * f3)) / 2.0f);
            f2 = f3;
            i2 = i6;
            i3 = 0;
        }
        this.mScale = f2;
        this.mTranslateX = i3;
        this.mTranslateY = i2;
        Rect rect = this.mCardCameraRectRaw;
        int[] iArr = this.mCameraPreviewSize;
        OrientationHelper.rotateRect(rect, iArr[0], iArr[1], this.mCameraRotation, this.mCardCameraRect);
        if (DBG) {
            Log.d(TAG, "refreshTransform() widthXheight: " + this.mViewWidth + "x" + this.mViewHeight + "; translateXY: [" + i3 + "," + this.mTranslateY + "], scale: " + this.mScale);
        }
    }

    private void refreshCardRect() {
        this.mCardRect.left = ((int) ((this.mScale * this.mCardCameraRect.left) + 0.5f)) + this.mTranslateX;
        this.mCardRect.top = ((int) ((this.mScale * this.mCardCameraRect.top) + 0.5f)) + this.mTranslateY;
        this.mCardRect.right = ((int) ((this.mScale * this.mCardCameraRect.right) + 0.5f)) + this.mTranslateX;
        this.mCardRect.bottom = ((int) ((this.mScale * this.mCardCameraRect.bottom) + 0.5f)) + this.mTranslateY;
    }

    private void refreshCardTextPositions() {
        mapToViewCoordinates(DEFAULT_CARD_NUMBER_POS, this.mCardNumberPos);
        mapToViewCoordinates(DEFAULT_CARD_DATE_POS, this.mCardDatePos);
        mapToViewCoordinates(DEFAULT_CARD_HOLDER_POS, this.mCardHolderPos);
    }

    public void mapToViewCoordinates(PointF pointF, PointF pointF2) {
        pointF2.x = (this.mScale * pointF.x) + this.mCardRect.left;
        pointF2.y = (this.mScale * pointF.y) + this.mCardRect.top;
    }

    private int getCameraWidthRotated() {
        int i2 = this.mCameraRotation;
        return (i2 == 0 || i2 == 180) ? this.mCameraPreviewSize[0] : this.mCameraPreviewSize[1];
    }

    private int getCameraHeightRotated() {
        int i2 = this.mCameraRotation;
        return (i2 == 0 || i2 == 180) ? this.mCameraPreviewSize[1] : this.mCameraPreviewSize[0];
    }
}