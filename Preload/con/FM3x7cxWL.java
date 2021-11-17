package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class FM3x7cxWL extends qY7rbY4BT {
    public int J4Ux7ym32;
    public long[] q3BipwRCk;

    public FM3x7cxWL(long[] jArr) {
        this.q3BipwRCk = jArr;
        this.J4Ux7ym32 = jArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        long[] jArr = this.q3BipwRCk;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(jArr, i);
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
