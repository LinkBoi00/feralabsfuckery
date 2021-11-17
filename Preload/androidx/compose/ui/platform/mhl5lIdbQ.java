package androidx.compose.ui.platform;

import con.Way959ade;
import con.anXlDk6fV;
import con.dnd1L2J2K;
import con.jHNqfwCVd;
import con.kBKJSqCSL;
import con.kkcQgCx5G;
import con.oQkvjGXIr;
import con.qih4lW99W;
@jHNqfwCVd(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mhl5lIdbQ extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ WrappedComposition ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhl5lIdbQ(WrappedComposition wrappedComposition, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = wrappedComposition;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new mhl5lIdbQ(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new mhl5lIdbQ(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            AndroidComposeView androidComposeView = this.ilHKhw3Yw.CBQ5d1kRq;
            this.MzoOEjc4X = 1;
            Object q3BipwRCk = androidComposeView.kktL0P5MG.q3BipwRCk(this);
            if (q3BipwRCk != kbkjsqcsl) {
                q3BipwRCk = qih4lW99W.q3BipwRCk;
            }
            if (q3BipwRCk == kbkjsqcsl) {
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
