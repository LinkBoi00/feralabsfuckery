package con;
/* loaded from: classes.dex */
public final class niYpoU8Cm {
    public final gdEmqfwpT J4Ux7ym32;
    public final gdEmqfwpT q3BipwRCk;
    public final boolean tGV7Q6urW;

    public niYpoU8Cm(gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, boolean z) {
        this.q3BipwRCk = gdemqfwpt;
        this.J4Ux7ym32 = gdemqfwpt2;
        this.tGV7Q6urW = z;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ScrollAxisRange(value=");
        q3BipwRCk.append(((Number) this.q3BipwRCk.GPLPRo6go()).floatValue());
        q3BipwRCk.append(", maxValue=");
        q3BipwRCk.append(((Number) this.J4Ux7ym32.GPLPRo6go()).floatValue());
        q3BipwRCk.append(", reverseScrolling=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
