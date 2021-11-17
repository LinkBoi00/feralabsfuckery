package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2", f = "Scrollable.kt", l = {460}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m5nuAhKxv extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ SxXpa24rx ilHKhw3Yw;
    public final /* synthetic */ bzmJZsHMu qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5nuAhKxv(SxXpa24rx sxXpa24rx, bzmJZsHMu bzmjzshmu, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = sxXpa24rx;
        this.qVUwofr5s = bzmjzshmu;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new m5nuAhKxv(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new m5nuAhKxv(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            SxXpa24rx sxXpa24rx = this.ilHKhw3Yw;
            GfYKj7jWp gfYKj7jWp = sxXpa24rx.PSTqBLTET;
            mnTaxtMa7 mntaxtma7 = null;
            GfYKj7jWp gfYKj7jWp2 = gfYKj7jWp == null ? null : gfYKj7jWp;
            if (gfYKj7jWp == null) {
                gfYKj7jWp = null;
            }
            bzmJZsHMu bzmjzshmu = this.qVUwofr5s;
            mnTaxtMa7 mntaxtma72 = sxXpa24rx.qVUwofr5s;
            if (mntaxtma72 != null) {
                mntaxtma7 = mntaxtma72;
            }
            bzmJZsHMu tGV7Q6urW = gfYKj7jWp.tGV7Q6urW(bzmjzshmu, mntaxtma7);
            this.MzoOEjc4X = 1;
            if (gfYKj7jWp2.q3BipwRCk(tGV7Q6urW, this) == kbkjsqcsl) {
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
