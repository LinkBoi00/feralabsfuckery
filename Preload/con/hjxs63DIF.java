package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class hjxs63DIF extends dnd1L2J2K implements kkcQgCx5G {
    public int Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ b0pCjrhT1 RG6kpfv3v;
    public /* synthetic */ Object dXrmkklc8;
    public Object ilHKhw3Yw;
    public final /* synthetic */ LdusiAGzX ixWaw2akD;
    public long qVUwofr5s;
    public final /* synthetic */ long sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjxs63DIF(b0pCjrhT1 b0pcjrht1, LdusiAGzX ldusiAGzX, long j, Way959ade way959ade) {
        super(2, way959ade);
        this.RG6kpfv3v = b0pcjrht1;
        this.ixWaw2akD = ldusiAGzX;
        this.sk5s77z6Q = j;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        hjxs63DIF hjxs63dif = new hjxs63DIF(this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, (Way959ade) obj2);
        hjxs63dif.dXrmkklc8 = (tDmftakZl) obj;
        return hjxs63dif.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        hjxs63DIF hjxs63dif = new hjxs63DIF(this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, way959ade);
        hjxs63dif.dXrmkklc8 = obj;
        return hjxs63dif;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        b0pCjrhT1 b0pcjrht1;
        b0pCjrhT1 b0pcjrht12;
        LdusiAGzX ldusiAGzX;
        long j;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Eeka1udhb;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            b0pcjrht12 = this.RG6kpfv3v;
            aGCGJ2nFH agcgj2nfh = new aGCGJ2nFH(new dMQC97DHs(b0pcjrht12, (tDmftakZl) this.dXrmkklc8));
            ldusiAGzX = this.ixWaw2akD;
            long j2 = this.sk5s77z6Q;
            IzQNDLr32 izQNDLr32 = b0pcjrht12.kCA6Zs9sL;
            long j3 = ldusiAGzX.CBQ5d1kRq;
            float dIocxURUo = b0pcjrht12.dIocxURUo(b0pcjrht12.kCA6Zs9sL(j2));
            this.dXrmkklc8 = b0pcjrht12;
            this.MzoOEjc4X = b0pcjrht12;
            this.ilHKhw3Yw = ldusiAGzX;
            this.qVUwofr5s = j3;
            this.Eeka1udhb = 1;
            obj = izQNDLr32.q3BipwRCk(agcgj2nfh, dIocxURUo, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            b0pcjrht1 = b0pcjrht12;
            j = j3;
        } else if (i == 1) {
            j = this.qVUwofr5s;
            ldusiAGzX = (LdusiAGzX) this.ilHKhw3Yw;
            b0pcjrht12 = (b0pCjrhT1) this.MzoOEjc4X;
            b0pcjrht1 = (b0pCjrhT1) this.dXrmkklc8;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float dIocxURUo2 = b0pcjrht1.dIocxURUo(((Number) obj).floatValue());
        ldusiAGzX.CBQ5d1kRq = b0pcjrht12.q3BipwRCk == njjwS3RZT.Horizontal ? yqaDqocAW.q3BipwRCk(j, dIocxURUo2, 0.0f, 2) : yqaDqocAW.q3BipwRCk(j, 0.0f, dIocxURUo2, 1);
        return qih4lW99W.q3BipwRCk;
    }
}
