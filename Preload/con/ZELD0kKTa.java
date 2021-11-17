package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ZELD0kKTa extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ SmsTS63dj Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ sl5e2Y3xY dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ float qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZELD0kKTa(float f, SmsTS63dj smsTS63dj, sl5e2Y3xY sl5e2y3xy, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = f;
        this.Eeka1udhb = smsTS63dj;
        this.dXrmkklc8 = sl5e2y3xy;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        ZELD0kKTa zELD0kKTa = new ZELD0kKTa(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        zELD0kKTa.ilHKhw3Yw = (tDmftakZl) obj;
        return zELD0kKTa.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        ZELD0kKTa zELD0kKTa = new ZELD0kKTa(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
        zELD0kKTa.ilHKhw3Yw = obj;
        return zELD0kKTa;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            float f = this.qVUwofr5s;
            SmsTS63dj smsTS63dj = this.Eeka1udhb;
            s49RbLNOF s49rblnof = new s49RbLNOF(this.dXrmkklc8, (tDmftakZl) this.ilHKhw3Yw);
            this.MzoOEjc4X = 1;
            aVKpYNINy avkpyniny = NvSSsPAuJ.q3BipwRCk;
            Float f2 = new Float(0.0f);
            Float f3 = new Float(f);
            Float f4 = new Float(0.0f);
            DlhjQ2PrY dlhjQ2PrY = DlhjQ2PrY.Eeka1udhb;
            jOCYbBWA4 jocybbwa4 = (jOCYbBWA4) dlhjQ2PrY.IytU16YUK(f4);
            if (jocybbwa4 == null) {
                jocybbwa4 = ((jOCYbBWA4) dlhjQ2PrY.IytU16YUK(f2)).tGV7Q6urW();
            }
            Object q3BipwRCk = cqKak5Wfn.q3BipwRCk(new rJ2CWKUxs(avkpyniny, f2, jocybbwa4, 0, 0, false, 56), new mYnW3ngzJ(smsTS63dj, avkpyniny, f2, f3, jocybbwa4), Long.MIN_VALUE, new BMKn6k4cx(s49rblnof, avkpyniny), this);
            if (q3BipwRCk != obj2) {
                q3BipwRCk = qih4lW99W.q3BipwRCk;
            }
            if (q3BipwRCk != obj2) {
                q3BipwRCk = qih4lW99W.q3BipwRCk;
            }
            if (q3BipwRCk == obj2) {
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
