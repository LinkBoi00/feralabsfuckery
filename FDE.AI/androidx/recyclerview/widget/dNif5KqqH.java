package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import con.CHivVJVYm;
import con.NRnsbVC1Y;
import con.ZmYjNS8wW;
/* loaded from: classes.dex */
public class dNif5KqqH {
    public final ZmYjNS8wW q3BipwRCk = new ZmYjNS8wW();
    public final NRnsbVC1Y J4Ux7ym32 = new NRnsbVC1Y();

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
    }

    public void GPLPRo6go(RecyclerView.cywn6086a cywn6086a) {
        int GPLPRo6go = this.J4Ux7ym32.GPLPRo6go() - 1;
        while (true) {
            if (GPLPRo6go < 0) {
                break;
            } else if (cywn6086a == this.J4Ux7ym32.Puu3Rhg4F(GPLPRo6go)) {
                NRnsbVC1Y nRnsbVC1Y = this.J4Ux7ym32;
                Object[] objArr = nRnsbVC1Y.Bhmn1KIah;
                Object obj = objArr[GPLPRo6go];
                Object obj2 = NRnsbVC1Y.MzoOEjc4X;
                if (obj != obj2) {
                    objArr[GPLPRo6go] = obj2;
                    nRnsbVC1Y.CBQ5d1kRq = true;
                }
            } else {
                GPLPRo6go--;
            }
        }
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.remove(cywn6086a);
        if (cHivVJVYm != null) {
            CHivVJVYm.J4Ux7ym32(cHivVJVYm);
        }
    }

    public void J4Ux7ym32(RecyclerView.cywn6086a cywn6086a, RecyclerView.lamBDew8Z.mhl5lIdbQ mhl5lidbq) {
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.getOrDefault(cywn6086a, null);
        if (cHivVJVYm == null) {
            cHivVJVYm = CHivVJVYm.q3BipwRCk();
            this.q3BipwRCk.put(cywn6086a, cHivVJVYm);
        }
        cHivVJVYm.tGV7Q6urW = mhl5lidbq;
        cHivVJVYm.q3BipwRCk |= 8;
    }

    public boolean dIocxURUo(RecyclerView.cywn6086a cywn6086a) {
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.getOrDefault(cywn6086a, null);
        return (cHivVJVYm == null || (cHivVJVYm.q3BipwRCk & 1) == 0) ? false : true;
    }

    public void iiGwOFFnr(RecyclerView.cywn6086a cywn6086a) {
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.getOrDefault(cywn6086a, null);
        if (cHivVJVYm != null) {
            cHivVJVYm.q3BipwRCk &= -2;
        }
    }

    public final RecyclerView.lamBDew8Z.mhl5lIdbQ kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a, int i) {
        CHivVJVYm cHivVJVYm;
        RecyclerView.lamBDew8Z.mhl5lIdbQ mhl5lidbq;
        int kCA6Zs9sL = this.q3BipwRCk.kCA6Zs9sL(cywn6086a);
        if (kCA6Zs9sL >= 0 && (cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.vPSbyrYWX(kCA6Zs9sL)) != null) {
            int i2 = cHivVJVYm.q3BipwRCk;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                cHivVJVYm.q3BipwRCk = i3;
                if (i == 4) {
                    mhl5lidbq = cHivVJVYm.J4Ux7ym32;
                } else if (i == 8) {
                    mhl5lidbq = cHivVJVYm.tGV7Q6urW;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.q3BipwRCk.yWvV4ePLl(kCA6Zs9sL);
                    CHivVJVYm.J4Ux7ym32(cHivVJVYm);
                }
                return mhl5lidbq;
            }
        }
        return null;
    }

    public void q3BipwRCk(RecyclerView.cywn6086a cywn6086a) {
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.getOrDefault(cywn6086a, null);
        if (cHivVJVYm == null) {
            cHivVJVYm = CHivVJVYm.q3BipwRCk();
            this.q3BipwRCk.put(cywn6086a, cHivVJVYm);
        }
        cHivVJVYm.q3BipwRCk |= 1;
    }

    public void tGV7Q6urW(RecyclerView.cywn6086a cywn6086a, RecyclerView.lamBDew8Z.mhl5lIdbQ mhl5lidbq) {
        CHivVJVYm cHivVJVYm = (CHivVJVYm) this.q3BipwRCk.getOrDefault(cywn6086a, null);
        if (cHivVJVYm == null) {
            cHivVJVYm = CHivVJVYm.q3BipwRCk();
            this.q3BipwRCk.put(cywn6086a, cHivVJVYm);
        }
        cHivVJVYm.J4Ux7ym32 = mhl5lidbq;
        cHivVJVYm.q3BipwRCk |= 4;
    }
}
