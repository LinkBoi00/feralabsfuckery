package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class XQv1Q2Zj2 {
    public final int GPLPRo6go;
    public final float J4Ux7ym32;
    public final ArrayList Puu3Rhg4F;
    public final float dIocxURUo;
    public final long iiGwOFFnr;
    public final float kCA6Zs9sL;
    public boolean oon79WMrY;
    public final String q3BipwRCk;
    public final float tGV7Q6urW;
    public bRxHcVoOW yWvV4ePLl;

    public XQv1Q2Zj2(String str, float f, float f2, float f3, float f4, long j, int i, int i2) {
        long j2;
        int i3;
        String str2 = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
            j2 = bO2dbmrf7.Puu3Rhg4F;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
            ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
            i3 = 5;
        } else {
            i3 = i;
        }
        this.q3BipwRCk = str2;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = f2;
        this.dIocxURUo = f3;
        this.kCA6Zs9sL = f4;
        this.iiGwOFFnr = j2;
        this.GPLPRo6go = i3;
        ArrayList arrayList = new ArrayList();
        this.Puu3Rhg4F = arrayList;
        bRxHcVoOW brxhcvoow = new bRxHcVoOW(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023);
        this.yWvV4ePLl = brxhcvoow;
        arrayList.add(brxhcvoow);
    }

    public static /* synthetic */ XQv1Q2Zj2 tGV7Q6urW(XQv1Q2Zj2 xQv1Q2Zj2, List list, int i, String str, bZmnXN812 bzmnxn812, float f, bZmnXN812 bzmnxn8122, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4) {
        int i5;
        int i6;
        int i7;
        if ((i4 & 2) != 0) {
            int i8 = fpjpWAHwn.q3BipwRCk;
            i5 = 0;
        } else {
            i5 = i;
        }
        String str2 = (i4 & 4) != 0 ? "" : str;
        bZmnXN812 bzmnxn8123 = null;
        if ((i4 & 8) == 0) {
            bzmnxn8123 = bzmnxn812;
        }
        float f8 = (i4 & 16) != 0 ? 1.0f : f;
        float f9 = (i4 & 64) != 0 ? 1.0f : f2;
        float f10 = (i4 & 128) != 0 ? 0.0f : f3;
        if ((i4 & 256) != 0) {
            int i9 = fpjpWAHwn.q3BipwRCk;
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 512) != 0) {
            int i10 = fpjpWAHwn.q3BipwRCk;
            i7 = 0;
        } else {
            i7 = i3;
        }
        xQv1Q2Zj2.J4Ux7ym32(list, i5, str2, bzmnxn8123, f8, null, f9, f10, i6, i7, (i4 & 1024) != 0 ? 4.0f : f4, (i4 & 2048) != 0 ? 0.0f : f5, (i4 & 4096) != 0 ? 1.0f : f6, (i4 & 8192) != 0 ? 0.0f : f7);
        return xQv1Q2Zj2;
    }

    public final void GPLPRo6go() {
        if (!(!this.oon79WMrY)) {
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }

    public final XQv1Q2Zj2 J4Ux7ym32(List list, int i, String str, bZmnXN812 bzmnxn812, float f, bZmnXN812 bzmnxn8122, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        GPLPRo6go();
        ArrayList arrayList = this.Puu3Rhg4F;
        ((bRxHcVoOW) arrayList.get(arrayList.size() - 1)).oon79WMrY.add(new Q7SwT3Brp(str, list, i, bzmnxn812, f, bzmnxn8122, f2, f3, i2, i3, f4, f5, f6, f7, null));
        return this;
    }

    public final ZOOhBHi6I dIocxURUo(bRxHcVoOW brxhcvoow) {
        return new ZOOhBHi6I(brxhcvoow.q3BipwRCk, brxhcvoow.J4Ux7ym32, brxhcvoow.tGV7Q6urW, brxhcvoow.dIocxURUo, brxhcvoow.kCA6Zs9sL, brxhcvoow.iiGwOFFnr, brxhcvoow.GPLPRo6go, brxhcvoow.Puu3Rhg4F, brxhcvoow.yWvV4ePLl, brxhcvoow.oon79WMrY);
    }

    public final XQv1Q2Zj2 iiGwOFFnr() {
        GPLPRo6go();
        ArrayList arrayList = this.Puu3Rhg4F;
        ArrayList arrayList2 = this.Puu3Rhg4F;
        ((bRxHcVoOW) arrayList2.get(arrayList2.size() - 1)).oon79WMrY.add(dIocxURUo((bRxHcVoOW) arrayList.remove(arrayList.size() - 1)));
        return this;
    }

    public final vdahrAJJh kCA6Zs9sL() {
        GPLPRo6go();
        while (this.Puu3Rhg4F.size() > 1) {
            iiGwOFFnr();
        }
        vdahrAJJh vdahrajjh = new vdahrAJJh(this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW, this.dIocxURUo, this.kCA6Zs9sL, dIocxURUo(this.yWvV4ePLl), this.iiGwOFFnr, this.GPLPRo6go, null);
        this.oon79WMrY = true;
        return vdahrajjh;
    }

    public final XQv1Q2Zj2 q3BipwRCk(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        GPLPRo6go();
        this.Puu3Rhg4F.add(new bRxHcVoOW(str, f, f2, f3, f4, f5, f6, f7, list, null, 512));
        return this;
    }
}
