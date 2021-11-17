package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {757}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lQz1YhN4l extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ IXMg0nBBI Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ xOpkxuRlw ilHKhw3Yw;
    public final /* synthetic */ IXMg0nBBI qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lQz1YhN4l(xOpkxuRlw xopkxurlw, IXMg0nBBI iXMg0nBBI, IXMg0nBBI iXMg0nBBI2, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = xopkxurlw;
        this.qVUwofr5s = iXMg0nBBI;
        this.Eeka1udhb = iXMg0nBBI2;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new lQz1YhN4l(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new lQz1YhN4l(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xOpkxuRlw xopkxurlw = this.ilHKhw3Yw;
            dE4SicgyR de4sicgyr = new dE4SicgyR(this.qVUwofr5s, this.Eeka1udhb, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) xopkxurlw).cAwN510t2(de4sicgyr, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
