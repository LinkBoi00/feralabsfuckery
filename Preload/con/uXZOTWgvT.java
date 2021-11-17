package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class uXZOTWgvT {
    public sTDZxriMn dIocxURUo;
    public miIsFJ8kP q3BipwRCk = null;
    public float J4Ux7ym32 = 0.0f;
    public ArrayList tGV7Q6urW = new ArrayList();
    public boolean kCA6Zs9sL = false;

    public uXZOTWgvT(LKa8y802S lKa8y802S) {
        this.dIocxURUo = new ANICXsPCf(this, lKa8y802S);
    }

    public void Bhmn1KIah(WLlBJNJ2W wLlBJNJ2W, uXZOTWgvT uxzotwgvt, boolean z) {
        float dIocxURUo = this.dIocxURUo.dIocxURUo(uxzotwgvt, z);
        this.J4Ux7ym32 = (uxzotwgvt.J4Ux7ym32 * dIocxURUo) + this.J4Ux7ym32;
        if (z) {
            uxzotwgvt.q3BipwRCk.J4Ux7ym32(this);
        }
        if (this.q3BipwRCk != null && this.dIocxURUo.vPSbyrYWX() == 0) {
            this.kCA6Zs9sL = true;
            wLlBJNJ2W.q3BipwRCk = true;
        }
    }

    public void CBQ5d1kRq(miIsFJ8kP miisfj8kp) {
        miIsFJ8kP miisfj8kp2 = this.q3BipwRCk;
        if (miisfj8kp2 != null) {
            this.dIocxURUo.J4Ux7ym32(miisfj8kp2, -1.0f);
            this.q3BipwRCk.Bhmn1KIah = -1;
            this.q3BipwRCk = null;
        }
        float iiGwOFFnr = this.dIocxURUo.iiGwOFFnr(miisfj8kp, true) * -1.0f;
        this.q3BipwRCk = miisfj8kp;
        if (iiGwOFFnr != 1.0f) {
            this.J4Ux7ym32 /= iiGwOFFnr;
            this.dIocxURUo.Puu3Rhg4F(iiGwOFFnr);
        }
    }

    public uXZOTWgvT GPLPRo6go(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, miIsFJ8kP miisfj8kp3, miIsFJ8kP miisfj8kp4, float f) {
        this.dIocxURUo.J4Ux7ym32(miisfj8kp3, 0.5f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp4, 0.5f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp, -0.5f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp2, -0.5f);
        this.J4Ux7ym32 = -f;
        return this;
    }

    public void J4Ux7ym32(miIsFJ8kP miisfj8kp) {
        float f;
        int i = miisfj8kp.PSTqBLTET;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.dIocxURUo.J4Ux7ym32(miisfj8kp, f);
        }
        f = 1.0f;
        this.dIocxURUo.J4Ux7ym32(miisfj8kp, f);
    }

    public miIsFJ8kP Puu3Rhg4F(WLlBJNJ2W wLlBJNJ2W, boolean[] zArr) {
        return vPSbyrYWX(zArr, null);
    }

    public uXZOTWgvT dIocxURUo(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, miIsFJ8kP miisfj8kp3, miIsFJ8kP miisfj8kp4, float f) {
        this.dIocxURUo.J4Ux7ym32(miisfj8kp, -1.0f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp2, 1.0f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp3, f);
        this.dIocxURUo.J4Ux7ym32(miisfj8kp4, -f);
        return this;
    }

    public uXZOTWgvT iiGwOFFnr(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, miIsFJ8kP miisfj8kp3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.J4Ux7ym32 = (float) i;
        }
        if (!z) {
            this.dIocxURUo.J4Ux7ym32(miisfj8kp, -1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp2, 1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp3, -1.0f);
        } else {
            this.dIocxURUo.J4Ux7ym32(miisfj8kp, 1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp2, -1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp3, 1.0f);
        }
        return this;
    }

    public uXZOTWgvT kCA6Zs9sL(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, miIsFJ8kP miisfj8kp3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.J4Ux7ym32 = (float) i;
        }
        if (!z) {
            this.dIocxURUo.J4Ux7ym32(miisfj8kp, -1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp2, 1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp3, 1.0f);
        } else {
            this.dIocxURUo.J4Ux7ym32(miisfj8kp, 1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp2, -1.0f);
            this.dIocxURUo.J4Ux7ym32(miisfj8kp3, -1.0f);
        }
        return this;
    }

    public void kmSgne1rO(WLlBJNJ2W wLlBJNJ2W, miIsFJ8kP miisfj8kp, boolean z) {
        if (miisfj8kp.ilHKhw3Yw) {
            float yWvV4ePLl = this.dIocxURUo.yWvV4ePLl(miisfj8kp);
            this.J4Ux7ym32 = (miisfj8kp.MzoOEjc4X * yWvV4ePLl) + this.J4Ux7ym32;
            this.dIocxURUo.iiGwOFFnr(miisfj8kp, z);
            if (z) {
                miisfj8kp.J4Ux7ym32(this);
            }
            if (this.dIocxURUo.vPSbyrYWX() == 0) {
                this.kCA6Zs9sL = true;
                wLlBJNJ2W.q3BipwRCk = true;
            }
        }
    }

    public final boolean oon79WMrY(miIsFJ8kP miisfj8kp) {
        return miisfj8kp.sk5s77z6Q <= 1;
    }

    public uXZOTWgvT q3BipwRCk(WLlBJNJ2W wLlBJNJ2W, int i) {
        this.dIocxURUo.J4Ux7ym32(wLlBJNJ2W.vPSbyrYWX(i, "ep"), 1.0f);
        this.dIocxURUo.J4Ux7ym32(wLlBJNJ2W.vPSbyrYWX(i, "em"), -1.0f);
        return this;
    }

    public void tGV7Q6urW() {
        this.dIocxURUo.clear();
        this.q3BipwRCk = null;
        this.J4Ux7ym32 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public String toString() {
        String str;
        boolean z;
        float q3BipwRCk;
        int i;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (this.q3BipwRCk == null) {
            str = "0";
        } else {
            StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("");
            q3BipwRCk2.append(this.q3BipwRCk);
            str = q3BipwRCk2.toString();
        }
        String q3BipwRCk3 = UexvVay3o.q3BipwRCk(str, " = ");
        if (this.J4Ux7ym32 != 0.0f) {
            StringBuilder q3BipwRCk4 = abGBwSu8x.q3BipwRCk(q3BipwRCk3);
            q3BipwRCk4.append(this.J4Ux7ym32);
            q3BipwRCk3 = q3BipwRCk4.toString();
            z = true;
        } else {
            z = false;
        }
        int vPSbyrYWX = this.dIocxURUo.vPSbyrYWX();
        for (int i2 = 0; i2 < vPSbyrYWX; i2++) {
            miIsFJ8kP kCA6Zs9sL = this.dIocxURUo.kCA6Zs9sL(i2);
            if (!(kCA6Zs9sL == null || (q3BipwRCk = this.dIocxURUo.q3BipwRCk(i2)) == 0.0f)) {
                String miisfj8kp = kCA6Zs9sL.toString();
                if (!z) {
                    if (q3BipwRCk < 0.0f) {
                        sb2 = abGBwSu8x.q3BipwRCk(q3BipwRCk3);
                        str2 = "- ";
                        sb2.append(str2);
                        q3BipwRCk3 = sb2.toString();
                        q3BipwRCk *= -1.0f;
                    }
                    if (q3BipwRCk == 1.0f) {
                        sb = new StringBuilder();
                    } else {
                        sb = new StringBuilder();
                        sb.append(q3BipwRCk3);
                        sb.append(q3BipwRCk);
                        q3BipwRCk3 = " ";
                    }
                    q3BipwRCk3 = my9FFKbZi.q3BipwRCk(sb, q3BipwRCk3, miisfj8kp);
                    z = true;
                } else {
                    sb2 = abGBwSu8x.q3BipwRCk(q3BipwRCk3);
                    if (i > 0) {
                        sb2.append(" + ");
                        q3BipwRCk3 = sb2.toString();
                        if (q3BipwRCk == 1.0f) {
                        }
                        q3BipwRCk3 = my9FFKbZi.q3BipwRCk(sb, q3BipwRCk3, miisfj8kp);
                        z = true;
                    } else {
                        str2 = " - ";
                        sb2.append(str2);
                        q3BipwRCk3 = sb2.toString();
                        q3BipwRCk *= -1.0f;
                        if (q3BipwRCk == 1.0f) {
                        }
                        q3BipwRCk3 = my9FFKbZi.q3BipwRCk(sb, q3BipwRCk3, miisfj8kp);
                        z = true;
                    }
                }
            }
        }
        return !z ? UexvVay3o.q3BipwRCk(q3BipwRCk3, "0.0") : q3BipwRCk3;
    }

    public final miIsFJ8kP vPSbyrYWX(boolean[] zArr, miIsFJ8kP miisfj8kp) {
        int i;
        int vPSbyrYWX = this.dIocxURUo.vPSbyrYWX();
        miIsFJ8kP miisfj8kp2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < vPSbyrYWX; i2++) {
            float q3BipwRCk = this.dIocxURUo.q3BipwRCk(i2);
            if (q3BipwRCk < 0.0f) {
                miIsFJ8kP kCA6Zs9sL = this.dIocxURUo.kCA6Zs9sL(i2);
                if ((zArr == null || !zArr[kCA6Zs9sL.kmSgne1rO]) && kCA6Zs9sL != miisfj8kp && (((i = kCA6Zs9sL.dXrmkklc8) == 3 || i == 4) && q3BipwRCk < f)) {
                    f = q3BipwRCk;
                    miisfj8kp2 = kCA6Zs9sL;
                }
            }
        }
        return miisfj8kp2;
    }

    public boolean yWvV4ePLl() {
        return this.q3BipwRCk == null && this.J4Ux7ym32 == 0.0f && this.dIocxURUo.vPSbyrYWX() == 0;
    }
}
