package con;

import java.util.concurrent.CancellationException;
@jHNqfwCVd(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RbFyxc6eD extends dnd1L2J2K implements kkcQgCx5G {
    public Object Eeka1udhb;
    public Object MzoOEjc4X;
    public /* synthetic */ Object RG6kpfv3v;
    public final /* synthetic */ kkcQgCx5G WaUP0CF08;
    public int dXrmkklc8;
    public final /* synthetic */ Object i8XZMQc6Z;
    public Object ilHKhw3Yw;
    public final /* synthetic */ s1x258HRp ixWaw2akD;
    public Object qVUwofr5s;
    public final /* synthetic */ YbqT9SvuP sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RbFyxc6eD(s1x258HRp s1x258hrp, YbqT9SvuP ybqT9SvuP, kkcQgCx5G kkcqgcx5g, Object obj, Way959ade way959ade) {
        super(2, way959ade);
        this.ixWaw2akD = s1x258hrp;
        this.sk5s77z6Q = ybqT9SvuP;
        this.WaUP0CF08 = kkcqgcx5g;
        this.i8XZMQc6Z = obj;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        RbFyxc6eD rbFyxc6eD = new RbFyxc6eD(this.ixWaw2akD, this.sk5s77z6Q, this.WaUP0CF08, this.i8XZMQc6Z, (Way959ade) obj2);
        rbFyxc6eD.RG6kpfv3v = (oQkvjGXIr) obj;
        return rbFyxc6eD.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        RbFyxc6eD rbFyxc6eD = new RbFyxc6eD(this.ixWaw2akD, this.sk5s77z6Q, this.WaUP0CF08, this.i8XZMQc6Z, way959ade);
        rbFyxc6eD.RG6kpfv3v = obj;
        return rbFyxc6eD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        YbqT9SvuP ybqT9SvuP;
        fUJGMf60J fujgmf60j;
        kkcQgCx5G kkcqgcx5g;
        Object obj2;
        BoHshzX5h boHshzX5h;
        fUJGMf60J fujgmf60j2;
        YbqT9SvuP ybqT9SvuP2;
        fUJGMf60J fujgmf60j3;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        BoHshzX5h boHshzX5h2 = this.dXrmkklc8;
        try {
            try {
                if (boHshzX5h2 == 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    s1x258HRp s1x258hrp = this.ixWaw2akD;
                    bu5cjmae6 dIocxURUo = ((oQkvjGXIr) this.RG6kpfv3v).dIocxURUo();
                    int i = JEWwjBE8f.GPLPRo6go;
                    fUJGMf60J fujgmf60j4 = new fUJGMf60J(s1x258hrp, (JEWwjBE8f) dIocxURUo.get(y5p19vMdC.CBQ5d1kRq));
                    YbqT9SvuP ybqT9SvuP3 = this.sk5s77z6Q;
                    do {
                        fujgmf60j3 = (fUJGMf60J) ybqT9SvuP3.q3BipwRCk.get();
                        if (fujgmf60j3 != null) {
                            if (!(fujgmf60j4.q3BipwRCk.compareTo(fujgmf60j3.q3BipwRCk) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!ybqT9SvuP3.q3BipwRCk.compareAndSet(fujgmf60j3, fujgmf60j4));
                    if (fujgmf60j3 != null) {
                        ((Zgh96z4e6) fujgmf60j3.J4Ux7ym32).oon79WMrY(null);
                    }
                    ybqT9SvuP = this.sk5s77z6Q;
                    BoHshzX5h boHshzX5h3 = ybqT9SvuP.J4Ux7ym32;
                    kkcQgCx5G kkcqgcx5g2 = this.WaUP0CF08;
                    Object obj3 = this.i8XZMQc6Z;
                    this.RG6kpfv3v = fujgmf60j4;
                    this.MzoOEjc4X = boHshzX5h3;
                    this.ilHKhw3Yw = kkcqgcx5g2;
                    this.qVUwofr5s = obj3;
                    this.Eeka1udhb = ybqT9SvuP;
                    this.dXrmkklc8 = 1;
                    eIPvIAVtY eipviavty = (eIPvIAVtY) boHshzX5h3;
                    if (eipviavty.q3BipwRCk(null, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    obj2 = obj3;
                    fujgmf60j = fujgmf60j4;
                    boHshzX5h = eipviavty;
                    kkcqgcx5g = kkcqgcx5g2;
                } else if (boHshzX5h2 == 1) {
                    ybqT9SvuP = (YbqT9SvuP) this.Eeka1udhb;
                    obj2 = this.qVUwofr5s;
                    kkcqgcx5g = (kkcQgCx5G) this.ilHKhw3Yw;
                    boHshzX5h = (BoHshzX5h) this.MzoOEjc4X;
                    fujgmf60j = (fUJGMf60J) this.RG6kpfv3v;
                    anXlDk6fV.IytU16YUK(obj);
                } else if (boHshzX5h2 == 2) {
                    ybqT9SvuP2 = (YbqT9SvuP) this.ilHKhw3Yw;
                    boHshzX5h = (BoHshzX5h) this.MzoOEjc4X;
                    fujgmf60j2 = (fUJGMf60J) this.RG6kpfv3v;
                    try {
                        anXlDk6fV.IytU16YUK(obj);
                        ybqT9SvuP2.q3BipwRCk.compareAndSet(fujgmf60j2, null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        ybqT9SvuP2.q3BipwRCk.compareAndSet(fujgmf60j2, null);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.RG6kpfv3v = fujgmf60j;
                this.MzoOEjc4X = boHshzX5h;
                this.ilHKhw3Yw = ybqT9SvuP;
                this.qVUwofr5s = null;
                this.Eeka1udhb = null;
                this.dXrmkklc8 = 2;
                Object WaUP0CF08 = kkcqgcx5g.WaUP0CF08(obj2, this);
                if (WaUP0CF08 == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                ybqT9SvuP2 = ybqT9SvuP;
                obj = WaUP0CF08;
                fujgmf60j2 = fujgmf60j;
                ybqT9SvuP2.q3BipwRCk.compareAndSet(fujgmf60j2, null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                fujgmf60j2 = fujgmf60j;
                ybqT9SvuP2 = ybqT9SvuP;
                ybqT9SvuP2.q3BipwRCk.compareAndSet(fujgmf60j2, null);
                throw th;
            }
        } finally {
            ((eIPvIAVtY) boHshzX5h2).tGV7Q6urW(null);
        }
    }
}
