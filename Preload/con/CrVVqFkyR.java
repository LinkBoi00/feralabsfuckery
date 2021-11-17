package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class CrVVqFkyR extends qY7rbY4BT {
    public int J4Ux7ym32;
    public byte[] q3BipwRCk;

    public CrVVqFkyR(byte[] bArr) {
        this.q3BipwRCk = bArr;
        this.J4Ux7ym32 = bArr.length;
        J4Ux7ym32(10);
    }

    @Override // con.qY7rbY4BT
    public void J4Ux7ym32(int i) {
        byte[] bArr = this.q3BipwRCk;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.q3BipwRCk = Arrays.copyOf(bArr, i);
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
