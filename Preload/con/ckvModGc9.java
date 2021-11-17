package con;
@jHNqfwCVd(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ckvModGc9 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ jz2wLk9jK Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ Chhh90LYe dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ boolean qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvModGc9(boolean z, jz2wLk9jK jz2wlk9jk, Chhh90LYe chhh90LYe, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = z;
        this.Eeka1udhb = jz2wlk9jk;
        this.dXrmkklc8 = chhh90LYe;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        ckvModGc9 ckvmodgc9 = new ckvModGc9(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        ckvmodgc9.ilHKhw3Yw = (xOpkxuRlw) obj;
        return ckvmodgc9.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        ckvModGc9 ckvmodgc9 = new ckvModGc9(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
        ckvmodgc9.ilHKhw3Yw = obj;
        return ckvmodgc9;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            hvTTGwM30 hvttgwm30 = new hvTTGwM30(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, null);
            this.MzoOEjc4X = 1;
            if (((ztvmwA530) ((xOpkxuRlw) this.ilHKhw3Yw)).cAwN510t2(hvttgwm30, this) == kbkjsqcsl) {
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
