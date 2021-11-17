package con;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class cVJORDUgo extends P3AfVviyS {
    public int Bhmn1KIah;

    public cVJORDUgo(int i) {
        this.Bhmn1KIah = i;
    }

    public final void GPLPRo6go(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                dnBSj5uJN.dIocxURUo(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            idpM54xlp.Bhmn1KIah(J4Ux7ym32().kCA6Zs9sL(), new zEm3MQbi0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Way959ade J4Ux7ym32();

    public abstract Object Puu3Rhg4F();

    public Throwable dIocxURUo(Object obj) {
        zo6RfsWe2 zo6rfswe2 = obj instanceof zo6RfsWe2 ? (zo6RfsWe2) obj : null;
        if (zo6rfswe2 == null) {
            return null;
        }
        return zo6rfswe2.q3BipwRCk;
    }

    public Object iiGwOFFnr(Object obj) {
        return obj;
    }

    public abstract void q3BipwRCk(Object obj, Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        JEWwjBE8f jEWwjBE8f;
        Object iiGwOFFnr;
        MgUdeu75i mgUdeu75i = this.kmSgne1rO;
        try {
            c27z9OHjq c27z9ohjq = (c27z9OHjq) J4Ux7ym32();
            Way959ade way959ade = c27z9ohjq.MzoOEjc4X;
            Object obj2 = c27z9ohjq.qVUwofr5s;
            bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
            Object J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(kCA6Zs9sL, obj2);
            oDbW63V52 J4Ux7ym322 = J4Ux7ym32 != cclHSBzpG.q3BipwRCk ? MfTZnip0T.J4Ux7ym32(way959ade, kCA6Zs9sL, J4Ux7ym32) : null;
            bu5cjmae6 kCA6Zs9sL2 = way959ade.kCA6Zs9sL();
            Object Puu3Rhg4F = Puu3Rhg4F();
            Throwable dIocxURUo = dIocxURUo(Puu3Rhg4F);
            if (dIocxURUo != null || !rTcohQ78k.kCA6Zs9sL(this.Bhmn1KIah)) {
                jEWwjBE8f = null;
            } else {
                int i = JEWwjBE8f.GPLPRo6go;
                jEWwjBE8f = (JEWwjBE8f) kCA6Zs9sL2.get(y5p19vMdC.CBQ5d1kRq);
            }
            if (jEWwjBE8f == null || jEWwjBE8f.J4Ux7ym32()) {
                if (dIocxURUo != null) {
                    iiGwOFFnr = new qlt0VySXJ(dIocxURUo);
                } else {
                    iiGwOFFnr = iiGwOFFnr(Puu3Rhg4F);
                }
                way959ade.Bhmn1KIah(iiGwOFFnr);
            } else {
                CancellationException Eeka1udhb = ((Zgh96z4e6) jEWwjBE8f).Eeka1udhb();
                q3BipwRCk(Puu3Rhg4F, Eeka1udhb);
                way959ade.Bhmn1KIah(new qlt0VySXJ(Eeka1udhb));
            }
            Object obj3 = qih4lW99W.q3BipwRCk;
            if (J4Ux7ym322 == null || J4Ux7ym322.QSbMsHU5X()) {
                cclHSBzpG.q3BipwRCk(kCA6Zs9sL, J4Ux7ym32);
            }
            try {
                mgUdeu75i.GPLPRo6go();
            } catch (Throwable th) {
                obj3 = new qlt0VySXJ(th);
            }
            GPLPRo6go(null, YqdLs8aRM.q3BipwRCk(obj3));
        } catch (Throwable th2) {
            try {
                mgUdeu75i.GPLPRo6go();
                obj = qih4lW99W.q3BipwRCk;
            } catch (Throwable th3) {
                obj = new qlt0VySXJ(th3);
            }
            GPLPRo6go(th2, YqdLs8aRM.q3BipwRCk(obj));
        }
    }
}
