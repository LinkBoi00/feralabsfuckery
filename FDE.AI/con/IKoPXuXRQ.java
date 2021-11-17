package con;
/* loaded from: classes.dex */
public abstract class IKoPXuXRQ {
    public static final Object q3BipwRCk = new Object();

    public static final void J4Ux7ym32(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final Void q3BipwRCk() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
