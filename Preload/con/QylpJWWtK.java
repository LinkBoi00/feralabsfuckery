package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class QylpJWWtK extends qY7rbY4BT {
    public int J4Ux7ym32;
    public float[] q3BipwRCk;

    public QylpJWWtK(float[] fArr) {
        this.q3BipwRCk = fArr;
        this.J4Ux7ym32 = fArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        float[] fArr = this.q3BipwRCk;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(fArr, i);
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
