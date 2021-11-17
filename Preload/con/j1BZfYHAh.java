package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {228, 232, 244}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j1BZfYHAh extends xBFrXAfL4 implements kkcQgCx5G {
    public Object Bhmn1KIah;
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public Object PSTqBLTET;
    public final /* synthetic */ gdEmqfwpT RG6kpfv3v;
    public final /* synthetic */ gdEmqfwpT dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1BZfYHAh(PmanMZxiM pmanMZxiM, kkcQgCx5G kkcqgcx5g, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = pmanMZxiM;
        this.Eeka1udhb = kkcqgcx5g;
        this.dXrmkklc8 = gdemqfwpt;
        this.RG6kpfv3v = gdemqfwpt2;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        j1BZfYHAh j1bzfyhah = new j1BZfYHAh(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        j1bzfyhah.ilHKhw3Yw = (k0ugT26MT) obj;
        return j1bzfyhah.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        j1BZfYHAh j1bzfyhah = new j1BZfYHAh(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        j1bzfyhah.ilHKhw3Yw = obj;
        return j1bzfyhah;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        j1BZfYHAh j1bzfyhah;
        cKAQplqZy ckaqplqzy;
        LdusiAGzX ldusiAGzX;
        k0ugT26MT k0ugt26mt;
        Object dIocxURUo;
        k0ugT26MT k0ugt26mt2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            k0ugt26mt2 = (k0ugT26MT) this.ilHKhw3Yw;
            this.ilHKhw3Yw = k0ugt26mt2;
            this.MzoOEjc4X = 1;
            obj = fpplAiKys.J4Ux7ym32(k0ugt26mt2, false, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            k0ugt26mt2 = (k0ugT26MT) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            ldusiAGzX = (LdusiAGzX) this.PSTqBLTET;
            ckaqplqzy = (cKAQplqZy) this.Bhmn1KIah;
            k0ugT26MT k0ugt26mt3 = (k0ugT26MT) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
            j1bzfyhah = this;
            cKAQplqZy ckaqplqzy2 = (cKAQplqZy) obj;
            if (ckaqplqzy2 != null || ckaqplqzy2.Puu3Rhg4F.q3BipwRCk) {
                if (ckaqplqzy2 != null) {
                    j1bzfyhah.qVUwofr5s.IytU16YUK(new bRgfgYIQX(ckaqplqzy2.tGV7Q6urW));
                    j1bzfyhah.Eeka1udhb.WaUP0CF08(ckaqplqzy2, new bRgfgYIQX(ldusiAGzX.CBQ5d1kRq));
                    long j = ckaqplqzy2.q3BipwRCk;
                    tDXHjEStA tdxhjesta = new tDXHjEStA(j1bzfyhah.Eeka1udhb, 0);
                    j1bzfyhah.ilHKhw3Yw = null;
                    j1bzfyhah.Bhmn1KIah = null;
                    j1bzfyhah.PSTqBLTET = null;
                    j1bzfyhah.MzoOEjc4X = 3;
                    obj = ZEpQDovLv.iiGwOFFnr(k0ugt26mt3, j, tdxhjesta, j1bzfyhah);
                    if (obj == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    (((Boolean) obj).booleanValue() ? j1bzfyhah.dXrmkklc8 : j1bzfyhah.RG6kpfv3v).GPLPRo6go();
                }
                return qih4lW99W.q3BipwRCk;
            }
            k0ugt26mt = k0ugt26mt3;
            long j2 = ckaqplqzy.q3BipwRCk;
            int i2 = ckaqplqzy.yWvV4ePLl;
            MAZDnzQe5 mAZDnzQe5 = new MAZDnzQe5(ldusiAGzX);
            j1bzfyhah.ilHKhw3Yw = k0ugt26mt;
            j1bzfyhah.Bhmn1KIah = ckaqplqzy;
            j1bzfyhah.PSTqBLTET = ldusiAGzX;
            j1bzfyhah.MzoOEjc4X = 2;
            dIocxURUo = ZEpQDovLv.dIocxURUo(k0ugt26mt, j2, i2, mAZDnzQe5, j1bzfyhah);
            if (dIocxURUo != kbkjsqcsl) {
                return kbkjsqcsl;
            }
            k0ugt26mt3 = k0ugt26mt;
            obj = dIocxURUo;
            cKAQplqZy ckaqplqzy22 = (cKAQplqZy) obj;
            if (ckaqplqzy22 != null) {
            }
            if (ckaqplqzy22 != null) {
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 3) {
            anXlDk6fV.IytU16YUK(obj);
            j1bzfyhah = this;
            (((Boolean) obj).booleanValue() ? j1bzfyhah.dXrmkklc8 : j1bzfyhah.RG6kpfv3v).GPLPRo6go();
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LdusiAGzX ldusiAGzX2 = new LdusiAGzX();
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        ldusiAGzX2.CBQ5d1kRq = bRgfgYIQX.tGV7Q6urW;
        j1bzfyhah = this;
        ckaqplqzy = (cKAQplqZy) obj;
        k0ugt26mt = k0ugt26mt2;
        ldusiAGzX = ldusiAGzX2;
        long j22 = ckaqplqzy.q3BipwRCk;
        int i22 = ckaqplqzy.yWvV4ePLl;
        MAZDnzQe5 mAZDnzQe52 = new MAZDnzQe5(ldusiAGzX);
        j1bzfyhah.ilHKhw3Yw = k0ugt26mt;
        j1bzfyhah.Bhmn1KIah = ckaqplqzy;
        j1bzfyhah.PSTqBLTET = ldusiAGzX;
        j1bzfyhah.MzoOEjc4X = 2;
        dIocxURUo = ZEpQDovLv.dIocxURUo(k0ugt26mt, j22, i22, mAZDnzQe52, j1bzfyhah);
        if (dIocxURUo != kbkjsqcsl) {
        }
    }
}
