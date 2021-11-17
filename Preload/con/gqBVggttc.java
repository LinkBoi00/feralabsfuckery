package con;
/* loaded from: classes.dex */
public final class gqBVggttc {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;

    public gqBVggttc(float f, AU29aHa4X aU29aHa4X) {
        this.q3BipwRCk = f;
        float density = aU29aHa4X.getDensity();
        float f2 = nP6dRJjU9.q3BipwRCk;
        this.J4Ux7ym32 = density * 386.0878f * 160.0f * 0.84f;
    }

    public final double J4Ux7ym32(float f) {
        sqIi67jLT sqii67jlt = sqIi67jLT.q3BipwRCk;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.q3BipwRCk * this.J4Ux7ym32)));
    }

    public final Ai1mFpeWT q3BipwRCk(float f) {
        double J4Ux7ym32 = J4Ux7ym32(f);
        float f2 = nP6dRJjU9.q3BipwRCk;
        double d = ((double) f2) - 1.0d;
        return new Ai1mFpeWT(f, (float) (Math.exp((((double) f2) / d) * J4Ux7ym32) * ((double) (this.q3BipwRCk * this.J4Ux7ym32))), (long) (Math.exp(J4Ux7ym32 / d) * 1000.0d));
    }
}
