package com.google.crypto.tink.subtle;

import kotlin.UByte;

/* loaded from: classes.dex */
public final class Hex {
    public static String encode(final byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b2 : bytes) {
            int i2 = b2 & UByte.MAX_VALUE;
            sb.append("0123456789abcdef".charAt(i2 / 16));
            sb.append("0123456789abcdef".charAt(i2 % 16));
        }
        return sb.toString();
    }

    public static byte[] decode(String hex) {
        if (hex.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = hex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int digit = Character.digit(hex.charAt(i3), 16);
            int digit2 = Character.digit(hex.charAt(i3 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }
}