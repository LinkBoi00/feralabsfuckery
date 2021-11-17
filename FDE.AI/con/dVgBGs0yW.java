package con;
/* loaded from: classes.dex */
public final class dVgBGs0yW extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ WLosHMQ8L Bhmn1KIah;
    public final /* synthetic */ int PSTqBLTET;
    public final /* synthetic */ float kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dVgBGs0yW(float f, WLosHMQ8L wLosHMQ8L, int i) {
        super(1);
        this.kmSgne1rO = f;
        this.Bhmn1KIah = wLosHMQ8L;
        this.PSTqBLTET = i;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        hrAjOnL52 hrajonl52 = (hrAjOnL52) obj;
        Comparable valueOf = Float.valueOf(this.kmSgne1rO);
        WLosHMQ8L wLosHMQ8L = this.Bhmn1KIah;
        if (!wLosHMQ8L.tGV7Q6urW()) {
            if (wLosHMQ8L.dIocxURUo(valueOf, wLosHMQ8L.J4Ux7ym32()) && !wLosHMQ8L.dIocxURUo(wLosHMQ8L.J4Ux7ym32(), valueOf)) {
                valueOf = wLosHMQ8L.J4Ux7ym32();
            } else if (wLosHMQ8L.dIocxURUo(wLosHMQ8L.q3BipwRCk(), valueOf) && !wLosHMQ8L.dIocxURUo(valueOf, wLosHMQ8L.q3BipwRCk())) {
                valueOf = wLosHMQ8L.q3BipwRCk();
            }
            nPBzGBru7.J4Ux7ym32.q3BipwRCk(hrajonl52, nPBzGBru7.q3BipwRCk[1], new dGwOm42fX(((Number) valueOf).floatValue(), this.Bhmn1KIah, this.PSTqBLTET));
            return qih4lW99W.q3BipwRCk;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + wLosHMQ8L + '.');
    }
}
