package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class YBt4lcfwB extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public final /* synthetic */ IXMg0nBBI Eeka1udhb;
    public final /* synthetic */ eP3ZpMpES MzoOEjc4X;
    public /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ PmanMZxiM ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBt4lcfwB(eP3ZpMpES ep3zpmpes, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, IXMg0nBBI iXMg0nBBI, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = ep3zpmpes;
        this.ilHKhw3Yw = pmanMZxiM;
        this.qVUwofr5s = pmanMZxiM2;
        this.Eeka1udhb = iXMg0nBBI;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        YBt4lcfwB yBt4lcfwB = new YBt4lcfwB(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        yBt4lcfwB.PSTqBLTET = (k0ugT26MT) obj;
        return yBt4lcfwB.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        YBt4lcfwB yBt4lcfwB = new YBt4lcfwB(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
        yBt4lcfwB.PSTqBLTET = obj;
        return yBt4lcfwB;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.Bhmn1KIah = 1;
            obj = fpplAiKys.iiGwOFFnr((k0ugT26MT) this.PSTqBLTET, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cKAQplqZy ckaqplqzy = (cKAQplqZy) obj;
        if (ckaqplqzy != null) {
            ODug2UCW1.Bhmn1KIah(ckaqplqzy);
            this.MzoOEjc4X.dIocxURUo();
            this.ilHKhw3Yw.IytU16YUK(new bRgfgYIQX(ckaqplqzy.tGV7Q6urW));
        } else {
            this.MzoOEjc4X.J4Ux7ym32();
            PmanMZxiM pmanMZxiM = this.qVUwofr5s;
            if (pmanMZxiM == null) {
                return null;
            }
            pmanMZxiM.IytU16YUK(new bRgfgYIQX(((cKAQplqZy) this.Eeka1udhb.CBQ5d1kRq).tGV7Q6urW));
        }
        return qih4lW99W.q3BipwRCk;
    }
}
