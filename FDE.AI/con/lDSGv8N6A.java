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
    public lDSGv8N6A(long r8, long r10, float r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L_0x000d
            r8 = 4278190080(0xff000000, double:2.113706745E-314)
            long r8 = con.xpuSUT7Gh.dIocxURUo(r8)
        L_0x000d:
            r1 = r8
            r8 = r13 & 2
            if (r8 == 0) goto L_0x0016
            con.JhpbRXxsg r8 = con.bRgfgYIQX.J4Ux7ym32
            long r10 = con.bRgfgYIQX.tGV7Q6urW
        L_0x0016:
            r3 = r10
            r8 = r13 & 4
            if (r8 == 0) goto L_0x001c
            r12 = 0
        L_0x001c:
            r5 = r12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.lDSGv8N6A.<init>(long, long, float, int):void");
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
