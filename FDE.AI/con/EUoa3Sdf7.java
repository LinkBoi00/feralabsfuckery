package con;
@jHNqfwCVd(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {862}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class EUoa3Sdf7 extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ kdbvrtBH1 ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EUoa3Sdf7(kdbvrtBH1 kdbvrtbh1, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = kdbvrtbh1;
        this.qVUwofr5s = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new EUoa3Sdf7(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new EUoa3Sdf7(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            Sm35UxCQt GPLPRo6go = u51fgFYkV.GPLPRo6go(new r0uVnCFTP(this.ilHKhw3Yw, 0));
            Bxkl1BO9q bxkl1BO9q = new Bxkl1BO9q(this.qVUwofr5s, 0);
            this.MzoOEjc4X = 1;
            if (((FqL6c6a4s) GPLPRo6go).tGV7Q6urW(bxkl1BO9q, this) == kbkjsqcsl) {
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
