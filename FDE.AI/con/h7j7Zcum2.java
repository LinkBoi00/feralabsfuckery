package con;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h7j7Zcum2 {
    public int J4Ux7ym32;
    public final k007RzV1x dIocxURUo;
    public h7j7Zcum2 iiGwOFFnr;
    public final RG2GI7LDp kCA6Zs9sL;
    public boolean tGV7Q6urW;
    public miIsFJ8kP yWvV4ePLl;
    public HashSet q3BipwRCk = null;
    public int GPLPRo6go = 0;
    public int Puu3Rhg4F = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum RG2GI7LDp {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public h7j7Zcum2(k007RzV1x k007rzv1x, RG2GI7LDp rG2GI7LDp) {
        this.dIocxURUo = k007rzv1x;
        this.kCA6Zs9sL = rG2GI7LDp;
    }

    public boolean GPLPRo6go() {
        return this.iiGwOFFnr != null;
    }

    public void J4Ux7ym32(int i, ArrayList arrayList, WQmeMGPEH wQmeMGPEH) {
        HashSet hashSet = this.q3BipwRCk;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                BBVaGLNaU.oon79WMrY(((h7j7Zcum2) it.next()).dIocxURUo, i, arrayList, wQmeMGPEH);
            }
        }
    }

    public void Puu3Rhg4F() {
        HashSet hashSet;
        h7j7Zcum2 h7j7zcum2 = this.iiGwOFFnr;
        if (!(h7j7zcum2 == null || (hashSet = h7j7zcum2.q3BipwRCk) == null)) {
            hashSet.remove(this);
            if (this.iiGwOFFnr.q3BipwRCk.size() == 0) {
                this.iiGwOFFnr.q3BipwRCk = null;
            }
        }
        this.q3BipwRCk = null;
        this.iiGwOFFnr = null;
        this.GPLPRo6go = 0;
        this.Puu3Rhg4F = Integer.MIN_VALUE;
        this.tGV7Q6urW = false;
        this.J4Ux7ym32 = 0;
    }

    public int dIocxURUo() {
        h7j7Zcum2 h7j7zcum2;
        if (this.dIocxURUo.Dr7UqlxEV == 8) {
            return 0;
        }
        int i = this.Puu3Rhg4F;
        if (i == Integer.MIN_VALUE || (h7j7zcum2 = this.iiGwOFFnr) == null || h7j7zcum2.dIocxURUo.Dr7UqlxEV != 8) {
            return this.GPLPRo6go;
        }
        return i;
    }

    public boolean iiGwOFFnr() {
        HashSet hashSet = this.q3BipwRCk;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean kCA6Zs9sL() {
        h7j7Zcum2 h7j7zcum2;
        HashSet hashSet = this.q3BipwRCk;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            h7j7Zcum2 h7j7zcum22 = (h7j7Zcum2) it.next();
            switch (h7j7zcum22.kCA6Zs9sL.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    h7j7zcum2 = null;
                    break;
                case 1:
                    h7j7zcum2 = h7j7zcum22.dIocxURUo.V9LQMKGJe;
                    break;
                case 2:
                    h7j7zcum2 = h7j7zcum22.dIocxURUo.QNqj6nIzv;
                    break;
                case 3:
                    h7j7zcum2 = h7j7zcum22.dIocxURUo.i0Zug1mVk;
                    break;
                case 4:
                    h7j7zcum2 = h7j7zcum22.dIocxURUo.o4LF8RkoQ;
                    break;
                default:
                    throw new AssertionError(h7j7zcum22.kCA6Zs9sL.name());
            }
            if (h7j7zcum2.GPLPRo6go()) {
                return true;
            }
        }
        return false;
    }

    public void oon79WMrY(int i) {
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r8.dIocxURUo.AqaWJg0b4 == false) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r5 != r12) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r5 != r1) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r5 != r12) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (r5 != r2) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean q3BipwRCk(con.h7j7Zcum2 r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0007
            r8.Puu3Rhg4F()
            return r0
        L_0x0007:
            if (r12 != 0) goto L_0x0077
            con.h7j7Zcum2$RG2GI7LDp r12 = con.h7j7Zcum2.RG2GI7LDp.CENTER_Y
            con.h7j7Zcum2$RG2GI7LDp r1 = con.h7j7Zcum2.RG2GI7LDp.RIGHT
            con.h7j7Zcum2$RG2GI7LDp r2 = con.h7j7Zcum2.RG2GI7LDp.CENTER_X
            con.h7j7Zcum2$RG2GI7LDp r3 = con.h7j7Zcum2.RG2GI7LDp.LEFT
            con.h7j7Zcum2$RG2GI7LDp r4 = con.h7j7Zcum2.RG2GI7LDp.BASELINE
            con.h7j7Zcum2$RG2GI7LDp r5 = r9.kCA6Zs9sL
            con.h7j7Zcum2$RG2GI7LDp r6 = r8.kCA6Zs9sL
            r7 = 0
            if (r5 != r6) goto L_0x0029
            if (r6 != r4) goto L_0x0071
            con.k007RzV1x r12 = r9.dIocxURUo
            boolean r12 = r12.AqaWJg0b4
            if (r12 == 0) goto L_0x0073
            con.k007RzV1x r12 = r8.dIocxURUo
            boolean r12 = r12.AqaWJg0b4
            if (r12 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0029:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x0073;
                case 1: goto L_0x005f;
                case 2: goto L_0x0048;
                case 3: goto L_0x005f;
                case 4: goto L_0x0048;
                case 5: goto L_0x0043;
                case 6: goto L_0x003c;
                case 7: goto L_0x0073;
                case 8: goto L_0x0073;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            con.h7j7Zcum2$RG2GI7LDp r10 = r8.kCA6Zs9sL
            java.lang.String r10 = r10.name()
            r9.<init>(r10)
            throw r9
        L_0x003c:
            if (r5 == r4) goto L_0x0073
            if (r5 == r2) goto L_0x0073
            if (r5 == r12) goto L_0x0073
            goto L_0x0071
        L_0x0043:
            if (r5 == r3) goto L_0x0073
            if (r5 != r1) goto L_0x0071
            goto L_0x0073
        L_0x0048:
            con.h7j7Zcum2$RG2GI7LDp r1 = con.h7j7Zcum2.RG2GI7LDp.TOP
            if (r5 == r1) goto L_0x0053
            con.h7j7Zcum2$RG2GI7LDp r1 = con.h7j7Zcum2.RG2GI7LDp.BOTTOM
            if (r5 != r1) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r1 = r7
            goto L_0x0054
        L_0x0053:
            r1 = r0
        L_0x0054:
            con.k007RzV1x r2 = r9.dIocxURUo
            boolean r2 = r2 instanceof con.SlV7nGkeq
            if (r2 == 0) goto L_0x0074
            if (r1 != 0) goto L_0x0071
            if (r5 != r12) goto L_0x0073
            goto L_0x0071
        L_0x005f:
            if (r5 == r3) goto L_0x0066
            if (r5 != r1) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = r7
            goto L_0x0067
        L_0x0066:
            r1 = r0
        L_0x0067:
            con.k007RzV1x r12 = r9.dIocxURUo
            boolean r12 = r12 instanceof con.SlV7nGkeq
            if (r12 == 0) goto L_0x0074
            if (r1 != 0) goto L_0x0071
            if (r5 != r2) goto L_0x0073
        L_0x0071:
            r1 = r0
            goto L_0x0074
        L_0x0073:
            r1 = r7
        L_0x0074:
            if (r1 != 0) goto L_0x0077
            return r7
        L_0x0077:
            r8.iiGwOFFnr = r9
            java.util.HashSet r12 = r9.q3BipwRCk
            if (r12 != 0) goto L_0x0084
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r9.q3BipwRCk = r12
        L_0x0084:
            con.h7j7Zcum2 r9 = r8.iiGwOFFnr
            java.util.HashSet r9 = r9.q3BipwRCk
            if (r9 == 0) goto L_0x008d
            r9.add(r8)
        L_0x008d:
            r8.GPLPRo6go = r10
            r8.Puu3Rhg4F = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.h7j7Zcum2.q3BipwRCk(con.h7j7Zcum2, int, int, boolean):boolean");
    }

    public int tGV7Q6urW() {
        if (!this.tGV7Q6urW) {
            return 0;
        }
        return this.J4Ux7ym32;
    }

    public String toString() {
        return this.dIocxURUo.M66hQ219i + ":" + this.kCA6Zs9sL.toString();
    }

    public void yWvV4ePLl() {
        miIsFJ8kP miisfj8kp = this.yWvV4ePLl;
        if (miisfj8kp == null) {
            this.yWvV4ePLl = new miIsFJ8kP(1);
        } else {
            miisfj8kp.tGV7Q6urW();
        }
    }
}
