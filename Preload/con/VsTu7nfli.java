package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {192}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VsTu7nfli extends xBFrXAfL4 implements kkcQgCx5G {
    public long Bhmn1KIah;
    public /* synthetic */ Object MzoOEjc4X;
    public int PSTqBLTET;
    public final /* synthetic */ cKAQplqZy ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VsTu7nfli(cKAQplqZy ckaqplqzy, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ckaqplqzy;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        VsTu7nfli vsTu7nfli = new VsTu7nfli(this.ilHKhw3Yw, (Way959ade) obj2);
        vsTu7nfli.MzoOEjc4X = (k0ugT26MT) obj;
        return vsTu7nfli.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        VsTu7nfli vsTu7nfli = new VsTu7nfli(this.ilHKhw3Yw, way959ade);
        vsTu7nfli.MzoOEjc4X = obj;
        return vsTu7nfli;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        VsTu7nfli vsTu7nfli;
        k0ugT26MT k0ugt26mt;
        long j;
        Object tGV7Q6urW;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.PSTqBLTET;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            k0ugT26MT k0ugt26mt2 = (k0ugT26MT) this.MzoOEjc4X;
            j = k0ugt26mt2.MzoOEjc4X.kmSgne1rO.tGV7Q6urW() + this.ilHKhw3Yw.J4Ux7ym32;
            k0ugt26mt = k0ugt26mt2;
            vsTu7nfli = this;
            vsTu7nfli.MzoOEjc4X = k0ugt26mt;
            vsTu7nfli.Bhmn1KIah = j;
            vsTu7nfli.PSTqBLTET = 1;
            tGV7Q6urW = fpplAiKys.tGV7Q6urW(k0ugt26mt, false, vsTu7nfli, 1);
            if (tGV7Q6urW != kbkjsqcsl) {
            }
        } else if (i == 1) {
            long j2 = this.Bhmn1KIah;
            k0ugT26MT k0ugt26mt3 = (k0ugT26MT) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            kBKJSqCSL kbkjsqcsl2 = kbkjsqcsl;
            VsTu7nfli vsTu7nfli2 = this;
            cKAQplqZy ckaqplqzy = (cKAQplqZy) obj;
            if (ckaqplqzy.J4Ux7ym32 < j2) {
                return ckaqplqzy;
            }
            vsTu7nfli = vsTu7nfli2;
            kbkjsqcsl = kbkjsqcsl2;
            k0ugt26mt = k0ugt26mt3;
            j = j2;
            vsTu7nfli.MzoOEjc4X = k0ugt26mt;
            vsTu7nfli.Bhmn1KIah = j;
            vsTu7nfli.PSTqBLTET = 1;
            tGV7Q6urW = fpplAiKys.tGV7Q6urW(k0ugt26mt, false, vsTu7nfli, 1);
            if (tGV7Q6urW != kbkjsqcsl) {
                return kbkjsqcsl;
            }
            vsTu7nfli2 = vsTu7nfli;
            obj = tGV7Q6urW;
            j2 = j;
            k0ugt26mt3 = k0ugt26mt;
            kbkjsqcsl2 = kbkjsqcsl;
            cKAQplqZy ckaqplqzy2 = (cKAQplqZy) obj;
            if (ckaqplqzy2.J4Ux7ym32 < j2) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
