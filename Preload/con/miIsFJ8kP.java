package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public class miIsFJ8kP implements Comparable {
    public static int WaUP0CF08;
    public boolean CBQ5d1kRq;
    public float MzoOEjc4X;
    public int dXrmkklc8;
    public int kmSgne1rO = -1;
    public int Bhmn1KIah = -1;
    public int PSTqBLTET = 0;
    public boolean ilHKhw3Yw = false;
    public float[] qVUwofr5s = new float[9];
    public float[] Eeka1udhb = new float[9];
    public uXZOTWgvT[] RG6kpfv3v = new uXZOTWgvT[16];
    public int ixWaw2akD = 0;
    public int sk5s77z6Q = 0;

    public miIsFJ8kP(int i) {
        this.dXrmkklc8 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L_0x0019;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.RG6kpfv3v;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.ixWaw2akD--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void J4Ux7ym32(uXZOTWgvT uxzotwgvt) {
        int i = this.ixWaw2akD;
        int i2 = 0;
        while (i2 < i) {
            if (this.RG6kpfv3v[i2] == uxzotwgvt) {
                break;
            }
            i2++;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.kmSgne1rO - ((miIsFJ8kP) obj).kmSgne1rO;
    }

    public void dIocxURUo(WLlBJNJ2W wLlBJNJ2W, float f) {
        this.MzoOEjc4X = f;
        this.ilHKhw3Yw = true;
        int i = this.ixWaw2akD;
        this.Bhmn1KIah = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.RG6kpfv3v[i2].kmSgne1rO(wLlBJNJ2W, this, false);
        }
        this.ixWaw2akD = 0;
    }

    public final void kCA6Zs9sL(WLlBJNJ2W wLlBJNJ2W, uXZOTWgvT uxzotwgvt) {
        int i = this.ixWaw2akD;
        for (int i2 = 0; i2 < i; i2++) {
            this.RG6kpfv3v[i2].Bhmn1KIah(wLlBJNJ2W, uxzotwgvt, false);
        }
        this.ixWaw2akD = 0;
    }

    public final void q3BipwRCk(uXZOTWgvT uxzotwgvt) {
        int i = 0;
        while (true) {
            int i2 = this.ixWaw2akD;
            if (i >= i2) {
                uXZOTWgvT[] uxzotwgvtArr = this.RG6kpfv3v;
                if (i2 >= uxzotwgvtArr.length) {
                    this.RG6kpfv3v = (uXZOTWgvT[]) Arrays.copyOf(uxzotwgvtArr, uxzotwgvtArr.length * 2);
                }
                uXZOTWgvT[] uxzotwgvtArr2 = this.RG6kpfv3v;
                int i3 = this.ixWaw2akD;
                uxzotwgvtArr2[i3] = uxzotwgvt;
                this.ixWaw2akD = i3 + 1;
                return;
            } else if (this.RG6kpfv3v[i] != uxzotwgvt) {
                i++;
            } else {
                return;
            }
        }
    }

    public void tGV7Q6urW() {
        this.dXrmkklc8 = 5;
        this.PSTqBLTET = 0;
        this.kmSgne1rO = -1;
        this.Bhmn1KIah = -1;
        this.MzoOEjc4X = 0.0f;
        this.ilHKhw3Yw = false;
        int i = this.ixWaw2akD;
        for (int i2 = 0; i2 < i; i2++) {
            this.RG6kpfv3v[i2] = null;
        }
        this.ixWaw2akD = 0;
        this.sk5s77z6Q = 0;
        this.CBQ5d1kRq = false;
        Arrays.fill(this.Eeka1udhb, 0.0f);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("");
        q3BipwRCk.append(this.kmSgne1rO);
        return q3BipwRCk.toString();
    }
}
