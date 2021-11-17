package con;
/* loaded from: classes.dex */
public final class K9d5WfFhw extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ float Bhmn1KIah;
    public final /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ int kmSgne1rO = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9d5WfFhw(float f, JZuV4yGnu jZuV4yGnu, R7CNZOOL2 r7cnzool2, bZmnXN812 bzmnxn812) {
        super(1);
        this.Bhmn1KIah = f;
        this.PSTqBLTET = jZuV4yGnu;
        this.MzoOEjc4X = r7cnzool2;
        this.ilHKhw3Yw = bzmnxn812;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        int i;
        float f;
        bZmnXN812 bzmnxn812;
        BhVgBe4oG bhVgBe4oG;
        switch (this.kmSgne1rO) {
            case 0:
                Szv4I4Bzo szv4I4Bzo = (Szv4I4Bzo) obj;
                boolean z = true;
                if (!(iOdo7IZgc.iiGwOFFnr(szv4I4Bzo, this.Bhmn1KIah) >= 0.0f && tbzY8QG6X.dIocxURUo(szv4I4Bzo.q3BipwRCk()) > 0.0f)) {
                    BhVgBe4oG bhVgBe4oG2 = new BhVgBe4oG(GQN3dSqKV.sk5s77z6Q);
                    szv4I4Bzo.kmSgne1rO = bhVgBe4oG2;
                    return bhVgBe4oG2;
                }
                if (lRwPpHNL9.q3BipwRCk(this.Bhmn1KIah, 0.0f)) {
                    f = 1.0f;
                } else {
                    f = (float) Math.ceil((double) iOdo7IZgc.iiGwOFFnr(szv4I4Bzo, this.Bhmn1KIah));
                }
                float f2 = (float) 2;
                float min = Math.min(f, (float) Math.ceil((double) (tbzY8QG6X.dIocxURUo(szv4I4Bzo.q3BipwRCk()) / f2)));
                float f3 = min / f2;
                long dIocxURUo = ODug2UCW1.dIocxURUo(f3, f3);
                long J4Ux7ym32 = gThLCaTO1.J4Ux7ym32(tbzY8QG6X.kCA6Zs9sL(szv4I4Bzo.q3BipwRCk()) - min, tbzY8QG6X.tGV7Q6urW(szv4I4Bzo.q3BipwRCk()) - min);
                if (f2 * min <= tbzY8QG6X.dIocxURUo(szv4I4Bzo.q3BipwRCk())) {
                    z = false;
                }
                FHtrhXyto q3BipwRCk = ((JZuV4yGnu) this.PSTqBLTET).q3BipwRCk(szv4I4Bzo.q3BipwRCk(), szv4I4Bzo.getLayoutDirection(), szv4I4Bzo);
                if (q3BipwRCk instanceof iJM2jNPIz) {
                    R7CNZOOL2 r7cnzool2 = (R7CNZOOL2) this.MzoOEjc4X;
                    bZmnXN812 bzmnxn8122 = (bZmnXN812) this.ilHKhw3Yw;
                    iJM2jNPIz ijm2jnpiz = (iJM2jNPIz) q3BipwRCk;
                    if (ODug2UCW1.iMyQMM6Qj(ijm2jnpiz.q3BipwRCk)) {
                        bhVgBe4oG = new BhVgBe4oG(new Mfr9RlRGa(z, bzmnxn8122, ijm2jnpiz.q3BipwRCk.kCA6Zs9sL, f3, min, dIocxURUo, J4Ux7ym32, new yEz1ivYb6(min, 0.0f, 0, 0, 30)));
                    } else {
                        RFvh4RAur yWvV4ePLl = WAflFGuGp.yWvV4ePLl(r7cnzool2);
                        A128gLXzp a128gLXzp = yWvV4ePLl.dIocxURUo;
                        if (a128gLXzp == null) {
                            a128gLXzp = xP6F5SR9v.iiGwOFFnr();
                            yWvV4ePLl.dIocxURUo = a128gLXzp;
                        }
                        wOXdxhlrk woxdxhlrk = ijm2jnpiz.q3BipwRCk;
                        Q3Qxqu4re q3Qxqu4re = (Q3Qxqu4re) a128gLXzp;
                        q3Qxqu4re.q3BipwRCk.reset();
                        q3Qxqu4re.J4Ux7ym32(woxdxhlrk);
                        if (!z) {
                            A128gLXzp iiGwOFFnr = xP6F5SR9v.iiGwOFFnr();
                            float J4Ux7ym322 = woxdxhlrk.J4Ux7ym32() - min;
                            float q3BipwRCk2 = woxdxhlrk.q3BipwRCk() - min;
                            long kmSgne1rO = WAflFGuGp.kmSgne1rO(woxdxhlrk.kCA6Zs9sL, min);
                            long kmSgne1rO2 = WAflFGuGp.kmSgne1rO(woxdxhlrk.iiGwOFFnr, min);
                            long kmSgne1rO3 = WAflFGuGp.kmSgne1rO(woxdxhlrk.Puu3Rhg4F, min);
                            long kmSgne1rO4 = WAflFGuGp.kmSgne1rO(woxdxhlrk.GPLPRo6go, min);
                            bzmnxn812 = bzmnxn8122;
                            ((Q3Qxqu4re) iiGwOFFnr).J4Ux7ym32(new wOXdxhlrk(min, min, J4Ux7ym322, q3BipwRCk2, kmSgne1rO, kmSgne1rO2, kmSgne1rO4, kmSgne1rO3, null));
                            oWhsE8IPp owhse8ipp = anYMrvy8z.q3BipwRCk;
                            oWhsE8IPp owhse8ipp2 = anYMrvy8z.q3BipwRCk;
                            q3Qxqu4re.dIocxURUo(q3Qxqu4re, iiGwOFFnr, 0);
                        } else {
                            bzmnxn812 = bzmnxn8122;
                        }
                        bhVgBe4oG = new BhVgBe4oG(new dMQC97DHs(a128gLXzp, bzmnxn812));
                    }
                    szv4I4Bzo.kmSgne1rO = bhVgBe4oG;
                    return bhVgBe4oG;
                } else if (q3BipwRCk instanceof MFcZC5k5k) {
                    bZmnXN812 bzmnxn8123 = (bZmnXN812) this.ilHKhw3Yw;
                    if (z) {
                        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                        dIocxURUo = bRgfgYIQX.tGV7Q6urW;
                    }
                    if (z) {
                        J4Ux7ym32 = szv4I4Bzo.q3BipwRCk();
                    }
                    BhVgBe4oG bhVgBe4oG3 = new BhVgBe4oG(new ZV1n1oP0C(bzmnxn8123, dIocxURUo, J4Ux7ym32, z ? WweMzMHJu.q3BipwRCk : new yEz1ivYb6(min, 0.0f, 0, 0, 30)));
                    szv4I4Bzo.kmSgne1rO = bhVgBe4oG3;
                    return bhVgBe4oG3;
                } else {
                    throw new dnCerKhAM();
                }
            default:
                HAVKqwFVy q3BipwRCk3 = ((A2fLYD2UL) obj).q3BipwRCk(((CSCtv8Wiy) this.PSTqBLTET).q3BipwRCk);
                yj0abztt3 yj0abztt3 = (yj0abztt3) this.MzoOEjc4X;
                brVSm9F9Z brvsm9f9z = (brVSm9F9Z) this.ilHKhw3Yw;
                float f4 = this.Bhmn1KIah;
                kkcQgCx5G[][] kkcqgcx5gArr = CSCtv8Wiy.oon79WMrY;
                switch (yj0abztt3.q3BipwRCk) {
                    case 0:
                        i = yj0abztt3.tGV7Q6urW;
                        break;
                    default:
                        i = yj0abztt3.tGV7Q6urW;
                        break;
                }
                ((HAVKqwFVy) kkcqgcx5gArr[i][brvsm9f9z.J4Ux7ym32].WaUP0CF08(q3BipwRCk3, brvsm9f9z.q3BipwRCk)).oon79WMrY(new lRwPpHNL9(f4));
                return qih4lW99W.q3BipwRCk;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9d5WfFhw(CSCtv8Wiy cSCtv8Wiy, yj0abztt3 yj0abztt3, brVSm9F9Z brvsm9f9z, float f) {
        super(1);
        this.PSTqBLTET = cSCtv8Wiy;
        this.MzoOEjc4X = yj0abztt3;
        this.ilHKhw3Yw = brvsm9f9z;
        this.Bhmn1KIah = f;
    }
}
