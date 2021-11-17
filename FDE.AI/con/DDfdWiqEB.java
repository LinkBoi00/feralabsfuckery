package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DDfdWiqEB extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ NUBOYYpO5 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DDfdWiqEB(NUBOYYpO5 nUBOYYpO5, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = nUBOYYpO5;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        DDfdWiqEB dDfdWiqEB = new DDfdWiqEB(this.qVUwofr5s, (Way959ade) obj2);
        dDfdWiqEB.ilHKhw3Yw = (xOpkxuRlw) obj;
        return dDfdWiqEB.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        DDfdWiqEB dDfdWiqEB = new DDfdWiqEB(this.qVUwofr5s, way959ade);
        dDfdWiqEB.ilHKhw3Yw = obj;
        return dDfdWiqEB;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            NUBOYYpO5 nUBOYYpO5 = this.qVUwofr5s;
            this.MzoOEjc4X = 1;
            if (syekKyXqd.yWvV4ePLl((xOpkxuRlw) this.ilHKhw3Yw, nUBOYYpO5, this) == kbkjsqcsl) {
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
