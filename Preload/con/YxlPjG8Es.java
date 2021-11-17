package con;
/* loaded from: classes.dex */
public abstract class YxlPjG8Es {
    public static final void J4Ux7ym32(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", i2));
        }
    }

    public static final void q3BipwRCk(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", i2));
        }
    }

    public static final void tGV7Q6urW(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i > i2) {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("fromIndex: ", i, " > toIndex: ", i2));
        }
    }
}
