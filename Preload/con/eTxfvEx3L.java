package con;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class eTxfvEx3L {
    public static final /* synthetic */ int dIocxURUo;
    public final long J4Ux7ym32;
    public final joIJ4ANvK q3BipwRCk;
    public final czCYotiRn tGV7Q6urW;

    static {
        B6IRYLW14 b6irylw14 = IaRtW3OEX.q3BipwRCk;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public eTxfvEx3L(joIJ4ANvK joij4anvk, long j, czCYotiRn czcyotirn, int i) {
        this(joij4anvk, j, (czCYotiRn) null, (dnBSj5uJN) null);
        if ((i & 2) != 0) {
            JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
            j = czCYotiRn.tGV7Q6urW;
        }
    }

    public static eTxfvEx3L q3BipwRCk(eTxfvEx3L etxfvex3l, joIJ4ANvK joij4anvk, long j, czCYotiRn czcyotirn, int i) {
        if ((i & 1) != 0) {
            joij4anvk = etxfvex3l.q3BipwRCk;
        }
        if ((i & 2) != 0) {
            j = etxfvex3l.J4Ux7ym32;
        }
        czCYotiRn czcyotirn2 = (i & 4) != 0 ? etxfvex3l.tGV7Q6urW : null;
        Objects.requireNonNull(etxfvex3l);
        return new eTxfvEx3L(joij4anvk, j, czcyotirn2, (dnBSj5uJN) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eTxfvEx3L)) {
            return false;
        }
        eTxfvEx3L etxfvex3l = (eTxfvEx3L) obj;
        return czCYotiRn.J4Ux7ym32(this.J4Ux7ym32, etxfvex3l.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, etxfvex3l.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, etxfvex3l.q3BipwRCk);
    }

    public int hashCode() {
        int i;
        long j = this.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
        int hashCode = ((this.q3BipwRCk.hashCode() * 31) + Long.hashCode(j)) * 31;
        czCYotiRn czcyotirn = this.tGV7Q6urW;
        if (czcyotirn == null) {
            i = 0;
        } else {
            i = Long.hashCode(czcyotirn.q3BipwRCk);
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextFieldValue(text='");
        q3BipwRCk.append((Object) this.q3BipwRCk);
        q3BipwRCk.append("', selection=");
        q3BipwRCk.append((Object) czCYotiRn.oon79WMrY(this.J4Ux7ym32));
        q3BipwRCk.append(", composition=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public eTxfvEx3L(joIJ4ANvK joij4anvk, long j, czCYotiRn czcyotirn, dnBSj5uJN dnbsj5ujn) {
        czCYotiRn czcyotirn2;
        this.q3BipwRCk = joij4anvk;
        this.J4Ux7ym32 = ODug2UCW1.kmSgne1rO(j, 0, joij4anvk.CBQ5d1kRq.length());
        if (czcyotirn == null) {
            czcyotirn2 = null;
        } else {
            czcyotirn2 = new czCYotiRn(ODug2UCW1.kmSgne1rO(czcyotirn.q3BipwRCk, 0, joij4anvk.CBQ5d1kRq.length()));
        }
        this.tGV7Q6urW = czcyotirn2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public eTxfvEx3L(String str, long j, czCYotiRn czcyotirn, int i) {
        this(new joIJ4ANvK(str, (List) null, (List) null, 6), j, (czCYotiRn) null, (dnBSj5uJN) null);
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
            j = czCYotiRn.tGV7Q6urW;
        }
    }
}
