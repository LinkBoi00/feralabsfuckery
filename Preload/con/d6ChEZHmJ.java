package con;
/* loaded from: classes.dex */
public class d6ChEZHmJ extends qdam7I1O8 {
    @Override // con.qdam7I1O8
    public void q3BipwRCk(Dkj44tvhZ dkj44tvhZ, float f, float f2, float f3) {
        dkj44tvhZ.dIocxURUo(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        pVVJ0eZbs pvvj0ezbs = new pVVJ0eZbs(0.0f, 0.0f, f4, f4);
        pvvj0ezbs.iiGwOFFnr = 180.0f;
        pvvj0ezbs.GPLPRo6go = f;
        dkj44tvhZ.GPLPRo6go.add(pvvj0ezbs);
        Jij3ES9ux jij3ES9ux = new Jij3ES9ux(pvvj0ezbs);
        float f5 = 180.0f + f;
        boolean z = f < 0.0f;
        float f6 = z ? 0.0f : 180.0f;
        float f7 = z ? (180.0f + f5) % 360.0f : f5;
        dkj44tvhZ.q3BipwRCk(f6);
        dkj44tvhZ.Puu3Rhg4F.add(jij3ES9ux);
        dkj44tvhZ.kCA6Zs9sL = f7;
        float f8 = (0.0f + f4) * 0.5f;
        float f9 = (f4 - 0.0f) / 2.0f;
        double d = (double) f5;
        dkj44tvhZ.tGV7Q6urW = (((float) Math.cos(Math.toRadians(d))) * f9) + f8;
        dkj44tvhZ.dIocxURUo = (f9 * ((float) Math.sin(Math.toRadians(d)))) + f8;
    }
}
