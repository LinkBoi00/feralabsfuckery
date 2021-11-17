package con;
/* loaded from: classes.dex */
public final class oDbW63V52 extends UuvLiXwHL {
    public Object MzoOEjc4X;
    public bu5cjmae6 PSTqBLTET;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public oDbW63V52(con.bu5cjmae6 r3, con.Way959ade r4) {
        /*
            r2 = this;
            con.mdGuoJbpp r0 = con.mdGuoJbpp.CBQ5d1kRq
            con.zG81huwZq r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            con.bu5cjmae6 r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.oDbW63V52.<init>(con.bu5cjmae6, con.Way959ade):void");
    }

    public final boolean QSbMsHU5X() {
        if (this.PSTqBLTET == null) {
            return false;
        }
        this.PSTqBLTET = null;
        this.MzoOEjc4X = null;
        return true;
    }

    @Override // con.UuvLiXwHL, con.Y371ZqMzx
    public void juJ6pnCpu(Object obj) {
        bu5cjmae6 bu5cjmae6 = this.PSTqBLTET;
        oDbW63V52 odbw63v52 = null;
        if (bu5cjmae6 != null) {
            cclHSBzpG.q3BipwRCk(bu5cjmae6, this.MzoOEjc4X);
            this.PSTqBLTET = null;
            this.MzoOEjc4X = null;
        }
        Object vPSbyrYWX = cOutqbkMD.vPSbyrYWX(obj, this.Bhmn1KIah);
        Way959ade way959ade = this.Bhmn1KIah;
        bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
        Object J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(kCA6Zs9sL, null);
        if (J4Ux7ym32 != cclHSBzpG.q3BipwRCk) {
            odbw63v52 = MfTZnip0T.J4Ux7ym32(way959ade, kCA6Zs9sL, J4Ux7ym32);
        }
        try {
            this.Bhmn1KIah.Bhmn1KIah(vPSbyrYWX);
        } finally {
            if (odbw63v52 == null || odbw63v52.QSbMsHU5X()) {
                cclHSBzpG.q3BipwRCk(kCA6Zs9sL, J4Ux7ym32);
            }
        }
    }
}
