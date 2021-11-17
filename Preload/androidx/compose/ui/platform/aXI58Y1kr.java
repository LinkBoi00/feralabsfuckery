package androidx.compose.ui.platform;

import con.Way959ade;
import con.anXlDk6fV;
import con.dnd1L2J2K;
import con.jHNqfwCVd;
import con.kBKJSqCSL;
import con.kkcQgCx5G;
import con.oQkvjGXIr;
import con.qih4lW99W;
@jHNqfwCVd(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aXI58Y1kr extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ WrappedComposition ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aXI58Y1kr(WrappedComposition wrappedComposition, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = wrappedComposition;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new aXI58Y1kr(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new aXI58Y1kr(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            AndroidComposeView androidComposeView = this.ilHKhw3Yw.CBQ5d1kRq;
            this.MzoOEjc4X = 1;
            Object oon79WMrY = androidComposeView.sk5s77z6Q.oon79WMrY(this);
            if (oon79WMrY != kbkjsqcsl) {
                oon79WMrY = qih4lW99W.q3BipwRCk;
            }
            if (oon79WMrY == kbkjsqcsl) {
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
