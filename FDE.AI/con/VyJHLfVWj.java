package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VyJHLfVWj extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public /* synthetic */ Object PSTqBLTET;

    public VyJHLfVWj(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        VyJHLfVWj vyJHLfVWj = new VyJHLfVWj((Way959ade) obj2);
        vyJHLfVWj.PSTqBLTET = (k0ugT26MT) obj;
        return vyJHLfVWj.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        VyJHLfVWj vyJHLfVWj = new VyJHLfVWj(way959ade);
        vyJHLfVWj.PSTqBLTET = obj;
        return vyJHLfVWj;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.Bhmn1KIah = 1;
            if (syekKyXqd.dIocxURUo((k0ugT26MT) this.PSTqBLTET, this) == kbkjsqcsl) {
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
