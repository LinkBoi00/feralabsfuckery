package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class m6OFRxB0v extends qY7rbY4BT {
    public int J4Ux7ym32;
    public boolean[] q3BipwRCk;

    public m6OFRxB0v(boolean[] zArr) {
        this.q3BipwRCk = zArr;
        this.J4Ux7ym32 = zArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        boolean[] zArr = this.q3BipwRCk;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(zArr, i);
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
