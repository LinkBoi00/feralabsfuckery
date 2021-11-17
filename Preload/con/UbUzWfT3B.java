package con;

import java.util.concurrent.CancellationException;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {279, 283, 287}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UbUzWfT3B extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ gdEmqfwpT Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ kkcQgCx5G RG6kpfv3v;
    public final /* synthetic */ gdEmqfwpT dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UbUzWfT3B(PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = pmanMZxiM;
        this.Eeka1udhb = gdemqfwpt;
        this.dXrmkklc8 = gdemqfwpt2;
        this.RG6kpfv3v = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        UbUzWfT3B ubUzWfT3B = new UbUzWfT3B(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        ubUzWfT3B.ilHKhw3Yw = (xOpkxuRlw) obj;
        return ubUzWfT3B.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        UbUzWfT3B ubUzWfT3B = new UbUzWfT3B(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        ubUzWfT3B.ilHKhw3Yw = obj;
        return ubUzWfT3B;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: CancellationException -> 0x0083, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0083, blocks: (B:7:0x0010, B:11:0x0020, B:18:0x004a, B:21:0x0055, B:23:0x005a), top: B:31:0x0008 }] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        xOpkxuRlw xopkxurlw;
        cKAQplqZy ckaqplqzy;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                xOpkxuRlw xopkxurlw2 = (xOpkxuRlw) this.ilHKhw3Yw;
                XNyqBtql6 xNyqBtql6 = new XNyqBtql6(null);
                this.ilHKhw3Yw = xopkxurlw2;
                this.MzoOEjc4X = 1;
                ztvmwA530 ztvmwa530 = (ztvmwA530) xopkxurlw2;
                Object cAwN510t2 = ztvmwa530.cAwN510t2(xNyqBtql6, this);
                if (cAwN510t2 == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                xopkxurlw = ztvmwa530;
                obj = cAwN510t2;
            } else if (i == 1) {
                xopkxurlw = (xOpkxuRlw) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
            } else if (i == 2) {
                xopkxurlw = (xOpkxuRlw) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                ckaqplqzy = (cKAQplqZy) obj;
                if (ckaqplqzy != null) {
                    this.qVUwofr5s.IytU16YUK(new bRgfgYIQX(ckaqplqzy.tGV7Q6urW));
                    Lt3zjAIOI lt3zjAIOI = new Lt3zjAIOI(ckaqplqzy, this.dXrmkklc8, this.Eeka1udhb, this.RG6kpfv3v, null);
                    this.ilHKhw3Yw = null;
                    this.MzoOEjc4X = 3;
                    if (((ztvmwA530) xopkxurlw).cAwN510t2(lt3zjAIOI, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                }
                return qih4lW99W.q3BipwRCk;
            } else if (i == 3) {
                anXlDk6fV.IytU16YUK(obj);
                return qih4lW99W.q3BipwRCk;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cKAQplqZy ckaqplqzy2 = (cKAQplqZy) obj;
            this.ilHKhw3Yw = xopkxurlw;
            this.MzoOEjc4X = 2;
            obj = ZEpQDovLv.q3BipwRCk(xopkxurlw, ckaqplqzy2, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            ckaqplqzy = (cKAQplqZy) obj;
            if (ckaqplqzy != null) {
            }
            return qih4lW99W.q3BipwRCk;
        } catch (CancellationException e) {
            this.Eeka1udhb.GPLPRo6go();
            throw e;
        }
    }
}
