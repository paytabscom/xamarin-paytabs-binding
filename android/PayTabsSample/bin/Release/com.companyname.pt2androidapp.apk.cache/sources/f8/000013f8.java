package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import cards.pay.paycardsrecognizer.sdk.R;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.CardUtils;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Fonts;

/* loaded from: classes.dex */
public class CardDetectionStateView extends View {
    private static final int BOTTOM_EDGE = 2;
    private static final boolean DBG = Constants.DEBUG;
    private static final int LEFT_EDGE = 4;
    private static final float RECT_CORNER_LINE_STROKE_WIDTH = 5.0f;
    private static final float RECT_CORNER_PADDING_LEFT = 1.0f;
    private static final float RECT_CORNER_PADDING_TOP = 1.0f;
    private static final float RECT_CORNER_RADIUS = 8.0f;
    private static final int RIGHT_EDGE = 8;
    private static final String TAG = "CardDetectionStateView";
    private static final int TOP_EDGE = 1;
    private Paint mBackgroundPaint;
    private Paint mCardDatePaint;
    private CardRectCoordsMapper mCardFrame;
    private Drawable mCardGradientDrawable;
    private Paint mCardHolderPaint;
    private Paint mCardNumberPaint;
    private final Rect mCardRectInvalidation;
    private Typeface mCardTypeface;
    private BitmapDrawable mCornerBottomLeftDrawable;
    private BitmapDrawable mCornerBottomRightDrawable;
    private float mCornerLineWidth;
    private float mCornerPaddingLeft;
    private float mCornerPaddingTop;
    private float mCornerRadius;
    private BitmapDrawable mCornerTopLeftDrawable;
    private BitmapDrawable mCornerTopRightDrawable;
    private volatile int mDetectionState;
    private float mDisplayDensity;
    private BitmapDrawable mLineBottomDrawable;
    private BitmapDrawable mLineLeftDrawable;
    private BitmapDrawable mLineRightDrawable;
    private BitmapDrawable mLineTopDrawable;
    private volatile String mRecognitionResultCardNumber;
    private volatile String mRecognitionResultDate;
    private volatile String mRecognitionResultHolder;

    public CardDetectionStateView(Context context) {
        this(context, null);
    }

    public CardDetectionStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardDetectionStateView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mCardRectInvalidation = new Rect();
        init(context);
    }

    private void init(Context context) {
        float f2 = getResources().getDisplayMetrics().density;
        this.mDisplayDensity = f2;
        this.mCardFrame = new CardRectCoordsMapper();
        int color = context.getResources().getColor(R.color.wocr_card_shadow_color);
        float f3 = 1.0f * f2;
        this.mCornerPaddingTop = f3;
        this.mCornerPaddingLeft = f3;
        this.mCornerLineWidth = RECT_CORNER_LINE_STROKE_WIDTH * f2;
        this.mCornerRadius = f2 * RECT_CORNER_RADIUS;
        this.mCardGradientDrawable = context.getResources().getDrawable(R.drawable.wocr_frame_rect_gradient);
        initCornerDrawables(context);
        initLineDrawables(context);
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setColor(color);
        this.mCardTypeface = Fonts.getCardFont(context);
        this.mCardNumberPaint = createCardTextPaint();
        this.mCardDatePaint = createCardTextPaint();
        this.mCardHolderPaint = createCardTextPaint();
        if (isInEditMode()) {
            this.mDetectionState = 15;
            this.mRecognitionResultCardNumber = CardUtils.prettyPrintCardNumber("1234567890123456");
            this.mRecognitionResultDate = "05/18";
            this.mRecognitionResultHolder = "CARDHOLDER NAME";
        }
    }

    private Paint createCardTextPaint() {
        Paint paint = new Paint(193);
        paint.setTypeface(this.mCardTypeface);
        paint.setColor(-1);
        paint.setShadowLayer(6.0f, 3.0f, 3.0f, ViewCompat.MEASURED_STATE_MASK);
        paint.setTextSize(this.mDisplayDensity * 12.0f);
        return paint;
    }

    private void initCornerDrawables(Context context) {
        this.mCornerTopLeftDrawable = (BitmapDrawable) context.getResources().getDrawable(R.drawable.wocr_card_frame_rect_corner_top_left);
        Matrix matrix = new Matrix();
        Bitmap bitmap = this.mCornerTopLeftDrawable.getBitmap();
        matrix.setRotate(90.0f);
        this.mCornerTopRightDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        matrix.setRotate(180.0f);
        this.mCornerBottomRightDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        matrix.setRotate(270.0f);
        this.mCornerBottomLeftDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
    }

    private void initLineDrawables(Context context) {
        this.mLineTopDrawable = (BitmapDrawable) context.getResources().getDrawable(R.drawable.wocr_card_frame_rect_line_top);
        Matrix matrix = new Matrix();
        Bitmap bitmap = this.mLineTopDrawable.getBitmap();
        matrix.setRotate(90.0f);
        this.mLineRightDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        matrix.setRotate(180.0f);
        this.mLineBottomDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        matrix.setRotate(270.0f);
        this.mLineLeftDrawable = new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (DBG) {
            Log.d("CameraActivity", "onSizeChanged w,h: " + i2 + "," + i3);
        }
        if (this.mCardFrame.setViewSize(i2, i3)) {
            refreshCardRectCoords();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mCardGradientDrawable.getBounds().width() == 0) {
            return;
        }
        drawBackground(canvas);
        drawCorners(canvas);
        drawRecognitionResult(canvas);
    }

    private void drawBackground(Canvas canvas) {
        Rect cardRect = this.mCardFrame.getCardRect();
        canvas.drawRect(0.0f, 0.0f, getWidth(), cardRect.top, this.mBackgroundPaint);
        canvas.drawRect(0.0f, cardRect.bottom, getWidth(), getHeight(), this.mBackgroundPaint);
        canvas.drawRect(0.0f, cardRect.top, cardRect.left, cardRect.bottom, this.mBackgroundPaint);
        canvas.drawRect(cardRect.right, cardRect.top, getWidth(), cardRect.bottom, this.mBackgroundPaint);
    }

    private void drawCorners(Canvas canvas) {
        int i2 = this.mDetectionState;
        this.mCardGradientDrawable.draw(canvas);
        this.mCornerTopLeftDrawable.draw(canvas);
        this.mCornerTopRightDrawable.draw(canvas);
        this.mCornerBottomLeftDrawable.draw(canvas);
        this.mCornerBottomRightDrawable.draw(canvas);
        if ((i2 & 1) != 0) {
            this.mLineTopDrawable.draw(canvas);
        }
        if ((i2 & 4) != 0) {
            this.mLineLeftDrawable.draw(canvas);
        }
        if ((i2 & 8) != 0) {
            this.mLineRightDrawable.draw(canvas);
        }
        if ((i2 & 2) != 0) {
            this.mLineBottomDrawable.draw(canvas);
        }
    }

    private void drawRecognitionResult(Canvas canvas) {
        String str = this.mRecognitionResultDate;
        String str2 = this.mRecognitionResultCardNumber;
        String str3 = this.mRecognitionResultHolder;
        if (!TextUtils.isEmpty(str2)) {
            canvas.drawText(str2, this.mCardFrame.getCardNumberPos().x, this.mCardFrame.getCardNumberPos().y, this.mCardNumberPaint);
        }
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, this.mCardFrame.getCardDatePos().x, this.mCardFrame.getCardDatePos().y, this.mCardDatePaint);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        canvas.drawText(str3, this.mCardFrame.getCardHolderPos().x, this.mCardFrame.getCardHolderPos().y, this.mCardHolderPaint);
    }

    private void refreshCardRectCoords() {
        refreshCardRectInvalidation();
        refreshDrawableBounds();
        refreshTextSize();
    }

    private void refreshCardRectInvalidation() {
        Rect cardRect = this.mCardFrame.getCardRect();
        int i2 = ((int) (this.mCornerPaddingLeft + 0.5f)) + ((int) ((this.mCornerLineWidth / 2.0f) + 0.5f));
        this.mCardRectInvalidation.left = cardRect.left - i2;
        this.mCardRectInvalidation.top = cardRect.top - i2;
        this.mCardRectInvalidation.right = cardRect.right + i2;
        this.mCardRectInvalidation.bottom = cardRect.bottom + i2;
    }

    private void refreshDrawableBounds() {
        Rect cardRect;
        this.mCardGradientDrawable.setBounds(this.mCardFrame.getCardRect());
        int intrinsicWidth = this.mCornerTopLeftDrawable.getIntrinsicWidth();
        int intrinsicHeight = this.mCornerTopLeftDrawable.getIntrinsicHeight();
        float f2 = (int) ((this.mCornerLineWidth / 2.0f) + 0.5f);
        int round = Math.round((cardRect.left - this.mCornerPaddingLeft) - f2);
        int round2 = Math.round((cardRect.right - intrinsicWidth) + this.mCornerPaddingLeft + f2);
        int round3 = Math.round((cardRect.top - this.mCornerPaddingTop) - f2);
        int round4 = Math.round((cardRect.bottom - intrinsicHeight) + this.mCornerPaddingTop + f2);
        int i2 = round + intrinsicWidth;
        this.mCornerTopLeftDrawable.setBounds(round, round3, i2, round3 + intrinsicHeight);
        int i3 = round2 + intrinsicWidth;
        this.mCornerTopRightDrawable.setBounds(round2, round3, i3, intrinsicWidth + round3);
        int i4 = intrinsicHeight + round4;
        this.mCornerBottomLeftDrawable.setBounds(round, round4, i2, i4);
        this.mCornerBottomRightDrawable.setBounds(round2, round4, i3, i4);
        int i5 = (int) this.mCornerRadius;
        BitmapDrawable bitmapDrawable = this.mLineTopDrawable;
        int i6 = round + i5;
        int i7 = i3 - i5;
        bitmapDrawable.setBounds(i6, round3, i7, bitmapDrawable.getIntrinsicHeight() + round3);
        BitmapDrawable bitmapDrawable2 = this.mLineLeftDrawable;
        int i8 = round3 + i5;
        int i9 = i4 - i5;
        bitmapDrawable2.setBounds(round, i8, bitmapDrawable2.getIntrinsicWidth() + round, i9);
        BitmapDrawable bitmapDrawable3 = this.mLineRightDrawable;
        bitmapDrawable3.setBounds(i3 - bitmapDrawable3.getIntrinsicWidth(), i8, i3, i9);
        BitmapDrawable bitmapDrawable4 = this.mLineBottomDrawable;
        bitmapDrawable4.setBounds(i6, i4 - bitmapDrawable4.getIntrinsicHeight(), i7, i4);
    }

    private void refreshTextSize() {
        this.mCardNumberPaint.setTextSize(this.mCardFrame.getCardNumberFontSize());
        this.mCardDatePaint.setTextSize(this.mCardFrame.getCardDateFontSize());
        this.mCardHolderPaint.setTextSize(this.mCardFrame.getCardHolderFontSize());
    }

    public synchronized void setDetectionState(int i2) {
        if (this.mDetectionState != i2) {
            this.mDetectionState = i2;
            postInvalidate(this.mCardRectInvalidation.left, this.mCardRectInvalidation.top, this.mCardRectInvalidation.right, this.mCardRectInvalidation.bottom);
        }
    }

    public synchronized void setRecognitionResult(RecognitionResult recognitionResult) {
        if (DBG) {
            Log.d(TAG, "setRecognitionResult() called with: result = [" + recognitionResult + "]");
        }
        if (!TextUtils.isEmpty(recognitionResult.getNumber())) {
            this.mRecognitionResultCardNumber = CardUtils.prettyPrintCardNumber(recognitionResult.getNumber());
        } else {
            this.mRecognitionResultCardNumber = null;
        }
        if (!TextUtils.isEmpty(recognitionResult.getDate())) {
            this.mRecognitionResultDate = recognitionResult.getDate().substring(0, 2) + '/' + recognitionResult.getDate().substring(2);
        } else {
            this.mRecognitionResultDate = null;
        }
        this.mRecognitionResultHolder = recognitionResult.getName();
        postInvalidate(this.mCardRectInvalidation.left, this.mCardRectInvalidation.top, this.mCardRectInvalidation.right, this.mCardRectInvalidation.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCameraParameters(int i2, int i3, int i4, Rect rect) {
        if (this.mCardFrame.setCameraParameters(i2, i3, i4, rect)) {
            refreshCardRectCoords();
            invalidate();
        }
    }
}