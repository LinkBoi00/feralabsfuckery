package con;

import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class DrTf1eLw4 extends spFv56w6q implements DpXbxvzXm {

    /* loaded from: classes.dex */
    public final class RG2GI7LDp extends UEbylfzNI {
        public final FjdyTKOTM CBQ5d1kRq;

        public RG2GI7LDp(FjdyTKOTM fjdyTKOTM) {
            DrTf1eLw4.this = r1;
            this.CBQ5d1kRq = fjdyTKOTM;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.CBQ5d1kRq.RG6kpfv3v()) {
                Objects.requireNonNull(DrTf1eLw4.this);
            }
            return qih4lW99W.q3BipwRCk;
        }

        @Override // con.jmbWiIwa0
        public void q3BipwRCk(Throwable th) {
            if (this.CBQ5d1kRq.RG6kpfv3v()) {
                Objects.requireNonNull(DrTf1eLw4.this);
            }
        }

        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("RemoveReceiveOnCancel[");
            q3BipwRCk.append(this.CBQ5d1kRq);
            q3BipwRCk.append(']');
            return q3BipwRCk.toString();
        }
    }

    public DrTf1eLw4(PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
    }

    public void Bhmn1KIah(Object obj, WPks89pLg wPks89pLg) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((oTpJSKL6O) obj).qFBXIgpia(wPks89pLg);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((oTpJSKL6O) arrayList.get(size)).qFBXIgpia(wPks89pLg);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean CBQ5d1kRq() {
        DV1oYHwIh PSTqBLTET = this.tGV7Q6urW.PSTqBLTET();
        WPks89pLg wPks89pLg = null;
        WPks89pLg wPks89pLg2 = PSTqBLTET instanceof WPks89pLg ? (WPks89pLg) PSTqBLTET : null;
        if (wPks89pLg2 != null) {
            dIocxURUo(wPks89pLg2);
            wPks89pLg = wPks89pLg2;
        }
        return wPks89pLg != null && vPSbyrYWX();
    }

    public final Object MzoOEjc4X(Way959ade way959ade) {
        Object PSTqBLTET = PSTqBLTET();
        if (PSTqBLTET != dgsh68zH8.dIocxURUo && !(PSTqBLTET instanceof WPks89pLg)) {
            return PSTqBLTET;
        }
        tmgChDFqU kmSgne1rO = idpM54xlp.kmSgne1rO(idpM54xlp.PSTqBLTET(way959ade));
        Rma6SHcSH rma6SHcSH = this.J4Ux7ym32 == null ? new Rma6SHcSH(kmSgne1rO, 0) : new lamBDew8Z(kmSgne1rO, 0, this.J4Ux7ym32);
        while (true) {
            if (yWvV4ePLl(rma6SHcSH)) {
                kmSgne1rO.RG6kpfv3v(new RG2GI7LDp(rma6SHcSH));
                break;
            }
            Object PSTqBLTET2 = PSTqBLTET();
            if (PSTqBLTET2 instanceof WPks89pLg) {
                rma6SHcSH.cAwN510t2((WPks89pLg) PSTqBLTET2);
                break;
            } else if (PSTqBLTET2 != dgsh68zH8.dIocxURUo) {
                kmSgne1rO.iMyQMM6Qj(rma6SHcSH.MzoOEjc4X == 1 ? new nNBfGFMkt(PSTqBLTET2) : PSTqBLTET2, kmSgne1rO.Bhmn1KIah, rma6SHcSH.dfpT1j18n(PSTqBLTET2));
            }
        }
        return kmSgne1rO.qVUwofr5s();
    }

    public Object PSTqBLTET() {
        oTpJSKL6O GPLPRo6go;
        do {
            GPLPRo6go = GPLPRo6go();
            if (GPLPRo6go == null) {
                return dgsh68zH8.dIocxURUo;
            }
        } while (GPLPRo6go.nlGCs0NZs(null) == null);
        GPLPRo6go.dfpT1j18n();
        return GPLPRo6go.cAwN510t2();
    }

    @Override // con.spFv56w6q
    public OIfZMZeX0 iiGwOFFnr() {
        OIfZMZeX0 iiGwOFFnr = super.iiGwOFFnr();
        if (iiGwOFFnr != null) {
            boolean z = iiGwOFFnr instanceof WPks89pLg;
        }
        return iiGwOFFnr;
    }

    public final Object ilHKhw3Yw() {
        Object PSTqBLTET = PSTqBLTET();
        if (PSTqBLTET == dgsh68zH8.dIocxURUo) {
            return nNBfGFMkt.J4Ux7ym32;
        }
        return PSTqBLTET instanceof WPks89pLg ? new tUL7vRc31(((WPks89pLg) PSTqBLTET).PSTqBLTET) : PSTqBLTET;
    }

    public void kmSgne1rO(boolean z) {
        WPks89pLg tGV7Q6urW = tGV7Q6urW();
        if (tGV7Q6urW != null) {
            Object obj = null;
            while (true) {
                DV1oYHwIh MzoOEjc4X = tGV7Q6urW.MzoOEjc4X();
                if (MzoOEjc4X instanceof m8lSPUpKx) {
                    Bhmn1KIah(obj, tGV7Q6urW);
                    return;
                } else if (!MzoOEjc4X.RG6kpfv3v()) {
                    MzoOEjc4X.ilHKhw3Yw();
                } else {
                    obj = B2GV5CTcl.tGV7Q6urW(obj, (oTpJSKL6O) MzoOEjc4X);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public abstract boolean oon79WMrY();

    public abstract boolean vPSbyrYWX();

    public boolean yWvV4ePLl(FjdyTKOTM fjdyTKOTM) {
        int i8XZMQc6Z;
        DV1oYHwIh MzoOEjc4X;
        if (!oon79WMrY()) {
            DV1oYHwIh dV1oYHwIh = this.tGV7Q6urW;
            LULQkQlc9 lULQkQlc9 = new LULQkQlc9(fjdyTKOTM, this);
            do {
                DV1oYHwIh MzoOEjc4X2 = dV1oYHwIh.MzoOEjc4X();
                if (!(!(MzoOEjc4X2 instanceof oTpJSKL6O))) {
                    break;
                }
                i8XZMQc6Z = MzoOEjc4X2.i8XZMQc6Z(fjdyTKOTM, dV1oYHwIh, lULQkQlc9);
                if (i8XZMQc6Z == 1) {
                    return true;
                }
            } while (i8XZMQc6Z != 2);
        } else {
            DV1oYHwIh dV1oYHwIh2 = this.tGV7Q6urW;
            do {
                MzoOEjc4X = dV1oYHwIh2.MzoOEjc4X();
                if (!(!(MzoOEjc4X instanceof oTpJSKL6O))) {
                }
            } while (!MzoOEjc4X.oon79WMrY(fjdyTKOTM, dV1oYHwIh2));
            return true;
        }
        return false;
    }
}
