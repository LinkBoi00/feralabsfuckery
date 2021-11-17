package con;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class WQmeMGPEH {
    public static int iiGwOFFnr;
    public int J4Ux7ym32;
    public int tGV7Q6urW;
    public ArrayList q3BipwRCk = new ArrayList();
    public ArrayList dIocxURUo = null;
    public int kCA6Zs9sL = -1;

    public WQmeMGPEH(int i) {
        this.J4Ux7ym32 = -1;
        this.tGV7Q6urW = 0;
        int i2 = iiGwOFFnr;
        iiGwOFFnr = i2 + 1;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = i;
    }

    public void J4Ux7ym32(ArrayList arrayList) {
        int size = this.q3BipwRCk.size();
        if (this.kCA6Zs9sL != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WQmeMGPEH wQmeMGPEH = (WQmeMGPEH) arrayList.get(i);
                if (this.kCA6Zs9sL == wQmeMGPEH.J4Ux7ym32) {
                    dIocxURUo(this.tGV7Q6urW, wQmeMGPEH);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void dIocxURUo(int i, WQmeMGPEH wQmeMGPEH) {
        Iterator it = this.q3BipwRCk.iterator();
        while (it.hasNext()) {
            k007RzV1x k007rzv1x = (k007RzV1x) it.next();
            wQmeMGPEH.q3BipwRCk(k007rzv1x);
            if (i == 0) {
                k007rzv1x.oesmsHQJU = wQmeMGPEH.J4Ux7ym32;
            } else {
                k007rzv1x.YmNRDyka4 = wQmeMGPEH.J4Ux7ym32;
            }
        }
        this.kCA6Zs9sL = wQmeMGPEH.J4Ux7ym32;
    }

    public boolean q3BipwRCk(k007RzV1x k007rzv1x) {
        if (this.q3BipwRCk.contains(k007rzv1x)) {
            return false;
        }
        this.q3BipwRCk.add(k007rzv1x);
        return true;
    }

    public int tGV7Q6urW(WLlBJNJ2W wLlBJNJ2W, int i) {
        int i2;
        h7j7Zcum2 h7j7zcum2;
        if (this.q3BipwRCk.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.q3BipwRCk;
        S5aezmTgi s5aezmTgi = (S5aezmTgi) ((k007RzV1x) arrayList.get(0)).ziwPzaoF3;
        wLlBJNJ2W.RG6kpfv3v();
        s5aezmTgi.dIocxURUo(wLlBJNJ2W, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((k007RzV1x) arrayList.get(i3)).dIocxURUo(wLlBJNJ2W, false);
        }
        if (i == 0 && s5aezmTgi.aS2AFthYA > 0) {
            dnBSj5uJN.GPLPRo6go(s5aezmTgi, wLlBJNJ2W, arrayList, 0);
        }
        if (i == 1 && s5aezmTgi.tFD7BDQ71 > 0) {
            dnBSj5uJN.GPLPRo6go(s5aezmTgi, wLlBJNJ2W, arrayList, 1);
        }
        try {
            wLlBJNJ2W.ilHKhw3Yw();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dIocxURUo = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.dIocxURUo.add(new IzOUGF9X1(this, (k007RzV1x) arrayList.get(i4), wLlBJNJ2W, i));
        }
        if (i == 0) {
            i2 = wLlBJNJ2W.PSTqBLTET(s5aezmTgi.i0Zug1mVk);
            h7j7zcum2 = s5aezmTgi.V9LQMKGJe;
        } else {
            i2 = wLlBJNJ2W.PSTqBLTET(s5aezmTgi.o4LF8RkoQ);
            h7j7zcum2 = s5aezmTgi.QNqj6nIzv;
        }
        int PSTqBLTET = wLlBJNJ2W.PSTqBLTET(h7j7zcum2);
        wLlBJNJ2W.RG6kpfv3v();
        return PSTqBLTET - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.tGV7Q6urW;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.J4Ux7ym32);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.q3BipwRCk.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((k007RzV1x) it.next()).M66hQ219i;
        }
        return UexvVay3o.q3BipwRCk(sb2, " >");
    }
}
