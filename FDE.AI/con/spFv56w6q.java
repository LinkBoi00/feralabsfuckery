package con;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class spFv56w6q implements CcBVlmP2F {
    public static final /* synthetic */ AtomicReferenceFieldUpdater dIocxURUo = AtomicReferenceFieldUpdater.newUpdater(spFv56w6q.class, Object.class, "onCloseHandler");
    public final PmanMZxiM J4Ux7ym32;
    public final m8lSPUpKx tGV7Q6urW = new m8lSPUpKx();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public spFv56w6q(PmanMZxiM pmanMZxiM) {
        this.J4Ux7ym32 = pmanMZxiM;
    }

    public final oTpJSKL6O GPLPRo6go() {
        DV1oYHwIh dV1oYHwIh;
        DV1oYHwIh ixWaw2akD;
        m8lSPUpKx m8lspupkx = this.tGV7Q6urW;
        while (true) {
            dV1oYHwIh = (DV1oYHwIh) m8lspupkx.Bhmn1KIah();
            dV1oYHwIh = null;
            if (dV1oYHwIh != m8lspupkx && (dV1oYHwIh instanceof oTpJSKL6O)) {
                if (((((oTpJSKL6O) dV1oYHwIh) instanceof WPks89pLg) && !dV1oYHwIh.Eeka1udhb()) || (ixWaw2akD = dV1oYHwIh.ixWaw2akD()) == null) {
                    break;
                }
                ixWaw2akD.qVUwofr5s();
            }
        }
        return (oTpJSKL6O) dV1oYHwIh;
    }

    public String J4Ux7ym32() {
        return "";
    }

    public final Object Puu3Rhg4F(Object obj) {
        tUL7vRc31 tul7vrc31;
        Object kCA6Zs9sL = kCA6Zs9sL(obj);
        if (kCA6Zs9sL == dgsh68zH8.J4Ux7ym32) {
            return qih4lW99W.q3BipwRCk;
        }
        if (kCA6Zs9sL == dgsh68zH8.tGV7Q6urW) {
            WPks89pLg tGV7Q6urW = tGV7Q6urW();
            if (tGV7Q6urW == null) {
                return nNBfGFMkt.J4Ux7ym32;
            }
            dIocxURUo(tGV7Q6urW);
            Throwable th = tGV7Q6urW.PSTqBLTET;
            if (th == null) {
                th = new bv9yz7GWJ("Channel was closed");
            }
            tul7vrc31 = new tUL7vRc31(th);
        } else if (kCA6Zs9sL instanceof WPks89pLg) {
            WPks89pLg wPks89pLg = (WPks89pLg) kCA6Zs9sL;
            dIocxURUo(wPks89pLg);
            Throwable th2 = wPks89pLg.PSTqBLTET;
            if (th2 == null) {
                th2 = new bv9yz7GWJ("Channel was closed");
            }
            tul7vrc31 = new tUL7vRc31(th2);
        } else {
            throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("trySend returned ", kCA6Zs9sL).toString());
        }
        return tul7vrc31;
    }

    public final void dIocxURUo(WPks89pLg wPks89pLg) {
        Object obj = null;
        while (true) {
            DV1oYHwIh MzoOEjc4X = wPks89pLg.MzoOEjc4X();
            FjdyTKOTM fjdyTKOTM = MzoOEjc4X instanceof FjdyTKOTM ? (FjdyTKOTM) MzoOEjc4X : null;
            if (fjdyTKOTM == null) {
                break;
            } else if (!fjdyTKOTM.RG6kpfv3v()) {
                fjdyTKOTM.ilHKhw3Yw();
            } else {
                obj = B2GV5CTcl.tGV7Q6urW(obj, fjdyTKOTM);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((FjdyTKOTM) obj).cAwN510t2(wPks89pLg);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((FjdyTKOTM) arrayList.get(size)).cAwN510t2(wPks89pLg);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public OIfZMZeX0 iiGwOFFnr() {
        DV1oYHwIh dV1oYHwIh;
        DV1oYHwIh ixWaw2akD;
        m8lSPUpKx m8lspupkx = this.tGV7Q6urW;
        while (true) {
            dV1oYHwIh = (DV1oYHwIh) m8lspupkx.Bhmn1KIah();
            dV1oYHwIh = null;
            if (dV1oYHwIh != m8lspupkx && (dV1oYHwIh instanceof OIfZMZeX0)) {
                if (((((OIfZMZeX0) dV1oYHwIh) instanceof WPks89pLg) && !dV1oYHwIh.Eeka1udhb()) || (ixWaw2akD = dV1oYHwIh.ixWaw2akD()) == null) {
                    break;
                }
                ixWaw2akD.qVUwofr5s();
            }
        }
        return (OIfZMZeX0) dV1oYHwIh;
    }

    public Object kCA6Zs9sL(Object obj) {
        OIfZMZeX0 iiGwOFFnr;
        do {
            iiGwOFFnr = iiGwOFFnr();
            if (iiGwOFFnr == null) {
                return dgsh68zH8.tGV7Q6urW;
            }
        } while (iiGwOFFnr.yWvV4ePLl(obj, null) == null);
        iiGwOFFnr.iiGwOFFnr(obj);
        return iiGwOFFnr.tGV7Q6urW();
    }

    public boolean q3BipwRCk(Throwable th) {
        boolean z;
        Object obj;
        vX9ZKIhAp vx9zkihap;
        WPks89pLg wPks89pLg = new WPks89pLg(th);
        DV1oYHwIh dV1oYHwIh = this.tGV7Q6urW;
        while (true) {
            DV1oYHwIh MzoOEjc4X = dV1oYHwIh.MzoOEjc4X();
            if (!(MzoOEjc4X instanceof WPks89pLg)) {
                if (MzoOEjc4X.oon79WMrY(wPks89pLg, dV1oYHwIh)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            wPks89pLg = (WPks89pLg) this.tGV7Q6urW.MzoOEjc4X();
        }
        dIocxURUo(wPks89pLg);
        if (z && (obj = this.onCloseHandler) != null && obj != (vx9zkihap = dgsh68zH8.kCA6Zs9sL) && dIocxURUo.compareAndSet(this, obj, vx9zkihap)) {
            cOutqbkMD.J4Ux7ym32(obj, 1);
            ((PmanMZxiM) obj).IytU16YUK(th);
        }
        return z;
    }

    public final WPks89pLg tGV7Q6urW() {
        DV1oYHwIh MzoOEjc4X = this.tGV7Q6urW.MzoOEjc4X();
        WPks89pLg wPks89pLg = MzoOEjc4X instanceof WPks89pLg ? (WPks89pLg) MzoOEjc4X : null;
        if (wPks89pLg == null) {
            return null;
        }
        dIocxURUo(wPks89pLg);
        return wPks89pLg;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(cOutqbkMD.GPLPRo6go(this));
        sb.append('{');
        DV1oYHwIh PSTqBLTET = this.tGV7Q6urW.PSTqBLTET();
        if (PSTqBLTET == this.tGV7Q6urW) {
            str = "EmptyQueue";
        } else {
            String dV1oYHwIh = PSTqBLTET instanceof WPks89pLg ? PSTqBLTET.toString() : PSTqBLTET instanceof FjdyTKOTM ? "ReceiveQueued" : PSTqBLTET instanceof oTpJSKL6O ? "SendQueued" : anXlDk6fV.iMyQMM6Qj("UNEXPECTED:", PSTqBLTET);
            DV1oYHwIh MzoOEjc4X = this.tGV7Q6urW.MzoOEjc4X();
            if (MzoOEjc4X != PSTqBLTET) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dV1oYHwIh);
                sb2.append(",queueSize=");
                m8lSPUpKx m8lspupkx = this.tGV7Q6urW;
                int i = 0;
                for (DV1oYHwIh dV1oYHwIh2 = (DV1oYHwIh) m8lspupkx.Bhmn1KIah(); !anXlDk6fV.tGV7Q6urW(dV1oYHwIh2, m8lspupkx); dV1oYHwIh2 = dV1oYHwIh2.PSTqBLTET()) {
                    if (dV1oYHwIh2 instanceof DV1oYHwIh) {
                        i++;
                    }
                }
                sb2.append(i);
                str = sb2.toString();
                if (MzoOEjc4X instanceof WPks89pLg) {
                    str = str + ",closedForSend=" + MzoOEjc4X;
                }
            } else {
                str = dV1oYHwIh;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(J4Ux7ym32());
        return sb.toString();
    }
}
