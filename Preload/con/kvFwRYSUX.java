package con;

import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class kvFwRYSUX extends kVmRinNH6 implements RandomAccess {
    public final int Bhmn1KIah;
    public int CBQ5d1kRq;
    public final kVmRinNH6 kmSgne1rO;

    public kvFwRYSUX(kVmRinNH6 kvmrinnh6, int i, int i2) {
        this.kmSgne1rO = kvmrinnh6;
        this.Bhmn1KIah = i;
        int J4Ux7ym32 = kvmrinnh6.J4Ux7ym32();
        if (i < 0 || i2 > J4Ux7ym32) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + J4Ux7ym32);
        } else if (i <= i2) {
            this.CBQ5d1kRq = i2 - i;
        } else {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.CBQ5d1kRq;
    }

    @Override // con.kVmRinNH6, java.util.List
    public Object get(int i) {
        int i2 = this.CBQ5d1kRq;
        if (i >= 0 && i < i2) {
            return this.kmSgne1rO.get(this.Bhmn1KIah + i);
        }
        throw new IndexOutOfBoundsException(mbAen3Jsn.q3BipwRCk("index: ", i, ", size: ", i2));
    }
}
