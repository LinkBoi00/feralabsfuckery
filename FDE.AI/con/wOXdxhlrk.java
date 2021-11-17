package con;
/* loaded from: classes.dex */
public final class wOXdxhlrk {
    public final long GPLPRo6go;
    public final float J4Ux7ym32;
    public final long Puu3Rhg4F;
    public final float dIocxURUo;
    public final long iiGwOFFnr;
    public final long kCA6Zs9sL;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    static {
        JhpbRXxsg jhpbRXxsg = yDwaznigW.q3BipwRCk;
        ODug2UCW1.kCA6Zs9sL(0.0f, 0.0f, 0.0f, 0.0f, yDwaznigW.J4Ux7ym32);
    }

    public wOXdxhlrk(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        this.dIocxURUo = f4;
        this.kCA6Zs9sL = j;
        this.iiGwOFFnr = j2;
        this.GPLPRo6go = j3;
        this.Puu3Rhg4F = j4;
    }

    public final float J4Ux7ym32() {
        return this.tGV7Q6urW - this.q3BipwRCk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wOXdxhlrk)) {
            return false;
        }
        wOXdxhlrk woxdxhlrk = (wOXdxhlrk) obj;
        return anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(woxdxhlrk.q3BipwRCk)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.J4Ux7ym32), Float.valueOf(woxdxhlrk.J4Ux7ym32)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.tGV7Q6urW), Float.valueOf(woxdxhlrk.tGV7Q6urW)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.dIocxURUo), Float.valueOf(woxdxhlrk.dIocxURUo)) && yDwaznigW.q3BipwRCk(this.kCA6Zs9sL, woxdxhlrk.kCA6Zs9sL) && yDwaznigW.q3BipwRCk(this.iiGwOFFnr, woxdxhlrk.iiGwOFFnr) && yDwaznigW.q3BipwRCk(this.GPLPRo6go, woxdxhlrk.GPLPRo6go) && yDwaznigW.q3BipwRCk(this.Puu3Rhg4F, woxdxhlrk.Puu3Rhg4F);
    }

    public int hashCode() {
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.dIocxURUo, gXNsYvZus.q3BipwRCk(this.tGV7Q6urW, gXNsYvZus.q3BipwRCk(this.J4Ux7ym32, Float.hashCode(this.q3BipwRCk) * 31, 31), 31), 31);
        long j = this.kCA6Zs9sL;
        JhpbRXxsg jhpbRXxsg = yDwaznigW.q3BipwRCk;
        int hashCode = Long.hashCode(this.iiGwOFFnr);
        int hashCode2 = Long.hashCode(this.GPLPRo6go);
        return Long.hashCode(this.Puu3Rhg4F) + ((hashCode2 + ((hashCode + ((Long.hashCode(j) + q3BipwRCk) * 31)) * 31)) * 31);
    }

    public final float q3BipwRCk() {
        return this.dIocxURUo - this.J4Ux7ym32;
    }

    public String toString() {
        long j = this.kCA6Zs9sL;
        long j2 = this.iiGwOFFnr;
        long j3 = this.GPLPRo6go;
        long j4 = this.Puu3Rhg4F;
        String str = xpuSUT7Gh.IG30YE5GU(this.q3BipwRCk, 1) + ", " + xpuSUT7Gh.IG30YE5GU(this.J4Ux7ym32, 1) + ", " + xpuSUT7Gh.IG30YE5GU(this.tGV7Q6urW, 1) + ", " + xpuSUT7Gh.IG30YE5GU(this.dIocxURUo, 1);
        if (!yDwaznigW.q3BipwRCk(j, j2) || !yDwaznigW.q3BipwRCk(j2, j3) || !yDwaznigW.q3BipwRCk(j3, j4)) {
            StringBuilder q3BipwRCk = eEPBBadYl.q3BipwRCk("RoundRect(rect=", str, ", topLeft=");
            q3BipwRCk.append((Object) yDwaznigW.dIocxURUo(j));
            q3BipwRCk.append(", topRight=");
            q3BipwRCk.append((Object) yDwaznigW.dIocxURUo(j2));
            q3BipwRCk.append(", bottomRight=");
            q3BipwRCk.append((Object) yDwaznigW.dIocxURUo(j3));
            q3BipwRCk.append(", bottomLeft=");
            q3BipwRCk.append((Object) yDwaznigW.dIocxURUo(j4));
            q3BipwRCk.append(')');
            return q3BipwRCk.toString();
        }
        if (yDwaznigW.J4Ux7ym32(j) == yDwaznigW.tGV7Q6urW(j)) {
            StringBuilder q3BipwRCk2 = eEPBBadYl.q3BipwRCk("RoundRect(rect=", str, ", radius=");
            q3BipwRCk2.append(xpuSUT7Gh.IG30YE5GU(yDwaznigW.J4Ux7ym32(j), 1));
            q3BipwRCk2.append(')');
            return q3BipwRCk2.toString();
        }
        StringBuilder q3BipwRCk3 = eEPBBadYl.q3BipwRCk("RoundRect(rect=", str, ", x=");
        q3BipwRCk3.append(xpuSUT7Gh.IG30YE5GU(yDwaznigW.J4Ux7ym32(j), 1));
        q3BipwRCk3.append(", y=");
        q3BipwRCk3.append(xpuSUT7Gh.IG30YE5GU(yDwaznigW.tGV7Q6urW(j), 1));
        q3BipwRCk3.append(')');
        return q3BipwRCk3.toString();
    }
}
