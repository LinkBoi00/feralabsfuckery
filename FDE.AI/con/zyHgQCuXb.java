package con;
/* loaded from: classes.dex */
public final class zyHgQCuXb {
    public static final oWhsE8IPp GPLPRo6go = new oWhsE8IPp(null, 1);
    public int J4Ux7ym32;
    public final RNEcgN6dQ dIocxURUo;
    public Object iiGwOFFnr;
    public boolean kCA6Zs9sL;
    public int q3BipwRCk;
    public final RNEcgN6dQ tGV7Q6urW;

    public zyHgQCuXb(int i, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = u51fgFYkV.dIocxURUo(Integer.valueOf(i), null, 2, null);
        this.dIocxURUo = u51fgFYkV.dIocxURUo(Integer.valueOf(this.J4Ux7ym32), null, 2, null);
    }

    public final void q3BipwRCk(int i, int i2) {
        boolean z = true;
        if (((float) i) >= 0.0f) {
            if (((float) i2) >= 0.0f) {
                if (i != this.q3BipwRCk) {
                    z = false;
                }
                if (!z) {
                    this.q3BipwRCk = i;
                    ((prCJwNx2x) this.tGV7Q6urW).CBQ5d1kRq(Integer.valueOf(i));
                }
                if (i2 != this.J4Ux7ym32) {
                    this.J4Ux7ym32 = i2;
                    ((prCJwNx2x) this.dIocxURUo).CBQ5d1kRq(Integer.valueOf(i2));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("scrollOffset should be non-negative (" + i2 + ')').toString());
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
