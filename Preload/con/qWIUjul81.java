package con;

import java.util.List;
/* loaded from: classes.dex */
public final class qWIUjul81 implements wX7bxQPFb {
    public final int J4Ux7ym32;
    public final joIJ4ANvK q3BipwRCk;

    public qWIUjul81(String str, int i) {
        this.q3BipwRCk = new joIJ4ANvK(str, (List) null, (List) null, 6);
        this.J4Ux7ym32 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qWIUjul81)) {
            return false;
        }
        qWIUjul81 qwiujul81 = (qWIUjul81) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk.CBQ5d1kRq, qwiujul81.q3BipwRCk.CBQ5d1kRq) && this.J4Ux7ym32 == qwiujul81.J4Ux7ym32;
    }

    public int hashCode() {
        return (this.q3BipwRCk.CBQ5d1kRq.hashCode() * 31) + this.J4Ux7ym32;
    }

    @Override // con.wX7bxQPFb
    public void q3BipwRCk(gIb52UzMw gib52uzmw) {
        int i;
        int i2;
        int i3;
        if (gib52uzmw.kCA6Zs9sL()) {
            i2 = gib52uzmw.dIocxURUo;
            i = gib52uzmw.kCA6Zs9sL;
        } else {
            i2 = gib52uzmw.J4Ux7ym32;
            i = gib52uzmw.tGV7Q6urW;
        }
        gib52uzmw.iiGwOFFnr(i2, i, this.q3BipwRCk.CBQ5d1kRq);
        int i4 = gib52uzmw.J4Ux7ym32;
        int i5 = gib52uzmw.tGV7Q6urW;
        if (i4 != i5) {
            i5 = -1;
        }
        int i6 = this.J4Ux7ym32;
        int i7 = i5 + i6;
        if (i6 > 0) {
            i3 = i7 - 1;
        } else {
            i3 = i7 - this.q3BipwRCk.CBQ5d1kRq.length();
        }
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i3, 0, gib52uzmw.dIocxURUo());
        gib52uzmw.Puu3Rhg4F(kCA6Zs9sL, kCA6Zs9sL);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("CommitTextCommand(text='");
        q3BipwRCk.append(this.q3BipwRCk.CBQ5d1kRq);
        q3BipwRCk.append("', newCursorPosition=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
