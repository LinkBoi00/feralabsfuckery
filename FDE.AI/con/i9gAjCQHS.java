package con;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.mhl5lIdbQ;
@jHNqfwCVd(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i9gAjCQHS extends dnd1L2J2K implements kkcQgCx5G {
    public /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ LifecycleCoroutineScopeImpl ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9gAjCQHS(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = lifecycleCoroutineScopeImpl;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        i9gAjCQHS i9gajcqhs = new i9gAjCQHS(this.ilHKhw3Yw, (Way959ade) obj2);
        i9gajcqhs.MzoOEjc4X = (oQkvjGXIr) obj;
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        i9gajcqhs.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        i9gAjCQHS i9gajcqhs = new i9gAjCQHS(this.ilHKhw3Yw, way959ade);
        i9gajcqhs.MzoOEjc4X = obj;
        return i9gajcqhs;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) this.MzoOEjc4X;
        if (((N0a4Shkkl) this.ilHKhw3Yw.CBQ5d1kRq).tGV7Q6urW.compareTo(mhl5lIdbQ.EnumC0005mhl5lIdbQ.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.ilHKhw3Yw;
            lifecycleCoroutineScopeImpl.CBQ5d1kRq.q3BipwRCk(lifecycleCoroutineScopeImpl);
        } else {
            anXlDk6fV.Puu3Rhg4F(oqkvjgxir.dIocxURUo(), null, 1, null);
        }
        return qih4lW99W.q3BipwRCk;
    }
}
