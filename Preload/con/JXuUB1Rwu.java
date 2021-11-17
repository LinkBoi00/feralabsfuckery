package con;

import java.util.Objects;
@jHNqfwCVd(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JXuUB1Rwu extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ DpXbxvzXm Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 RG6kpfv3v;
    public final /* synthetic */ IxbokG044 dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JXuUB1Rwu(DpXbxvzXm dpXbxvzXm, IxbokG044 ixbokG044, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = dpXbxvzXm;
        this.dXrmkklc8 = ixbokG044;
        this.RG6kpfv3v = uBY2Inzw8;
        this.ixWaw2akD = uBY2Inzw82;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        JXuUB1Rwu jXuUB1Rwu = new JXuUB1Rwu(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj2);
        jXuUB1Rwu.qVUwofr5s = (oQkvjGXIr) obj;
        return jXuUB1Rwu.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        JXuUB1Rwu jXuUB1Rwu = new JXuUB1Rwu(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
        jXuUB1Rwu.qVUwofr5s = obj;
        return jXuUB1Rwu;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Object obj2;
        JXuUB1Rwu jXuUB1Rwu;
        oQkvjGXIr oqkvjgxir;
        PMYI4lLJM pMYI4lLJM;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oqkvjgxir = (oQkvjGXIr) this.qVUwofr5s;
            DrTf1eLw4 drTf1eLw4 = (DrTf1eLw4) this.Eeka1udhb;
            Objects.requireNonNull(drTf1eLw4);
            pMYI4lLJM = new PMYI4lLJM(drTf1eLw4);
            jXuUB1Rwu = this;
            jXuUB1Rwu.qVUwofr5s = oqkvjgxir;
            jXuUB1Rwu.MzoOEjc4X = pMYI4lLJM;
            jXuUB1Rwu.ilHKhw3Yw = 1;
            obj2 = pMYI4lLJM.q3BipwRCk(jXuUB1Rwu);
            if (obj2 == kbkjsqcsl) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
        } else if (i == 1) {
            pMYI4lLJM = (PMYI4lLJM) this.MzoOEjc4X;
            oqkvjgxir = (oQkvjGXIr) this.qVUwofr5s;
            anXlDk6fV.IytU16YUK(obj);
            obj2 = obj;
            jXuUB1Rwu = this;
            if (((Boolean) obj2).booleanValue()) {
                Object obj3 = pMYI4lLJM.tGV7Q6urW();
                Object q3BipwRCk = nNBfGFMkt.q3BipwRCk(((DrTf1eLw4) jXuUB1Rwu.Eeka1udhb).ilHKhw3Yw());
                if (q3BipwRCk != null) {
                    obj3 = q3BipwRCk;
                }
                idpM54xlp.RG6kpfv3v(oqkvjgxir, null, 0, new BFpiGHRD8(obj3, jXuUB1Rwu.dXrmkklc8, jXuUB1Rwu.RG6kpfv3v, jXuUB1Rwu.ixWaw2akD, null), 3, null);
                jXuUB1Rwu.qVUwofr5s = oqkvjgxir;
                jXuUB1Rwu.MzoOEjc4X = pMYI4lLJM;
                jXuUB1Rwu.ilHKhw3Yw = 1;
                obj2 = pMYI4lLJM.q3BipwRCk(jXuUB1Rwu);
                if (obj2 == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return qih4lW99W.q3BipwRCk;
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
