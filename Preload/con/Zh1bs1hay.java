package con;
@jHNqfwCVd(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {565, 566}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Zh1bs1hay extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ long ilHKhw3Yw;
    public final /* synthetic */ k0ugT26MT qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh1bs1hay(long j, k0ugT26MT k0ugt26mt, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = j;
        this.qVUwofr5s = k0ugt26mt;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Zh1bs1hay(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Zh1bs1hay(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Z3EvbqMGQ z3EvbqMGQ;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.MzoOEjc4X = 1;
            if (dnBSj5uJN.Bhmn1KIah(this.ilHKhw3Yw - 1, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            anXlDk6fV.IytU16YUK(obj);
            z3EvbqMGQ = this.qVUwofr5s.Bhmn1KIah;
            if (z3EvbqMGQ != null) {
                z3EvbqMGQ.Bhmn1KIah(new qlt0VySXJ(new XWPJolaX3(this.ilHKhw3Yw)));
            }
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.MzoOEjc4X = 2;
        if (dnBSj5uJN.Bhmn1KIah(1, this) == kbkjsqcsl) {
            return kbkjsqcsl;
        }
        z3EvbqMGQ = this.qVUwofr5s.Bhmn1KIah;
        if (z3EvbqMGQ != null) {
        }
        return qih4lW99W.q3BipwRCk;
    }
}
