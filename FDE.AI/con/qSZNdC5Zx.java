package con;
/* loaded from: classes.dex */
public final class qSZNdC5Zx extends Xqme2uw0r {
    public static final oWhsE8IPp dIocxURUo = new oWhsE8IPp(null, 21);
    public static qSZNdC5Zx kCA6Zs9sL;
    public pZznYi2iw tGV7Q6urW;

    public qSZNdC5Zx(dnBSj5uJN dnbsj5ujn) {
    }

    @Override // con.JHsfNVnhw
    public int[] J4Ux7ym32(int i) {
        int i2;
        sL9xhCFIS sl9xhcfis = sL9xhCFIS.Ltr;
        if (dIocxURUo().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > dIocxURUo().length()) {
            pZznYi2iw pzznyi2iw = this.tGV7Q6urW;
            if (pzznyi2iw == null) {
                pzznyi2iw = null;
            }
            i2 = pzznyi2iw.Puu3Rhg4F(dIocxURUo().length());
        } else {
            pZznYi2iw pzznyi2iw2 = this.tGV7Q6urW;
            if (pzznyi2iw2 == null) {
                pzznyi2iw2 = null;
            }
            int Puu3Rhg4F = pzznyi2iw2.Puu3Rhg4F(i);
            i2 = iiGwOFFnr(Puu3Rhg4F, sl9xhcfis) + 1 == i ? Puu3Rhg4F : Puu3Rhg4F - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return tGV7Q6urW(iiGwOFFnr(i2, sL9xhCFIS.Rtl), iiGwOFFnr(i2, sl9xhcfis) + 1);
    }

    public final int iiGwOFFnr(int i, sL9xhCFIS sl9xhcfis) {
        pZznYi2iw pzznyi2iw = this.tGV7Q6urW;
        pZznYi2iw pzznyi2iw2 = null;
        if (pzznyi2iw == null) {
            pzznyi2iw = null;
        }
        int CBQ5d1kRq = pzznyi2iw.CBQ5d1kRq(i);
        pZznYi2iw pzznyi2iw3 = this.tGV7Q6urW;
        if (pzznyi2iw3 == null) {
            pzznyi2iw3 = null;
        }
        if (sl9xhcfis != pzznyi2iw3.PSTqBLTET(CBQ5d1kRq)) {
            pZznYi2iw pzznyi2iw4 = this.tGV7Q6urW;
            if (pzznyi2iw4 != null) {
                pzznyi2iw2 = pzznyi2iw4;
            }
            return pzznyi2iw2.CBQ5d1kRq(i);
        }
        pZznYi2iw pzznyi2iw5 = this.tGV7Q6urW;
        if (pzznyi2iw5 != null) {
            pzznyi2iw2 = pzznyi2iw5;
        }
        return pZznYi2iw.GPLPRo6go(pzznyi2iw2, i, false, 2) - 1;
    }

    @Override // con.JHsfNVnhw
    public int[] q3BipwRCk(int i) {
        int i2;
        sL9xhCFIS sl9xhcfis = sL9xhCFIS.Rtl;
        if (dIocxURUo().length() <= 0 || i >= dIocxURUo().length()) {
            return null;
        }
        if (i < 0) {
            pZznYi2iw pzznyi2iw = this.tGV7Q6urW;
            if (pzznyi2iw == null) {
                pzznyi2iw = null;
            }
            i2 = pzznyi2iw.Puu3Rhg4F(0);
        } else {
            pZznYi2iw pzznyi2iw2 = this.tGV7Q6urW;
            if (pzznyi2iw2 == null) {
                pzznyi2iw2 = null;
            }
            int Puu3Rhg4F = pzznyi2iw2.Puu3Rhg4F(i);
            i2 = iiGwOFFnr(Puu3Rhg4F, sl9xhcfis) == i ? Puu3Rhg4F : Puu3Rhg4F + 1;
        }
        pZznYi2iw pzznyi2iw3 = this.tGV7Q6urW;
        if (pzznyi2iw3 == null) {
            pzznyi2iw3 = null;
        }
        if (i2 >= pzznyi2iw3.J4Ux7ym32.iiGwOFFnr) {
            return null;
        }
        return tGV7Q6urW(iiGwOFFnr(i2, sl9xhcfis), iiGwOFFnr(i2, sL9xhCFIS.Ltr) + 1);
    }
}
