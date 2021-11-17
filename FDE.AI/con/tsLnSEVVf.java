package con;

import java.util.Map;
/* loaded from: classes.dex */
public class tsLnSEVVf {
    public final pnuAOe8oh q3BipwRCk = new pnuAOe8oh(new qWbG56qlT[16], 0);

    public void J4Ux7ym32() {
        pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
        int i = pnuaoe8oh.Bhmn1KIah;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
            do {
                ((qWbG56qlT) objArr[i2]).J4Ux7ym32();
                i2++;
            } while (i2 < i);
        }
    }

    public boolean dIocxURUo(Map map, mnTaxtMa7 mntaxtma7, PlegqbMSA plegqbMSA, boolean z) {
        pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
        int i = pnuaoe8oh.Bhmn1KIah;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((qWbG56qlT) objArr[i2]).dIocxURUo(map, mntaxtma7, plegqbMSA, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public final void kCA6Zs9sL() {
        int i = 0;
        while (true) {
            pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
            if (i < pnuaoe8oh.Bhmn1KIah) {
                qWbG56qlT qwbg56qlt = (qWbG56qlT) pnuaoe8oh.CBQ5d1kRq[i];
                if (!qwbg56qlt.J4Ux7ym32.CpG0imbht()) {
                    this.q3BipwRCk.CBQ5d1kRq(i);
                    qwbg56qlt.J4Ux7ym32();
                } else {
                    i++;
                    qwbg56qlt.kCA6Zs9sL();
                }
            } else {
                return;
            }
        }
    }

    public void q3BipwRCk() {
        int i = this.q3BipwRCk.Bhmn1KIah - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (((qWbG56qlT) this.q3BipwRCk.CBQ5d1kRq[i]).tGV7Q6urW.yWvV4ePLl()) {
                    this.q3BipwRCk.CBQ5d1kRq(i);
                }
                if (i2 >= 0) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean tGV7Q6urW() {
        pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
        int i = pnuaoe8oh.Bhmn1KIah;
        boolean z = false;
        if (i > 0) {
            Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
            int i2 = 0;
            boolean z2 = false;
            do {
                z2 = ((qWbG56qlT) objArr[i2]).tGV7Q6urW() || z2;
                i2++;
            } while (i2 < i);
            z = z2;
        }
        q3BipwRCk();
        return z;
    }
}
