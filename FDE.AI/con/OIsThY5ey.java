package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$runShell$2", f = "Utils.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OIsThY5ey extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ String qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OIsThY5ey(String str, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        OIsThY5ey oIsThY5ey = new OIsThY5ey(this.qVUwofr5s, (Way959ade) obj2);
        oIsThY5ey.ilHKhw3Yw = (oQkvjGXIr) obj;
        return oIsThY5ey.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        OIsThY5ey oIsThY5ey = new OIsThY5ey(this.qVUwofr5s, way959ade);
        oIsThY5ey.ilHKhw3Yw = obj;
        return oIsThY5ey;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xaeEKvU2c xaeekvu2c = tQmFGxsat.tGV7Q6urW;
            kkcQgCx5G njfoom7zw = new njfOOm7zw(this.qVUwofr5s, null);
            bu5cjmae6 q3BipwRCk = MfTZnip0T.q3BipwRCk((oQkvjGXIr) this.ilHKhw3Yw, xaeekvu2c);
            vtDfS6nCt.kCA6Zs9sL(1);
            crQAdkqJ5 crqadkqj5 = new crQAdkqJ5(q3BipwRCk, true);
            crqadkqj5.j22ftfeNI(1, crqadkqj5, njfoom7zw);
            this.MzoOEjc4X = 1;
            obj = crqadkqj5.yWvV4ePLl(this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return wkFJfVmcv.EBQXiIPmm((Iterable) obj, "\n", null, null, 0, null, null, 62);
    }
}
