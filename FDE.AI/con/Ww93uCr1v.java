package con;

import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$UnloadButton$1$1$1", f = "MainActivity.kt", l = {538}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Ww93uCr1v extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ww93uCr1v(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Ww93uCr1v(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Ww93uCr1v(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            MainActivity mainActivity = this.ilHKhw3Yw;
            this.MzoOEjc4X = 1;
            if (D3DEikrvb.yWvV4ePLl(new vtMy2KPve(mainActivity, null), this) == kbkjsqcsl) {
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
