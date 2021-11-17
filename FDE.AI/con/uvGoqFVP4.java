package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$1", f = "Scrollable.kt", l = {455}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class uvGoqFVP4 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ bzmJZsHMu Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ SxXpa24rx ilHKhw3Yw;
    public final /* synthetic */ bzmJZsHMu qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvGoqFVP4(SxXpa24rx sxXpa24rx, bzmJZsHMu bzmjzshmu, bzmJZsHMu bzmjzshmu2, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = sxXpa24rx;
        this.qVUwofr5s = bzmjzshmu;
        this.Eeka1udhb = bzmjzshmu2;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new uvGoqFVP4(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new uvGoqFVP4(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        float f;
        float f2;
        Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            SxXpa24rx sxXpa24rx = this.ilHKhw3Yw;
            bzmJZsHMu bzmjzshmu = this.qVUwofr5s;
            bzmJZsHMu bzmjzshmu2 = this.Eeka1udhb;
            this.MzoOEjc4X = 1;
            int ordinal = sxXpa24rx.CBQ5d1kRq.ordinal();
            if (ordinal == 0) {
                f2 = bzmjzshmu.J4Ux7ym32;
                f = bzmjzshmu2.J4Ux7ym32;
            } else if (ordinal == 1) {
                f2 = bzmjzshmu.q3BipwRCk;
                f = bzmjzshmu2.q3BipwRCk;
            } else {
                throw new dnCerKhAM();
            }
            float f3 = f2 - f;
            S4g0LufWW s4g0LufWW = sxXpa24rx.kmSgne1rO;
            if (sxXpa24rx.Bhmn1KIah) {
                f3 *= (float) -1;
            }
            Object oon79WMrY = xP6F5SR9v.oon79WMrY(s4g0LufWW, f3, null, this, 2);
            if (oon79WMrY != obj2) {
                oon79WMrY = qih4lW99W.q3BipwRCk;
            }
            if (oon79WMrY == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
