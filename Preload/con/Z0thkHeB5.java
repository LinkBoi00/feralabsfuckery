package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Z0thkHeB5 extends dnd1L2J2K implements NzvP5Rex8 {
    public final /* synthetic */ oQkvjGXIr Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ RqP4RtdHY RG6kpfv3v;
    public final /* synthetic */ RNEcgN6dQ dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public /* synthetic */ long qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0thkHeB5(oQkvjGXIr oqkvjgxir, RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, Way959ade way959ade) {
        super(3, way959ade);
        this.Eeka1udhb = oqkvjgxir;
        this.dXrmkklc8 = rNEcgN6dQ;
        this.RG6kpfv3v = rqP4RtdHY;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        long j = ((bRgfgYIQX) obj2).q3BipwRCk;
        Z0thkHeB5 z0thkHeB5 = new Z0thkHeB5(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj3);
        z0thkHeB5.ilHKhw3Yw = (eP3ZpMpES) obj;
        z0thkHeB5.qVUwofr5s = j;
        return z0thkHeB5.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            idpM54xlp.RG6kpfv3v(this.Eeka1udhb, null, 0, new gOT6iHysp(this.dXrmkklc8, this.qVUwofr5s, this.RG6kpfv3v, null), 3, null);
            this.MzoOEjc4X = 1;
            obj = ((eP3ZpMpES) this.ilHKhw3Yw).GPLPRo6go(this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        idpM54xlp.RG6kpfv3v(this.Eeka1udhb, null, 0, new v0EiJ1BC3(this.dXrmkklc8, ((Boolean) obj).booleanValue(), this.RG6kpfv3v, null), 3, null);
        return qih4lW99W.q3BipwRCk;
    }
}
