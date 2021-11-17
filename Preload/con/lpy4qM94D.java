package con;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lpy4qM94D extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ UwmKmkwV0 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpy4qM94D(UwmKmkwV0 uwmKmkwV0, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = uwmKmkwV0;
            super(1);
        } else if (i != 2) {
            this.Bhmn1KIah = uwmKmkwV0;
        } else {
            this.Bhmn1KIah = uwmKmkwV0;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        PmanMZxiM pmanMZxiM;
        qih4lW99W qih4lw99w;
        boolean z = false;
        int i = 1;
        switch (this.kmSgne1rO) {
            case 0:
                mnTaxtMa7 mntaxtma7 = (mnTaxtMa7) obj;
                zRlqFnDB5 zrlqfndb5 = this.Bhmn1KIah.iiGwOFFnr;
                if (zrlqfndb5 != null) {
                    zrlqfndb5.tGV7Q6urW = mntaxtma7;
                }
                return qih4lW99W.q3BipwRCk;
            case 1:
                int i2 = ((exvFNe8oO) obj).q3BipwRCk;
                pT9S92NBr pt9s92nbr = this.Bhmn1KIah.CBQ5d1kRq;
                Objects.requireNonNull(pt9s92nbr);
                Object obj2 = null;
                if (exvFNe8oO.q3BipwRCk(i2, 7)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().q3BipwRCk;
                } else if (exvFNe8oO.q3BipwRCk(i2, 2)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().J4Ux7ym32;
                } else if (exvFNe8oO.q3BipwRCk(i2, 6)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().tGV7Q6urW;
                } else if (exvFNe8oO.q3BipwRCk(i2, 5)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().dIocxURUo;
                } else if (exvFNe8oO.q3BipwRCk(i2, 3)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().kCA6Zs9sL;
                } else if (exvFNe8oO.q3BipwRCk(i2, 4)) {
                    pmanMZxiM = pt9s92nbr.q3BipwRCk().iiGwOFFnr;
                } else {
                    if (exvFNe8oO.q3BipwRCk(i2, 1) ? true : exvFNe8oO.q3BipwRCk(i2, 0)) {
                        pmanMZxiM = null;
                    } else {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                }
                if (pmanMZxiM == null) {
                    qih4lw99w = null;
                } else {
                    pmanMZxiM.IytU16YUK(pt9s92nbr);
                    qih4lw99w = qih4lW99W.q3BipwRCk;
                }
                if (qih4lw99w == null) {
                    if (exvFNe8oO.q3BipwRCk(i2, 6)) {
                        Object obj3 = pt9s92nbr.J4Ux7ym32;
                        if (obj3 != null) {
                            obj2 = obj3;
                        }
                        ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
                    } else if (exvFNe8oO.q3BipwRCk(i2, 5)) {
                        Object obj4 = pt9s92nbr.J4Ux7ym32;
                        if (obj4 != null) {
                            obj2 = obj4;
                        }
                        ksLrMHgEz kslrmhgez3 = SBy3PdRIl.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez4 = SBy3PdRIl.J4Ux7ym32;
                        i = 2;
                    }
                    ((EBke9S31I) obj2).J4Ux7ym32(i);
                }
                return qih4lW99W.q3BipwRCk;
            default:
                List list = (List) obj;
                zRlqFnDB5 zrlqfndb52 = this.Bhmn1KIah.iiGwOFFnr;
                if (zrlqfndb52 != null) {
                    list.add(zrlqfndb52.q3BipwRCk);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
