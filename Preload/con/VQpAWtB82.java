package con;
@jHNqfwCVd(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VQpAWtB82 extends xBFrXAfL4 implements kkcQgCx5G {
    public Object Bhmn1KIah;
    public int MzoOEjc4X;
    public Object PSTqBLTET;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ Zgh96z4e6 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQpAWtB82(Zgh96z4e6 zgh96z4e6, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = zgh96z4e6;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        VQpAWtB82 vQpAWtB82 = new VQpAWtB82(this.qVUwofr5s, (Way959ade) obj2);
        vQpAWtB82.ilHKhw3Yw = (QScS9iO33) obj;
        return vQpAWtB82.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        VQpAWtB82 vQpAWtB82 = new VQpAWtB82(this.qVUwofr5s, way959ade);
        vQpAWtB82.ilHKhw3Yw = obj;
        return vQpAWtB82;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        VQpAWtB82 vQpAWtB82;
        kBKJSqCSL kbkjsqcsl;
        QScS9iO33 qScS9iO33;
        m8lSPUpKx m8lspupkx;
        DV1oYHwIh dV1oYHwIh;
        NohLR2A3H kCA6Zs9sL;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            QScS9iO33 qScS9iO332 = (QScS9iO33) this.ilHKhw3Yw;
            Object i8XZMQc6Z = this.qVUwofr5s.i8XZMQc6Z();
            if (i8XZMQc6Z instanceof kCusXFqCv) {
                f1p7dM0A1 f1p7dm0a1 = ((kCusXFqCv) i8XZMQc6Z).MzoOEjc4X;
                this.MzoOEjc4X = 1;
                qScS9iO332.iiGwOFFnr(f1p7dm0a1, this);
                return kbkjsqcsl2;
            } else if ((i8XZMQc6Z instanceof S35qAAg28) && (kCA6Zs9sL = ((S35qAAg28) i8XZMQc6Z).kCA6Zs9sL()) != null) {
                dV1oYHwIh = (DV1oYHwIh) kCA6Zs9sL.Bhmn1KIah();
                qScS9iO33 = qScS9iO332;
                kbkjsqcsl = kbkjsqcsl2;
                vQpAWtB82 = this;
                m8lspupkx = kCA6Zs9sL;
                if (!anXlDk6fV.tGV7Q6urW(dV1oYHwIh, m8lspupkx)) {
                }
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            dV1oYHwIh = (DV1oYHwIh) this.PSTqBLTET;
            m8lspupkx = (m8lSPUpKx) this.Bhmn1KIah;
            qScS9iO33 = (QScS9iO33) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
            vQpAWtB82 = this;
            kbkjsqcsl = kbkjsqcsl2;
            dV1oYHwIh = dV1oYHwIh.PSTqBLTET();
            if (!anXlDk6fV.tGV7Q6urW(dV1oYHwIh, m8lspupkx)) {
                if (dV1oYHwIh instanceof kCusXFqCv) {
                    f1p7dM0A1 f1p7dm0a12 = ((kCusXFqCv) dV1oYHwIh).MzoOEjc4X;
                    vQpAWtB82.ilHKhw3Yw = qScS9iO33;
                    vQpAWtB82.Bhmn1KIah = m8lspupkx;
                    vQpAWtB82.PSTqBLTET = dV1oYHwIh;
                    vQpAWtB82.MzoOEjc4X = 2;
                    qScS9iO33.iiGwOFFnr(f1p7dm0a12, vQpAWtB82);
                    if (kbkjsqcsl2 == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                }
                dV1oYHwIh = dV1oYHwIh.PSTqBLTET();
                if (!anXlDk6fV.tGV7Q6urW(dV1oYHwIh, m8lspupkx)) {
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
