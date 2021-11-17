package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Ixy1MDmHH extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ cKAQplqZy Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ NzvP5Rex8 ilHKhw3Yw;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ixy1MDmHH(NzvP5Rex8 nzvP5Rex8, eP3ZpMpES ep3zpmpes, cKAQplqZy ckaqplqzy, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = nzvP5Rex8;
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = ckaqplqzy;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Ixy1MDmHH(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Ixy1MDmHH(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            NzvP5Rex8 nzvP5Rex8 = this.ilHKhw3Yw;
            eP3ZpMpES ep3zpmpes = this.qVUwofr5s;
            bRgfgYIQX brgfgyiqx = new bRgfgYIQX(this.Eeka1udhb.tGV7Q6urW);
            this.MzoOEjc4X = 1;
            if (nzvP5Rex8.sk5s77z6Q(ep3zpmpes, brgfgyiqx, this) == kbkjsqcsl) {
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
