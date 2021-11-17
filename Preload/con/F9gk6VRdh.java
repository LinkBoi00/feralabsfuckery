package con;
@jHNqfwCVd(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$event$1", f = "Hoverable.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class F9gk6VRdh extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public /* synthetic */ Object PSTqBLTET;

    public F9gk6VRdh(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        F9gk6VRdh f9gk6VRdh = new F9gk6VRdh((Way959ade) obj2);
        f9gk6VRdh.PSTqBLTET = (k0ugT26MT) obj;
        return f9gk6VRdh.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        F9gk6VRdh f9gk6VRdh = new F9gk6VRdh(way959ade);
        f9gk6VRdh.PSTqBLTET = obj;
        return f9gk6VRdh;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            this.Bhmn1KIah = 1;
            obj = CVIvowp03.q3BipwRCk((k0ugT26MT) this.PSTqBLTET, 0, this, 1, null);
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
