package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class W1NiVqEgR {
    public int J4Ux7ym32;
    public final aoco2zRJj[] q3BipwRCk;

    public W1NiVqEgR() {
        aoco2zRJj[] aoco2zrjjArr = new aoco2zRJj[20];
        for (int i = 0; i < 20; i++) {
            aoco2zrjjArr[i] = null;
        }
        this.q3BipwRCk = aoco2zrjjArr;
    }

    public final long J4Ux7ym32() {
        r5d1xUf9k r5d1xuf9k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.J4Ux7ym32;
        aoco2zRJj aoco2zrjj = this.q3BipwRCk[i];
        if (aoco2zrjj != null) {
            int i2 = 0;
            aoco2zRJj aoco2zrjj2 = aoco2zrjj;
            while (true) {
                aoco2zRJj aoco2zrjj3 = this.q3BipwRCk[i];
                if (aoco2zrjj3 != null) {
                    long j = aoco2zrjj.J4Ux7ym32;
                    long j2 = aoco2zrjj3.J4Ux7ym32;
                    float f = (float) (j - j2);
                    float abs = (float) Math.abs(j2 - aoco2zrjj2.J4Ux7ym32);
                    if (f > 100.0f || abs > 40.0f) {
                        break;
                    }
                    long j3 = aoco2zrjj3.q3BipwRCk;
                    arrayList.add(Float.valueOf(bRgfgYIQX.tGV7Q6urW(j3)));
                    arrayList2.add(Float.valueOf(bRgfgYIQX.dIocxURUo(j3)));
                    arrayList3.add(Float.valueOf(-f));
                    if (i == 0) {
                        i = 20;
                    }
                    i--;
                    i2++;
                    if (i2 >= 20) {
                        aoco2zrjj2 = aoco2zrjj3;
                        break;
                    }
                    aoco2zrjj2 = aoco2zrjj3;
                } else {
                    break;
                }
            }
            if (i2 >= 3) {
                try {
                    fNOfbycJo WaUP0CF08 = gThLCaTO1.WaUP0CF08(arrayList3, arrayList, 2);
                    fNOfbycJo WaUP0CF082 = gThLCaTO1.WaUP0CF08(arrayList3, arrayList2, 2);
                    float f2 = (float) 1000;
                    r5d1xuf9k = new r5d1xUf9k(ODug2UCW1.dIocxURUo(((Number) WaUP0CF08.q3BipwRCk.get(1)).floatValue() * f2, ((Number) WaUP0CF082.q3BipwRCk.get(1)).floatValue() * f2), WaUP0CF08.J4Ux7ym32 * WaUP0CF082.J4Ux7ym32, aoco2zrjj.J4Ux7ym32 - aoco2zrjj2.J4Ux7ym32, bRgfgYIQX.kCA6Zs9sL(aoco2zrjj.q3BipwRCk, aoco2zrjj2.q3BipwRCk), null);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                r5d1xuf9k = new r5d1xUf9k(bRgfgYIQX.tGV7Q6urW, 1.0f, aoco2zrjj.J4Ux7ym32 - aoco2zrjj2.J4Ux7ym32, bRgfgYIQX.kCA6Zs9sL(aoco2zrjj.q3BipwRCk, aoco2zrjj2.q3BipwRCk), null);
            }
            long j4 = r5d1xuf9k.q3BipwRCk;
            return iOdo7IZgc.q3BipwRCk(bRgfgYIQX.tGV7Q6urW(j4), bRgfgYIQX.dIocxURUo(j4));
        }
        ksLrMHgEz kslrmhgez = r5d1xUf9k.kCA6Zs9sL;
        r5d1xuf9k = r5d1xUf9k.iiGwOFFnr;
        long j42 = r5d1xuf9k.q3BipwRCk;
        return iOdo7IZgc.q3BipwRCk(bRgfgYIQX.tGV7Q6urW(j42), bRgfgYIQX.dIocxURUo(j42));
    }

    public final void q3BipwRCk(long j, long j2) {
        int i = (this.J4Ux7ym32 + 1) % 20;
        this.J4Ux7ym32 = i;
        this.q3BipwRCk[i] = new aoco2zRJj(j2, j, null);
    }
}
