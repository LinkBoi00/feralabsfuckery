package con;

import java.util.List;
/* loaded from: classes.dex */
public final class Lkusa3sxO implements Kh7ffW4RH {
    public final Kh7ffW4RH CBQ5d1kRq;
    public final gknx5HUb7 kmSgne1rO = new gknx5HUb7();

    public Lkusa3sxO(Kh7ffW4RH kh7ffW4RH) {
        this.CBQ5d1kRq = kh7ffW4RH;
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        return idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public adUS3SHb2 getKey() {
        return LQcLPKzab.CBQ5d1kRq;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return pz7YPhQTU.RG6kpfv3v(this, adus3shb2);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r8 == r1) goto L_0x007a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:32:0x008b, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // con.Kh7ffW4RH
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        voqXHI10U voqxhi10u;
        int i;
        Lkusa3sxO lkusa3sxO;
        boolean z;
        Object obj;
        if (way959ade instanceof voqXHI10U) {
            voqxhi10u = (voqXHI10U) way959ade;
            int i2 = voqxhi10u.Eeka1udhb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voqxhi10u.Eeka1udhb = i2 - Integer.MIN_VALUE;
                Object obj2 = voqxhi10u.ilHKhw3Yw;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = voqxhi10u.Eeka1udhb;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj2);
                    gknx5HUb7 gknx5hub7 = this.kmSgne1rO;
                    voqxhi10u.PSTqBLTET = this;
                    voqxhi10u.MzoOEjc4X = pmanMZxiM;
                    voqxhi10u.Eeka1udhb = 1;
                    synchronized (gknx5hub7.J4Ux7ym32) {
                        z = gknx5hub7.kCA6Zs9sL;
                    }
                    if (!z) {
                        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(voqxhi10u), 1);
                        tmgchdfqu.Eeka1udhb();
                        synchronized (gknx5hub7.J4Ux7ym32) {
                            ((List) gknx5hub7.tGV7Q6urW).add(tmgchdfqu);
                        }
                        tmgchdfqu.RG6kpfv3v(new dMQC97DHs(gknx5hub7, tmgchdfqu));
                        obj = tmgchdfqu.qVUwofr5s();
                    }
                    obj = qih4lW99W.q3BipwRCk;
                    if (obj == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    lkusa3sxO = this;
                } else if (i == 1) {
                    pmanMZxiM = (PmanMZxiM) voqxhi10u.MzoOEjc4X;
                    lkusa3sxO = (Lkusa3sxO) voqxhi10u.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj2);
                } else if (i == 2) {
                    anXlDk6fV.IytU16YUK(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Kh7ffW4RH kh7ffW4RH = lkusa3sxO.CBQ5d1kRq;
                voqxhi10u.PSTqBLTET = null;
                voqxhi10u.MzoOEjc4X = null;
                voqxhi10u.Eeka1udhb = 2;
                obj2 = kh7ffW4RH.q3BipwRCk(pmanMZxiM, voqxhi10u);
                return obj2 != kbkjsqcsl ? kbkjsqcsl : obj2;
            }
        }
        voqxhi10u = new voqXHI10U(this, way959ade);
        Object obj22 = voqxhi10u.ilHKhw3Yw;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = voqxhi10u.Eeka1udhb;
        if (i != 0) {
        }
        Kh7ffW4RH kh7ffW4RH2 = lkusa3sxO.CBQ5d1kRq;
        voqxhi10u.PSTqBLTET = null;
        voqxhi10u.MzoOEjc4X = null;
        voqxhi10u.Eeka1udhb = 2;
        obj22 = kh7ffW4RH2.q3BipwRCk(pmanMZxiM, voqxhi10u);
        if (obj22 != kbkjsqcsl2) {
        }
    }
}
