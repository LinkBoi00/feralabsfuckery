package con;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class AIDP2j9pY {
    public static final vX9ZKIhAp q3BipwRCk = new vX9ZKIhAp("UNDEFINED");
    public static final vX9ZKIhAp J4Ux7ym32 = new vX9ZKIhAp("REUSABLE_CLAIMED");

    public static /* synthetic */ void J4Ux7ym32(Way959ade way959ade, Object obj, PmanMZxiM pmanMZxiM, int i) {
        q3BipwRCk(way959ade, obj, null);
    }

    public static final void q3BipwRCk(Way959ade way959ade, Object obj, PmanMZxiM pmanMZxiM) {
        boolean z;
        if (way959ade instanceof c27z9OHjq) {
            c27z9OHjq c27z9ohjq = (c27z9OHjq) way959ade;
            Object PSTqBLTET = cOutqbkMD.PSTqBLTET(obj, pmanMZxiM);
            if (c27z9ohjq.PSTqBLTET.yWvV4ePLl(c27z9ohjq.kCA6Zs9sL())) {
                c27z9ohjq.ilHKhw3Yw = PSTqBLTET;
                c27z9ohjq.Bhmn1KIah = 1;
                c27z9ohjq.PSTqBLTET.Puu3Rhg4F(c27z9ohjq.kCA6Zs9sL(), c27z9ohjq);
                return;
            }
            IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
            ev1IlyvL8 q3BipwRCk2 = IO5CrIj0i.q3BipwRCk();
            if (q3BipwRCk2.PSTqBLTET()) {
                c27z9ohjq.ilHKhw3Yw = PSTqBLTET;
                c27z9ohjq.Bhmn1KIah = 1;
                q3BipwRCk2.CBQ5d1kRq(c27z9ohjq);
                return;
            }
            q3BipwRCk2.Bhmn1KIah(true);
            try {
                JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) c27z9ohjq.kCA6Zs9sL().get(y5p19vMdC.CBQ5d1kRq);
                if (jEWwjBE8f == null || jEWwjBE8f.J4Ux7ym32()) {
                    z = false;
                } else {
                    CancellationException Eeka1udhb = ((Zgh96z4e6) jEWwjBE8f).Eeka1udhb();
                    if (PSTqBLTET instanceof sbK32z90g) {
                        ((sbK32z90g) PSTqBLTET).J4Ux7ym32.IytU16YUK(Eeka1udhb);
                    }
                    c27z9ohjq.Bhmn1KIah(new qlt0VySXJ(Eeka1udhb));
                    z = true;
                }
                if (!z) {
                    Way959ade way959ade2 = c27z9ohjq.MzoOEjc4X;
                    Object obj2 = c27z9ohjq.qVUwofr5s;
                    bu5cjmae6 kCA6Zs9sL = way959ade2.kCA6Zs9sL();
                    Object J4Ux7ym322 = cclHSBzpG.J4Ux7ym32(kCA6Zs9sL, obj2);
                    oDbW63V52 J4Ux7ym323 = J4Ux7ym322 != cclHSBzpG.q3BipwRCk ? MfTZnip0T.J4Ux7ym32(way959ade2, kCA6Zs9sL, J4Ux7ym322) : null;
                    c27z9ohjq.MzoOEjc4X.Bhmn1KIah(obj);
                    if (J4Ux7ym323 == null || J4Ux7ym323.QSbMsHU5X()) {
                        cclHSBzpG.q3BipwRCk(kCA6Zs9sL, J4Ux7ym322);
                    }
                }
                do {
                } while (q3BipwRCk2.ilHKhw3Yw());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        way959ade.Bhmn1KIah(obj);
    }
}
