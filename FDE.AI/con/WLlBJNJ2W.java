package con;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class WLlBJNJ2W {
    public static boolean MzoOEjc4X;
    public static int ilHKhw3Yw;
    public static long qVUwofr5s;
    public final LKa8y802S CBQ5d1kRq;
    public uXZOTWgvT PSTqBLTET;
    public uXZOTWgvT[] iiGwOFFnr;
    public uXZOTWgvT tGV7Q6urW;
    public boolean q3BipwRCk = false;
    public int J4Ux7ym32 = 0;
    public int dIocxURUo = 32;
    public int kCA6Zs9sL = 32;
    public boolean GPLPRo6go = false;
    public boolean[] Puu3Rhg4F = new boolean[32];
    public int yWvV4ePLl = 1;
    public int oon79WMrY = 0;
    public int vPSbyrYWX = 32;
    public miIsFJ8kP[] kmSgne1rO = new miIsFJ8kP[ilHKhw3Yw];
    public int Bhmn1KIah = 0;

    public WLlBJNJ2W() {
        this.iiGwOFFnr = null;
        this.iiGwOFFnr = new uXZOTWgvT[32];
        dXrmkklc8();
        LKa8y802S lKa8y802S = new LKa8y802S(4);
        this.CBQ5d1kRq = lKa8y802S;
        this.tGV7Q6urW = new mYZo3Ot61(lKa8y802S);
        this.PSTqBLTET = new uXZOTWgvT(lKa8y802S);
    }

    public miIsFJ8kP Bhmn1KIah() {
        if (this.yWvV4ePLl + 1 >= this.kCA6Zs9sL) {
            MzoOEjc4X();
        }
        miIsFJ8kP q3BipwRCk = q3BipwRCk(3, null);
        int i = this.J4Ux7ym32 + 1;
        this.J4Ux7ym32 = i;
        this.yWvV4ePLl++;
        q3BipwRCk.kmSgne1rO = i;
        ((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i] = q3BipwRCk;
        return q3BipwRCk;
    }

    public miIsFJ8kP CBQ5d1kRq(Object obj) {
        miIsFJ8kP miisfj8kp = null;
        if (obj == null) {
            return null;
        }
        if (this.yWvV4ePLl + 1 >= this.kCA6Zs9sL) {
            MzoOEjc4X();
        }
        if (obj instanceof h7j7Zcum2) {
            h7j7Zcum2 h7j7zcum2 = (h7j7Zcum2) obj;
            miisfj8kp = h7j7zcum2.yWvV4ePLl;
            if (miisfj8kp == null) {
                h7j7zcum2.yWvV4ePLl();
                miisfj8kp = h7j7zcum2.yWvV4ePLl;
            }
            int i = miisfj8kp.kmSgne1rO;
            if (i == -1 || i > this.J4Ux7ym32 || ((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i] == null) {
                if (i != -1) {
                    miisfj8kp.tGV7Q6urW();
                }
                int i2 = this.J4Ux7ym32 + 1;
                this.J4Ux7ym32 = i2;
                this.yWvV4ePLl++;
                miisfj8kp.kmSgne1rO = i2;
                miisfj8kp.dXrmkklc8 = 1;
                ((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i2] = miisfj8kp;
            }
        }
        return miisfj8kp;
    }

    public final int Eeka1udhb(uXZOTWgvT uxzotwgvt) {
        for (int i = 0; i < this.yWvV4ePLl; i++) {
            this.Puu3Rhg4F[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.yWvV4ePLl * 2) {
                return i2;
            }
            miIsFJ8kP miisfj8kp = uxzotwgvt.q3BipwRCk;
            if (miisfj8kp != null) {
                this.Puu3Rhg4F[miisfj8kp.kmSgne1rO] = true;
            }
            miIsFJ8kP Puu3Rhg4F = uxzotwgvt.Puu3Rhg4F(this, this.Puu3Rhg4F);
            if (Puu3Rhg4F != null) {
                boolean[] zArr = this.Puu3Rhg4F;
                int i3 = Puu3Rhg4F.kmSgne1rO;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (Puu3Rhg4F != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.oon79WMrY; i5++) {
                    uXZOTWgvT uxzotwgvt2 = this.iiGwOFFnr[i5];
                    if (uxzotwgvt2.q3BipwRCk.dXrmkklc8 != 1 && !uxzotwgvt2.kCA6Zs9sL && uxzotwgvt2.dIocxURUo.tGV7Q6urW(Puu3Rhg4F)) {
                        float yWvV4ePLl = uxzotwgvt2.dIocxURUo.yWvV4ePLl(Puu3Rhg4F);
                        if (yWvV4ePLl < 0.0f) {
                            float f2 = (-uxzotwgvt2.J4Ux7ym32) / yWvV4ePLl;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    uXZOTWgvT uxzotwgvt3 = this.iiGwOFFnr[i4];
                    uxzotwgvt3.q3BipwRCk.Bhmn1KIah = -1;
                    uxzotwgvt3.CBQ5d1kRq(Puu3Rhg4F);
                    miIsFJ8kP miisfj8kp2 = uxzotwgvt3.q3BipwRCk;
                    miisfj8kp2.Bhmn1KIah = i4;
                    miisfj8kp2.kCA6Zs9sL(this, uxzotwgvt3);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    public void GPLPRo6go(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, int i, int i2) {
        uXZOTWgvT kmSgne1rO = kmSgne1rO();
        miIsFJ8kP Bhmn1KIah = Bhmn1KIah();
        Bhmn1KIah.PSTqBLTET = 0;
        kmSgne1rO.iiGwOFFnr(miisfj8kp, miisfj8kp2, Bhmn1KIah, i);
        if (i2 != 8) {
            kmSgne1rO.dIocxURUo.J4Ux7ym32(vPSbyrYWX(i2, null), (float) ((int) (kmSgne1rO.dIocxURUo.yWvV4ePLl(Bhmn1KIah) * -1.0f)));
        }
        tGV7Q6urW(kmSgne1rO);
    }

    public void J4Ux7ym32(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, int i, float f, miIsFJ8kP miisfj8kp3, miIsFJ8kP miisfj8kp4, int i2, int i3) {
        float f2;
        int i4;
        uXZOTWgvT kmSgne1rO = kmSgne1rO();
        if (miisfj8kp2 == miisfj8kp3) {
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, 1.0f);
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp4, 1.0f);
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, -2.0f);
        } else {
            if (f == 0.5f) {
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, 1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp3, -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = (float) i4;
                }
            } else if (f <= 0.0f) {
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp4, -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp3, 1.0f);
                i4 = -i2;
                f2 = (float) i4;
            } else {
                float f3 = 1.0f - f;
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, f3 * 1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, f3 * -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp3, -1.0f * f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    kmSgne1rO.J4Ux7ym32 = (((float) i2) * f) + (((float) (-i)) * f3);
                }
            }
            kmSgne1rO.J4Ux7ym32 = f2;
        }
        if (i3 != 8) {
            kmSgne1rO.q3BipwRCk(this, i3);
        }
        tGV7Q6urW(kmSgne1rO);
    }

    public final void MzoOEjc4X() {
        int i = this.dIocxURUo * 2;
        this.dIocxURUo = i;
        this.iiGwOFFnr = (uXZOTWgvT[]) Arrays.copyOf(this.iiGwOFFnr, i);
        LKa8y802S lKa8y802S = this.CBQ5d1kRq;
        lKa8y802S.dIocxURUo = (miIsFJ8kP[]) Arrays.copyOf((miIsFJ8kP[]) lKa8y802S.dIocxURUo, this.dIocxURUo);
        int i2 = this.dIocxURUo;
        this.Puu3Rhg4F = new boolean[i2];
        this.kCA6Zs9sL = i2;
        this.vPSbyrYWX = i2;
    }

    public int PSTqBLTET(Object obj) {
        miIsFJ8kP miisfj8kp = ((h7j7Zcum2) obj).yWvV4ePLl;
        if (miisfj8kp != null) {
            return (int) (miisfj8kp.MzoOEjc4X + 0.5f);
        }
        return 0;
    }

    public void Puu3Rhg4F(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, miIsFJ8kP miisfj8kp3, miIsFJ8kP miisfj8kp4, float f, int i) {
        uXZOTWgvT kmSgne1rO = kmSgne1rO();
        kmSgne1rO.dIocxURUo(miisfj8kp, miisfj8kp2, miisfj8kp3, miisfj8kp4, f);
        if (i != 8) {
            kmSgne1rO.q3BipwRCk(this, i);
        }
        tGV7Q6urW(kmSgne1rO);
    }

    public void RG6kpfv3v() {
        LKa8y802S lKa8y802S;
        int i = 0;
        while (true) {
            lKa8y802S = this.CBQ5d1kRq;
            Object obj = lKa8y802S.dIocxURUo;
            if (i >= ((miIsFJ8kP[]) obj).length) {
                break;
            }
            miIsFJ8kP miisfj8kp = ((miIsFJ8kP[]) obj)[i];
            if (miisfj8kp != null) {
                miisfj8kp.tGV7Q6urW();
            }
            i++;
        }
        nOPp9PCGN nopp9pcgn = (nOPp9PCGN) lKa8y802S.tGV7Q6urW;
        miIsFJ8kP[] miisfj8kpArr = this.kmSgne1rO;
        int i2 = this.Bhmn1KIah;
        Objects.requireNonNull(nopp9pcgn);
        if (i2 > miisfj8kpArr.length) {
            i2 = miisfj8kpArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            miIsFJ8kP miisfj8kp2 = miisfj8kpArr[i3];
            int i4 = nopp9pcgn.tGV7Q6urW;
            Object[] objArr = nopp9pcgn.J4Ux7ym32;
            if (i4 < objArr.length) {
                objArr[i4] = miisfj8kp2;
                nopp9pcgn.tGV7Q6urW = i4 + 1;
            }
        }
        this.Bhmn1KIah = 0;
        Arrays.fill((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo, (Object) null);
        this.J4Ux7ym32 = 0;
        this.tGV7Q6urW.tGV7Q6urW();
        this.yWvV4ePLl = 1;
        for (int i5 = 0; i5 < this.oon79WMrY; i5++) {
            uXZOTWgvT[] uxzotwgvtArr = this.iiGwOFFnr;
            if (uxzotwgvtArr[i5] != null) {
                Objects.requireNonNull(uxzotwgvtArr[i5]);
            }
        }
        dXrmkklc8();
        this.oon79WMrY = 0;
        this.PSTqBLTET = new uXZOTWgvT(this.CBQ5d1kRq);
    }

    public uXZOTWgvT dIocxURUo(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, int i, int i2) {
        if (i2 == 8 && miisfj8kp2.ilHKhw3Yw && miisfj8kp.Bhmn1KIah == -1) {
            miisfj8kp.dIocxURUo(this, miisfj8kp2.MzoOEjc4X + ((float) i));
            return null;
        }
        uXZOTWgvT kmSgne1rO = kmSgne1rO();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            kmSgne1rO.J4Ux7ym32 = (float) i;
        }
        if (!z) {
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, -1.0f);
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, 1.0f);
        } else {
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp, 1.0f);
            kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp2, -1.0f);
        }
        if (i2 != 8) {
            kmSgne1rO.q3BipwRCk(this, i2);
        }
        tGV7Q6urW(kmSgne1rO);
        return kmSgne1rO;
    }

    public final void dXrmkklc8() {
        for (int i = 0; i < this.oon79WMrY; i++) {
            uXZOTWgvT uxzotwgvt = this.iiGwOFFnr[i];
            if (uxzotwgvt != null) {
                ((nOPp9PCGN) this.CBQ5d1kRq.J4Ux7ym32).tGV7Q6urW(uxzotwgvt);
            }
            this.iiGwOFFnr[i] = null;
        }
    }

    public void iiGwOFFnr(miIsFJ8kP miisfj8kp, miIsFJ8kP miisfj8kp2, int i, int i2) {
        uXZOTWgvT kmSgne1rO = kmSgne1rO();
        miIsFJ8kP Bhmn1KIah = Bhmn1KIah();
        Bhmn1KIah.PSTqBLTET = 0;
        kmSgne1rO.kCA6Zs9sL(miisfj8kp, miisfj8kp2, Bhmn1KIah, i);
        if (i2 != 8) {
            kmSgne1rO.dIocxURUo.J4Ux7ym32(vPSbyrYWX(i2, null), (float) ((int) (kmSgne1rO.dIocxURUo.yWvV4ePLl(Bhmn1KIah) * -1.0f)));
        }
        tGV7Q6urW(kmSgne1rO);
    }

    public void ilHKhw3Yw() {
        if (this.tGV7Q6urW.yWvV4ePLl()) {
            oon79WMrY();
            return;
        }
        if (this.GPLPRo6go) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.oon79WMrY) {
                    z = true;
                    break;
                } else if (!this.iiGwOFFnr[i].kCA6Zs9sL) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                oon79WMrY();
                return;
            }
        }
        qVUwofr5s(this.tGV7Q6urW);
    }

    public void kCA6Zs9sL(miIsFJ8kP miisfj8kp, int i) {
        uXZOTWgvT uxzotwgvt;
        sTDZxriMn stdzxrimn;
        float f;
        int i2 = miisfj8kp.Bhmn1KIah;
        if (i2 == -1) {
            miisfj8kp.dIocxURUo(this, (float) i);
            for (int i3 = 0; i3 < this.J4Ux7ym32 + 1; i3++) {
                miIsFJ8kP miisfj8kp2 = ((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i3];
            }
            return;
        }
        if (i2 != -1) {
            uXZOTWgvT uxzotwgvt2 = this.iiGwOFFnr[i2];
            if (!uxzotwgvt2.kCA6Zs9sL) {
                if (uxzotwgvt2.dIocxURUo.vPSbyrYWX() == 0) {
                    uxzotwgvt2.kCA6Zs9sL = true;
                } else {
                    uxzotwgvt = kmSgne1rO();
                    if (i < 0) {
                        uxzotwgvt.J4Ux7ym32 = (float) (i * -1);
                        stdzxrimn = uxzotwgvt.dIocxURUo;
                        f = 1.0f;
                    } else {
                        uxzotwgvt.J4Ux7ym32 = (float) i;
                        stdzxrimn = uxzotwgvt.dIocxURUo;
                        f = -1.0f;
                    }
                    stdzxrimn.J4Ux7ym32(miisfj8kp, f);
                }
            }
            uxzotwgvt2.J4Ux7ym32 = (float) i;
            return;
        }
        uxzotwgvt = kmSgne1rO();
        uxzotwgvt.q3BipwRCk = miisfj8kp;
        float f2 = (float) i;
        miisfj8kp.MzoOEjc4X = f2;
        uxzotwgvt.J4Ux7ym32 = f2;
        uxzotwgvt.kCA6Zs9sL = true;
        tGV7Q6urW(uxzotwgvt);
    }

    public uXZOTWgvT kmSgne1rO() {
        uXZOTWgvT uxzotwgvt = (uXZOTWgvT) ((nOPp9PCGN) this.CBQ5d1kRq.J4Ux7ym32).q3BipwRCk();
        if (uxzotwgvt == null) {
            uxzotwgvt = new uXZOTWgvT(this.CBQ5d1kRq);
            qVUwofr5s++;
        } else {
            uxzotwgvt.q3BipwRCk = null;
            uxzotwgvt.dIocxURUo.clear();
            uxzotwgvt.J4Ux7ym32 = 0.0f;
            uxzotwgvt.kCA6Zs9sL = false;
        }
        miIsFJ8kP.WaUP0CF08++;
        return uxzotwgvt;
    }

    public final void oon79WMrY() {
        for (int i = 0; i < this.oon79WMrY; i++) {
            uXZOTWgvT uxzotwgvt = this.iiGwOFFnr[i];
            uxzotwgvt.q3BipwRCk.MzoOEjc4X = uxzotwgvt.J4Ux7ym32;
        }
    }

    public final miIsFJ8kP q3BipwRCk(int i, String str) {
        miIsFJ8kP miisfj8kp = (miIsFJ8kP) ((nOPp9PCGN) this.CBQ5d1kRq.tGV7Q6urW).q3BipwRCk();
        if (miisfj8kp == null) {
            miisfj8kp = new miIsFJ8kP(i);
        } else {
            miisfj8kp.tGV7Q6urW();
        }
        miisfj8kp.dXrmkklc8 = i;
        int i2 = this.Bhmn1KIah;
        int i3 = ilHKhw3Yw;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            ilHKhw3Yw = i4;
            this.kmSgne1rO = (miIsFJ8kP[]) Arrays.copyOf(this.kmSgne1rO, i4);
        }
        miIsFJ8kP[] miisfj8kpArr = this.kmSgne1rO;
        int i5 = this.Bhmn1KIah;
        this.Bhmn1KIah = i5 + 1;
        miisfj8kpArr[i5] = miisfj8kp;
        return miisfj8kp;
    }

    public void qVUwofr5s(uXZOTWgvT uxzotwgvt) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.oon79WMrY) {
                z = false;
                break;
            }
            uXZOTWgvT[] uxzotwgvtArr = this.iiGwOFFnr;
            if (uxzotwgvtArr[i2].q3BipwRCk.dXrmkklc8 != 1 && uxzotwgvtArr[i2].J4Ux7ym32 < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.oon79WMrY) {
                    uXZOTWgvT uxzotwgvt2 = this.iiGwOFFnr[i6];
                    if (uxzotwgvt2.q3BipwRCk.dXrmkklc8 != i && !uxzotwgvt2.kCA6Zs9sL && uxzotwgvt2.J4Ux7ym32 < f) {
                        int vPSbyrYWX = uxzotwgvt2.dIocxURUo.vPSbyrYWX();
                        int i8 = 0;
                        while (i8 < vPSbyrYWX) {
                            miIsFJ8kP kCA6Zs9sL = uxzotwgvt2.dIocxURUo.kCA6Zs9sL(i8);
                            float yWvV4ePLl = uxzotwgvt2.dIocxURUo.yWvV4ePLl(kCA6Zs9sL);
                            if (yWvV4ePLl > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = kCA6Zs9sL.qVUwofr5s[i9] / yWvV4ePLl;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = kCA6Zs9sL.kmSgne1rO;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    uXZOTWgvT uxzotwgvt3 = this.iiGwOFFnr[i4];
                    uxzotwgvt3.q3BipwRCk.Bhmn1KIah = -1;
                    uxzotwgvt3.CBQ5d1kRq(((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i5]);
                    miIsFJ8kP miisfj8kp = uxzotwgvt3.q3BipwRCk;
                    miisfj8kp.Bhmn1KIah = i4;
                    miisfj8kp.kCA6Zs9sL(this, uxzotwgvt3);
                } else {
                    z2 = true;
                }
                if (i3 > this.yWvV4ePLl / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        Eeka1udhb(uxzotwgvt);
        oon79WMrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void tGV7Q6urW(con.uXZOTWgvT r17) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WLlBJNJ2W.tGV7Q6urW(con.uXZOTWgvT):void");
    }

    public miIsFJ8kP vPSbyrYWX(int i, String str) {
        if (this.yWvV4ePLl + 1 >= this.kCA6Zs9sL) {
            MzoOEjc4X();
        }
        miIsFJ8kP q3BipwRCk = q3BipwRCk(4, str);
        int i2 = this.J4Ux7ym32 + 1;
        this.J4Ux7ym32 = i2;
        this.yWvV4ePLl++;
        q3BipwRCk.kmSgne1rO = i2;
        q3BipwRCk.PSTqBLTET = i;
        ((miIsFJ8kP[]) this.CBQ5d1kRq.dIocxURUo)[i2] = q3BipwRCk;
        this.tGV7Q6urW.J4Ux7ym32(q3BipwRCk);
        return q3BipwRCk;
    }

    public final void yWvV4ePLl(uXZOTWgvT uxzotwgvt) {
        int i;
        if (uxzotwgvt.kCA6Zs9sL) {
            uxzotwgvt.q3BipwRCk.dIocxURUo(this, uxzotwgvt.J4Ux7ym32);
        } else {
            uXZOTWgvT[] uxzotwgvtArr = this.iiGwOFFnr;
            int i2 = this.oon79WMrY;
            uxzotwgvtArr[i2] = uxzotwgvt;
            miIsFJ8kP miisfj8kp = uxzotwgvt.q3BipwRCk;
            miisfj8kp.Bhmn1KIah = i2;
            this.oon79WMrY = i2 + 1;
            miisfj8kp.kCA6Zs9sL(this, uxzotwgvt);
        }
        if (this.q3BipwRCk) {
            int i3 = 0;
            while (i3 < this.oon79WMrY) {
                if (this.iiGwOFFnr[i3] == null) {
                    System.out.println("WTF");
                }
                uXZOTWgvT[] uxzotwgvtArr2 = this.iiGwOFFnr;
                if (uxzotwgvtArr2[i3] != null && uxzotwgvtArr2[i3].kCA6Zs9sL) {
                    uXZOTWgvT uxzotwgvt2 = uxzotwgvtArr2[i3];
                    uxzotwgvt2.q3BipwRCk.dIocxURUo(this, uxzotwgvt2.J4Ux7ym32);
                    ((nOPp9PCGN) this.CBQ5d1kRq.J4Ux7ym32).tGV7Q6urW(uxzotwgvt2);
                    this.iiGwOFFnr[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.oon79WMrY;
                        if (i4 >= i) {
                            break;
                        }
                        uXZOTWgvT[] uxzotwgvtArr3 = this.iiGwOFFnr;
                        int i6 = i4 - 1;
                        uxzotwgvtArr3[i6] = uxzotwgvtArr3[i4];
                        if (uxzotwgvtArr3[i6].q3BipwRCk.Bhmn1KIah == i4) {
                            uxzotwgvtArr3[i6].q3BipwRCk.Bhmn1KIah = i6;
                        }
                        i4++;
                        i5 = i4;
                    }
                    if (i5 < i) {
                        this.iiGwOFFnr[i5] = null;
                    }
                    this.oon79WMrY = i - 1;
                    i3--;
                }
                i3++;
            }
            this.q3BipwRCk = false;
        }
    }
}
