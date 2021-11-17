package con;
@jHNqfwCVd(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {664}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VoF46r4pJ extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ gdEmqfwpT qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoF46r4pJ(gdEmqfwpT gdemqfwpt, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = gdemqfwpt;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        VoF46r4pJ voF46r4pJ = new VoF46r4pJ(this.qVUwofr5s, (Way959ade) obj2);
        voF46r4pJ.ilHKhw3Yw = (xOpkxuRlw) obj;
        return voF46r4pJ.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        VoF46r4pJ voF46r4pJ = new VoF46r4pJ(this.qVUwofr5s, way959ade);
        voF46r4pJ.ilHKhw3Yw = obj;
        return voF46r4pJ;
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            xOpkxuRlw xopkxurlw = (xOpkxuRlw) this.ilHKhw3Yw;
            kO9ZKjPiu ko9zkjpiu = new kO9ZKjPiu(this.qVUwofr5s);
            this.MzoOEjc4X = 1;
            if (fpplAiKys.kCA6Zs9sL(xopkxurlw, null, null, fpplAiKys.q3BipwRCk, ko9zkjpiu, this) == kbkjsqcsl) {
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
