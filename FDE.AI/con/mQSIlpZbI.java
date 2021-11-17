package con;
@jHNqfwCVd(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mQSIlpZbI extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ wQYV02pDG qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mQSIlpZbI(wQYV02pDG wqyv02pdg, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = wqyv02pdg;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        mQSIlpZbI mqsilpzbi = new mQSIlpZbI(this.qVUwofr5s, (Way959ade) obj2);
        mqsilpzbi.ilHKhw3Yw = (xOpkxuRlw) obj;
        return mqsilpzbi.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        mQSIlpZbI mqsilpzbi = new mQSIlpZbI(this.qVUwofr5s, way959ade);
        mqsilpzbi.ilHKhw3Yw = obj;
        return mqsilpzbi;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xOpkxuRlw xopkxurlw = (xOpkxuRlw) this.ilHKhw3Yw;
            NUBOYYpO5 nUBOYYpO5 = this.qVUwofr5s.Bhmn1KIah;
            if (nUBOYYpO5 == null) {
                nUBOYYpO5 = null;
            }
            this.MzoOEjc4X = 1;
            if (syekKyXqd.yWvV4ePLl(xopkxurlw, nUBOYYpO5, this) == kbkjsqcsl) {
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
