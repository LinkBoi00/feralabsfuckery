package con;

import java.util.concurrent.CancellationException;
@jHNqfwCVd(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class se8CDeYcE extends dnd1L2J2K implements kkcQgCx5G {
    public int Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ int RG6kpfv3v;
    public /* synthetic */ Object dXrmkklc8;
    public Object ilHKhw3Yw;
    public final /* synthetic */ JYbEazuZl ixWaw2akD;
    public Object qVUwofr5s;
    public final /* synthetic */ PmanMZxiM sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se8CDeYcE(int i, JYbEazuZl jYbEazuZl, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(2, way959ade);
        this.RG6kpfv3v = i;
        this.ixWaw2akD = jYbEazuZl;
        this.sk5s77z6Q = pmanMZxiM;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        se8CDeYcE se8cdeyce = new se8CDeYcE(this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, (Way959ade) obj2);
        se8cdeyce.dXrmkklc8 = (oQkvjGXIr) obj;
        return se8cdeyce.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        se8CDeYcE se8cdeyce = new se8CDeYcE(this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, way959ade);
        se8cdeyce.dXrmkklc8 = obj;
        return se8cdeyce;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Throwable th;
        qXdejonEi qxdejonei;
        JYbEazuZl jYbEazuZl;
        Object obj2;
        qXdejonEi qxdejonei2;
        JYbEazuZl jYbEazuZl2;
        PmanMZxiM pmanMZxiM;
        qXdejonEi qxdejonei3;
        Object obj3;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        ?? r1 = this.Eeka1udhb;
        try {
            try {
                if (r1 == 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    int i = this.RG6kpfv3v;
                    bu5cjmae6 dIocxURUo = ((oQkvjGXIr) this.dXrmkklc8).dIocxURUo();
                    int i2 = JEWwjBE8f.GPLPRo6go;
                    qXdejonEi qxdejonei4 = new qXdejonEi(i, (JEWwjBE8f) dIocxURUo.get(y5p19vMdC.CBQ5d1kRq));
                    JYbEazuZl jYbEazuZl3 = this.ixWaw2akD;
                    do {
                        qxdejonei2 = (qXdejonEi) jYbEazuZl3.q3BipwRCk.get();
                        if (qxdejonei2 != null) {
                            if (!(vtDfS6nCt.J4Ux7ym32(qxdejonei4.q3BipwRCk, qxdejonei2.q3BipwRCk) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!jYbEazuZl3.q3BipwRCk.compareAndSet(qxdejonei2, qxdejonei4));
                    if (qxdejonei2 != null) {
                        ((Zgh96z4e6) qxdejonei2.J4Ux7ym32).oon79WMrY(null);
                    }
                    jYbEazuZl2 = this.ixWaw2akD;
                    BoHshzX5h boHshzX5h = jYbEazuZl2.J4Ux7ym32;
                    PmanMZxiM pmanMZxiM2 = this.sk5s77z6Q;
                    this.dXrmkklc8 = qxdejonei4;
                    this.MzoOEjc4X = boHshzX5h;
                    this.ilHKhw3Yw = pmanMZxiM2;
                    this.qVUwofr5s = jYbEazuZl2;
                    this.Eeka1udhb = 1;
                    eIPvIAVtY eipviavty = (eIPvIAVtY) boHshzX5h;
                    if (eipviavty.q3BipwRCk(null, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    pmanMZxiM = pmanMZxiM2;
                    qxdejonei3 = qxdejonei4;
                    obj3 = eipviavty;
                } else if (r1 == 1) {
                    jYbEazuZl2 = (JYbEazuZl) this.qVUwofr5s;
                    pmanMZxiM = (PmanMZxiM) this.ilHKhw3Yw;
                    qxdejonei3 = (qXdejonEi) this.dXrmkklc8;
                    anXlDk6fV.IytU16YUK(obj);
                    obj3 = (BoHshzX5h) this.MzoOEjc4X;
                } else if (r1 == 2) {
                    jYbEazuZl = (JYbEazuZl) this.ilHKhw3Yw;
                    obj2 = (BoHshzX5h) this.MzoOEjc4X;
                    qxdejonei = (qXdejonEi) this.dXrmkklc8;
                    try {
                        anXlDk6fV.IytU16YUK(obj);
                        jYbEazuZl.q3BipwRCk.compareAndSet(qxdejonei, null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        jYbEazuZl.q3BipwRCk.compareAndSet(qxdejonei, null);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.dXrmkklc8 = qxdejonei3;
                this.MzoOEjc4X = obj2;
                this.ilHKhw3Yw = jYbEazuZl2;
                this.qVUwofr5s = null;
                this.Eeka1udhb = 2;
                Object IytU16YUK = pmanMZxiM.IytU16YUK(this);
                if (IytU16YUK == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                jYbEazuZl = jYbEazuZl2;
                obj = IytU16YUK;
                qxdejonei = qxdejonei3;
                jYbEazuZl.q3BipwRCk.compareAndSet(qxdejonei, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                qxdejonei = qxdejonei3;
                jYbEazuZl = jYbEazuZl2;
                jYbEazuZl.q3BipwRCk.compareAndSet(qxdejonei, null);
                throw th;
            }
            obj2 = obj3;
        } finally {
            ((eIPvIAVtY) r1).tGV7Q6urW(null);
        }
    }
}
