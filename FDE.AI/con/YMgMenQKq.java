package con;

import java.util.List;
/* loaded from: classes.dex */
public final class YMgMenQKq {
    public final List GPLPRo6go;
    public final long J4Ux7ym32;
    public final long dIocxURUo;
    public final int iiGwOFFnr;
    public final boolean kCA6Zs9sL;
    public final long q3BipwRCk;
    public final long tGV7Q6urW;

    public YMgMenQKq(long j, long j2, long j3, long j4, boolean z, int i, List list, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
        this.tGV7Q6urW = j3;
        this.dIocxURUo = j4;
        this.kCA6Zs9sL = z;
        this.iiGwOFFnr = i;
        this.GPLPRo6go = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YMgMenQKq)) {
            return false;
        }
        YMgMenQKq yMgMenQKq = (YMgMenQKq) obj;
        return BIFpB3cfs.q3BipwRCk(this.q3BipwRCk, yMgMenQKq.q3BipwRCk) && this.J4Ux7ym32 == yMgMenQKq.J4Ux7ym32 && bRgfgYIQX.q3BipwRCk(this.tGV7Q6urW, yMgMenQKq.tGV7Q6urW) && bRgfgYIQX.q3BipwRCk(this.dIocxURUo, yMgMenQKq.dIocxURUo) && this.kCA6Zs9sL == yMgMenQKq.kCA6Zs9sL && S1s03piHw.q3BipwRCk(this.iiGwOFFnr, yMgMenQKq.iiGwOFFnr) && anXlDk6fV.tGV7Q6urW(this.GPLPRo6go, yMgMenQKq.GPLPRo6go);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.J4Ux7ym32);
        long j = this.tGV7Q6urW;
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        int hashCode2 = (((((hashCode + (Long.hashCode(this.q3BipwRCk) * 31)) * 31) + Long.hashCode(j)) * 31) + Long.hashCode(this.dIocxURUo)) * 31;
        boolean z = this.kCA6Zs9sL;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return this.GPLPRo6go.hashCode() + ((((hashCode2 + i) * 31) + Integer.hashCode(this.iiGwOFFnr)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PointerInputEventData(id=");
        q3BipwRCk.append((Object) BIFpB3cfs.J4Ux7ym32(this.q3BipwRCk));
        q3BipwRCk.append(", uptime=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", positionOnScreen=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.tGV7Q6urW));
        q3BipwRCk.append(", position=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.dIocxURUo));
        q3BipwRCk.append(", down=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", type=");
        q3BipwRCk.append((Object) S1s03piHw.J4Ux7ym32(this.iiGwOFFnr));
        q3BipwRCk.append(", historical=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
