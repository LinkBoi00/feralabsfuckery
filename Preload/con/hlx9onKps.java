package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class hlx9onKps extends IP5eUxTmc {
    public float CBQ5d1kRq;
    public rKKfiOTQO GPLPRo6go;
    public float[] J4Ux7ym32;
    public float MzoOEjc4X;
    public float PSTqBLTET;
    public gdEmqfwpT Puu3Rhg4F;
    public A128gLXzp iiGwOFFnr;
    public float oon79WMrY;
    public float vPSbyrYWX;
    public final List tGV7Q6urW = new ArrayList();
    public List dIocxURUo = Dqz1pJHWH.CBQ5d1kRq;
    public boolean kCA6Zs9sL = true;
    public String yWvV4ePLl = "";
    public float kmSgne1rO = 1.0f;
    public float Bhmn1KIah = 1.0f;
    public boolean ilHKhw3Yw = true;

    public hlx9onKps() {
        super(null);
        int i = fpjpWAHwn.q3BipwRCk;
    }

    @Override // con.IP5eUxTmc
    public gdEmqfwpT J4Ux7ym32() {
        return this.Puu3Rhg4F;
    }

    @Override // con.IP5eUxTmc
    public void dIocxURUo(gdEmqfwpT gdemqfwpt) {
        this.Puu3Rhg4F = gdemqfwpt;
        List list = this.tGV7Q6urW;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((IP5eUxTmc) list.get(i)).dIocxURUo(gdemqfwpt);
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final void kCA6Zs9sL(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.tGV7Q6urW.size()) {
                ((IP5eUxTmc) this.tGV7Q6urW.get(i)).dIocxURUo(null);
                this.tGV7Q6urW.remove(i);
            }
        }
        tGV7Q6urW();
    }

    @Override // con.IP5eUxTmc
    public void q3BipwRCk(wvIIkk6mx wviikk6mx) {
        int i = 0;
        if (this.ilHKhw3Yw) {
            float[] fArr = this.J4Ux7ym32;
            if (fArr == null) {
                fArr = p20sE4qqm.q3BipwRCk(null, 1);
                this.J4Ux7ym32 = fArr;
            } else {
                p20sE4qqm.dIocxURUo(fArr);
            }
            p20sE4qqm.kCA6Zs9sL(fArr, this.PSTqBLTET + this.vPSbyrYWX, this.MzoOEjc4X + this.CBQ5d1kRq, 0.0f, 4);
            double d = (((double) this.oon79WMrY) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (sin * f2) + (cos * f);
            float f4 = -sin;
            float f5 = (f2 * cos) + (f * f4);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (sin * f7) + (cos * f6);
            float f9 = fArr[2];
            float f10 = fArr[6];
            float f11 = (sin * f10) + (cos * f9);
            float f12 = fArr[3];
            float f13 = fArr[7];
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f11;
            fArr[3] = (sin * f13) + (cos * f12);
            fArr[4] = f5;
            fArr[5] = (f7 * cos) + (f6 * f4);
            fArr[6] = (f10 * cos) + (f9 * f4);
            fArr[7] = (cos * f13) + (f4 * f12);
            float f14 = this.kmSgne1rO;
            float f15 = this.Bhmn1KIah;
            fArr[0] = fArr[0] * f14;
            fArr[1] = fArr[1] * f14;
            fArr[2] = fArr[2] * f14;
            fArr[3] = fArr[3] * f14;
            fArr[4] = fArr[4] * f15;
            fArr[5] = fArr[5] * f15;
            fArr[6] = fArr[6] * f15;
            fArr[7] = fArr[7] * f15;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            p20sE4qqm.kCA6Zs9sL(fArr, -this.vPSbyrYWX, -this.CBQ5d1kRq, 0.0f, 4);
            this.ilHKhw3Yw = false;
        }
        if (this.kCA6Zs9sL) {
            if (!this.dIocxURUo.isEmpty()) {
                rKKfiOTQO rkkfiotqo = this.GPLPRo6go;
                if (rkkfiotqo == null) {
                    rkkfiotqo = new rKKfiOTQO();
                    this.GPLPRo6go = rkkfiotqo;
                } else {
                    ((List) rkkfiotqo.q3BipwRCk).clear();
                }
                A128gLXzp a128gLXzp = this.iiGwOFFnr;
                if (a128gLXzp == null) {
                    a128gLXzp = xP6F5SR9v.iiGwOFFnr();
                    this.iiGwOFFnr = a128gLXzp;
                } else {
                    ((Q3Qxqu4re) a128gLXzp).q3BipwRCk.reset();
                }
                ((List) rkkfiotqo.q3BipwRCk).addAll(this.dIocxURUo);
                rkkfiotqo.Puu3Rhg4F(a128gLXzp);
            }
            this.kCA6Zs9sL = false;
        }
        OpkJLRxhD ixWaw2akD = wviikk6mx.ixWaw2akD();
        long J4Ux7ym32 = ixWaw2akD.J4Ux7ym32();
        ixWaw2akD.q3BipwRCk().GPLPRo6go();
        Ubcwdx9vm ubcwdx9vm = ixWaw2akD.q3BipwRCk;
        float[] fArr2 = this.J4Ux7ym32;
        if (fArr2 != null) {
            ubcwdx9vm.q3BipwRCk.q3BipwRCk().MzoOEjc4X(fArr2);
        }
        A128gLXzp a128gLXzp2 = this.iiGwOFFnr;
        if ((!this.dIocxURUo.isEmpty()) && a128gLXzp2 != null) {
            oWhsE8IPp owhse8ipp = c8C9YlOpy.q3BipwRCk;
            oWhsE8IPp owhse8ipp2 = c8C9YlOpy.q3BipwRCk;
            ubcwdx9vm.q3BipwRCk.q3BipwRCk().kmSgne1rO(a128gLXzp2, 1);
        }
        List list = this.tGV7Q6urW;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                ((IP5eUxTmc) list.get(i)).q3BipwRCk(wviikk6mx);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        ixWaw2akD.q3BipwRCk().J4Ux7ym32();
        ixWaw2akD.tGV7Q6urW(J4Ux7ym32);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("VGroup: ");
        q3BipwRCk.append(this.yWvV4ePLl);
        List list = this.tGV7Q6urW;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                q3BipwRCk.append("\t");
                q3BipwRCk.append(((IP5eUxTmc) list.get(i)).toString());
                q3BipwRCk.append("\n");
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return q3BipwRCk.toString();
    }
}
