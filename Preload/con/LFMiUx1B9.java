package con;
@jHNqfwCVd(c = "androidx.compose.material3.DefaultButtonElevation$animateElevation$3", f = "Button.kt", l = {919}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LFMiUx1B9 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ float Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ F7nWKUx7R dXrmkklc8;
    public final /* synthetic */ IxbokG044 ilHKhw3Yw;
    public final /* synthetic */ qC152syJB qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LFMiUx1B9(IxbokG044 ixbokG044, qC152syJB qc152syjb, float f, F7nWKUx7R f7nWKUx7R, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ixbokG044;
        this.qVUwofr5s = qc152syjb;
        this.Eeka1udhb = f;
        this.dXrmkklc8 = f7nWKUx7R;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new LFMiUx1B9(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new LFMiUx1B9(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        if ((r12 instanceof con.jWApO2ugs) != false) goto L_0x0092;
     */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Object obj2;
        Object obj3;
        VGh7XGpXv vGh7XGpXv;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            float f = ((lRwPpHNL9) this.ilHKhw3Yw.kCA6Zs9sL()).CBQ5d1kRq;
            VGh7XGpXv vGh7XGpXv2 = null;
            if (lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.J4Ux7ym32)) {
                JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                obj2 = new UkUxUO2B6(bRgfgYIQX.tGV7Q6urW, null);
            } else if (lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.dIocxURUo)) {
                obj2 = new jIU70mpSo();
            } else {
                obj2 = lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.tGV7Q6urW) ? new jWApO2ugs() : null;
            }
            IxbokG044 ixbokG044 = this.ilHKhw3Yw;
            float f2 = this.Eeka1udhb;
            F7nWKUx7R f7nWKUx7R = this.dXrmkklc8;
            this.MzoOEjc4X = 1;
            VGh7XGpXv vGh7XGpXv3 = RApgEtg3Y.q3BipwRCk;
            if (f7nWKUx7R != null) {
                if ((f7nWKUx7R instanceof UkUxUO2B6) || (f7nWKUx7R instanceof WrfOxY8G8) || (f7nWKUx7R instanceof jIU70mpSo) || (f7nWKUx7R instanceof jWApO2ugs)) {
                    vGh7XGpXv2 = RApgEtg3Y.q3BipwRCk;
                }
            } else if (obj2 != null) {
                if (!(obj2 instanceof UkUxUO2B6) && !(obj2 instanceof WrfOxY8G8)) {
                    if (obj2 instanceof jIU70mpSo) {
                        vGh7XGpXv = RApgEtg3Y.tGV7Q6urW;
                        vGh7XGpXv2 = vGh7XGpXv;
                    }
                }
                vGh7XGpXv = RApgEtg3Y.J4Ux7ym32;
                vGh7XGpXv2 = vGh7XGpXv;
            }
            if (vGh7XGpXv2 == null ? (obj3 = ixbokG044.GPLPRo6go(new lRwPpHNL9(f2), this)) != kbkjsqcsl : (obj3 = IxbokG044.tGV7Q6urW(ixbokG044, new lRwPpHNL9(f2), vGh7XGpXv2, null, null, this, 12)) != kbkjsqcsl) {
                obj3 = qih4lW99W.q3BipwRCk;
            }
            if (obj3 == kbkjsqcsl) {
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
