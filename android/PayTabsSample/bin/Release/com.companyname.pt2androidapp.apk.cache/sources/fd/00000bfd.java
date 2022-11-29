package com.facebook.device.yearclass;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class YearClass {
    public static final int CLASS_2008 = 2008;
    public static final int CLASS_2009 = 2009;
    public static final int CLASS_2010 = 2010;
    public static final int CLASS_2011 = 2011;
    public static final int CLASS_2012 = 2012;
    public static final int CLASS_2013 = 2013;
    public static final int CLASS_2014 = 2014;
    public static final int CLASS_UNKNOWN = -1;
    private static final long MB = 1048576;
    private static final int MHZ_IN_KHZ = 1000;
    private static volatile Integer mYearCategory;

    public static int get(Context context) {
        if (mYearCategory == null) {
            synchronized (YearClass.class) {
                if (mYearCategory == null) {
                    mYearCategory = Integer.valueOf(categorizeByYear(context));
                }
            }
        }
        return mYearCategory.intValue();
    }

    private static void conditionallyAdd(ArrayList<Integer> arrayList, int i2) {
        if (i2 != -1) {
            arrayList.add(Integer.valueOf(i2));
        }
    }

    private static int categorizeByYear(Context context) {
        ArrayList arrayList = new ArrayList();
        conditionallyAdd(arrayList, getNumCoresYear());
        conditionallyAdd(arrayList, getClockSpeedYear());
        conditionallyAdd(arrayList, getRamYear(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    private static int getNumCoresYear() {
        int numberOfCPUCores = DeviceInfo.getNumberOfCPUCores();
        if (numberOfCPUCores < 1) {
            return -1;
        }
        return numberOfCPUCores == 1 ? CLASS_2008 : numberOfCPUCores <= 3 ? CLASS_2011 : CLASS_2012;
    }

    private static int getClockSpeedYear() {
        long cPUMaxFreqKHz = DeviceInfo.getCPUMaxFreqKHz();
        if (cPUMaxFreqKHz == -1) {
            return -1;
        }
        return cPUMaxFreqKHz <= 528000 ? CLASS_2008 : cPUMaxFreqKHz <= 620000 ? CLASS_2009 : cPUMaxFreqKHz <= 1020000 ? CLASS_2010 : cPUMaxFreqKHz <= 1220000 ? CLASS_2011 : cPUMaxFreqKHz <= 1520000 ? CLASS_2012 : cPUMaxFreqKHz <= 2020000 ? CLASS_2013 : CLASS_2014;
    }

    private static int getRamYear(Context context) {
        long totalMemory = DeviceInfo.getTotalMemory(context);
        if (totalMemory <= 0) {
            return -1;
        }
        return totalMemory <= 201326592 ? CLASS_2008 : totalMemory <= 304087040 ? CLASS_2009 : totalMemory <= 536870912 ? CLASS_2010 : totalMemory <= 1073741824 ? CLASS_2011 : totalMemory <= 1610612736 ? CLASS_2012 : totalMemory <= 2147483648L ? CLASS_2013 : CLASS_2014;
    }
}