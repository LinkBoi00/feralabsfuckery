package con;
/* loaded from: classes.dex */
public final class gIb52UzMw {
    public int J4Ux7ym32;
    public int dIocxURUo = -1;
    public int kCA6Zs9sL = -1;
    public final PRn0TTgqS q3BipwRCk;
    public int tGV7Q6urW;

    public gIb52UzMw(joIJ4ANvK joij4anvk, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = new PRn0TTgqS(joij4anvk.CBQ5d1kRq);
        this.J4Ux7ym32 = czCYotiRn.GPLPRo6go(j);
        this.tGV7Q6urW = czCYotiRn.iiGwOFFnr(j);
        int GPLPRo6go = czCYotiRn.GPLPRo6go(j);
        int iiGwOFFnr = czCYotiRn.iiGwOFFnr(j);
        if (GPLPRo6go < 0 || GPLPRo6go > joij4anvk.length()) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("start (", GPLPRo6go, ") offset is outside of text region ");
            q3BipwRCk.append(joij4anvk.length());
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        } else if (iiGwOFFnr < 0 || iiGwOFFnr > joij4anvk.length()) {
            StringBuilder q3BipwRCk2 = Lf6t4dzRk.q3BipwRCk("end (", iiGwOFFnr, ") offset is outside of text region ");
            q3BipwRCk2.append(joij4anvk.length());
            throw new IndexOutOfBoundsException(q3BipwRCk2.toString());
        } else if (GPLPRo6go > iiGwOFFnr) {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Do not set reversed range: ", GPLPRo6go, " > ", iiGwOFFnr));
        }
    }

    public final void GPLPRo6go(int i, int i2) {
        if (i < 0 || i > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("start (", i, ") offset is outside of text region ");
            q3BipwRCk.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        } else if (i2 < 0 || i2 > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk2 = Lf6t4dzRk.q3BipwRCk("end (", i2, ") offset is outside of text region ");
            q3BipwRCk2.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk2.toString());
        } else if (i < i2) {
            this.dIocxURUo = i;
            this.kCA6Zs9sL = i2;
        } else {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Do not set reversed or empty range: ", i, " > ", i2));
        }
    }

    public final void J4Ux7ym32(int i, int i2) {
        long iiGwOFFnr = ODug2UCW1.iiGwOFFnr(i, i2);
        this.q3BipwRCk.J4Ux7ym32(i, i2, "");
        long IytU16YUK = dnBSj5uJN.IytU16YUK(ODug2UCW1.iiGwOFFnr(this.J4Ux7ym32, this.tGV7Q6urW), iiGwOFFnr);
        this.J4Ux7ym32 = czCYotiRn.GPLPRo6go(IytU16YUK);
        this.tGV7Q6urW = czCYotiRn.iiGwOFFnr(IytU16YUK);
        if (kCA6Zs9sL()) {
            long IytU16YUK2 = dnBSj5uJN.IytU16YUK(ODug2UCW1.iiGwOFFnr(this.dIocxURUo, this.kCA6Zs9sL), iiGwOFFnr);
            if (czCYotiRn.tGV7Q6urW(IytU16YUK2)) {
                q3BipwRCk();
                return;
            }
            this.dIocxURUo = czCYotiRn.GPLPRo6go(IytU16YUK2);
            this.kCA6Zs9sL = czCYotiRn.iiGwOFFnr(IytU16YUK2);
        }
    }

    public final void Puu3Rhg4F(int i, int i2) {
        if (i < 0 || i > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("start (", i, ") offset is outside of text region ");
            q3BipwRCk.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        } else if (i2 < 0 || i2 > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk2 = Lf6t4dzRk.q3BipwRCk("end (", i2, ") offset is outside of text region ");
            q3BipwRCk2.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk2.toString());
        } else if (i <= i2) {
            this.J4Ux7ym32 = i;
            this.tGV7Q6urW = i2;
        } else {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Do not set reversed range: ", i, " > ", i2));
        }
    }

    public final int dIocxURUo() {
        return this.q3BipwRCk.q3BipwRCk();
    }

    public final void iiGwOFFnr(int i, int i2, String str) {
        if (i < 0 || i > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("start (", i, ") offset is outside of text region ");
            q3BipwRCk.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        } else if (i2 < 0 || i2 > this.q3BipwRCk.q3BipwRCk()) {
            StringBuilder q3BipwRCk2 = Lf6t4dzRk.q3BipwRCk("end (", i2, ") offset is outside of text region ");
            q3BipwRCk2.append(this.q3BipwRCk.q3BipwRCk());
            throw new IndexOutOfBoundsException(q3BipwRCk2.toString());
        } else if (i <= i2) {
            this.q3BipwRCk.J4Ux7ym32(i, i2, str);
            this.J4Ux7ym32 = str.length() + i;
            this.tGV7Q6urW = str.length() + i;
            this.dIocxURUo = -1;
            this.kCA6Zs9sL = -1;
        } else {
            throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Do not set reversed range: ", i, " > ", i2));
        }
    }

    public final boolean kCA6Zs9sL() {
        return this.dIocxURUo != -1;
    }

    public final void q3BipwRCk() {
        this.dIocxURUo = -1;
        this.kCA6Zs9sL = -1;
    }

    public final char tGV7Q6urW(int i) {
        String str;
        PRn0TTgqS pRn0TTgqS = this.q3BipwRCk;
        buIjhcyx1 buijhcyx1 = pRn0TTgqS.J4Ux7ym32;
        if (buijhcyx1 != null && i >= pRn0TTgqS.tGV7Q6urW) {
            int J4Ux7ym32 = buijhcyx1.J4Ux7ym32();
            int i2 = pRn0TTgqS.tGV7Q6urW;
            if (i < J4Ux7ym32 + i2) {
                int i3 = i - i2;
                int i4 = buijhcyx1.tGV7Q6urW;
                return i3 < i4 ? buijhcyx1.J4Ux7ym32[i3] : buijhcyx1.J4Ux7ym32[(i3 - i4) + buijhcyx1.dIocxURUo];
            }
            str = pRn0TTgqS.q3BipwRCk;
            i -= (J4Ux7ym32 - pRn0TTgqS.dIocxURUo) + i2;
        } else {
            str = pRn0TTgqS.q3BipwRCk;
        }
        return str.charAt(i);
    }

    public String toString() {
        return this.q3BipwRCk.toString();
    }
}
