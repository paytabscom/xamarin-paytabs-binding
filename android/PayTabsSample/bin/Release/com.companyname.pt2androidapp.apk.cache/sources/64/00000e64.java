package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class Fonts {
    private static volatile Typeface sCardFont;

    private Fonts(Context context) {
    }

    public static Typeface getCardFont(Context context) {
        if (sCardFont == null) {
            synchronized (Fonts.class) {
                if (sCardFont == null) {
                    sCardFont = Typeface.createFromAsset(context.getAssets(), "cardrecognizer/fonts/OCRAStd.otf");
                }
            }
        }
        return sCardFont;
    }
}