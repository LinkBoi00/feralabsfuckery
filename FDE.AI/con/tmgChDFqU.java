package con;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class tmgChDFqU extends cVJORDUgo implements Z3EvbqMGQ, gXw4WGPur {
    public final bu5cjmae6 MzoOEjc4X;
    public final Way959ade PSTqBLTET;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = BwxDFHgCv.CBQ5d1kRq;
    public clUYjTSq7 ilHKhw3Yw;
    public static final /* synthetic */ AtomicIntegerFieldUpdater qVUwofr5s = AtomicIntegerFieldUpdater.newUpdater(tmgChDFqU.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Eeka1udhb = AtomicReferenceFieldUpdater.newUpdater(tmgChDFqU.class, Object.class, "_state");

    public tmgChDFqU(Way959ade way959ade, int i) {
        super(i);
        this.PSTqBLTET = way959ade;
        this.MzoOEjc4X = way959ade.kCA6Zs9sL();
    }

    @Override // con.Way959ade
    public void Bhmn1KIah(Object obj) {
        Throwable q3BipwRCk = YqdLs8aRM.q3BipwRCk(obj);
        if (q3BipwRCk != null) {
            obj = new zo6RfsWe2(q3BipwRCk, false, 2);
        }
        iMyQMM6Qj(obj, this.Bhmn1KIah, null);
    }

    public boolean CBQ5d1kRq(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof vnSDZbQP2)) {
                return false;
            }
            z = obj instanceof jmbWiIwa0;
        } while (!Eeka1udhb.compareAndSet(this, obj, new PJ7cSpUxj(this, th, z)));
        jmbWiIwa0 jmbwiiwa0 = z ? (jmbWiIwa0) obj : null;
        if (jmbwiiwa0 != null) {
            yWvV4ePLl(jmbwiiwa0, th);
        }
        PSTqBLTET();
        MzoOEjc4X(this.Bhmn1KIah);
        return true;
    }

    public final vX9ZKIhAp CpG0imbht(Object obj, Object obj2, PmanMZxiM pmanMZxiM) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof vnSDZbQP2) {
            } else if (!(obj3 instanceof CmEmpXorE) || obj2 == null || ((CmEmpXorE) obj3).dIocxURUo != obj2) {
                return null;
            } else {
                return IjGHLNVKU.q3BipwRCk;
            }
        } while (!Eeka1udhb.compareAndSet(this, obj3, IytU16YUK((vnSDZbQP2) obj3, obj, this.Bhmn1KIah, pmanMZxiM, obj2)));
        PSTqBLTET();
        return IjGHLNVKU.q3BipwRCk;
    }

    public void Eeka1udhb() {
        clUYjTSq7 dXrmkklc8 = dXrmkklc8();
        if (dXrmkklc8 != null && (!(this._state instanceof vnSDZbQP2))) {
            dXrmkklc8.q3BipwRCk();
            this.ilHKhw3Yw = JNEteW1Z7.CBQ5d1kRq;
        }
    }

    public final Object IytU16YUK(vnSDZbQP2 vnsdzbqp2, Object obj, int i, PmanMZxiM pmanMZxiM, Object obj2) {
        if (obj instanceof zo6RfsWe2) {
            return obj;
        }
        if (!rTcohQ78k.kCA6Zs9sL(i) && obj2 == null) {
            return obj;
        }
        if (pmanMZxiM == null && ((!(vnsdzbqp2 instanceof jmbWiIwa0) || (vnsdzbqp2 instanceof UEbylfzNI)) && obj2 == null)) {
            return obj;
        }
        return new CmEmpXorE(obj, vnsdzbqp2 instanceof jmbWiIwa0 ? (jmbWiIwa0) vnsdzbqp2 : null, pmanMZxiM, obj2, null, 16);
    }

    @Override // con.cVJORDUgo
    public final Way959ade J4Ux7ym32() {
        return this.PSTqBLTET;
    }

    public final void MzoOEjc4X(int i) {
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (qVUwofr5s.compareAndSet(this, 0, 2)) {
                    z2 = true;
                    break;
                }
            } else if (i2 == 1) {
                z2 = false;
            } else {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z2) {
            Way959ade J4Ux7ym32 = J4Ux7ym32();
            if (i == 4) {
                z = true;
            }
            if (z || !(J4Ux7ym32 instanceof c27z9OHjq) || rTcohQ78k.kCA6Zs9sL(i) != rTcohQ78k.kCA6Zs9sL(this.Bhmn1KIah)) {
                rTcohQ78k.iiGwOFFnr(this, J4Ux7ym32, z);
                return;
            }
            xaeEKvU2c xaeekvu2c = ((c27z9OHjq) J4Ux7ym32).PSTqBLTET;
            bu5cjmae6 kCA6Zs9sL = J4Ux7ym32.kCA6Zs9sL();
            if (xaeekvu2c.yWvV4ePLl(kCA6Zs9sL)) {
                xaeekvu2c.Puu3Rhg4F(kCA6Zs9sL, this);
                return;
            }
            IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
            ev1IlyvL8 q3BipwRCk = IO5CrIj0i.q3BipwRCk();
            if (q3BipwRCk.PSTqBLTET()) {
                q3BipwRCk.CBQ5d1kRq(this);
                return;
            }
            q3BipwRCk.Bhmn1KIah(true);
            try {
                rTcohQ78k.iiGwOFFnr(this, J4Ux7ym32(), true);
                do {
                } while (q3BipwRCk.ilHKhw3Yw());
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void PSTqBLTET() {
        if (!ixWaw2akD()) {
            kmSgne1rO();
        }
    }

    @Override // con.cVJORDUgo
    public Object Puu3Rhg4F() {
        return this._state;
    }

    public void RG6kpfv3v(PmanMZxiM pmanMZxiM) {
        jmbWiIwa0 zdlldoqtb = pmanMZxiM instanceof jmbWiIwa0 ? (jmbWiIwa0) pmanMZxiM : new zdlldOQtb(pmanMZxiM);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof BwxDFHgCv)) {
                Throwable th = null;
                if (!(obj instanceof jmbWiIwa0)) {
                    boolean z = obj instanceof zo6RfsWe2;
                    boolean z2 = true;
                    if (z) {
                        zo6RfsWe2 zo6rfswe2 = (zo6RfsWe2) obj;
                        Objects.requireNonNull(zo6rfswe2);
                        if (!zo6RfsWe2.J4Ux7ym32.compareAndSet(zo6rfswe2, 0, 1)) {
                            sk5s77z6Q(pmanMZxiM, obj);
                            throw null;
                        } else if (obj instanceof PJ7cSpUxj) {
                            if (!z) {
                                zo6rfswe2 = null;
                            }
                            if (zo6rfswe2 != null) {
                                th = zo6rfswe2.q3BipwRCk;
                            }
                            oon79WMrY(pmanMZxiM, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof CmEmpXorE) {
                        CmEmpXorE cmEmpXorE = (CmEmpXorE) obj;
                        if (cmEmpXorE.J4Ux7ym32 != null) {
                            sk5s77z6Q(pmanMZxiM, obj);
                            throw null;
                        } else if (!(zdlldoqtb instanceof UEbylfzNI)) {
                            Throwable th2 = cmEmpXorE.kCA6Zs9sL;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                oon79WMrY(pmanMZxiM, th2);
                                return;
                            } else {
                                if (Eeka1udhb.compareAndSet(this, obj, CmEmpXorE.q3BipwRCk(cmEmpXorE, null, zdlldoqtb, null, null, null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(zdlldoqtb instanceof UEbylfzNI)) {
                        if (Eeka1udhb.compareAndSet(this, obj, new CmEmpXorE(obj, zdlldoqtb, null, null, null, 28))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    sk5s77z6Q(pmanMZxiM, obj);
                    throw null;
                }
            } else if (Eeka1udhb.compareAndSet(this, obj, zdlldoqtb)) {
                return;
            }
        }
    }

    public String WaUP0CF08() {
        return "CancellableContinuation";
    }

    public void cAwN510t2(xaeEKvU2c xaeekvu2c, Object obj) {
        Way959ade way959ade = this.PSTqBLTET;
        c27z9OHjq c27z9ohjq = way959ade instanceof c27z9OHjq ? (c27z9OHjq) way959ade : null;
        iMyQMM6Qj(obj, (c27z9ohjq == null ? null : c27z9ohjq.PSTqBLTET) == xaeekvu2c ? 4 : this.Bhmn1KIah, null);
    }

    @Override // con.cVJORDUgo
    public Throwable dIocxURUo(Object obj) {
        Throwable dIocxURUo = super.dIocxURUo(obj);
        if (dIocxURUo == null) {
            return null;
        }
        return dIocxURUo;
    }

    public final clUYjTSq7 dXrmkklc8() {
        bu5cjmae6 bu5cjmae6 = this.MzoOEjc4X;
        int i = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f == null) {
            return null;
        }
        clUYjTSq7 Puu3Rhg4F = cOutqbkMD.Puu3Rhg4F(jEWwjBE8f, true, false, new SytzfbYK0(this), 2, null);
        this.ilHKhw3Yw = Puu3Rhg4F;
        return Puu3Rhg4F;
    }

    public final boolean dfpT1j18n() {
        Object obj = this._state;
        if (!(obj instanceof CmEmpXorE) || ((CmEmpXorE) obj).dIocxURUo == null) {
            this._decision = 0;
            this._state = BwxDFHgCv.CBQ5d1kRq;
            return true;
        }
        kmSgne1rO();
        return false;
    }

    public final void i8XZMQc6Z() {
        Way959ade way959ade = this.PSTqBLTET;
        Throwable th = null;
        c27z9OHjq c27z9ohjq = way959ade instanceof c27z9OHjq ? (c27z9OHjq) way959ade : null;
        if (c27z9ohjq != null) {
            th = c27z9ohjq.kmSgne1rO(this);
        }
        if (th != null) {
            kmSgne1rO();
            CBQ5d1kRq(th);
        }
    }

    public final void iMyQMM6Qj(Object obj, int i, PmanMZxiM pmanMZxiM) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof vnSDZbQP2) {
            } else {
                if (obj2 instanceof PJ7cSpUxj) {
                    PJ7cSpUxj pJ7cSpUxj = (PJ7cSpUxj) obj2;
                    Objects.requireNonNull(pJ7cSpUxj);
                    if (PJ7cSpUxj.tGV7Q6urW.compareAndSet(pJ7cSpUxj, 0, 1)) {
                        if (pmanMZxiM != null) {
                            vPSbyrYWX(pmanMZxiM, pJ7cSpUxj.q3BipwRCk);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!Eeka1udhb.compareAndSet(this, obj2, IytU16YUK((vnSDZbQP2) obj2, obj, i, pmanMZxiM, null)));
        PSTqBLTET();
        MzoOEjc4X(i);
    }

    @Override // con.cVJORDUgo
    public Object iiGwOFFnr(Object obj) {
        return obj instanceof CmEmpXorE ? ((CmEmpXorE) obj).q3BipwRCk : obj;
    }

    public Throwable ilHKhw3Yw(JEWwjBE8f jEWwjBE8f) {
        return ((Zgh96z4e6) jEWwjBE8f).Eeka1udhb();
    }

    public final boolean ixWaw2akD() {
        return (this.Bhmn1KIah == 2) && ((c27z9OHjq) this.PSTqBLTET).oon79WMrY();
    }

    @Override // con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        return this.MzoOEjc4X;
    }

    public final void kmSgne1rO() {
        clUYjTSq7 cluyjtsq7 = this.ilHKhw3Yw;
        if (cluyjtsq7 != null) {
            cluyjtsq7.q3BipwRCk();
            this.ilHKhw3Yw = JNEteW1Z7.CBQ5d1kRq;
        }
    }

    public final void oon79WMrY(PmanMZxiM pmanMZxiM, Throwable th) {
        try {
            pmanMZxiM.IytU16YUK(th);
        } catch (Throwable th2) {
            idpM54xlp.Bhmn1KIah(this.MzoOEjc4X, new cWAoh0O7N(anXlDk6fV.iMyQMM6Qj("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // con.cVJORDUgo
    public void q3BipwRCk(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof vnSDZbQP2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof zo6RfsWe2)) {
                if (obj2 instanceof CmEmpXorE) {
                    CmEmpXorE cmEmpXorE = (CmEmpXorE) obj2;
                    if (!(cmEmpXorE.kCA6Zs9sL != null)) {
                        if (Eeka1udhb.compareAndSet(this, obj2, CmEmpXorE.q3BipwRCk(cmEmpXorE, null, null, null, null, th, 15))) {
                            jmbWiIwa0 jmbwiiwa0 = cmEmpXorE.J4Ux7ym32;
                            if (jmbwiiwa0 != null) {
                                yWvV4ePLl(jmbwiiwa0, th);
                            }
                            PmanMZxiM pmanMZxiM = cmEmpXorE.tGV7Q6urW;
                            if (pmanMZxiM != null) {
                                vPSbyrYWX(pmanMZxiM, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (Eeka1udhb.compareAndSet(this, obj2, new CmEmpXorE(obj2, null, null, null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Object qVUwofr5s() {
        boolean z;
        boolean ixWaw2akD = ixWaw2akD();
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (qVUwofr5s.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            if (this.ilHKhw3Yw == null) {
                dXrmkklc8();
            }
            if (ixWaw2akD) {
                i8XZMQc6Z();
            }
            return kBKJSqCSL.COROUTINE_SUSPENDED;
        }
        if (ixWaw2akD) {
            i8XZMQc6Z();
        }
        Object obj = this._state;
        if (!(obj instanceof zo6RfsWe2)) {
            if (rTcohQ78k.kCA6Zs9sL(this.Bhmn1KIah)) {
                bu5cjmae6 bu5cjmae6 = this.MzoOEjc4X;
                int i2 = JEWwjBE8f.GPLPRo6go;
                JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
                if (jEWwjBE8f != null && !jEWwjBE8f.J4Ux7ym32()) {
                    CancellationException Eeka1udhb2 = ((Zgh96z4e6) jEWwjBE8f).Eeka1udhb();
                    q3BipwRCk(obj, Eeka1udhb2);
                    throw Eeka1udhb2;
                }
            }
            return iiGwOFFnr(obj);
        }
        throw ((zo6RfsWe2) obj).q3BipwRCk;
    }

    public final void sk5s77z6Q(PmanMZxiM pmanMZxiM, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + pmanMZxiM + ", already has " + obj).toString());
    }

    @Override // con.gXw4WGPur
    public gXw4WGPur tGV7Q6urW() {
        Way959ade way959ade = this.PSTqBLTET;
        if (way959ade instanceof gXw4WGPur) {
            return (gXw4WGPur) way959ade;
        }
        return null;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WaUP0CF08());
        sb.append('(');
        sb.append(cOutqbkMD.Bhmn1KIah(this.PSTqBLTET));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof vnSDZbQP2 ? "Active" : obj instanceof PJ7cSpUxj ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(cOutqbkMD.GPLPRo6go(this));
        return sb.toString();
    }

    public final void vPSbyrYWX(PmanMZxiM pmanMZxiM, Throwable th) {
        try {
            pmanMZxiM.IytU16YUK(th);
        } catch (Throwable th2) {
            idpM54xlp.Bhmn1KIah(this.MzoOEjc4X, new cWAoh0O7N(anXlDk6fV.iMyQMM6Qj("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public final void yWvV4ePLl(jmbWiIwa0 jmbwiiwa0, Throwable th) {
        try {
            jmbwiiwa0.q3BipwRCk(th);
        } catch (Throwable th2) {
            idpM54xlp.Bhmn1KIah(this.MzoOEjc4X, new cWAoh0O7N(anXlDk6fV.iMyQMM6Qj("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }
}
