package con;

import java.util.List;
/* loaded from: classes.dex */
public final class PKE9FAfwu implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final joIJ4ANvK q3BipwRCk;

    public PKE9FAfwu(String str, int i) {
        this.q3BipwRCk = new joIJ4ANvK(str, (List) null, (List) null, 6);
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PKE9FAfwu)) {
            return false;
        }
        PKE9FAfwu pKE9FAfwu = (PKE9FAfwu) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk.CBQ5d1kRq, pKE9FAfwu.q3BipwRCk.CBQ5d1kRq) && this.J4Ux7ym32 == pKE9FAfwu.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk.CBQ5d1kRq.hashCode() * 31) + this.J4Ux7ym32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if ((r5.q3BipwRCk.CBQ5d1kRq.length() > 0) != false) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r6.GPLPRo6go(r0, r5.q3BipwRCk.CBQ5d1kRq.length() + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r5.q3BipwRCk.CBQ5d1kRq.length() > 0) != false) goto L_0x003d;
     */
    @Override // con.wX7bxQPFb
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        int i;
        int i2;
        if (gib52uzmw.kCA6Zs9sL()) {
            i2 = gib52uzmw.dIocxURUo;
            gib52uzmw.iiGwOFFnr(i2, gib52uzmw.kCA6Zs9sL, this.q3BipwRCk.CBQ5d1kRq);
        } else {
            i2 = gib52uzmw.J4Ux7ym32;
            gib52uzmw.iiGwOFFnr(i2, gib52uzmw.tGV7Q6urW, this.q3BipwRCk.CBQ5d1kRq);
        }
        int i3 = gib52uzmw.J4Ux7ym32;
        int i4 = gib52uzmw.tGV7Q6urW;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.J4Ux7ym32;
        int i6 = i4 + i5;
        if (i5 > 0) {
            i = i6 - 1;
        } else {
            i = i6 - this.q3BipwRCk.CBQ5d1kRq.length();
        }
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i, 0, gib52uzmw.dIocxURUo());
        gib52uzmw.Puu3Rhg4F(kCA6Zs9sL, kCA6Zs9sL);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SetComposingTextCommand(text='");
        q3BipwRCk.append(this.q3BipwRCk.CBQ5d1kRq);
        q3BipwRCk.append("', newCursorPosition=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
