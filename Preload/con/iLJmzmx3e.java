package con;
@jHNqfwCVd(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class iLJmzmx3e extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ bnrfwdIF3 ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iLJmzmx3e(bnrfwdIF3 bnrfwdif3, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = bnrfwdif3;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new iLJmzmx3e(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new iLJmzmx3e(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        nmKJZrF2V nmkjzrf2v;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0 || i == 1) {
            anXlDk6fV.IytU16YUK(obj);
            do {
                nmkjzrf2v = new nmKJZrF2V(this.ilHKhw3Yw, 0);
                this.MzoOEjc4X = 1;
            } while (BTxNLnjYc.J4Ux7ym32(nmkjzrf2v, this) != kbkjsqcsl);
            return kbkjsqcsl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
