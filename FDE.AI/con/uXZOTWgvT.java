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
    public java.lang.String toString() {
        /*
            r10 = this;
            con.miIsFJ8kP r0 = r10.q3BipwRCk
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = con.abGBwSu8x.q3BipwRCk(r0)
            con.miIsFJ8kP r1 = r10.q3BipwRCk
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = con.UexvVay3o.q3BipwRCk(r0, r1)
            float r1 = r10.J4Ux7ym32
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = con.abGBwSu8x.q3BipwRCk(r0)
            float r1 = r10.J4Ux7ym32
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            con.sTDZxriMn r5 = r10.dIocxURUo
            int r5 = r5.vPSbyrYWX()
        L_0x003b:
            if (r3 >= r5) goto L_0x009f
            con.sTDZxriMn r6 = r10.dIocxURUo
            con.miIsFJ8kP r6 = r6.kCA6Zs9sL(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x009c
        L_0x0046:
            con.sTDZxriMn r7 = r10.dIocxURUo
            float r7 = r7.q3BipwRCk(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x009c
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            java.lang.StringBuilder r0 = con.abGBwSu8x.q3BipwRCk(r0)
            java.lang.String r1 = "- "
            goto L_0x0076
        L_0x0064:
            java.lang.StringBuilder r0 = con.abGBwSu8x.q3BipwRCk(r0)
            if (r8 <= 0) goto L_0x0074
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007e
        L_0x0074:
            java.lang.String r1 = " - "
        L_0x0076:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L_0x007e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0097
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0097:
            java.lang.String r0 = con.my9FFKbZi.q3BipwRCk(r1, r0, r6)
            r1 = r4
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009f:
            if (r1 != 0) goto L_0x00a7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = con.UexvVay3o.q3BipwRCk(r0, r1)
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.uXZOTWgvT.toString():java.lang.String");
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
