package con;

import java.util.Map;
@jHNqfwCVd(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class bURVyXJhR extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ fJQzHH3Lh Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ kkcQgCx5G RG6kpfv3v;
    public final /* synthetic */ AU29aHa4X dXrmkklc8;
    public final /* synthetic */ T3vFETFEI ilHKhw3Yw;
    public final /* synthetic */ float ixWaw2akD;
    public final /* synthetic */ Map qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bURVyXJhR(T3vFETFEI t3vFETFEI, Map map, fJQzHH3Lh fjqzhh3lh, AU29aHa4X aU29aHa4X, kkcQgCx5G kkcqgcx5g, float f, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = t3vFETFEI;
        this.qVUwofr5s = map;
        this.Eeka1udhb = fjqzhh3lh;
        this.dXrmkklc8 = aU29aHa4X;
        this.RG6kpfv3v = kkcqgcx5g;
        this.ixWaw2akD = f;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        return ((bURVyXJhR) dIocxURUo((oQkvjGXIr) obj, (Way959ade) obj2)).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new bURVyXJhR(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            Map tGV7Q6urW = this.ilHKhw3Yw.tGV7Q6urW();
            T3vFETFEI t3vFETFEI = this.ilHKhw3Yw;
            ((prCJwNx2x) t3vFETFEI.yWvV4ePLl).CBQ5d1kRq(this.qVUwofr5s);
            T3vFETFEI t3vFETFEI2 = this.ilHKhw3Yw;
            ((prCJwNx2x) t3vFETFEI2.PSTqBLTET).CBQ5d1kRq(this.Eeka1udhb);
            T3vFETFEI t3vFETFEI3 = this.ilHKhw3Yw;
            ((prCJwNx2x) t3vFETFEI3.kmSgne1rO).CBQ5d1kRq(new aoIh72bBV(this.qVUwofr5s, this.RG6kpfv3v, this.dXrmkklc8));
            AU29aHa4X aU29aHa4X = this.dXrmkklc8;
            T3vFETFEI t3vFETFEI4 = this.ilHKhw3Yw;
            float MzoOEjc4X = aU29aHa4X.MzoOEjc4X(this.ixWaw2akD);
            ((prCJwNx2x) t3vFETFEI4.Bhmn1KIah).CBQ5d1kRq(Float.valueOf(MzoOEjc4X));
            T3vFETFEI t3vFETFEI5 = this.ilHKhw3Yw;
            Map map = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            if (t3vFETFEI5.kCA6Zs9sL(tGV7Q6urW, map, this) == kbkjsqcsl) {
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
