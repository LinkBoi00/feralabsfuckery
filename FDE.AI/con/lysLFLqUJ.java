package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lysLFLqUJ extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ kkcQgCx5G Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ gdEmqfwpT RG6kpfv3v;
    public final /* synthetic */ gdEmqfwpT dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lysLFLqUJ(PmanMZxiM pmanMZxiM, kkcQgCx5G kkcqgcx5g, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = pmanMZxiM;
        this.Eeka1udhb = kkcqgcx5g;
        this.dXrmkklc8 = gdemqfwpt;
        this.RG6kpfv3v = gdemqfwpt2;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        lysLFLqUJ lyslflquj = new lysLFLqUJ(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        lyslflquj.ilHKhw3Yw = (xOpkxuRlw) obj;
        return lyslflquj.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        lysLFLqUJ lyslflquj = new lysLFLqUJ(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        lyslflquj.ilHKhw3Yw = obj;
        return lyslflquj;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            j1BZfYHAh j1bzfyhah = new j1BZfYHAh(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) ((xOpkxuRlw) this.ilHKhw3Yw)).cAwN510t2(j1bzfyhah, this) == kbkjsqcsl) {
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
