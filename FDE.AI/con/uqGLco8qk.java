package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class uqGLco8qk extends qY7rbY4BT {
    public int J4Ux7ym32;
    public double[] q3BipwRCk;

    public uqGLco8qk(double[] dArr) {
        this.q3BipwRCk = dArr;
        this.J4Ux7ym32 = dArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        double[] dArr = this.q3BipwRCk;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(dArr, i);
        }
    }

    @Override // con.qY7rbY4BT
    public int dIocxURUo() {
        return this.J4Ux7ym32;
    }

    @Override // con.qY7rbY4BT
    public Object q3BipwRCk() {
        return Arrays.copyOf(this.q3BipwRCk, this.J4Ux7ym32);
    }
}
