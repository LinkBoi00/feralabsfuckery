package con;
@jHNqfwCVd(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {322}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class N9PGinIiB extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ float Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ F7nWKUx7R dXrmkklc8;
    public final /* synthetic */ IxbokG044 ilHKhw3Yw;
    public final /* synthetic */ A8uSID1ll qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9PGinIiB(IxbokG044 ixbokG044, A8uSID1ll a8uSID1ll, float f, F7nWKUx7R f7nWKUx7R, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ixbokG044;
        this.qVUwofr5s = a8uSID1ll;
        this.Eeka1udhb = f;
        this.dXrmkklc8 = f7nWKUx7R;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new N9PGinIiB(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new N9PGinIiB(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            float f = ((lRwPpHNL9) this.ilHKhw3Yw.kCA6Zs9sL()).CBQ5d1kRq;
            F7nWKUx7R f7nWKUx7R = null;
            if (lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.J4Ux7ym32)) {
                JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                f7nWKUx7R = new UkUxUO2B6(bRgfgYIQX.tGV7Q6urW, null);
            } else if (lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.tGV7Q6urW)) {
                f7nWKUx7R = new jIU70mpSo();
            } else if (lRwPpHNL9.q3BipwRCk(f, this.qVUwofr5s.dIocxURUo)) {
                f7nWKUx7R = new jWApO2ugs();
            }
            IxbokG044 ixbokG044 = this.ilHKhw3Yw;
            float f2 = this.Eeka1udhb;
            F7nWKUx7R f7nWKUx7R2 = this.dXrmkklc8;
            this.MzoOEjc4X = 1;
            if (WCK7KopoT.q3BipwRCk(ixbokG044, f2, f7nWKUx7R, f7nWKUx7R2, this) == kbkjsqcsl) {
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
