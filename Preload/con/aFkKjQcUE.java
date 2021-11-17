package con;
@jHNqfwCVd(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aFkKjQcUE extends dnd1L2J2K implements kkcQgCx5G {
    public /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ float ilHKhw3Yw;
    public final /* synthetic */ T3vFETFEI qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aFkKjQcUE(float f, T3vFETFEI t3vFETFEI, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = f;
        this.qVUwofr5s = t3vFETFEI;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        aFkKjQcUE afkkjqcue = new aFkKjQcUE(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2);
        afkkjqcue.MzoOEjc4X = (uldsWYbnP) obj;
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        afkkjqcue.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        aFkKjQcUE afkkjqcue = new aFkKjQcUE(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
        afkkjqcue.MzoOEjc4X = obj;
        return afkkjqcue;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        ((uldsWYbnP) this.MzoOEjc4X).q3BipwRCk(this.ilHKhw3Yw - ((Number) ((prCJwNx2x) this.qVUwofr5s.GPLPRo6go).getValue()).floatValue());
        return qih4lW99W.q3BipwRCk;
    }
}
