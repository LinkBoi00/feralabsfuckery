package con;
@jHNqfwCVd(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ns8pCOg2h extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ NS7oquKVI ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns8pCOg2h(NS7oquKVI nS7oquKVI, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = nS7oquKVI;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new ns8pCOg2h(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new ns8pCOg2h(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            IxbokG044 ixbokG044 = this.ilHKhw3Yw.yWvV4ePLl;
            Float f = new Float(1.0f);
            lOtvezK70 lotvezk70 = TqRcaVEga.q3BipwRCk;
            VGh7XGpXv GPLPRo6go = cqKak5Wfn.GPLPRo6go(225, 0, XP8g1cdgt.q3BipwRCk, 2);
            this.MzoOEjc4X = 1;
            if (IxbokG044.tGV7Q6urW(ixbokG044, f, GPLPRo6go, null, null, this, 12) == kbkjsqcsl) {
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
