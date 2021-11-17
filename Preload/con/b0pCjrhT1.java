package con;
/* loaded from: classes.dex */
public final class b0pCjrhT1 {
    public final boolean J4Ux7ym32;
    public final S4g0LufWW dIocxURUo;
    public final ypLiboX2O iiGwOFFnr;
    public final IzQNDLr32 kCA6Zs9sL;
    public final njjwS3RZT q3BipwRCk;
    public final UBY2Inzw8 tGV7Q6urW;

    public b0pCjrhT1(njjwS3RZT njjws3rzt, boolean z, UBY2Inzw8 uBY2Inzw8, S4g0LufWW s4g0LufWW, IzQNDLr32 izQNDLr32, ypLiboX2O yplibox2o) {
        this.q3BipwRCk = njjws3rzt;
        this.J4Ux7ym32 = z;
        this.tGV7Q6urW = uBY2Inzw8;
        this.dIocxURUo = s4g0LufWW;
        this.kCA6Zs9sL = izQNDLr32;
        this.iiGwOFFnr = yplibox2o;
    }

    public final long GPLPRo6go(float f) {
        if (!(f == 0.0f)) {
            return this.q3BipwRCk == njjwS3RZT.Horizontal ? ODug2UCW1.dIocxURUo(f, 0.0f) : ODug2UCW1.dIocxURUo(0.0f, f);
        }
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object J4Ux7ym32(long j, Way959ade way959ade) {
        ewrtVrXuK ewrtvrxuk;
        int i;
        LdusiAGzX ldusiAGzX;
        if (way959ade instanceof ewrtVrXuK) {
            ewrtvrxuk = (ewrtVrXuK) way959ade;
            int i2 = ewrtvrxuk.qVUwofr5s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ewrtvrxuk.qVUwofr5s = i2 - Integer.MIN_VALUE;
                Object obj = ewrtvrxuk.MzoOEjc4X;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = ewrtvrxuk.qVUwofr5s;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    LdusiAGzX ldusiAGzX2 = new LdusiAGzX();
                    ldusiAGzX2.CBQ5d1kRq = j;
                    S4g0LufWW s4g0LufWW = this.dIocxURUo;
                    hjxs63DIF hjxs63dif = new hjxs63DIF(this, ldusiAGzX2, j, null);
                    ewrtvrxuk.PSTqBLTET = ldusiAGzX2;
                    ewrtvrxuk.qVUwofr5s = 1;
                    if (s4g0LufWW.J4Ux7ym32((r4 & 1) != 0 ? s1x258HRp.Default : null, hjxs63dif, ewrtvrxuk) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    ldusiAGzX = ldusiAGzX2;
                } else if (i == 1) {
                    ldusiAGzX = (LdusiAGzX) ewrtvrxuk.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return new yqaDqocAW(ldusiAGzX.CBQ5d1kRq);
            }
        }
        ewrtvrxuk = new ewrtVrXuK(this, way959ade);
        Object obj2 = ewrtvrxuk.MzoOEjc4X;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = ewrtvrxuk.qVUwofr5s;
        if (i != 0) {
        }
        return new yqaDqocAW(ldusiAGzX.CBQ5d1kRq);
    }

    public final long Puu3Rhg4F(float f) {
        return this.q3BipwRCk == njjwS3RZT.Horizontal ? iOdo7IZgc.q3BipwRCk(f, 0.0f) : iOdo7IZgc.q3BipwRCk(0.0f, f);
    }

    public final float dIocxURUo(float f) {
        return this.J4Ux7ym32 ? f * ((float) -1) : f;
    }

    public final float iiGwOFFnr(long j) {
        return this.q3BipwRCk == njjwS3RZT.Horizontal ? bRgfgYIQX.tGV7Q6urW(j) : bRgfgYIQX.dIocxURUo(j);
    }

    public final float kCA6Zs9sL(long j) {
        return this.q3BipwRCk == njjwS3RZT.Horizontal ? yqaDqocAW.J4Ux7ym32(j) : yqaDqocAW.tGV7Q6urW(j);
    }

    public final float q3BipwRCk(tDmftakZl tdmftakzl, float f, bRgfgYIQX brgfgyiqx, int i) {
        long j;
        long j2;
        ypLiboX2O yplibox2o = this.iiGwOFFnr;
        float iiGwOFFnr = f - (yplibox2o == null ? 0.0f : iiGwOFFnr(yplibox2o.GPLPRo6go(GPLPRo6go(f), brgfgyiqx, i)));
        ZlqqdUjab zlqqdUjab = (ZlqqdUjab) this.tGV7Q6urW.getValue();
        long GPLPRo6go = GPLPRo6go(iiGwOFFnr);
        BheGN9HzV bheGN9HzV = zlqqdUjab.tGV7Q6urW;
        if (bheGN9HzV == null) {
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            j = bRgfgYIQX.tGV7Q6urW;
        } else {
            j = bheGN9HzV.q3BipwRCk(GPLPRo6go, i);
        }
        float iiGwOFFnr2 = iiGwOFFnr - iiGwOFFnr(j);
        float dIocxURUo = dIocxURUo(tdmftakzl.q3BipwRCk(dIocxURUo(iiGwOFFnr2)));
        float f2 = iiGwOFFnr2 - dIocxURUo;
        long GPLPRo6go2 = GPLPRo6go(dIocxURUo);
        long GPLPRo6go3 = GPLPRo6go(f2);
        BheGN9HzV bheGN9HzV2 = zlqqdUjab.tGV7Q6urW;
        if (bheGN9HzV2 == null) {
            JhpbRXxsg jhpbRXxsg2 = bRgfgYIQX.J4Ux7ym32;
            j2 = bRgfgYIQX.tGV7Q6urW;
        } else {
            j2 = bheGN9HzV2.J4Ux7ym32(GPLPRo6go2, GPLPRo6go3, i);
        }
        ypLiboX2O yplibox2o2 = this.iiGwOFFnr;
        if (yplibox2o2 != null) {
            yplibox2o2.kCA6Zs9sL(GPLPRo6go(iiGwOFFnr2), GPLPRo6go(f2 - iiGwOFFnr(j2)), brgfgyiqx, i);
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object tGV7Q6urW(float f, Way959ade way959ade) {
        DCEpaIqGN dCEpaIqGN;
        Object obj;
        kBKJSqCSL kbkjsqcsl;
        int i;
        b0pCjrhT1 b0pcjrht1;
        long j;
        ypLiboX2O yplibox2o;
        ypLiboX2O yplibox2o2;
        long j2;
        long j3;
        float f2;
        if (way959ade instanceof DCEpaIqGN) {
            dCEpaIqGN = (DCEpaIqGN) way959ade;
            int i2 = dCEpaIqGN.Eeka1udhb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dCEpaIqGN.Eeka1udhb = i2 - Integer.MIN_VALUE;
                obj = dCEpaIqGN.ilHKhw3Yw;
                kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = dCEpaIqGN.Eeka1udhb;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    ypLiboX2O yplibox2o3 = this.iiGwOFFnr;
                    if (yplibox2o3 == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = kCA6Zs9sL(yplibox2o3.tGV7Q6urW(Puu3Rhg4F(f)));
                    }
                    long Puu3Rhg4F = Puu3Rhg4F(f - f2);
                    dCEpaIqGN.PSTqBLTET = this;
                    dCEpaIqGN.MzoOEjc4X = Puu3Rhg4F;
                    dCEpaIqGN.Eeka1udhb = 1;
                    Object J4Ux7ym32 = ((ZlqqdUjab) this.tGV7Q6urW.getValue()).J4Ux7ym32(Puu3Rhg4F, dCEpaIqGN);
                    if (J4Ux7ym32 == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    j3 = Puu3Rhg4F;
                    obj = J4Ux7ym32;
                    b0pcjrht1 = this;
                } else if (i == 1) {
                    j3 = dCEpaIqGN.MzoOEjc4X;
                    b0pcjrht1 = (b0pCjrhT1) dCEpaIqGN.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else if (i == 2) {
                    j2 = dCEpaIqGN.MzoOEjc4X;
                    b0pcjrht1 = (b0pCjrhT1) dCEpaIqGN.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                    long j4 = ((yqaDqocAW) obj).q3BipwRCk;
                    long dIocxURUo = yqaDqocAW.dIocxURUo(j2, j4);
                    dCEpaIqGN.PSTqBLTET = b0pcjrht1;
                    dCEpaIqGN.MzoOEjc4X = j4;
                    dCEpaIqGN.Eeka1udhb = 3;
                    obj = ((ZlqqdUjab) b0pcjrht1.tGV7Q6urW.getValue()).q3BipwRCk(dIocxURUo, j4, dCEpaIqGN);
                    if (obj != kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    j = j4;
                    long dIocxURUo2 = yqaDqocAW.dIocxURUo(j, ((yqaDqocAW) obj).q3BipwRCk);
                    yplibox2o = b0pcjrht1.iiGwOFFnr;
                    if (yplibox2o != null) {
                    }
                    yplibox2o2 = b0pcjrht1.iiGwOFFnr;
                    if (yplibox2o2 != null) {
                    }
                    return qih4lW99W.q3BipwRCk;
                } else if (i == 3) {
                    j = dCEpaIqGN.MzoOEjc4X;
                    b0pcjrht1 = (b0pCjrhT1) dCEpaIqGN.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                    long dIocxURUo22 = yqaDqocAW.dIocxURUo(j, ((yqaDqocAW) obj).q3BipwRCk);
                    yplibox2o = b0pcjrht1.iiGwOFFnr;
                    if (yplibox2o != null) {
                        yplibox2o.q3BipwRCk(b0pcjrht1.Puu3Rhg4F(b0pcjrht1.kCA6Zs9sL(dIocxURUo22)));
                    }
                    yplibox2o2 = b0pcjrht1.iiGwOFFnr;
                    if (yplibox2o2 != null) {
                        yplibox2o2.J4Ux7ym32();
                    }
                    return qih4lW99W.q3BipwRCk;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long dIocxURUo3 = yqaDqocAW.dIocxURUo(j3, ((yqaDqocAW) obj).q3BipwRCk);
                dCEpaIqGN.PSTqBLTET = b0pcjrht1;
                dCEpaIqGN.MzoOEjc4X = dIocxURUo3;
                dCEpaIqGN.Eeka1udhb = 2;
                obj = b0pcjrht1.J4Ux7ym32(dIocxURUo3, dCEpaIqGN);
                if (obj != kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                j2 = dIocxURUo3;
                long j42 = ((yqaDqocAW) obj).q3BipwRCk;
                long dIocxURUo4 = yqaDqocAW.dIocxURUo(j2, j42);
                dCEpaIqGN.PSTqBLTET = b0pcjrht1;
                dCEpaIqGN.MzoOEjc4X = j42;
                dCEpaIqGN.Eeka1udhb = 3;
                obj = ((ZlqqdUjab) b0pcjrht1.tGV7Q6urW.getValue()).q3BipwRCk(dIocxURUo4, j42, dCEpaIqGN);
                if (obj != kbkjsqcsl) {
                }
            }
        }
        dCEpaIqGN = new DCEpaIqGN(this, way959ade);
        obj = dCEpaIqGN.ilHKhw3Yw;
        kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = dCEpaIqGN.Eeka1udhb;
        if (i != 0) {
        }
        long dIocxURUo32 = yqaDqocAW.dIocxURUo(j3, ((yqaDqocAW) obj).q3BipwRCk);
        dCEpaIqGN.PSTqBLTET = b0pcjrht1;
        dCEpaIqGN.MzoOEjc4X = dIocxURUo32;
        dCEpaIqGN.Eeka1udhb = 2;
        obj = b0pcjrht1.J4Ux7ym32(dIocxURUo32, dCEpaIqGN);
        if (obj != kbkjsqcsl) {
        }
    }
}
