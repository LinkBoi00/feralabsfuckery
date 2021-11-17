package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class X1Gz29S5A extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public /* synthetic */ Object PSTqBLTET;

    public X1Gz29S5A(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        X1Gz29S5A x1Gz29S5A = new X1Gz29S5A((Way959ade) obj2);
        x1Gz29S5A.PSTqBLTET = (k0ugT26MT) obj;
        return x1Gz29S5A.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        X1Gz29S5A x1Gz29S5A = new X1Gz29S5A(way959ade);
        x1Gz29S5A.PSTqBLTET = obj;
        return x1Gz29S5A;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.Bhmn1KIah = 1;
            obj = fpplAiKys.iiGwOFFnr((k0ugT26MT) this.PSTqBLTET, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
