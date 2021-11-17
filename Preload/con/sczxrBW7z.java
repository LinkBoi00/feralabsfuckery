package con;

import android.os.Build;
@jHNqfwCVd(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class sczxrBW7z extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ AWlaaRmBK ilHKhw3Yw;
    public final /* synthetic */ xKJuigiBl qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sczxrBW7z(AWlaaRmBK aWlaaRmBK, xKJuigiBl xkjuigibl, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = aWlaaRmBK;
        this.qVUwofr5s = xkjuigibl;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new sczxrBW7z(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new sczxrBW7z(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        long j;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            AWlaaRmBK aWlaaRmBK = this.ilHKhw3Yw;
            if (aWlaaRmBK != null) {
                int dIocxURUo = aWlaaRmBK.dIocxURUo();
                boolean z = this.ilHKhw3Yw.tGV7Q6urW() != null;
                xKJuigiBl xkjuigibl = this.qVUwofr5s;
                int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(dIocxURUo);
                long j2 = Long.MAX_VALUE;
                if (tGV7Q6urW == 0) {
                    j = 4000;
                } else if (tGV7Q6urW == 1) {
                    j = 10000;
                } else if (tGV7Q6urW == 2) {
                    j = Long.MAX_VALUE;
                } else {
                    throw new dnCerKhAM();
                }
                if (xkjuigibl != null) {
                    OHS7Jvxri oHS7Jvxri = (OHS7Jvxri) xkjuigibl;
                    if (j < 2147483647L) {
                        int i2 = 3;
                        if (z) {
                            i2 = 7;
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            int q3BipwRCk = S8ZXiU8Jl.q3BipwRCk.q3BipwRCk(oHS7Jvxri.q3BipwRCk, (int) j, i2);
                            if (q3BipwRCk != Integer.MAX_VALUE) {
                                j2 = (long) q3BipwRCk;
                            }
                        } else if (!z || !oHS7Jvxri.q3BipwRCk.isTouchExplorationEnabled()) {
                            j2 = j;
                        }
                        j = j2;
                    }
                }
                this.MzoOEjc4X = 1;
                if (dnBSj5uJN.Bhmn1KIah(j, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.ilHKhw3Yw.dismiss();
        return qih4lW99W.q3BipwRCk;
    }
}
