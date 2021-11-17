package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.UtilsKt$ioCoroutine$2", f = "Utils.kt", l = {320}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class KPGMfmvlR extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ kkcQgCx5G qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPGMfmvlR(kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        KPGMfmvlR kPGMfmvlR = new KPGMfmvlR(this.qVUwofr5s, (Way959ade) obj2);
        kPGMfmvlR.ilHKhw3Yw = (oQkvjGXIr) obj;
        return kPGMfmvlR.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        KPGMfmvlR kPGMfmvlR = new KPGMfmvlR(this.qVUwofr5s, way959ade);
        kPGMfmvlR.ilHKhw3Yw = obj;
        return kPGMfmvlR;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            kkcQgCx5G kkcqgcx5g = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            if (kkcqgcx5g.WaUP0CF08((oQkvjGXIr) this.ilHKhw3Yw, this) == kbkjsqcsl) {
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
