package con;

import con.DrTf1eLw4;
import java.util.Objects;
/* loaded from: classes.dex */
public final class PMYI4lLJM {
    public Object J4Ux7ym32 = dgsh68zH8.dIocxURUo;
    public final DrTf1eLw4 q3BipwRCk;

    public PMYI4lLJM(DrTf1eLw4 drTf1eLw4) {
        this.q3BipwRCk = drTf1eLw4;
    }

    public final boolean J4Ux7ym32(Object obj) {
        if (!(obj instanceof WPks89pLg)) {
            return true;
        }
        WPks89pLg wPks89pLg = (WPks89pLg) obj;
        if (wPks89pLg.PSTqBLTET == null) {
            return false;
        }
        Throwable AqaWJg0b4 = wPks89pLg.AqaWJg0b4();
        String str = VuikCkExI.q3BipwRCk;
        throw AqaWJg0b4;
    }

    public Object q3BipwRCk(Way959ade way959ade) {
        ZcRbhWzZ1 zcRbhWzZ1;
        Object obj = this.J4Ux7ym32;
        vX9ZKIhAp vx9zkihap = dgsh68zH8.dIocxURUo;
        if (obj == vx9zkihap) {
            obj = this.q3BipwRCk.PSTqBLTET();
            this.J4Ux7ym32 = obj;
            if (obj == vx9zkihap) {
                tmgChDFqU kmSgne1rO = idpM54xlp.kmSgne1rO(idpM54xlp.PSTqBLTET(way959ade));
                Q6hF6Z6Ad q6hF6Z6Ad = new Q6hF6Z6Ad(this, kmSgne1rO);
                while (true) {
                    if (this.q3BipwRCk.yWvV4ePLl(q6hF6Z6Ad)) {
                        DrTf1eLw4 drTf1eLw4 = this.q3BipwRCk;
                        Objects.requireNonNull(drTf1eLw4);
                        kmSgne1rO.RG6kpfv3v(new DrTf1eLw4.RG2GI7LDp(q6hF6Z6Ad));
                        break;
                    }
                    Object PSTqBLTET = this.q3BipwRCk.PSTqBLTET();
                    this.J4Ux7ym32 = PSTqBLTET;
                    if (PSTqBLTET instanceof WPks89pLg) {
                        WPks89pLg wPks89pLg = (WPks89pLg) PSTqBLTET;
                        if (wPks89pLg.PSTqBLTET == null) {
                            kmSgne1rO.Bhmn1KIah(Boolean.FALSE);
                        } else {
                            kmSgne1rO.Bhmn1KIah(new qlt0VySXJ(wPks89pLg.AqaWJg0b4()));
                        }
                    } else if (PSTqBLTET != dgsh68zH8.dIocxURUo) {
                        Boolean bool = Boolean.TRUE;
                        PmanMZxiM pmanMZxiM = this.q3BipwRCk.J4Ux7ym32;
                        if (pmanMZxiM == null) {
                            zcRbhWzZ1 = null;
                        } else {
                            zcRbhWzZ1 = new ZcRbhWzZ1(pmanMZxiM, PSTqBLTET, kmSgne1rO.MzoOEjc4X);
                        }
                        kmSgne1rO.iMyQMM6Qj(bool, kmSgne1rO.Bhmn1KIah, zcRbhWzZ1);
                    }
                }
                return kmSgne1rO.qVUwofr5s();
            }
        }
        return Boolean.valueOf(J4Ux7ym32(obj));
    }

    public Object tGV7Q6urW() {
        Object obj = this.J4Ux7ym32;
        if (!(obj instanceof WPks89pLg)) {
            vX9ZKIhAp vx9zkihap = dgsh68zH8.dIocxURUo;
            if (obj != vx9zkihap) {
                this.J4Ux7ym32 = vx9zkihap;
                return obj;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        Throwable AqaWJg0b4 = ((WPks89pLg) obj).AqaWJg0b4();
        String str = VuikCkExI.q3BipwRCk;
        throw AqaWJg0b4;
    }
}
