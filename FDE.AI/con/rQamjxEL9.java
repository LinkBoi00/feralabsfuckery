package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class rQamjxEL9 extends z3ICU5k15 {
    public static final V1N1H6iou MzoOEjc4X;
    public static final uEb6wTQlg PSTqBLTET = new uEb6wTQlg(0);
    public Z3EvbqMGQ CBQ5d1kRq;
    public Throwable GPLPRo6go;
    public final vaiCLUymU J4Ux7ym32;
    public final bu5cjmae6 dIocxURUo;
    public JEWwjBE8f iiGwOFFnr;
    public long q3BipwRCk;
    public final UXJfIzX0r tGV7Q6urW;
    public final Object kCA6Zs9sL = new Object();
    public final List Puu3Rhg4F = new ArrayList();
    public final List yWvV4ePLl = new ArrayList();
    public final List oon79WMrY = new ArrayList();
    public final List vPSbyrYWX = new ArrayList();
    public final V1N1H6iou kmSgne1rO = new I5LF8ecws(XUuUfkdDV.Inactive);
    public final iFKnyAZAM Bhmn1KIah = new iFKnyAZAM(this);

    static {
        oWhsE8IPp owhse8ipp = x5Xme9UIF.PSTqBLTET;
        Object obj = x5Xme9UIF.MzoOEjc4X;
        if (obj == null) {
            obj = rhiWXx8NP.q3BipwRCk;
        }
        MzoOEjc4X = new I5LF8ecws(obj);
    }

    public rQamjxEL9(bu5cjmae6 bu5cjmae6) {
        vaiCLUymU vaicluymu = new vaiCLUymU(new nwvyEZJPU(this));
        this.J4Ux7ym32 = vaicluymu;
        int i = JEWwjBE8f.GPLPRo6go;
        jo9VS7iNb jo9vs7inb = new jo9VS7iNb((JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq));
        jo9vs7inb.IytU16YUK(false, true, new kO9ZKjPiu(this));
        this.tGV7Q6urW = jo9vs7inb;
        this.dIocxURUo = bu5cjmae6.plus(vaicluymu).plus(jo9vs7inb);
    }

    public static final boolean Bhmn1KIah(rQamjxEL9 rqamjxel9) {
        return (rqamjxel9.oon79WMrY.isEmpty() ^ true) || rqamjxel9.J4Ux7ym32.tGV7Q6urW();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object[]] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void MzoOEjc4X(con.rQamjxEL9 r14) {
        /*
            java.util.List r0 = r14.yWvV4ePLl
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00b7
            java.util.List r0 = r14.yWvV4ePLl
            int r2 = r0.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x009f
            r3 = 0
            r4 = r3
        L_0x0016:
            int r5 = r4 + 1
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            java.util.List r6 = r14.Puu3Rhg4F
            int r7 = r6.size()
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0099
            r8 = r3
        L_0x0029:
            int r9 = r8 + 1
            java.lang.Object r8 = r6.get(r8)
            con.USS5dphka r8 = (con.USS5dphka) r8
            con.qg6veklqT r8 = (con.qg6veklqT) r8
        L_0x0033:
            java.util.concurrent.atomic.AtomicReference r10 = r8.Bhmn1KIah
            java.lang.Object r10 = r10.get()
            if (r10 != 0) goto L_0x003d
            r11 = r1
            goto L_0x0045
        L_0x003d:
            java.lang.Object r11 = con.MLnKY8xDo.q3BipwRCk
            java.lang.Object r11 = con.MLnKY8xDo.q3BipwRCk
            boolean r11 = con.anXlDk6fV.tGV7Q6urW(r10, r11)
        L_0x0045:
            if (r11 == 0) goto L_0x0049
            r11 = r4
            goto L_0x006d
        L_0x0049:
            boolean r11 = r10 instanceof java.util.Set
            if (r11 == 0) goto L_0x0058
            r11 = 2
            java.util.Set[] r11 = new java.util.Set[r11]
            r12 = r10
            java.util.Set r12 = (java.util.Set) r12
            r11[r3] = r12
            r11[r1] = r4
            goto L_0x006d
        L_0x0058:
            boolean r11 = r10 instanceof java.lang.Object[]
            if (r11 == 0) goto L_0x0087
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            java.util.Objects.requireNonNull(r10, r11)
            r11 = r10
            java.util.Set[] r11 = (java.util.Set[]) r11
            int r12 = r11.length
            int r13 = r12 + 1
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r13)
            r11[r12] = r4
        L_0x006d:
            java.util.concurrent.atomic.AtomicReference r12 = r8.Bhmn1KIah
            boolean r11 = r12.compareAndSet(r10, r11)
            if (r11 == 0) goto L_0x0033
            if (r10 != 0) goto L_0x0082
            java.lang.Object r10 = r8.PSTqBLTET
            monitor-enter(r10)
            r8.oon79WMrY()     // Catch: all -> 0x007f
            monitor-exit(r10)
            goto L_0x0082
        L_0x007f:
            r14 = move-exception
            monitor-exit(r10)
            throw r14
        L_0x0082:
            if (r9 <= r7) goto L_0x0085
            goto L_0x0099
        L_0x0085:
            r8 = r9
            goto L_0x0029
        L_0x0087:
            java.lang.String r14 = "corrupt pendingModifications: "
            java.util.concurrent.atomic.AtomicReference r0 = r8.Bhmn1KIah
            java.lang.String r14 = con.anXlDk6fV.iMyQMM6Qj(r14, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x0099:
            if (r5 <= r2) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r4 = r5
            goto L_0x0016
        L_0x009f:
            java.util.List r0 = r14.yWvV4ePLl
            r0.clear()
            con.Z3EvbqMGQ r14 = r14.qVUwofr5s()
            if (r14 != 0) goto L_0x00ab
            goto L_0x00b7
        L_0x00ab:
            java.lang.String r14 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.rQamjxEL9.MzoOEjc4X(con.rQamjxEL9):void");
    }

    public static final USS5dphka PSTqBLTET(rQamjxEL9 rqamjxel9, USS5dphka uSS5dphka, OavOIaZo5 oavOIaZo5) {
        qg6veklqT qg6veklqt = (qg6veklqT) uSS5dphka;
        if (qg6veklqt.WaUP0CF08.IytU16YUK || qg6veklqt.i8XZMQc6Z) {
            return null;
        }
        kO9ZKjPiu ko9zkjpiu = new kO9ZKjPiu(uSS5dphka);
        dMQC97DHs dmqc97dhs = new dMQC97DHs(uSS5dphka, oavOIaZo5);
        s05BzCoHq Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
        YcVx1OAEe ycVx1OAEe = Puu3Rhg4F instanceof YcVx1OAEe ? (YcVx1OAEe) Puu3Rhg4F : null;
        if (ycVx1OAEe != null) {
            YcVx1OAEe ixWaw2akD = ycVx1OAEe.ixWaw2akD(ko9zkjpiu, dmqc97dhs);
            try {
                s05BzCoHq Puu3Rhg4F2 = ixWaw2akD.Puu3Rhg4F();
                if (oavOIaZo5.kCA6Zs9sL()) {
                    kuvj6DyFF kuvj6dyff = new kuvj6DyFF(oavOIaZo5, uSS5dphka);
                    wpXpbWG1J wpxpbwg1j = ((qg6veklqT) uSS5dphka).WaUP0CF08;
                    if (!wpxpbwg1j.IytU16YUK) {
                        wpxpbwg1j.IytU16YUK = true;
                        kuvj6dyff.GPLPRo6go();
                        wpxpbwg1j.IytU16YUK = false;
                    } else {
                        G7WvUK4mQ.tGV7Q6urW("Preparing a composition while composing is not supported".toString());
                        throw null;
                    }
                }
                boolean Bhmn1KIah = ((qg6veklqT) uSS5dphka).Bhmn1KIah();
                UvOuyIFuT.q3BipwRCk.CBQ5d1kRq(Puu3Rhg4F2);
                if (!Bhmn1KIah) {
                    uSS5dphka = null;
                }
                return uSS5dphka;
            } finally {
                kmSgne1rO(rqamjxel9, ixWaw2akD);
            }
        } else {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }

    public static final void kmSgne1rO(rQamjxEL9 rqamjxel9, YcVx1OAEe ycVx1OAEe) {
        try {
            if (ycVx1OAEe.ilHKhw3Yw() instanceof k3hmDZbMb) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            ycVx1OAEe.J4Ux7ym32();
        }
    }

    @Override // con.z3ICU5k15
    public void CBQ5d1kRq(USS5dphka uSS5dphka) {
        synchronized (this.kCA6Zs9sL) {
            this.Puu3Rhg4F.remove(uSS5dphka);
        }
    }

    public final boolean Eeka1udhb() {
        boolean z;
        synchronized (this.kCA6Zs9sL) {
            z = true;
            if (!(!this.yWvV4ePLl.isEmpty()) && !(!this.oon79WMrY.isEmpty())) {
                if (!this.J4Ux7ym32.tGV7Q6urW()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // con.z3ICU5k15
    public void GPLPRo6go(USS5dphka uSS5dphka) {
        Z3EvbqMGQ z3EvbqMGQ;
        synchronized (this.kCA6Zs9sL) {
            if (!this.oon79WMrY.contains(uSS5dphka)) {
                this.oon79WMrY.add(uSS5dphka);
                z3EvbqMGQ = qVUwofr5s();
            } else {
                z3EvbqMGQ = null;
            }
        }
        if (z3EvbqMGQ != null) {
            z3EvbqMGQ.Bhmn1KIah(qih4lW99W.q3BipwRCk);
        }
    }

    @Override // con.z3ICU5k15
    public void Puu3Rhg4F(Set set) {
    }

    @Override // con.z3ICU5k15
    public bu5cjmae6 iiGwOFFnr() {
        return this.dIocxURUo;
    }

    public final void ilHKhw3Yw() {
        synchronized (this.kCA6Zs9sL) {
            if (((XUuUfkdDV) ((I5LF8ecws) this.kmSgne1rO).Puu3Rhg4F()).compareTo(XUuUfkdDV.Idle) >= 0) {
                ((I5LF8ecws) this.kmSgne1rO).yWvV4ePLl(null, XUuUfkdDV.ShuttingDown);
            }
        }
        ((Zgh96z4e6) this.tGV7Q6urW).oon79WMrY(null);
    }

    @Override // con.z3ICU5k15
    public int kCA6Zs9sL() {
        return 1000;
    }

    @Override // con.z3ICU5k15
    public void q3BipwRCk(USS5dphka uSS5dphka, kkcQgCx5G kkcqgcx5g) {
        boolean z = ((qg6veklqT) uSS5dphka).WaUP0CF08.IytU16YUK;
        kO9ZKjPiu ko9zkjpiu = new kO9ZKjPiu(uSS5dphka);
        YcVx1OAEe ycVx1OAEe = null;
        dMQC97DHs dmqc97dhs = new dMQC97DHs(uSS5dphka, (OavOIaZo5) null);
        s05BzCoHq Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
        if (Puu3Rhg4F instanceof YcVx1OAEe) {
            ycVx1OAEe = (YcVx1OAEe) Puu3Rhg4F;
        }
        if (ycVx1OAEe != null) {
            YcVx1OAEe ixWaw2akD = ycVx1OAEe.ixWaw2akD(ko9zkjpiu, dmqc97dhs);
            try {
                s05BzCoHq Puu3Rhg4F2 = ixWaw2akD.Puu3Rhg4F();
                qg6veklqT qg6veklqt = (qg6veklqT) uSS5dphka;
                qg6veklqt.Puu3Rhg4F(kkcqgcx5g);
                UvOuyIFuT.q3BipwRCk.CBQ5d1kRq(Puu3Rhg4F2);
                if (!z) {
                    UvOuyIFuT.Puu3Rhg4F().vPSbyrYWX();
                }
                synchronized (this.kCA6Zs9sL) {
                    if (((XUuUfkdDV) ((I5LF8ecws) this.kmSgne1rO).Puu3Rhg4F()).compareTo(XUuUfkdDV.ShuttingDown) > 0 && !this.Puu3Rhg4F.contains(uSS5dphka)) {
                        this.Puu3Rhg4F.add(uSS5dphka);
                    }
                }
                qg6veklqt.GPLPRo6go();
                if (!z) {
                    UvOuyIFuT.Puu3Rhg4F().vPSbyrYWX();
                }
            } finally {
                kmSgne1rO(this, ixWaw2akD);
            }
        } else {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }

    public final Z3EvbqMGQ qVUwofr5s() {
        XUuUfkdDV xUuUfkdDV;
        XUuUfkdDV xUuUfkdDV2 = XUuUfkdDV.PendingWork;
        if (((XUuUfkdDV) ((I5LF8ecws) this.kmSgne1rO).Puu3Rhg4F()).compareTo(XUuUfkdDV.ShuttingDown) <= 0) {
            this.Puu3Rhg4F.clear();
            this.yWvV4ePLl.clear();
            this.oon79WMrY.clear();
            this.vPSbyrYWX.clear();
            Z3EvbqMGQ z3EvbqMGQ = this.CBQ5d1kRq;
            if (z3EvbqMGQ != null) {
                ((tmgChDFqU) z3EvbqMGQ).CBQ5d1kRq(null);
            }
            this.CBQ5d1kRq = null;
            return null;
        }
        if (this.iiGwOFFnr == null) {
            this.yWvV4ePLl.clear();
            this.oon79WMrY.clear();
            xUuUfkdDV = this.J4Ux7ym32.tGV7Q6urW() ? XUuUfkdDV.InactivePendingWork : XUuUfkdDV.Inactive;
        } else {
            xUuUfkdDV = ((this.oon79WMrY.isEmpty() ^ true) || (this.yWvV4ePLl.isEmpty() ^ true) || (this.vPSbyrYWX.isEmpty() ^ true) || this.J4Ux7ym32.tGV7Q6urW()) ? xUuUfkdDV2 : XUuUfkdDV.Idle;
        }
        ((I5LF8ecws) this.kmSgne1rO).yWvV4ePLl(null, xUuUfkdDV);
        if (xUuUfkdDV != xUuUfkdDV2) {
            return null;
        }
        Z3EvbqMGQ z3EvbqMGQ2 = this.CBQ5d1kRq;
        this.CBQ5d1kRq = null;
        return z3EvbqMGQ2;
    }

    @Override // con.z3ICU5k15
    public boolean tGV7Q6urW() {
        return false;
    }
}
