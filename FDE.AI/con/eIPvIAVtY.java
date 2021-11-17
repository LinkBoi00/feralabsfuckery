package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class eIPvIAVtY implements BoHshzX5h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater q3BipwRCk = AtomicReferenceFieldUpdater.newUpdater(eIPvIAVtY.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public final class RG2GI7LDp extends mhl5lIdbQ {
        public final Z3EvbqMGQ ilHKhw3Yw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp(Object obj, Z3EvbqMGQ z3EvbqMGQ) {
            super(r1, obj);
            eIPvIAVtY.this = r1;
            this.ilHKhw3Yw = z3EvbqMGQ;
        }

        @Override // con.eIPvIAVtY.mhl5lIdbQ
        public boolean cAwN510t2() {
            if (!mhl5lIdbQ.MzoOEjc4X.compareAndSet(this, Boolean.FALSE, Boolean.TRUE)) {
                return false;
            }
            if (((tmgChDFqU) this.ilHKhw3Yw).CpG0imbht(qih4lW99W.q3BipwRCk, null, new Idi5q1pZn(eIPvIAVtY.this, this)) != null) {
                return true;
            }
            return false;
        }

        @Override // con.eIPvIAVtY.mhl5lIdbQ
        public void dfpT1j18n() {
            tmgChDFqU tmgchdfqu = (tmgChDFqU) this.ilHKhw3Yw;
            tmgchdfqu.MzoOEjc4X(tmgchdfqu.Bhmn1KIah);
        }

        @Override // con.DV1oYHwIh
        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("LockCont[");
            q3BipwRCk.append(this.PSTqBLTET);
            q3BipwRCk.append(", ");
            q3BipwRCk.append(this.ilHKhw3Yw);
            q3BipwRCk.append("] for ");
            q3BipwRCk.append(eIPvIAVtY.this);
            return q3BipwRCk.toString();
        }
    }

    /* loaded from: classes.dex */
    public abstract class mhl5lIdbQ extends DV1oYHwIh implements clUYjTSq7 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater MzoOEjc4X = AtomicReferenceFieldUpdater.newUpdater(mhl5lIdbQ.class, Object.class, "isTaken");
        public final Object PSTqBLTET;
        private volatile /* synthetic */ Object isTaken = Boolean.FALSE;

        public mhl5lIdbQ(eIPvIAVtY eipviavty, Object obj) {
            this.PSTqBLTET = obj;
        }

        public abstract boolean cAwN510t2();

        public abstract void dfpT1j18n();

        @Override // con.clUYjTSq7
        public final void q3BipwRCk() {
            RG6kpfv3v();
        }
    }

    public eIPvIAVtY(boolean z) {
        this._state = z ? XHa3ysSnK.dIocxURUo : XHa3ysSnK.kCA6Zs9sL;
    }

    public boolean J4Ux7ym32(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof KkUQJJyYY) {
                if (((KkUQJJyYY) obj2).q3BipwRCk != XHa3ysSnK.tGV7Q6urW) {
                    return false;
                }
                if (q3BipwRCk.compareAndSet(this, obj2, obj == null ? XHa3ysSnK.dIocxURUo : new KkUQJJyYY(obj))) {
                    return true;
                }
            } else if (obj2 instanceof YEaynCwd0) {
                if (((YEaynCwd0) obj2).PSTqBLTET == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Already locked by ", obj).toString());
            } else if (obj2 instanceof mUx47mhWb) {
                ((mUx47mhWb) obj2).q3BipwRCk(this);
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Illegal state ", obj2).toString());
            }
        }
    }

    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        if (J4Ux7ym32(obj)) {
            return qih4lW99W.q3BipwRCk;
        }
        tmgChDFqU kmSgne1rO = idpM54xlp.kmSgne1rO(idpM54xlp.PSTqBLTET(way959ade));
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(obj, kmSgne1rO);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof KkUQJJyYY) {
                KkUQJJyYY kkUQJJyYY = (KkUQJJyYY) obj2;
                if (kkUQJJyYY.q3BipwRCk != XHa3ysSnK.tGV7Q6urW) {
                    q3BipwRCk.compareAndSet(this, obj2, new YEaynCwd0(kkUQJJyYY.q3BipwRCk));
                } else {
                    if (q3BipwRCk.compareAndSet(this, obj2, obj == null ? XHa3ysSnK.dIocxURUo : new KkUQJJyYY(obj))) {
                        kmSgne1rO.iMyQMM6Qj(qih4lW99W.q3BipwRCk, kmSgne1rO.Bhmn1KIah, new Idi5q1pZn(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof YEaynCwd0) {
                YEaynCwd0 yEaynCwd0 = (YEaynCwd0) obj2;
                if (yEaynCwd0.PSTqBLTET != obj) {
                    do {
                    } while (!yEaynCwd0.MzoOEjc4X().oon79WMrY(rG2GI7LDp, yEaynCwd0));
                    if (this._state == obj2 || !mhl5lIdbQ.MzoOEjc4X.compareAndSet(rG2GI7LDp, Boolean.FALSE, Boolean.TRUE)) {
                        break;
                    }
                    rG2GI7LDp = new RG2GI7LDp(obj, kmSgne1rO);
                } else {
                    throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Already locked by ", obj).toString());
                }
            } else if (obj2 instanceof mUx47mhWb) {
                ((mUx47mhWb) obj2).q3BipwRCk(this);
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Illegal state ", obj2).toString());
            }
        }
        kmSgne1rO.RG6kpfv3v(new DneeuNNHq(rG2GI7LDp));
        Object qVUwofr5s = kmSgne1rO.qVUwofr5s();
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        if (qVUwofr5s != kbkjsqcsl) {
            qVUwofr5s = qih4lW99W.q3BipwRCk;
        }
        if (qVUwofr5s == kbkjsqcsl) {
            return qVUwofr5s;
        }
        return qih4lW99W.q3BipwRCk;
    }

    public void tGV7Q6urW(Object obj) {
        DV1oYHwIh dV1oYHwIh;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof KkUQJJyYY) {
                KkUQJJyYY kkUQJJyYY = (KkUQJJyYY) obj2;
                if (obj == null) {
                    if (kkUQJJyYY.q3BipwRCk == XHa3ysSnK.tGV7Q6urW) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (kkUQJJyYY.q3BipwRCk != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Mutex is locked by ");
                        q3BipwRCk2.append(kkUQJJyYY.q3BipwRCk);
                        q3BipwRCk2.append(" but expected ");
                        q3BipwRCk2.append(obj);
                        throw new IllegalStateException(q3BipwRCk2.toString().toString());
                    }
                }
                if (q3BipwRCk.compareAndSet(this, obj2, XHa3ysSnK.kCA6Zs9sL)) {
                    return;
                }
            } else if (obj2 instanceof mUx47mhWb) {
                ((mUx47mhWb) obj2).q3BipwRCk(this);
            } else if (obj2 instanceof YEaynCwd0) {
                if (obj != null) {
                    YEaynCwd0 yEaynCwd0 = (YEaynCwd0) obj2;
                    if (yEaynCwd0.PSTqBLTET != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("Mutex is locked by ");
                        q3BipwRCk3.append(yEaynCwd0.PSTqBLTET);
                        q3BipwRCk3.append(" but expected ");
                        q3BipwRCk3.append(obj);
                        throw new IllegalStateException(q3BipwRCk3.toString().toString());
                    }
                }
                YEaynCwd0 yEaynCwd02 = (YEaynCwd0) obj2;
                while (true) {
                    dV1oYHwIh = (DV1oYHwIh) yEaynCwd02.Bhmn1KIah();
                    if (dV1oYHwIh == yEaynCwd02) {
                        dV1oYHwIh = null;
                        break;
                    } else if (dV1oYHwIh.RG6kpfv3v()) {
                        break;
                    } else {
                        dV1oYHwIh.ilHKhw3Yw();
                    }
                }
                if (dV1oYHwIh == null) {
                    sChehkqjy schehkqjy = new sChehkqjy(yEaynCwd02);
                    if (q3BipwRCk.compareAndSet(this, obj2, schehkqjy) && schehkqjy.q3BipwRCk(this) == null) {
                        return;
                    }
                } else {
                    mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) dV1oYHwIh;
                    if (mhl5lidbq.cAwN510t2()) {
                        Object obj3 = mhl5lidbq.PSTqBLTET;
                        if (obj3 == null) {
                            obj3 = XHa3ysSnK.J4Ux7ym32;
                        }
                        yEaynCwd02.PSTqBLTET = obj3;
                        mhl5lidbq.dfpT1j18n();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Illegal state ", obj2).toString());
            }
        }
    }

    public String toString() {
        StringBuilder q3BipwRCk2;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof KkUQJJyYY) {
                q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Mutex[");
                obj = ((KkUQJJyYY) obj2).q3BipwRCk;
                break;
            } else if (obj2 instanceof mUx47mhWb) {
                ((mUx47mhWb) obj2).q3BipwRCk(this);
            } else if (obj2 instanceof YEaynCwd0) {
                q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Mutex[");
                obj = ((YEaynCwd0) obj2).PSTqBLTET;
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Illegal state ", obj2).toString());
            }
        }
        q3BipwRCk2.append(obj);
        q3BipwRCk2.append(']');
        return q3BipwRCk2.toString();
    }
}
