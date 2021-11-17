package con;
/* loaded from: classes.dex */
public abstract class Cb827Z4La extends qhaZGYFO8 {
    public azsj7uixB NyWTwPF6V;
    public boolean i0Zug1mVk;
    public qhaZGYFO8 mUqPm6GBh;
    public boolean vNtjxmzUM;

    public Cb827Z4La(qhaZGYFO8 qhazgyfo8, azsj7uixB azsj7uixb) {
        super(qhazgyfo8.MzoOEjc4X);
        this.mUqPm6GBh = qhazgyfo8;
        this.NyWTwPF6V = azsj7uixb;
        qhazgyfo8.ilHKhw3Yw = this;
    }

    @Override // con.HqmYLYbvB
    public Object Bhmn1KIah() {
        return this.mUqPm6GBh.Bhmn1KIah();
    }

    @Override // con.qhaZGYFO8
    public KB2jjcOAK DuuXfa7LE() {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 == null) {
            return null;
        }
        return qhazgyfo8.DuuXfa7LE();
    }

    public final void GpWTsCbvo(azsj7uixB azsj7uixb) {
        if (azsj7uixb == XGA7b0zuB()) {
            return;
        }
        if (anXlDk6fV.tGV7Q6urW(azsj7uixb.getClass(), XGA7b0zuB().getClass())) {
            eUlgH2VO7(azsj7uixb);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // con.qhaZGYFO8
    public qhaZGYFO8 IG30YE5GU() {
        return this.mUqPm6GBh;
    }

    @Override // con.qhaZGYFO8
    public KB2jjcOAK IzM1cD9ly(boolean z) {
        return this.mUqPm6GBh.IzM1cD9ly(z);
    }

    @Override // con.qhaZGYFO8
    public void KlYagMRWx(long j, ugecCdPSw ugeccdpsw) {
        if (oRfL5Lv1q(j, true)) {
            this.mUqPm6GBh.KlYagMRWx(this.mUqPm6GBh.INnK5Rew6(j), ugeccdpsw);
        }
    }

    public final long LFW0KvNFt(long j) {
        return gThLCaTO1.J4Ux7ym32(Math.max(0.0f, (tbzY8QG6X.kCA6Zs9sL(j) - ((float) i0Zug1mVk())) / 2.0f), Math.max(0.0f, (tbzY8QG6X.tGV7Q6urW(j) - ((float) vNtjxmzUM())) / 2.0f));
    }

    @Override // con.HqmYLYbvB
    public int RG6kpfv3v(int i) {
        return this.mUqPm6GBh.RG6kpfv3v(i);
    }

    public azsj7uixB XGA7b0zuB() {
        return this.NyWTwPF6V;
    }

    @Override // con.qhaZGYFO8
    public jgMsl7cgu XYT7vJqNO() {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 == null) {
            return null;
        }
        return qhazgyfo8.XYT7vJqNO();
    }

    public final void Xeg1rC5FI(long j, ugecCdPSw ugeccdpsw, boolean z, boolean z2, Object obj, gdEmqfwpT gdemqfwpt) {
        if (oRfL5Lv1q(j, z2)) {
            float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
            float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
            boolean z3 = false;
            if (tGV7Q6urW >= 0.0f && dIocxURUo >= 0.0f && tGV7Q6urW < ((float) i0Zug1mVk()) && dIocxURUo < ((float) vNtjxmzUM())) {
                ugeccdpsw.kCA6Zs9sL(obj, -1.0f, gdemqfwpt);
                return;
            }
            long a8N8UmDyD = a8N8UmDyD(j);
            float max = Math.max(bRgfgYIQX.tGV7Q6urW(a8N8UmDyD), bRgfgYIQX.dIocxURUo(a8N8UmDyD));
            if (z2) {
                long LFW0KvNFt = LFW0KvNFt(Dr7UqlxEV());
                float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(LFW0KvNFt);
                float tGV7Q6urW2 = tbzY8QG6X.tGV7Q6urW(LFW0KvNFt);
                if ((kCA6Zs9sL > 0.0f || tGV7Q6urW2 > 0.0f) && bRgfgYIQX.tGV7Q6urW(a8N8UmDyD) <= kCA6Zs9sL && bRgfgYIQX.dIocxURUo(a8N8UmDyD) <= tGV7Q6urW2) {
                    if (ugeccdpsw.Bhmn1KIah == idpM54xlp.CBQ5d1kRq(ugeccdpsw) || ugeccdpsw.J4Ux7ym32() > max) {
                        z3 = true;
                    }
                    if (z3) {
                        ugeccdpsw.kCA6Zs9sL(obj, max, gdemqfwpt);
                    }
                }
            }
            if (!z) {
                gdemqfwpt.GPLPRo6go();
            } else if (ugeccdpsw.Bhmn1KIah == idpM54xlp.CBQ5d1kRq(ugeccdpsw)) {
                ugeccdpsw.kCA6Zs9sL(obj, max, gdemqfwpt);
                if (ugeccdpsw.Bhmn1KIah + 1 == idpM54xlp.CBQ5d1kRq(ugeccdpsw)) {
                    ugeccdpsw.iiGwOFFnr();
                }
            } else {
                float J4Ux7ym32 = ugeccdpsw.J4Ux7ym32();
                int i = ugeccdpsw.Bhmn1KIah;
                ugeccdpsw.Bhmn1KIah = idpM54xlp.CBQ5d1kRq(ugeccdpsw);
                ugeccdpsw.kCA6Zs9sL(obj, max, gdemqfwpt);
                if (ugeccdpsw.Bhmn1KIah + 1 < idpM54xlp.CBQ5d1kRq(ugeccdpsw) && J4Ux7ym32 > ugeccdpsw.J4Ux7ym32()) {
                    int i2 = ugeccdpsw.Bhmn1KIah + 1;
                    int i3 = i + 1;
                    Object[] objArr = ugeccdpsw.CBQ5d1kRq;
                    System.arraycopy(objArr, i2, objArr, i3, ugeccdpsw.PSTqBLTET - i2);
                    float[] fArr = ugeccdpsw.kmSgne1rO;
                    System.arraycopy(fArr, i2, fArr, i3, ugeccdpsw.PSTqBLTET - i2);
                    ugeccdpsw.Bhmn1KIah = ((ugeccdpsw.PSTqBLTET + i) - ugeccdpsw.Bhmn1KIah) - 1;
                }
                ugeccdpsw.iiGwOFFnr();
                ugeccdpsw.Bhmn1KIah = i;
            }
        }
    }

    @Override // con.qhaZGYFO8
    public void aS2AFthYA(SI0VpKubr sI0VpKubr) {
        this.mUqPm6GBh.QSbMsHU5X(sI0VpKubr);
    }

    @Override // con.qhaZGYFO8
    public void buPcffgdD(long j, ugecCdPSw ugeccdpsw, boolean z) {
        if (oRfL5Lv1q(j, z)) {
            this.mUqPm6GBh.buPcffgdD(this.mUqPm6GBh.INnK5Rew6(j), ugeccdpsw, z);
        }
    }

    @Override // con.HqmYLYbvB
    public int cAwN510t2(int i) {
        return this.mUqPm6GBh.cAwN510t2(i);
    }

    @Override // con.hKxHUWEcH
    public n2gATecRC dIocxURUo(long j) {
        if (!K5PjwoFCN.J4Ux7ym32(this.PSTqBLTET, j)) {
            this.PSTqBLTET = j;
            V9LQMKGJe();
        }
        ifDs8fRNm(new Em5KbHegW(this, this.mUqPm6GBh.dIocxURUo(j)));
        return this;
    }

    public void eUlgH2VO7(azsj7uixB azsj7uixb) {
        this.NyWTwPF6V = azsj7uixb;
    }

    @Override // con.qhaZGYFO8
    public int juJ6pnCpu(OGQYjfdsY oGQYjfdsY) {
        return this.mUqPm6GBh.i8XZMQc6Z(oGQYjfdsY);
    }

    @Override // con.HqmYLYbvB
    public int kCA6Zs9sL(int i) {
        return this.mUqPm6GBh.kCA6Zs9sL(i);
    }

    @Override // con.qhaZGYFO8
    public vo9l1HK5r kktL0P5MG() {
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        if (qhazgyfo8 == null) {
            return null;
        }
        return qhazgyfo8.kktL0P5MG();
    }

    @Override // con.qhaZGYFO8
    public FRJidynr8 ln3nf7LH3() {
        return this.mUqPm6GBh.ln3nf7LH3();
    }

    @Override // con.qhaZGYFO8
    public vo9l1HK5r n4UIOvAko() {
        return this.mUqPm6GBh.n4UIOvAko();
    }

    @Override // con.qhaZGYFO8, con.n2gATecRC
    public void o4LF8RkoQ(long j, float f, PmanMZxiM pmanMZxiM) {
        super.o4LF8RkoQ(j, f, pmanMZxiM);
        qhaZGYFO8 qhazgyfo8 = this.ilHKhw3Yw;
        boolean z = false;
        if (qhazgyfo8 != null && qhazgyfo8.cAwN510t2) {
            z = true;
        }
        if (!z) {
            int tGV7Q6urW = YWiUMZOtw.tGV7Q6urW(this.Bhmn1KIah);
            BFRsKhrQv layoutDirection = ln3nf7LH3().getLayoutDirection();
            int i = vXUgPfyfe.tGV7Q6urW;
            BFRsKhrQv bFRsKhrQv = vXUgPfyfe.J4Ux7ym32;
            vXUgPfyfe.tGV7Q6urW = tGV7Q6urW;
            vXUgPfyfe.J4Ux7ym32 = layoutDirection;
            SuKhTJIQc().tGV7Q6urW();
            vXUgPfyfe.tGV7Q6urW = i;
            vXUgPfyfe.J4Ux7ym32 = bFRsKhrQv;
        }
    }

    @Override // con.HqmYLYbvB
    public int qFBXIgpia(int i) {
        return this.mUqPm6GBh.qFBXIgpia(i);
    }

    @Override // con.qhaZGYFO8
    public jgMsl7cgu wIZEdYHUn() {
        jgMsl7cgu XYT7vJqNO = this.MzoOEjc4X.o4LF8RkoQ.XYT7vJqNO();
        if (XYT7vJqNO != this) {
            return XYT7vJqNO;
        }
        return null;
    }

    @Override // con.qhaZGYFO8
    public KB2jjcOAK ziwPzaoF3() {
        KB2jjcOAK IzM1cD9ly = IzM1cD9ly(false);
        KB2jjcOAK kB2jjcOAK = null;
        while (IzM1cD9ly != null) {
            IzM1cD9ly = IzM1cD9ly.mUqPm6GBh.IzM1cD9ly(false);
            kB2jjcOAK = IzM1cD9ly;
        }
        return kB2jjcOAK;
    }
}
