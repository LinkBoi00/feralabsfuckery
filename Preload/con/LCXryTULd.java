package con;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class LCXryTULd implements lpbQZwGBl {
    public final OOoaogcdO J4Ux7ym32;
    public jgt6e4270 Puu3Rhg4F;
    public Rect oon79WMrY;
    public final View q3BipwRCk;
    public boolean tGV7Q6urW;
    public PmanMZxiM dIocxURUo = AdUPdUuqH.igRQEZxnW;
    public PmanMZxiM kCA6Zs9sL = GQN3dSqKV.NyWTwPF6V;
    public eTxfvEx3L iiGwOFFnr = new eTxfvEx3L("", czCYotiRn.tGV7Q6urW, (czCYotiRn) null, 4);
    public wozWTi35b GPLPRo6go = wozWTi35b.GPLPRo6go;
    public final llWJsfBCK yWvV4ePLl = anXlDk6fV.RG6kpfv3v(3, new nwvyEZJPU(this));
    public final DpXbxvzXm vPSbyrYWX = rTcohQ78k.q3BipwRCk(-1, null, null, 6);
    public final ViewTreeObserver.OnGlobalLayoutListener CBQ5d1kRq = new xJMblIIqI(this);

    public LCXryTULd(View view) {
        OOoaogcdO oOoaogcdO = new OOoaogcdO(view.getContext());
        this.q3BipwRCk = view;
        this.J4Ux7ym32 = oOoaogcdO;
        JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
        joOFKdxvJ joofkdxvj = wozWTi35b.iiGwOFFnr;
        joOFKdxvJ joofkdxvj2 = wozWTi35b.iiGwOFFnr;
        view.addOnAttachStateChangeListener(new mYYIIpcht(this));
    }

    public final void J4Ux7ym32() {
        OOoaogcdO oOoaogcdO = this.J4Ux7ym32;
        oOoaogcdO.q3BipwRCk().restartInput(this.q3BipwRCk);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object q3BipwRCk(Way959ade way959ade) {
        HzHVVWcYq hzHVVWcYq;
        int i;
        LCXryTULd lCXryTULd;
        PMYI4lLJM pMYI4lLJM;
        if (way959ade instanceof HzHVVWcYq) {
            hzHVVWcYq = (HzHVVWcYq) way959ade;
            int i2 = hzHVVWcYq.Eeka1udhb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hzHVVWcYq.Eeka1udhb = i2 - Integer.MIN_VALUE;
                Object obj = hzHVVWcYq.ilHKhw3Yw;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = hzHVVWcYq.Eeka1udhb;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    DrTf1eLw4 drTf1eLw4 = (DrTf1eLw4) this.vPSbyrYWX;
                    Objects.requireNonNull(drTf1eLw4);
                    pMYI4lLJM = new PMYI4lLJM(drTf1eLw4);
                    lCXryTULd = this;
                    hzHVVWcYq.PSTqBLTET = lCXryTULd;
                    hzHVVWcYq.MzoOEjc4X = pMYI4lLJM;
                    hzHVVWcYq.Eeka1udhb = 1;
                    obj = pMYI4lLJM.q3BipwRCk(hzHVVWcYq);
                    if (obj == kbkjsqcsl) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else if (i == 1) {
                    pMYI4lLJM = (PMYI4lLJM) hzHVVWcYq.MzoOEjc4X;
                    lCXryTULd = (LCXryTULd) hzHVVWcYq.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                    if (((Boolean) obj).booleanValue()) {
                        boolean booleanValue = ((Boolean) pMYI4lLJM.tGV7Q6urW()).booleanValue();
                        Boolean bool = (Boolean) nNBfGFMkt.q3BipwRCk(((DrTf1eLw4) lCXryTULd.vPSbyrYWX).ilHKhw3Yw());
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        }
                        if (booleanValue) {
                            OOoaogcdO oOoaogcdO = lCXryTULd.J4Ux7ym32;
                            oOoaogcdO.q3BipwRCk().showSoftInput(lCXryTULd.q3BipwRCk, 0);
                        } else {
                            OOoaogcdO oOoaogcdO2 = lCXryTULd.J4Ux7ym32;
                            oOoaogcdO2.q3BipwRCk().hideSoftInputFromWindow(lCXryTULd.q3BipwRCk.getWindowToken(), 0);
                        }
                        hzHVVWcYq.PSTqBLTET = lCXryTULd;
                        hzHVVWcYq.MzoOEjc4X = pMYI4lLJM;
                        hzHVVWcYq.Eeka1udhb = 1;
                        obj = pMYI4lLJM.q3BipwRCk(hzHVVWcYq);
                        if (obj == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            return qih4lW99W.q3BipwRCk;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        hzHVVWcYq = new HzHVVWcYq(this, way959ade);
        Object obj2 = hzHVVWcYq.ilHKhw3Yw;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = hzHVVWcYq.Eeka1udhb;
        if (i != 0) {
        }
    }
}
