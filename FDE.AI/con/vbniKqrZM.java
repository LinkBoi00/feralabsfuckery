package con;
@jHNqfwCVd(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {432}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class vbniKqrZM extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ kdbvrtBH1 ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbniKqrZM(kdbvrtBH1 kdbvrtbh1, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = kdbvrtbh1;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new vbniKqrZM(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new vbniKqrZM(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        OO5EOV5Xw oO5EOV5Xw;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0 || i == 1) {
            anXlDk6fV.IytU16YUK(obj);
            do {
                oO5EOV5Xw = new OO5EOV5Xw(this.ilHKhw3Yw, 0);
                this.MzoOEjc4X = 1;
            } while (xpuSUT7Gh.juJ6pnCpu(kCA6Zs9sL()).q3BipwRCk(oO5EOV5Xw, this) != kbkjsqcsl);
            return kbkjsqcsl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
