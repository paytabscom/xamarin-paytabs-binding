package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.utils;

import android.text.TextUtils;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class CardUtils {
    private CardUtils() {
    }

    public static String prettyPrintCardNumber(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (length == 16) {
                if (i2 != 0 && i2 % 4 == 0) {
                    sb.append(Typography.nbsp);
                }
            } else if (length == 15 && (i2 == 4 || i2 == 10)) {
                sb.append(Typography.nbsp);
            }
            sb.append(charSequence.charAt(i2));
        }
        return sb.toString();
    }

    public static String getCardNumberRedacted(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() == 16) {
            String substring = str.substring(0, 6);
            String substring2 = str.substring(str.length() - 2, str.length());
            StringBuilder sb = new StringBuilder(substring + "********" + substring2);
            sb.insert(4, " ");
            sb.insert(9, " ");
            sb.insert(14, " ");
            return sb.toString();
        } else if (str.length() == 15) {
            String substring3 = str.substring(0, 6);
            String substring4 = str.substring(str.length() - 1, str.length());
            StringBuilder sb2 = new StringBuilder(substring3 + "********" + substring4);
            sb2.insert(4, " ");
            sb2.insert(11, " ");
            return sb2.toString();
        } else {
            return "";
        }
    }
}