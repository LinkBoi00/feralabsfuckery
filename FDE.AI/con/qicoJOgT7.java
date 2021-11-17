package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$affordableRam$2", f = "Utils.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class qicoJOgT7 extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;

    public qicoJOgT7(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new qicoJOgT7((Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new qicoJOgT7(way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            this.MzoOEjc4X = 1;
            obj = yuSxiExwK.Puu3Rhg4F(this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = ((Number) obj).intValue();
        return new Integer(intValue - (intValue / 10));
    }
}
