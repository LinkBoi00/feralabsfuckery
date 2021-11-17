package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class Ia6mek0WF extends qY7rbY4BT {
    public int J4Ux7ym32;
    public char[] q3BipwRCk;

    public Ia6mek0WF(char[] cArr) {
        this.q3BipwRCk = cArr;
        this.J4Ux7ym32 = cArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        char[] cArr = this.q3BipwRCk;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(cArr, i);
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
