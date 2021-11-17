package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ryX1tYa0S extends qY7rbY4BT {
    public int J4Ux7ym32;
    public short[] q3BipwRCk;

    public ryX1tYa0S(short[] sArr) {
        this.q3BipwRCk = sArr;
        this.J4Ux7ym32 = sArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        short[] sArr = this.q3BipwRCk;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(sArr, i);
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
