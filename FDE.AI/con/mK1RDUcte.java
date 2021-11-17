package con;
@jHNqfwCVd(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mK1RDUcte extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ iClANuYP1 Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ YCaToH5bS ilHKhw3Yw;
    public final /* synthetic */ long qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mK1RDUcte(YCaToH5bS yCaToH5bS, long j, iClANuYP1 iclanuyp1, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = yCaToH5bS;
        this.qVUwofr5s = j;
        this.Eeka1udhb = iclanuyp1;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new mK1RDUcte(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new mK1RDUcte(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kkcQgCx5G kkcqgcx5g;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            IxbokG044 ixbokG044 = this.ilHKhw3Yw.q3BipwRCk;
            YWiUMZOtw yWiUMZOtw = new YWiUMZOtw(this.qVUwofr5s);
            SmsTS63dj smsTS63dj = this.Eeka1udhb.CBQ5d1kRq;
            this.MzoOEjc4X = 1;
            obj = IxbokG044.tGV7Q6urW(ixbokG044, yWiUMZOtw, smsTS63dj, null, null, this, 12);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Kp2rb7nfh kp2rb7nfh = (Kp2rb7nfh) obj;
        if (kp2rb7nfh.J4Ux7ym32 == 2 && (kkcqgcx5g = this.Eeka1udhb.Bhmn1KIah) != null) {
            kkcqgcx5g.WaUP0CF08(new YWiUMZOtw(this.ilHKhw3Yw.J4Ux7ym32), kp2rb7nfh.q3BipwRCk.getValue());
        }
        return qih4lW99W.q3BipwRCk;
    }
}
