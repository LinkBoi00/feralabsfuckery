package con;

import con.k007RzV1x;
/* loaded from: classes.dex */
public class lJSYWcEGq {
    public int J4Ux7ym32;
    public int dIocxURUo;
    public boolean iiGwOFFnr;
    public Object kCA6Zs9sL;
    public int q3BipwRCk;
    public float tGV7Q6urW;
    public static final Object GPLPRo6go = new Object();
    public static final Object Puu3Rhg4F = new Object();
    public static final Object yWvV4ePLl = new Object();
    public static final Object oon79WMrY = new Object();
    public static final Object vPSbyrYWX = new Object();

    public lJSYWcEGq() {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = Integer.MAX_VALUE;
        this.tGV7Q6urW = 1.0f;
        this.dIocxURUo = 0;
        this.kCA6Zs9sL = Puu3Rhg4F;
        this.iiGwOFFnr = false;
    }

    public lJSYWcEGq(Object obj) {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = Integer.MAX_VALUE;
        this.tGV7Q6urW = 1.0f;
        this.dIocxURUo = 0;
        this.kCA6Zs9sL = Puu3Rhg4F;
        this.iiGwOFFnr = false;
        this.kCA6Zs9sL = obj;
    }

    public static lJSYWcEGq q3BipwRCk(Object obj) {
        lJSYWcEGq ljsywcegq = new lJSYWcEGq(GPLPRo6go);
        ljsywcegq.kCA6Zs9sL = obj;
        if (obj instanceof Integer) {
            ljsywcegq.dIocxURUo = ((Integer) obj).intValue();
            ljsywcegq.kCA6Zs9sL = null;
        }
        return ljsywcegq;
    }

    public void J4Ux7ym32(k007RzV1x k007rzv1x, int i) {
        k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.FIXED;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3 = k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp4 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        int i2 = 2;
        if (i == 0) {
            if (this.iiGwOFFnr) {
                k007rzv1x.zHl31GGXU[0] = rG2GI7LDp4;
                Object obj = this.kCA6Zs9sL;
                if (obj == Puu3Rhg4F) {
                    i2 = 1;
                } else if (obj != vPSbyrYWX) {
                    i2 = 0;
                }
                k007rzv1x.QNqj6nIzv(i2, this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW);
                return;
            }
            int i3 = this.q3BipwRCk;
            if (i3 > 0) {
                k007rzv1x.EBQXiIPmm(i3);
            }
            int i4 = this.J4Ux7ym32;
            if (i4 < Integer.MAX_VALUE) {
                k007rzv1x.qFBXIgpia[0] = i4;
            }
            Object obj2 = this.kCA6Zs9sL;
            if (obj2 == Puu3Rhg4F) {
                k007rzv1x.zHl31GGXU[0] = rG2GI7LDp3;
            } else if (obj2 == oon79WMrY) {
                k007rzv1x.zHl31GGXU[0] = rG2GI7LDp2;
            } else if (obj2 == null) {
                k007rzv1x.zHl31GGXU[0] = rG2GI7LDp;
                k007rzv1x.j22ftfeNI(this.dIocxURUo);
            }
        } else if (this.iiGwOFFnr) {
            k007rzv1x.zHl31GGXU[1] = rG2GI7LDp4;
            Object obj3 = this.kCA6Zs9sL;
            if (obj3 == Puu3Rhg4F) {
                i2 = 1;
            } else if (obj3 != vPSbyrYWX) {
                i2 = 0;
            }
            k007rzv1x.juJ6pnCpu(i2, this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW);
        } else {
            int i5 = this.q3BipwRCk;
            if (i5 > 0) {
                k007rzv1x.igRQEZxnW(i5);
            }
            int i6 = this.J4Ux7ym32;
            if (i6 < Integer.MAX_VALUE) {
                k007rzv1x.qFBXIgpia[1] = i6;
            }
            Object obj4 = this.kCA6Zs9sL;
            if (obj4 == Puu3Rhg4F) {
                k007rzv1x.zHl31GGXU[1] = rG2GI7LDp3;
            } else if (obj4 == oon79WMrY) {
                k007rzv1x.zHl31GGXU[1] = rG2GI7LDp2;
            } else if (obj4 == null) {
                k007rzv1x.zHl31GGXU[1] = rG2GI7LDp;
                k007rzv1x.o4LF8RkoQ(this.dIocxURUo);
            }
        }
    }
}
