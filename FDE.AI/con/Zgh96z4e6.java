package con;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class Zgh96z4e6 implements JEWwjBE8f, f1p7dM0A1, JdgJLcZNG {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CBQ5d1kRq = AtomicReferenceFieldUpdater.newUpdater(Zgh96z4e6.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public Zgh96z4e6(boolean z) {
        this._state = z ? AB5ApHoQM.GPLPRo6go : AB5ApHoQM.iiGwOFFnr;
        this._parentHandle = null;
    }

    public String AqaWJg0b4() {
        return getClass().getSimpleName();
    }

    public final boolean CBQ5d1kRq(Throwable th) {
        if (CpG0imbht()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        aX1NJ0djy ax1nj0djy = (aX1NJ0djy) this._parentHandle;
        if (ax1nj0djy == null || ax1nj0djy == JNEteW1Z7.CBQ5d1kRq) {
            return z;
        }
        if (ax1nj0djy.dIocxURUo(th) || z) {
            return true;
        }
        return false;
    }

    public boolean CpG0imbht() {
        return this instanceof y7qLT84T0;
    }

    public final Object EBQXiIPmm(Object obj, Object obj2) {
        vX9ZKIhAp vx9zkihap;
        if (!(obj instanceof S35qAAg28)) {
            return AB5ApHoQM.q3BipwRCk;
        }
        boolean z = true;
        if (((obj instanceof lGMqGlI6C) || (obj instanceof OCBIGcYoA)) && !(obj instanceof kCusXFqCv) && !(obj2 instanceof zo6RfsWe2)) {
            S35qAAg28 s35qAAg28 = (S35qAAg28) obj;
            if (!CBQ5d1kRq.compareAndSet(this, s35qAAg28, obj2 instanceof S35qAAg28 ? new TOeWx3x2I((S35qAAg28) obj2) : obj2)) {
                z = false;
            } else {
                vNtjxmzUM(obj2);
                MzoOEjc4X(s35qAAg28, obj2);
            }
            if (z) {
                return obj2;
            }
            return AB5ApHoQM.tGV7Q6urW;
        }
        S35qAAg28 s35qAAg282 = (S35qAAg28) obj;
        NohLR2A3H sk5s77z6Q = sk5s77z6Q(s35qAAg282);
        if (sk5s77z6Q == null) {
            return AB5ApHoQM.tGV7Q6urW;
        }
        kCusXFqCv kcusxfqcv = null;
        WEtyFPo1W wEtyFPo1W = s35qAAg282 instanceof WEtyFPo1W ? (WEtyFPo1W) s35qAAg282 : null;
        if (wEtyFPo1W == null) {
            wEtyFPo1W = new WEtyFPo1W(sk5s77z6Q, false, null);
        }
        synchronized (wEtyFPo1W) {
            if (wEtyFPo1W.GPLPRo6go()) {
                vx9zkihap = AB5ApHoQM.q3BipwRCk;
            } else {
                wEtyFPo1W.oon79WMrY(true);
                if (wEtyFPo1W == s35qAAg282 || CBQ5d1kRq.compareAndSet(this, s35qAAg282, wEtyFPo1W)) {
                    boolean iiGwOFFnr = wEtyFPo1W.iiGwOFFnr();
                    zo6RfsWe2 zo6rfswe2 = obj2 instanceof zo6RfsWe2 ? (zo6RfsWe2) obj2 : null;
                    if (zo6rfswe2 != null) {
                        wEtyFPo1W.q3BipwRCk(zo6rfswe2.q3BipwRCk);
                    }
                    Throwable dIocxURUo = wEtyFPo1W.dIocxURUo();
                    if (!(true ^ iiGwOFFnr)) {
                        dIocxURUo = null;
                    }
                    if (dIocxURUo != null) {
                        NyWTwPF6V(sk5s77z6Q, dIocxURUo);
                    }
                    kCusXFqCv kcusxfqcv2 = s35qAAg282 instanceof kCusXFqCv ? (kCusXFqCv) s35qAAg282 : null;
                    if (kcusxfqcv2 == null) {
                        NohLR2A3H kCA6Zs9sL = s35qAAg282.kCA6Zs9sL();
                        if (kCA6Zs9sL != null) {
                            kcusxfqcv = mUqPm6GBh(kCA6Zs9sL);
                        }
                    } else {
                        kcusxfqcv = kcusxfqcv2;
                    }
                    return (kcusxfqcv == null || !TyB1UUd72(wEtyFPo1W, kcusxfqcv, obj2)) ? qVUwofr5s(wEtyFPo1W, obj2) : AB5ApHoQM.J4Ux7ym32;
                }
                vx9zkihap = AB5ApHoQM.tGV7Q6urW;
            }
            return vx9zkihap;
        }
    }

    public final CancellationException Eeka1udhb() {
        Object i8XZMQc6Z = i8XZMQc6Z();
        if (i8XZMQc6Z instanceof WEtyFPo1W) {
            Throwable dIocxURUo = ((WEtyFPo1W) i8XZMQc6Z).dIocxURUo();
            if (dIocxURUo != null) {
                return igRQEZxnW(dIocxURUo, anXlDk6fV.iMyQMM6Qj(getClass().getSimpleName(), " is cancelling"));
            }
            throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Job is still new or active: ", this).toString());
        } else if (i8XZMQc6Z instanceof S35qAAg28) {
            throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Job is still new or active: ", this).toString());
        } else if (i8XZMQc6Z instanceof zo6RfsWe2) {
            return igRQEZxnW(((zo6RfsWe2) i8XZMQc6Z).q3BipwRCk, null);
        } else {
            return new ynEKnFhv0(anXlDk6fV.iMyQMM6Qj(getClass().getSimpleName(), " has completed normally"), null, this);
        }
    }

    public final boolean GPLPRo6go(Object obj, NohLR2A3H nohLR2A3H, OCBIGcYoA oCBIGcYoA) {
        int i8XZMQc6Z;
        Nga5m2LKM nga5m2LKM = new Nga5m2LKM(oCBIGcYoA, this, obj);
        do {
            i8XZMQc6Z = nohLR2A3H.MzoOEjc4X().i8XZMQc6Z(oCBIGcYoA, nohLR2A3H, nga5m2LKM);
            if (i8XZMQc6Z == 1) {
                return true;
            }
        } while (i8XZMQc6Z != 2);
        return false;
    }

    public final clUYjTSq7 IytU16YUK(boolean z, boolean z2, PmanMZxiM pmanMZxiM) {
        OCBIGcYoA oCBIGcYoA;
        Throwable th;
        Throwable th2 = null;
        if (z) {
            oCBIGcYoA = pmanMZxiM instanceof tTcOo5jIP ? (tTcOo5jIP) pmanMZxiM : null;
            if (oCBIGcYoA == null) {
                oCBIGcYoA = new vEcc3Zn4P(pmanMZxiM);
            }
        } else {
            oCBIGcYoA = pmanMZxiM instanceof OCBIGcYoA ? (OCBIGcYoA) pmanMZxiM : null;
            if (oCBIGcYoA == null) {
                oCBIGcYoA = null;
            }
            if (oCBIGcYoA == null) {
                oCBIGcYoA = new fhbzjKAaJ(pmanMZxiM);
            }
        }
        oCBIGcYoA.PSTqBLTET = this;
        while (true) {
            Object i8XZMQc6Z = i8XZMQc6Z();
            if (i8XZMQc6Z instanceof lGMqGlI6C) {
                lGMqGlI6C lgmqgli6c = (lGMqGlI6C) i8XZMQc6Z;
                if (!lgmqgli6c.CBQ5d1kRq) {
                    NohLR2A3H nohLR2A3H = new NohLR2A3H();
                    S35qAAg28 s35qAAg28 = nohLR2A3H;
                    if (!lgmqgli6c.CBQ5d1kRq) {
                        s35qAAg28 = new A9GiYoSyU(nohLR2A3H);
                    }
                    CBQ5d1kRq.compareAndSet(this, lgmqgli6c, s35qAAg28 == 1 ? 1 : 0);
                } else if (CBQ5d1kRq.compareAndSet(this, i8XZMQc6Z, oCBIGcYoA)) {
                    return oCBIGcYoA;
                }
            } else if (i8XZMQc6Z instanceof S35qAAg28) {
                NohLR2A3H kCA6Zs9sL = ((S35qAAg28) i8XZMQc6Z).kCA6Zs9sL();
                if (kCA6Zs9sL == null) {
                    Objects.requireNonNull(i8XZMQc6Z, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    o4LF8RkoQ((OCBIGcYoA) i8XZMQc6Z);
                } else {
                    clUYjTSq7 cluyjtsq7 = JNEteW1Z7.CBQ5d1kRq;
                    if (!z || !(i8XZMQc6Z instanceof WEtyFPo1W)) {
                        th = null;
                    } else {
                        synchronized (i8XZMQc6Z) {
                            th = ((WEtyFPo1W) i8XZMQc6Z).dIocxURUo();
                            if (th == null || ((pmanMZxiM instanceof kCusXFqCv) && !((WEtyFPo1W) i8XZMQc6Z).GPLPRo6go())) {
                                if (GPLPRo6go(i8XZMQc6Z, kCA6Zs9sL, oCBIGcYoA)) {
                                    if (th == null) {
                                        return oCBIGcYoA;
                                    }
                                    cluyjtsq7 = oCBIGcYoA;
                                }
                            }
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            pmanMZxiM.IytU16YUK(th);
                        }
                        return cluyjtsq7;
                    } else if (GPLPRo6go(i8XZMQc6Z, kCA6Zs9sL, oCBIGcYoA)) {
                        return oCBIGcYoA;
                    }
                }
            } else {
                if (z2) {
                    zo6RfsWe2 zo6rfswe2 = i8XZMQc6Z instanceof zo6RfsWe2 ? (zo6RfsWe2) i8XZMQc6Z : null;
                    if (zo6rfswe2 != null) {
                        th2 = zo6rfswe2.q3BipwRCk;
                    }
                    pmanMZxiM.IytU16YUK(th2);
                }
                return JNEteW1Z7.CBQ5d1kRq;
            }
        }
    }

    @Override // con.JEWwjBE8f
    public boolean J4Ux7ym32() {
        Object i8XZMQc6Z = i8XZMQc6Z();
        return (i8XZMQc6Z instanceof S35qAAg28) && ((S35qAAg28) i8XZMQc6Z).J4Ux7ym32();
    }

    public final void MzoOEjc4X(S35qAAg28 s35qAAg28, Object obj) {
        cWAoh0O7N cwaoh0o7n;
        aX1NJ0djy ax1nj0djy = (aX1NJ0djy) this._parentHandle;
        if (ax1nj0djy != null) {
            ax1nj0djy.q3BipwRCk();
            this._parentHandle = JNEteW1Z7.CBQ5d1kRq;
        }
        zo6RfsWe2 zo6rfswe2 = obj instanceof zo6RfsWe2 ? (zo6RfsWe2) obj : null;
        Throwable th = zo6rfswe2 == null ? null : zo6rfswe2.q3BipwRCk;
        if (s35qAAg28 instanceof OCBIGcYoA) {
            try {
                ((OCBIGcYoA) s35qAAg28).cAwN510t2(th);
            } catch (Throwable th2) {
                iMyQMM6Qj(new cWAoh0O7N("Exception in completion handler " + s35qAAg28 + " for " + this, th2));
            }
        } else {
            NohLR2A3H kCA6Zs9sL = s35qAAg28.kCA6Zs9sL();
            if (kCA6Zs9sL != null) {
                cWAoh0O7N cwaoh0o7n2 = null;
                for (DV1oYHwIh dV1oYHwIh = (DV1oYHwIh) kCA6Zs9sL.Bhmn1KIah(); !anXlDk6fV.tGV7Q6urW(dV1oYHwIh, kCA6Zs9sL); dV1oYHwIh = dV1oYHwIh.PSTqBLTET()) {
                    if (dV1oYHwIh instanceof OCBIGcYoA) {
                        OCBIGcYoA oCBIGcYoA = (OCBIGcYoA) dV1oYHwIh;
                        try {
                            oCBIGcYoA.cAwN510t2(th);
                        } catch (Throwable th3) {
                            if (cwaoh0o7n2 == null) {
                                cwaoh0o7n = null;
                            } else {
                                dnBSj5uJN.dIocxURUo(cwaoh0o7n2, th3);
                                cwaoh0o7n = cwaoh0o7n2;
                            }
                            if (cwaoh0o7n == null) {
                                cwaoh0o7n2 = new cWAoh0O7N("Exception in completion handler " + oCBIGcYoA + " for " + this, th3);
                            }
                        }
                    }
                }
                if (cwaoh0o7n2 != null) {
                    iMyQMM6Qj(cwaoh0o7n2);
                }
            }
        }
    }

    public final void NyWTwPF6V(NohLR2A3H nohLR2A3H, Throwable th) {
        cWAoh0O7N cwaoh0o7n;
        cWAoh0O7N cwaoh0o7n2 = null;
        for (DV1oYHwIh dV1oYHwIh = (DV1oYHwIh) nohLR2A3H.Bhmn1KIah(); !anXlDk6fV.tGV7Q6urW(dV1oYHwIh, nohLR2A3H); dV1oYHwIh = dV1oYHwIh.PSTqBLTET()) {
            if (dV1oYHwIh instanceof tTcOo5jIP) {
                OCBIGcYoA oCBIGcYoA = (OCBIGcYoA) dV1oYHwIh;
                try {
                    oCBIGcYoA.cAwN510t2(th);
                } catch (Throwable th2) {
                    if (cwaoh0o7n2 == null) {
                        cwaoh0o7n = null;
                    } else {
                        dnBSj5uJN.dIocxURUo(cwaoh0o7n2, th2);
                        cwaoh0o7n = cwaoh0o7n2;
                    }
                    if (cwaoh0o7n == null) {
                        cwaoh0o7n2 = new cWAoh0O7N("Exception in completion handler " + oCBIGcYoA + " for " + this, th2);
                    }
                }
            }
        }
        if (cwaoh0o7n2 != null) {
            iMyQMM6Qj(cwaoh0o7n2);
        }
        CBQ5d1kRq(th);
    }

    public boolean PSTqBLTET(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return vPSbyrYWX(th) && RG6kpfv3v();
    }

    public void Puu3Rhg4F(Object obj) {
    }

    public final String QNqj6nIzv(Object obj) {
        if (!(obj instanceof WEtyFPo1W)) {
            return obj instanceof S35qAAg28 ? ((S35qAAg28) obj).J4Ux7ym32() ? "Active" : "New" : obj instanceof zo6RfsWe2 ? "Cancelled" : "Completed";
        }
        WEtyFPo1W wEtyFPo1W = (WEtyFPo1W) obj;
        return wEtyFPo1W.iiGwOFFnr() ? "Cancelling" : wEtyFPo1W.GPLPRo6go() ? "Completing" : "Active";
    }

    public boolean RG6kpfv3v() {
        return true;
    }

    public final boolean TyB1UUd72(WEtyFPo1W wEtyFPo1W, kCusXFqCv kcusxfqcv, Object obj) {
        while (cOutqbkMD.Puu3Rhg4F(kcusxfqcv.MzoOEjc4X, false, false, new ZwHrpcAcY(this, wEtyFPo1W, kcusxfqcv, obj), 1, null) == JNEteW1Z7.CBQ5d1kRq) {
            kcusxfqcv = mUqPm6GBh(kcusxfqcv);
            if (kcusxfqcv == null) {
                return false;
            }
        }
        return true;
    }

    public final int V9LQMKGJe(Object obj) {
        if (obj instanceof lGMqGlI6C) {
            if (((lGMqGlI6C) obj).CBQ5d1kRq) {
                return 0;
            }
            if (!CBQ5d1kRq.compareAndSet(this, obj, AB5ApHoQM.GPLPRo6go)) {
                return -1;
            }
            i0Zug1mVk();
            return 1;
        } else if (!(obj instanceof A9GiYoSyU)) {
            return 0;
        } else {
            if (!CBQ5d1kRq.compareAndSet(this, obj, ((A9GiYoSyU) obj).CBQ5d1kRq)) {
                return -1;
            }
            i0Zug1mVk();
            return 1;
        }
    }

    public final aX1NJ0djy WaUP0CF08() {
        return (aX1NJ0djy) this._parentHandle;
    }

    public final void cAwN510t2(JEWwjBE8f jEWwjBE8f) {
        int V9LQMKGJe;
        if (jEWwjBE8f == null) {
            this._parentHandle = JNEteW1Z7.CBQ5d1kRq;
            return;
        }
        Zgh96z4e6 zgh96z4e6 = (Zgh96z4e6) jEWwjBE8f;
        do {
            V9LQMKGJe = zgh96z4e6.V9LQMKGJe(zgh96z4e6.i8XZMQc6Z());
            if (V9LQMKGJe == 0) {
                break;
            }
        } while (V9LQMKGJe != 1);
        aX1NJ0djy ax1nj0djy = (aX1NJ0djy) cOutqbkMD.Puu3Rhg4F(zgh96z4e6, true, false, new kCusXFqCv(this), 2, null);
        this._parentHandle = ax1nj0djy;
        if (!(i8XZMQc6Z() instanceof S35qAAg28)) {
            ax1nj0djy.q3BipwRCk();
            this._parentHandle = JNEteW1Z7.CBQ5d1kRq;
        }
    }

    public final Throwable dXrmkklc8(WEtyFPo1W wEtyFPo1W, List list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof S4tszCdo2) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof S4tszCdo2)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) obj2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (wEtyFPo1W.iiGwOFFnr()) {
            return new ynEKnFhv0(kmSgne1rO(), null, this);
        } else {
            return null;
        }
    }

    public boolean dfpT1j18n(Throwable th) {
        return false;
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        return idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public final adUS3SHb2 getKey() {
        return y5p19vMdC.CBQ5d1kRq;
    }

    public void i0Zug1mVk() {
    }

    public final Object i8XZMQc6Z() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof mUx47mhWb)) {
                return obj;
            }
            ((mUx47mhWb) obj).q3BipwRCk(this);
        }
    }

    public void iMyQMM6Qj(Throwable th) {
        throw th;
    }

    public final CancellationException igRQEZxnW(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = kmSgne1rO();
            }
            cancellationException = new ynEKnFhv0(str, th, this);
        }
        return cancellationException;
    }

    public final Throwable ilHKhw3Yw(Object obj) {
        Throwable th;
        CancellationException cancellationException = null;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new ynEKnFhv0(kmSgne1rO(), null, this);
            }
            return th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        Zgh96z4e6 zgh96z4e6 = (Zgh96z4e6) ((JdgJLcZNG) obj);
        Object i8XZMQc6Z = zgh96z4e6.i8XZMQc6Z();
        if (i8XZMQc6Z instanceof WEtyFPo1W) {
            th = ((WEtyFPo1W) i8XZMQc6Z).dIocxURUo();
        } else if (i8XZMQc6Z instanceof zo6RfsWe2) {
            th = ((zo6RfsWe2) i8XZMQc6Z).q3BipwRCk;
        } else if (!(i8XZMQc6Z instanceof S35qAAg28)) {
            th = null;
        } else {
            throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Cannot be cancelling child in this state: ", i8XZMQc6Z).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new ynEKnFhv0(anXlDk6fV.iMyQMM6Qj("Parent job is ", zgh96z4e6.QNqj6nIzv(i8XZMQc6Z)), th, zgh96z4e6);
        }
        return cancellationException;
    }

    public boolean ixWaw2akD() {
        return this instanceof htciu4iTb;
    }

    public String kmSgne1rO() {
        return "Job was cancelled";
    }

    public final kCusXFqCv mUqPm6GBh(DV1oYHwIh dV1oYHwIh) {
        while (dV1oYHwIh.Eeka1udhb()) {
            dV1oYHwIh = dV1oYHwIh.MzoOEjc4X();
        }
        while (true) {
            dV1oYHwIh = dV1oYHwIh.PSTqBLTET();
            if (!dV1oYHwIh.Eeka1udhb()) {
                if (dV1oYHwIh instanceof kCusXFqCv) {
                    return (kCusXFqCv) dV1oYHwIh;
                }
                if (dV1oYHwIh instanceof NohLR2A3H) {
                    return null;
                }
            }
        }
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return idpM54xlp.sk5s77z6Q(this, adus3shb2);
    }

    public final Object nlGCs0NZs(Object obj) {
        Object EBQXiIPmm;
        do {
            EBQXiIPmm = EBQXiIPmm(i8XZMQc6Z(), obj);
            if (EBQXiIPmm == AB5ApHoQM.q3BipwRCk) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                zo6RfsWe2 zo6rfswe2 = obj instanceof zo6RfsWe2 ? (zo6RfsWe2) obj : null;
                if (zo6rfswe2 != null) {
                    th = zo6rfswe2.q3BipwRCk;
                }
                throw new IllegalStateException(str, th);
            }
        } while (EBQXiIPmm == AB5ApHoQM.tGV7Q6urW);
        return EBQXiIPmm;
    }

    public final void o4LF8RkoQ(OCBIGcYoA oCBIGcYoA) {
        NohLR2A3H nohLR2A3H = new NohLR2A3H();
        DV1oYHwIh.kmSgne1rO.lazySet(nohLR2A3H, oCBIGcYoA);
        DV1oYHwIh.CBQ5d1kRq.lazySet(nohLR2A3H, oCBIGcYoA);
        while (true) {
            if (oCBIGcYoA.Bhmn1KIah() == oCBIGcYoA) {
                if (DV1oYHwIh.CBQ5d1kRq.compareAndSet(oCBIGcYoA, oCBIGcYoA, nohLR2A3H)) {
                    nohLR2A3H.CBQ5d1kRq(oCBIGcYoA);
                    break;
                }
            } else {
                break;
            }
        }
        CBQ5d1kRq.compareAndSet(this, oCBIGcYoA, oCBIGcYoA.PSTqBLTET());
    }

    public void oon79WMrY(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ynEKnFhv0(kmSgne1rO(), null, this);
        }
        vPSbyrYWX(cancellationException);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }

    public final boolean qFBXIgpia(Object obj) {
        Object EBQXiIPmm;
        do {
            EBQXiIPmm = EBQXiIPmm(i8XZMQc6Z(), obj);
            if (EBQXiIPmm == AB5ApHoQM.q3BipwRCk) {
                return false;
            }
            if (EBQXiIPmm == AB5ApHoQM.J4Ux7ym32) {
                return true;
            }
        } while (EBQXiIPmm == AB5ApHoQM.tGV7Q6urW);
        Puu3Rhg4F(EBQXiIPmm);
        return true;
    }

    public final Object qVUwofr5s(WEtyFPo1W wEtyFPo1W, Object obj) {
        Throwable dXrmkklc8;
        Throwable th = null;
        zo6RfsWe2 zo6rfswe2 = obj instanceof zo6RfsWe2 ? (zo6RfsWe2) obj : null;
        if (zo6rfswe2 != null) {
            th = zo6rfswe2.q3BipwRCk;
        }
        synchronized (wEtyFPo1W) {
            wEtyFPo1W.iiGwOFFnr();
            List<Throwable> yWvV4ePLl = wEtyFPo1W.yWvV4ePLl(th);
            dXrmkklc8 = dXrmkklc8(wEtyFPo1W, yWvV4ePLl);
            if (dXrmkklc8 != null && yWvV4ePLl.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(yWvV4ePLl.size()));
                for (Throwable th2 : yWvV4ePLl) {
                    if (th2 != dXrmkklc8 && th2 != dXrmkklc8 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        dnBSj5uJN.dIocxURUo(dXrmkklc8, th2);
                    }
                }
            }
        }
        if (!(dXrmkklc8 == null || dXrmkklc8 == th)) {
            obj = new zo6RfsWe2(dXrmkklc8, false, 2);
        }
        if (dXrmkklc8 != null) {
            if (CBQ5d1kRq(dXrmkklc8) || dfpT1j18n(dXrmkklc8)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                zo6RfsWe2.J4Ux7ym32.compareAndSet((zo6RfsWe2) obj, 0, 1);
            }
        }
        vNtjxmzUM(obj);
        CBQ5d1kRq.compareAndSet(this, wEtyFPo1W, obj instanceof S35qAAg28 ? new TOeWx3x2I((S35qAAg28) obj) : obj);
        MzoOEjc4X(wEtyFPo1W, obj);
        return obj;
    }

    public final NohLR2A3H sk5s77z6Q(S35qAAg28 s35qAAg28) {
        NohLR2A3H kCA6Zs9sL = s35qAAg28.kCA6Zs9sL();
        if (kCA6Zs9sL != null) {
            return kCA6Zs9sL;
        }
        if (s35qAAg28 instanceof lGMqGlI6C) {
            return new NohLR2A3H();
        }
        if (s35qAAg28 instanceof OCBIGcYoA) {
            o4LF8RkoQ((OCBIGcYoA) s35qAAg28);
            return null;
        }
        throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("State should have list: ", s35qAAg28).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AqaWJg0b4() + '{' + QNqj6nIzv(i8XZMQc6Z()) + '}');
        sb.append('@');
        sb.append(cOutqbkMD.GPLPRo6go(this));
        return sb.toString();
    }

    public void vNtjxmzUM(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8 A[EDGE_INSN: B:79:0x00b8->B:54:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean vPSbyrYWX(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Zgh96z4e6.vPSbyrYWX(java.lang.Object):boolean");
    }

    public final Object yWvV4ePLl(Way959ade way959ade) {
        Object i8XZMQc6Z;
        do {
            i8XZMQc6Z = i8XZMQc6Z();
            if (!(i8XZMQc6Z instanceof S35qAAg28)) {
                if (!(i8XZMQc6Z instanceof zo6RfsWe2)) {
                    return AB5ApHoQM.q3BipwRCk(i8XZMQc6Z);
                }
                throw ((zo6RfsWe2) i8XZMQc6Z).q3BipwRCk;
            }
        } while (V9LQMKGJe(i8XZMQc6Z) < 0);
        DI6zUpYp5 dI6zUpYp5 = new DI6zUpYp5(idpM54xlp.PSTqBLTET(way959ade), this);
        dI6zUpYp5.Eeka1udhb();
        idpM54xlp.kCA6Zs9sL(dI6zUpYp5, IytU16YUK(false, true, new fhbzjKAaJ((tmgChDFqU) dI6zUpYp5)));
        return dI6zUpYp5.qVUwofr5s();
    }
}
