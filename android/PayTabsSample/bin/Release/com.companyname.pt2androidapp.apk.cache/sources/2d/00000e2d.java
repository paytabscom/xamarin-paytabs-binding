package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.OrientationEventListener;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils.Constants;

/* loaded from: classes.dex */
public final class WindowRotationListener {
    private static boolean DBG = Constants.DEBUG;
    private static final String TAG = "WindowRotationListener";
    private static final Impl sImpl;

    /* loaded from: classes.dex */
    private interface Impl {
        void register(Context context, Display display, RotationListener rotationListener);

        void unregister();
    }

    /* loaded from: classes.dex */
    public interface RotationListener {
        void onWindowRotationChanged();
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            sImpl = new ImplApi17();
        } else {
            sImpl = new ImplDefault();
        }
    }

    public void register(Context context, Display display, RotationListener rotationListener) {
        sImpl.register(context, display, rotationListener);
    }

    public void unregister() {
        sImpl.unregister();
    }

    /* loaded from: classes.dex */
    private static class ImplDefault implements Impl {
        private Display mDisplay;
        private RotationListener mListener;
        private OrientationEventListener mOrientationListener;

        private ImplDefault() {
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.Impl
        public void register(Context context, Display display, RotationListener rotationListener) {
            this.mDisplay = display;
            this.mListener = rotationListener;
            OrientationEventListener orientationEventListener = new OrientationEventListener(context) { // from class: com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.ImplDefault.1
                int lastOrientation;
                int lastWindowOrientation;

                {
                    int displayRotationDegrees = OrientationHelper.getDisplayRotationDegrees(ImplDefault.this.mDisplay);
                    this.lastWindowOrientation = displayRotationDegrees;
                    this.lastOrientation = displayRotationDegrees;
                }

                @Override // android.view.OrientationEventListener
                public void onOrientationChanged(int i2) {
                    int i3;
                    if (ImplDefault.this.mDisplay == null || (i3 = ((i2 + 45) / 90) * 90) == this.lastOrientation) {
                        return;
                    }
                    this.lastOrientation = i3;
                    int displayRotationDegrees = OrientationHelper.getDisplayRotationDegrees(ImplDefault.this.mDisplay);
                    if (displayRotationDegrees == this.lastWindowOrientation) {
                        return;
                    }
                    this.lastWindowOrientation = displayRotationDegrees;
                    if (i3 == -1 || ImplDefault.this.mListener == null) {
                        return;
                    }
                    ImplDefault.this.mListener.onWindowRotationChanged();
                }
            };
            this.mOrientationListener = orientationEventListener;
            orientationEventListener.enable();
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.Impl
        public void unregister() {
            OrientationEventListener orientationEventListener = this.mOrientationListener;
            if (orientationEventListener == null) {
                return;
            }
            orientationEventListener.disable();
            this.mOrientationListener = null;
            this.mDisplay = null;
            this.mListener = null;
        }
    }

    /* loaded from: classes.dex */
    private static class ImplApi17 implements Impl, DisplayManager.DisplayListener {
        private int mDisplayId;
        private DisplayManager mDisplayManager;
        private final Handler mHandler = new Handler();
        private RotationListener mListener;

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.Impl
        public void register(Context context, Display display, RotationListener rotationListener) {
            this.mListener = rotationListener;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            this.mDisplayManager = displayManager;
            displayManager.registerDisplayListener(this, this.mHandler);
            this.mDisplayId = display.getDisplayId();
        }

        @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera.WindowRotationListener.Impl
        public void unregister() {
            DisplayManager displayManager = this.mDisplayManager;
            if (displayManager == null) {
                return;
            }
            displayManager.unregisterDisplayListener(this);
            this.mDisplayManager = null;
            this.mListener = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
            if (WindowRotationListener.DBG) {
                Log.d(WindowRotationListener.TAG, "onDisplayAdded() called with: displayId = [" + i2 + "]");
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
            if (WindowRotationListener.DBG) {
                Log.d(WindowRotationListener.TAG, "onDisplayRemoved() called with: displayId = [" + i2 + "]");
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (WindowRotationListener.DBG) {
                Log.d(WindowRotationListener.TAG, "onDisplayChanged() called with: displayId = [" + i2 + "]");
            }
            RotationListener rotationListener = this.mListener;
            if (rotationListener == null || i2 != this.mDisplayId) {
                return;
            }
            rotationListener.onWindowRotationChanged();
        }
    }
}