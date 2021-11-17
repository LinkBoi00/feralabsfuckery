package con;

import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class rKKfiOTQO {
    public Object J4Ux7ym32;
    public Object dIocxURUo;
    public Object kCA6Zs9sL;
    public Object q3BipwRCk;
    public Object tGV7Q6urW;

    public rKKfiOTQO() {
        this.q3BipwRCk = new ArrayList();
        this.J4Ux7ym32 = new umfur8i21(0.0f, 0.0f, 3);
        this.tGV7Q6urW = new umfur8i21(0.0f, 0.0f, 3);
        this.dIocxURUo = new umfur8i21(0.0f, 0.0f, 3);
        this.kCA6Zs9sL = new umfur8i21(0.0f, 0.0f, 3);
    }

    public joIJ4ANvK GPLPRo6go() {
        String sb = ((StringBuilder) this.J4Ux7ym32).toString();
        List list = (List) this.q3BipwRCk;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(((LGCXy4SLt) list.get(i2)).q3BipwRCk(((StringBuilder) this.J4Ux7ym32).length()));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        List list2 = (List) this.tGV7Q6urW;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                arrayList2.add(((LGCXy4SLt) list2.get(i4)).q3BipwRCk(((StringBuilder) this.J4Ux7ym32).length()));
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        }
        List list3 = (List) this.dIocxURUo;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                arrayList3.add(((LGCXy4SLt) list3.get(i)).q3BipwRCk(((StringBuilder) this.J4Ux7ym32).length()));
                if (i6 > size3) {
                    break;
                }
                i = i6;
            }
        }
        return new joIJ4ANvK(sb, arrayList, arrayList2, arrayList3);
    }

    public void J4Ux7ym32(dBWPON5YR dbwpon5yr, int i, int i2) {
        ((List) this.q3BipwRCk).add(new LGCXy4SLt(dbwpon5yr, i, i2, null, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x04f0 A[LOOP:0: B:5:0x0037->B:85:0x04f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04fb A[EDGE_INSN: B:88:0x04fb->B:87:0x04fb ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public con.A128gLXzp Puu3Rhg4F(con.A128gLXzp r30) {
        /*
        // Method dump skipped, instructions count: 1276
        */
        throw new UnsupportedOperationException("Method not decompiled: con.rKKfiOTQO.Puu3Rhg4F(con.A128gLXzp):con.A128gLXzp");
    }

    public void dIocxURUo(A128gLXzp a128gLXzp, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (double) 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        int i = 0;
        if (!(d21 == 0.0d)) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d21) / 1.99999d));
                dIocxURUo(a128gLXzp, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d16 * sqrt2;
            double d24 = sqrt2 * d17;
            if (z == z2) {
                d8 = d19 - d24;
                d9 = d20 + d23;
            } else {
                d8 = d19 + d24;
                d9 = d20 - d23;
            }
            double atan2 = Math.atan2(d13 - d9, d12 - d8);
            double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
            int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i2 >= 0)) {
                atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d25 = d8 * d10;
            double d26 = d9 * d6;
            double d27 = (d25 * cos) - (d26 * sin);
            double d28 = (d26 * cos) + (d25 * sin);
            double d29 = (double) 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
            double cos2 = Math.cos(d11);
            double sin2 = Math.sin(d11);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d30 = -d10;
            double d31 = d30 * cos2;
            double d32 = d6 * sin2;
            double d33 = (d31 * sin3) - (d32 * cos3);
            double d34 = d30 * sin2;
            double d35 = d6 * cos2;
            double d36 = (cos3 * d35) + (sin3 * d34);
            double d37 = atan22 / ((double) ceil);
            if (ceil > 0) {
                double d38 = d2;
                double d39 = atan2;
                double d40 = d;
                while (true) {
                    int i3 = i + 1;
                    double d41 = d39 + d37;
                    double sin4 = Math.sin(d41);
                    double cos4 = Math.cos(d41);
                    double d42 = (((d10 * cos2) * cos4) + d27) - (d32 * sin4);
                    double d43 = (d35 * sin4) + (d10 * sin2 * cos4) + d28;
                    double d44 = (d31 * sin4) - (d32 * cos4);
                    double d45 = (cos4 * d35) + (sin4 * d34);
                    double d46 = d41 - d39;
                    double tan = Math.tan(d46 / d18);
                    double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - ((double) 1)) * Math.sin(d46)) / ((double) 3);
                    ((Q3Qxqu4re) a128gLXzp).tGV7Q6urW((float) ((d33 * sqrt3) + d40), (float) ((d36 * sqrt3) + d38), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
                    if (i3 < ceil) {
                        d37 = d37;
                        d34 = d34;
                        d40 = d42;
                        d29 = d29;
                        d39 = d41;
                        d36 = d45;
                        d33 = d44;
                        d27 = d27;
                        d28 = d28;
                        d38 = d43;
                        i = i3;
                        d10 = d5;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean iiGwOFFnr(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (((gdEmqfwpT) this.J4Ux7ym32) != null) {
                menu.add(0, 0, 0, 17039361).setShowAsAction(1);
            }
            if (((gdEmqfwpT) this.tGV7Q6urW) != null) {
                menu.add(0, 1, 1, 17039371).setShowAsAction(1);
            }
            if (((gdEmqfwpT) this.dIocxURUo) != null) {
                menu.add(0, 2, 2, 17039363).setShowAsAction(1);
            }
            if (((gdEmqfwpT) this.kCA6Zs9sL) != null) {
                menu.add(0, 3, 3, 17039373).setShowAsAction(1);
            }
            return true;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r4 == null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r4 == null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r4 == null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r4 == null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.GPLPRo6go();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        r3.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean kCA6Zs9sL(android.view.ActionMode r3, android.view.MenuItem r4) {
        /*
            r2 = this;
            int r4 = r4.getItemId()
            r0 = 1
            if (r4 == 0) goto L_0x0026
            if (r4 == r0) goto L_0x001f
            r1 = 2
            if (r4 == r1) goto L_0x0018
            r1 = 3
            if (r4 == r1) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r4 = r2.kCA6Zs9sL
            con.gdEmqfwpT r4 = (con.gdEmqfwpT) r4
            if (r4 != 0) goto L_0x002d
            goto L_0x0030
        L_0x0018:
            java.lang.Object r4 = r2.dIocxURUo
            con.gdEmqfwpT r4 = (con.gdEmqfwpT) r4
            if (r4 != 0) goto L_0x002d
            goto L_0x0030
        L_0x001f:
            java.lang.Object r4 = r2.tGV7Q6urW
            con.gdEmqfwpT r4 = (con.gdEmqfwpT) r4
            if (r4 != 0) goto L_0x002d
            goto L_0x0030
        L_0x0026:
            java.lang.Object r4 = r2.J4Ux7ym32
            con.gdEmqfwpT r4 = (con.gdEmqfwpT) r4
            if (r4 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r4.GPLPRo6go()
        L_0x0030:
            if (r3 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r3.finish()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.rKKfiOTQO.kCA6Zs9sL(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public void q3BipwRCk(char c, float[] fArr) {
        List list;
        ArrayList arrayList;
        List list2 = (List) this.q3BipwRCk;
        if (c == 'z' || c == 'Z') {
            list = Collections.singletonList(Bhi62c1rd.tGV7Q6urW);
        } else {
            char c2 = 2;
            if (c == 'm') {
                DoyxeIIWl Puu3Rhg4F = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F, 10));
                Iterator it = Puu3Rhg4F.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl = (hbC5oTdpL) it;
                    if (!hbc5otdpl.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym32 = hbc5otdpl.J4Ux7ym32();
                    float[] q3BipwRCk = ETEQx6WIN.q3BipwRCk(J4Ux7ym32, 2, J4Ux7ym32, fArr);
                    xhlMoiaQ8 imb3j5rfp = new imb3j5rFp(q3BipwRCk[0], q3BipwRCk[1]);
                    if ((imb3j5rfp instanceof HIcD9WCLp) && J4Ux7ym32 > 0) {
                        imb3j5rfp = new DCsciu29s(q3BipwRCk[0], q3BipwRCk[1]);
                    } else if (J4Ux7ym32 > 0) {
                        imb3j5rfp = new K9zsAWJWj(q3BipwRCk[0], q3BipwRCk[1]);
                    }
                    arrayList.add(imb3j5rfp);
                }
            } else if (c == 'M') {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F2, 10));
                Iterator it2 = Puu3Rhg4F2.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl2 = (hbC5oTdpL) it2;
                    if (!hbc5otdpl2.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym322 = hbc5otdpl2.J4Ux7ym32();
                    float[] q3BipwRCk2 = ETEQx6WIN.q3BipwRCk(J4Ux7ym322, 2, J4Ux7ym322, fArr);
                    xhlMoiaQ8 hIcD9WCLp = new HIcD9WCLp(q3BipwRCk2[0], q3BipwRCk2[1]);
                    if (J4Ux7ym322 > 0) {
                        hIcD9WCLp = new DCsciu29s(q3BipwRCk2[0], q3BipwRCk2[1]);
                    } else if ((hIcD9WCLp instanceof imb3j5rFp) && J4Ux7ym322 > 0) {
                        hIcD9WCLp = new K9zsAWJWj(q3BipwRCk2[0], q3BipwRCk2[1]);
                    }
                    arrayList.add(hIcD9WCLp);
                }
            } else if (c == 'l') {
                DoyxeIIWl Puu3Rhg4F3 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F3, 10));
                Iterator it3 = Puu3Rhg4F3.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl3 = (hbC5oTdpL) it3;
                    if (!hbc5otdpl3.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym323 = hbc5otdpl3.J4Ux7ym32();
                    float[] q3BipwRCk3 = ETEQx6WIN.q3BipwRCk(J4Ux7ym323, 2, J4Ux7ym323, fArr);
                    xhlMoiaQ8 k9zsAWJWj = new K9zsAWJWj(q3BipwRCk3[0], q3BipwRCk3[1]);
                    if ((k9zsAWJWj instanceof HIcD9WCLp) && J4Ux7ym323 > 0) {
                        k9zsAWJWj = new DCsciu29s(q3BipwRCk3[0], q3BipwRCk3[1]);
                    } else if ((k9zsAWJWj instanceof imb3j5rFp) && J4Ux7ym323 > 0) {
                        k9zsAWJWj = new K9zsAWJWj(q3BipwRCk3[0], q3BipwRCk3[1]);
                    }
                    arrayList.add(k9zsAWJWj);
                }
            } else if (c == 'L') {
                DoyxeIIWl Puu3Rhg4F4 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F4, 10));
                Iterator it4 = Puu3Rhg4F4.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl4 = (hbC5oTdpL) it4;
                    if (!hbc5otdpl4.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym324 = hbc5otdpl4.J4Ux7ym32();
                    float[] q3BipwRCk4 = ETEQx6WIN.q3BipwRCk(J4Ux7ym324, 2, J4Ux7ym324, fArr);
                    xhlMoiaQ8 dCsciu29s = new DCsciu29s(q3BipwRCk4[0], q3BipwRCk4[1]);
                    if ((dCsciu29s instanceof HIcD9WCLp) && J4Ux7ym324 > 0) {
                        dCsciu29s = new DCsciu29s(q3BipwRCk4[0], q3BipwRCk4[1]);
                    } else if ((dCsciu29s instanceof imb3j5rFp) && J4Ux7ym324 > 0) {
                        dCsciu29s = new K9zsAWJWj(q3BipwRCk4[0], q3BipwRCk4[1]);
                    }
                    arrayList.add(dCsciu29s);
                }
            } else if (c == 'h') {
                DoyxeIIWl Puu3Rhg4F5 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 1), 1);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F5, 10));
                Iterator it5 = Puu3Rhg4F5.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl5 = (hbC5oTdpL) it5;
                    if (!hbc5otdpl5.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym325 = hbc5otdpl5.J4Ux7ym32();
                    float[] q3BipwRCk5 = ETEQx6WIN.q3BipwRCk(J4Ux7ym325, 1, J4Ux7ym325, fArr);
                    xhlMoiaQ8 tzdg4brg4 = new tzdG4BrG4(q3BipwRCk5[0]);
                    if ((tzdg4brg4 instanceof HIcD9WCLp) && J4Ux7ym325 > 0) {
                        tzdg4brg4 = new DCsciu29s(q3BipwRCk5[0], q3BipwRCk5[1]);
                    } else if ((tzdg4brg4 instanceof imb3j5rFp) && J4Ux7ym325 > 0) {
                        tzdg4brg4 = new K9zsAWJWj(q3BipwRCk5[0], q3BipwRCk5[1]);
                    }
                    arrayList.add(tzdg4brg4);
                }
            } else if (c == 'H') {
                DoyxeIIWl Puu3Rhg4F6 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 1), 1);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F6, 10));
                Iterator it6 = Puu3Rhg4F6.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl6 = (hbC5oTdpL) it6;
                    if (!hbc5otdpl6.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym326 = hbc5otdpl6.J4Ux7ym32();
                    float[] q3BipwRCk6 = ETEQx6WIN.q3BipwRCk(J4Ux7ym326, 1, J4Ux7ym326, fArr);
                    xhlMoiaQ8 nO3QgFHRA = new NO3QgFHRA(q3BipwRCk6[0]);
                    if ((nO3QgFHRA instanceof HIcD9WCLp) && J4Ux7ym326 > 0) {
                        nO3QgFHRA = new DCsciu29s(q3BipwRCk6[0], q3BipwRCk6[1]);
                    } else if ((nO3QgFHRA instanceof imb3j5rFp) && J4Ux7ym326 > 0) {
                        nO3QgFHRA = new K9zsAWJWj(q3BipwRCk6[0], q3BipwRCk6[1]);
                    }
                    arrayList.add(nO3QgFHRA);
                }
            } else if (c == 'v') {
                DoyxeIIWl Puu3Rhg4F7 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 1), 1);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F7, 10));
                Iterator it7 = Puu3Rhg4F7.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl7 = (hbC5oTdpL) it7;
                    if (!hbc5otdpl7.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym327 = hbc5otdpl7.J4Ux7ym32();
                    float[] q3BipwRCk7 = ETEQx6WIN.q3BipwRCk(J4Ux7ym327, 1, J4Ux7ym327, fArr);
                    xhlMoiaQ8 q4hdlnnjl = new q4HDLnNjL(q3BipwRCk7[0]);
                    if ((q4hdlnnjl instanceof HIcD9WCLp) && J4Ux7ym327 > 0) {
                        q4hdlnnjl = new DCsciu29s(q3BipwRCk7[0], q3BipwRCk7[1]);
                    } else if ((q4hdlnnjl instanceof imb3j5rFp) && J4Ux7ym327 > 0) {
                        q4hdlnnjl = new K9zsAWJWj(q3BipwRCk7[0], q3BipwRCk7[1]);
                    }
                    arrayList.add(q4hdlnnjl);
                }
            } else if (c == 'V') {
                DoyxeIIWl Puu3Rhg4F8 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 1), 1);
                arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F8, 10));
                Iterator it8 = Puu3Rhg4F8.iterator();
                while (true) {
                    hbC5oTdpL hbc5otdpl8 = (hbC5oTdpL) it8;
                    if (!hbc5otdpl8.kmSgne1rO) {
                        break;
                    }
                    int J4Ux7ym328 = hbc5otdpl8.J4Ux7ym32();
                    float[] q3BipwRCk8 = ETEQx6WIN.q3BipwRCk(J4Ux7ym328, 1, J4Ux7ym328, fArr);
                    xhlMoiaQ8 zTdUW08ol = new ZTdUW08ol(q3BipwRCk8[0]);
                    if ((zTdUW08ol instanceof HIcD9WCLp) && J4Ux7ym328 > 0) {
                        zTdUW08ol = new DCsciu29s(q3BipwRCk8[0], q3BipwRCk8[1]);
                    } else if ((zTdUW08ol instanceof imb3j5rFp) && J4Ux7ym328 > 0) {
                        zTdUW08ol = new K9zsAWJWj(q3BipwRCk8[0], q3BipwRCk8[1]);
                    }
                    arrayList.add(zTdUW08ol);
                }
            } else {
                char c3 = 3;
                char c4 = 5;
                char c5 = 4;
                if (c == 'c') {
                    DoyxeIIWl Puu3Rhg4F9 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F9, 10));
                    Iterator it9 = Puu3Rhg4F9.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl9 = (hbC5oTdpL) it9;
                        if (!hbc5otdpl9.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym329 = hbc5otdpl9.J4Ux7ym32();
                        float[] q3BipwRCk9 = ETEQx6WIN.q3BipwRCk(J4Ux7ym329, 6, J4Ux7ym329, fArr);
                        Etna4Qy5x etna4Qy5x = new Etna4Qy5x(q3BipwRCk9[0], q3BipwRCk9[1], q3BipwRCk9[2], q3BipwRCk9[3], q3BipwRCk9[c5], q3BipwRCk9[c4]);
                        arrayList.add((!(etna4Qy5x instanceof HIcD9WCLp) || J4Ux7ym329 <= 0) ? (!(etna4Qy5x instanceof imb3j5rFp) || J4Ux7ym329 <= 0) ? etna4Qy5x : new K9zsAWJWj(q3BipwRCk9[0], q3BipwRCk9[1]) : new DCsciu29s(q3BipwRCk9[0], q3BipwRCk9[1]));
                        c4 = 5;
                        c5 = 4;
                    }
                } else if (c == 'C') {
                    DoyxeIIWl Puu3Rhg4F10 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F10, 10));
                    Iterator it10 = Puu3Rhg4F10.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl10 = (hbC5oTdpL) it10;
                        if (!hbc5otdpl10.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3210 = hbc5otdpl10.J4Ux7ym32();
                        float[] q3BipwRCk10 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3210, 6, J4Ux7ym3210, fArr);
                        j2g9b98TN j2g9b98tn = new j2g9b98TN(q3BipwRCk10[0], q3BipwRCk10[1], q3BipwRCk10[2], q3BipwRCk10[c3], q3BipwRCk10[4], q3BipwRCk10[5]);
                        arrayList.add((!(j2g9b98tn instanceof HIcD9WCLp) || J4Ux7ym3210 <= 0) ? (!(j2g9b98tn instanceof imb3j5rFp) || J4Ux7ym3210 <= 0) ? j2g9b98tn : new K9zsAWJWj(q3BipwRCk10[0], q3BipwRCk10[1]) : new DCsciu29s(q3BipwRCk10[0], q3BipwRCk10[1]));
                        c3 = 3;
                    }
                } else if (c == 's') {
                    DoyxeIIWl Puu3Rhg4F11 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F11, 10));
                    Iterator it11 = Puu3Rhg4F11.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl11 = (hbC5oTdpL) it11;
                        if (!hbc5otdpl11.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3211 = hbc5otdpl11.J4Ux7ym32();
                        float[] q3BipwRCk11 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3211, 4, J4Ux7ym3211, fArr);
                        xhlMoiaQ8 bxZOTs7fo = new BxZOTs7fo(q3BipwRCk11[0], q3BipwRCk11[1], q3BipwRCk11[2], q3BipwRCk11[3]);
                        if ((bxZOTs7fo instanceof HIcD9WCLp) && J4Ux7ym3211 > 0) {
                            bxZOTs7fo = new DCsciu29s(q3BipwRCk11[0], q3BipwRCk11[1]);
                        } else if ((bxZOTs7fo instanceof imb3j5rFp) && J4Ux7ym3211 > 0) {
                            bxZOTs7fo = new K9zsAWJWj(q3BipwRCk11[0], q3BipwRCk11[1]);
                        }
                        arrayList.add(bxZOTs7fo);
                    }
                } else if (c == 'S') {
                    DoyxeIIWl Puu3Rhg4F12 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F12, 10));
                    Iterator it12 = Puu3Rhg4F12.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl12 = (hbC5oTdpL) it12;
                        if (!hbc5otdpl12.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3212 = hbc5otdpl12.J4Ux7ym32();
                        float[] q3BipwRCk12 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3212, 4, J4Ux7ym3212, fArr);
                        xhlMoiaQ8 vjehclnac = new vJeHCLnAC(q3BipwRCk12[0], q3BipwRCk12[1], q3BipwRCk12[2], q3BipwRCk12[3]);
                        if ((vjehclnac instanceof HIcD9WCLp) && J4Ux7ym3212 > 0) {
                            vjehclnac = new DCsciu29s(q3BipwRCk12[0], q3BipwRCk12[1]);
                        } else if ((vjehclnac instanceof imb3j5rFp) && J4Ux7ym3212 > 0) {
                            vjehclnac = new K9zsAWJWj(q3BipwRCk12[0], q3BipwRCk12[1]);
                        }
                        arrayList.add(vjehclnac);
                    }
                } else if (c == 'q') {
                    DoyxeIIWl Puu3Rhg4F13 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F13, 10));
                    Iterator it13 = Puu3Rhg4F13.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl13 = (hbC5oTdpL) it13;
                        if (!hbc5otdpl13.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3213 = hbc5otdpl13.J4Ux7ym32();
                        float[] q3BipwRCk13 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3213, 4, J4Ux7ym3213, fArr);
                        xhlMoiaQ8 bxa2pmwnq = new bxA2PMwNQ(q3BipwRCk13[0], q3BipwRCk13[1], q3BipwRCk13[2], q3BipwRCk13[3]);
                        if ((bxa2pmwnq instanceof HIcD9WCLp) && J4Ux7ym3213 > 0) {
                            bxa2pmwnq = new DCsciu29s(q3BipwRCk13[0], q3BipwRCk13[1]);
                        } else if ((bxa2pmwnq instanceof imb3j5rFp) && J4Ux7ym3213 > 0) {
                            bxa2pmwnq = new K9zsAWJWj(q3BipwRCk13[0], q3BipwRCk13[1]);
                        }
                        arrayList.add(bxa2pmwnq);
                    }
                } else if (c == 'Q') {
                    DoyxeIIWl Puu3Rhg4F14 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F14, 10));
                    Iterator it14 = Puu3Rhg4F14.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl14 = (hbC5oTdpL) it14;
                        if (!hbc5otdpl14.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3214 = hbc5otdpl14.J4Ux7ym32();
                        float[] q3BipwRCk14 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3214, 4, J4Ux7ym3214, fArr);
                        xhlMoiaQ8 tpdc8akpa = new tPDc8akPA(q3BipwRCk14[0], q3BipwRCk14[1], q3BipwRCk14[2], q3BipwRCk14[3]);
                        if ((tpdc8akpa instanceof HIcD9WCLp) && J4Ux7ym3214 > 0) {
                            tpdc8akpa = new DCsciu29s(q3BipwRCk14[0], q3BipwRCk14[1]);
                        } else if ((tpdc8akpa instanceof imb3j5rFp) && J4Ux7ym3214 > 0) {
                            tpdc8akpa = new K9zsAWJWj(q3BipwRCk14[0], q3BipwRCk14[1]);
                        }
                        arrayList.add(tpdc8akpa);
                    }
                } else if (c == 't') {
                    DoyxeIIWl Puu3Rhg4F15 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F15, 10));
                    Iterator it15 = Puu3Rhg4F15.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl15 = (hbC5oTdpL) it15;
                        if (!hbc5otdpl15.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3215 = hbc5otdpl15.J4Ux7ym32();
                        float[] q3BipwRCk15 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3215, 2, J4Ux7ym3215, fArr);
                        xhlMoiaQ8 y6so0y3he = new Y6so0y3he(q3BipwRCk15[0], q3BipwRCk15[1]);
                        if ((y6so0y3he instanceof HIcD9WCLp) && J4Ux7ym3215 > 0) {
                            y6so0y3he = new DCsciu29s(q3BipwRCk15[0], q3BipwRCk15[1]);
                        } else if ((y6so0y3he instanceof imb3j5rFp) && J4Ux7ym3215 > 0) {
                            y6so0y3he = new K9zsAWJWj(q3BipwRCk15[0], q3BipwRCk15[1]);
                        }
                        arrayList.add(y6so0y3he);
                    }
                } else if (c == 'T') {
                    DoyxeIIWl Puu3Rhg4F16 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F16, 10));
                    Iterator it16 = Puu3Rhg4F16.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl16 = (hbC5oTdpL) it16;
                        if (!hbc5otdpl16.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3216 = hbc5otdpl16.J4Ux7ym32();
                        float[] q3BipwRCk16 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3216, 2, J4Ux7ym3216, fArr);
                        xhlMoiaQ8 yd5knigeu = new yd5KnIGeU(q3BipwRCk16[0], q3BipwRCk16[1]);
                        if ((yd5knigeu instanceof HIcD9WCLp) && J4Ux7ym3216 > 0) {
                            yd5knigeu = new DCsciu29s(q3BipwRCk16[0], q3BipwRCk16[1]);
                        } else if ((yd5knigeu instanceof imb3j5rFp) && J4Ux7ym3216 > 0) {
                            yd5knigeu = new K9zsAWJWj(q3BipwRCk16[0], q3BipwRCk16[1]);
                        }
                        arrayList.add(yd5knigeu);
                    }
                } else if (c == 'a') {
                    DoyxeIIWl Puu3Rhg4F17 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F17, 10));
                    Iterator it17 = Puu3Rhg4F17.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl17 = (hbC5oTdpL) it17;
                        if (!hbc5otdpl17.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3217 = hbc5otdpl17.J4Ux7ym32();
                        float[] q3BipwRCk17 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3217, 7, J4Ux7ym3217, fArr);
                        xhlMoiaQ8 ypmnfVAf4 = new YpmnfVAf4(q3BipwRCk17[0], q3BipwRCk17[1], q3BipwRCk17[2], Float.compare(q3BipwRCk17[3], 0.0f) != 0, Float.compare(q3BipwRCk17[4], 0.0f) != 0, q3BipwRCk17[5], q3BipwRCk17[6]);
                        if ((ypmnfVAf4 instanceof HIcD9WCLp) && J4Ux7ym3217 > 0) {
                            ypmnfVAf4 = new DCsciu29s(q3BipwRCk17[0], q3BipwRCk17[1]);
                        } else if ((ypmnfVAf4 instanceof imb3j5rFp) && J4Ux7ym3217 > 0) {
                            ypmnfVAf4 = new K9zsAWJWj(q3BipwRCk17[0], q3BipwRCk17[1]);
                        }
                        arrayList.add(ypmnfVAf4);
                    }
                } else if (c == 'A') {
                    DoyxeIIWl Puu3Rhg4F18 = cT9gik1zL.Puu3Rhg4F(new G8ebKyy85(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(Puu3Rhg4F18, 10));
                    Iterator it18 = Puu3Rhg4F18.iterator();
                    while (true) {
                        hbC5oTdpL hbc5otdpl18 = (hbC5oTdpL) it18;
                        if (!hbc5otdpl18.kmSgne1rO) {
                            break;
                        }
                        int J4Ux7ym3218 = hbc5otdpl18.J4Ux7ym32();
                        float[] q3BipwRCk18 = ETEQx6WIN.q3BipwRCk(J4Ux7ym3218, 7, J4Ux7ym3218, fArr);
                        xhlMoiaQ8 gFrxsfAkz = new GFrxsfAkz(q3BipwRCk18[0], q3BipwRCk18[1], q3BipwRCk18[c2], Float.compare(q3BipwRCk18[3], 0.0f) != 0, Float.compare(q3BipwRCk18[4], 0.0f) != 0, q3BipwRCk18[5], q3BipwRCk18[6]);
                        if ((gFrxsfAkz instanceof HIcD9WCLp) && J4Ux7ym3218 > 0) {
                            gFrxsfAkz = new DCsciu29s(q3BipwRCk18[0], q3BipwRCk18[1]);
                        } else if ((gFrxsfAkz instanceof imb3j5rFp) && J4Ux7ym3218 > 0) {
                            gFrxsfAkz = new K9zsAWJWj(q3BipwRCk18[0], q3BipwRCk18[1]);
                        }
                        arrayList.add(gFrxsfAkz);
                        c2 = 2;
                    }
                } else {
                    throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Unknown command for: ", Character.valueOf(c)));
                }
            }
            list = arrayList;
        }
        list2.addAll(list);
    }

    public void tGV7Q6urW(joIJ4ANvK joij4anvk) {
        int length = ((StringBuilder) this.J4Ux7ym32).length();
        ((StringBuilder) this.J4Ux7ym32).append(joij4anvk.CBQ5d1kRq);
        List list = joij4anvk.kmSgne1rO;
        int size = list.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) list.get(i2);
                J4Ux7ym32((dBWPON5YR) lzuuvzcu0.q3BipwRCk, lzuuvzcu0.J4Ux7ym32 + length, lzuuvzcu0.tGV7Q6urW + length);
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        List list2 = joij4anvk.Bhmn1KIah;
        int size2 = list2.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                lzuuVzcu0 lzuuvzcu02 = (lzuuVzcu0) list2.get(i4);
                ((List) this.tGV7Q6urW).add(new LGCXy4SLt((Nrdhx1ztZ) lzuuvzcu02.q3BipwRCk, length + lzuuvzcu02.J4Ux7ym32, length + lzuuvzcu02.tGV7Q6urW, null, 8));
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        }
        List list3 = joij4anvk.PSTqBLTET;
        int size3 = list3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                lzuuVzcu0 lzuuvzcu03 = (lzuuVzcu0) list3.get(i);
                ((List) this.dIocxURUo).add(new LGCXy4SLt(lzuuvzcu03.q3BipwRCk, lzuuvzcu03.J4Ux7ym32 + length, lzuuvzcu03.tGV7Q6urW + length, lzuuvzcu03.dIocxURUo));
                if (i6 <= size3) {
                    i = i6;
                } else {
                    return;
                }
            }
        }
    }

    public rKKfiOTQO(int i) {
        this.J4Ux7ym32 = new StringBuilder(i);
        this.q3BipwRCk = new ArrayList();
        this.tGV7Q6urW = new ArrayList();
        this.dIocxURUo = new ArrayList();
        this.kCA6Zs9sL = new ArrayList();
    }

    public /* synthetic */ rKKfiOTQO(int i, int i2) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public rKKfiOTQO(bzmJZsHMu bzmjzshmu, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, gdEmqfwpT gdemqfwpt3, gdEmqfwpT gdemqfwpt4) {
        this.q3BipwRCk = bzmjzshmu;
        this.J4Ux7ym32 = gdemqfwpt;
        this.tGV7Q6urW = gdemqfwpt2;
        this.dIocxURUo = gdemqfwpt3;
        this.kCA6Zs9sL = gdemqfwpt4;
    }
}
