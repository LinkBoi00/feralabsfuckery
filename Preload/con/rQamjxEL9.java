package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
    public static final void MzoOEjc4X(rQamjxEL9 rqamjxel9) {
        Object obj;
        boolean z;
        Set set;
        if (!rqamjxel9.yWvV4ePLl.isEmpty()) {
            List list = rqamjxel9.yWvV4ePLl;
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Set set2 = (Set) list.get(i);
                    List list2 = rqamjxel9.Puu3Rhg4F;
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            qg6veklqT qg6veklqt = (qg6veklqT) ((USS5dphka) list2.get(i3));
                            do {
                                obj = qg6veklqt.Bhmn1KIah.get();
                                if (obj == null) {
                                    z = true;
                                } else {
                                    Object obj2 = MLnKY8xDo.q3BipwRCk;
                                    z = anXlDk6fV.tGV7Q6urW(obj, MLnKY8xDo.q3BipwRCk);
                                }
                                if (z) {
                                    set = set2;
                                } else if (obj instanceof Set) {
                                    set = new Set[]{(Set) obj, set2};
                                } else if (obj instanceof Object[]) {
                                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                                    Set[] setArr = (Set[]) obj;
                                    int length = setArr.length;
                                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                                    copyOf[length] = set2;
                                    set = copyOf;
                                } else {
                                    throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("corrupt pendingModifications: ", qg6veklqt.Bhmn1KIah).toString());
                                }
                            } while (!qg6veklqt.Bhmn1KIah.compareAndSet(obj, set == 1 ? 1 : 0));
                            if (obj == null) {
                                synchronized (qg6veklqt.PSTqBLTET) {
                                    qg6veklqt.oon79WMrY();
                                }
                            }
                            if (i4 > size2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            rqamjxel9.yWvV4ePLl.clear();
            if (rqamjxel9.qVUwofr5s() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
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
