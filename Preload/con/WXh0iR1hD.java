package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$existsAndIsFile$2", f = "Utils.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WXh0iR1hD extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ String ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WXh0iR1hD(String str, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new WXh0iR1hD(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new WXh0iR1hD(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk = M5g57XBLr.q3BipwRCk("if [ -f ", this.ilHKhw3Yw, " ]; then echo true; fi");
            this.MzoOEjc4X = 1;
            obj = yuSxiExwK.Bhmn1KIah(q3BipwRCk, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boolean.valueOf(r6NbD4wnj.mUqPm6GBh((String) obj, "true", false, 2));
    }
}
