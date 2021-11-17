package con;
/* loaded from: classes.dex */
public final class eP3ZpMpES implements AU29aHa4X {
    public boolean Bhmn1KIah;
    public final /* synthetic */ AU29aHa4X CBQ5d1kRq;
    public final BoHshzX5h PSTqBLTET = new eIPvIAVtY(false);
    public boolean kmSgne1rO;

    public eP3ZpMpES(AU29aHa4X aU29aHa4X) {
        this.CBQ5d1kRq = aU29aHa4X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object GPLPRo6go(Way959ade way959ade) {
        WDsAzqM9T wDsAzqM9T;
        int i;
        eP3ZpMpES ep3zpmpes;
        if (way959ade instanceof WDsAzqM9T) {
            wDsAzqM9T = (WDsAzqM9T) way959ade;
            int i2 = wDsAzqM9T.qVUwofr5s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wDsAzqM9T.qVUwofr5s = i2 - Integer.MIN_VALUE;
                Object obj = wDsAzqM9T.MzoOEjc4X;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = wDsAzqM9T.qVUwofr5s;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    if (!this.kmSgne1rO && !this.Bhmn1KIah) {
                        BoHshzX5h boHshzX5h = this.PSTqBLTET;
                        wDsAzqM9T.PSTqBLTET = this;
                        wDsAzqM9T.qVUwofr5s = 1;
                        if (((eIPvIAVtY) boHshzX5h).q3BipwRCk(null, wDsAzqM9T) == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                    }
                    ep3zpmpes = this;
                } else if (i == 1) {
                    ep3zpmpes = (eP3ZpMpES) wDsAzqM9T.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boolean.valueOf(ep3zpmpes.kmSgne1rO);
            }
        }
        wDsAzqM9T = new WDsAzqM9T(this, way959ade);
        Object obj2 = wDsAzqM9T.MzoOEjc4X;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = wDsAzqM9T.qVUwofr5s;
        if (i != 0) {
        }
        return Boolean.valueOf(ep3zpmpes.kmSgne1rO);
    }

    public final void J4Ux7ym32() {
        this.Bhmn1KIah = true;
        ((eIPvIAVtY) this.PSTqBLTET).tGV7Q6urW(null);
    }

    @Override // con.AU29aHa4X
    public float MzoOEjc4X(float f) {
        return this.CBQ5d1kRq.MzoOEjc4X(f);
    }

    @Override // con.AU29aHa4X
    public long PSTqBLTET(long j) {
        return this.CBQ5d1kRq.PSTqBLTET(j);
    }

    public final void dIocxURUo() {
        this.kmSgne1rO = true;
        ((eIPvIAVtY) this.PSTqBLTET).tGV7Q6urW(null);
    }

    @Override // con.AU29aHa4X
    public float dfpT1j18n(int i) {
        return this.CBQ5d1kRq.dfpT1j18n(i);
    }

    @Override // con.AU29aHa4X
    public float getDensity() {
        return this.CBQ5d1kRq.getDensity();
    }

    @Override // con.AU29aHa4X
    public int iiGwOFFnr(float f) {
        return this.CBQ5d1kRq.iiGwOFFnr(f);
    }

    @Override // con.AU29aHa4X
    public float ilHKhw3Yw(long j) {
        return this.CBQ5d1kRq.ilHKhw3Yw(j);
    }

    public final void kCA6Zs9sL() {
        ((eIPvIAVtY) this.PSTqBLTET).J4Ux7ym32(null);
        this.kmSgne1rO = false;
        this.Bhmn1KIah = false;
    }

    @Override // con.AU29aHa4X
    public float yWvV4ePLl() {
        return this.CBQ5d1kRq.yWvV4ePLl();
    }
}
