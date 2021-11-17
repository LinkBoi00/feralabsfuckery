package con;
/* loaded from: classes.dex */
public final class mivJlWd6O implements f106ugAzx {
    public final /* synthetic */ f106ugAzx Bhmn1KIah;
    public final /* synthetic */ BdFQ0RqNz CBQ5d1kRq;
    public final /* synthetic */ int kmSgne1rO;

    public mivJlWd6O(BdFQ0RqNz bdFQ0RqNz, int i, f106ugAzx f106ugazx) {
        this.CBQ5d1kRq = bdFQ0RqNz;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = f106ugazx;
    }

    @Override // con.f106ugAzx
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        BdFQ0RqNz bdFQ0RqNz = this.CBQ5d1kRq;
        int i = bdFQ0RqNz.CBQ5d1kRq + 1;
        bdFQ0RqNz.CBQ5d1kRq = i;
        if (i < this.kmSgne1rO) {
            Object q3BipwRCk = this.Bhmn1KIah.q3BipwRCk(obj, way959ade);
            return q3BipwRCk == kbkjsqcsl ? q3BipwRCk : qih4lW99W.q3BipwRCk;
        }
        anXlDk6fV.J4Ux7ym32(this.Bhmn1KIah, obj, way959ade);
        return kbkjsqcsl;
    }
}
