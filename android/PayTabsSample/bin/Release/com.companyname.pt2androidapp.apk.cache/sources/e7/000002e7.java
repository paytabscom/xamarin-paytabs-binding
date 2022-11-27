package androidx.constraintlayout.motion.utils;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private final double[] mTime;

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        }
        Arc[] arcArr = this.mArcs;
        if (d2 > arcArr[arcArr.length - 1].mTime2) {
            Arc[] arcArr2 = this.mArcs;
            d2 = arcArr2[arcArr2.length - 1].mTime2;
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    dArr[0] = this.mArcs[i2].getLinearX(d2);
                    dArr[1] = this.mArcs[i2].getLinearY(d2);
                    return;
                }
                this.mArcs[i2].setPoint(d2);
                dArr[0] = this.mArcs[i2].getX();
                dArr[1] = this.mArcs[i2].getY();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    fArr[0] = (float) this.mArcs[i2].getLinearX(d2);
                    fArr[1] = (float) this.mArcs[i2].getLinearY(d2);
                    return;
                }
                this.mArcs[i2].setPoint(d2);
                fArr[0] = (float) this.mArcs[i2].getX();
                fArr[1] = (float) this.mArcs[i2].getY();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    dArr[0] = this.mArcs[i2].getLinearDX(d2);
                    dArr[1] = this.mArcs[i2].getLinearDY(d2);
                    return;
                }
                this.mArcs[i2].setPoint(d2);
                dArr[0] = this.mArcs[i2].getDX();
                dArr[1] = this.mArcs[i2].getDY();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getPos(double d2, int i2) {
        int i3 = 0;
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i3 >= arcArr3.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr3[i3].mTime2) {
                if (this.mArcs[i3].linear) {
                    if (i2 == 0) {
                        return this.mArcs[i3].getLinearX(d2);
                    }
                    return this.mArcs[i3].getLinearY(d2);
                }
                this.mArcs[i3].setPoint(d2);
                if (i2 == 0) {
                    return this.mArcs[i3].getX();
                }
                return this.mArcs[i3].getY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getSlope(double d2, int i2) {
        int i3 = 0;
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        }
        Arc[] arcArr = this.mArcs;
        if (d2 > arcArr[arcArr.length - 1].mTime2) {
            Arc[] arcArr2 = this.mArcs;
            d2 = arcArr2[arcArr2.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i3 >= arcArr3.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr3[i3].mTime2) {
                if (this.mArcs[i3].linear) {
                    if (i2 == 0) {
                        return this.mArcs[i3].getLinearDX(d2);
                    }
                    return this.mArcs[i3].getLinearDY(d2);
                }
                this.mArcs[i3].setPoint(d2);
                if (i2 == 0) {
                    return this.mArcs[i3].getDX();
                }
                return this.mArcs[i3].getDY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i2 >= arcArr.length) {
                return;
            }
            int i5 = iArr[i2];
            if (i5 == 0) {
                i4 = 3;
            } else if (i5 == 1) {
                i3 = 1;
                i4 = 1;
            } else if (i5 == 2) {
                i3 = 2;
                i4 = 2;
            } else if (i5 == 3) {
                i3 = i3 == 1 ? 2 : 1;
                i4 = i3;
            }
            int i6 = i2 + 1;
            arcArr[i2] = new Arc(i4, dArr[i2], dArr[i6], dArr2[i2][0], dArr2[i2][1], dArr2[i6][0], dArr2[i6][1]);
            i2 = i6;
        }
    }

    /* loaded from: classes.dex */
    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i2, double d2, double d3, double d4, double d5, double d6, double d7) {
            this.linear = false;
            this.mVertical = i2 == 1;
            this.mTime1 = d2;
            this.mTime2 = d3;
            this.mOneOverDeltaTime = 1.0d / (d3 - d2);
            if (3 == i2) {
                this.linear = true;
            }
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            if (this.linear || Math.abs(d8) < EPSILON || Math.abs(d9) < EPSILON) {
                this.linear = true;
                this.mX1 = d4;
                this.mX2 = d6;
                this.mY1 = d5;
                this.mY2 = d7;
                double hypot = Math.hypot(d9, d8);
                this.mArcDistance = hypot;
                this.mArcVelocity = hypot * this.mOneOverDeltaTime;
                double d10 = this.mTime2;
                double d11 = this.mTime1;
                this.mEllipseCenterX = d8 / (d10 - d11);
                this.mEllipseCenterY = d9 / (d10 - d11);
                return;
            }
            this.mLut = new double[101];
            boolean z2 = this.mVertical;
            this.mEllipseA = d8 * (z2 ? -1 : 1);
            this.mEllipseB = d9 * (z2 ? 1 : -1);
            this.mEllipseCenterX = z2 ? d6 : d4;
            this.mEllipseCenterY = z2 ? d5 : d7;
            buildTable(d4, d5, d6, d7);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        void setPoint(double d2) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d2 : d2 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double getDX() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        double getDY() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, d3);
            return this.mVertical ? (-d3) * hypot : d3 * hypot;
        }

        public double getLinearX(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return d4 + (d3 * (this.mX2 - d4));
        }

        public double getLinearY(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return d4 + (d3 * (this.mY2 - d4));
        }

        public double getLinearDX(double d2) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d2) {
            return this.mEllipseCenterY;
        }

        double lookup(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d2 * (dArr.length - 1);
            int i2 = (int) length;
            return dArr[i2] + ((length - i2) * (dArr[i2 + 1] - dArr[i2]));
        }

        private void buildTable(double d2, double d3, double d4, double d5) {
            double[] dArr;
            double[] dArr2;
            double d6;
            double d7 = d4 - d2;
            double d8 = d3 - d5;
            int i2 = 0;
            double d9 = 0.0d;
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (true) {
                if (i2 >= ourPercent.length) {
                    break;
                }
                double d12 = d9;
                double radians = Math.toRadians((i2 * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d7;
                double cos = Math.cos(radians) * d8;
                if (i2 > 0) {
                    d6 = Math.hypot(sin - d10, cos - d11) + d12;
                    ourPercent[i2] = d6;
                } else {
                    d6 = d12;
                }
                i2++;
                d11 = cos;
                d9 = d6;
                d10 = sin;
            }
            double d13 = d9;
            this.mArcDistance = d13;
            int i3 = 0;
            while (true) {
                double[] dArr3 = ourPercent;
                if (i3 >= dArr3.length) {
                    break;
                }
                dArr3[i3] = dArr3[i3] / d13;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.mLut.length) {
                    return;
                }
                double length = i4 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(ourPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i4] = binarySearch / (ourPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i4] = 0.0d;
                } else {
                    int i5 = -binarySearch;
                    int i6 = i5 - 2;
                    double[] dArr4 = ourPercent;
                    this.mLut[i4] = (i6 + ((length - dArr4[i6]) / (dArr4[i5 - 1] - dArr4[i6]))) / (dArr4.length - 1);
                }
                i4++;
            }
        }
    }
}