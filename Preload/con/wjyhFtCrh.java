package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wjyhFtCrh extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ IxbokG044 ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjyhFtCrh(IxbokG044 ixbokG044, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ixbokG044;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new wjyhFtCrh(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new wjyhFtCrh(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            IxbokG044 ixbokG044 = this.ilHKhw3Yw;
            Float f = new Float(0.0f);
            float f2 = ULcVOH77q.q3BipwRCk;
            xWMOih5Lb dIocxURUo = cqKak5Wfn.dIocxURUo(cqKak5Wfn.kCA6Zs9sL(JHFXdtjfx.ixWaw2akD), 0, 2);
            this.MzoOEjc4X = 1;
            if (IxbokG044.tGV7Q6urW(ixbokG044, f, dIocxURUo, null, null, this, 12) == kbkjsqcsl) {
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
