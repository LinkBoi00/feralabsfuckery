package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TFmxFDpaN extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RNEcgN6dQ Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 RG6kpfv3v;
    public final /* synthetic */ RqP4RtdHY dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ oQkvjGXIr qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TFmxFDpaN(oQkvjGXIr oqkvjgxir, RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, UBY2Inzw8 uBY2Inzw8, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = oqkvjgxir;
        this.Eeka1udhb = rNEcgN6dQ;
        this.dXrmkklc8 = rqP4RtdHY;
        this.RG6kpfv3v = uBY2Inzw8;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        TFmxFDpaN tFmxFDpaN = new TFmxFDpaN(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        tFmxFDpaN.ilHKhw3Yw = (xOpkxuRlw) obj;
        return tFmxFDpaN.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        TFmxFDpaN tFmxFDpaN = new TFmxFDpaN(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        tFmxFDpaN.ilHKhw3Yw = obj;
        return tFmxFDpaN;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            Z0thkHeB5 z0thkHeB5 = new Z0thkHeB5(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, null);
            Lf9MVgEK4 lf9MVgEK4 = new Lf9MVgEK4(this.RG6kpfv3v, 6);
            this.MzoOEjc4X = 1;
            if (fpplAiKys.dIocxURUo((xOpkxuRlw) this.ilHKhw3Yw, z0thkHeB5, lf9MVgEK4, this) == kbkjsqcsl) {
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
