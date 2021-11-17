package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$getRamUsedPercent$2", f = "Utils.kt", l = {78, 79}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MFE4XF3ZR extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public int ilHKhw3Yw;
    public int qVUwofr5s;

    public MFE4XF3ZR(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new MFE4XF3ZR((Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new MFE4XF3ZR(way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        int i;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i2 = this.qVUwofr5s;
        int i3 = 100;
        if (i2 == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            this.qVUwofr5s = 1;
            obj = yuSxiExwK.Puu3Rhg4F(this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i2 == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else if (i2 == 2) {
            i = this.ilHKhw3Yw;
            i3 = this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            return new Integer(i3 - (i / (((Number) obj).intValue() + 1)));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = (((Number) obj).intValue() + 1) * 100;
        YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
        this.MzoOEjc4X = 100;
        this.ilHKhw3Yw = intValue;
        this.qVUwofr5s = 2;
        Object qFBXIgpia = idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new NhB9HO8PS(null), this);
        if (qFBXIgpia == kbkjsqcsl) {
            return kbkjsqcsl;
        }
        i = intValue;
        obj = qFBXIgpia;
        return new Integer(i3 - (i / (((Number) obj).intValue() + 1)));
    }
}
