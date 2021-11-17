package con;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pW31wYUjR {
    public int CBQ5d1kRq;
    public z3ICU5k15 J4Ux7ym32;
    public int iiGwOFFnr;
    public pLYbCSTk0 kCA6Zs9sL;
    public final int q3BipwRCk;
    public int vPSbyrYWX;
    public final PmanMZxiM tGV7Q6urW = new NWs5CXl6V(this, 1);
    public final kkcQgCx5G dIocxURUo = new MAZDnzQe5(this);
    public final Map GPLPRo6go = new LinkedHashMap();
    public final Map Puu3Rhg4F = new LinkedHashMap();
    public final OzcTQ150H yWvV4ePLl = new OzcTQ150H(this);
    public final Map oon79WMrY = new LinkedHashMap();
    public final String kmSgne1rO = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public pW31wYUjR(int i) {
        this.q3BipwRCk = i;
    }

    public final pLYbCSTk0 J4Ux7ym32() {
        pLYbCSTk0 plybcstk0 = this.kCA6Zs9sL;
        if (plybcstk0 != null) {
            return plybcstk0;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void dIocxURUo(int i, int i2, int i3) {
        pLYbCSTk0 J4Ux7ym32 = J4Ux7ym32();
        J4Ux7ym32.ixWaw2akD = true;
        J4Ux7ym32().WaUP0CF08(i, i2, i3);
        J4Ux7ym32.ixWaw2akD = false;
    }

    public final pLYbCSTk0 iiGwOFFnr(Object obj) {
        if (this.vPSbyrYWX > 0) {
            int size = J4Ux7ym32().yWvV4ePLl().size() - this.CBQ5d1kRq;
            int i = size - this.vPSbyrYWX;
            int i2 = i;
            while (true) {
                e3ALPxmyo e3alpxmyo = (e3ALPxmyo) s0tSbdszx.nlGCs0NZs(this.GPLPRo6go, (pLYbCSTk0) J4Ux7ym32().yWvV4ePLl().get(i2));
                if (anXlDk6fV.tGV7Q6urW(e3alpxmyo.q3BipwRCk, obj)) {
                    break;
                } else if (i2 == size - 1) {
                    e3alpxmyo.q3BipwRCk = obj;
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != i) {
                dIocxURUo(i2, i, 1);
            }
            this.vPSbyrYWX--;
            return (pLYbCSTk0) J4Ux7ym32().yWvV4ePLl().get(i);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void kCA6Zs9sL(pLYbCSTk0 plybcstk0, Object obj, kkcQgCx5G kkcqgcx5g) {
        boolean z;
        Map map = this.GPLPRo6go;
        Object obj2 = map.get(plybcstk0);
        if (obj2 == null) {
            JZiyFfAqn jZiyFfAqn = JZiyFfAqn.q3BipwRCk;
            obj2 = new e3ALPxmyo(obj, JZiyFfAqn.J4Ux7ym32, null, 4);
            map.put(plybcstk0, obj2);
        }
        e3ALPxmyo e3alpxmyo = (e3ALPxmyo) obj2;
        v0l3RHDWl v0l3rhdwl = e3alpxmyo.tGV7Q6urW;
        if (v0l3rhdwl == null) {
            z = true;
        } else {
            z = v0l3rhdwl.kCA6Zs9sL();
        }
        if (e3alpxmyo.J4Ux7ym32 != kkcqgcx5g || z) {
            e3alpxmyo.J4Ux7ym32 = kkcqgcx5g;
            atgZEnsDc atgzensdc = new atgZEnsDc(this, e3alpxmyo, plybcstk0);
            Objects.requireNonNull(plybcstk0);
            ZcF0ya1BQ zcF0ya1BQ = BBVaGLNaU.i0Zug1mVk(plybcstk0).getSnapshotObserver().q3BipwRCk;
            boolean z2 = zcF0ya1BQ.GPLPRo6go;
            zcF0ya1BQ.GPLPRo6go = true;
            try {
                atgzensdc.GPLPRo6go();
            } finally {
                zcF0ya1BQ.GPLPRo6go = z2;
            }
        }
    }

    public final pLYbCSTk0 q3BipwRCk(int i) {
        pLYbCSTk0 plybcstk0 = new pLYbCSTk0(true);
        pLYbCSTk0 J4Ux7ym32 = J4Ux7ym32();
        J4Ux7ym32.ixWaw2akD = true;
        J4Ux7ym32().PSTqBLTET(i, plybcstk0);
        J4Ux7ym32.ixWaw2akD = false;
        return plybcstk0;
    }

    public final void tGV7Q6urW() {
        if (!(this.GPLPRo6go.size() == J4Ux7ym32().yWvV4ePLl().size())) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Inconsistency between the count of nodes tracked by the state (");
            q3BipwRCk.append(this.GPLPRo6go.size());
            q3BipwRCk.append(") and the children count on the SubcomposeLayout (");
            q3BipwRCk.append(J4Ux7ym32().yWvV4ePLl().size());
            q3BipwRCk.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            throw new IllegalArgumentException(q3BipwRCk.toString().toString());
        }
    }
}
