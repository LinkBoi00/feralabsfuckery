package con;

import java.util.List;
/* loaded from: classes.dex */
public final class ymulT8MsV {
    public final List GPLPRo6go;
    public final int J4Ux7ym32;
    public final int dIocxURUo;
    public final boolean iiGwOFFnr;
    public final int kCA6Zs9sL;
    public final int q3BipwRCk;
    public final Object tGV7Q6urW;

    public ymulT8MsV(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = obj;
        this.dIocxURUo = i5;
        this.kCA6Zs9sL = i6;
        this.iiGwOFFnr = z;
        this.GPLPRo6go = list;
    }

    public final void q3BipwRCk(vXUgPfyfe vxugpfyfe) {
        int i;
        List list = this.GPLPRo6go;
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                aefHFwQC3 aefhfwqc3 = (aefHFwQC3) list.get(i2);
                long j = aefhfwqc3.q3BipwRCk;
                n2gATecRC n2gatecrc = aefhfwqc3.J4Ux7ym32;
                int J4Ux7ym32 = this.iiGwOFFnr ? ZtJSMDYDl.J4Ux7ym32(j) : ZtJSMDYDl.q3BipwRCk(j);
                boolean z = this.iiGwOFFnr;
                if (z) {
                    i = n2gatecrc.kmSgne1rO;
                } else {
                    i = n2gatecrc.CBQ5d1kRq;
                }
                if (J4Ux7ym32 + i > this.dIocxURUo) {
                    if ((z ? ZtJSMDYDl.J4Ux7ym32(j) : ZtJSMDYDl.q3BipwRCk(j)) < this.kCA6Zs9sL) {
                        if (this.iiGwOFFnr) {
                            vXUgPfyfe.vPSbyrYWX(vxugpfyfe, n2gatecrc, j, 0.0f, null, 6, null);
                        } else {
                            int i4 = N98iphtBX.J4Ux7ym32;
                            GQN3dSqKV gQN3dSqKV = GQN3dSqKV.qFBXIgpia;
                            if (!(vXUgPfyfe.q3BipwRCk(vxugpfyfe) == BFRsKhrQv.Ltr || vXUgPfyfe.J4Ux7ym32(vxugpfyfe) == 0)) {
                                j = dnBSj5uJN.tGV7Q6urW((vXUgPfyfe.J4Ux7ym32(vxugpfyfe) - YWiUMZOtw.tGV7Q6urW(n2gatecrc.Bhmn1KIah)) - ZtJSMDYDl.q3BipwRCk(j), ZtJSMDYDl.J4Ux7ym32(j));
                            }
                            long NyWTwPF6V = n2gatecrc.NyWTwPF6V();
                            n2gatecrc.o4LF8RkoQ(dnBSj5uJN.tGV7Q6urW(ZtJSMDYDl.q3BipwRCk(NyWTwPF6V) + ZtJSMDYDl.q3BipwRCk(j), ZtJSMDYDl.J4Ux7ym32(NyWTwPF6V) + ZtJSMDYDl.J4Ux7ym32(j)), 0.0f, gQN3dSqKV);
                        }
                    }
                }
                if (i3 <= size) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }
}
