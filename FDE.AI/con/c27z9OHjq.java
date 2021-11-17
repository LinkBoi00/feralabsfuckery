package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class c27z9OHjq extends cVJORDUgo implements gXw4WGPur, Way959ade {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Eeka1udhb = AtomicReferenceFieldUpdater.newUpdater(c27z9OHjq.class, Object.class, "_reusableCancellableContinuation");
    public final Way959ade MzoOEjc4X;
    public final xaeEKvU2c PSTqBLTET;
    public final Object qVUwofr5s;
    public Object ilHKhw3Yw = AIDP2j9pY.q3BipwRCk;
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    public c27z9OHjq(xaeEKvU2c xaeekvu2c, Way959ade way959ade) {
        super(-1);
        this.PSTqBLTET = xaeekvu2c;
        this.MzoOEjc4X = way959ade;
        bu5cjmae6 kCA6Zs9sL = kCA6Zs9sL();
        vX9ZKIhAp vx9zkihap = cclHSBzpG.q3BipwRCk;
        this.qVUwofr5s = kCA6Zs9sL.fold(0, pSdrExTbX.o4LF8RkoQ);
    }

    @Override // con.Way959ade
    public void Bhmn1KIah(Object obj) {
        bu5cjmae6 kCA6Zs9sL = this.MzoOEjc4X.kCA6Zs9sL();
        Object PSTqBLTET = cOutqbkMD.PSTqBLTET(obj, null);
        if (this.PSTqBLTET.yWvV4ePLl(kCA6Zs9sL)) {
            this.ilHKhw3Yw = PSTqBLTET;
            this.Bhmn1KIah = 0;
            this.PSTqBLTET.Puu3Rhg4F(kCA6Zs9sL, this);
            return;
        }
        IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
        ev1IlyvL8 q3BipwRCk = IO5CrIj0i.q3BipwRCk();
        if (q3BipwRCk.PSTqBLTET()) {
            this.ilHKhw3Yw = PSTqBLTET;
            this.Bhmn1KIah = 0;
            q3BipwRCk.CBQ5d1kRq(this);
            return;
        }
        q3BipwRCk.Bhmn1KIah(true);
        try {
            bu5cjmae6 kCA6Zs9sL2 = kCA6Zs9sL();
            Object J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(kCA6Zs9sL2, this.qVUwofr5s);
            this.MzoOEjc4X.Bhmn1KIah(obj);
            cclHSBzpG.q3BipwRCk(kCA6Zs9sL2, J4Ux7ym32);
            do {
            } while (q3BipwRCk.ilHKhw3Yw());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void CBQ5d1kRq() {
        Object obj = this._reusableCancellableContinuation;
        tmgChDFqU tmgchdfqu = obj instanceof tmgChDFqU ? (tmgChDFqU) obj : null;
        if (tmgchdfqu != null) {
            tmgchdfqu.kmSgne1rO();
        }
    }

    @Override // con.cVJORDUgo
    public Way959ade J4Ux7ym32() {
        return this;
    }

    @Override // con.cVJORDUgo
    public Object Puu3Rhg4F() {
        Object obj = this.ilHKhw3Yw;
        this.ilHKhw3Yw = AIDP2j9pY.q3BipwRCk;
        return obj;
    }

    @Override // con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        return this.MzoOEjc4X.kCA6Zs9sL();
    }

    public final Throwable kmSgne1rO(Z3EvbqMGQ z3EvbqMGQ) {
        vX9ZKIhAp vx9zkihap;
        do {
            Object obj = this._reusableCancellableContinuation;
            vx9zkihap = AIDP2j9pY.J4Ux7ym32;
            if (obj != vx9zkihap) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Inconsistent state ", obj).toString());
                } else if (Eeka1udhb.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!Eeka1udhb.compareAndSet(this, vx9zkihap, z3EvbqMGQ));
        return null;
    }

    public final boolean oon79WMrY() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // con.cVJORDUgo
    public void q3BipwRCk(Object obj, Throwable th) {
        if (obj instanceof sbK32z90g) {
            ((sbK32z90g) obj).J4Ux7ym32.IytU16YUK(th);
        }
    }

    @Override // con.gXw4WGPur
    public gXw4WGPur tGV7Q6urW() {
        Way959ade way959ade = this.MzoOEjc4X;
        if (way959ade instanceof gXw4WGPur) {
            return (gXw4WGPur) way959ade;
        }
        return null;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DispatchedContinuation[");
        q3BipwRCk.append(this.PSTqBLTET);
        q3BipwRCk.append(", ");
        q3BipwRCk.append(cOutqbkMD.Bhmn1KIah(this.MzoOEjc4X));
        q3BipwRCk.append(']');
        return q3BipwRCk.toString();
    }

    public final boolean vPSbyrYWX(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            vX9ZKIhAp vx9zkihap = AIDP2j9pY.J4Ux7ym32;
            if (anXlDk6fV.tGV7Q6urW(obj, vx9zkihap)) {
                if (Eeka1udhb.compareAndSet(this, vx9zkihap, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (Eeka1udhb.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final tmgChDFqU yWvV4ePLl() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = AIDP2j9pY.J4Ux7ym32;
                return null;
            } else if (obj instanceof tmgChDFqU) {
                if (Eeka1udhb.compareAndSet(this, obj, AIDP2j9pY.J4Ux7ym32)) {
                    return (tmgChDFqU) obj;
                }
            } else if (obj != AIDP2j9pY.J4Ux7ym32 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Inconsistent state ", obj).toString());
            }
        }
    }
}
