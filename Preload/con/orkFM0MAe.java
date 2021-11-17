package con;

import android.graphics.Canvas;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class orkFM0MAe {
    public final List GPLPRo6go;
    public final int J4Ux7ym32;
    public final List Puu3Rhg4F;
    public final float dIocxURUo;
    public final int iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final m9rQR66pK q3BipwRCk;
    public final boolean tGV7Q6urW;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        r1 = true;
        r10 = r12;
        r4 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public orkFM0MAe(m9rQR66pK m9rqr66pk, int i, boolean z, float f) {
        int i2;
        float f2;
        boolean z2;
        bzmJZsHMu bzmjzshmu;
        this.q3BipwRCk = m9rqr66pk;
        this.J4Ux7ym32 = i;
        ArrayList arrayList = new ArrayList();
        List list = m9rqr66pk.kCA6Zs9sL;
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            int i4 = 0;
            float f3 = 0.0f;
            while (true) {
                int i5 = i3 + 1;
                FNRS7AIqa fNRS7AIqa = (FNRS7AIqa) list.get(i3);
                IosOyUQuh iosOyUQuh = new IosOyUQuh((AyMB2YALh) fNRS7AIqa.q3BipwRCk, this.J4Ux7ym32 - i4, z, f);
                float q3BipwRCk = iosOyUQuh.q3BipwRCk() + f3;
                int i6 = i4 + iosOyUQuh.dIocxURUo.tGV7Q6urW;
                arrayList.add(new kuiy8woQ5(iosOyUQuh, fNRS7AIqa.J4Ux7ym32, fNRS7AIqa.tGV7Q6urW, i4, i6, f3, q3BipwRCk));
                if (iosOyUQuh.dIocxURUo.q3BipwRCk) {
                    i4 = i6;
                    break;
                }
                i4 = i6;
                if (i4 == this.J4Ux7ym32 && i3 != idpM54xlp.CBQ5d1kRq(this.q3BipwRCk.kCA6Zs9sL)) {
                    break;
                } else if (i5 > size) {
                    i2 = i4;
                    f2 = q3BipwRCk;
                    z2 = false;
                    break;
                } else {
                    i3 = i5;
                    f3 = q3BipwRCk;
                    list = list;
                }
            }
        } else {
            z2 = false;
            f2 = 0.0f;
            i2 = 0;
        }
        this.kCA6Zs9sL = f2;
        this.iiGwOFFnr = i2;
        this.tGV7Q6urW = z2;
        this.Puu3Rhg4F = arrayList;
        this.dIocxURUo = f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) arrayList.get(i7);
                List list2 = kuiy8woq5.q3BipwRCk.kCA6Zs9sL;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size3 = list2.size() - 1;
                if (size3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        bzmJZsHMu bzmjzshmu2 = (bzmJZsHMu) list2.get(i9);
                        if (bzmjzshmu2 == null) {
                            bzmjzshmu = null;
                        } else {
                            bzmjzshmu = bzmjzshmu2.GPLPRo6go(ODug2UCW1.dIocxURUo(0.0f, kuiy8woq5.iiGwOFFnr));
                        }
                        arrayList3.add(bzmjzshmu);
                        if (i10 > size3) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                lXExmygLE.mUqPm6GBh(arrayList2, arrayList3);
                if (i8 > size2) {
                    break;
                }
                i7 = i8;
            }
        }
        int size4 = arrayList2.size();
        ArrayList arrayList4 = arrayList2;
        if (size4 < this.q3BipwRCk.J4Ux7ym32.size()) {
            int size5 = this.q3BipwRCk.J4Ux7ym32.size() - arrayList2.size();
            ArrayList arrayList5 = new ArrayList(size5);
            for (int i11 = 0; i11 < size5; i11++) {
                arrayList5.add(null);
            }
            arrayList4 = wkFJfVmcv.L4EwGfXiQ(arrayList2, arrayList5);
        }
        this.GPLPRo6go = arrayList4;
    }

    public final void J4Ux7ym32(SI0VpKubr sI0VpKubr, long j, lDSGv8N6A ldsgv8n6a, hrmqyyOPt hrmqyyopt) {
        sI0VpKubr.GPLPRo6go();
        List list = this.Puu3Rhg4F;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) list.get(i);
                IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
                iosOyUQuh.q3BipwRCk.GPLPRo6go.q3BipwRCk(j);
                iosOyUQuh.q3BipwRCk.GPLPRo6go.J4Ux7ym32(ldsgv8n6a);
                iosOyUQuh.q3BipwRCk.GPLPRo6go.tGV7Q6urW(hrmqyyopt);
                Canvas canvas = RvtysjeZn.q3BipwRCk;
                Canvas canvas2 = ((YSo0hTREC) sI0VpKubr).q3BipwRCk;
                if (iosOyUQuh.dIocxURUo.q3BipwRCk) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, iosOyUQuh.tGV7Q6urW, iosOyUQuh.q3BipwRCk());
                }
                iosOyUQuh.dIocxURUo.J4Ux7ym32.draw(canvas2);
                if (iosOyUQuh.dIocxURUo.q3BipwRCk) {
                    canvas2.restore();
                }
                sI0VpKubr.dXrmkklc8(0.0f, kuiy8woq5.q3BipwRCk.q3BipwRCk());
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        sI0VpKubr.J4Ux7ym32();
    }

    public final void dIocxURUo(int i) {
        boolean z = false;
        if (i >= 0 && i < this.iiGwOFFnr) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
        }
    }

    public final A128gLXzp q3BipwRCk(int i, int i2) {
        int i3;
        int i4;
        IosOyUQuh iosOyUQuh;
        int i5;
        int kCA6Zs9sL;
        if (!((i >= 0 && i <= i2) && i2 <= this.q3BipwRCk.q3BipwRCk.CBQ5d1kRq.length())) {
            throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + this.q3BipwRCk.q3BipwRCk.CBQ5d1kRq.length() + "), or start > end!").toString());
        } else if (i == i2) {
            return xP6F5SR9v.iiGwOFFnr();
        } else {
            int iiGwOFFnr = pA5wCkne4.iiGwOFFnr(this.Puu3Rhg4F, i);
            A128gLXzp iiGwOFFnr2 = xP6F5SR9v.iiGwOFFnr();
            int size = this.Puu3Rhg4F.size();
            if (iiGwOFFnr < size) {
                while (true) {
                    int i6 = iiGwOFFnr + 1;
                    kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) this.Puu3Rhg4F.get(iiGwOFFnr);
                    int i7 = kuiy8woq5.J4Ux7ym32;
                    if (i7 >= i2) {
                        break;
                    }
                    int i8 = kuiy8woq5.tGV7Q6urW;
                    if (i7 == i8) {
                        i4 = i6;
                        i3 = size;
                    } else {
                        iosOyUQuh = kuiy8woq5.q3BipwRCk;
                        int kCA6Zs9sL2 = cT9gik1zL.kCA6Zs9sL(i, i7, i8);
                        int i9 = kuiy8woq5.J4Ux7ym32;
                        i5 = kCA6Zs9sL2 - i9;
                        kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i2, i9, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32;
                        Objects.requireNonNull(iosOyUQuh);
                        if (!(i5 >= 0 && i5 <= kCA6Zs9sL) || kCA6Zs9sL > iosOyUQuh.q3BipwRCk.Puu3Rhg4F.length()) {
                            break;
                        }
                        Path path = new Path();
                        iosOyUQuh.dIocxURUo.J4Ux7ym32.getSelectionPath(i5, kCA6Zs9sL, path);
                        Q3Qxqu4re q3Qxqu4re = new Q3Qxqu4re(path);
                        long dIocxURUo = ODug2UCW1.dIocxURUo(0.0f, kuiy8woq5.iiGwOFFnr);
                        q3Qxqu4re.dIocxURUo.reset();
                        q3Qxqu4re.dIocxURUo.setTranslate(bRgfgYIQX.tGV7Q6urW(dIocxURUo), bRgfgYIQX.dIocxURUo(dIocxURUo));
                        path.transform(q3Qxqu4re.dIocxURUo);
                        i4 = i6;
                        i3 = size;
                        ODug2UCW1.GPLPRo6go(iiGwOFFnr2, q3Qxqu4re, 0, 2, null);
                    }
                    if (i4 >= i3) {
                        break;
                    }
                    size = i3;
                    iiGwOFFnr = i4;
                }
                throw new AssertionError("Start(" + i5 + ") or End(" + kCA6Zs9sL + ") is out of Range(0.." + iosOyUQuh.q3BipwRCk.Puu3Rhg4F.length() + "), or start > end!");
            }
            return iiGwOFFnr2;
        }
    }

    public final void tGV7Q6urW(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.q3BipwRCk.q3BipwRCk.CBQ5d1kRq.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("offset(", i, ") is out of bounds [0, ");
            q3BipwRCk.append(this.q3BipwRCk.q3BipwRCk.length());
            q3BipwRCk.append(']');
            throw new IllegalArgumentException(q3BipwRCk.toString().toString());
        }
    }
}
