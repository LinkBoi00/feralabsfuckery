package con;
@jHNqfwCVd(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class oFbSzffVE extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ kycC9mx23 ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oFbSzffVE(kycC9mx23 kycc9mx23, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = kycc9mx23;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new oFbSzffVE(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new oFbSzffVE(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            kycC9mx23 kycc9mx23 = this.ilHKhw3Yw;
            this.MzoOEjc4X = 1;
            if (kycc9mx23.q3BipwRCk(this) == kbkjsqcsl) {
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
