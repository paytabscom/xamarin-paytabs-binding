package com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.camera;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class FpsCounter {
    private float fpsLast;
    private long fpsLastPeriod;
    private float fpsLastTickTime;
    private long fpsLastUpdateTime;
    private long fpsStartTime;
    private float fpsTotal;
    private long fpsTotalDuration;
    private int fpsTotalFrames;
    private int fpsUpdateFramesInterval;

    public FpsCounter() {
        setUpdateFPSFrames(0);
    }

    public final synchronized void tickFPS() {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        int i2 = this.fpsUpdateFramesInterval;
        if (i2 == 0) {
            return;
        }
        int i3 = this.fpsTotalFrames + 1;
        this.fpsTotalFrames = i3;
        if (i3 % i2 == 0) {
            long j2 = millis - this.fpsLastUpdateTime;
            this.fpsLastPeriod = j2;
            long max = Math.max(j2, 1L);
            this.fpsLastPeriod = max;
            this.fpsLast = (this.fpsUpdateFramesInterval * 1000.0f) / ((float) max);
            long j3 = millis - this.fpsStartTime;
            this.fpsTotalDuration = j3;
            long max2 = Math.max(j3, 1L);
            this.fpsTotalDuration = max2;
            this.fpsTotal = (this.fpsTotalFrames * 1000.0f) / ((float) max2);
            this.fpsLastUpdateTime = millis;
        }
        this.fpsLastTickTime = (float) millis;
    }

    public synchronized void update() {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (((float) millis) - this.fpsLastTickTime > 1000.0f) {
            this.fpsLast = 0.0f;
            this.fpsLastPeriod = 0L;
            long j2 = millis - this.fpsStartTime;
            this.fpsTotalDuration = j2;
            this.fpsTotalDuration = Math.max(j2, 1L);
            this.fpsLastUpdateTime = millis;
        }
    }

    public StringBuilder toString(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder();
        }
        String valueOf = String.valueOf(this.fpsLast);
        String substring = valueOf.substring(0, valueOf.indexOf(46) + 2);
        String valueOf2 = String.valueOf(this.fpsTotal);
        valueOf2.substring(0, valueOf2.indexOf(46) + 2);
        sb.append((this.fpsTotalDuration / 1000) + " s: " + this.fpsUpdateFramesInterval + " f / " + this.fpsLastPeriod + " ms, " + substring + " fps, " + (this.fpsLastPeriod / this.fpsUpdateFramesInterval) + " ms/f; ");
        return sb;
    }

    public String toString() {
        return toString(null).toString();
    }

    public final synchronized void setUpdateFPSFrames(int i2) {
        this.fpsUpdateFramesInterval = i2;
        resetFPSCounter();
    }

    public final synchronized void resetFPSCounter() {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        this.fpsStartTime = millis;
        this.fpsLastUpdateTime = millis;
        this.fpsLastPeriod = 0L;
        this.fpsTotalFrames = 0;
        this.fpsLast = 0.0f;
        this.fpsTotal = 0.0f;
        this.fpsLastPeriod = 0L;
        this.fpsTotalDuration = 0L;
    }

    public final synchronized int getUpdateFPSFrames() {
        return this.fpsUpdateFramesInterval;
    }

    public final synchronized long getFPSStartTime() {
        return this.fpsStartTime;
    }

    public final synchronized long getLastFPSUpdateTime() {
        return this.fpsLastUpdateTime;
    }

    public final synchronized long getLastFPSPeriod() {
        return this.fpsLastPeriod;
    }

    public final synchronized float getLastFPS() {
        return this.fpsLast;
    }

    public final synchronized int getTotalFPSFrames() {
        return this.fpsTotalFrames;
    }

    public final synchronized long getTotalFPSDuration() {
        return this.fpsTotalDuration;
    }

    public final synchronized float getTotalFPS() {
        return this.fpsTotal;
    }
}