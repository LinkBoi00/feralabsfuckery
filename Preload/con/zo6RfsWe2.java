package con;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class zo6RfsWe2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater J4Ux7ym32 = AtomicIntegerFieldUpdater.newUpdater(zo6RfsWe2.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable q3BipwRCk;

    public zo6RfsWe2(Throwable th, boolean z) {
        this.q3BipwRCk = th;
        this._handled = z ? 1 : 0;
    }

    public zo6RfsWe2(Throwable th, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.q3BipwRCk = th;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        this._handled = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean q3BipwRCk() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.q3BipwRCk + ']';
    }
}
