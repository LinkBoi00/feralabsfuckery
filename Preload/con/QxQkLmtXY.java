package con;
@jHNqfwCVd(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QxQkLmtXY extends dnd1L2J2K implements PmanMZxiM {
    public int MzoOEjc4X;
    public final /* synthetic */ PmanMZxiM ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QxQkLmtXY(PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(1, way959ade);
        this.ilHKhw3Yw = pmanMZxiM;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        return new QxQkLmtXY(this.ilHKhw3Yw, (Way959ade) obj).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            PmanMZxiM pmanMZxiM = this.ilHKhw3Yw;
            this.MzoOEjc4X = 1;
            obj = xpuSUT7Gh.juJ6pnCpu(kCA6Zs9sL()).q3BipwRCk(pmanMZxiM, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
