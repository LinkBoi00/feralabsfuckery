package con;
/* loaded from: classes.dex */
public final class lWcW85d4y {
    public final boolean CBQ5d1kRq;
    public final String GPLPRo6go;
    public final boolean J4Ux7ym32;
    public final boolean Puu3Rhg4F;
    public final boolean dIocxURUo;
    public final boolean iiGwOFFnr;
    public final boolean kCA6Zs9sL;
    public final String oon79WMrY;
    public final boolean q3BipwRCk;
    public final boolean tGV7Q6urW;
    public final boolean vPSbyrYWX;
    public final boolean yWvV4ePLl;

    public lWcW85d4y(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, int i) {
        boolean z11 = false;
        boolean z12 = (i & 1) != 0 ? false : z;
        boolean z13 = (i & 2) != 0 ? false : z2;
        boolean z14 = (i & 4) != 0 ? false : z3;
        boolean z15 = (i & 8) != 0 ? false : z4;
        boolean z16 = (i & 16) != 0 ? false : z5;
        boolean z17 = true;
        boolean z18 = (i & 32) != 0 ? true : z6;
        String str3 = null;
        String str4 = (i & 64) != 0 ? "    " : null;
        boolean z19 = (i & 128) != 0 ? false : z7;
        boolean z20 = (i & 256) != 0 ? false : z8;
        str3 = (i & 512) != 0 ? "type" : str3;
        z11 = (i & 1024) == 0 ? z9 : z11;
        z17 = (i & 2048) == 0 ? z10 : z17;
        this.q3BipwRCk = z12;
        this.J4Ux7ym32 = z13;
        this.tGV7Q6urW = z14;
        this.dIocxURUo = z15;
        this.kCA6Zs9sL = z16;
        this.iiGwOFFnr = z18;
        this.GPLPRo6go = str4;
        this.Puu3Rhg4F = z19;
        this.yWvV4ePLl = z20;
        this.oon79WMrY = str3;
        this.vPSbyrYWX = z11;
        this.CBQ5d1kRq = z17;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("JsonConfiguration(encodeDefaults=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", ignoreUnknownKeys=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", isLenient=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", allowStructuredMapKeys=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", prettyPrint=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", explicitNulls=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", prettyPrintIndent='");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append("', coerceInputValues=");
        q3BipwRCk.append(this.Puu3Rhg4F);
        q3BipwRCk.append(", useArrayPolymorphism=");
        q3BipwRCk.append(this.yWvV4ePLl);
        q3BipwRCk.append(", classDiscriminator='");
        q3BipwRCk.append(this.oon79WMrY);
        q3BipwRCk.append("', allowSpecialFloatingPointValues=");
        q3BipwRCk.append(this.vPSbyrYWX);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
