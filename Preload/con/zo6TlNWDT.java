package con;

import java.util.ArrayList;
import java.util.List;
@jHNqfwCVd(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {407, 425}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class zo6TlNWDT extends dnd1L2J2K implements NzvP5Rex8 {
    public /* synthetic */ Object Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ rQamjxEL9 dXrmkklc8;
    public Object ilHKhw3Yw;
    public int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo6TlNWDT(rQamjxEL9 rqamjxel9, Way959ade way959ade) {
        super(3, way959ade);
        this.dXrmkklc8 = rqamjxel9;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        zo6TlNWDT zo6tlnwdt = new zo6TlNWDT(this.dXrmkklc8, (Way959ade) obj3);
        zo6tlnwdt.Eeka1udhb = (Kh7ffW4RH) obj2;
        return zo6tlnwdt.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Kh7ffW4RH kh7ffW4RH;
        qih4lW99W qih4lw99w;
        zo6TlNWDT zo6tlnwdt;
        List list;
        List list2;
        rQamjxEL9 rqamjxel9;
        boolean z;
        qih4lW99W qih4lw99w2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.qVUwofr5s;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            kh7ffW4RH = (Kh7ffW4RH) this.Eeka1udhb;
            list2 = new ArrayList();
            list = new ArrayList();
            zo6tlnwdt = this;
            qih4lw99w = kbkjsqcsl;
        } else if (i == 1) {
            list = (List) this.ilHKhw3Yw;
            list2 = (List) this.MzoOEjc4X;
            kh7ffW4RH = (Kh7ffW4RH) this.Eeka1udhb;
            anXlDk6fV.IytU16YUK(obj);
            qih4lw99w = kbkjsqcsl;
            zo6tlnwdt = this;
            rqamjxel9 = zo6tlnwdt.dXrmkklc8;
            synchronized (rqamjxel9.kCA6Zs9sL) {
                z = false;
                if (!rQamjxEL9.Bhmn1KIah(rqamjxel9)) {
                    rQamjxEL9.MzoOEjc4X(rqamjxel9);
                    if (!rQamjxEL9.Bhmn1KIah(rqamjxel9)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                ZcRbhWzZ1 zcRbhWzZ1 = new ZcRbhWzZ1(zo6tlnwdt.dXrmkklc8, list2, list);
                zo6tlnwdt.Eeka1udhb = kh7ffW4RH;
                zo6tlnwdt.MzoOEjc4X = list2;
                zo6tlnwdt.ilHKhw3Yw = list;
                zo6tlnwdt.qVUwofr5s = 2;
                if (kh7ffW4RH.q3BipwRCk(zcRbhWzZ1, zo6tlnwdt) == qih4lw99w) {
                    return qih4lw99w;
                }
            }
        } else if (i == 2) {
            list = (List) this.ilHKhw3Yw;
            list2 = (List) this.MzoOEjc4X;
            kh7ffW4RH = (Kh7ffW4RH) this.Eeka1udhb;
            anXlDk6fV.IytU16YUK(obj);
            qih4lw99w = kbkjsqcsl;
            zo6tlnwdt = this;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        synchronized (zo6tlnwdt.dXrmkklc8.kCA6Zs9sL) {
        }
        rQamjxEL9 rqamjxel92 = zo6tlnwdt.dXrmkklc8;
        zo6tlnwdt.Eeka1udhb = kh7ffW4RH;
        zo6tlnwdt.MzoOEjc4X = list2;
        zo6tlnwdt.ilHKhw3Yw = list;
        zo6tlnwdt.qVUwofr5s = 1;
        if (!rqamjxel92.Eeka1udhb()) {
            tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(zo6tlnwdt), 1);
            tmgchdfqu.Eeka1udhb();
            synchronized (rqamjxel92.kCA6Zs9sL) {
                if (rqamjxel92.Eeka1udhb()) {
                    tmgchdfqu.Bhmn1KIah(qih4lW99W.q3BipwRCk);
                } else {
                    rqamjxel92.CBQ5d1kRq = tmgchdfqu;
                }
                qih4lw99w2 = qih4lW99W.q3BipwRCk;
            }
            Object qVUwofr5s = tmgchdfqu.qVUwofr5s();
            if (qVUwofr5s == kbkjsqcsl) {
                qih4lw99w2 = qVUwofr5s;
            }
        } else {
            qih4lw99w2 = qih4lW99W.q3BipwRCk;
        }
        if (qih4lw99w2 == qih4lw99w) {
            return qih4lw99w;
        }
        rqamjxel9 = zo6tlnwdt.dXrmkklc8;
        synchronized (rqamjxel9.kCA6Zs9sL) {
        }
    }
}
