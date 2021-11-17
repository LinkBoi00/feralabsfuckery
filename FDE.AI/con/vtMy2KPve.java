package con;

import android.content.Context;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$unPreload$2", f = "Utils.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class vtMy2KPve extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ Context qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtMy2KPve(Context context, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = context;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        vtMy2KPve vtmy2kpve = new vtMy2KPve(this.qVUwofr5s, (Way959ade) obj2);
        vtmy2kpve.ilHKhw3Yw = (oQkvjGXIr) obj;
        return vtmy2kpve.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        vtMy2KPve vtmy2kpve = new vtMy2KPve(this.qVUwofr5s, way959ade);
        vtmy2kpve.ilHKhw3Yw = obj;
        return vtmy2kpve;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        oQkvjGXIr oqkvjgxir;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oQkvjGXIr oqkvjgxir2 = (oQkvjGXIr) this.ilHKhw3Yw;
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk = KYuHUB7GA.q3BipwRCk("eD0xMDt3aGlsZSBbICR4IC1ndCAwIF07IGRvIGtpbGxhbGwgbGlidm10b3VjaC5zbztraWxsYWxsIHByZWxvYWRmdXNlOyB4PSQoKCR4LTEpKTtkb25lO2FtIHdyaXRlO3N5bmM7ZWNobyAxID4vcHJvYy9zeXMvdm0vZHJvcF9jYWNoZXM7c3luYzs=");
            this.ilHKhw3Yw = oqkvjgxir2;
            this.MzoOEjc4X = 1;
            if (yuSxiExwK.Bhmn1KIah(q3BipwRCk, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            oqkvjgxir = oqkvjgxir2;
        } else if (i == 1) {
            oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return idpM54xlp.RG6kpfv3v(oqkvjgxir, tQmFGxsat.tGV7Q6urW, 0, new uyjMjxZot(this.qVUwofr5s, null), 2, null);
    }
}
