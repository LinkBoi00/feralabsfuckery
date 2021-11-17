package con;
@jHNqfwCVd(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1", f = "Clickable.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Pr4ZgNhKr extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ boolean Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 RG6kpfv3v;
    public final /* synthetic */ RNEcgN6dQ WaUP0CF08;
    public final /* synthetic */ boolean dXrmkklc8;
    public final /* synthetic */ UBY2Inzw8 dfpT1j18n;
    public final /* synthetic */ UBY2Inzw8 i8XZMQc6Z;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public final /* synthetic */ boolean qVUwofr5s;
    public final /* synthetic */ RqP4RtdHY sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pr4ZgNhKr(boolean z, boolean z2, boolean z3, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, UBY2Inzw8 uBY2Inzw83, UBY2Inzw8 uBY2Inzw84, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = z;
        this.Eeka1udhb = z2;
        this.dXrmkklc8 = z3;
        this.RG6kpfv3v = uBY2Inzw8;
        this.ixWaw2akD = uBY2Inzw82;
        this.sk5s77z6Q = rqP4RtdHY;
        this.WaUP0CF08 = rNEcgN6dQ;
        this.i8XZMQc6Z = uBY2Inzw83;
        this.dfpT1j18n = uBY2Inzw84;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((Pr4ZgNhKr) dIocxURUo((xOpkxuRlw) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Pr4ZgNhKr pr4ZgNhKr = new Pr4ZgNhKr(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, this.WaUP0CF08, this.i8XZMQc6Z, this.dfpT1j18n, way959ade);
        pr4ZgNhKr.ilHKhw3Yw = obj;
        return pr4ZgNhKr;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xOpkxuRlw xopkxurlw = (xOpkxuRlw) this.ilHKhw3Yw;
            Lf9MVgEK4 lf9MVgEK4 = (!this.qVUwofr5s || !this.Eeka1udhb) ? null : new Lf9MVgEK4(this.RG6kpfv3v, 2);
            Lf9MVgEK4 lf9MVgEK42 = (!this.dXrmkklc8 || !this.Eeka1udhb) ? null : new Lf9MVgEK4(this.ixWaw2akD, 3);
            cBG3voC6q cbg3voc6q = new cBG3voC6q(this.Eeka1udhb, this.sk5s77z6Q, this.WaUP0CF08, this.i8XZMQc6Z, null);
            yqhTRZjLg yqhtrzjlg = new yqhTRZjLg(this.Eeka1udhb, this.dfpT1j18n, 1);
            this.MzoOEjc4X = 1;
            if (fpplAiKys.kCA6Zs9sL(xopkxurlw, lf9MVgEK4, lf9MVgEK42, cbg3voc6q, yqhtrzjlg, this) == kbkjsqcsl) {
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
