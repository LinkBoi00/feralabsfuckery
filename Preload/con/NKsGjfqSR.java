package con;

import android.content.pm.PackageManager;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$AppList$1$2", f = "MainActivity.kt", l = {782}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NKsGjfqSR extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ fhHgxp0FC Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ RNEcgN6dQ dXrmkklc8;
    public final /* synthetic */ PmYqqGuHi ilHKhw3Yw;
    public final /* synthetic */ PackageManager qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKsGjfqSR(PmYqqGuHi pmYqqGuHi, PackageManager packageManager, fhHgxp0FC fhhgxp0fc, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = pmYqqGuHi;
        this.qVUwofr5s = packageManager;
        this.Eeka1udhb = fhhgxp0fc;
        this.dXrmkklc8 = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new NKsGjfqSR(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new NKsGjfqSR(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xaeEKvU2c xaeekvu2c = tQmFGxsat.tGV7Q6urW;
            eYj6GSkqH eyj6gskqh = new eYj6GSkqH(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, null);
            this.MzoOEjc4X = 1;
            if (idpM54xlp.qFBXIgpia(xaeekvu2c, eyj6gskqh, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
