package con;

import java.util.List;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {289}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Lt3zjAIOI extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public final /* synthetic */ cKAQplqZy MzoOEjc4X;
    public /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ gdEmqfwpT ilHKhw3Yw;
    public final /* synthetic */ gdEmqfwpT qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lt3zjAIOI(cKAQplqZy ckaqplqzy, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = ckaqplqzy;
        this.ilHKhw3Yw = gdemqfwpt;
        this.qVUwofr5s = gdemqfwpt2;
        this.Eeka1udhb = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        Lt3zjAIOI lt3zjAIOI = new Lt3zjAIOI(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        lt3zjAIOI.PSTqBLTET = (k0ugT26MT) obj;
        return lt3zjAIOI.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Lt3zjAIOI lt3zjAIOI = new Lt3zjAIOI(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
        lt3zjAIOI.PSTqBLTET = obj;
        return lt3zjAIOI;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        k0ugT26MT k0ugt26mt;
        gdEmqfwpT gdemqfwpt;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            k0ugT26MT k0ugt26mt2 = (k0ugT26MT) this.PSTqBLTET;
            long j = this.MzoOEjc4X.q3BipwRCk;
            tDXHjEStA tdxhjesta = new tDXHjEStA(this.Eeka1udhb, 1);
            this.PSTqBLTET = k0ugt26mt2;
            this.Bhmn1KIah = 1;
            Object iiGwOFFnr = ZEpQDovLv.iiGwOFFnr(k0ugt26mt2, j, tdxhjesta, this);
            if (iiGwOFFnr == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            k0ugt26mt = k0ugt26mt2;
            obj = iiGwOFFnr;
        } else if (i == 1) {
            k0ugt26mt = (k0ugT26MT) this.PSTqBLTET;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            List list = k0ugt26mt.MzoOEjc4X.PSTqBLTET.q3BipwRCk;
            int i2 = 0;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    cKAQplqZy ckaqplqzy = (cKAQplqZy) list.get(i2);
                    if (ODug2UCW1.oon79WMrY(ckaqplqzy)) {
                        ODug2UCW1.Bhmn1KIah(ckaqplqzy);
                    }
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            gdemqfwpt = this.ilHKhw3Yw;
        } else {
            gdemqfwpt = this.qVUwofr5s;
        }
        gdemqfwpt.GPLPRo6go();
        return qih4lW99W.q3BipwRCk;
    }
}
