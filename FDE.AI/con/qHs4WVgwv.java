package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class qHs4WVgwv extends dnd1L2J2K implements NzvP5Rex8 {
    public /* synthetic */ float MzoOEjc4X;
    public final /* synthetic */ RNEcgN6dQ ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qHs4WVgwv(RNEcgN6dQ rNEcgN6dQ, UBY2Inzw8 uBY2Inzw8, Way959ade way959ade) {
        super(3, way959ade);
        this.ilHKhw3Yw = rNEcgN6dQ;
        this.qVUwofr5s = uBY2Inzw8;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        float floatValue = ((Number) obj2).floatValue();
        qHs4WVgwv qhs4wvgwv = new qHs4WVgwv(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj3);
        qhs4wvgwv.MzoOEjc4X = floatValue;
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        qhs4wvgwv.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        float f = this.MzoOEjc4X;
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) ((ZlqqdUjab) ((prCJwNx2x) this.ilHKhw3Yw).getValue()).q3BipwRCk.GPLPRo6go();
        if (oqkvjgxir != null) {
            idpM54xlp.RG6kpfv3v(oqkvjgxir, null, 0, new L1Ht8Itle(this.qVUwofr5s, f, null), 3, null);
            return qih4lW99W.q3BipwRCk;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
