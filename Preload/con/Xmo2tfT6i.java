package con;
/* loaded from: classes.dex */
public final class Xmo2tfT6i extends xNzBgcwLi {
    public jvKy1qifN CBQ5d1kRq;
    public final long GPLPRo6go;
    public final long Puu3Rhg4F;
    public final Y3ibtOJiE iiGwOFFnr;
    public final long oon79WMrY;
    public float vPSbyrYWX;
    public int yWvV4ePLl = 1;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (con.YWiUMZOtw.J4Ux7ym32(r5) <= r2.q3BipwRCk()) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Xmo2tfT6i(Y3ibtOJiE y3ibtOJiE, long j, long j2, dnBSj5uJN dnbsj5ujn) {
        this.iiGwOFFnr = y3ibtOJiE;
        this.GPLPRo6go = j;
        this.Puu3Rhg4F = j2;
        oWhsE8IPp owhse8ipp = C2KV764vt.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = C2KV764vt.q3BipwRCk;
        boolean z = true;
        if (ZtJSMDYDl.q3BipwRCk(j) >= 0 && ZtJSMDYDl.J4Ux7ym32(j) >= 0 && YWiUMZOtw.tGV7Q6urW(j2) >= 0 && YWiUMZOtw.J4Ux7ym32(j2) >= 0) {
            tNgdvtcFW tngdvtcfw = (tNgdvtcFW) y3ibtOJiE;
            if (YWiUMZOtw.tGV7Q6urW(j2) <= tngdvtcfw.J4Ux7ym32()) {
            }
        }
        z = false;
        if (z) {
            this.oon79WMrY = j2;
            this.vPSbyrYWX = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // con.xNzBgcwLi
    public boolean J4Ux7ym32(jvKy1qifN jvky1qifn) {
        this.CBQ5d1kRq = jvky1qifn;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xmo2tfT6i)) {
            return false;
        }
        Xmo2tfT6i xmo2tfT6i = (Xmo2tfT6i) obj;
        if (!anXlDk6fV.tGV7Q6urW(this.iiGwOFFnr, xmo2tfT6i.iiGwOFFnr)) {
            return false;
        }
        long j = this.GPLPRo6go;
        long j2 = xmo2tfT6i.GPLPRo6go;
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && YWiUMZOtw.q3BipwRCk(this.Puu3Rhg4F, xmo2tfT6i.Puu3Rhg4F) && C2KV764vt.q3BipwRCk(this.yWvV4ePLl, xmo2tfT6i.yWvV4ePLl);
    }

    public int hashCode() {
        long j = this.GPLPRo6go;
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
        int i = this.yWvV4ePLl;
        oWhsE8IPp owhse8ipp = C2KV764vt.q3BipwRCk;
        return (((((this.iiGwOFFnr.hashCode() * 31) + Long.hashCode(j)) * 31) + Long.hashCode(this.Puu3Rhg4F)) * 31) + Integer.hashCode(i);
    }

    @Override // con.xNzBgcwLi
    public void kCA6Zs9sL(wvIIkk6mx wviikk6mx) {
        YFPaMFEQT.J4Ux7ym32(wviikk6mx, this.iiGwOFFnr, this.GPLPRo6go, this.Puu3Rhg4F, 0, D3DEikrvb.dIocxURUo(D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(wviikk6mx.q3BipwRCk())), D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(wviikk6mx.q3BipwRCk()))), this.vPSbyrYWX, null, this.CBQ5d1kRq, 0, this.yWvV4ePLl, 328, null);
    }

    @Override // con.xNzBgcwLi
    public boolean q3BipwRCk(float f) {
        this.vPSbyrYWX = f;
        return true;
    }

    @Override // con.xNzBgcwLi
    public long tGV7Q6urW() {
        return D3DEikrvb.i8XZMQc6Z(this.oon79WMrY);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("BitmapPainter(image=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", srcOffset=");
        q3BipwRCk.append((Object) ZtJSMDYDl.tGV7Q6urW(this.GPLPRo6go));
        q3BipwRCk.append(", srcSize=");
        q3BipwRCk.append((Object) YWiUMZOtw.dIocxURUo(this.Puu3Rhg4F));
        q3BipwRCk.append(", filterQuality=");
        int i = this.yWvV4ePLl;
        q3BipwRCk.append((Object) (C2KV764vt.q3BipwRCk(i, 0) ? "None" : C2KV764vt.q3BipwRCk(i, 1) ? "Low" : C2KV764vt.q3BipwRCk(i, 2) ? "Medium" : C2KV764vt.q3BipwRCk(i, 3) ? "High" : "Unknown"));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
