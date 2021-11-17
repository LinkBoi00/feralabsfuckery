package con;

import java.util.ArrayList;
@jHNqfwCVd(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", f = "HoverInteraction.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class vFTFXpVwK extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ KnVJFSivd ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vFTFXpVwK(KnVJFSivd knVJFSivd, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = knVJFSivd;
        this.qVUwofr5s = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new vFTFXpVwK(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new vFTFXpVwK(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ArrayList arrayList = new ArrayList();
            StKB0Hl3H stKB0Hl3H = ((RqP4RtdHY) this.ilHKhw3Yw).q3BipwRCk;
            Vf7VAKj3F vf7VAKj3F = new Vf7VAKj3F(arrayList, this.qVUwofr5s, 1);
            this.MzoOEjc4X = 1;
            if (stKB0Hl3H.tGV7Q6urW(vf7VAKj3F, this) == kbkjsqcsl) {
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
