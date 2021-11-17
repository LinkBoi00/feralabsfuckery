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
    public boolean q3BipwRCk(h7j7Zcum2 h7j7zcum2, int i, int i2, boolean z) {
        boolean z2;
        if (h7j7zcum2 == null) {
            Puu3Rhg4F();
            return true;
        }
        if (!z) {
            RG2GI7LDp rG2GI7LDp = RG2GI7LDp.CENTER_Y;
            RG2GI7LDp rG2GI7LDp2 = RG2GI7LDp.RIGHT;
            RG2GI7LDp rG2GI7LDp3 = RG2GI7LDp.CENTER_X;
            RG2GI7LDp rG2GI7LDp4 = RG2GI7LDp.LEFT;
            RG2GI7LDp rG2GI7LDp5 = RG2GI7LDp.BASELINE;
            RG2GI7LDp rG2GI7LDp6 = h7j7zcum2.kCA6Zs9sL;
            RG2GI7LDp rG2GI7LDp7 = this.kCA6Zs9sL;
            if (rG2GI7LDp6 == rG2GI7LDp7) {
                if (rG2GI7LDp7 == rG2GI7LDp5) {
                    if (h7j7zcum2.dIocxURUo.AqaWJg0b4) {
                    }
                    z2 = false;
                }
                z2 = true;
            } else {
                switch (rG2GI7LDp7.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        z2 = false;
                        break;
                    case 1:
                    case 3:
                        z2 = rG2GI7LDp6 == rG2GI7LDp4 || rG2GI7LDp6 == rG2GI7LDp2;
                        if (h7j7zcum2.dIocxURUo instanceof SlV7nGkeq) {
                            if (!z2) {
                            }
                            z2 = true;
                            break;
                        }
                        break;
                    case 2:
                    case 4:
                        z2 = rG2GI7LDp6 == RG2GI7LDp.TOP || rG2GI7LDp6 == RG2GI7LDp.BOTTOM;
                        if (h7j7zcum2.dIocxURUo instanceof SlV7nGkeq) {
                            if (!z2) {
                            }
                            z2 = true;
                            break;
                        }
                        break;
                    case 5:
                        if (rG2GI7LDp6 != rG2GI7LDp4) {
                        }
                        z2 = false;
                        break;
                    case 6:
                        if (rG2GI7LDp6 != rG2GI7LDp5) {
                            if (rG2GI7LDp6 != rG2GI7LDp3) {
                            }
                        }
                        z2 = false;
                        break;
                    default:
                        throw new AssertionError(this.kCA6Zs9sL.name());
                }
            }
            if (!z2) {
                return false;
            }
        }
        this.iiGwOFFnr = h7j7zcum2;
        if (h7j7zcum2.q3BipwRCk == null) {
            h7j7zcum2.q3BipwRCk = new HashSet();
        }
        HashSet hashSet = this.iiGwOFFnr.q3BipwRCk;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.GPLPRo6go = i;
        this.Puu3Rhg4F = i2;
        return true;
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
