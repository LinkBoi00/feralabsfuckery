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
    public final void MzoOEjc4X(con.miIsFJ8kP r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r5.Puu3Rhg4F
            if (r1 >= r2) goto L_0x0026
            con.miIsFJ8kP[] r2 = r5.iiGwOFFnr
            r2 = r2[r1]
            if (r2 != r6) goto L_0x0023
        L_0x000c:
            int r2 = r5.Puu3Rhg4F
            int r3 = r2 + -1
            if (r1 >= r3) goto L_0x001c
            con.miIsFJ8kP[] r2 = r5.iiGwOFFnr
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto L_0x000c
        L_0x001c:
            int r2 = r2 + -1
            r5.Puu3Rhg4F = r2
            r6.CBQ5d1kRq = r0
            return
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.mYZo3Ot61.MzoOEjc4X(con.miIsFJ8kP):void");
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
    public con.miIsFJ8kP Puu3Rhg4F(con.WLlBJNJ2W r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
        L_0x0004:
            int r3 = r10.Puu3Rhg4F
            if (r1 >= r3) goto L_0x005b
            con.miIsFJ8kP[] r3 = r10.iiGwOFFnr
            r4 = r3[r1]
            int r5 = r4.kmSgne1rO
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x0058
        L_0x0013:
            con.j6XJY7rz4 r5 = r10.yWvV4ePLl
            r5.kmSgne1rO = r4
            r4 = 8
            r6 = 1
            if (r2 != r11) goto L_0x0038
        L_0x001c:
            if (r4 < 0) goto L_0x0034
            java.lang.Object r3 = r5.kmSgne1rO
            con.miIsFJ8kP r3 = (con.miIsFJ8kP) r3
            float[] r3 = r3.Eeka1udhb
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0034:
            r6 = r0
        L_0x0035:
            if (r6 == 0) goto L_0x0058
            goto L_0x0057
        L_0x0038:
            r3 = r3[r2]
        L_0x003a:
            if (r4 < 0) goto L_0x0054
            float[] r7 = r3.Eeka1udhb
            r7 = r7[r4]
            java.lang.Object r8 = r5.kmSgne1rO
            con.miIsFJ8kP r8 = (con.miIsFJ8kP) r8
            float[] r8 = r8.Eeka1udhb
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004f
            int r4 = r4 + -1
            goto L_0x003a
        L_0x004f:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r6 = r0
        L_0x0055:
            if (r6 == 0) goto L_0x0058
        L_0x0057:
            r2 = r1
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x005b:
            if (r2 != r11) goto L_0x005f
            r11 = 0
            return r11
        L_0x005f:
            con.miIsFJ8kP[] r11 = r10.iiGwOFFnr
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: con.mYZo3Ot61.Puu3Rhg4F(con.WLlBJNJ2W, boolean[]):con.miIsFJ8kP");
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
