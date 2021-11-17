package con;
/* loaded from: classes.dex */
public class hod7ZTZdj {
    public int J4Ux7ym32;
    public float dIocxURUo;
    public float oon79WMrY;
    public int q3BipwRCk;
    public float tGV7Q6urW;
    public int vPSbyrYWX;
    public long kCA6Zs9sL = Long.MIN_VALUE;
    public long yWvV4ePLl = -1;
    public long iiGwOFFnr = 0;
    public int GPLPRo6go = 0;
    public int Puu3Rhg4F = 0;

    public final float q3BipwRCk(long j) {
        long j2 = this.kCA6Zs9sL;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.yWvV4ePLl;
        if (j3 < 0 || j < j3) {
            return O30O4Sjfj.J4Ux7ym32(((float) (j - j2)) / ((float) this.q3BipwRCk), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.oon79WMrY;
        return (O30O4Sjfj.J4Ux7ym32(((float) (j - j3)) / ((float) this.vPSbyrYWX), 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
