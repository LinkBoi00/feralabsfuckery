package con;
/* loaded from: classes.dex */
public final class qJlmaHgTA implements toyRNCJyy {
    public final UBY2Inzw8 Bhmn1KIah;
    public final UBY2Inzw8 CBQ5d1kRq;
    public final UBY2Inzw8 kmSgne1rO;

    public qJlmaHgTA(UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, UBY2Inzw8 uBY2Inzw83) {
        this.CBQ5d1kRq = uBY2Inzw8;
        this.kmSgne1rO = uBY2Inzw82;
        this.Bhmn1KIah = uBY2Inzw83;
    }

    @Override // con.toyRNCJyy
    public void dIocxURUo(HXRw132ar hXRw132ar) {
        long j;
        float f;
        hXRw132ar.J4Ux7ym32();
        if (((Boolean) this.CBQ5d1kRq.getValue()).booleanValue()) {
            JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
            j = bO2dbmrf7.tGV7Q6urW;
            f = 0.3f;
        } else if (((Boolean) this.kmSgne1rO.getValue()).booleanValue() || ((Boolean) this.Bhmn1KIah.getValue()).booleanValue()) {
            JhpbRXxsg jhpbRXxsg2 = bO2dbmrf7.J4Ux7ym32;
            j = bO2dbmrf7.tGV7Q6urW;
            f = 0.1f;
        } else {
            return;
        }
        YFPaMFEQT.GPLPRo6go(hXRw132ar, bO2dbmrf7.J4Ux7ym32(j, f, 0.0f, 0.0f, 0.0f, 14), 0, hXRw132ar.q3BipwRCk(), 0.0f, null, null, 0, 122, null);
    }
}
