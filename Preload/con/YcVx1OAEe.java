package con;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class YcVx1OAEe extends s05BzCoHq {
    public Uhy55gmtq GPLPRo6go = Uhy55gmtq.MzoOEjc4X;
    public int Puu3Rhg4F = 1;
    public final PmanMZxiM dIocxURUo;
    public Set iiGwOFFnr;
    public final PmanMZxiM kCA6Zs9sL;
    public boolean yWvV4ePLl;

    public YcVx1OAEe(int i, Uhy55gmtq uhy55gmtq, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2) {
        super(i, uhy55gmtq, null);
        this.dIocxURUo = pmanMZxiM;
        this.kCA6Zs9sL = pmanMZxiM2;
    }

    @Override // con.s05BzCoHq
    public void CBQ5d1kRq(vlsBqYUof vlsbqyuof) {
        Set qVUwofr5s = qVUwofr5s();
        if (qVUwofr5s == null) {
            qVUwofr5s = new HashSet();
            RG6kpfv3v(qVUwofr5s);
        }
        qVUwofr5s.add(vlsbqyuof);
    }

    public final mxyx08G80 Eeka1udhb(int i, Map map, Uhy55gmtq uhy55gmtq) {
        aq0NJzKbg CBQ5d1kRq;
        aq0NJzKbg aq0njzkbg;
        n4f84B5OG n4f84b5og;
        Uhy55gmtq GPLPRo6go = dIocxURUo().Puu3Rhg4F(tGV7Q6urW()).GPLPRo6go(this.GPLPRo6go);
        Set<vlsBqYUof> qVUwofr5s = qVUwofr5s();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (vlsBqYUof vlsbqyuof : qVUwofr5s) {
            aq0NJzKbg J4Ux7ym32 = vlsbqyuof.J4Ux7ym32();
            aq0NJzKbg CBQ5d1kRq2 = UvOuyIFuT.CBQ5d1kRq(J4Ux7ym32, i, uhy55gmtq);
            if (!(CBQ5d1kRq2 == null || (CBQ5d1kRq = UvOuyIFuT.CBQ5d1kRq(J4Ux7ym32, tGV7Q6urW(), GPLPRo6go)) == null || anXlDk6fV.tGV7Q6urW(CBQ5d1kRq2, CBQ5d1kRq))) {
                aq0NJzKbg CBQ5d1kRq3 = UvOuyIFuT.CBQ5d1kRq(J4Ux7ym32, tGV7Q6urW(), dIocxURUo());
                if (CBQ5d1kRq3 != null) {
                    if (map == null) {
                        aq0njzkbg = null;
                    } else {
                        aq0njzkbg = (aq0NJzKbg) map.get(CBQ5d1kRq2);
                    }
                    if (aq0njzkbg == null) {
                        aq0njzkbg = vlsbqyuof.iiGwOFFnr(CBQ5d1kRq, CBQ5d1kRq2, CBQ5d1kRq3);
                    }
                    if (aq0njzkbg == null) {
                        return new k3hmDZbMb(this);
                    }
                    if (!anXlDk6fV.tGV7Q6urW(aq0njzkbg, CBQ5d1kRq3)) {
                        if (anXlDk6fV.tGV7Q6urW(aq0njzkbg, CBQ5d1kRq2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new n4f84B5OG(vlsbqyuof, CBQ5d1kRq2.J4Ux7ym32()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vlsbqyuof);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!anXlDk6fV.tGV7Q6urW(aq0njzkbg, CBQ5d1kRq)) {
                                n4f84b5og = new n4f84B5OG(vlsbqyuof, aq0njzkbg);
                            } else {
                                n4f84b5og = new n4f84B5OG(vlsbqyuof, CBQ5d1kRq.J4Ux7ym32());
                            }
                            arrayList.add(n4f84b5og);
                        }
                    }
                } else {
                    UvOuyIFuT.vPSbyrYWX();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            MzoOEjc4X();
            int i2 = 0;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    n4f84B5OG n4f84b5og2 = (n4f84B5OG) arrayList.get(i2);
                    vlsBqYUof vlsbqyuof2 = (vlsBqYUof) n4f84b5og2.CBQ5d1kRq;
                    aq0NJzKbg aq0njzkbg2 = (aq0NJzKbg) n4f84b5og2.kmSgne1rO;
                    aq0njzkbg2.q3BipwRCk = tGV7Q6urW();
                    synchronized (UvOuyIFuT.J4Ux7ym32) {
                        aq0njzkbg2.J4Ux7ym32 = vlsbqyuof2.J4Ux7ym32();
                        vlsbqyuof2.vPSbyrYWX(aq0njzkbg2);
                    }
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        if (arrayList2 != null) {
            qVUwofr5s.removeAll(arrayList2);
        }
        return xr8bQ8VNz.q3BipwRCk;
    }

    @Override // con.s05BzCoHq
    public PmanMZxiM GPLPRo6go() {
        return this.kCA6Zs9sL;
    }

    @Override // con.s05BzCoHq
    public void J4Ux7ym32() {
        if (!this.tGV7Q6urW) {
            this.tGV7Q6urW = true;
            oon79WMrY(this);
        }
    }

    public final void MzoOEjc4X() {
        dXrmkklc8(tGV7Q6urW());
        int tGV7Q6urW = tGV7Q6urW();
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            int i = UvOuyIFuT.dIocxURUo;
            UvOuyIFuT.dIocxURUo = i + 1;
            kmSgne1rO(i);
            UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.Puu3Rhg4F(tGV7Q6urW());
        }
        Bhmn1KIah(UvOuyIFuT.kCA6Zs9sL(dIocxURUo(), tGV7Q6urW + 1, tGV7Q6urW()));
    }

    @Override // con.s05BzCoHq
    public s05BzCoHq PSTqBLTET(PmanMZxiM pmanMZxiM) {
        z2btETSE4 z2btetse4;
        if (!this.tGV7Q6urW) {
            sk5s77z6Q();
            int tGV7Q6urW = tGV7Q6urW();
            dXrmkklc8(tGV7Q6urW());
            Object obj = UvOuyIFuT.J4Ux7ym32;
            synchronized (obj) {
                int i = UvOuyIFuT.dIocxURUo;
                UvOuyIFuT.dIocxURUo = i + 1;
                UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.Puu3Rhg4F(i);
                z2btetse4 = new z2btETSE4(i, UvOuyIFuT.kCA6Zs9sL(dIocxURUo(), tGV7Q6urW + 1, i), pmanMZxiM, this);
            }
            int tGV7Q6urW2 = tGV7Q6urW();
            synchronized (obj) {
                int i2 = UvOuyIFuT.dIocxURUo;
                UvOuyIFuT.dIocxURUo = i2 + 1;
                kmSgne1rO(i2);
                UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.Puu3Rhg4F(tGV7Q6urW());
            }
            Bhmn1KIah(UvOuyIFuT.kCA6Zs9sL(dIocxURUo(), tGV7Q6urW2 + 1, tGV7Q6urW()));
            return z2btetse4;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public void RG6kpfv3v(Set set) {
        this.iiGwOFFnr = set;
    }

    public final void dXrmkklc8(int i) {
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            this.GPLPRo6go = this.GPLPRo6go.Puu3Rhg4F(i);
        }
    }

    @Override // con.s05BzCoHq
    public boolean iiGwOFFnr() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf A[LOOP:0: B:33:0x00c1->B:35:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[LOOP:1: B:41:0x00e2->B:43:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[EDGE_INSN: B:49:0x00d1->B:36:0x00d1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2 A[EDGE_INSN: B:50:0x00f2->B:44:0x00f2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public mxyx08G80 ilHKhw3Yw() {
        Map map;
        n4f84B5OG n4f84b5og;
        List list;
        Set set;
        int i;
        int size;
        int i2;
        int size2;
        int i3;
        int i4;
        Set qVUwofr5s = qVUwofr5s();
        if (qVUwofr5s != null) {
            AtomicReference atomicReference = UvOuyIFuT.GPLPRo6go;
            map = UvOuyIFuT.tGV7Q6urW((YcVx1OAEe) atomicReference.get(), this, UvOuyIFuT.tGV7Q6urW.kCA6Zs9sL(((SNDUZfhJq) atomicReference.get()).J4Ux7ym32));
        } else {
            map = null;
        }
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            UvOuyIFuT.dIocxURUo(this);
            if (!(qVUwofr5s == null || qVUwofr5s.size() == 0)) {
                SNDUZfhJq sNDUZfhJq = (SNDUZfhJq) UvOuyIFuT.GPLPRo6go.get();
                mxyx08G80 Eeka1udhb = Eeka1udhb(UvOuyIFuT.dIocxURUo, map, UvOuyIFuT.tGV7Q6urW.kCA6Zs9sL(sNDUZfhJq.J4Ux7ym32));
                if (!anXlDk6fV.tGV7Q6urW(Eeka1udhb, xr8bQ8VNz.q3BipwRCk)) {
                    return Eeka1udhb;
                }
                q3BipwRCk();
                PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                UvOuyIFuT.PSTqBLTET(sNDUZfhJq, JHFXdtjfx.dfpT1j18n);
                Set set2 = sNDUZfhJq.iiGwOFFnr;
                RG6kpfv3v(null);
                sNDUZfhJq.iiGwOFFnr = null;
                n4f84b5og = new n4f84B5OG(new ArrayList(UvOuyIFuT.kCA6Zs9sL), set2);
                list = (List) n4f84b5og.CBQ5d1kRq;
                set = (Set) n4f84b5og.kmSgne1rO;
                this.yWvV4ePLl = true;
                i = 0;
                if (set != null && (!set.isEmpty()) && list.size() - 1 >= 0) {
                    i3 = 0;
                    while (true) {
                        i4 = i3 + 1;
                        ((kkcQgCx5G) list.get(i3)).WaUP0CF08(set, this);
                        if (i4 <= size2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                if (qVUwofr5s != null && (!qVUwofr5s.isEmpty()) && list.size() - 1 >= 0) {
                    while (true) {
                        i2 = i + 1;
                        ((kkcQgCx5G) list.get(i)).WaUP0CF08(qVUwofr5s, this);
                        if (i2 <= size) {
                            break;
                        }
                        i = i2;
                    }
                }
                return xr8bQ8VNz.q3BipwRCk;
            }
            q3BipwRCk();
            SNDUZfhJq sNDUZfhJq2 = (SNDUZfhJq) UvOuyIFuT.GPLPRo6go.get();
            PlegqbMSA plegqbMSA2 = UvOuyIFuT.q3BipwRCk;
            UvOuyIFuT.PSTqBLTET(sNDUZfhJq2, JHFXdtjfx.dfpT1j18n);
            Set set3 = sNDUZfhJq2.iiGwOFFnr;
            if (set3 == null || !(!set3.isEmpty())) {
                n4f84b5og = new n4f84B5OG(Dqz1pJHWH.CBQ5d1kRq, null);
            } else {
                n4f84b5og = new n4f84B5OG(new ArrayList(UvOuyIFuT.kCA6Zs9sL), set3);
            }
            list = (List) n4f84b5og.CBQ5d1kRq;
            set = (Set) n4f84b5og.kmSgne1rO;
            this.yWvV4ePLl = true;
            i = 0;
            if (set != null) {
                i3 = 0;
                while (true) {
                    i4 = i3 + 1;
                    ((kkcQgCx5G) list.get(i3)).WaUP0CF08(set, this);
                    if (i4 <= size2) {
                    }
                    i3 = i4;
                }
            }
            if (qVUwofr5s != null) {
                while (true) {
                    i2 = i + 1;
                    ((kkcQgCx5G) list.get(i)).WaUP0CF08(qVUwofr5s, this);
                    if (i2 <= size) {
                    }
                    i = i2;
                }
            }
            return xr8bQ8VNz.q3BipwRCk;
        }
    }

    public YcVx1OAEe ixWaw2akD(PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2) {
        Sk4RzIxF3 sk4RzIxF3;
        if (!this.tGV7Q6urW) {
            sk5s77z6Q();
            dXrmkklc8(tGV7Q6urW());
            Object obj = UvOuyIFuT.J4Ux7ym32;
            synchronized (obj) {
                int i = UvOuyIFuT.dIocxURUo;
                UvOuyIFuT.dIocxURUo = i + 1;
                UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.Puu3Rhg4F(i);
                Uhy55gmtq dIocxURUo = dIocxURUo();
                Bhmn1KIah(dIocxURUo.Puu3Rhg4F(i));
                sk4RzIxF3 = new Sk4RzIxF3(i, UvOuyIFuT.kCA6Zs9sL(dIocxURUo, tGV7Q6urW() + 1, i), UvOuyIFuT.q3BipwRCk(pmanMZxiM, this.dIocxURUo), UvOuyIFuT.J4Ux7ym32(pmanMZxiM2, this.kCA6Zs9sL), this);
            }
            int tGV7Q6urW = tGV7Q6urW();
            synchronized (obj) {
                int i2 = UvOuyIFuT.dIocxURUo;
                UvOuyIFuT.dIocxURUo = i2 + 1;
                kmSgne1rO(i2);
                UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.Puu3Rhg4F(tGV7Q6urW());
            }
            Bhmn1KIah(UvOuyIFuT.kCA6Zs9sL(dIocxURUo(), tGV7Q6urW + 1, tGV7Q6urW()));
            return sk4RzIxF3;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    @Override // con.s05BzCoHq
    public PmanMZxiM kCA6Zs9sL() {
        return this.dIocxURUo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r6 != false) goto L_0x0087;
     */
    @Override // con.s05BzCoHq
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void oon79WMrY(s05BzCoHq s05bzcohq) {
        boolean z;
        int i;
        int i2 = this.Puu3Rhg4F;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.Puu3Rhg4F = i3;
            if (i3 == 0 && !this.yWvV4ePLl) {
                Set<vlsBqYUof> qVUwofr5s = qVUwofr5s();
                if (qVUwofr5s != null) {
                    sk5s77z6Q();
                    RG6kpfv3v(null);
                    int tGV7Q6urW = tGV7Q6urW();
                    for (vlsBqYUof vlsbqyuof : qVUwofr5s) {
                        for (aq0NJzKbg J4Ux7ym32 = vlsbqyuof.J4Ux7ym32(); J4Ux7ym32 != null; J4Ux7ym32 = J4Ux7ym32.J4Ux7ym32) {
                            int i4 = J4Ux7ym32.q3BipwRCk;
                            if (i4 != tGV7Q6urW) {
                                Uhy55gmtq uhy55gmtq = this.GPLPRo6go;
                                Integer valueOf = Integer.valueOf(i4);
                                if (uhy55gmtq instanceof Collection) {
                                    z = ((Collection) uhy55gmtq).contains(valueOf);
                                } else {
                                    if (!(uhy55gmtq instanceof List)) {
                                        Iterator it = uhy55gmtq.iterator();
                                        int i5 = 0;
                                        while (true) {
                                            QScS9iO33 qScS9iO33 = (QScS9iO33) it;
                                            if (!qScS9iO33.hasNext()) {
                                                i = -1;
                                                break;
                                            }
                                            Object next = qScS9iO33.next();
                                            if (i5 < 0) {
                                                idpM54xlp.IytU16YUK();
                                                throw null;
                                            } else if (anXlDk6fV.tGV7Q6urW(valueOf, next)) {
                                                i = i5;
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    } else {
                                        i = ((List) uhy55gmtq).indexOf(valueOf);
                                    }
                                    z = i >= 0;
                                }
                            }
                            J4Ux7ym32.q3BipwRCk = 0;
                        }
                    }
                }
                q3BipwRCk();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // con.s05BzCoHq
    public void q3BipwRCk() {
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            UvOuyIFuT.tGV7Q6urW = UvOuyIFuT.tGV7Q6urW.kCA6Zs9sL(tGV7Q6urW()).J4Ux7ym32(this.GPLPRo6go);
        }
    }

    public Set qVUwofr5s() {
        return this.iiGwOFFnr;
    }

    public final void sk5s77z6Q() {
        if (!(!this.yWvV4ePLl)) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    @Override // con.s05BzCoHq
    public void vPSbyrYWX() {
        if (!this.yWvV4ePLl && !this.tGV7Q6urW) {
            MzoOEjc4X();
        }
    }

    @Override // con.s05BzCoHq
    public void yWvV4ePLl(s05BzCoHq s05bzcohq) {
        this.Puu3Rhg4F++;
    }
}
