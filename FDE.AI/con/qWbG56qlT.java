package con;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class qWbG56qlT extends tsLnSEVVf {
    public boolean GPLPRo6go;
    public final ztvmwA530 J4Ux7ym32;
    public v7oWlY5Vu iiGwOFFnr;
    public mnTaxtMa7 kCA6Zs9sL;
    public final pnuAOe8oh tGV7Q6urW = new pnuAOe8oh(new BIFpB3cfs[16], 0);
    public final Map dIocxURUo = new LinkedHashMap();
    public boolean Puu3Rhg4F = true;

    public qWbG56qlT(ztvmwA530 ztvmwa530) {
        this.J4Ux7ym32 = ztvmwa530;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // con.tsLnSEVVf
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32() {
        /*
            r26 = this;
            r0 = r26
            con.pnuAOe8oh r1 = r0.q3BipwRCk
            int r2 = r1.Bhmn1KIah
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0017
            java.lang.Object[] r1 = r1.CBQ5d1kRq
            r5 = r4
        L_0x000d:
            r6 = r1[r5]
            con.qWbG56qlT r6 = (con.qWbG56qlT) r6
            r6.J4Ux7ym32()
            int r5 = r5 + r3
            if (r5 < r2) goto L_0x000d
        L_0x0017:
            con.ztvmwA530 r1 = r0.J4Ux7ym32
            con.v7oWlY5Vu r2 = r1.qVUwofr5s
            if (r2 != 0) goto L_0x001f
            goto L_0x0086
        L_0x001f:
            java.util.List r2 = r2.q3BipwRCk
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.size()
            r5.<init>(r6)
            int r6 = r2.size()
            int r6 = r6 + -1
            r7 = 0
            if (r6 < 0) goto L_0x0071
        L_0x0033:
            int r8 = r4 + 1
            java.lang.Object r4 = r2.get(r4)
            con.cKAQplqZy r4 = (con.cKAQplqZy) r4
            boolean r9 = r4.dIocxURUo
            if (r9 == 0) goto L_0x0064
            long r10 = r4.tGV7Q6urW
            r14 = r10
            r19 = r10
            long r10 = r4.J4Ux7ym32
            r12 = r10
            r17 = r10
            con.LDRELZkAg r10 = con.VpcjuZfOq.q3BipwRCk
            con.LDRELZkAg r22 = con.VpcjuZfOq.q3BipwRCk
            long r10 = r4.q3BipwRCk
            r16 = 0
            int r3 = r4.yWvV4ePLl
            r23 = r3
            con.cKAQplqZy r3 = new con.cKAQplqZy
            r21 = r9
            r9 = r3
            java.util.List r24 = r4.q3BipwRCk()
            r25 = 0
            r9.<init>(r10, r12, r14, r16, r17, r19, r21, r22, r23, r24, r25)
            goto L_0x0065
        L_0x0064:
            r3 = r7
        L_0x0065:
            if (r3 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r5.add(r3)
        L_0x006b:
            if (r8 <= r6) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r4 = r8
            r3 = 1
            goto L_0x0033
        L_0x0071:
            con.v7oWlY5Vu r2 = new con.v7oWlY5Vu
            r2.<init>(r5, r7)
            r1.PSTqBLTET = r2
            r3 = 1
            r1.IytU16YUK(r2, r3)
            r3 = 2
            r1.IytU16YUK(r2, r3)
            r3 = 3
            r1.IytU16YUK(r2, r3)
            r1.qVUwofr5s = r7
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qWbG56qlT.J4Ux7ym32():void");
    }

    @Override // con.tsLnSEVVf
    public boolean dIocxURUo(Map map, mnTaxtMa7 mntaxtma7, PlegqbMSA plegqbMSA, boolean z) {
        boolean z2;
        boolean z3;
        PlegqbMSA plegqbMSA2;
        boolean z4;
        pnuAOe8oh pnuaoe8oh;
        int i;
        int i2;
        boolean z5;
        Iterator it;
        if (!this.J4Ux7ym32.CpG0imbht()) {
            z2 = z;
            z3 = false;
            plegqbMSA2 = plegqbMSA;
        } else {
            this.kCA6Zs9sL = this.J4Ux7ym32.CBQ5d1kRq;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                long j = ((BIFpB3cfs) entry.getKey()).q3BipwRCk;
                cKAQplqZy ckaqplqzy = (cKAQplqZy) entry.getValue();
                if (this.tGV7Q6urW.iiGwOFFnr(new BIFpB3cfs(j))) {
                    ArrayList arrayList = new ArrayList();
                    List q3BipwRCk = ckaqplqzy.q3BipwRCk();
                    int size = q3BipwRCk.size() - 1;
                    if (size >= 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            AZFnwmUeD aZFnwmUeD = (AZFnwmUeD) q3BipwRCk.get(i3);
                            it = it2;
                            arrayList.add(new AZFnwmUeD(aZFnwmUeD.q3BipwRCk, ((qhaZGYFO8) this.kCA6Zs9sL).Ihm5o4uLx(mntaxtma7, aZFnwmUeD.J4Ux7ym32), null));
                            if (i4 > size) {
                                break;
                            }
                            i3 = i4;
                            it2 = it;
                        }
                    } else {
                        it = it2;
                    }
                    this.dIocxURUo.put(new BIFpB3cfs(j), new cKAQplqZy(ckaqplqzy.q3BipwRCk, ckaqplqzy.J4Ux7ym32, ((qhaZGYFO8) this.kCA6Zs9sL).Ihm5o4uLx(mntaxtma7, ckaqplqzy.tGV7Q6urW), ckaqplqzy.dIocxURUo, ckaqplqzy.kCA6Zs9sL, ((qhaZGYFO8) this.kCA6Zs9sL).Ihm5o4uLx(mntaxtma7, ckaqplqzy.iiGwOFFnr), ckaqplqzy.GPLPRo6go, ckaqplqzy.Puu3Rhg4F, ckaqplqzy.yWvV4ePLl, arrayList, null));
                    it2 = it;
                }
            }
            if (this.dIocxURUo.isEmpty()) {
                this.tGV7Q6urW.kCA6Zs9sL();
                this.q3BipwRCk.kCA6Zs9sL();
                plegqbMSA2 = plegqbMSA;
                z2 = z;
                z3 = false;
            } else {
                int i5 = this.tGV7Q6urW.Bhmn1KIah - 1;
                if (i5 >= 0) {
                    while (true) {
                        int i6 = i5 - 1;
                        if (!map.containsKey(new BIFpB3cfs(((BIFpB3cfs) this.tGV7Q6urW.CBQ5d1kRq[i5]).q3BipwRCk))) {
                            this.tGV7Q6urW.CBQ5d1kRq(i5);
                        }
                        if (i6 < 0) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                List IzM1cD9ly = wkFJfVmcv.IzM1cD9ly(this.dIocxURUo.values());
                plegqbMSA2 = plegqbMSA;
                v7oWlY5Vu v7owly5vu = new v7oWlY5Vu(IzM1cD9ly, (MotionEvent) plegqbMSA2.kmSgne1rO);
                if (iiGwOFFnr(v7owly5vu)) {
                    z5 = false;
                    z5 = false;
                    z5 = false;
                    z5 = false;
                    z5 = false;
                    cKAQplqZy ckaqplqzy2 = (cKAQplqZy) IzM1cD9ly.get(0);
                    z2 = z;
                    if (!z2) {
                        this.Puu3Rhg4F = false;
                    } else if (!this.Puu3Rhg4F && (ckaqplqzy2.dIocxURUo || ckaqplqzy2.GPLPRo6go)) {
                        this.Puu3Rhg4F = !ODug2UCW1.i8XZMQc6Z(ckaqplqzy2, ((qhaZGYFO8) this.kCA6Zs9sL).Bhmn1KIah);
                    }
                    int i7 = 5;
                    if (this.Puu3Rhg4F != this.GPLPRo6go) {
                        int i8 = v7owly5vu.dIocxURUo;
                        ksLrMHgEz kslrmhgez = b5RwVV7V3.q3BipwRCk;
                        ksLrMHgEz kslrmhgez2 = b5RwVV7V3.q3BipwRCk;
                        if (b5RwVV7V3.q3BipwRCk(i8, 3) || b5RwVV7V3.q3BipwRCk(v7owly5vu.dIocxURUo, 4) || b5RwVV7V3.q3BipwRCk(v7owly5vu.dIocxURUo, 5)) {
                            if (this.Puu3Rhg4F) {
                                i7 = 4;
                            }
                            v7owly5vu.dIocxURUo = i7;
                        }
                    }
                    int i9 = v7owly5vu.dIocxURUo;
                    ksLrMHgEz kslrmhgez3 = b5RwVV7V3.q3BipwRCk;
                    ksLrMHgEz kslrmhgez4 = b5RwVV7V3.q3BipwRCk;
                    if ((b5RwVV7V3.q3BipwRCk(i9, 4) && this.GPLPRo6go) || (b5RwVV7V3.q3BipwRCk(v7owly5vu.dIocxURUo, 5) && this.Puu3Rhg4F && CVIvowp03.J4Ux7ym32(v7owly5vu.tGV7Q6urW))) {
                        v7owly5vu.dIocxURUo = 3;
                    }
                } else {
                    z2 = z;
                    z5 = false;
                }
                this.iiGwOFFnr = v7owly5vu;
                z3 = z5;
            }
        }
        if (this.dIocxURUo.isEmpty() || !this.J4Ux7ym32.CpG0imbht()) {
            return z3;
        }
        v7oWlY5Vu v7owly5vu2 = this.iiGwOFFnr;
        long j2 = ((qhaZGYFO8) this.kCA6Zs9sL).Bhmn1KIah;
        this.J4Ux7ym32.qFBXIgpia(v7owly5vu2, 1, j2);
        if (!this.J4Ux7ym32.CpG0imbht() || (i = (pnuaoe8oh = this.q3BipwRCk).Bhmn1KIah) <= 0) {
            z4 = true;
        } else {
            Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
            int i10 = z3;
            do {
                ((qWbG56qlT) objArr[i10 ? 1 : 0]).dIocxURUo(this.dIocxURUo, this.kCA6Zs9sL, plegqbMSA2, z2);
                z4 = true;
                i2 = (i10 ? 1 : 0) + 1;
                i10 = i2;
            } while (i2 < i);
        }
        if (this.J4Ux7ym32.CpG0imbht()) {
            this.J4Ux7ym32.qFBXIgpia(v7owly5vu2, 2, j2);
        }
        return z4;
    }

    public final boolean iiGwOFFnr(v7oWlY5Vu v7owly5vu) {
        return v7owly5vu.q3BipwRCk.size() == 1 && S1s03piHw.q3BipwRCk(((cKAQplqZy) v7owly5vu.q3BipwRCk.get(0)).yWvV4ePLl, 2);
    }

    @Override // con.tsLnSEVVf
    public void q3BipwRCk() {
        super.q3BipwRCk();
        v7oWlY5Vu v7owly5vu = this.iiGwOFFnr;
        if (v7owly5vu != null) {
            this.GPLPRo6go = this.Puu3Rhg4F;
            if (!iiGwOFFnr(v7owly5vu)) {
                int i = v7owly5vu.dIocxURUo;
                ksLrMHgEz kslrmhgez = b5RwVV7V3.q3BipwRCk;
                ksLrMHgEz kslrmhgez2 = b5RwVV7V3.q3BipwRCk;
                if (b5RwVV7V3.q3BipwRCk(i, 2)) {
                    List list = v7owly5vu.q3BipwRCk;
                    int size = list.size() - 1;
                    if (size >= 0) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            cKAQplqZy ckaqplqzy = (cKAQplqZy) list.get(i2);
                            if (ODug2UCW1.vPSbyrYWX(ckaqplqzy)) {
                                this.tGV7Q6urW.vPSbyrYWX(new BIFpB3cfs(ckaqplqzy.q3BipwRCk));
                            }
                            if (i3 > size) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                }
            } else {
                int i4 = v7owly5vu.dIocxURUo;
                ksLrMHgEz kslrmhgez3 = b5RwVV7V3.q3BipwRCk;
                ksLrMHgEz kslrmhgez4 = b5RwVV7V3.q3BipwRCk;
                if ((b5RwVV7V3.q3BipwRCk(i4, 5) && !CVIvowp03.J4Ux7ym32(v7owly5vu.tGV7Q6urW)) || (!CVIvowp03.J4Ux7ym32(v7owly5vu.tGV7Q6urW) && !this.Puu3Rhg4F)) {
                    this.tGV7Q6urW.kCA6Zs9sL();
                }
            }
            this.Puu3Rhg4F = false;
        }
    }

    @Override // con.tsLnSEVVf
    public boolean tGV7Q6urW() {
        pnuAOe8oh pnuaoe8oh;
        int i;
        boolean z = true;
        int i2 = 0;
        if (!this.dIocxURUo.isEmpty() && this.J4Ux7ym32.CpG0imbht()) {
            this.J4Ux7ym32.qFBXIgpia(this.iiGwOFFnr, 3, ((qhaZGYFO8) this.kCA6Zs9sL).Bhmn1KIah);
            if (this.J4Ux7ym32.CpG0imbht() && (i = (pnuaoe8oh = this.q3BipwRCk).Bhmn1KIah) > 0) {
                Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
                do {
                    ((qWbG56qlT) objArr[i2]).tGV7Q6urW();
                    i2++;
                } while (i2 < i);
            }
        } else {
            z = false;
        }
        q3BipwRCk();
        this.dIocxURUo.clear();
        this.kCA6Zs9sL = null;
        this.iiGwOFFnr = null;
        return z;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Node(pointerInputFilter=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", children=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", pointerIds=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
