package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class XNyqBtql6 extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public /* synthetic */ Object PSTqBLTET;

    public XNyqBtql6(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        XNyqBtql6 xNyqBtql6 = new XNyqBtql6((Way959ade) obj2);
        xNyqBtql6.PSTqBLTET = (k0ugT26MT) obj;
        return xNyqBtql6.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        XNyqBtql6 xNyqBtql6 = new XNyqBtql6(way959ade);
        xNyqBtql6.PSTqBLTET = obj;
        return xNyqBtql6;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.Bhmn1KIah = 1;
            obj = fpplAiKys.J4Ux7ym32((k0ugT26MT) this.PSTqBLTET, false, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
