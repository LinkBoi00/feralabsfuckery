package con;

import java.util.Objects;
import java.util.Set;
@jHNqfwCVd(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class G93AcjBI3 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ DpXbxvzXm Eeka1udhb;
    public Object MzoOEjc4X;
    public Object ilHKhw3Yw;
    public int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93AcjBI3(DpXbxvzXm dpXbxvzXm, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = dpXbxvzXm;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new G93AcjBI3(this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new G93AcjBI3(this.Eeka1udhb, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0086, TryCatch #4 {all -> 0x0086, blocks: (B:18:0x0049, B:20:0x0051, B:21:0x0059, B:29:0x0070, B:31:0x0073, B:33:0x0080, B:22:0x005a, B:25:0x0068), top: B:46:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #4 {all -> 0x0086, blocks: (B:18:0x0049, B:20:0x0051, B:21:0x0059, B:29:0x0070, B:31:0x0073, B:33:0x0080, B:22:0x005a, B:25:0x0068), top: B:46:0x0049 }] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Throwable th;
        pBc2IYUp5 pbc2iyup5;
        boolean z;
        G93AcjBI3 g93AcjBI3;
        PMYI4lLJM pMYI4lLJM;
        Object q3BipwRCk;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.qVUwofr5s;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                pbc2iyup5 = this.Eeka1udhb;
                DrTf1eLw4 drTf1eLw4 = (DrTf1eLw4) pbc2iyup5;
                Objects.requireNonNull(drTf1eLw4);
                pMYI4lLJM = new PMYI4lLJM(drTf1eLw4);
                g93AcjBI3 = this;
                g93AcjBI3.MzoOEjc4X = pbc2iyup5;
                g93AcjBI3.ilHKhw3Yw = pMYI4lLJM;
                g93AcjBI3.qVUwofr5s = 1;
                q3BipwRCk = pMYI4lLJM.q3BipwRCk(g93AcjBI3);
                if (q3BipwRCk != kbkjsqcsl) {
                }
            } else if (i == 1) {
                PMYI4lLJM pMYI4lLJM2 = (PMYI4lLJM) this.ilHKhw3Yw;
                pBc2IYUp5 pbc2iyup52 = (pBc2IYUp5) this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
                kBKJSqCSL kbkjsqcsl2 = kbkjsqcsl;
                G93AcjBI3 g93AcjBI32 = this;
                th = null;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        qih4lW99W qih4lw99w = (qih4lW99W) pMYI4lLJM2.tGV7Q6urW();
                        synchronized (UvOuyIFuT.J4Ux7ym32) {
                            Set set = ((SNDUZfhJq) UvOuyIFuT.GPLPRo6go.get()).iiGwOFFnr;
                            z = false;
                            if (set != null && (!set.isEmpty())) {
                                z = true;
                            }
                        }
                        if (z) {
                            UvOuyIFuT.iiGwOFFnr(DlhjQ2PrY.IytU16YUK);
                        }
                        g93AcjBI3 = g93AcjBI32;
                        kbkjsqcsl = kbkjsqcsl2;
                        pMYI4lLJM = pMYI4lLJM2;
                        pbc2iyup5 = pbc2iyup5;
                        g93AcjBI3.MzoOEjc4X = pbc2iyup5;
                        g93AcjBI3.ilHKhw3Yw = pMYI4lLJM;
                        g93AcjBI3.qVUwofr5s = 1;
                        q3BipwRCk = pMYI4lLJM.q3BipwRCk(g93AcjBI3);
                        if (q3BipwRCk != kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        g93AcjBI32 = g93AcjBI3;
                        obj = q3BipwRCk;
                        pbc2iyup52 = pbc2iyup5;
                        pMYI4lLJM2 = pMYI4lLJM;
                        kbkjsqcsl2 = kbkjsqcsl;
                        th = null;
                        if (!((Boolean) obj).booleanValue()) {
                            return qih4lW99W.q3BipwRCk;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pbc2iyup5 = pbc2iyup5;
                    try {
                        throw th;
                    } finally {
                        anXlDk6fV.yWvV4ePLl(pbc2iyup5, th);
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
