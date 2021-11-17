package con;
/* loaded from: classes.dex */
public final class lDSGv8N6A {
    public static final ksLrMHgEz dIocxURUo = new ksLrMHgEz(null, 15);
    public static final lDSGv8N6A kCA6Zs9sL = new lDSGv8N6A(0, 0, 0.0f, 7);
    public final long J4Ux7ym32;
    public final long q3BipwRCk;
    public final float tGV7Q6urW;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public lDSGv8N6A(long j, long j2, float f, int i) {
        this(j, j2, (i & 4) != 0 ? 0.0f : f, (dnBSj5uJN) null);
        j = (i & 1) != 0 ? xpuSUT7Gh.dIocxURUo(4278190080L) : j;
        if ((i & 2) != 0) {
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            j2 = bRgfgYIQX.tGV7Q6urW;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lDSGv8N6A)) {
            return false;
        }
        lDSGv8N6A ldsgv8n6a = (lDSGv8N6A) obj;
        if (!bO2dbmrf7.tGV7Q6urW(this.q3BipwRCk, ldsgv8n6a.q3BipwRCk) || !bRgfgYIQX.q3BipwRCk(this.J4Ux7ym32, ldsgv8n6a.J4Ux7ym32)) {
            return false;
        }
        return (this.tGV7Q6urW > ldsgv8n6a.tGV7Q6urW ? 1 : (this.tGV7Q6urW == ldsgv8n6a.tGV7Q6urW ? 0 : -1)) == 0;
    }

    public int hashCode() {
        long j = this.J4Ux7ym32;
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return Float.hashCode(this.tGV7Q6urW) + (((bO2dbmrf7.yWvV4ePLl(this.q3BipwRCk) * 31) + Long.hashCode(j)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Shadow(color=");
        q3BipwRCk.append((Object) bO2dbmrf7.oon79WMrY(this.q3BipwRCk));
        q3BipwRCk.append(", offset=");
        q3BipwRCk.append((Object) bRgfgYIQX.GPLPRo6go(this.J4Ux7ym32));
        q3BipwRCk.append(", blurRadius=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.tGV7Q6urW, ')');
    }

    public lDSGv8N6A(long j, long j2, float f, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
        this.tGV7Q6urW = f;
    }
}
