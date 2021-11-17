package con;
/* loaded from: classes.dex */
public abstract class Y371ZqMzx extends Zgh96z4e6 implements Way959ade, oQkvjGXIr {
    public final bu5cjmae6 kmSgne1rO;

    public Y371ZqMzx(bu5cjmae6 bu5cjmae6, boolean z, boolean z2) {
        super(z2);
        if (z) {
            cAwN510t2((JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq));
        }
        this.kmSgne1rO = bu5cjmae6.plus(this);
    }

    @Override // con.Zgh96z4e6
    public String AqaWJg0b4() {
        boolean z = MfTZnip0T.q3BipwRCk;
        return super.AqaWJg0b4();
    }

    @Override // con.Way959ade
    public final void Bhmn1KIah(Object obj) {
        Object nlGCs0NZs = nlGCs0NZs(cOutqbkMD.PSTqBLTET(obj, null));
        if (nlGCs0NZs != AB5ApHoQM.J4Ux7ym32) {
            juJ6pnCpu(nlGCs0NZs);
        }
    }

    @Override // con.Zgh96z4e6, con.JEWwjBE8f
    public boolean J4Ux7ym32() {
        return super.J4Ux7ym32();
    }

    @Override // con.oQkvjGXIr
    public bu5cjmae6 dIocxURUo() {
        return this.kmSgne1rO;
    }

    @Override // con.Zgh96z4e6
    public final void iMyQMM6Qj(Throwable th) {
        idpM54xlp.Bhmn1KIah(this.kmSgne1rO, th);
    }

    public final void j22ftfeNI(int i, Object obj, kkcQgCx5G kkcqgcx5g) {
        Object obj2;
        bu5cjmae6 bu5cjmae6;
        Object J4Ux7ym32;
        int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(i);
        if (tGV7Q6urW == 0) {
            rTcohQ78k.yWvV4ePLl(kkcqgcx5g, obj, this, null, 4);
        } else if (tGV7Q6urW == 1) {
        } else {
            if (tGV7Q6urW == 2) {
                idpM54xlp.PSTqBLTET(idpM54xlp.dIocxURUo(kkcqgcx5g, obj, this)).Bhmn1KIah(qih4lW99W.q3BipwRCk);
            } else if (tGV7Q6urW == 3) {
                try {
                    bu5cjmae6 = this.kmSgne1rO;
                    J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(bu5cjmae6, null);
                } catch (Throwable th) {
                    obj2 = new qlt0VySXJ(th);
                }
                if (kkcqgcx5g != null) {
                    cOutqbkMD.J4Ux7ym32(kkcqgcx5g, 2);
                    obj2 = kkcqgcx5g.WaUP0CF08(obj, this);
                    cclHSBzpG.q3BipwRCk(bu5cjmae6, J4Ux7ym32);
                    if (obj2 == kBKJSqCSL.COROUTINE_SUSPENDED) {
                        return;
                    }
                    Bhmn1KIah(obj2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else {
                throw new dnCerKhAM();
            }
        }
    }

    public void juJ6pnCpu(Object obj) {
        Puu3Rhg4F(obj);
    }

    @Override // con.Way959ade
    public final bu5cjmae6 kCA6Zs9sL() {
        return this.kmSgne1rO;
    }

    @Override // con.Zgh96z4e6
    public String kmSgne1rO() {
        return anXlDk6fV.iMyQMM6Qj(getClass().getSimpleName(), " was cancelled");
    }

    @Override // con.Zgh96z4e6
    public final void vNtjxmzUM(Object obj) {
        if (obj instanceof zo6RfsWe2) {
            zo6RfsWe2 zo6rfswe2 = (zo6RfsWe2) obj;
            Throwable th = zo6rfswe2.q3BipwRCk;
            zo6rfswe2.q3BipwRCk();
        }
    }
}
