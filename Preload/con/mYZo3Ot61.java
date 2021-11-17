package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public class mYZo3Ot61 extends uXZOTWgvT {
    public miIsFJ8kP[] iiGwOFFnr = new miIsFJ8kP[128];
    public miIsFJ8kP[] GPLPRo6go = new miIsFJ8kP[128];
    public int Puu3Rhg4F = 0;
    public j6XJY7rz4 yWvV4ePLl = new j6XJY7rz4(this, this);

    public mYZo3Ot61(LKa8y802S lKa8y802S) {
        super(lKa8y802S);
    }

    @Override // con.uXZOTWgvT
    public void Bhmn1KIah(WLlBJNJ2W wLlBJNJ2W, uXZOTWgvT uxzotwgvt, boolean z) {
        miIsFJ8kP miisfj8kp = uxzotwgvt.q3BipwRCk;
        if (miisfj8kp != null) {
            sTDZxriMn stdzxrimn = uxzotwgvt.dIocxURUo;
            int vPSbyrYWX = stdzxrimn.vPSbyrYWX();
            for (int i = 0; i < vPSbyrYWX; i++) {
                miIsFJ8kP kCA6Zs9sL = stdzxrimn.kCA6Zs9sL(i);
                float q3BipwRCk = stdzxrimn.q3BipwRCk(i);
                j6XJY7rz4 j6xjy7rz4 = this.yWvV4ePLl;
                j6xjy7rz4.kmSgne1rO = kCA6Zs9sL;
                boolean z2 = true;
                if (kCA6Zs9sL.CBQ5d1kRq) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        float[] fArr = ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb;
                        fArr[i2] = (miisfj8kp.Eeka1udhb[i2] * q3BipwRCk) + fArr[i2];
                        if (Math.abs(fArr[i2]) < 1.0E-4f) {
                            ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb[i2] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        ((mYZo3Ot61) j6xjy7rz4.PSTqBLTET).MzoOEjc4X((miIsFJ8kP) j6xjy7rz4.kmSgne1rO);
                    }
                    z2 = false;
                } else {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float f = miisfj8kp.Eeka1udhb[i3];
                        if (f != 0.0f) {
                            float f2 = f * q3BipwRCk;
                            if (Math.abs(f2) < 1.0E-4f) {
                                f2 = 0.0f;
                            }
                            ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb[i3] = f2;
                        } else {
                            ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb[i3] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    PSTqBLTET(kCA6Zs9sL);
                }
                this.J4Ux7ym32 = (uxzotwgvt.J4Ux7ym32 * q3BipwRCk) + this.J4Ux7ym32;
            }
            MzoOEjc4X(miisfj8kp);
        }
    }

    @Override // con.uXZOTWgvT
    public void J4Ux7ym32(miIsFJ8kP miisfj8kp) {
        this.yWvV4ePLl.kmSgne1rO = miisfj8kp;
        Arrays.fill(miisfj8kp.Eeka1udhb, 0.0f);
        miisfj8kp.Eeka1udhb[miisfj8kp.PSTqBLTET] = 1.0f;
        PSTqBLTET(miisfj8kp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.Puu3Rhg4F = r2 - 1;
        r6.CBQ5d1kRq = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.Puu3Rhg4F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L_0x001c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.iiGwOFFnr;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void MzoOEjc4X(miIsFJ8kP miisfj8kp) {
        int i = 0;
        while (i < this.Puu3Rhg4F) {
            if (this.iiGwOFFnr[i] == miisfj8kp) {
                break;
            }
            i++;
        }
    }

    public final void PSTqBLTET(miIsFJ8kP miisfj8kp) {
        int i;
        int i2 = this.Puu3Rhg4F + 1;
        miIsFJ8kP[] miisfj8kpArr = this.iiGwOFFnr;
        if (i2 > miisfj8kpArr.length) {
            miIsFJ8kP[] miisfj8kpArr2 = (miIsFJ8kP[]) Arrays.copyOf(miisfj8kpArr, miisfj8kpArr.length * 2);
            this.iiGwOFFnr = miisfj8kpArr2;
            this.GPLPRo6go = (miIsFJ8kP[]) Arrays.copyOf(miisfj8kpArr2, miisfj8kpArr2.length * 2);
        }
        miIsFJ8kP[] miisfj8kpArr3 = this.iiGwOFFnr;
        int i3 = this.Puu3Rhg4F;
        miisfj8kpArr3[i3] = miisfj8kp;
        int i4 = i3 + 1;
        this.Puu3Rhg4F = i4;
        if (i4 > 1 && miisfj8kpArr3[i4 - 1].kmSgne1rO > miisfj8kp.kmSgne1rO) {
            int i5 = 0;
            while (true) {
                i = this.Puu3Rhg4F;
                if (i5 >= i) {
                    break;
                }
                this.GPLPRo6go[i5] = this.iiGwOFFnr[i5];
                i5++;
            }
            Arrays.sort(this.GPLPRo6go, 0, i, new PSEid1kjm(this));
            for (int i6 = 0; i6 < this.Puu3Rhg4F; i6++) {
                this.iiGwOFFnr[i6] = this.GPLPRo6go[i6];
            }
        }
        miisfj8kp.CBQ5d1kRq = true;
        miisfj8kp.q3BipwRCk(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r8 < r7) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        r6 = false;
     */
    @Override // con.uXZOTWgvT
    /* Code decompiled incorrectly, please refer to instructions dump */
    public miIsFJ8kP Puu3Rhg4F(WLlBJNJ2W wLlBJNJ2W, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.Puu3Rhg4F; i2++) {
            miIsFJ8kP[] miisfj8kpArr = this.iiGwOFFnr;
            miIsFJ8kP miisfj8kp = miisfj8kpArr[i2];
            if (!zArr[miisfj8kp.kmSgne1rO]) {
                j6XJY7rz4 j6xjy7rz4 = this.yWvV4ePLl;
                j6xjy7rz4.kmSgne1rO = miisfj8kp;
                int i3 = 8;
                boolean z = true;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb[i3];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    i = i2;
                } else {
                    miIsFJ8kP miisfj8kp2 = miisfj8kpArr[i];
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        float f2 = miisfj8kp2.Eeka1udhb[i3];
                        float f3 = ((miIsFJ8kP) j6xjy7rz4.kmSgne1rO).Eeka1udhb[i3];
                        if (f3 == f2) {
                            i3--;
                        }
                    }
                    if (!z) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.iiGwOFFnr[i];
    }

    @Override // con.uXZOTWgvT
    public void tGV7Q6urW() {
        this.Puu3Rhg4F = 0;
        this.J4Ux7ym32 = 0.0f;
    }

    @Override // con.uXZOTWgvT
    public String toString() {
        String str = " goal -> (" + this.J4Ux7ym32 + ") : ";
        for (int i = 0; i < this.Puu3Rhg4F; i++) {
            this.yWvV4ePLl.kmSgne1rO = this.iiGwOFFnr[i];
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(str);
            q3BipwRCk.append(this.yWvV4ePLl);
            q3BipwRCk.append(" ");
            str = q3BipwRCk.toString();
        }
        return str;
    }

    @Override // con.uXZOTWgvT
    public boolean yWvV4ePLl() {
        return this.Puu3Rhg4F == 0;
    }
}
