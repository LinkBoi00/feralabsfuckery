package con;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
    public con.mxyx08G80 ilHKhw3Yw() {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: con.YcVx1OAEe.ilHKhw3Yw():con.mxyx08G80");
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
    public void oon79WMrY(con.s05BzCoHq r12) {
        /*
            r11 = this;
            int r12 = r11.Puu3Rhg4F
            r0 = 1
            r1 = 0
            if (r12 <= 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            if (r2 == 0) goto L_0x0090
            r2 = -1
            int r12 = r12 + r2
            r11.Puu3Rhg4F = r12
            if (r12 != 0) goto L_0x008f
            boolean r12 = r11.yWvV4ePLl
            if (r12 != 0) goto L_0x008f
            java.util.Set r12 = r11.qVUwofr5s()
            if (r12 == 0) goto L_0x008c
            r11.sk5s77z6Q()
            r3 = 0
            r11.RG6kpfv3v(r3)
            int r4 = r11.tGV7Q6urW()
            java.util.Iterator r12 = r12.iterator()
        L_0x002a:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x008c
            java.lang.Object r5 = r12.next()
            con.vlsBqYUof r5 = (con.vlsBqYUof) r5
            con.aq0NJzKbg r5 = r5.J4Ux7ym32()
        L_0x003a:
            if (r5 == 0) goto L_0x002a
            int r6 = r5.q3BipwRCk
            if (r6 == r4) goto L_0x0087
            con.Uhy55gmtq r7 = r11.GPLPRo6go
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0051
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r6 = r7.contains(r6)
            goto L_0x0085
        L_0x0051:
            boolean r8 = r7 instanceof java.util.List
            if (r8 == 0) goto L_0x005c
            java.util.List r7 = (java.util.List) r7
            int r6 = r7.indexOf(r6)
            goto L_0x0080
        L_0x005c:
            java.util.Iterator r7 = r7.iterator()
            r8 = r1
        L_0x0061:
            r9 = r7
            con.QScS9iO33 r9 = (con.QScS9iO33) r9
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007f
            java.lang.Object r9 = r9.next()
            if (r8 < 0) goto L_0x007b
            boolean r9 = con.anXlDk6fV.tGV7Q6urW(r6, r9)
            if (r9 == 0) goto L_0x0078
            r6 = r8
            goto L_0x0080
        L_0x0078:
            int r8 = r8 + 1
            goto L_0x0061
        L_0x007b:
            con.idpM54xlp.IytU16YUK()
            throw r3
        L_0x007f:
            r6 = r2
        L_0x0080:
            if (r6 < 0) goto L_0x0084
            r6 = r0
            goto L_0x0085
        L_0x0084:
            r6 = r1
        L_0x0085:
            if (r6 == 0) goto L_0x0089
        L_0x0087:
            r5.q3BipwRCk = r1
        L_0x0089:
            con.aq0NJzKbg r5 = r5.J4Ux7ym32
            goto L_0x003a
        L_0x008c:
            r11.q3BipwRCk()
        L_0x008f:
            return
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: con.YcVx1OAEe.oon79WMrY(con.s05BzCoHq):void");
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
