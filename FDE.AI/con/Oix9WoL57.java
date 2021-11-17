package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class Oix9WoL57 extends qY7rbY4BT {
    public int J4Ux7ym32;
    public int[] q3BipwRCk;

    public Oix9WoL57(int[] iArr) {
        this.q3BipwRCk = iArr;
        this.J4Ux7ym32 = iArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        int[] iArr = this.q3BipwRCk;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(iArr, i);
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
