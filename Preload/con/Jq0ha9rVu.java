package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {211, 217}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Jq0ha9rVu extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public final /* synthetic */ PmanMZxiM Eeka1udhb;
    public final /* synthetic */ NzvP5Rex8 MzoOEjc4X;
    public /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ oQkvjGXIr ilHKhw3Yw;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jq0ha9rVu(NzvP5Rex8 nzvP5Rex8, oQkvjGXIr oqkvjgxir, eP3ZpMpES ep3zpmpes, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = nzvP5Rex8;
        this.ilHKhw3Yw = oqkvjgxir;
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = pmanMZxiM;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        Jq0ha9rVu jq0ha9rVu = new Jq0ha9rVu(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        jq0ha9rVu.PSTqBLTET = (k0ugT26MT) obj;
        return jq0ha9rVu.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Jq0ha9rVu jq0ha9rVu = new Jq0ha9rVu(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
        jq0ha9rVu.PSTqBLTET = obj;
        return jq0ha9rVu;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        cKAQplqZy ckaqplqzy;
        k0ugT26MT k0ugt26mt;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            k0ugt26mt = (k0ugT26MT) this.PSTqBLTET;
            this.PSTqBLTET = k0ugt26mt;
            this.Bhmn1KIah = 1;
            obj = fpplAiKys.tGV7Q6urW(k0ugt26mt, false, this, 1);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            k0ugt26mt = (k0ugT26MT) this.PSTqBLTET;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            anXlDk6fV.IytU16YUK(obj);
            ckaqplqzy = (cKAQplqZy) obj;
            if (ckaqplqzy != null) {
                this.qVUwofr5s.J4Ux7ym32();
            } else {
                ODug2UCW1.Bhmn1KIah(ckaqplqzy);
                this.qVUwofr5s.dIocxURUo();
                PmanMZxiM pmanMZxiM = this.Eeka1udhb;
                if (pmanMZxiM != null) {
                    pmanMZxiM.IytU16YUK(new bRgfgYIQX(ckaqplqzy.tGV7Q6urW));
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cKAQplqZy ckaqplqzy2 = (cKAQplqZy) obj;
        ODug2UCW1.Bhmn1KIah(ckaqplqzy2);
        NzvP5Rex8 nzvP5Rex8 = this.MzoOEjc4X;
        if (nzvP5Rex8 != fpplAiKys.q3BipwRCk) {
            idpM54xlp.RG6kpfv3v(this.ilHKhw3Yw, null, 0, new Ixy1MDmHH(nzvP5Rex8, this.qVUwofr5s, ckaqplqzy2, null), 3, null);
        }
        this.PSTqBLTET = null;
        this.Bhmn1KIah = 2;
        obj = fpplAiKys.iiGwOFFnr(k0ugt26mt, this);
        if (obj == kbkjsqcsl) {
            return kbkjsqcsl;
        }
        ckaqplqzy = (cKAQplqZy) obj;
        if (ckaqplqzy != null) {
        }
        return qih4lW99W.q3BipwRCk;
    }
}
