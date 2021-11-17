package con;

import com.feravolt.preload.MainActivity;
import java.util.ArrayList;
import java.util.ListIterator;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$AppList$1$1$1$1$1$1$1$2$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class R6Iz0IChk extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RNEcgN6dQ Eeka1udhb;
    public final /* synthetic */ String MzoOEjc4X;
    public final /* synthetic */ fhHgxp0FC ilHKhw3Yw;
    public final /* synthetic */ fhHgxp0FC qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6Iz0IChk(String str, fhHgxp0FC fhhgxp0fc, fhHgxp0FC fhhgxp0fc2, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = str;
        this.ilHKhw3Yw = fhhgxp0fc;
        this.qVUwofr5s = fhhgxp0fc2;
        this.Eeka1udhb = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        R6Iz0IChk r6Iz0IChk = new R6Iz0IChk(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        r6Iz0IChk.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new R6Iz0IChk(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        if (this.MzoOEjc4X.length() > 0) {
            RNEcgN6dQ rNEcgN6dQ = this.Eeka1udhb;
            int i = MainActivity.mUqPm6GBh;
            ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(Boolean.TRUE);
            this.ilHKhw3Yw.clear();
            fhHgxp0FC fhhgxp0fc = this.ilHKhw3Yw;
            fhHgxp0FC fhhgxp0fc2 = this.qVUwofr5s;
            String str = this.MzoOEjc4X;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = fhhgxp0fc2.listIterator();
            while (true) {
                S4jgv4n3l s4jgv4n3l = (S4jgv4n3l) listIterator;
                if (!s4jgv4n3l.hasNext()) {
                    break;
                }
                Object next = s4jgv4n3l.next();
                attbzuWdD attbzuwdd = (attbzuWdD) next;
                if (r6NbD4wnj.AqaWJg0b4(attbzuwdd.J4Ux7ym32, str, true) || r6NbD4wnj.AqaWJg0b4(attbzuwdd.tGV7Q6urW, str, true)) {
                    arrayList.add(next);
                }
            }
            fhHgxp0FC fhhgxp0fc3 = new fhHgxp0FC();
            fhhgxp0fc3.addAll(arrayList);
            lXExmygLE.mUqPm6GBh(fhhgxp0fc, fhhgxp0fc3);
        } else {
            RNEcgN6dQ rNEcgN6dQ2 = this.Eeka1udhb;
            int i2 = MainActivity.mUqPm6GBh;
            ((prCJwNx2x) rNEcgN6dQ2).CBQ5d1kRq(Boolean.FALSE);
        }
        return qih4lW99W.q3BipwRCk;
    }
}
