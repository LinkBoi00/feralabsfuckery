package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$gotPro$1", f = "Utils.kt", l = {275, 276}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VMBWBaMiJ extends dnd1L2J2K implements PmanMZxiM {
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public final /* synthetic */ JKe64ATmr qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VMBWBaMiJ(JKe64ATmr jKe64ATmr, Way959ade way959ade) {
        super(1, way959ade);
        this.qVUwofr5s = jKe64ATmr;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        return new VMBWBaMiJ(this.qVUwofr5s, (Way959ade) obj).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        String str;
        String str2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            str2 = r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("TDJSaGRHRXZaR0YwWVM5amIyMHVabVZ5WVhadmJIUXVjSEpsYkc5aFpDNXdjbTh2Wm1sc1pRPT0="))).toString();
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            this.MzoOEjc4X = str2;
            this.ilHKhw3Yw = 1;
            obj = yuSxiExwK.tGV7Q6urW(str2, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            str2 = (String) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            anXlDk6fV.IytU16YUK(obj);
            str = (String) obj;
            if (str.length() <= 0) {
                if (r6NbD4wnj.mUqPm6GBh(str, "false", false, 2)) {
                    this.qVUwofr5s.CBQ5d1kRq = true;
                } else if (r6NbD4wnj.mUqPm6GBh(str, "true", false, 2)) {
                    this.qVUwofr5s.CBQ5d1kRq = false;
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk = UexvVay3o.q3BipwRCk("cat ", str2);
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 2;
            obj = yuSxiExwK2.Bhmn1KIah(q3BipwRCk, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            str = (String) obj;
            if (str.length() <= 0) {
            }
        }
        return qih4lW99W.q3BipwRCk;
    }
}
