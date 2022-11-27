package androidx.constraintlayout.solver.widgets;

/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x  reason: collision with root package name */
    public int f12x;

    /* renamed from: y  reason: collision with root package name */
    public int f13y;

    public void setBounds(int i2, int i3, int i4, int i5) {
        this.f12x = i2;
        this.f13y = i3;
        this.width = i4;
        this.height = i5;
    }

    void grow(int i2, int i3) {
        this.f12x -= i2;
        this.f13y -= i3;
        this.width += i2 * 2;
        this.height += i3 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i2;
        int i3;
        int i4 = this.f12x;
        int i5 = rectangle.f12x;
        return i4 >= i5 && i4 < i5 + rectangle.width && (i2 = this.f13y) >= (i3 = rectangle.f13y) && i2 < i3 + rectangle.height;
    }

    public boolean contains(int i2, int i3) {
        int i4;
        int i5 = this.f12x;
        return i2 >= i5 && i2 < i5 + this.width && i3 >= (i4 = this.f13y) && i3 < i4 + this.height;
    }

    public int getCenterX() {
        return (this.f12x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f13y + this.height) / 2;
    }
}