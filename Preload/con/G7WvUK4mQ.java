package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class G7WvUK4mQ {
    public static final Object q3BipwRCk = new cDpvQ9XZF("provider");
    public static final Object J4Ux7ym32 = new cDpvQ9XZF("provider");
    public static final Object tGV7Q6urW = new cDpvQ9XZF("compositionLocalMap");
    public static final Object dIocxURUo = new cDpvQ9XZF("providerValues");
    public static final Object kCA6Zs9sL = new cDpvQ9XZF("providers");
    public static final Object iiGwOFFnr = new cDpvQ9XZF("reference");

    public static final void J4Ux7ym32(List list, int i, int i2) {
        int dIocxURUo2 = dIocxURUo(list, i);
        if (dIocxURUo2 < 0) {
            dIocxURUo2 = -(dIocxURUo2 + 1);
        }
        while (dIocxURUo2 < list.size() && ((WngT3JKx7) list.get(dIocxURUo2)).J4Ux7ym32 < i2) {
            list.remove(dIocxURUo2);
        }
    }

    public static final int dIocxURUo(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int oon79WMrY = anXlDk6fV.oon79WMrY(((WngT3JKx7) list.get(i3)).J4Ux7ym32, i);
            if (oon79WMrY < 0) {
                i2 = i3 + 1;
            } else if (oon79WMrY <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void kCA6Zs9sL(ZVqfObOve zVqfObOve, gl0eeduiq gl0eeduiq) {
        rESgwfV20 resgwfv20;
        qg6veklqT qg6veklqt;
        int Puu3Rhg4F = zVqfObOve.Puu3Rhg4F(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(zVqfObOve.qVUwofr5s));
        int[] iArr = zVqfObOve.J4Ux7ym32;
        int i = zVqfObOve.qVUwofr5s;
        M6jQSt0Qa m6jQSt0Qa = new M6jQSt0Qa(Puu3Rhg4F, zVqfObOve.Puu3Rhg4F(iArr, zVqfObOve.qVUwofr5s(xpuSUT7Gh.CBQ5d1kRq(iArr, i < zVqfObOve.kCA6Zs9sL ? i : zVqfObOve.iiGwOFFnr + i) + i)), zVqfObOve);
        while (m6jQSt0Qa.hasNext()) {
            Object next = m6jQSt0Qa.next();
            if (next instanceof knaaJ6t3r) {
                gl0eeduiq.tGV7Q6urW((knaaJ6t3r) next);
            } else if ((next instanceof rESgwfV20) && (qg6veklqt = (resgwfv20 = (rESgwfV20) next).q3BipwRCk) != null) {
                qg6veklqt.sk5s77z6Q = true;
                resgwfv20.q3BipwRCk = null;
            }
        }
        zVqfObOve.dfpT1j18n();
    }

    public static final WngT3JKx7 q3BipwRCk(List list, int i, int i2) {
        int dIocxURUo2 = dIocxURUo(list, i);
        if (dIocxURUo2 < 0) {
            dIocxURUo2 = -(dIocxURUo2 + 1);
        }
        if (dIocxURUo2 < list.size()) {
            WngT3JKx7 wngT3JKx7 = (WngT3JKx7) list.get(dIocxURUo2);
            if (wngT3JKx7.J4Ux7ym32 < i2) {
                return wngT3JKx7;
            }
        }
        return null;
    }

    public static final Void tGV7Q6urW(String str) {
        throw new IllegalStateException(M5g57XBLr.q3BipwRCk("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }
}
