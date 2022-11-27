package com.facebook.device.yearclass;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class DeviceInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.facebook.device.yearclass.DeviceInfo.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (name.startsWith("cpu")) {
                for (int i2 = 3; i2 < name.length(); i2++) {
                    if (name.charAt(i2) < '0' || name.charAt(i2) > '9') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };
    public static final int DEVICEINFO_UNKNOWN = -1;

    public static int getNumberOfCPUCores() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int getCPUMaxFreqKHz() {
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (bArr[i4] >= 48 && bArr[i4] <= 57 && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
            if (parseFileForValue > i2) {
                i2 = parseFileForValue;
            }
            fileInputStream2.close();
        }
        return i2;
    }

    public static long getTotalMemory(Context context) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j2 = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/meminfo");
            j2 = parseFileForValue("MemTotal", fileInputStream) * 1024;
            fileInputStream.close();
        } catch (IOException unused) {
        }
        return j2;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < read) {
                if (bArr[i2] == 10 || i2 == 0) {
                    if (bArr[i2] == 10) {
                        i2++;
                    }
                    for (int i3 = i2; i3 < read; i3++) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            break;
                        } else if (i4 == str.length() - 1) {
                            return extractValue(bArr, i3);
                        }
                    }
                    continue;
                }
                i2++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    private static int extractValue(byte[] bArr, int i2) {
        while (i2 < bArr.length && bArr[i2] != 10) {
            if (bArr[i2] >= 48 && bArr[i2] <= 57) {
                int i3 = i2 + 1;
                while (i3 < bArr.length && bArr[i3] >= 48 && bArr[i3] <= 57) {
                    i3++;
                }
                return Integer.parseInt(new String(bArr, 0, i2, i3 - i2));
            }
            i2++;
        }
        return -1;
    }
}