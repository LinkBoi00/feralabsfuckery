package con;

import android.graphics.Rect;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class VyqlGpAAE implements nHAI4XIti {
    public final pnuAOe8oh q3BipwRCk = new pnuAOe8oh(new dyRLRaL1h[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r13 < r2) goto L_0x004b;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(bzmJZsHMu bzmjzshmu, Way959ade way959ade) {
        s0SiaT1EL s0siat1el;
        int i;
        bzmJZsHMu bzmjzshmu2;
        int i2;
        Object[] objArr;
        int i3;
        bzmJZsHMu bzmjzshmu3;
        if (way959ade instanceof s0SiaT1EL) {
            s0siat1el = (s0SiaT1EL) way959ade;
            int i4 = s0siat1el.RG6kpfv3v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0siat1el.RG6kpfv3v = i4 - Integer.MIN_VALUE;
                Object obj = s0siat1el.Eeka1udhb;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = s0siat1el.RG6kpfv3v;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
                    i3 = pnuaoe8oh.Bhmn1KIah;
                    if (i3 > 0) {
                        objArr = pnuaoe8oh.CBQ5d1kRq;
                        bzmjzshmu2 = bzmjzshmu;
                        i2 = 0;
                        dyRLRaL1h dyrlral1h = (dyRLRaL1h) objArr[i2];
                        mnTaxtMa7 mntaxtma7 = dyrlral1h.tGV7Q6urW;
                        if (mntaxtma7 != null) {
                            qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
                            if (qhazgyfo8.oesmsHQJU()) {
                                bzmJZsHMu tGV7Q6urW = dyrlral1h.J4Ux7ym32.tGV7Q6urW(bzmjzshmu2 == null ? gThLCaTO1.dfpT1j18n(D3DEikrvb.i8XZMQc6Z(qhazgyfo8.Bhmn1KIah)) : bzmjzshmu2, mntaxtma7);
                                GfYKj7jWp gfYKj7jWp = dyrlral1h.J4Ux7ym32;
                                Objects.requireNonNull(GfYKj7jWp.J4Ux7ym32);
                                if (!anXlDk6fV.tGV7Q6urW(gfYKj7jWp, ihHXPsZgG.tGV7Q6urW)) {
                                    GfYKj7jWp gfYKj7jWp2 = dyrlral1h.J4Ux7ym32;
                                    s0siat1el.PSTqBLTET = bzmjzshmu2;
                                    s0siat1el.MzoOEjc4X = objArr;
                                    s0siat1el.ilHKhw3Yw = i3;
                                    s0siat1el.qVUwofr5s = i2;
                                    s0siat1el.RG6kpfv3v = 1;
                                    if (gfYKj7jWp2.q3BipwRCk(tGV7Q6urW, s0siat1el) == kbkjsqcsl) {
                                        return kbkjsqcsl;
                                    }
                                    bzmjzshmu3 = bzmjzshmu2;
                                    bzmjzshmu2 = bzmjzshmu3;
                                } else {
                                    View view = dyrlral1h.q3BipwRCk.q3BipwRCk;
                                    if (view != null) {
                                        view.requestRectangleOnScreen(new Rect((int) tGV7Q6urW.q3BipwRCk, (int) tGV7Q6urW.J4Ux7ym32, (int) tGV7Q6urW.tGV7Q6urW, (int) tGV7Q6urW.dIocxURUo), false);
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                    return qih4lW99W.q3BipwRCk;
                } else if (i == 1) {
                    i2 = s0siat1el.qVUwofr5s;
                    i3 = s0siat1el.ilHKhw3Yw;
                    objArr = (Object[]) s0siat1el.MzoOEjc4X;
                    bzmjzshmu3 = (bzmJZsHMu) s0siat1el.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                    bzmjzshmu2 = bzmjzshmu3;
                    i2++;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        s0siat1el = new s0SiaT1EL(this, way959ade);
        Object obj2 = s0siat1el.Eeka1udhb;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = s0siat1el.RG6kpfv3v;
        if (i != 0) {
        }
    }
}
