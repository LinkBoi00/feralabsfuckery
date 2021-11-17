package con;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
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
    public A128gLXzp Puu3Rhg4F(A128gLXzp a128gLXzp) {
        xhlMoiaQ8 xhlmoiaq8;
        List list;
        Q3Qxqu4re q3Qxqu4re;
        int i;
        rKKfiOTQO rkkfiotqo;
        int i2;
        int i3;
        rKKfiOTQO rkkfiotqo2;
        float f;
        umfur8i21 umfur8i21;
        float f2;
        umfur8i21 umfur8i212;
        rKKfiOTQO rkkfiotqo3 = this;
        Q3Qxqu4re q3Qxqu4re2 = (Q3Qxqu4re) a128gLXzp;
        q3Qxqu4re2.q3BipwRCk.reset();
        ((umfur8i21) rkkfiotqo3.J4Ux7ym32).q3BipwRCk();
        ((umfur8i21) rkkfiotqo3.tGV7Q6urW).q3BipwRCk();
        ((umfur8i21) rkkfiotqo3.dIocxURUo).q3BipwRCk();
        ((umfur8i21) rkkfiotqo3.kCA6Zs9sL).q3BipwRCk();
        List list2 = (List) rkkfiotqo3.q3BipwRCk;
        int size = list2.size() - 1;
        if (size >= 0) {
            xhlMoiaQ8 xhlmoiaq82 = null;
            int i4 = 0;
            rKKfiOTQO rkkfiotqo4 = rkkfiotqo3;
            while (true) {
                int i5 = i4 + 1;
                xhlMoiaQ8 xhlmoiaq83 = (xhlMoiaQ8) list2.get(i4);
                if (xhlmoiaq82 == null) {
                    xhlmoiaq82 = xhlmoiaq83;
                }
                if (xhlmoiaq83 instanceof Bhi62c1rd) {
                    umfur8i21 umfur8i213 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i21 umfur8i214 = (umfur8i21) rkkfiotqo4.dIocxURUo;
                    umfur8i213.q3BipwRCk = umfur8i214.q3BipwRCk;
                    umfur8i213.J4Ux7ym32 = umfur8i214.J4Ux7ym32;
                    umfur8i21 umfur8i215 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i215.q3BipwRCk = umfur8i214.q3BipwRCk;
                    umfur8i215.J4Ux7ym32 = umfur8i214.J4Ux7ym32;
                    q3Qxqu4re2.q3BipwRCk.close();
                    umfur8i21 umfur8i216 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    q3Qxqu4re2.q3BipwRCk.moveTo(umfur8i216.q3BipwRCk, umfur8i216.J4Ux7ym32);
                } else if (xhlmoiaq83 instanceof imb3j5rFp) {
                    imb3j5rFp imb3j5rfp = (imb3j5rFp) xhlmoiaq83;
                    umfur8i21 umfur8i217 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    float f3 = umfur8i217.q3BipwRCk;
                    float f4 = imb3j5rfp.tGV7Q6urW;
                    umfur8i217.q3BipwRCk = f3 + f4;
                    float f5 = umfur8i217.J4Ux7ym32;
                    float f6 = imb3j5rfp.dIocxURUo;
                    umfur8i217.J4Ux7ym32 = f5 + f6;
                    q3Qxqu4re2.q3BipwRCk.rMoveTo(f4, f6);
                    umfur8i21 umfur8i218 = (umfur8i21) rkkfiotqo4.dIocxURUo;
                    umfur8i21 umfur8i219 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i218.q3BipwRCk = umfur8i219.q3BipwRCk;
                    umfur8i218.J4Ux7ym32 = umfur8i219.J4Ux7ym32;
                } else if (xhlmoiaq83 instanceof HIcD9WCLp) {
                    HIcD9WCLp hIcD9WCLp = (HIcD9WCLp) xhlmoiaq83;
                    umfur8i21 umfur8i2110 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    float f7 = hIcD9WCLp.tGV7Q6urW;
                    umfur8i2110.q3BipwRCk = f7;
                    float f8 = hIcD9WCLp.dIocxURUo;
                    umfur8i2110.J4Ux7ym32 = f8;
                    q3Qxqu4re2.q3BipwRCk.moveTo(f7, f8);
                    umfur8i21 umfur8i2111 = (umfur8i21) rkkfiotqo4.dIocxURUo;
                    umfur8i21 umfur8i2112 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2111.q3BipwRCk = umfur8i2112.q3BipwRCk;
                    umfur8i2111.J4Ux7ym32 = umfur8i2112.J4Ux7ym32;
                } else if (xhlmoiaq83 instanceof K9zsAWJWj) {
                    K9zsAWJWj k9zsAWJWj = (K9zsAWJWj) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.rLineTo(k9zsAWJWj.tGV7Q6urW, k9zsAWJWj.dIocxURUo);
                    umfur8i21 umfur8i2113 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2113.q3BipwRCk += k9zsAWJWj.tGV7Q6urW;
                    umfur8i2113.J4Ux7ym32 += k9zsAWJWj.dIocxURUo;
                } else if (xhlmoiaq83 instanceof DCsciu29s) {
                    DCsciu29s dCsciu29s = (DCsciu29s) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.lineTo(dCsciu29s.tGV7Q6urW, dCsciu29s.dIocxURUo);
                    umfur8i21 umfur8i2114 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2114.q3BipwRCk = dCsciu29s.tGV7Q6urW;
                    umfur8i2114.J4Ux7ym32 = dCsciu29s.dIocxURUo;
                } else if (xhlmoiaq83 instanceof tzdG4BrG4) {
                    tzdG4BrG4 tzdg4brg4 = (tzdG4BrG4) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.rLineTo(tzdg4brg4.tGV7Q6urW, 0.0f);
                    ((umfur8i21) rkkfiotqo4.J4Ux7ym32).q3BipwRCk += tzdg4brg4.tGV7Q6urW;
                } else if (xhlmoiaq83 instanceof NO3QgFHRA) {
                    NO3QgFHRA nO3QgFHRA = (NO3QgFHRA) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.lineTo(nO3QgFHRA.tGV7Q6urW, ((umfur8i21) rkkfiotqo4.J4Ux7ym32).J4Ux7ym32);
                    ((umfur8i21) rkkfiotqo4.J4Ux7ym32).q3BipwRCk = nO3QgFHRA.tGV7Q6urW;
                } else if (xhlmoiaq83 instanceof q4HDLnNjL) {
                    q4HDLnNjL q4hdlnnjl = (q4HDLnNjL) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.rLineTo(0.0f, q4hdlnnjl.tGV7Q6urW);
                    ((umfur8i21) rkkfiotqo4.J4Ux7ym32).J4Ux7ym32 += q4hdlnnjl.tGV7Q6urW;
                } else if (xhlmoiaq83 instanceof ZTdUW08ol) {
                    ZTdUW08ol zTdUW08ol = (ZTdUW08ol) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.lineTo(((umfur8i21) rkkfiotqo4.J4Ux7ym32).q3BipwRCk, zTdUW08ol.tGV7Q6urW);
                    ((umfur8i21) rkkfiotqo4.J4Ux7ym32).J4Ux7ym32 = zTdUW08ol.tGV7Q6urW;
                } else if (xhlmoiaq83 instanceof Etna4Qy5x) {
                    Etna4Qy5x etna4Qy5x = (Etna4Qy5x) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.rCubicTo(etna4Qy5x.tGV7Q6urW, etna4Qy5x.dIocxURUo, etna4Qy5x.kCA6Zs9sL, etna4Qy5x.iiGwOFFnr, etna4Qy5x.GPLPRo6go, etna4Qy5x.Puu3Rhg4F);
                    umfur8i21 umfur8i2115 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i21 umfur8i2116 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2115.q3BipwRCk = umfur8i2116.q3BipwRCk + etna4Qy5x.kCA6Zs9sL;
                    umfur8i2115.J4Ux7ym32 = umfur8i2116.J4Ux7ym32 + etna4Qy5x.iiGwOFFnr;
                    umfur8i2116.q3BipwRCk += etna4Qy5x.GPLPRo6go;
                    umfur8i2116.J4Ux7ym32 += etna4Qy5x.Puu3Rhg4F;
                } else if (xhlmoiaq83 instanceof j2g9b98TN) {
                    j2g9b98TN j2g9b98tn = (j2g9b98TN) xhlmoiaq83;
                    q3Qxqu4re2.tGV7Q6urW(j2g9b98tn.tGV7Q6urW, j2g9b98tn.dIocxURUo, j2g9b98tn.kCA6Zs9sL, j2g9b98tn.iiGwOFFnr, j2g9b98tn.GPLPRo6go, j2g9b98tn.Puu3Rhg4F);
                    umfur8i21 umfur8i2117 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i2117.q3BipwRCk = j2g9b98tn.kCA6Zs9sL;
                    umfur8i2117.J4Ux7ym32 = j2g9b98tn.iiGwOFFnr;
                    umfur8i21 umfur8i2118 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2118.q3BipwRCk = j2g9b98tn.GPLPRo6go;
                    umfur8i2118.J4Ux7ym32 = j2g9b98tn.Puu3Rhg4F;
                } else if (xhlmoiaq83 instanceof BxZOTs7fo) {
                    BxZOTs7fo bxZOTs7fo = (BxZOTs7fo) xhlmoiaq83;
                    if (xhlmoiaq82.q3BipwRCk) {
                        umfur8i21 umfur8i2119 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        umfur8i21 umfur8i2120 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        float f9 = umfur8i2120.q3BipwRCk;
                        umfur8i21 umfur8i2121 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                        umfur8i2119.q3BipwRCk = f9 - umfur8i2121.q3BipwRCk;
                        umfur8i2119.J4Ux7ym32 = umfur8i2120.J4Ux7ym32 - umfur8i2121.J4Ux7ym32;
                    } else {
                        ((umfur8i21) rkkfiotqo4.kCA6Zs9sL).q3BipwRCk();
                    }
                    umfur8i21 umfur8i2122 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    q3Qxqu4re2.q3BipwRCk.rCubicTo(umfur8i2122.q3BipwRCk, umfur8i2122.J4Ux7ym32, bxZOTs7fo.tGV7Q6urW, bxZOTs7fo.dIocxURUo, bxZOTs7fo.kCA6Zs9sL, bxZOTs7fo.iiGwOFFnr);
                    umfur8i21 umfur8i2123 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i21 umfur8i2124 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2123.q3BipwRCk = umfur8i2124.q3BipwRCk + bxZOTs7fo.tGV7Q6urW;
                    umfur8i2123.J4Ux7ym32 = umfur8i2124.J4Ux7ym32 + bxZOTs7fo.dIocxURUo;
                    umfur8i2124.q3BipwRCk += bxZOTs7fo.kCA6Zs9sL;
                    umfur8i2124.J4Ux7ym32 += bxZOTs7fo.iiGwOFFnr;
                } else if (xhlmoiaq83 instanceof vJeHCLnAC) {
                    vJeHCLnAC vjehclnac = (vJeHCLnAC) xhlmoiaq83;
                    if (xhlmoiaq82.q3BipwRCk) {
                        umfur8i212 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        float f10 = (float) 2;
                        umfur8i21 umfur8i2125 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        umfur8i21 umfur8i2126 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                        umfur8i212.q3BipwRCk = (umfur8i2125.q3BipwRCk * f10) - umfur8i2126.q3BipwRCk;
                        f2 = (f10 * umfur8i2125.J4Ux7ym32) - umfur8i2126.J4Ux7ym32;
                    } else {
                        umfur8i212 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        umfur8i21 umfur8i2127 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        umfur8i212.q3BipwRCk = umfur8i2127.q3BipwRCk;
                        f2 = umfur8i2127.J4Ux7ym32;
                    }
                    umfur8i212.J4Ux7ym32 = f2;
                    umfur8i21 umfur8i2128 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    q3Qxqu4re2.tGV7Q6urW(umfur8i2128.q3BipwRCk, umfur8i2128.J4Ux7ym32, vjehclnac.tGV7Q6urW, vjehclnac.dIocxURUo, vjehclnac.kCA6Zs9sL, vjehclnac.iiGwOFFnr);
                    umfur8i21 umfur8i2129 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i2129.q3BipwRCk = vjehclnac.tGV7Q6urW;
                    umfur8i2129.J4Ux7ym32 = vjehclnac.dIocxURUo;
                    umfur8i21 umfur8i2130 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2130.q3BipwRCk = vjehclnac.kCA6Zs9sL;
                    umfur8i2130.J4Ux7ym32 = vjehclnac.iiGwOFFnr;
                } else if (xhlmoiaq83 instanceof bxA2PMwNQ) {
                    bxA2PMwNQ bxa2pmwnq = (bxA2PMwNQ) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.rQuadTo(bxa2pmwnq.tGV7Q6urW, bxa2pmwnq.dIocxURUo, bxa2pmwnq.kCA6Zs9sL, bxa2pmwnq.iiGwOFFnr);
                    umfur8i21 umfur8i2131 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i21 umfur8i2132 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2131.q3BipwRCk = umfur8i2132.q3BipwRCk + bxa2pmwnq.tGV7Q6urW;
                    umfur8i2131.J4Ux7ym32 = umfur8i2132.J4Ux7ym32 + bxa2pmwnq.dIocxURUo;
                    umfur8i2132.q3BipwRCk += bxa2pmwnq.kCA6Zs9sL;
                    umfur8i2132.J4Ux7ym32 += bxa2pmwnq.iiGwOFFnr;
                } else if (xhlmoiaq83 instanceof tPDc8akPA) {
                    tPDc8akPA tpdc8akpa = (tPDc8akPA) xhlmoiaq83;
                    q3Qxqu4re2.q3BipwRCk.quadTo(tpdc8akpa.tGV7Q6urW, tpdc8akpa.dIocxURUo, tpdc8akpa.kCA6Zs9sL, tpdc8akpa.iiGwOFFnr);
                    umfur8i21 umfur8i2133 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i2133.q3BipwRCk = tpdc8akpa.tGV7Q6urW;
                    umfur8i2133.J4Ux7ym32 = tpdc8akpa.dIocxURUo;
                    umfur8i21 umfur8i2134 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2134.q3BipwRCk = tpdc8akpa.kCA6Zs9sL;
                    umfur8i2134.J4Ux7ym32 = tpdc8akpa.iiGwOFFnr;
                } else if (xhlmoiaq83 instanceof Y6so0y3he) {
                    Y6so0y3he y6so0y3he = (Y6so0y3he) xhlmoiaq83;
                    if (xhlmoiaq82.J4Ux7ym32) {
                        umfur8i21 umfur8i2135 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        umfur8i21 umfur8i2136 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        float f11 = umfur8i2136.q3BipwRCk;
                        umfur8i21 umfur8i2137 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                        umfur8i2135.q3BipwRCk = f11 - umfur8i2137.q3BipwRCk;
                        umfur8i2135.J4Ux7ym32 = umfur8i2136.J4Ux7ym32 - umfur8i2137.J4Ux7ym32;
                    } else {
                        ((umfur8i21) rkkfiotqo4.kCA6Zs9sL).q3BipwRCk();
                    }
                    umfur8i21 umfur8i2138 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    q3Qxqu4re2.q3BipwRCk.rQuadTo(umfur8i2138.q3BipwRCk, umfur8i2138.J4Ux7ym32, y6so0y3he.tGV7Q6urW, y6so0y3he.dIocxURUo);
                    umfur8i21 umfur8i2139 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i21 umfur8i2140 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    float f12 = umfur8i2140.q3BipwRCk;
                    umfur8i21 umfur8i2141 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    umfur8i2139.q3BipwRCk = f12 + umfur8i2141.q3BipwRCk;
                    umfur8i2139.J4Ux7ym32 = umfur8i2140.J4Ux7ym32 + umfur8i2141.J4Ux7ym32;
                    umfur8i2140.q3BipwRCk += y6so0y3he.tGV7Q6urW;
                    umfur8i2140.J4Ux7ym32 += y6so0y3he.dIocxURUo;
                } else if (xhlmoiaq83 instanceof yd5KnIGeU) {
                    yd5KnIGeU yd5knigeu = (yd5KnIGeU) xhlmoiaq83;
                    if (xhlmoiaq82.J4Ux7ym32) {
                        umfur8i21 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        float f13 = (float) 2;
                        umfur8i21 umfur8i2142 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        umfur8i21 umfur8i2143 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                        umfur8i21.q3BipwRCk = (umfur8i2142.q3BipwRCk * f13) - umfur8i2143.q3BipwRCk;
                        f = (f13 * umfur8i2142.J4Ux7ym32) - umfur8i2143.J4Ux7ym32;
                    } else {
                        umfur8i21 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                        umfur8i21 umfur8i2144 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        umfur8i21.q3BipwRCk = umfur8i2144.q3BipwRCk;
                        f = umfur8i2144.J4Ux7ym32;
                    }
                    umfur8i21.J4Ux7ym32 = f;
                    umfur8i21 umfur8i2145 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    q3Qxqu4re2.q3BipwRCk.quadTo(umfur8i2145.q3BipwRCk, umfur8i2145.J4Ux7ym32, yd5knigeu.tGV7Q6urW, yd5knigeu.dIocxURUo);
                    umfur8i21 umfur8i2146 = (umfur8i21) rkkfiotqo4.tGV7Q6urW;
                    umfur8i21 umfur8i2147 = (umfur8i21) rkkfiotqo4.kCA6Zs9sL;
                    umfur8i2146.q3BipwRCk = umfur8i2147.q3BipwRCk;
                    umfur8i2146.J4Ux7ym32 = umfur8i2147.J4Ux7ym32;
                    umfur8i21 umfur8i2148 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                    umfur8i2148.q3BipwRCk = yd5knigeu.tGV7Q6urW;
                    umfur8i2148.J4Ux7ym32 = yd5knigeu.dIocxURUo;
                } else {
                    if (xhlmoiaq83 instanceof YpmnfVAf4) {
                        YpmnfVAf4 ypmnfVAf4 = (YpmnfVAf4) xhlmoiaq83;
                        float f14 = ypmnfVAf4.Puu3Rhg4F;
                        umfur8i21 umfur8i2149 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                        float f15 = umfur8i2149.q3BipwRCk;
                        float f16 = f14 + f15;
                        float f17 = ypmnfVAf4.yWvV4ePLl;
                        float f18 = umfur8i2149.J4Ux7ym32;
                        float f19 = f17 + f18;
                        q3Qxqu4re = q3Qxqu4re2;
                        i3 = i5;
                        list = list2;
                        i2 = size;
                        dIocxURUo(a128gLXzp, (double) f15, (double) f18, (double) f16, (double) f19, (double) ypmnfVAf4.tGV7Q6urW, (double) ypmnfVAf4.dIocxURUo, (double) ypmnfVAf4.kCA6Zs9sL, ypmnfVAf4.iiGwOFFnr, ypmnfVAf4.GPLPRo6go);
                        rkkfiotqo2 = this;
                        umfur8i21 umfur8i2150 = (umfur8i21) rkkfiotqo2.J4Ux7ym32;
                        umfur8i2150.q3BipwRCk = f16;
                        umfur8i2150.J4Ux7ym32 = f19;
                        umfur8i21 umfur8i2151 = (umfur8i21) rkkfiotqo2.tGV7Q6urW;
                        umfur8i2151.q3BipwRCk = f16;
                        umfur8i2151.J4Ux7ym32 = f19;
                        rkkfiotqo = rkkfiotqo2;
                        xhlmoiaq8 = xhlmoiaq83;
                    } else {
                        q3Qxqu4re = q3Qxqu4re2;
                        i3 = i5;
                        list = list2;
                        i2 = size;
                        if (xhlmoiaq83 instanceof GFrxsfAkz) {
                            GFrxsfAkz gFrxsfAkz = (GFrxsfAkz) xhlmoiaq83;
                            umfur8i21 umfur8i2152 = (umfur8i21) rkkfiotqo4.J4Ux7ym32;
                            xhlmoiaq8 = xhlmoiaq83;
                            rkkfiotqo = this;
                            rkkfiotqo.dIocxURUo(a128gLXzp, (double) umfur8i2152.q3BipwRCk, (double) umfur8i2152.J4Ux7ym32, (double) gFrxsfAkz.Puu3Rhg4F, (double) gFrxsfAkz.yWvV4ePLl, (double) gFrxsfAkz.tGV7Q6urW, (double) gFrxsfAkz.dIocxURUo, (double) gFrxsfAkz.kCA6Zs9sL, gFrxsfAkz.iiGwOFFnr, gFrxsfAkz.GPLPRo6go);
                            umfur8i21 umfur8i2153 = (umfur8i21) rkkfiotqo.J4Ux7ym32;
                            float f20 = gFrxsfAkz.Puu3Rhg4F;
                            umfur8i2153.q3BipwRCk = f20;
                            float f21 = gFrxsfAkz.yWvV4ePLl;
                            umfur8i2153.J4Ux7ym32 = f21;
                            umfur8i21 umfur8i2154 = (umfur8i21) rkkfiotqo.tGV7Q6urW;
                            umfur8i2154.q3BipwRCk = f20;
                            umfur8i2154.J4Ux7ym32 = f21;
                            rkkfiotqo2 = rkkfiotqo;
                        } else {
                            xhlmoiaq8 = xhlmoiaq83;
                            rkkfiotqo = rkkfiotqo3;
                            rkkfiotqo2 = rkkfiotqo4;
                        }
                    }
                    rkkfiotqo4 = rkkfiotqo2;
                    i4 = i3;
                    i = i2;
                    if (i4 <= i) {
                        break;
                    }
                    rkkfiotqo3 = rkkfiotqo;
                    size = i;
                    q3Qxqu4re2 = q3Qxqu4re;
                    list2 = list;
                    xhlmoiaq82 = xhlmoiaq8;
                }
                q3Qxqu4re = q3Qxqu4re2;
                rkkfiotqo = rkkfiotqo3;
                i4 = i5;
                xhlmoiaq8 = xhlmoiaq83;
                list = list2;
                i = size;
                if (i4 <= i) {
                }
            }
        }
        return a128gLXzp;
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
    public boolean kCA6Zs9sL(ActionMode actionMode, MenuItem menuItem) {
        gdEmqfwpT gdemqfwpt;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            gdemqfwpt = (gdEmqfwpT) this.J4Ux7ym32;
        } else if (itemId == 1) {
            gdemqfwpt = (gdEmqfwpT) this.tGV7Q6urW;
        } else if (itemId == 2) {
            gdemqfwpt = (gdEmqfwpT) this.dIocxURUo;
        } else if (itemId != 3) {
            return false;
        } else {
            gdemqfwpt = (gdEmqfwpT) this.kCA6Zs9sL;
        }
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
